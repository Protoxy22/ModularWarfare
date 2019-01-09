//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ump
// Model Creator: 
// Created on: 01.08.2018 - 13:36:15
// Last changed on: 01.08.2018 - 13:36:15

package com.modularwarfare.client.model.test; //Path where the model is located

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ump45nomag extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ump45nomag() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[736];
		defaultBarrelModel = new ModelRendererTurbo[17];
		defaultScopeModel = new ModelRendererTurbo[38];
		slideModel = new ModelRendererTurbo[27];

		initgunModel_1();
		initgunModel_2();
		initdefaultBarrelModel_1();
		initdefaultScopeModel_1();
		initslideModel_1();

		translateAll(0F, -10.5F, -0.1F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box100
		gunModel[88] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import Box101
		gunModel[89] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box105
		gunModel[93] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box101
		gunModel[94] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box107
		gunModel[95] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box105
		gunModel[99] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box105
		gunModel[100] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box105
		gunModel[101] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box105
		gunModel[102] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box105
		gunModel[103] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box105
		gunModel[104] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box105
		gunModel[105] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box105
		gunModel[106] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box105
		gunModel[107] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box105
		gunModel[108] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box105
		gunModel[109] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box105
		gunModel[110] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box105
		gunModel[111] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box105
		gunModel[112] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import Box105
		gunModel[113] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box105
		gunModel[114] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import Box127
		gunModel[115] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Import Box128
		gunModel[116] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Import Box0
		gunModel[117] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box100
		gunModel[119] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box101
		gunModel[120] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box105
		gunModel[122] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box105
		gunModel[123] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box135
		gunModel[124] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box136
		gunModel[125] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box105
		gunModel[126] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box105
		gunModel[127] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box105
		gunModel[128] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box105
		gunModel[129] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Import Box0
		gunModel[130] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[131] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Import Box0
		gunModel[132] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[133] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import Box147
		gunModel[134] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import Box148
		gunModel[135] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box0
		gunModel[136] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		gunModel[137] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[138] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[139] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[140] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[141] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		gunModel[142] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import Box166
		gunModel[143] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box167
		gunModel[144] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box168
		gunModel[145] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box169
		gunModel[146] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Box170
		gunModel[147] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Box171
		gunModel[148] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box172
		gunModel[149] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box0
		gunModel[150] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Import Box0
		gunModel[151] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import Box0
		gunModel[152] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[153] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box0
		gunModel[154] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Import Box0
		gunModel[155] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0
		gunModel[156] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Box180
		gunModel[157] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box181
		gunModel[158] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box182
		gunModel[159] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import Box183
		gunModel[160] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import Box184
		gunModel[161] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box185
		gunModel[162] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box186
		gunModel[163] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box187
		gunModel[164] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box188
		gunModel[165] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Box189
		gunModel[166] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import Box0
		gunModel[167] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box0
		gunModel[168] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box148
		gunModel[169] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Import Box193
		gunModel[170] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Import Box194
		gunModel[171] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Import Box195
		gunModel[172] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Import Box196
		gunModel[173] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Import Box197
		gunModel[174] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box198
		gunModel[175] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box199
		gunModel[176] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Import Box200
		gunModel[177] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Import Box201
		gunModel[178] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box0
		gunModel[179] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import Box0
		gunModel[180] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Import Box128
		gunModel[182] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box258
		gunModel[183] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import Box266
		gunModel[225] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box273
		gunModel[228] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Import Box274
		gunModel[229] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box275
		gunModel[230] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import Box276
		gunModel[231] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import Box275
		gunModel[232] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Import Box0
		gunModel[233] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import Box0
		gunModel[234] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Import Box0
		gunModel[235] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Import Box0
		gunModel[236] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import Box274
		gunModel[237] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box289
		gunModel[238] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box290
		gunModel[239] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Import Box291
		gunModel[240] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Import Box292
		gunModel[241] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Import Box293
		gunModel[242] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box294
		gunModel[243] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import Box295
		gunModel[244] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box296
		gunModel[245] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box297
		gunModel[246] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Import Box298
		gunModel[247] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Import Box0
		gunModel[248] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import Box0
		gunModel[249] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import Box0
		gunModel[250] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import Box0
		gunModel[251] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import Box0
		gunModel[252] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import Box0
		gunModel[253] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Import Box0
		gunModel[254] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Import Box0
		gunModel[255] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import Box0
		gunModel[256] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box0
		gunModel[257] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import Box0
		gunModel[258] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Import Box0
		gunModel[259] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import Box0
		gunModel[260] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Import Box0
		gunModel[261] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box0
		gunModel[262] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[263] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[264] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Import Box0
		gunModel[265] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Import Box0
		gunModel[266] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box0
		gunModel[267] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Import Box0
		gunModel[268] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box0
		gunModel[269] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box0
		gunModel[270] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box0
		gunModel[271] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		gunModel[272] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box0
		gunModel[273] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0
		gunModel[274] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Import Box0
		gunModel[275] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Import Box0
		gunModel[276] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Box0
		gunModel[277] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Import Box105
		gunModel[278] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import Box105
		gunModel[279] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Import Box105
		gunModel[280] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import Box105
		gunModel[281] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Import Box105
		gunModel[282] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import Box105
		gunModel[283] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Import Box105
		gunModel[284] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import Box105
		gunModel[285] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import Box0
		gunModel[286] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import Box0
		gunModel[287] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Import Box0
		gunModel[288] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import Box0
		gunModel[289] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import Box0
		gunModel[290] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import Box0
		gunModel[291] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box0
		gunModel[292] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import Box0
		gunModel[293] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Import Box186
		gunModel[294] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Import Box187
		gunModel[295] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import Box368
		gunModel[296] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import Box0
		gunModel[297] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Import Box0
		gunModel[298] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Import Box371
		gunModel[299] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import Box0
		gunModel[300] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import Box0
		gunModel[301] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Import Box0
		gunModel[302] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Import Box0
		gunModel[303] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Import Box0
		gunModel[304] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Import Box0
		gunModel[305] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Import Box0
		gunModel[306] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Import Box0
		gunModel[307] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Import Box0
		gunModel[308] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Import Box0
		gunModel[309] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Import Box0
		gunModel[310] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box0
		gunModel[311] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import Box0
		gunModel[312] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import Box0
		gunModel[313] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import Box0
		gunModel[314] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Import Box0
		gunModel[315] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import Box0
		gunModel[316] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Import Box0
		gunModel[317] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Import Box0
		gunModel[318] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box0
		gunModel[319] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Import Box0
		gunModel[320] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Import Box0
		gunModel[321] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box0
		gunModel[322] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import Box430
		gunModel[323] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import Box431
		gunModel[324] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Import Box432
		gunModel[325] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import Box433
		gunModel[326] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import Box434
		gunModel[327] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box435
		gunModel[328] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import Box0
		gunModel[329] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Import Box0
		gunModel[330] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Import Box0
		gunModel[331] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Import Box0
		gunModel[332] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Import Box0
		gunModel[333] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Import Box0
		gunModel[334] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import Box0
		gunModel[335] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import Box0
		gunModel[336] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import Box0
		gunModel[337] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Import Box0
		gunModel[338] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box0
		gunModel[339] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Import Box0
		gunModel[340] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Box0
		gunModel[341] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import Box0
		gunModel[342] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Import Box0
		gunModel[343] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Import Box451
		gunModel[344] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Import Box452
		gunModel[345] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Import Box453
		gunModel[346] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box454
		gunModel[347] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box455
		gunModel[348] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Box456
		gunModel[349] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import Box0
		gunModel[350] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import Box0
		gunModel[351] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Import Box0
		gunModel[352] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Import Box463
		gunModel[353] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import Box464
		gunModel[354] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Import Box463
		gunModel[355] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box0
		gunModel[356] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Import Box0
		gunModel[357] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import Box0
		gunModel[358] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Import Box0
		gunModel[359] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Import Box0
		gunModel[360] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Import Box0
		gunModel[361] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Import Box0
		gunModel[362] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Import Box0
		gunModel[363] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import Box0
		gunModel[364] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import Box0
		gunModel[365] = new ModelRendererTurbo(this, 649, 113, textureX, textureY); // Import Box0
		gunModel[366] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Import Box0
		gunModel[367] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Import Box0
		gunModel[368] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import Box0
		gunModel[369] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import Box0
		gunModel[370] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import Box0
		gunModel[371] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Import Box0
		gunModel[372] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import Box0
		gunModel[373] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box0
		gunModel[374] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box0
		gunModel[375] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Import Box0
		gunModel[376] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Import Box0
		gunModel[377] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import Box0
		gunModel[379] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box0
		gunModel[380] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import Box0
		gunModel[381] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import Box0
		gunModel[382] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Import Box0
		gunModel[383] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Import Box0
		gunModel[384] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Import Box0
		gunModel[385] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import Box0
		gunModel[386] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import Box0
		gunModel[387] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Import Box0
		gunModel[388] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Import Box0
		gunModel[389] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import Box0
		gunModel[390] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import Box0
		gunModel[391] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import Box0
		gunModel[392] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Import Box0
		gunModel[393] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Import Box0
		gunModel[394] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Import Box0
		gunModel[395] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[396] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import Box0
		gunModel[397] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Import Box0
		gunModel[398] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Import Box0
		gunModel[399] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Import Box0
		gunModel[400] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import Box0
		gunModel[401] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Import Box0
		gunModel[402] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import Box0
		gunModel[403] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import Box0
		gunModel[404] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Import Box0
		gunModel[405] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Import Box0
		gunModel[406] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Import Box0
		gunModel[407] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box0
		gunModel[408] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Import Box0
		gunModel[409] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Import Box0
		gunModel[410] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Box0
		gunModel[411] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Import Box0
		gunModel[412] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import Box0
		gunModel[413] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Import Box0
		gunModel[414] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Import Box0
		gunModel[415] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Import Box0
		gunModel[416] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box0
		gunModel[417] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Import Box0
		gunModel[418] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import Box0
		gunModel[419] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import Box0
		gunModel[420] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import Box0
		gunModel[421] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box0
		gunModel[422] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Import Box0
		gunModel[423] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Import Box0
		gunModel[424] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Import Box0
		gunModel[425] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import Box0
		gunModel[426] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Import Box0
		gunModel[427] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box0
		gunModel[428] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import Box0
		gunModel[429] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box0
		gunModel[430] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import Box0
		gunModel[431] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Import Box0
		gunModel[432] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Import Box0
		gunModel[433] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import Box0
		gunModel[434] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box0
		gunModel[435] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import Box0
		gunModel[436] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Import Box0
		gunModel[437] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Import Box0
		gunModel[438] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box0
		gunModel[439] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box0
		gunModel[440] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Import Box0
		gunModel[441] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box0
		gunModel[442] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Import Box0
		gunModel[443] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import Box0
		gunModel[444] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import Box0
		gunModel[445] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Import Box0
		gunModel[446] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Import Box0
		gunModel[447] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import Box0
		gunModel[448] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import Box0
		gunModel[449] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Import Box0
		gunModel[450] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Import Box0
		gunModel[451] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Import Box0
		gunModel[452] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Import Box0
		gunModel[453] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import Box0
		gunModel[454] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Import Box0
		gunModel[455] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Import Box0
		gunModel[456] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Import Box0
		gunModel[457] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import Box0
		gunModel[458] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Import Box0
		gunModel[459] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Import Box0
		gunModel[460] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Import Box0
		gunModel[461] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Import Box0
		gunModel[462] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box0
		gunModel[463] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Import Box0
		gunModel[464] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import Box0
		gunModel[465] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import Box0
		gunModel[466] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import Box0
		gunModel[467] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Import Box0
		gunModel[468] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import Box0
		gunModel[469] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box0
		gunModel[470] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Import Box0
		gunModel[471] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Import Box0
		gunModel[472] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Import Box0
		gunModel[473] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Import Box0
		gunModel[474] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Import Box0
		gunModel[475] = new ModelRendererTurbo(this, 929, 153, textureX, textureY); // Import Box0
		gunModel[476] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Import Box0
		gunModel[477] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Import Box0
		gunModel[478] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Import Box0
		gunModel[479] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import Box0
		gunModel[480] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Import Box0
		gunModel[481] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Import Box0
		gunModel[482] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Import Box0
		gunModel[483] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Import Box0
		gunModel[484] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Import Box0
		gunModel[485] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Import Box0
		gunModel[486] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Import Box0
		gunModel[487] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Import Box0
		gunModel[488] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Import Box0
		gunModel[489] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Import Box0
		gunModel[490] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box0
		gunModel[491] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Import Box0
		gunModel[492] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Import Box0
		gunModel[493] = new ModelRendererTurbo(this, 713, 161, textureX, textureY); // Import Box604
		gunModel[494] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Import Box605
		gunModel[495] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Import Box0
		gunModel[496] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Import Box0
		gunModel[497] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Import Box0
		gunModel[498] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box0
		gunModel[499] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Import Box0

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 22, 7, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, -1.5F, -7.5F, 0F, -1.5F, 7.5F, 0F, 0F); // Import Box0
		gunModel[0].setRotationPoint(4F, -11.5F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 17, 7, 0F,-3.5F, 0F, -1.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, -1.5F, 7.5F, 0F, -1.5F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, -1.5F); // Import Box0
		gunModel[1].setRotationPoint(-8F, -11F, -3.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 22, 8, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, 7.5F, 0F, 0F); // Import Box0
		gunModel[2].setRotationPoint(3F, -11.5F, -4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,-3.5F, 0F, -0.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, -0.5F, 7.5F, 0F, -0.5F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, -0.5F); // Import Box0
		gunModel[3].setRotationPoint(-7F, -11F, -4F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,1F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, -2.5F, -0.5F, -1.5F, 2.5F, -0.5F, 0F); // Import Box0
		gunModel[4].setRotationPoint(9F, -13F, -3.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -0.5F, -2.5F, -0.5F, -0.5F, 2.5F, -0.5F, 0F); // Import Box0
		gunModel[5].setRotationPoint(8F, -13F, -4F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[6].setRotationPoint(-4.5F, -13F, -3.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[7].setRotationPoint(-3.5F, -13F, -4F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[8].setRotationPoint(-2.5F, -13F, -4F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box0
		gunModel[9].setRotationPoint(7F, -13F, -4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 8, 17, 8, 0F,-3.5F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 7.5F, 0F, 0F, -6.5F, 4.5F, 0F, -6.5F, 4.5F, 0F, 7.5F, 0F, 0F); // Import Box0
		gunModel[10].setRotationPoint(-6F, -11F, -4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[11].setRotationPoint(-4.5F, 10F, -4F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[12].setRotationPoint(-3.5F, 10F, -3.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F); // Import Box0
		gunModel[13].setRotationPoint(-4.5F, 11.5F, -4F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, -0.5F, 0F, 0F); // Import Box0
		gunModel[14].setRotationPoint(-3.5F, 11.5F, -3.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4.5F, 0F); // Import Box0
		gunModel[15].setRotationPoint(-13.5F, 10F, -4F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -1.5F); // Import Box0
		gunModel[16].setRotationPoint(-15.5F, 6F, -3.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[17].setRotationPoint(-14.5F, 6F, -4F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[18].setRotationPoint(6F, -14F, -4.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 27, 9, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[19].setRotationPoint(6F, -22F, -4.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[20].setRotationPoint(3F, -14F, -4.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F); // Import Box0
		gunModel[21].setRotationPoint(-2F, -14.25F, -4.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.5F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -1.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.5F, -1.25F, -0.5F); // Import Box0
		gunModel[22].setRotationPoint(-4F, -15.25F, -4.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[23].setRotationPoint(3F, -22F, -4.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 9, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[24].setRotationPoint(-2F, -22F, -4.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 8, 9, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import Box0
		gunModel[25].setRotationPoint(-5F, -22F, -4.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[26].setRotationPoint(3F, -14F, -4F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, -1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[27].setRotationPoint(-2F, -15F, -4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[28].setRotationPoint(-3F, -15F, -4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[29].setRotationPoint(-3.5F, -15F, -4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.75F, -1.5F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[30].setRotationPoint(-4.5F, -15F, -3.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.75F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1.5F); // Import Box0
		gunModel[31].setRotationPoint(-4.5F, -16.25F, -3.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.25F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.25F, -0.75F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Import Box0
		gunModel[32].setRotationPoint(-5.5F, -16.25F, -3.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.65F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.65F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F, -0.75F, -0.5F); // Import Box0
		gunModel[33].setRotationPoint(-5.5F, -16.75F, -4.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.4F, -0.75F, -1F, 0.15F, -0.75F, 0F, 0.15F, -0.75F, 0F, -0.4F, -0.75F, -1F, -0.75F, -0.75F, -1F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.75F, -1F); // Import Box0
		gunModel[34].setRotationPoint(-6F, -16.75F, -4.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0.5F, -0.75F, -1F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.5F, -0.75F, -1F, -0.9F, -0.75F, -1F, 0.65F, -0.75F, 0F, 0.65F, -0.75F, 0F, -0.9F, -0.75F, -1F); // Import Box0
		gunModel[35].setRotationPoint(-6.5F, -18.25F, -4.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,2.25F, -0.75F, -1F, -2.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, 2.25F, -0.75F, -1F, -1.5F, -0.25F, -1F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -1.5F, -0.25F, -1F); // Import Box0
		gunModel[36].setRotationPoint(-8.5F, -20.25F, -4.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.65F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.65F, -0.75F, 0F); // Import Box0
		gunModel[37].setRotationPoint(-5.5F, -18.25F, -4.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, -3.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.25F, -0.25F, 0F); // Import Box0
		gunModel[38].setRotationPoint(-9.5F, -20.25F, -4.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 47, 1, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[39].setRotationPoint(-6.5F, -22F, -4.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.75F, 0F); // Import Box0
		gunModel[40].setRotationPoint(-8F, -22F, -4.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[41].setRotationPoint(-9F, -20F, -4.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[42].setRotationPoint(-8F, -21F, -4.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[43].setRotationPoint(-6.5F, -21F, -4.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[44].setRotationPoint(-9F, -19.5F, -4.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[45].setRotationPoint(-12F, -20.25F, -4.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[46].setRotationPoint(-10F, -19.75F, -4.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.5F, -0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[47].setRotationPoint(24.5F, -14F, -4.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[48].setRotationPoint(26F, -13.25F, -4.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[49].setRotationPoint(31.5F, -13.25F, -4.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[50].setRotationPoint(26F, -13.75F, -4.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, -1F, -1F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 1.25F, -1F, -1F, -0.25F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, -1F); // Import Box0
		gunModel[51].setRotationPoint(-11F, -20.75F, -4.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 53, 8, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[52].setRotationPoint(-6.5F, -30F, -2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.25F, 0F); // Import Box0
		gunModel[53].setRotationPoint(-7.5F, -30F, -5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.75F, 0F); // Import Box0
		gunModel[54].setRotationPoint(-9F, -30F, -5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 7, 8, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box0
		gunModel[55].setRotationPoint(-16F, -30F, -5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 56, 6, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[56].setRotationPoint(-2.5F, -36.25F, -4F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 56, 1, 7, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[57].setRotationPoint(-2.5F, -37.25F, -3.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[58].setRotationPoint(25F, -13.75F, -4.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[59].setRotationPoint(31.5F, -13.75F, -4.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 28, 1, 8, 0F,0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.25F, 0.75F, -0.25F, 0.5F, 0.75F, -0.25F, 0.5F, 0.75F, -0.25F, 0.25F, 0.75F, -0.25F); // Import Box0
		gunModel[60].setRotationPoint(58.5F, -37.25F, -4F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 10, 11, 10, 0F,0F, -0.5F, 0.25F, -2.25F, -0.5F, 0.25F, -2.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 1.25F, 0.25F); // Import Box0
		gunModel[61].setRotationPoint(33F, -22F, -5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Import Box0
		gunModel[62].setRotationPoint(78.5F, -35.5F, -4F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 34, 1, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[63].setRotationPoint(53.5F, -32.5F, -4F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 3, 11, 10, 0F,1.25F, -0.5F, 0.25F, -2.25F, -0.5F, 1.25F, -2.25F, -0.5F, 1.25F, 1.25F, -0.5F, 0.25F, -0.5F, 0.25F, 0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.5F, 0.25F, 0.25F); // Import Box0
		gunModel[64].setRotationPoint(42F, -22F, -5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[65].setRotationPoint(53F, -34.5F, -3F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 3, 11, 12, 0F,0.25F, -0.5F, 0.25F, -2F, -0.5F, -0.75F, -2F, -0.5F, -0.75F, 0.25F, -0.5F, 0.25F, -1.75F, 0F, 0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1.75F, 0F, 0.25F); // Import Box0
		gunModel[66].setRotationPoint(43F, -22F, -6F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 34, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[67].setRotationPoint(54.5F, -27.5F, -5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[68].setRotationPoint(54.5F, -30F, -5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Import Box0
		gunModel[69].setRotationPoint(82F, -29F, -5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Import Box0
		gunModel[70].setRotationPoint(66F, -29F, -5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[71].setRotationPoint(65F, -28.75F, -5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F); // Import Box0
		gunModel[72].setRotationPoint(65F, -29.5F, -5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[73].setRotationPoint(54.5F, -28.75F, -5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[74].setRotationPoint(54.5F, -29.5F, -5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[75].setRotationPoint(81F, -28.75F, -5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F); // Import Box0
		gunModel[76].setRotationPoint(81F, -29.5F, -5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[77].setRotationPoint(70.5F, -28.75F, -5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[78].setRotationPoint(70.5F, -29.5F, -5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 11, 10, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 1.25F, -0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, 0F, 1.25F, -0.25F); // Import Box0
		gunModel[79].setRotationPoint(32.5F, -22F, -5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[80].setRotationPoint(33F, -22.5F, -5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[81].setRotationPoint(32.5F, -22.5F, -5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 20, 1, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import Box0
		gunModel[82].setRotationPoint(58.25F, -35.5F, -4F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 104, 1, 1, 0F,-0.25F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[83].setRotationPoint(-16.25F, -30.5F, 4F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 99, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box0
		gunModel[84].setRotationPoint(-11.25F, -30.75F, 3F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[85].setRotationPoint(55.5F, -22.5F, -5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Import Box0
		gunModel[86].setRotationPoint(55.5F, -21.5F, -4F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box100
		gunModel[87].setRotationPoint(55.5F, -22.5F, 3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Import Box101
		gunModel[88].setRotationPoint(55.5F, -21.5F, 2F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[89].setRotationPoint(55.5F, -20.5F, -1F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 1.65F, 0F, -0.5F, 1.65F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Import Box0
		gunModel[90].setRotationPoint(55.5F, -21.5F, -2F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -3.75F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, 0.75F, 0F, -3.75F, 0.75F, 0F, 3.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 3.75F, 0F); // Import Box0
		gunModel[91].setRotationPoint(49.5F, -24F, 2.25F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -3.75F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, -0.75F, 0F, -3.75F, -0.75F, 0F, 3.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 3.75F, 0F); // Import Box105
		gunModel[92].setRotationPoint(49.5F, -24F, -4.25F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 2.5F, -0.25F, 0F, 2.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 1.25F, 0F, -2.5F, 1.25F, 0F, -2.5F, -1.25F, 0F, -0.25F, -1.25F); // Import Box101
		gunModel[93].setRotationPoint(49.5F, -19F, 2F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 2.5F, 0.25F, 0F, 2.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -2.5F, -1.25F, 0F, -2.5F, 1.25F, 0F, -0.25F, 1.25F); // Import Box107
		gunModel[94].setRotationPoint(49.5F, -19F, -4F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.25F, 1.75F, 0F, 2.5F, 1.75F, 0F, 2.5F, 1.75F, 0F, 0.25F, 1.75F, 0F, -0.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[95].setRotationPoint(49.5F, -18F, -1F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[96].setRotationPoint(46.5F, -30.5F, 3F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[97].setRotationPoint(47.5F, -30.5F, -5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box105
		gunModel[98].setRotationPoint(52.5F, -23.5F, -5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.05F, 0F); // Import Box105
		gunModel[99].setRotationPoint(52.5F, -22.5F, -5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.05F, 0F); // Import Box105
		gunModel[100].setRotationPoint(52.5F, -22.5F, 3F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box105
		gunModel[101].setRotationPoint(52.5F, -23.5F, 3F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Import Box105
		gunModel[102].setRotationPoint(49.5F, -23.5F, -5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.05F, 0F, -0.5F, -1.05F, 0F, 0F, -0.5F, 0F); // Import Box105
		gunModel[103].setRotationPoint(51.5F, -23.5F, -5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box105
		gunModel[104].setRotationPoint(52F, -23.5F, -5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box105
		gunModel[105].setRotationPoint(52F, -23F, -5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box105
		gunModel[106].setRotationPoint(51.5F, -23.5F, -5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		gunModel[107].setRotationPoint(51.5F, -23F, -5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Import Box105
		gunModel[108].setRotationPoint(49.5F, -23.5F, 3F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.05F, 0F, -0.5F, -1.05F, 0F, 0F, -0.5F, 0F); // Import Box105
		gunModel[109].setRotationPoint(51.5F, -23.5F, 3F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box105
		gunModel[110].setRotationPoint(52F, -23.5F, 3F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box105
		gunModel[111].setRotationPoint(52F, -23F, 3F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box105
		gunModel[112].setRotationPoint(51.5F, -23.5F, 3F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		gunModel[113].setRotationPoint(51.5F, -23F, 3F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 104, 1, 2, 0F,-0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.25F, -1F, -0.5F); // Import Box127
		gunModel[114].setRotationPoint(-16.25F, -30.5F, -5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 99, 1, 2, 0F,0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Import Box128
		gunModel[115].setRotationPoint(-11.25F, -30.75F, -5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 34, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[116].setRotationPoint(53.5F, -31F, -3.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 34, 1, 7, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F); // Import Box0
		gunModel[117].setRotationPoint(53.5F, -30.5F, -3.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box100
		gunModel[118].setRotationPoint(48.5F, -20.25F, 3F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Import Box101
		gunModel[119].setRotationPoint(48.5F, -19.25F, 2F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[120].setRotationPoint(44.5F, -18.25F, -1F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box105
		gunModel[121].setRotationPoint(48.5F, -23.5F, 3F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box105
		gunModel[122].setRotationPoint(48.5F, -23.5F, -5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Import Box135
		gunModel[123].setRotationPoint(48.5F, -20.25F, -5F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Import Box136
		gunModel[124].setRotationPoint(48.5F, -19.25F, -4F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F); // Import Box105
		gunModel[125].setRotationPoint(47.5F, -23.5F, -5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F); // Import Box105
		gunModel[126].setRotationPoint(47.5F, -23.5F, 3F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Import Box105
		gunModel[127].setRotationPoint(46.5F, -22F, 3F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Import Box105
		gunModel[128].setRotationPoint(46.5F, -22F, -5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[129].setRotationPoint(56.5F, -28F, 6.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[130].setRotationPoint(86.5F, -28F, 6.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import Box0
		gunModel[131].setRotationPoint(56.5F, -28F, 7F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import Box0
		gunModel[132].setRotationPoint(86.5F, -28F, 7F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		gunModel[133].setRotationPoint(56.5F, -28F, 5.5F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box148
		gunModel[134].setRotationPoint(86.5F, -28F, 5.5F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 30, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[135].setRotationPoint(56.5F, -27F, 5.5F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[136].setRotationPoint(57F, -26F, 5F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box0
		gunModel[137].setRotationPoint(57F, -25F, 5F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[138].setRotationPoint(57F, -27F, 5F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[139].setRotationPoint(83F, -26F, 5F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box0
		gunModel[140].setRotationPoint(83F, -25F, 5F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[141].setRotationPoint(83F, -27F, 5F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 30, 3, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		gunModel[142].setRotationPoint(56.5F, -27F, -6.5F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		gunModel[143].setRotationPoint(57F, -26F, -6F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box168
		gunModel[144].setRotationPoint(57F, -25F, -6F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		gunModel[145].setRotationPoint(57F, -27F, -6F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		gunModel[146].setRotationPoint(83F, -26F, -6F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box171
		gunModel[147].setRotationPoint(83F, -25F, -6F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		gunModel[148].setRotationPoint(83F, -27F, -6F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F,-0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[149].setRotationPoint(53.25F, -34.5F, -4F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[150].setRotationPoint(53.25F, -36.25F, -4F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0.25F, -0.25F, -1.75F, 0.75F, -0.25F, -1.75F, 0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.75F, -0.25F, 0.75F, 0.75F, -0.25F, 0.75F, 0.75F, 0F, 0.25F, 0.75F, 0F); // Import Box0
		gunModel[151].setRotationPoint(54.5F, -37.25F, -4F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, 0F, 0F, 0.75F, 0F); // Import Box0
		gunModel[152].setRotationPoint(53.5F, -37.25F, -4F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[153].setRotationPoint(53.25F, -34.5F, 1.25F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[154].setRotationPoint(53.25F, -36.25F, 1.25F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[155].setRotationPoint(53.25F, -36.75F, 1.25F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 34, 5, 1, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		gunModel[156].setRotationPoint(54.5F, -27.5F, 4F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box181
		gunModel[157].setRotationPoint(54.5F, -30F, 4F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box182
		gunModel[158].setRotationPoint(82F, -29F, 4F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box183
		gunModel[159].setRotationPoint(66F, -29F, 4F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		gunModel[160].setRotationPoint(54.5F, -28.75F, 4F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box185
		gunModel[161].setRotationPoint(54.5F, -29.5F, 4F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box186
		gunModel[162].setRotationPoint(81F, -28.75F, 4F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box187
		gunModel[163].setRotationPoint(81F, -29.5F, 4F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		gunModel[164].setRotationPoint(70.5F, -28.75F, 4F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box189
		gunModel[165].setRotationPoint(70.5F, -29.5F, 4F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		gunModel[166].setRotationPoint(55.5F, -28F, 6.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Import Box0
		gunModel[167].setRotationPoint(55.5F, -28F, 7F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box148
		gunModel[168].setRotationPoint(55.5F, -28F, 5.5F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		gunModel[169].setRotationPoint(56.5F, -28F, -7.5F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box194
		gunModel[170].setRotationPoint(86.5F, -28F, -7.5F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		gunModel[171].setRotationPoint(56.5F, -28F, -8F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box196
		gunModel[172].setRotationPoint(86.5F, -28F, -8F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import Box197
		gunModel[173].setRotationPoint(56.5F, -28F, -6.5F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import Box198
		gunModel[174].setRotationPoint(86.5F, -28F, -6.5F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box199
		gunModel[175].setRotationPoint(55.5F, -28F, -7.5F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box200
		gunModel[176].setRotationPoint(55.5F, -28F, -8F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Import Box201
		gunModel[177].setRotationPoint(55.5F, -28F, -6.5F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[178].setRotationPoint(45F, -25.75F, -2F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F); // Import Box0
		gunModel[179].setRotationPoint(45F, -24.25F, -2F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[180].setRotationPoint(45F, -27.25F, -2F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 99, 1, 2, 0F,0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import Box128
		gunModel[181].setRotationPoint(-11.25F, -30.5F, -5F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 99, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Import Box258
		gunModel[182].setRotationPoint(-11.25F, -30.5F, 3F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[183].setRotationPoint(-6F, -43.5F, 2.75F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, -0.5F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[184].setRotationPoint(-2F, -43.5F, 2.75F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, -0.75F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[185].setRotationPoint(-1.5F, -43.5F, 2.75F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 10, 13, 2, 0F,0F, -6.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[186].setRotationPoint(-16F, -43.5F, 2.75F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 15, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[187].setRotationPoint(-16F, -37.5F, -3F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[188].setRotationPoint(10.5F, -4.25F, -2.5F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[189].setRotationPoint(22.5F, -4.25F, -2.5F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 1F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.75F, 0F); // Import Box0
		gunModel[190].setRotationPoint(5.5F, -7.25F, -2.5F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		gunModel[191].setRotationPoint(22.5F, -3.75F, -2.5F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.5F, -0.75F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F); // Import Box0
		gunModel[192].setRotationPoint(5.5F, -7.5F, -2.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[193].setRotationPoint(10.5F, -4F, -2.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[194].setRotationPoint(10.5F, -4.5F, -2.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[195].setRotationPoint(22.5F, -4.5F, -2.5F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F); // Import Box0
		gunModel[196].setRotationPoint(6.5F, -4.25F, -2.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.25F, 0F, 0F, -3F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -3F, -0.75F); // Import Box0
		gunModel[197].setRotationPoint(6.5F, -3.75F, -2.5F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 2.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 2.25F, -0.75F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F); // Import Box0
		gunModel[198].setRotationPoint(6.5F, -4.5F, -2.5F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F); // Import Box0
		gunModel[199].setRotationPoint(23.5F, -6.75F, -2.5F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[200].setRotationPoint(23.75F, -6.75F, -2.5F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F); // Import Box0
		gunModel[201].setRotationPoint(24.25F, -6.75F, -2.5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[202].setRotationPoint(23.5F, -5.5F, -2.5F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[203].setRotationPoint(24F, -5.5F, -2.5F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[204].setRotationPoint(24F, -5F, -2.5F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.25F, 0F, 0F); // Import Box0
		gunModel[205].setRotationPoint(24.25F, -5.5F, -2.5F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, -0.5F, 0F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, 0.75F, 0F, 0F); // Import Box0
		gunModel[206].setRotationPoint(24.25F, -5F, -2.5F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, -0.75F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Import Box0
		gunModel[207].setRotationPoint(23.75F, -4.75F, -2.5F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 42, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[208].setRotationPoint(-1F, -38.75F, -2F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box0
		gunModel[209].setRotationPoint(-1F, -39.75F, -2F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[210].setRotationPoint(-1F, -39.25F, -3F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 42, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[211].setRotationPoint(-1F, -38.75F, -2F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[212].setRotationPoint(56F, -19.75F, -2F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box0
		gunModel[213].setRotationPoint(56F, -18.75F, -2F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 28, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[214].setRotationPoint(56F, -18.25F, -3F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 28, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[215].setRotationPoint(56F, -17.75F, -2F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.25F, 0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[216].setRotationPoint(59F, -20.25F, -2F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 1F, 0.25F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[217].setRotationPoint(58F, -20.25F, -2F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0.25F, -0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, 1F, 0.25F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[218].setRotationPoint(57F, -20.25F, -2F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[219].setRotationPoint(84F, -20.25F, -4.5F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[220].setRotationPoint(84F, -19.25F, -4.5F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F); // Import Box0
		gunModel[221].setRotationPoint(84F, -16.25F, -2.5F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[222].setRotationPoint(84F, -17.25F, -3.5F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[223].setRotationPoint(84F, -22.25F, 3.5F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import Box266
		gunModel[224].setRotationPoint(84F, -22.25F, -4.5F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[225].setRotationPoint(84.5F, -16.25F, -1.5F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Import Box0
		gunModel[226].setRotationPoint(84.5F, -13.25F, -1.5F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box273
		gunModel[227].setRotationPoint(85.5F, -14.25F, 1.5F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box274
		gunModel[228].setRotationPoint(85.5F, -17.25F, 1.5F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box275
		gunModel[229].setRotationPoint(85.5F, -16.25F, 4F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box276
		gunModel[230].setRotationPoint(85.5F, -15.25F, 1F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import Box275
		gunModel[231].setRotationPoint(85.5F, -16.25F, 4.5F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[232].setRotationPoint(85.5F, -15.25F, 3F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[233].setRotationPoint(85.5F, -15.25F, 3F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[234].setRotationPoint(85.5F, -15.25F, 3F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F); // Import Box0
		gunModel[235].setRotationPoint(85.5F, -15.25F, 3F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box274
		gunModel[236].setRotationPoint(85.5F, -17.25F, 3.5F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box289
		gunModel[237].setRotationPoint(85.5F, -14.25F, -2.5F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		gunModel[238].setRotationPoint(85.5F, -17.25F, -2.5F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		gunModel[239].setRotationPoint(85.5F, -16.25F, -4F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		gunModel[240].setRotationPoint(85.5F, -15.25F, -2F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box293
		gunModel[241].setRotationPoint(85.5F, -16.25F, -4.5F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box294
		gunModel[242].setRotationPoint(85.5F, -15.25F, -3F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		gunModel[243].setRotationPoint(85.5F, -15.25F, -3F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F); // Import Box296
		gunModel[244].setRotationPoint(85.5F, -15.25F, -3F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box297
		gunModel[245].setRotationPoint(85.5F, -15.25F, -3F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box298
		gunModel[246].setRotationPoint(85.5F, -17.25F, -3.5F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0.75F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, 0.75F, 0F, 0F, 1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 1.25F); // Import Box0
		gunModel[247].setRotationPoint(42.75F, -22.5F, -5F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[248].setRotationPoint(40.75F, -22.5F, -5F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, -2.25F, 0.25F, -0.5F, -1.25F, 0.25F, -0.5F, -1.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 0.5F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 1.25F, 0F, 0.5F, 1.25F); // Import Box0
		gunModel[249].setRotationPoint(33F, -12F, -5F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, -2.25F, 0.25F, 0.25F, -2F, 1.25F, 0.25F, -2F, 1.25F, 0F, -2.25F, 0.25F, 0F, 0.5F, 1.25F, 0.25F, 0.25F, 1.25F, 0.25F, 0.25F, 1.25F, 0F, 0.5F, 1.25F); // Import Box0
		gunModel[250].setRotationPoint(42.5F, -13F, -5F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-0.25F, -2F, 1.25F, -0.25F, -2F, 0.25F, -0.25F, -2F, 0.25F, -0.25F, -2F, 1.25F, -0.25F, 0.25F, 1.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 1.25F); // Import Box0
		gunModel[251].setRotationPoint(44.5F, -13F, -5F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-0.25F, -3F, 1.25F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 1.25F, -0.25F, 0.25F, 1.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 1.25F); // Import Box0
		gunModel[252].setRotationPoint(44.5F, -12.75F, -5F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, -2.75F, 1.25F, -0.5F, -1.75F, 1.25F, -0.5F, -1.75F, 1.25F, 0F, -2.75F, 1.25F, 0F, 0F, 1.25F, -0.5F, -1F, 1.25F, -0.5F, -1F, 1.25F, 0F, 0F, 1.25F); // Import Box0
		gunModel[253].setRotationPoint(33F, -11.25F, -5F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, -2.75F, 1.25F, 0.25F, -2.5F, 1.25F, 0.25F, -2.5F, 1.25F, 0F, -2.75F, 1.25F, 0F, 0F, 1.25F, 0.25F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0F, 0F, 1.25F); // Import Box0
		gunModel[254].setRotationPoint(42.5F, -12.25F, -5F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,-0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.75F); // Import Box0
		gunModel[255].setRotationPoint(26.25F, -8.5F, -3.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.25F, 0F, 0F); // Import Box0
		gunModel[256].setRotationPoint(25.25F, -7.75F, -2.5F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, -0.75F, -1.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, -1.25F, -0.5F, -0.75F); // Import Box0
		gunModel[257].setRotationPoint(25.25F, -8F, -3.5F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0.75F, 0.75F, -0.5F, 0.75F, 1.25F, -0.5F, 0.75F, 1.25F, 0F, 0.75F, 0.75F); // Import Box0
		gunModel[258].setRotationPoint(32.5F, -10.25F, -5F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1.5F, 0.75F, -0.5F, -1.5F, 1.25F, -0.5F, -1.5F, 1.25F, 0F, -1.5F, 0.75F, 0F, 0.75F, 0.75F, -0.5F, 0.75F, 1.25F, -0.5F, 0.75F, 1.25F, 0F, 0.75F, 0.75F); // Import Box0
		gunModel[259].setRotationPoint(32.5F, -10F, -5F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, -0.75F); // Import Box0
		gunModel[260].setRotationPoint(25.5F, -11.75F, -3.5F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.75F, 0F, -0.75F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.75F); // Import Box0
		gunModel[261].setRotationPoint(25.5F, -13.25F, -3.5F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, -0.75F); // Import Box0
		gunModel[262].setRotationPoint(25.5F, -10F, -2.5F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.75F, -0.25F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, -0.75F); // Import Box0
		gunModel[263].setRotationPoint(24F, -8F, -2.5F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[264].setRotationPoint(26.5F, -12.75F, -3.5F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.75F, 0F, 0F); // Import Box0
		gunModel[265].setRotationPoint(26F, -10F, -2.5F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[266].setRotationPoint(24.5F, -8F, -2.5F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[267].setRotationPoint(25.5F, -13.25F, -3.5F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[268].setRotationPoint(32.5F, -6.75F, -2F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.75F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box0
		gunModel[269].setRotationPoint(32.5F, -8.25F, -2F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F); // Import Box0
		gunModel[270].setRotationPoint(10.75F, -11F, -1.5F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[271].setRotationPoint(10.75F, -9F, -1.5F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.25F, -1F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[272].setRotationPoint(11.75F, -8F, -1.5F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.25F, -1F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.25F, -1F, -0.25F, -1.25F, 0F, -0.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, -1.25F, 0F, -0.25F); // Import Box0
		gunModel[273].setRotationPoint(12.75F, -7F, -1.5F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[274].setRotationPoint(10.75F, -12F, -1.5F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.75F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Import Box0
		gunModel[275].setRotationPoint(10.75F, -13F, -1.5F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[276].setRotationPoint(43.5F, -22.25F, -3F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[277].setRotationPoint(45.25F, -19.25F, -4F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[278].setRotationPoint(45.25F, -20.75F, -4F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[279].setRotationPoint(45.25F, -19.75F, -4F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		gunModel[280].setRotationPoint(45F, -21.5F, -4F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		gunModel[281].setRotationPoint(47F, -20F, -4F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box105
		gunModel[282].setRotationPoint(47F, -20.5F, -4F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 1F, 0F); // Import Box105
		gunModel[283].setRotationPoint(44F, -21.5F, -4F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0.5F, 0F); // Import Box105
		gunModel[284].setRotationPoint(44.5F, -21.5F, -4F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[285].setRotationPoint(75.5F, -35.25F, 7.5F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 7, 14, 9, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 9F, 0F, -0.4F, -6F, 0F, -0.4F, -6F, 0F, -0.4F, 9F, 0F, -0.4F); // Import Box0
		gunModel[286].setRotationPoint(-3.5F, -9F, -4.5F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F); // Import Box0
		gunModel[287].setRotationPoint(-3F, -10F, -4.5F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.5F, -0.4F, -2.25F, 0F, -0.4F, -2.25F, 0F, -0.4F, 0F, -4.5F, -0.4F); // Import Box0
		gunModel[288].setRotationPoint(-12.5F, 5F, -4.5F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[289].setRotationPoint(-1.5F, -40.5F, -3F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Import Box0
		gunModel[290].setRotationPoint(-12.5F, -40.5F, -3F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.25F, -0.5F, 0F); // Import Box0
		gunModel[291].setRotationPoint(-12.5F, -38.5F, -3F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box0
		gunModel[292].setRotationPoint(-12.5F, -38F, -3F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box186
		gunModel[293].setRotationPoint(65F, -28.75F, 4F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box187
		gunModel[294].setRotationPoint(65F, -29.5F, 4F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box368
		gunModel[295].setRotationPoint(-9.5F, -41.5F, 1F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F); // Import Box0
		gunModel[296].setRotationPoint(-9.5F, -41.5F, -3F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Import Box0
		gunModel[297].setRotationPoint(-9.5F, -42.5F, -3F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box371
		gunModel[298].setRotationPoint(-9.5F, -42.5F, 2F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[299].setRotationPoint(-7.5F, -41.5F, -3F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[300].setRotationPoint(-7.5F, -41.5F, 2.5F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[301].setRotationPoint(-6.5F, -39.5F, -2.5F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Import Box0
		gunModel[302].setRotationPoint(-20F, -30F, -5.5F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box0
		gunModel[303].setRotationPoint(-16F, -23F, -5.5F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F); // Import Box0
		gunModel[304].setRotationPoint(-12.5F, -23F, -5.5F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[305].setRotationPoint(-11.5F, -23F, -5.5F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box0
		gunModel[306].setRotationPoint(-20F, -23F, -5.5F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[307].setRotationPoint(-22F, -22F, -5.5F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[308].setRotationPoint(-22F, -28.75F, -5.5F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[309].setRotationPoint(-22F, -29.75F, -5.5F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[310].setRotationPoint(-18F, -27.5F, -5.5F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[311].setRotationPoint(-20F, -27.5F, -5F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[312].setRotationPoint(-20F, -23.75F, -5.5F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box0
		gunModel[313].setRotationPoint(-19F, -23.75F, -5.5F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[314].setRotationPoint(-20F, -27.5F, -5.5F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[315].setRotationPoint(-19F, -27.5F, -5.5F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[316].setRotationPoint(-6F, -44F, 2.75F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -6.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, -6.5F, -0.75F, 0F, 6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 6F, -0.25F); // Import Box0
		gunModel[317].setRotationPoint(-16F, -44F, 2.75F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[318].setRotationPoint(-6F, -44F, -4.75F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -6.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -6.5F, -0.25F, 0F, 6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 6F, -0.25F); // Import Box0
		gunModel[319].setRotationPoint(-16F, -44F, -4.75F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[320].setRotationPoint(-2F, -44F, 2.75F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[321].setRotationPoint(-1.5F, -43.5F, 2.75F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box430
		gunModel[322].setRotationPoint(-6F, -43.5F, -4.75F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, -0.5F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box431
		gunModel[323].setRotationPoint(-2F, -43.5F, -4.75F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, -0.75F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box432
		gunModel[324].setRotationPoint(-1.5F, -43.5F, -4.75F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 10, 13, 2, 0F,0F, -6.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box433
		gunModel[325].setRotationPoint(-16F, -43.5F, -4.75F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F); // Import Box434
		gunModel[326].setRotationPoint(-2F, -44F, -4.75F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box435
		gunModel[327].setRotationPoint(-1.5F, -43.5F, -4.75F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 3, 7, 9, 0F,0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[328].setRotationPoint(-19F, -37.5F, -4.5F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F); // Import Box0
		gunModel[329].setRotationPoint(-19F, -38F, -4.5F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Import Box0
		gunModel[330].setRotationPoint(-20F, -30.25F, -5.5F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -1.25F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1.25F, -1.5F, 0F, 0.75F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.75F, -1F); // Import Box0
		gunModel[331].setRotationPoint(-21F, -38F, -5F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -2.25F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -2.25F, -1.5F, 0F, 1.75F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 1.75F, -1F); // Import Box0
		gunModel[332].setRotationPoint(-23F, -37.75F, -5F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -2.75F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -2.75F, -1.5F, 0F, 2.5F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 2.5F, -1F); // Import Box0
		gunModel[333].setRotationPoint(-27F, -35.75F, -5F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[334].setRotationPoint(-21F, -37F, -4F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import Box0
		gunModel[335].setRotationPoint(-23F, -36.75F, -4F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Import Box0
		gunModel[336].setRotationPoint(-27F, -34.75F, -4F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[337].setRotationPoint(-15F, -36.5F, 4.5F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Import Box0
		gunModel[338].setRotationPoint(-16F, -36.5F, 4.5F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[339].setRotationPoint(-15F, -37.5F, 4.5F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Import Box0
		gunModel[340].setRotationPoint(-16F, -37.5F, 4.5F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Import Box0
		gunModel[341].setRotationPoint(-7F, -36.5F, 4.5F);

		gunModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Import Box0
		gunModel[342].setRotationPoint(-7F, -37.5F, 4.5F);

		gunModel[343].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box451
		gunModel[343].setRotationPoint(-15F, -36.5F, -5.5F);

		gunModel[344].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		gunModel[344].setRotationPoint(-16F, -36.5F, -5.5F);

		gunModel[345].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box453
		gunModel[345].setRotationPoint(-15F, -37.5F, -5.5F);

		gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box454
		gunModel[346].setRotationPoint(-16F, -37.5F, -5.5F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box455
		gunModel[347].setRotationPoint(-7F, -36.5F, -5.5F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box456
		gunModel[348].setRotationPoint(-7F, -37.5F, -5.5F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[349].setRotationPoint(-16F, -30.5F, 5F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box0
		gunModel[350].setRotationPoint(-15F, -30.5F, 5F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[351].setRotationPoint(-14F, -30.5F, 6F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box463
		gunModel[352].setRotationPoint(-11F, -30.5F, 5F);

		gunModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Import Box464
		gunModel[353].setRotationPoint(-12F, -30.5F, 6F);

		gunModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.25F); // Import Box463
		gunModel[354].setRotationPoint(-10F, -30.5F, 5F);

		gunModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[355].setRotationPoint(-13F, -30.5F, 6.75F);

		gunModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[356].setRotationPoint(-14F, -30.5F, 5F);

		gunModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[357].setRotationPoint(-11.75F, -30.5F, 5F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Import Box0
		gunModel[358].setRotationPoint(-13F, -30.5F, 5F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, -1F, -1.25F, 0F, -1F, -0.75F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, -1.25F, 0F, -1F, -0.75F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Import Box0
		gunModel[359].setRotationPoint(-13F, -30.5F, 5.25F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -1.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Import Box0
		gunModel[360].setRotationPoint(-13F, -30.5F, 5.25F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, -1.25F, 0F, -1F, -0.75F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, -1.25F, 0F, -1F); // Import Box0
		gunModel[361].setRotationPoint(-13F, -30.5F, 5.75F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -1.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -1.25F, 0F, -1F, 0.25F, 0F, -1F); // Import Box0
		gunModel[362].setRotationPoint(-13F, -30.5F, 5.75F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Import Box0
		gunModel[363].setRotationPoint(-26.5F, -30.5F, -4.5F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, -2.75F, -2.25F, 0F, -0.74F, -1F, 0F, -0.74F, -1F, 0F, -2.75F, -2.25F, 0F, 2.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 2.25F, -1F); // Import Box0
		gunModel[364].setRotationPoint(-27F, -36.25F, -4.5F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,-1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Import Box0
		gunModel[365].setRotationPoint(-23.5F, -21.25F, -5.5F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[366].setRotationPoint(-12.5F, -21.25F, -5.5F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[367].setRotationPoint(-11.5F, -21.5F, -5.5F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F); // Import Box0
		gunModel[368].setRotationPoint(-12F, -20.75F, -4.5F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.75F, -0.5F, -0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -1F); // Import Box0
		gunModel[369].setRotationPoint(-13F, -20.75F, -4.5F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F, 0F, -0.5F); // Import Box0
		gunModel[370].setRotationPoint(-13F, -21.25F, -4.5F);

		gunModel[371].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Import Box0
		gunModel[371].setRotationPoint(-25F, -31.25F, -4.5F);

		gunModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F); // Import Box0
		gunModel[372].setRotationPoint(-20F, -31.25F, -4.5F);

		gunModel[373].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F,-1.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F, 0F, -0.25F, -0.75F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[373].setRotationPoint(-22.5F, -28.75F, -5.5F);

		gunModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F, -1F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.75F); // Import Box0
		gunModel[374].setRotationPoint(-22F, -29.75F, -5.5F);

		gunModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, -0.75F, -1.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F); // Import Box0
		gunModel[375].setRotationPoint(-22F, -30.75F, -5.5F);

		gunModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.5F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1.5F, -0.25F, -1F, -1.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -0.75F); // Import Box0
		gunModel[376].setRotationPoint(-22F, -31F, -5.5F);

		gunModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.5F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, -0.75F, -1.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F); // Import Box0
		gunModel[377].setRotationPoint(-24F, -21.75F, -5.5F);

		gunModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F, -1.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1.5F, -0.5F, -1F); // Import Box0
		gunModel[378].setRotationPoint(-24F, -20.75F, -5.5F);

		gunModel[379].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,-2.5F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -2.5F, 0.25F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[379].setRotationPoint(-24.5F, -28.5F, 3.75F);

		gunModel[380].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,-2.5F, -0.5F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, -2.5F, -0.5F, 0F, -1.75F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, -2F, 0F); // Import Box0
		gunModel[380].setRotationPoint(-26.5F, -28.5F, 3.75F);

		gunModel[381].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-3F, -1F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -3F, -1F, 0F, -2.5F, -2.75F, 0F, 0.75F, -2F, 0F, 0.75F, -2F, 0F, -2.5F, -2.75F, 0F); // Import Box0
		gunModel[381].setRotationPoint(-27.5F, -28.5F, 3.75F);

		gunModel[382].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-2.5F, 0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -0.25F, -2.5F, 0.25F, -0.25F, -2.5F, -1F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -2.5F, -1F, 0F); // Import Box0
		gunModel[382].setRotationPoint(-24.5F, -28.75F, 3.75F);

		gunModel[383].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-2.5F, -0.5F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, -0.25F, -2.5F, -0.5F, -0.25F, -2.5F, -0.25F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2.5F, -0.25F, 0F); // Import Box0
		gunModel[383].setRotationPoint(-26.5F, -28.75F, 3.75F);

		gunModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-3.25F, -0.25F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -3.25F, -0.25F, 0F, -3.25F, -0.5F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, -0.25F, -3.25F, -0.5F, -0.25F); // Import Box0
		gunModel[384].setRotationPoint(-28.25F, -24.5F, 3.75F);

		gunModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-3F, -0.25F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, -0.25F, -3F, -0.25F, -0.25F, -3F, -0.5F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -3F, -0.5F, 0F); // Import Box0
		gunModel[385].setRotationPoint(-27.5F, -28F, 3.75F);

		gunModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-2.25F, 0.5F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2.25F, 0.5F, 0F, -2.25F, -1.25F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, -0.25F, -2.25F, -1.25F, -0.25F); // Import Box0
		gunModel[386].setRotationPoint(-27F, -23F, 3.75F);

		gunModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-2F, -0.5F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.25F, -2F, -0.25F, -0.25F); // Import Box0
		gunModel[387].setRotationPoint(-25.5F, -22.5F, 3.75F);

		gunModel[388].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-3F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -3F, -1F, -0.25F, -2.5F, -3.5F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, -2.5F, -3.5F, -0.25F); // Import Box0
		gunModel[388].setRotationPoint(-27.75F, -28.5F, 3.75F);

		gunModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-3F, 1F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -3F, 1F, -0.25F, -3F, -2F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, -0.25F, -3F, -2F, -0.25F); // Import Box0
		gunModel[389].setRotationPoint(-28.25F, -24F, 3.75F);

		gunModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-3F, -1.25F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, -0.25F, -3F, -1.25F, -0.25F, -3F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -3F, 0.25F, -0.25F); // Import Box0
		gunModel[390].setRotationPoint(-27.75F, -28.75F, 3.75F);

		gunModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[391].setRotationPoint(-19.75F, -27F, 4.5F);

		gunModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1.5F, 0F); // Import Box0
		gunModel[392].setRotationPoint(-19F, -27F, 4.5F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -1.5F, -0.5F, -1.5F); // Import Box0
		gunModel[393].setRotationPoint(-26.5F, -20.75F, -5.5F);

		gunModel[394].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[394].setRotationPoint(-26F, -30.5F, -4.5F);

		gunModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F); // Import Box0
		gunModel[395].setRotationPoint(-26F, -31.25F, -4.5F);

		gunModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -2.25F); // Import Box0
		gunModel[396].setRotationPoint(-26F, -20.75F, -5.5F);

		gunModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[397].setRotationPoint(-28F, -33.5F, -3.5F);

		gunModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -0.75F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[398].setRotationPoint(-31F, -33F, -3.5F);

		gunModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.25F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[399].setRotationPoint(-33F, -32.25F, -3.5F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[400].setRotationPoint(-41F, -32.25F, -3.5F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[401].setRotationPoint(-28F, -33F, -4.5F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-0.25F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0.5F, -0.5F); // Import Box0
		gunModel[402].setRotationPoint(-31.25F, -32.5F, -4.5F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -1F, -1F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[403].setRotationPoint(-33F, -32.5F, -4.5F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[404].setRotationPoint(-41F, -32.5F, -4.5F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F,0F, 1.5F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 1.5F, -1.25F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F); // Import Box0
		gunModel[405].setRotationPoint(-64F, -32.25F, -3.5F);

		gunModel[406].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F,0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -2F, 0.5F); // Import Box0
		gunModel[406].setRotationPoint(-64F, -31.5F, -3.5F);

		gunModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 1.6F, -1.25F, 0F, 1.5F, -1.25F, 0F, 1.5F, -1.25F, 0F, 1.6F, -1.25F, 0F, -2.1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.1F, 0F); // Import Box0
		gunModel[407].setRotationPoint(-66F, -32.25F, -3.5F);

		gunModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 1.6F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 1.6F, -1F, -0.75F, -1.85F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, -0.75F, -1.85F, -0.5F); // Import Box0
		gunModel[408].setRotationPoint(-66F, -31.75F, -4.5F);

		gunModel[409].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 2.6F, -1.25F, -0.25F, 1.5F, -1.25F, -0.25F, 1.5F, -1.25F, 0F, 2.6F, -1.25F, 0F, -3.1F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, -3.1F, 0F); // Import Box0
		gunModel[409].setRotationPoint(-78F, -32.35F, -3.5F);

		gunModel[410].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 2.6F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 2.6F, 0F, 0F, -2.85F, 0.5F, 0.5F, -1.75F, 0.5F, 0.5F, -1.75F, 0.5F, 0F, -2.85F, 0.5F); // Import Box0
		gunModel[410].setRotationPoint(-78F, -31.85F, -3.5F);

		gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F); // Import Box0
		gunModel[411].setRotationPoint(-28F, -32F, -4.5F);

		gunModel[412].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[412].setRotationPoint(-41F, -31.5F, -4.5F);

		gunModel[413].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[413].setRotationPoint(-64F, -31.5F, -4.5F);

		gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.25F, 1.1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.25F, 1.1F, -0.5F, 0.25F, -2.1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.25F, -2.1F, -0.5F); // Import Box0
		gunModel[414].setRotationPoint(-65F, -31.5F, -4.5F);

		gunModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[415].setRotationPoint(-33F, -31.5F, -4.5F);

		gunModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -1F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, -1.25F, 0.5F, -0.5F, -1.25F, 0.5F, -0.5F, 0F, 1F, -0.5F); // Import Box0
		gunModel[416].setRotationPoint(-31F, -32F, -4.5F);

		gunModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0F, 1F, -0.5F); // Import Box0
		gunModel[417].setRotationPoint(-31F, -31F, -4.5F);

		gunModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, 0F, 1F, -1.25F); // Import Box0
		gunModel[418].setRotationPoint(-31F, -30.5F, -4.5F);

		gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1F, -0.5F, 0.25F, -2.25F, -0.5F, 0.25F, -2.25F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -1.25F, -0.25F, 1.75F, -1.25F, -0.25F, 1.75F, -1.25F, 0F, 0.5F, -1.25F); // Import Box0
		gunModel[419].setRotationPoint(-27.25F, -31F, -4.5F);

		gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, -1.25F); // Import Box0
		gunModel[420].setRotationPoint(-28.25F, -31.5F, -4.5F);

		gunModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 1F, -1.25F); // Import Box0
		gunModel[421].setRotationPoint(-29.25F, -31F, -4.5F);

		gunModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Import Box0
		gunModel[422].setRotationPoint(-28.25F, -32F, -4.5F);

		gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0.25F, 2.25F, -0.5F, 0.25F, 2.25F, -0.5F, 0F, 1F, -0.5F); // Import Box0
		gunModel[423].setRotationPoint(-27.25F, -32F, -4.5F);

		gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 1.25F, -0.5F); // Import Box0
		gunModel[424].setRotationPoint(-29.25F, -31.75F, -4.5F);

		gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[425].setRotationPoint(-29.25F, -32F, -4.5F);

		gunModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[426].setRotationPoint(-33F, -30.5F, -4.5F);

		gunModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.5F, -1.25F); // Import Box0
		gunModel[427].setRotationPoint(-33F, -29.75F, -4.5F);

		gunModel[428].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[428].setRotationPoint(-41F, -30.5F, -4.5F);

		gunModel[429].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Import Box0
		gunModel[429].setRotationPoint(-41F, -29.75F, -4.5F);

		gunModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, -1.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.75F, -1.5F, -1.25F); // Import Box0
		gunModel[430].setRotationPoint(-66F, -30.5F, -4.5F);

		gunModel[431].addShapeBox(0F, 0F, 0F, 45, 1, 9, 0F,0F, -1.25F, -1.25F, 0F, 11.5F, -1.25F, 0F, 11.5F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0.75F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[431].setRotationPoint(-75F, -10F, -4.5F);

		gunModel[432].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[432].setRotationPoint(-64F, -30.5F, -4.5F);

		gunModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.75F, 1.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.75F, 1.25F, -0.5F, -0.75F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -1.5F, -0.5F); // Import Box0
		gunModel[433].setRotationPoint(-66F, -31F, -4.5F);

		gunModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0F, 1F, -0.5F); // Import Box0
		gunModel[434].setRotationPoint(-31F, -31.5F, -4F);

		gunModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[435].setRotationPoint(-33F, -31F, -4F);

		gunModel[436].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[436].setRotationPoint(-41F, -31F, -4F);

		gunModel[437].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, 0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[437].setRotationPoint(-64F, -31F, -4F);

		gunModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[438].setRotationPoint(-29F, -32.5F, -4F);

		gunModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F); // Import Box0
		gunModel[439].setRotationPoint(-29F, -32F, -4F);

		gunModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[440].setRotationPoint(-29.25F, -32F, -4F);

		gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[441].setRotationPoint(-29F, -33F, -3F);

		gunModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.8F, 1.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.8F, 1.25F, -0.5F, -0.75F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -1.5F, -0.5F); // Import Box0
		gunModel[442].setRotationPoint(-66F, -31.5F, -4F);

		gunModel[443].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1.5F, -1.25F); // Import Box0
		gunModel[443].setRotationPoint(-75F, -31.75F, -4.5F);

		gunModel[444].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0.7F, -0.5F, 0.5F, -0.15F, -0.5F, 0.5F, -0.15F, -0.5F, 0F, 0.7F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[444].setRotationPoint(-75F, -32.75F, -4.5F);

		gunModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.25F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.75F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.25F, -0.75F, -1.25F); // Import Box0
		gunModel[445].setRotationPoint(-66.25F, -31.5F, -4.5F);

		gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.75F, 0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0.1F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Import Box0
		gunModel[446].setRotationPoint(-66.25F, -32.5F, -4.5F);

		gunModel[447].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 1.6F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 1.6F, -1F, -0.75F, -1.85F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, -0.75F, -1.85F, -0.5F); // Import Box0
		gunModel[447].setRotationPoint(-67F, -31.8F, -4F);

		gunModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[448].setRotationPoint(-67F, -32.6F, -3.5F);

		gunModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 1.45F, -1.25F, 0F, 1.4F, -1.25F, 0F, 1.4F, -1.25F, 0F, 1.45F, -1.25F, 0F, -2.1F, -0.5F, 0F, -2.1F, -0.5F, 0F, -2.1F, -0.5F, 0F, -2.1F, -0.5F); // Import Box0
		gunModel[449].setRotationPoint(-66.5F, -32.25F, -3.5F);

		gunModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0.78F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.78F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[450].setRotationPoint(-76F, -32.75F, -4.5F);

		gunModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		gunModel[451].setRotationPoint(-76F, -32.75F, -4F);

		gunModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0.25F, -0.75F); // Import Box0
		gunModel[452].setRotationPoint(-77F, -32.75F, -4F);

		gunModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, -0.05F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 1F, -0.05F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Import Box0
		gunModel[453].setRotationPoint(-77F, -33.75F, -4F);

		gunModel[454].addShapeBox(0F, 0F, 0F, 1, 21, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, -0.75F, -2.5F, 0F, -0.75F, 2F, 0F, 0F); // Import Box0
		gunModel[454].setRotationPoint(-77.25F, -31.5F, -4F);

		gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, -0.75F, 0.25F, 0F); // Import Box0
		gunModel[455].setRotationPoint(-78F, -32.75F, -4F);

		gunModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, -1F, 0F, 0F); // Import Box0
		gunModel[456].setRotationPoint(-79.25F, -10.5F, -4F);

		gunModel[457].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.75F, -0.5F, 0F, -1.25F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, -1.25F, -1.25F); // Import Box0
		gunModel[457].setRotationPoint(-64F, -29.75F, -4.5F);

		gunModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[458].setRotationPoint(-77F, -9.25F, -4F);

		gunModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F); // Import Box0
		gunModel[459].setRotationPoint(-78F, -9.25F, -4F);

		gunModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[460].setRotationPoint(-78.75F, -10F, -4F);

		gunModel[461].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		gunModel[461].setRotationPoint(-29F, -20.75F, -4F);

		gunModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[462].setRotationPoint(-30F, -20.75F, -4F);

		gunModel[463].addShapeBox(0F, 0F, 0F, 45, 1, 9, 0F,0F, -1.25F, -0.5F, 0F, 11.5F, -0.5F, 0F, 11.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.75F, -1.25F, 0F, -12F, -1.25F, 0F, -12F, -1.25F, 0F, 0.75F, -1.25F); // Import Box0
		gunModel[463].setRotationPoint(-75F, -9F, -4.5F);

		gunModel[464].addShapeBox(0F, 0F, 0F, 45, 1, 9, 0F,0F, -1.25F, -0.5F, 0F, 11.5F, -0.5F, 0F, 11.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0.75F, -0.5F); // Import Box0
		gunModel[464].setRotationPoint(-75F, -9.5F, -4.5F);

		gunModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[465].setRotationPoint(-77F, -8.75F, -4F);

		gunModel[466].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[466].setRotationPoint(-80F, -8.25F, -4F);

		gunModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[467].setRotationPoint(-78F, -8.75F, -4F);

		gunModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[468].setRotationPoint(-78.75F, -8.75F, -4F);

		gunModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[469].setRotationPoint(-79.25F, -8.75F, -4F);

		gunModel[470].addShapeBox(0F, 0F, 0F, 1, 21, 8, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F); // Import Box0
		gunModel[470].setRotationPoint(-78.75F, -31.5F, -4F);

		gunModel[471].addShapeBox(0F, 0F, 0F, 1, 21, 8, 0F,0.25F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.75F, 1F, 0F, -0.75F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, -0.75F); // Import Box0
		gunModel[471].setRotationPoint(-79.25F, -31.5F, -4F);

		gunModel[472].addShapeBox(0F, 0F, 0F, 2, 21, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[472].setRotationPoint(-80.75F, -31.5F, -4F);

		gunModel[473].addShapeBox(0F, 0F, 0F, 1, 21, 8, 0F,0.25F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.25F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, -0.75F, -1.75F, 0F, -0.75F, 1F, 0F, 0F); // Import Box0
		gunModel[473].setRotationPoint(-79.5F, -31.5F, -4F);

		gunModel[474].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.6F, 0F, -0.75F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.6F, 0F, -0.75F, 0.85F, 0F, -0.75F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, 0.85F, 0F, -0.75F); // Import Box0
		gunModel[474].setRotationPoint(-81.15F, -31.5F, -4F);

		gunModel[475].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,0.5F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.75F, 1.75F, 0F, -0.75F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, -0.75F); // Import Box0
		gunModel[475].setRotationPoint(-81.5F, -21.5F, -4F);

		gunModel[476].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 2.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 2.25F, 0F, 0F); // Import Box0
		gunModel[476].setRotationPoint(-80.5F, -21.5F, -4F);

		gunModel[477].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0.4F, 0F, 0F, 0.65F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0.65F, 0F, 0F); // Import Box0
		gunModel[477].setRotationPoint(-80.85F, -31.5F, -4F);

		gunModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[478].setRotationPoint(-79.5F, -34.95F, -3.5F);

		gunModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F); // Import Box0
		gunModel[479].setRotationPoint(-79.5F, -34.2F, -3.5F);

		gunModel[480].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-0.25F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[480].setRotationPoint(-79.5F, -32.5F, -3.5F);

		gunModel[481].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-0.25F, 0.2F, 0.5F, -1.5F, 0.2F, 0.5F, -1.5F, 0.2F, 0.5F, -0.25F, 0.2F, 0.5F, -0.25F, 0F, 0.5F, -1.5F, -1.2F, 0.5F, -1.5F, -1.2F, 0.5F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[481].setRotationPoint(-79.5F, -33.5F, -3.5F);

		gunModel[482].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-1.5F, 0.2F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, -1.5F, 0.2F, 0.5F, -0.25F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[482].setRotationPoint(-79.5F, -33.5F, -3.5F);

		gunModel[483].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, 0.2F, -0.75F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0.25F, 0.2F, -0.75F, 0.25F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.75F); // Import Box0
		gunModel[483].setRotationPoint(-79.25F, -33.5F, -4F);

		gunModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, 0.2F, 0F, -1F, 0.2F, -0.75F, -1F, 0.2F, -0.75F, 0.25F, 0.2F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0.25F, 0F, 0F); // Import Box0
		gunModel[484].setRotationPoint(-79.5F, -33.5F, -4F);

		gunModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[485].setRotationPoint(-81F, -33.5F, -4F);

		gunModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, 0.2F, -0.75F, -0.75F, 0.2F, 0F, -0.75F, 0.2F, 0F, 0.25F, 0.2F, -0.75F, 0.25F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.75F); // Import Box0
		gunModel[486].setRotationPoint(-81.5F, -33.5F, -4F);

		gunModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[487].setRotationPoint(-81.5F, -34.95F, -3.5F);

		gunModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F); // Import Box0
		gunModel[488].setRotationPoint(-81.5F, -34.2F, -3.5F);

		gunModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, -2F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -1F, 0F, -2F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F); // Import Box0
		gunModel[489].setRotationPoint(-81.75F, -34.95F, -3.5F);

		gunModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.25F); // Import Box0
		gunModel[490].setRotationPoint(-82F, -34.2F, -3.5F);

		gunModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.5F, -0.5F, -0.25F); // Import Box0
		gunModel[491].setRotationPoint(-80F, -34.2F, -3.5F);

		gunModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, 0F, -2F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.25F, 0F, -2F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.75F); // Import Box0
		gunModel[492].setRotationPoint(-79.75F, -34.95F, -3.5F);

		gunModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0.25F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0.5F); // Import Box604
		gunModel[493].setRotationPoint(-80.25F, -34.2F, -3.5F);

		gunModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, 0F, -1.25F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, -1.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, 0F); // Import Box605
		gunModel[494].setRotationPoint(-80F, -34.95F, -3.5F);

		gunModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box0
		gunModel[495].setRotationPoint(-82.5F, -9.5F, -4F);

		gunModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, -0.75F); // Import Box0
		gunModel[496].setRotationPoint(-83F, -9.5F, -4F);

		gunModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F); // Import Box0
		gunModel[497].setRotationPoint(-82.5F, -8.25F, -4F);

		gunModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Import Box0
		gunModel[498].setRotationPoint(-82.5F, -9F, -4F);

		gunModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.75F); // Import Box0
		gunModel[499].setRotationPoint(-83F, -9F, -4F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Import Box0
		gunModel[501] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Import Box0
		gunModel[502] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Import Box0
		gunModel[503] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Import Box0
		gunModel[504] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Import Box0
		gunModel[505] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Import Box0
		gunModel[506] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Import Box0
		gunModel[507] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Import Box0
		gunModel[508] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Import Box0
		gunModel[509] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Import Box0
		gunModel[510] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Import Box0
		gunModel[511] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Import Box0
		gunModel[512] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Import Box0
		gunModel[513] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Import Box0
		gunModel[514] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Import Box0
		gunModel[515] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import Box0
		gunModel[516] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box0
		gunModel[517] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import Box0
		gunModel[518] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Import Box0
		gunModel[519] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import Box0
		gunModel[520] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Import Box0
		gunModel[521] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[522] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import Box0
		gunModel[523] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Import Box0
		gunModel[524] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Import Box0
		gunModel[525] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Import Box0
		gunModel[526] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Import Box0
		gunModel[527] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Import Box0
		gunModel[528] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import Box0
		gunModel[529] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import Box0
		gunModel[530] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box0
		gunModel[531] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Import Box0
		gunModel[532] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import Box0
		gunModel[533] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box0
		gunModel[534] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Import Box0
		gunModel[535] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Import Box0
		gunModel[536] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Import Box0
		gunModel[537] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box0
		gunModel[538] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import Box0
		gunModel[539] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import Box0
		gunModel[540] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Import Box0
		gunModel[541] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Import Box0
		gunModel[542] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Import Box0
		gunModel[543] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Import Box0
		gunModel[544] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Import Box0
		gunModel[545] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Import Box0
		gunModel[546] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Import Box0
		gunModel[547] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Import Box0
		gunModel[548] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Import Box0
		gunModel[549] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import Box0
		gunModel[550] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Import Box0
		gunModel[551] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import Box0
		gunModel[552] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Import Box0
		gunModel[553] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Import Box0
		gunModel[554] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Import Box0
		gunModel[555] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Import Box0
		gunModel[556] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Import Box0
		gunModel[557] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import Box0
		gunModel[558] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Import Box0
		gunModel[559] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Import Box0
		gunModel[560] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Import Box0
		gunModel[561] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import Box0
		gunModel[562] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import Box0
		gunModel[563] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Import Box0
		gunModel[564] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import Box0
		gunModel[565] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import Box0
		gunModel[566] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Import Box0
		gunModel[567] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Import Box0
		gunModel[568] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Import Box0
		gunModel[569] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Import Box0
		gunModel[570] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import Box0
		gunModel[571] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Import Box0
		gunModel[572] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Import Box0
		gunModel[573] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Import Box0
		gunModel[574] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import Box0
		gunModel[575] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Import Box0
		gunModel[576] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Import Box0
		gunModel[577] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Import Box0
		gunModel[578] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Import Box0
		gunModel[579] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Import Box0
		gunModel[580] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Import Box0
		gunModel[581] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Import Box0
		gunModel[582] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Import Box0
		gunModel[583] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import Box0
		gunModel[584] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Import Box0
		gunModel[585] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Import Box0
		gunModel[586] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Import Box0
		gunModel[587] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Import Box0
		gunModel[588] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Import Box0
		gunModel[589] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Import Box0
		gunModel[590] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Import Box0
		gunModel[591] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Import Box0
		gunModel[592] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Import Box0
		gunModel[593] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Import Box0
		gunModel[594] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Import Box0
		gunModel[595] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Import Box0
		gunModel[596] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Import Box709
		gunModel[597] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Import Box710
		gunModel[598] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Import Box711
		gunModel[599] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Import Box712
		gunModel[600] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Import Box713
		gunModel[601] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Import Box714
		gunModel[602] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Import Box715
		gunModel[603] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Import Box716
		gunModel[604] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Import Box0
		gunModel[605] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Import Box0
		gunModel[606] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Import Box0
		gunModel[607] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Import Box0
		gunModel[608] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Import Box0
		gunModel[609] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Import Box0
		gunModel[610] = new ModelRendererTurbo(this, 617, 161, textureX, textureY); // Import Box0
		gunModel[611] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Import Box0
		gunModel[612] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Import Box0
		gunModel[613] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Import Box0
		gunModel[614] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Import Box0
		gunModel[615] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Import Box0
		gunModel[616] = new ModelRendererTurbo(this, 705, 177, textureX, textureY); // Import Box105
		gunModel[617] = new ModelRendererTurbo(this, 737, 177, textureX, textureY); // Import Box105
		gunModel[618] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Import Box105
		gunModel[619] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Import Box105
		gunModel[620] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Import Box105
		gunModel[621] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Import Box105
		gunModel[622] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Import Box105
		gunModel[623] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Import Box105
		gunModel[624] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box105
		gunModel[625] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Import Box105
		gunModel[626] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box105
		gunModel[627] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import Box105
		gunModel[628] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box105
		gunModel[629] = new ModelRendererTurbo(this, 601, 177, textureX, textureY); // Import Box105
		gunModel[630] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Import Box105
		gunModel[631] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Import Box105
		gunModel[632] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Import Box105
		gunModel[633] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Import Box105
		gunModel[634] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Import Box105
		gunModel[635] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box105
		gunModel[636] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Import Box105
		gunModel[637] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Import Box105
		gunModel[638] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Import Box105
		gunModel[639] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Import Box105
		gunModel[640] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Import Box105
		gunModel[641] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Import Box105
		gunModel[642] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Import Box105
		gunModel[643] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Import Box105
		gunModel[644] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Import Box105
		gunModel[645] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Import Box105
		gunModel[646] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import Box105
		gunModel[647] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import Box105
		gunModel[648] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box105
		gunModel[649] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Import Box0
		gunModel[650] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Import Box0
		gunModel[651] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Import Box0
		gunModel[652] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Import Box0
		gunModel[653] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import Box0
		gunModel[654] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Import Box0
		gunModel[655] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Import Box0
		gunModel[656] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Import Box0
		gunModel[657] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Import Box0
		gunModel[658] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import Box0
		gunModel[659] = new ModelRendererTurbo(this, 649, 169, textureX, textureY); // Import Box0
		gunModel[660] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box0
		gunModel[661] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Import Box0
		gunModel[662] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Import Box0
		gunModel[663] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Import Box0
		gunModel[664] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Import Box0
		gunModel[665] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Import Box0
		gunModel[666] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import Box0
		gunModel[667] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Import Box0
		gunModel[668] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Import Box0
		gunModel[669] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Import Box0
		gunModel[670] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Import Box0
		gunModel[671] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box0
		gunModel[672] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Import Box0
		gunModel[673] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import Box0
		gunModel[674] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import Box0
		gunModel[675] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import Box0
		gunModel[676] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Import Box0
		gunModel[677] = new ModelRendererTurbo(this, 689, 185, textureX, textureY); // Import Box0
		gunModel[678] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Import Box0
		gunModel[679] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Import Box0
		gunModel[680] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Import Box0
		gunModel[681] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Import Box0
		gunModel[682] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Import Box0
		gunModel[683] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Import Box0
		gunModel[684] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Import Box0
		gunModel[685] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Import Box0
		gunModel[686] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Import Box0
		gunModel[687] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Import Box0
		gunModel[688] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box0
		gunModel[689] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import Box0
		gunModel[690] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Import Box0
		gunModel[691] = new ModelRendererTurbo(this, 641, 177, textureX, textureY); // Import Box0
		gunModel[692] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Import Box0
		gunModel[693] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Import Box0
		gunModel[694] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Import Box0
		gunModel[695] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Import Box0
		gunModel[696] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box0
		gunModel[697] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box0
		gunModel[698] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Import Box0
		gunModel[699] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box0
		gunModel[700] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box0
		gunModel[701] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Import Box0
		gunModel[702] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 851
		gunModel[703] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 852
		gunModel[704] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 853
		gunModel[705] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 854
		gunModel[706] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 855
		gunModel[707] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 856
		gunModel[708] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 857
		gunModel[709] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 858
		gunModel[710] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 859
		gunModel[711] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 860
		gunModel[712] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 861
		gunModel[713] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 862
		gunModel[714] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Box 863
		gunModel[715] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 864
		gunModel[716] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 865
		gunModel[717] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 866
		gunModel[718] = new ModelRendererTurbo(this, 929, 193, textureX, textureY); // Box 867
		gunModel[719] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 868
		gunModel[720] = new ModelRendererTurbo(this, 953, 193, textureX, textureY); // Box 869
		gunModel[721] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Box 870
		gunModel[722] = new ModelRendererTurbo(this, 713, 161, textureX, textureY); // Box 871
		gunModel[723] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 872
		gunModel[724] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 873
		gunModel[725] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Box 874
		gunModel[726] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 875
		gunModel[727] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 876
		gunModel[728] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 877
		gunModel[729] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 878
		gunModel[730] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 879
		gunModel[731] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Box 880
		gunModel[732] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 881
		gunModel[733] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 882
		gunModel[734] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 883
		gunModel[735] = new ModelRendererTurbo(this, 545, 177, textureX, textureY); // Box 884

		gunModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, -1F, 0F, -1F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, -1F, 0F, -1F); // Import Box0
		gunModel[500].setRotationPoint(-83F, -8.25F, -4F);

		gunModel[501].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[501].setRotationPoint(-81.5F, -10.5F, -4F);

		gunModel[502].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[502].setRotationPoint(-80.25F, -10.5F, -4F);

		gunModel[503].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0.25F, 0.25F, -0.75F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, -0.5F, -0.75F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, -0.5F, -0.75F); // Import Box0
		gunModel[503].setRotationPoint(-80F, -10.25F, -4F);

		gunModel[504].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0.25F, 0.25F, 0F, -1F, 0.25F, -0.75F, -1F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, 0.25F, -0.5F, 0F); // Import Box0
		gunModel[504].setRotationPoint(-80.25F, -10.25F, -4F);

		gunModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[505].setRotationPoint(4.5F, -6.5F, -2.5F);

		gunModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0.25F, -0.75F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0.25F, -0.75F, 0.25F, -0.75F, -1F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0.25F, -0.75F, -1F); // Import Box0
		gunModel[506].setRotationPoint(-80F, -7.5F, -4F);

		gunModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0.25F, 0F, -1F, 0.25F, -0.75F, -1F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, -0.75F, -1F, -0.75F, -1F, -1F, -0.75F, -1F, 0.25F, -0.75F, -0.75F); // Import Box0
		gunModel[507].setRotationPoint(-80.25F, -7.5F, -4F);

		gunModel[508].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[508].setRotationPoint(-29F, -21.75F, -4F);

		gunModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[509].setRotationPoint(-30F, -21.75F, -4F);

		gunModel[510].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[510].setRotationPoint(-29F, -22.25F, -4F);

		gunModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[511].setRotationPoint(-30F, -22.25F, -4F);

		gunModel[512].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[512].setRotationPoint(-29F, -30.5F, -3F);

		gunModel[513].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F,-0.5F, -0.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -1.25F, -0.5F, 0.75F, -1.25F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, -0.5F, 0.75F, -1.25F); // Import Box0
		gunModel[513].setRotationPoint(-27F, -28.5F, -4.5F);

		gunModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[514].setRotationPoint(-27F, -22.25F, -4F);

		gunModel[515].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,0.5F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 1F, 0.25F); // Import Box0
		gunModel[515].setRotationPoint(-33F, -28.5F, -1.5F);

		gunModel[516].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,2F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 2F, -0.75F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[516].setRotationPoint(-37F, -29F, -1.5F);

		gunModel[517].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 1F, 0.25F); // Import Box0
		gunModel[517].setRotationPoint(-37F, -23F, -1.5F);

		gunModel[518].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[518].setRotationPoint(-37.5F, -26F, -1.5F);

		gunModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[519].setRotationPoint(-36.5F, -24F, -1.5F);

		gunModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[520].setRotationPoint(-34.5F, -24F, -1.5F);

		gunModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[521].setRotationPoint(-36.5F, -26F, -1.5F);

		gunModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F); // Import Box0
		gunModel[522].setRotationPoint(-34.5F, -26F, -1.5F);

		gunModel[523].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[523].setRotationPoint(-38F, -26F, -1.5F);

		gunModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1.5F, 0.25F, -0.5F, -2F, 0.25F, 0.25F, -2F, 0.25F, 0.25F, 1.5F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[524].setRotationPoint(-38F, -28F, -1.5F);

		gunModel[525].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[525].setRotationPoint(-38F, -23F, -1.5F);

		gunModel[526].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, 2F, -0.5F, -0.5F, -2.5F, -0.5F, 0.25F, -2.5F, -0.5F, 0.25F, 2F, -0.5F, -0.5F); // Import Box0
		gunModel[526].setRotationPoint(-39F, -21F, -1.5F);

		gunModel[527].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[527].setRotationPoint(-44F, -19.5F, -1.5F);

		gunModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Import Box0
		gunModel[528].setRotationPoint(-46F, -19.5F, -1.5F);

		gunModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -1F, -0.5F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, -1F, -0.5F, -0.25F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[529].setRotationPoint(-41.5F, -20.5F, -1.5F);

		gunModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, -0.25F, 0.25F); // Import Box0
		gunModel[530].setRotationPoint(-47.5F, -19.5F, -1.5F);

		gunModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, -1F, 0.25F); // Import Box0
		gunModel[531].setRotationPoint(-49F, -20.25F, -1.5F);

		gunModel[532].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[532].setRotationPoint(-50F, -26F, -1.5F);

		gunModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -1F, 0.25F, 0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -1F, 0.25F, 0.25F); // Import Box0
		gunModel[533].setRotationPoint(-50F, -22F, -1.5F);

		gunModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[534].setRotationPoint(-49F, -21.25F, -1.5F);

		gunModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.75F, -0.25F, 0.25F, 1.25F, -0.25F, -0.5F, 1.25F, -0.25F, -0.5F, -1.75F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[535].setRotationPoint(-50F, -28F, -1.5F);

		gunModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-2F, -0.25F, 0.25F, 1.5F, -0.25F, -0.5F, 1.5F, -0.25F, -0.5F, -2F, -0.25F, 0.25F, -0.75F, -0.75F, 0.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -0.75F, -0.75F, 0.25F); // Import Box0
		gunModel[536].setRotationPoint(-49F, -29F, -1.5F);

		gunModel[537].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Import Box0
		gunModel[537].setRotationPoint(-37.5F, -23F, -1.5F);

		gunModel[538].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 2F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 2F, -0.5F, 0.25F); // Import Box0
		gunModel[538].setRotationPoint(-38.5F, -21F, -1.5F);

		gunModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0.25F, 2.5F, -1F, 0.25F, 2.5F, -1F, 0.25F, 0F, -1F, 0.25F, 0.75F, 0.5F, 0.25F, 1F, 0.5F, 0.25F, 1F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F); // Import Box0
		gunModel[539].setRotationPoint(-40.5F, -20.5F, -1.5F);

		gunModel[540].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[540].setRotationPoint(-44F, -18.5F, -1.5F);

		gunModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 1F, 0.25F); // Import Box0
		gunModel[541].setRotationPoint(-46F, -19F, -1.5F);

		gunModel[542].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[542].setRotationPoint(-41.25F, -19F, -1.5F);

		gunModel[543].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, -0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.5F, 0.25F); // Import Box0
		gunModel[543].setRotationPoint(-47.5F, -19F, -1.5F);

		gunModel[544].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 1.5F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, -0.5F, 1.5F, 0.25F); // Import Box0
		gunModel[544].setRotationPoint(-49F, -19.75F, -1.5F);

		gunModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[545].setRotationPoint(-52.25F, -26.5F, -1.5F);

		gunModel[546].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 1.75F, 0F, -0.5F, -2.25F, 0F, 0.25F, -2.25F, 0F, 0.25F, 1.75F, 0F, -0.5F); // Import Box0
		gunModel[546].setRotationPoint(-52F, -25.5F, -1.5F);

		gunModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[547].setRotationPoint(-52.25F, -28F, -1.5F);

		gunModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0.5F, -0.5F, -1.5F, 0.5F, 0.25F, -1.5F, 0.5F, 0.25F, 1F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[548].setRotationPoint(-52.75F, -29F, -1.5F);

		gunModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F, -0.5F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.75F, 0F, -0.5F); // Import Box0
		gunModel[549].setRotationPoint(-54.25F, -18.5F, -1.5F);

		gunModel[550].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,-0.5F, -5F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, 4.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -0.5F, 4.5F, 0.25F); // Import Box0
		gunModel[550].setRotationPoint(-70F, -16.5F, -1.5F);

		gunModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.75F, 0F, -0.5F); // Import Box0
		gunModel[551].setRotationPoint(-55.75F, -16.5F, -1.5F);

		gunModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[552].setRotationPoint(-56.75F, -15.5F, -1.5F);

		gunModel[553].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,-0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, 1.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1.75F, 0F, 0.25F); // Import Box0
		gunModel[553].setRotationPoint(-51.5F, -25.5F, -1.5F);

		gunModel[554].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Import Box0
		gunModel[554].setRotationPoint(-53.75F, -18.5F, -1.5F);

		gunModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box0
		gunModel[555].setRotationPoint(-49.5F, -20.75F, -1.5F);

		gunModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, 0F, 0.75F, 0.25F); // Import Box0
		gunModel[556].setRotationPoint(-49F, -20.25F, -1.5F);

		gunModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1.75F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 1.75F, 0.25F, 0F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, -0.5F, 0.75F, 0.25F, 0F, 0.75F, 0.25F); // Import Box0
		gunModel[557].setRotationPoint(-49.5F, -20.25F, -1.5F);

		gunModel[558].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[558].setRotationPoint(-51.75F, -26.5F, -1.5F);

		gunModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[559].setRotationPoint(-51.75F, -28F, -1.5F);

		gunModel[560].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 1F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[560].setRotationPoint(-52.25F, -29F, -1.5F);

		gunModel[561].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Import Box0
		gunModel[561].setRotationPoint(-71.5F, -12.5F, -1.5F);

		gunModel[562].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1.25F, -0.5F, 0F, -1.75F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1.75F, 0.25F); // Import Box0
		gunModel[562].setRotationPoint(-73F, -12.5F, -1.5F);

		gunModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[563].setRotationPoint(-74F, -14.75F, -1.5F);

		gunModel[564].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F); // Import Box0
		gunModel[564].setRotationPoint(-76F, -15F, -1.5F);

		gunModel[565].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-0.75F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Import Box0
		gunModel[565].setRotationPoint(-55.25F, -16.5F, -1.5F);

		gunModel[566].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F); // Import Box0
		gunModel[566].setRotationPoint(-56.25F, -15.5F, -1.5F);

		gunModel[567].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,-0.5F, -4.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, -0.5F, -4.5F, 0.25F, -0.5F, 4.5F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, -0.5F, 4.5F, 0.25F); // Import Box0
		gunModel[567].setRotationPoint(-70F, -15.5F, -1.5F);

		gunModel[568].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F); // Import Box0
		gunModel[568].setRotationPoint(-71.5F, -12F, -1.5F);

		gunModel[569].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -0.75F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0.25F, 0F, -0.75F, 0.25F, 0F, 1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 1F, 0.25F); // Import Box0
		gunModel[569].setRotationPoint(-73F, -14F, -1.5F);

		gunModel[570].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[570].setRotationPoint(-56.75F, -15F, -1.5F);

		gunModel[571].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[571].setRotationPoint(-79F, -14F, -1.5F);

		gunModel[572].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1.25F, 0.25F); // Import Box0
		gunModel[572].setRotationPoint(-75F, -13F, -1.5F);

		gunModel[573].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[573].setRotationPoint(-75F, -16F, -1.5F);

		gunModel[574].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3.25F, 0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, -3.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[574].setRotationPoint(-74F, -16.75F, -1.5F);

		gunModel[575].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -2.75F, 0.25F, 0F, -4.25F, 0.25F, 0F, -4.25F, 0.25F, 0F, -2.75F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[575].setRotationPoint(-76F, -17.75F, -1.5F);

		gunModel[576].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, -0.25F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, -0.25F, -2.75F, 0.25F); // Import Box0
		gunModel[576].setRotationPoint(-74F, -10.75F, -1.5F);

		gunModel[577].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, -0.25F, -2.75F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.5F, 0.25F); // Import Box0
		gunModel[577].setRotationPoint(-74F, -15.25F, -1.5F);

		gunModel[578].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -2.75F, 0.25F, -0.25F, -2.75F, 0.25F, -0.25F, -2.75F, 0.25F, 0F, -2.75F, 0.25F); // Import Box0
		gunModel[578].setRotationPoint(-75F, -10.75F, -1.5F);

		gunModel[579].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -2.75F, 0.25F, -0.25F, -2.75F, 0.25F, -0.25F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[579].setRotationPoint(-75F, -15.25F, -1.5F);

		gunModel[580].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0.25F); // Import Box0
		gunModel[580].setRotationPoint(-76F, -32.5F, -1.5F);

		gunModel[581].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[581].setRotationPoint(-76.5F, -15.5F, -1.5F);

		gunModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F); // Import Box0
		gunModel[582].setRotationPoint(-77F, -16F, -1.5F);

		gunModel[583].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[583].setRotationPoint(-78.5F, -15.5F, -1.5F);

		gunModel[584].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,-0.75F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Import Box0
		gunModel[584].setRotationPoint(-77.5F, -32.5F, -1.5F);

		gunModel[585].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.5F, -0.25F, 0.25F, 1.75F, -0.25F, 0.25F, 1.75F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, -1.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F); // Import Box0
		gunModel[585].setRotationPoint(-51F, -28F, -1.5F);

		gunModel[586].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0.25F, 2F, -0.25F, 0.25F, 2F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.75F, 0.25F, 0.75F, -0.75F, 0.25F, 0.75F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F); // Import Box0
		gunModel[586].setRotationPoint(-50F, -29F, -1.5F);

		gunModel[587].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, -0.5F, 0F, 1.5F, 0F); // Import Box0
		gunModel[587].setRotationPoint(-16F, -28F, -5.5F);

		gunModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[588].setRotationPoint(-33.5F, -25F, 1.75F);

		gunModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.75F, 1F, 0F, -0.75F); // Import Box0
		gunModel[589].setRotationPoint(-33.5F, -24F, 1.75F);

		gunModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[590].setRotationPoint(-37.5F, -25F, 1.75F);

		gunModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, -1.5F, 0F, -0.75F); // Import Box0
		gunModel[591].setRotationPoint(-37.5F, -24F, 1.75F);

		gunModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[592].setRotationPoint(-33.5F, -26F, 1.75F);

		gunModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, -1.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[593].setRotationPoint(-37.5F, -26F, 1.75F);

		gunModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		gunModel[594].setRotationPoint(-35.5F, -23F, 1.75F);

		gunModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F); // Import Box0
		gunModel[595].setRotationPoint(-35.5F, -26.5F, 1.75F);

		gunModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box709
		gunModel[596].setRotationPoint(-33.5F, -25F, -2.75F);

		gunModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Import Box710
		gunModel[597].setRotationPoint(-33.5F, -24F, -2.75F);

		gunModel[598].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box711
		gunModel[598].setRotationPoint(-37.5F, -25F, -2.75F);

		gunModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Import Box712
		gunModel[599].setRotationPoint(-37.5F, -24F, -2.75F);

		gunModel[600].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box713
		gunModel[600].setRotationPoint(-33.5F, -26F, -2.75F);

		gunModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box714
		gunModel[601].setRotationPoint(-37.5F, -26F, -2.75F);

		gunModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box715
		gunModel[602].setRotationPoint(-35.5F, -23F, -2.75F);

		gunModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box716
		gunModel[603].setRotationPoint(-35.5F, -26.5F, -2.75F);

		gunModel[604].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[604].setRotationPoint(3.5F, -20F, -5.5F);

		gunModel[605].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[605].setRotationPoint(3.5F, -21F, -5.5F);

		gunModel[606].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,-1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[606].setRotationPoint(4F, -22F, -5.5F);

		gunModel[607].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Import Box0
		gunModel[607].setRotationPoint(3.5F, -19F, -5.5F);

		gunModel[608].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F); // Import Box0
		gunModel[608].setRotationPoint(3.5F, -18.25F, -5.5F);

		gunModel[609].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-1.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -2F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -2F, 0.25F, 0.25F); // Import Box0
		gunModel[609].setRotationPoint(3.5F, -17F, -5.5F);

		gunModel[610].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import Box0
		gunModel[610].setRotationPoint(5.5F, -15.75F, -5.5F);

		gunModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[611].setRotationPoint(5.5F, -16.25F, -5.5F);

		gunModel[612].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box0
		gunModel[612].setRotationPoint(-0.5F, -15.5F, -5F);

		gunModel[613].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box0
		gunModel[613].setRotationPoint(-1.5F, -17F, -5F);

		gunModel[614].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box0
		gunModel[614].setRotationPoint(-2.5F, -18.5F, -5F);

		gunModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box0
		gunModel[615].setRotationPoint(0.5F, -21.25F, -5F);

		gunModel[616].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[616].setRotationPoint(16.25F, -19.5F, -5F);

		gunModel[617].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[617].setRotationPoint(16.25F, -21F, -5F);

		gunModel[618].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[618].setRotationPoint(16.25F, -20F, -5F);

		gunModel[619].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[619].setRotationPoint(10.25F, -19.5F, -5F);

		gunModel[620].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[620].setRotationPoint(10.25F, -21F, -5F);

		gunModel[621].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[621].setRotationPoint(10.25F, -20F, -5F);

		gunModel[622].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[622].setRotationPoint(10.25F, -15.5F, -5F);

		gunModel[623].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[623].setRotationPoint(10.25F, -17F, -5F);

		gunModel[624].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[624].setRotationPoint(10.25F, -16F, -5F);

		gunModel[625].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[625].setRotationPoint(22.25F, -17.5F, -5F);

		gunModel[626].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[626].setRotationPoint(22.25F, -19F, -5F);

		gunModel[627].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[627].setRotationPoint(22.25F, -18F, -5F);

		gunModel[628].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[628].setRotationPoint(30.5F, -10F, -4F);

		gunModel[629].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[629].setRotationPoint(30.5F, -11.5F, -4F);

		gunModel[630].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[630].setRotationPoint(30.5F, -10.5F, -4F);

		gunModel[631].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box105
		gunModel[631].setRotationPoint(27F, -21.5F, 4.15F);

		gunModel[632].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box105
		gunModel[632].setRotationPoint(29.5F, -21.5F, 4.15F);

		gunModel[633].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[633].setRotationPoint(28.25F, -22F, 4F);

		gunModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box105
		gunModel[634].setRotationPoint(28.25F, -20F, 4F);

		gunModel[635].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box105
		gunModel[635].setRotationPoint(28.25F, -19F, 4F);

		gunModel[636].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box105
		gunModel[636].setRotationPoint(28.25F, -15.5F, 4F);

		gunModel[637].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[637].setRotationPoint(27.25F, -24F, 4F);

		gunModel[638].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[638].setRotationPoint(27.25F, -25F, 4F);

		gunModel[639].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box105
		gunModel[639].setRotationPoint(27.25F, -25.5F, 4F);

		gunModel[640].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box105
		gunModel[640].setRotationPoint(27.25F, -23F, 4F);

		gunModel[641].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Import Box105
		gunModel[641].setRotationPoint(27.25F, -22.5F, 4F);

		gunModel[642].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box105
		gunModel[642].setRotationPoint(27F, -21.75F, 4.15F);

		gunModel[643].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box105
		gunModel[643].setRotationPoint(29.5F, -21.75F, 4.15F);

		gunModel[644].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Import Box105
		gunModel[644].setRotationPoint(27F, -21.75F, 4.15F);

		gunModel[645].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Import Box105
		gunModel[645].setRotationPoint(29.5F, -21.75F, 4.15F);

		gunModel[646].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box105
		gunModel[646].setRotationPoint(28F, -23.25F, 5.15F);

		gunModel[647].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box105
		gunModel[647].setRotationPoint(28F, -24.75F, 5.15F);

		gunModel[648].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box105
		gunModel[648].setRotationPoint(28F, -23.75F, 5.15F);

		gunModel[649].addShapeBox(0F, 0F, 0F, 33, 8, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[649].setRotationPoint(-6.5F, -30F, -5F);

		gunModel[650].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[650].setRotationPoint(41.5F, -30F, -5F);

		gunModel[651].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[651].setRotationPoint(26.5F, -30F, -5F);

		gunModel[652].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[652].setRotationPoint(26.5F, -23F, -5F);

		gunModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[653].setRotationPoint(40.5F, -29F, -5F);

		gunModel[654].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[654].setRotationPoint(40.5F, -24.5F, -5F);

		gunModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[655].setRotationPoint(26.5F, -29F, -5F);

		gunModel[656].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[656].setRotationPoint(26.5F, -24.5F, -5F);

		gunModel[657].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[657].setRotationPoint(27.5F, -23F, -6F);

		gunModel[658].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[658].setRotationPoint(25.5F, -28F, -6F);

		gunModel[659].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[659].setRotationPoint(42.5F, -30F, -6F);

		gunModel[660].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box0
		gunModel[660].setRotationPoint(25.5F, -29F, -6F);

		gunModel[661].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[661].setRotationPoint(25.5F, -24F, -6F);

		gunModel[662].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[662].setRotationPoint(26.5F, -23F, -6F);

		gunModel[663].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Import Box0
		gunModel[663].setRotationPoint(42.5F, -24F, -6F);

		gunModel[664].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[664].setRotationPoint(41.5F, -23F, -6F);

		gunModel[665].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[665].setRotationPoint(42.5F, -31F, -6F);

		gunModel[666].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[666].setRotationPoint(53.25F, -36.25F, -4F);

		gunModel[667].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[667].setRotationPoint(17.5F, -28F, 4.05F);

		gunModel[668].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[668].setRotationPoint(29.5F, -28F, 4.05F);

		gunModel[669].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[669].setRotationPoint(39F, -28F, 4.05F);

		gunModel[670].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[670].setRotationPoint(29F, -28F, 4.05F);

		gunModel[671].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[671].setRotationPoint(27F, -28F, 4.05F);

		gunModel[672].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[672].setRotationPoint(17F, -28F, 4.05F);

		gunModel[673].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[673].setRotationPoint(46.5F, -28.25F, 4.05F);

		gunModel[674].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F); // Import Box0
		gunModel[674].setRotationPoint(46.25F, -28.25F, 4.05F);

		gunModel[675].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[675].setRotationPoint(52F, -28.25F, 4.05F);

		gunModel[676].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[676].setRotationPoint(-19.5F, -34.75F, -6.5F);

		gunModel[677].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[677].setRotationPoint(-21.5F, -34.75F, -6.5F);

		gunModel[678].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[678].setRotationPoint(-20.5F, -34.75F, -6.5F);

		gunModel[679].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[679].setRotationPoint(-19.5F, -37.25F, -6.5F);

		gunModel[680].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		gunModel[680].setRotationPoint(-21.5F, -37.25F, -6.5F);

		gunModel[681].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[681].setRotationPoint(-20.5F, -37.25F, -6.5F);

		gunModel[682].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F); // Import Box0
		gunModel[682].setRotationPoint(-20.6F, -35.25F, -6.37F);

		gunModel[683].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F); // Import Box0
		gunModel[683].setRotationPoint(-19.85F, -35.25F, -6.37F);

		gunModel[684].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, -0.25F); // Import Box0
		gunModel[684].setRotationPoint(-21.35F, -35.25F, -6.37F);

		gunModel[685].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[685].setRotationPoint(-19.5F, -22.25F, -6.5F);

		gunModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		gunModel[686].setRotationPoint(-21.5F, -22.25F, -6.5F);

		gunModel[687].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[687].setRotationPoint(-20.5F, -22.25F, -6.5F);

		gunModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F); // Import Box0
		gunModel[688].setRotationPoint(-20.6F, -22.75F, -6.37F);

		gunModel[689].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F); // Import Box0
		gunModel[689].setRotationPoint(-19.85F, -22.75F, -6.37F);

		gunModel[690].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, -0.25F); // Import Box0
		gunModel[690].setRotationPoint(-21.35F, -22.75F, -6.37F);

		gunModel[691].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[691].setRotationPoint(-18.5F, -34.75F, -5.5F);

		gunModel[692].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.5F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[692].setRotationPoint(-23.5F, -32F, -5.5F);

		gunModel[693].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[693].setRotationPoint(-18.5F, -27.75F, -5.5F);

		gunModel[694].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[694].setRotationPoint(47.5F, -24.5F, 3F);

		gunModel[695].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[695].setRotationPoint(53.5F, -26.5F, 3F);

		gunModel[696].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[696].setRotationPoint(46.5F, -24.5F, 3F);

		gunModel[697].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[697].setRotationPoint(46.5F, -26.5F, 3F);

		gunModel[698].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[698].setRotationPoint(46.5F, -25.5F, 3F);

		gunModel[699].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[699].setRotationPoint(52.5F, -26.5F, 3F);

		gunModel[700].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[700].setRotationPoint(52.5F, -25.5F, 3F);

		gunModel[701].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[701].setRotationPoint(46.5F, -26.5F, 3.85F);

		gunModel[702].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 851
		gunModel[702].setRotationPoint(3F, -39.75F, -2F);

		gunModel[703].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 852
		gunModel[703].setRotationPoint(3F, -39.25F, -3F);

		gunModel[704].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 853
		gunModel[704].setRotationPoint(7F, -39.75F, -2F);

		gunModel[705].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 854
		gunModel[705].setRotationPoint(7F, -39.25F, -3F);

		gunModel[706].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 855
		gunModel[706].setRotationPoint(11F, -39.75F, -2F);

		gunModel[707].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 856
		gunModel[707].setRotationPoint(11F, -39.25F, -3F);

		gunModel[708].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 857
		gunModel[708].setRotationPoint(15F, -39.75F, -2F);

		gunModel[709].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 858
		gunModel[709].setRotationPoint(15F, -39.25F, -3F);

		gunModel[710].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 859
		gunModel[710].setRotationPoint(19F, -39.75F, -2F);

		gunModel[711].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 860
		gunModel[711].setRotationPoint(19F, -39.25F, -3F);

		gunModel[712].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 861
		gunModel[712].setRotationPoint(23F, -39.75F, -2F);

		gunModel[713].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 862
		gunModel[713].setRotationPoint(23F, -39.25F, -3F);

		gunModel[714].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 863
		gunModel[714].setRotationPoint(27F, -39.75F, -2F);

		gunModel[715].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 864
		gunModel[715].setRotationPoint(27F, -39.25F, -3F);

		gunModel[716].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 865
		gunModel[716].setRotationPoint(31F, -39.75F, -2F);

		gunModel[717].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 866
		gunModel[717].setRotationPoint(31F, -39.25F, -3F);

		gunModel[718].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 867
		gunModel[718].setRotationPoint(35F, -39.75F, -2F);

		gunModel[719].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 868
		gunModel[719].setRotationPoint(35F, -39.25F, -3F);

		gunModel[720].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 869
		gunModel[720].setRotationPoint(39F, -39.75F, -2F);

		gunModel[721].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 870
		gunModel[721].setRotationPoint(39F, -39.25F, -3F);

		gunModel[722].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 871
		gunModel[722].setRotationPoint(60.5F, -28F, 7F);

		gunModel[723].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 872
		gunModel[723].setRotationPoint(60.5F, -28F, 6.5F);

		gunModel[724].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 873
		gunModel[724].setRotationPoint(64.5F, -28F, 7F);

		gunModel[725].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 874
		gunModel[725].setRotationPoint(64.5F, -28F, 6.5F);

		gunModel[726].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 875
		gunModel[726].setRotationPoint(68.5F, -28F, 7F);

		gunModel[727].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 876
		gunModel[727].setRotationPoint(68.5F, -28F, 6.5F);

		gunModel[728].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 877
		gunModel[728].setRotationPoint(72.5F, -28F, 7F);

		gunModel[729].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 878
		gunModel[729].setRotationPoint(72.5F, -28F, 6.5F);

		gunModel[730].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 879
		gunModel[730].setRotationPoint(76.5F, -28F, 7F);

		gunModel[731].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 880
		gunModel[731].setRotationPoint(76.5F, -28F, 6.5F);

		gunModel[732].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 881
		gunModel[732].setRotationPoint(80.5F, -28F, 7F);

		gunModel[733].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 882
		gunModel[733].setRotationPoint(80.5F, -28F, 6.5F);

		gunModel[734].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 883
		gunModel[734].setRotationPoint(84.5F, -28F, 7F);

		gunModel[735].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 884
		gunModel[735].setRotationPoint(84.5F, -28F, 6.5F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Import Box252
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Import Box252
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import Box0
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(91F, -28.25F, -3F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[1].setRotationPoint(91F, -26.25F, -3F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		defaultBarrelModel[2].setRotationPoint(91F, -24.25F, -3F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, -0.5F, -1.75F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, -0.5F, -1.75F, -0.25F, 0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.25F, -0.25F); // Import Box0
		defaultBarrelModel[3].setRotationPoint(90.5F, -28.25F, -3F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultBarrelModel[4].setRotationPoint(90.5F, -26.25F, -3F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -1.75F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, -0.5F, -1.75F); // Import Box0
		defaultBarrelModel[5].setRotationPoint(90.5F, -24.25F, -3F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, -2F, 0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.5F, 0F, 0F); // Import Box0
		defaultBarrelModel[6].setRotationPoint(91.5F, -28.25F, -3F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F); // Import Box0
		defaultBarrelModel[7].setRotationPoint(91.5F, -26.25F, -3F);

		defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, -0.5F, 0F, -2F); // Import Box0
		defaultBarrelModel[8].setRotationPoint(91.5F, -24.25F, -3F);

		defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		defaultBarrelModel[9].setRotationPoint(92F, -25.75F, -2.25F);

		defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		defaultBarrelModel[10].setRotationPoint(92F, -25.75F, 1.25F);

		defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F); // Import Box0
		defaultBarrelModel[11].setRotationPoint(92F, -24.25F, -2.25F);

		defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F); // Import Box252
		defaultBarrelModel[12].setRotationPoint(92F, -24.25F, 1.25F);

		defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		defaultBarrelModel[13].setRotationPoint(92F, -27.25F, -2.25F);

		defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box252
		defaultBarrelModel[14].setRotationPoint(92F, -27.25F, 1.25F);

		defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		defaultBarrelModel[15].setRotationPoint(92F, -24.5F, -0.5F);

		defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		defaultBarrelModel[16].setRotationPoint(92F, -27F, -0.5F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import Box213
		defaultScopeModel[9] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import Box214
		defaultScopeModel[10] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Import Box215
		defaultScopeModel[11] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import Box218
		defaultScopeModel[12] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Import Box221
		defaultScopeModel[13] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box0
		defaultScopeModel[14] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box0
		defaultScopeModel[15] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0
		defaultScopeModel[16] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import Box0
		defaultScopeModel[17] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Import Box0
		defaultScopeModel[18] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Import Box0
		defaultScopeModel[19] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import Box231
		defaultScopeModel[20] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box232
		defaultScopeModel[21] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box0
		defaultScopeModel[22] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import Box0
		defaultScopeModel[23] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import Box0
		defaultScopeModel[24] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box0
		defaultScopeModel[25] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import Box0
		defaultScopeModel[26] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Import Box0
		defaultScopeModel[27] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import Box0
		defaultScopeModel[28] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Import Box418
		defaultScopeModel[29] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Import Box0
		defaultScopeModel[30] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Import Box420
		defaultScopeModel[31] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box0
		defaultScopeModel[32] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Import Box0
		defaultScopeModel[33] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box0
		defaultScopeModel[34] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box0
		defaultScopeModel[35] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Box0
		defaultScopeModel[36] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Import Box0
		defaultScopeModel[37] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Import Box0

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,-3F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, -3F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Import Box0
		defaultScopeModel[0].setRotationPoint(75.5F, -38.25F, -2F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		defaultScopeModel[1].setRotationPoint(78.5F, -39.25F, -2F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-1.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Import Box0
		defaultScopeModel[2].setRotationPoint(78.5F, -40.25F, -2.25F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,-0.75F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F); // Import Box0
		defaultScopeModel[3].setRotationPoint(75.5F, -37.5F, -2F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.15F, 0.15F, -0.5F, 0.5F, 0.15F, -0.5F, 0.5F, 0.15F, 1F, -0.15F, 0.15F, 1F, 0.15F, -0.5F, 0.75F, 0.75F, -0.5F, 0.75F, 0.75F, -0.5F, 2.25F, 0.15F, -0.5F, 2.25F); // Import Box0
		defaultScopeModel[4].setRotationPoint(81.5F, -44.75F, -1.25F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(80.5F, -43F, -2.75F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.15F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.5F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(80.5F, -42F, -2.25F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F); // Import Box0
		defaultScopeModel[7].setRotationPoint(78.5F, -41.25F, -2.25F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Import Box213
		defaultScopeModel[8].setRotationPoint(78.5F, -41.25F, 0.25F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.15F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.5F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box214
		defaultScopeModel[9].setRotationPoint(80.5F, -42F, 1.25F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F); // Import Box215
		defaultScopeModel[10].setRotationPoint(80.5F, -43F, 1.75F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.35F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0.25F, 0.35F, 0F, 0.25F, 0.65F, -0.25F, -0.5F, 1.15F, -0.25F, -0.5F, 1.15F, -0.25F, 0.5F, 0.65F, -0.25F, 0.5F); // Import Box218
		defaultScopeModel[11].setRotationPoint(81.5F, -43.75F, 1.25F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.35F, -0.5F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0.25F, 0.35F, -0.5F, 0.25F); // Import Box221
		defaultScopeModel[12].setRotationPoint(81.5F, -44.25F, 1.25F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		defaultScopeModel[13].setRotationPoint(82.5F, -41.25F, -2F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[14].setRotationPoint(82.5F, -42.25F, -1F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.6F); // Import Box0
		defaultScopeModel[15].setRotationPoint(82.5F, -43.25F, -1F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Import Box0
		defaultScopeModel[16].setRotationPoint(82.5F, -42F, -1F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.15F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F); // Import Box0
		defaultScopeModel[17].setRotationPoint(82.5F, -43.75F, -1F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.15F, -0.5F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F); // Import Box0
		defaultScopeModel[18].setRotationPoint(82.5F, -43.5F, -1F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.35F, 0F, 0.25F, 0.9F, 0F, 0.25F, 0.9F, 0F, 0F, 0.35F, 0F, 0F, 0.65F, -0.25F, 0.5F, 1.15F, -0.25F, 0.5F, 1.15F, -0.25F, -0.5F, 0.65F, -0.25F, -0.5F); // Import Box231
		defaultScopeModel[19].setRotationPoint(81.5F, -43.75F, -2.25F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.75F, 0.15F, 0F, 0.75F, 0.35F, -0.5F, 0.25F, 0.9F, -0.5F, 0.25F, 0.9F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Import Box232
		defaultScopeModel[20].setRotationPoint(81.5F, -44.25F, -2.25F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[21].setRotationPoint(-9F, -41F, -1.5F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[22].setRotationPoint(-8F, -41F, -1.5F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		defaultScopeModel[23].setRotationPoint(-10F, -41F, -1.5F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[24].setRotationPoint(-5F, -43.25F, -1.75F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[25].setRotationPoint(-5F, -43.25F, 0.75F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		defaultScopeModel[26].setRotationPoint(-5F, -41.75F, -2F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Import Box0
		defaultScopeModel[27].setRotationPoint(-5F, -43.25F, -0.75F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box418
		defaultScopeModel[28].setRotationPoint(-5F, -43.25F, -0.25F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		defaultScopeModel[29].setRotationPoint(-5F, -43.5F, 0.75F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box420
		defaultScopeModel[30].setRotationPoint(-5F, -43.5F, -1.75F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		defaultScopeModel[31].setRotationPoint(-6F, -41.75F, -2F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		defaultScopeModel[32].setRotationPoint(-4F, -41.75F, -2F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[33].setRotationPoint(-4F, -42F, -2F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[34].setRotationPoint(-5.1F, -41.75F, -3.5F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box0
		defaultScopeModel[35].setRotationPoint(-5.1F, -41.75F, -3.5F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[36].setRotationPoint(-5.1F, -41.5F, -3.5F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.25F); // Import Box0
		defaultScopeModel[37].setRotationPoint(-2F, -41.75F, -2F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Import Box0
		slideModel[13] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Import Box0
		slideModel[14] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Import Box0
		slideModel[15] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Import Box0
		slideModel[16] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box0
		slideModel[17] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import Box0
		slideModel[18] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Import Box0
		slideModel[19] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import Box0
		slideModel[20] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Import Box0
		slideModel[21] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import Box0
		slideModel[22] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import Box0
		slideModel[23] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import Box0
		slideModel[24] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box0
		slideModel[25] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import Box0
		slideModel[26] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Import Box0

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		slideModel[0].setRotationPoint(74.5F, -35.25F, 5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		slideModel[1].setRotationPoint(78.5F, -35.25F, 7.25F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		slideModel[2].setRotationPoint(75.5F, -35.25F, 5.25F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		slideModel[3].setRotationPoint(75.5F, -35.25F, 4.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		slideModel[4].setRotationPoint(78.5F, -35.25F, 7.75F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		slideModel[5].setRotationPoint(75.5F, -35.25F, 8F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[6].setRotationPoint(74.5F, -35.25F, 4.25F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Import Box0
		slideModel[7].setRotationPoint(74.5F, -35.25F, 7.75F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import Box0
		slideModel[8].setRotationPoint(74.5F, -35.25F, 7.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F); // Import Box0
		slideModel[9].setRotationPoint(75.5F, -32.5F, 4.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		slideModel[10].setRotationPoint(74.5F, -35.5F, 5.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		slideModel[11].setRotationPoint(74.5F, -35.5F, 6.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		slideModel[12].setRotationPoint(74.5F, -35.5F, 7F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 1F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, 1.5F, -0.25F, -0.5F, 1F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		slideModel[13].setRotationPoint(74.5F, -35.5F, 7.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.75F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box0
		slideModel[14].setRotationPoint(78.5F, -35.5F, 7.25F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box0
		slideModel[15].setRotationPoint(78.25F, -35.5F, 7.75F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F); // Import Box0
		slideModel[16].setRotationPoint(74.5F, -32.5F, 5.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		slideModel[17].setRotationPoint(74.5F, -32.5F, 6.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		slideModel[18].setRotationPoint(74.5F, -32.5F, 7F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.25F, -0.5F, 1.5F, -0.25F, -0.5F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 1F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Import Box0
		slideModel[19].setRotationPoint(74.5F, -32.5F, 7.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -0.75F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Import Box0
		slideModel[20].setRotationPoint(78.5F, -32.5F, 7.25F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		slideModel[21].setRotationPoint(78.25F, -32.5F, 7.75F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 1F, -0.25F, -0.25F); // Import Box0
		slideModel[22].setRotationPoint(75.5F, -35.5F, 4.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[23].setRotationPoint(75.5F, -34F, 3F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		slideModel[24].setRotationPoint(75.5F, -33.75F, 3F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		slideModel[25].setRotationPoint(75.5F, -34.25F, 3F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 15, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[26].setRotationPoint(26.5F, -28.5F, -4.5F);
	}
}
