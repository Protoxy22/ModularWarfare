//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: delta3030win
// Model Creator: 
// Created on: 03.02.2019 - 21:58:25
// Last changed on: 03.02.2019 - 21:58:25

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class win3030 extends ModelGun //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public win3030() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[516];
		defaultBarrelModel = new ModelRendererTurbo[44];
		pumpModel = new ModelRendererTurbo[15];
		leverActionModel = new ModelRendererTurbo[32];
		breakActionModel = new ModelRendererTurbo[4];

		initgunModel_1();
		initgunModel_2();
		initdefaultBarrelModel_1();
		initpumpModel_1();
		initleverActionModel_1();
		initbreakActionModel_1();

		modelScale = 0.12F;
		//scopeAttachPoint = new Vector3f(25F /16F, 53F /16F, 0F /16F);

		translateAll = new Vector3f(0F, -25F, 0F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.10F, 0F);//forward/up/? 

		gunSlideDistance = 0F;
		//nimationType = EnumAnimationType.CUSTOM;
		
		leverRotation = 90F;
		leverRotationPoint = new Vector3f(1.55F,0.5F,0F);
		rotationHelper = new Vector3f(1.55F,0.5F,0F);
		pumpDelayAfterReload = 65;
		pumpDelay = 10;
		pumpTime = 15;
		gripIsOnPump = false;
		pumpHandleDistance = 0.75F;
		
		tiltGun = 0F;
		rotateGunVertical = 0F;
		translateGun = new Vector3f(0F, -3, 0F);

		rotateClipVertical = 0F;
		translateClip = new Vector3f(0F, -3F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Import Box22
		gunModel[1] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Import Box23
		gunModel[2] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Import Box24
		gunModel[3] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Import Box25
		gunModel[4] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Import Box26
		gunModel[5] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Import Box27
		gunModel[6] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Import Box28
		gunModel[7] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Import Box29
		gunModel[8] = new ModelRendererTurbo(this, 1969, 1, textureX, textureY); // Import Box30
		gunModel[9] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Import Box31
		gunModel[10] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Import Box32
		gunModel[11] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Import Box33
		gunModel[12] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Import Box34
		gunModel[13] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Import Box35
		gunModel[14] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Import Box36
		gunModel[15] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Import Box37
		gunModel[16] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Import Box38
		gunModel[17] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Import Box39
		gunModel[18] = new ModelRendererTurbo(this, 1873, 9, textureX, textureY); // Import Box40
		gunModel[19] = new ModelRendererTurbo(this, 1881, 9, textureX, textureY); // Import Box41
		gunModel[20] = new ModelRendererTurbo(this, 1889, 9, textureX, textureY); // Import Box42
		gunModel[21] = new ModelRendererTurbo(this, 1897, 9, textureX, textureY); // Import Box43
		gunModel[22] = new ModelRendererTurbo(this, 1057, 17, textureX, textureY); // Import Box44
		gunModel[23] = new ModelRendererTurbo(this, 1065, 17, textureX, textureY); // Import Box45
		gunModel[24] = new ModelRendererTurbo(this, 1073, 17, textureX, textureY); // Import Box46
		gunModel[25] = new ModelRendererTurbo(this, 1081, 17, textureX, textureY); // Import Box47
		gunModel[26] = new ModelRendererTurbo(this, 1089, 17, textureX, textureY); // Import Box48
		gunModel[27] = new ModelRendererTurbo(this, 1097, 17, textureX, textureY); // Import Box49
		gunModel[28] = new ModelRendererTurbo(this, 1105, 17, textureX, textureY); // Import Box50
		gunModel[29] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Import Box51
		gunModel[30] = new ModelRendererTurbo(this, 1121, 17, textureX, textureY); // Import Box52
		gunModel[31] = new ModelRendererTurbo(this, 1129, 17, textureX, textureY); // Import Box53
		gunModel[32] = new ModelRendererTurbo(this, 1137, 17, textureX, textureY); // Import Box54
		gunModel[33] = new ModelRendererTurbo(this, 1145, 17, textureX, textureY); // Import Box55
		gunModel[34] = new ModelRendererTurbo(this, 1153, 17, textureX, textureY); // Import Box56
		gunModel[35] = new ModelRendererTurbo(this, 1161, 17, textureX, textureY); // Import Box57
		gunModel[36] = new ModelRendererTurbo(this, 1169, 17, textureX, textureY); // Import Box58
		gunModel[37] = new ModelRendererTurbo(this, 1177, 17, textureX, textureY); // Import Box59
		gunModel[38] = new ModelRendererTurbo(this, 1185, 17, textureX, textureY); // Import Box60
		gunModel[39] = new ModelRendererTurbo(this, 1193, 17, textureX, textureY); // Import Box61
		gunModel[40] = new ModelRendererTurbo(this, 1201, 17, textureX, textureY); // Import Box62
		gunModel[41] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Import Box63
		gunModel[42] = new ModelRendererTurbo(this, 1217, 17, textureX, textureY); // Import Box64
		gunModel[43] = new ModelRendererTurbo(this, 1225, 17, textureX, textureY); // Import Box65
		gunModel[44] = new ModelRendererTurbo(this, 1233, 17, textureX, textureY); // Import Box66
		gunModel[45] = new ModelRendererTurbo(this, 1241, 17, textureX, textureY); // Import Box67
		gunModel[46] = new ModelRendererTurbo(this, 1249, 17, textureX, textureY); // Import Box68
		gunModel[47] = new ModelRendererTurbo(this, 1257, 17, textureX, textureY); // Import Box69
		gunModel[48] = new ModelRendererTurbo(this, 1265, 17, textureX, textureY); // Import Box70
		gunModel[49] = new ModelRendererTurbo(this, 1273, 17, textureX, textureY); // Import Box71
		gunModel[50] = new ModelRendererTurbo(this, 1281, 17, textureX, textureY); // Import Box72
		gunModel[51] = new ModelRendererTurbo(this, 1289, 17, textureX, textureY); // Import Box73
		gunModel[52] = new ModelRendererTurbo(this, 1297, 17, textureX, textureY); // Import Box74
		gunModel[53] = new ModelRendererTurbo(this, 1305, 17, textureX, textureY); // Import Box75
		gunModel[54] = new ModelRendererTurbo(this, 1313, 17, textureX, textureY); // Import Box76
		gunModel[55] = new ModelRendererTurbo(this, 1321, 17, textureX, textureY); // Import Box77
		gunModel[56] = new ModelRendererTurbo(this, 1329, 17, textureX, textureY); // Import Box78
		gunModel[57] = new ModelRendererTurbo(this, 1337, 17, textureX, textureY); // Import Box79
		gunModel[58] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Import Box80
		gunModel[59] = new ModelRendererTurbo(this, 1353, 17, textureX, textureY); // Import Box81
		gunModel[60] = new ModelRendererTurbo(this, 1361, 17, textureX, textureY); // Import Box82
		gunModel[61] = new ModelRendererTurbo(this, 1369, 17, textureX, textureY); // Import Box83
		gunModel[62] = new ModelRendererTurbo(this, 1377, 17, textureX, textureY); // Import Box84
		gunModel[63] = new ModelRendererTurbo(this, 1385, 17, textureX, textureY); // Import Box85
		gunModel[64] = new ModelRendererTurbo(this, 1393, 17, textureX, textureY); // Import Box86
		gunModel[65] = new ModelRendererTurbo(this, 1401, 17, textureX, textureY); // Import Box87
		gunModel[66] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Import Box88
		gunModel[67] = new ModelRendererTurbo(this, 1417, 17, textureX, textureY); // Import Box89
		gunModel[68] = new ModelRendererTurbo(this, 1425, 17, textureX, textureY); // Import Box90
		gunModel[69] = new ModelRendererTurbo(this, 1433, 17, textureX, textureY); // Import Box91
		gunModel[70] = new ModelRendererTurbo(this, 1441, 17, textureX, textureY); // Import Box92
		gunModel[71] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Import Box93
		gunModel[72] = new ModelRendererTurbo(this, 1457, 17, textureX, textureY); // Import Box94
		gunModel[73] = new ModelRendererTurbo(this, 1473, 17, textureX, textureY); // Import Box95
		gunModel[74] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Import Box96
		gunModel[75] = new ModelRendererTurbo(this, 1457, 17, textureX, textureY); // Import Box97
		gunModel[76] = new ModelRendererTurbo(this, 1505, 17, textureX, textureY); // Import Box98
		gunModel[77] = new ModelRendererTurbo(this, 1513, 17, textureX, textureY); // Import Box99
		gunModel[78] = new ModelRendererTurbo(this, 1521, 17, textureX, textureY); // Import Box100
		gunModel[79] = new ModelRendererTurbo(this, 1529, 17, textureX, textureY); // Import Box101
		gunModel[80] = new ModelRendererTurbo(this, 1537, 17, textureX, textureY); // Import Box102
		gunModel[81] = new ModelRendererTurbo(this, 1545, 17, textureX, textureY); // Import Box103
		gunModel[82] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Import Box104
		gunModel[83] = new ModelRendererTurbo(this, 1561, 17, textureX, textureY); // Import Box105
		gunModel[84] = new ModelRendererTurbo(this, 1569, 17, textureX, textureY); // Import Box106
		gunModel[85] = new ModelRendererTurbo(this, 1577, 17, textureX, textureY); // Import Box107
		gunModel[86] = new ModelRendererTurbo(this, 1585, 17, textureX, textureY); // Import Box108
		gunModel[87] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Import Box109
		gunModel[88] = new ModelRendererTurbo(this, 1601, 17, textureX, textureY); // Import Box110
		gunModel[89] = new ModelRendererTurbo(this, 1609, 17, textureX, textureY); // Import Box111
		gunModel[90] = new ModelRendererTurbo(this, 1617, 17, textureX, textureY); // Import Box112
		gunModel[91] = new ModelRendererTurbo(this, 1625, 17, textureX, textureY); // Import Box113
		gunModel[92] = new ModelRendererTurbo(this, 1633, 17, textureX, textureY); // Import Box114
		gunModel[93] = new ModelRendererTurbo(this, 1641, 17, textureX, textureY); // Import Box115
		gunModel[94] = new ModelRendererTurbo(this, 1649, 17, textureX, textureY); // Import Box116
		gunModel[95] = new ModelRendererTurbo(this, 1657, 17, textureX, textureY); // Import Box117
		gunModel[96] = new ModelRendererTurbo(this, 1665, 17, textureX, textureY); // Import Box118
		gunModel[97] = new ModelRendererTurbo(this, 1673, 17, textureX, textureY); // Import Box119
		gunModel[98] = new ModelRendererTurbo(this, 1681, 17, textureX, textureY); // Import Box120
		gunModel[99] = new ModelRendererTurbo(this, 1689, 17, textureX, textureY); // Import Box121
		gunModel[100] = new ModelRendererTurbo(this, 1705, 17, textureX, textureY); // Import Box122
		gunModel[101] = new ModelRendererTurbo(this, 1721, 17, textureX, textureY); // Import Box123
		gunModel[102] = new ModelRendererTurbo(this, 1745, 17, textureX, textureY); // Import Box124
		gunModel[103] = new ModelRendererTurbo(this, 1753, 17, textureX, textureY); // Import Box125
		gunModel[104] = new ModelRendererTurbo(this, 1761, 17, textureX, textureY); // Import Box126
		gunModel[105] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Import Box127
		gunModel[106] = new ModelRendererTurbo(this, 1777, 17, textureX, textureY); // Import Box128
		gunModel[107] = new ModelRendererTurbo(this, 1785, 17, textureX, textureY); // Import Box129
		gunModel[108] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Import Box130
		gunModel[109] = new ModelRendererTurbo(this, 1801, 17, textureX, textureY); // Import Box131
		gunModel[110] = new ModelRendererTurbo(this, 1809, 17, textureX, textureY); // Import Box132
		gunModel[111] = new ModelRendererTurbo(this, 1817, 17, textureX, textureY); // Import Box135
		gunModel[112] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Import Box136
		gunModel[113] = new ModelRendererTurbo(this, 1833, 17, textureX, textureY); // Import Box137
		gunModel[114] = new ModelRendererTurbo(this, 1841, 17, textureX, textureY); // Import Box138
		gunModel[115] = new ModelRendererTurbo(this, 1849, 17, textureX, textureY); // Import Box139
		gunModel[116] = new ModelRendererTurbo(this, 1857, 17, textureX, textureY); // Import Box140
		gunModel[117] = new ModelRendererTurbo(this, 1865, 17, textureX, textureY); // Import Box141
		gunModel[118] = new ModelRendererTurbo(this, 1905, 17, textureX, textureY); // Import Box142
		gunModel[119] = new ModelRendererTurbo(this, 1913, 17, textureX, textureY); // Import Box143
		gunModel[120] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Import Box144
		gunModel[121] = new ModelRendererTurbo(this, 1929, 17, textureX, textureY); // Import Box145
		gunModel[122] = new ModelRendererTurbo(this, 1937, 17, textureX, textureY); // Import Box147
		gunModel[123] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box148
		gunModel[124] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box149
		gunModel[125] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import Box152
		gunModel[126] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box153
		gunModel[127] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import Box154
		gunModel[128] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Import Box155
		gunModel[129] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Import Box157
		gunModel[130] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import Box158
		gunModel[131] = new ModelRendererTurbo(this, 1153, 33, textureX, textureY); // Import Box159
		gunModel[132] = new ModelRendererTurbo(this, 1297, 33, textureX, textureY); // Import Box160
		gunModel[133] = new ModelRendererTurbo(this, 1441, 33, textureX, textureY); // Import Box162
		gunModel[134] = new ModelRendererTurbo(this, 1585, 33, textureX, textureY); // Import Box163
		gunModel[135] = new ModelRendererTurbo(this, 1729, 33, textureX, textureY); // Import Box164
		gunModel[136] = new ModelRendererTurbo(this, 1873, 33, textureX, textureY); // Import Box165
		gunModel[137] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box166
		gunModel[138] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box167
		gunModel[139] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box168
		gunModel[140] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import Box169
		gunModel[141] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Import Box170
		gunModel[142] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Import Box171
		gunModel[143] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Import Box172
		gunModel[144] = new ModelRendererTurbo(this, 1945, 17, textureX, textureY); // Import Box173
		gunModel[145] = new ModelRendererTurbo(this, 1953, 17, textureX, textureY); // Import Box174
		gunModel[146] = new ModelRendererTurbo(this, 1961, 17, textureX, textureY); // Import Box175
		gunModel[147] = new ModelRendererTurbo(this, 1969, 17, textureX, textureY); // Import Box176
		gunModel[148] = new ModelRendererTurbo(this, 1977, 17, textureX, textureY); // Import Box177
		gunModel[149] = new ModelRendererTurbo(this, 1985, 17, textureX, textureY); // Import Box178
		gunModel[150] = new ModelRendererTurbo(this, 1993, 17, textureX, textureY); // Import Box179
		gunModel[151] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Import Box180
		gunModel[152] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Import Box181
		gunModel[153] = new ModelRendererTurbo(this, 2017, 17, textureX, textureY); // Import Box182
		gunModel[154] = new ModelRendererTurbo(this, 2025, 17, textureX, textureY); // Import Box183
		gunModel[155] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Import Box184
		gunModel[156] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Import Box185
		gunModel[157] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Import Box186
		gunModel[158] = new ModelRendererTurbo(this, 2033, 33, textureX, textureY); // Import Box187
		gunModel[159] = new ModelRendererTurbo(this, 2041, 33, textureX, textureY); // Import Box188
		gunModel[160] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Import Box189
		gunModel[161] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Import Box190
		gunModel[162] = new ModelRendererTurbo(this, 1025, 49, textureX, textureY); // Import Box191
		gunModel[163] = new ModelRendererTurbo(this, 1033, 49, textureX, textureY); // Import Box192
		gunModel[164] = new ModelRendererTurbo(this, 1041, 49, textureX, textureY); // Import Box193
		gunModel[165] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Import Box194
		gunModel[166] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Import Box195
		gunModel[167] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Import Box197
		gunModel[168] = new ModelRendererTurbo(this, 1297, 49, textureX, textureY); // Import Box198
		gunModel[169] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Import Box199
		gunModel[170] = new ModelRendererTurbo(this, 1393, 49, textureX, textureY); // Import Box200
		gunModel[171] = new ModelRendererTurbo(this, 1457, 49, textureX, textureY); // Import Box201
		gunModel[172] = new ModelRendererTurbo(this, 1025, 25, textureX, textureY); // Import Box202
		gunModel[173] = new ModelRendererTurbo(this, 1457, 25, textureX, textureY); // Import Box203
		gunModel[174] = new ModelRendererTurbo(this, 1473, 25, textureX, textureY); // Import Box204
		gunModel[175] = new ModelRendererTurbo(this, 1497, 25, textureX, textureY); // Import Box205
		gunModel[176] = new ModelRendererTurbo(this, 1873, 25, textureX, textureY); // Import Box206
		gunModel[177] = new ModelRendererTurbo(this, 1473, 49, textureX, textureY); // Import Box208
		gunModel[178] = new ModelRendererTurbo(this, 1497, 49, textureX, textureY); // Import Box209
		gunModel[179] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Import Box211
		gunModel[180] = new ModelRendererTurbo(this, 1521, 49, textureX, textureY); // Import Box212
		gunModel[181] = new ModelRendererTurbo(this, 1721, 17, textureX, textureY); // Import Box200
		gunModel[182] = new ModelRendererTurbo(this, 1049, 25, textureX, textureY); // Import Box202
		gunModel[183] = new ModelRendererTurbo(this, 1737, 25, textureX, textureY); // Import Box203
		gunModel[184] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Import Box204
		gunModel[185] = new ModelRendererTurbo(this, 1201, 49, textureX, textureY); // Import Box205
		gunModel[186] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Import Box206
		gunModel[187] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Import Box207
		gunModel[188] = new ModelRendererTurbo(this, 1537, 49, textureX, textureY); // Import Box208
		gunModel[189] = new ModelRendererTurbo(this, 1545, 49, textureX, textureY); // Import Box209
		gunModel[190] = new ModelRendererTurbo(this, 1553, 49, textureX, textureY); // Import Box210
		gunModel[191] = new ModelRendererTurbo(this, 1561, 49, textureX, textureY); // Import Box211
		gunModel[192] = new ModelRendererTurbo(this, 1569, 49, textureX, textureY); // Import Box212
		gunModel[193] = new ModelRendererTurbo(this, 1577, 49, textureX, textureY); // Import Box213
		gunModel[194] = new ModelRendererTurbo(this, 1585, 49, textureX, textureY); // Import Box214
		gunModel[195] = new ModelRendererTurbo(this, 1593, 49, textureX, textureY); // Import Box215
		gunModel[196] = new ModelRendererTurbo(this, 1601, 49, textureX, textureY); // Import Box216
		gunModel[197] = new ModelRendererTurbo(this, 1609, 49, textureX, textureY); // Import Box217
		gunModel[198] = new ModelRendererTurbo(this, 1617, 49, textureX, textureY); // Import Box218
		gunModel[199] = new ModelRendererTurbo(this, 1625, 49, textureX, textureY); // Import Box219
		gunModel[200] = new ModelRendererTurbo(this, 1633, 49, textureX, textureY); // Import Box224
		gunModel[201] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Import Box225
		gunModel[202] = new ModelRendererTurbo(this, 1649, 49, textureX, textureY); // Import Box226
		gunModel[203] = new ModelRendererTurbo(this, 1657, 49, textureX, textureY); // Import Box227
		gunModel[204] = new ModelRendererTurbo(this, 1665, 49, textureX, textureY); // Import Box228
		gunModel[205] = new ModelRendererTurbo(this, 1673, 49, textureX, textureY); // Import Box229
		gunModel[206] = new ModelRendererTurbo(this, 1681, 49, textureX, textureY); // Import Box230
		gunModel[207] = new ModelRendererTurbo(this, 1689, 49, textureX, textureY); // Import Box231
		gunModel[208] = new ModelRendererTurbo(this, 1697, 49, textureX, textureY); // Import Box232
		gunModel[209] = new ModelRendererTurbo(this, 1705, 49, textureX, textureY); // Import Box233
		gunModel[210] = new ModelRendererTurbo(this, 1713, 49, textureX, textureY); // Import Box234
		gunModel[211] = new ModelRendererTurbo(this, 1721, 49, textureX, textureY); // Import Box235
		gunModel[212] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Import Box236
		gunModel[213] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Import Box237
		gunModel[214] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Import Box250
		gunModel[215] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box251
		gunModel[216] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Box252
		gunModel[217] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box253
		gunModel[218] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box254
		gunModel[219] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box256
		gunModel[220] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import Box257
		gunModel[221] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import Box258
		gunModel[222] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import Box259
		gunModel[223] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import Box260
		gunModel[224] = new ModelRendererTurbo(this, 1785, 49, textureX, textureY); // Import Box261
		gunModel[225] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Import Box262
		gunModel[226] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import Box263
		gunModel[227] = new ModelRendererTurbo(this, 1841, 49, textureX, textureY); // Import Box264
		gunModel[228] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import Box265
		gunModel[229] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import Box266
		gunModel[230] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import Box267
		gunModel[231] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box268
		gunModel[232] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import Box269
		gunModel[233] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Box270
		gunModel[234] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box271
		gunModel[235] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box272
		gunModel[236] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box273
		gunModel[237] = new ModelRendererTurbo(this, 2033, 49, textureX, textureY); // Import Box274
		gunModel[238] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import Box275
		gunModel[239] = new ModelRendererTurbo(this, 1897, 49, textureX, textureY); // Import Box276
		gunModel[240] = new ModelRendererTurbo(this, 1953, 49, textureX, textureY); // Import Box277
		gunModel[241] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Import Box278
		gunModel[242] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Import Box279
		gunModel[243] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import Box280
		gunModel[244] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Import Box281
		gunModel[245] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import Box282
		gunModel[246] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Import Box283
		gunModel[247] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import Box284
		gunModel[248] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Import Box286
		gunModel[249] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Import Box287
		gunModel[250] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Import Box288
		gunModel[251] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Import Box290
		gunModel[252] = new ModelRendererTurbo(this, 1465, 25, textureX, textureY); // Import Box291
		gunModel[253] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import Box292
		gunModel[254] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Import Box293
		gunModel[255] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Import Box294
		gunModel[256] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import Box295
		gunModel[257] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import Box296
		gunModel[258] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Import Box297
		gunModel[259] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import Box298
		gunModel[260] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Import Box299
		gunModel[261] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Import Box300
		gunModel[262] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Import Box301
		gunModel[263] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Import Box302
		gunModel[264] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import Box303
		gunModel[265] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Import Box304
		gunModel[266] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Box305
		gunModel[267] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Import Box306
		gunModel[268] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Import Box307
		gunModel[269] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Import Box308
		gunModel[270] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Import Box309
		gunModel[271] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import Box310
		gunModel[272] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Import Box311
		gunModel[273] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Import Box312
		gunModel[274] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Import Box313
		gunModel[275] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Import Box314
		gunModel[276] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Import Box315
		gunModel[277] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import Box316
		gunModel[278] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Import Box317
		gunModel[279] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Import Box318
		gunModel[280] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import Box319
		gunModel[281] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Import Box320
		gunModel[282] = new ModelRendererTurbo(this, 1537, 57, textureX, textureY); // Import Box356
		gunModel[283] = new ModelRendererTurbo(this, 1625, 57, textureX, textureY); // Import Box358
		gunModel[284] = new ModelRendererTurbo(this, 1713, 57, textureX, textureY); // Import Box359
		gunModel[285] = new ModelRendererTurbo(this, 1513, 57, textureX, textureY); // Import Box360
		gunModel[286] = new ModelRendererTurbo(this, 1225, 57, textureX, textureY); // Import Box419
		gunModel[287] = new ModelRendererTurbo(this, 1801, 57, textureX, textureY); // Import Box420
		gunModel[288] = new ModelRendererTurbo(this, 1809, 57, textureX, textureY); // Import Box421
		gunModel[289] = new ModelRendererTurbo(this, 1817, 57, textureX, textureY); // Import Box422
		gunModel[290] = new ModelRendererTurbo(this, 1825, 57, textureX, textureY); // Import Box423
		gunModel[291] = new ModelRendererTurbo(this, 1833, 57, textureX, textureY); // Import Box424
		gunModel[292] = new ModelRendererTurbo(this, 1841, 57, textureX, textureY); // Import Box425
		gunModel[293] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Import Box426
		gunModel[294] = new ModelRendererTurbo(this, 1929, 57, textureX, textureY); // Import Box428
		gunModel[295] = new ModelRendererTurbo(this, 1961, 57, textureX, textureY); // Import Box429
		gunModel[296] = new ModelRendererTurbo(this, 1993, 57, textureX, textureY); // Import Box430
		gunModel[297] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box431
		gunModel[298] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box432
		gunModel[299] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import Box433
		gunModel[300] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box434
		gunModel[301] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import Box443
		gunModel[302] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import Box444
		gunModel[303] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import Box445
		gunModel[304] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import Box446
		gunModel[305] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box447
		gunModel[306] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Import Box448
		gunModel[307] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Import Box431
		gunModel[308] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Import Box432
		gunModel[309] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import Box433
		gunModel[310] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Import Box434
		gunModel[311] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Import Box435
		gunModel[312] = new ModelRendererTurbo(this, 1489, 25, textureX, textureY); // Import Box441
		gunModel[313] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Import Box443
		gunModel[314] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Import Box444
		gunModel[315] = new ModelRendererTurbo(this, 1513, 25, textureX, textureY); // Import Box445
		gunModel[316] = new ModelRendererTurbo(this, 1897, 25, textureX, textureY); // Import Box446
		gunModel[317] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Import Box447
		gunModel[318] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Import Box448
		gunModel[319] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Import Box449
		gunModel[320] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box450
		gunModel[321] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import Box451
		gunModel[322] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Import Box452
		gunModel[323] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Import Box453
		gunModel[324] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Import Box454
		gunModel[325] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import Box455
		gunModel[326] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Import Box456
		gunModel[327] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Import Box457
		gunModel[328] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Import Box458
		gunModel[329] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box459
		gunModel[330] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Import Box460
		gunModel[331] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Import Box461
		gunModel[332] = new ModelRendererTurbo(this, 1113, 65, textureX, textureY); // Import Box463
		gunModel[333] = new ModelRendererTurbo(this, 1137, 65, textureX, textureY); // Import Box461
		gunModel[334] = new ModelRendererTurbo(this, 1241, 65, textureX, textureY); // Import Box462
		gunModel[335] = new ModelRendererTurbo(this, 1345, 65, textureX, textureY); // Import Box463
		gunModel[336] = new ModelRendererTurbo(this, 1449, 65, textureX, textureY); // Import Box464
		gunModel[337] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Import Box465
		gunModel[338] = new ModelRendererTurbo(this, 1657, 65, textureX, textureY); // Import Box466
		gunModel[339] = new ModelRendererTurbo(this, 1753, 65, textureX, textureY); // Import Box467
		gunModel[340] = new ModelRendererTurbo(this, 1785, 65, textureX, textureY); // Import Box468
		gunModel[341] = new ModelRendererTurbo(this, 1809, 65, textureX, textureY); // Import Box469
		gunModel[342] = new ModelRendererTurbo(this, 1841, 65, textureX, textureY); // Import Box470
		gunModel[343] = new ModelRendererTurbo(this, 1873, 65, textureX, textureY); // Import Box471
		gunModel[344] = new ModelRendererTurbo(this, 1921, 65, textureX, textureY); // Import Box472
		gunModel[345] = new ModelRendererTurbo(this, 1945, 65, textureX, textureY); // Import Box473
		gunModel[346] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Import Box474
		gunModel[347] = new ModelRendererTurbo(this, 1993, 65, textureX, textureY); // Import Box475
		gunModel[348] = new ModelRendererTurbo(this, 2009, 65, textureX, textureY); // Import Box476
		gunModel[349] = new ModelRendererTurbo(this, 2025, 65, textureX, textureY); // Import Box477
		gunModel[350] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Import Box478
		gunModel[351] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box475
		gunModel[352] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box476
		gunModel[353] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box477
		gunModel[354] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import Box478
		gunModel[355] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import Box479
		gunModel[356] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Import Box480
		gunModel[357] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import Box481
		gunModel[358] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import Box482
		gunModel[359] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import Box484
		gunModel[360] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box486
		gunModel[361] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import Box487
		gunModel[362] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box488
		gunModel[363] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Box489
		gunModel[364] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import Box491
		gunModel[365] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box492
		gunModel[366] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import Box493
		gunModel[367] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import Box494
		gunModel[368] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box495
		gunModel[369] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box496
		gunModel[370] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box497
		gunModel[371] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box498
		gunModel[372] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Import Box499
		gunModel[373] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Import Box500
		gunModel[374] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Import Box501
		gunModel[375] = new ModelRendererTurbo(this, 1233, 65, textureX, textureY); // Import Box502
		gunModel[376] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Import Box503
		gunModel[377] = new ModelRendererTurbo(this, 1441, 65, textureX, textureY); // Import Box504
		gunModel[378] = new ModelRendererTurbo(this, 1545, 65, textureX, textureY); // Import Box505
		gunModel[379] = new ModelRendererTurbo(this, 1649, 65, textureX, textureY); // Import Box506
		gunModel[380] = new ModelRendererTurbo(this, 2041, 65, textureX, textureY); // Import Box507
		gunModel[381] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Box508
		gunModel[382] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box509
		gunModel[383] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Import Box510
		gunModel[384] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Import Box511
		gunModel[385] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Import Box512
		gunModel[386] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Import Box513
		gunModel[387] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Import Box514
		gunModel[388] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Import Box515
		gunModel[389] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Import Box516
		gunModel[390] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Import Box517
		gunModel[391] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import Box518
		gunModel[392] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Import Box519
		gunModel[393] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Import Box520
		gunModel[394] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Import Box524
		gunModel[395] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Import Box526
		gunModel[396] = new ModelRendererTurbo(this, 1105, 65, textureX, textureY); // Import Box527
		gunModel[397] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Import Box528
		gunModel[398] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Import Box529
		gunModel[399] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Import Box522
		gunModel[400] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Import Box523
		gunModel[401] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import Box524
		gunModel[402] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Import Box525
		gunModel[403] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Import Box526
		gunModel[404] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Import Box527
		gunModel[405] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Import Box528
		gunModel[406] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Import Box529
		gunModel[407] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Import Box530
		gunModel[408] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Import Box531
		gunModel[409] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Import Box532
		gunModel[410] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import Box533
		gunModel[411] = new ModelRendererTurbo(this, 1241, 65, textureX, textureY); // Import Box538
		gunModel[412] = new ModelRendererTurbo(this, 1105, 73, textureX, textureY); // Import Box541
		gunModel[413] = new ModelRendererTurbo(this, 1185, 73, textureX, textureY); // Import Box545
		gunModel[414] = new ModelRendererTurbo(this, 1201, 73, textureX, textureY); // Import Box546
		gunModel[415] = new ModelRendererTurbo(this, 1217, 73, textureX, textureY); // Import Box547
		gunModel[416] = new ModelRendererTurbo(this, 1233, 73, textureX, textureY); // Import Box548
		gunModel[417] = new ModelRendererTurbo(this, 1249, 73, textureX, textureY); // Import Box549
		gunModel[418] = new ModelRendererTurbo(this, 1825, 73, textureX, textureY); // Import Box571
		gunModel[419] = new ModelRendererTurbo(this, 1849, 73, textureX, textureY); // Import Box572
		gunModel[420] = new ModelRendererTurbo(this, 1873, 73, textureX, textureY); // Import Box573
		gunModel[421] = new ModelRendererTurbo(this, 1897, 73, textureX, textureY); // Import Box574
		gunModel[422] = new ModelRendererTurbo(this, 1921, 73, textureX, textureY); // Import Box575
		gunModel[423] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Import Box576
		gunModel[424] = new ModelRendererTurbo(this, 1969, 73, textureX, textureY); // Import Box577
		gunModel[425] = new ModelRendererTurbo(this, 1993, 73, textureX, textureY); // Import Box578
		gunModel[426] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Import Box579
		gunModel[427] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box580
		gunModel[428] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import Box581
		gunModel[429] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Box582
		gunModel[430] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import Box583
		gunModel[431] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box584
		gunModel[432] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box585
		gunModel[433] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import Box586
		gunModel[434] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box587
		gunModel[435] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box588
		gunModel[436] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import Box589
		gunModel[437] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Box590
		gunModel[438] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Import Box591
		gunModel[439] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box592
		gunModel[440] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Import Box593
		gunModel[441] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import Box594
		gunModel[442] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import Box595
		gunModel[443] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box596
		gunModel[444] = new ModelRendererTurbo(this, 2041, 73, textureX, textureY); // Import Box597
		gunModel[445] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import Box598
		gunModel[446] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box599
		gunModel[447] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import Box600
		gunModel[448] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box601
		gunModel[449] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Import Box602
		gunModel[450] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Import Box603
		gunModel[451] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Import Box604
		gunModel[452] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import Box605
		gunModel[453] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Import Box606
		gunModel[454] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import Box607
		gunModel[455] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Import Box608
		gunModel[456] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Import Box609
		gunModel[457] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Import Box610
		gunModel[458] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import Box611
		gunModel[459] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Import Box612
		gunModel[460] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Import Box613
		gunModel[461] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Import Box614
		gunModel[462] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Import Box615
		gunModel[463] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Import Box616
		gunModel[464] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Import Box617
		gunModel[465] = new ModelRendererTurbo(this, 1913, 65, textureX, textureY); // Import Box360
		gunModel[466] = new ModelRendererTurbo(this, 1985, 65, textureX, textureY); // Import Box360
		gunModel[467] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box360
		gunModel[468] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import Box360
		gunModel[469] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import Box360
		gunModel[470] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import Box360
		gunModel[471] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import Box360
		gunModel[472] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Box360
		gunModel[473] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Import Box360
		gunModel[474] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import Box360
		gunModel[475] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Box360
		gunModel[476] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box360
		gunModel[477] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import Box360
		gunModel[478] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Import Box360
		gunModel[479] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Import Box360
		gunModel[480] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Box360
		gunModel[481] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Import Box360
		gunModel[482] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Import Box360
		gunModel[483] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Import Box360
		gunModel[484] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Import Box360
		gunModel[485] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box360
		gunModel[486] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import Box360
		gunModel[487] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Import Box360
		gunModel[488] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import Box360
		gunModel[489] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Import Box360
		gunModel[490] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Import Box638
		gunModel[491] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Import Box639
		gunModel[492] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import Box640
		gunModel[493] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Import Box641
		gunModel[494] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import Box642
		gunModel[495] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Import Box643
		gunModel[496] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Import Box644
		gunModel[497] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import Box645
		gunModel[498] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Import Box646
		gunModel[499] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import Box647

		gunModel[0].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box22
		gunModel[0].setRotationPoint(166F, -18F, 0F);

		gunModel[1].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box23
		gunModel[1].setRotationPoint(166F, -18F, 0F);
		gunModel[1].rotateAngleX = 0.27925268F;

		gunModel[2].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box24
		gunModel[2].setRotationPoint(166F, -18F, 0F);
		gunModel[2].rotateAngleX = 0.55850536F;

		gunModel[3].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box25
		gunModel[3].setRotationPoint(166F, -18F, 0F);
		gunModel[3].rotateAngleX = 0.83775804F;

		gunModel[4].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box26
		gunModel[4].setRotationPoint(166F, -18F, 0F);
		gunModel[4].rotateAngleX = 1.11701072F;

		gunModel[5].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box27
		gunModel[5].setRotationPoint(166F, -18F, 0F);
		gunModel[5].rotateAngleX = 1.3962634F;

		gunModel[6].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box28
		gunModel[6].setRotationPoint(166F, -18F, 0F);
		gunModel[6].rotateAngleX = 1.67551608F;

		gunModel[7].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box29
		gunModel[7].setRotationPoint(166F, -18F, 0F);
		gunModel[7].rotateAngleX = 1.95476876F;

		gunModel[8].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box30
		gunModel[8].setRotationPoint(166F, -18F, 0F);
		gunModel[8].rotateAngleX = 2.23402144F;

		gunModel[9].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box31
		gunModel[9].setRotationPoint(166F, -18F, 0F);
		gunModel[9].rotateAngleX = 2.51327412F;

		gunModel[10].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box32
		gunModel[10].setRotationPoint(166F, -18F, 0F);
		gunModel[10].rotateAngleX = 2.7925268F;

		gunModel[11].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box33
		gunModel[11].setRotationPoint(166F, -18F, 0F);
		gunModel[11].rotateAngleX = 2.86233997F;

		gunModel[12].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box34
		gunModel[12].setRotationPoint(166F, -23F, 0F);

		gunModel[13].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box35
		gunModel[13].setRotationPoint(166F, -23F, 0F);
		gunModel[13].rotateAngleX = 0.27925268F;

		gunModel[14].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box36
		gunModel[14].setRotationPoint(166F, -23F, 0F);
		gunModel[14].rotateAngleX = 0.55850536F;

		gunModel[15].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box37
		gunModel[15].setRotationPoint(166F, -23F, 0F);
		gunModel[15].rotateAngleX = 0.83775804F;

		gunModel[16].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box38
		gunModel[16].setRotationPoint(166F, -23F, 0F);
		gunModel[16].rotateAngleX = 1.11701072F;

		gunModel[17].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box39
		gunModel[17].setRotationPoint(166F, -23F, 0F);
		gunModel[17].rotateAngleX = 1.3962634F;

		gunModel[18].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box40
		gunModel[18].setRotationPoint(166F, -23F, 0F);
		gunModel[18].rotateAngleX = 1.67551608F;

		gunModel[19].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box41
		gunModel[19].setRotationPoint(166F, -23F, 0F);
		gunModel[19].rotateAngleX = 1.95476876F;

		gunModel[20].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box42
		gunModel[20].setRotationPoint(166F, -23F, 0F);
		gunModel[20].rotateAngleX = 2.23402144F;

		gunModel[21].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box43
		gunModel[21].setRotationPoint(166F, -23F, 0F);
		gunModel[21].rotateAngleX = 2.51327412F;

		gunModel[22].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box44
		gunModel[22].setRotationPoint(166F, -23F, 0F);
		gunModel[22].rotateAngleX = 2.7925268F;

		gunModel[23].addBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F); // Import Box45
		gunModel[23].setRotationPoint(166F, -23F, 0F);
		gunModel[23].rotateAngleX = 2.86233997F;

		gunModel[24].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box46
		gunModel[24].setRotationPoint(167F, -23F, 0F);

		gunModel[25].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box47
		gunModel[25].setRotationPoint(167F, -23F, 0F);
		gunModel[25].rotateAngleX = 0.27925268F;

		gunModel[26].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box48
		gunModel[26].setRotationPoint(167F, -23F, 0F);
		gunModel[26].rotateAngleX = 0.55850536F;

		gunModel[27].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box49
		gunModel[27].setRotationPoint(167F, -23F, 0F);
		gunModel[27].rotateAngleX = 0.83775804F;

		gunModel[28].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box50
		gunModel[28].setRotationPoint(167F, -23F, 0F);
		gunModel[28].rotateAngleX = 1.11701072F;

		gunModel[29].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box51
		gunModel[29].setRotationPoint(167F, -23F, 0F);
		gunModel[29].rotateAngleX = 1.3962634F;

		gunModel[30].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box52
		gunModel[30].setRotationPoint(167F, -23F, 0F);
		gunModel[30].rotateAngleX = 1.67551608F;

		gunModel[31].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box53
		gunModel[31].setRotationPoint(167F, -23F, 0F);
		gunModel[31].rotateAngleX = 1.95476876F;

		gunModel[32].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box54
		gunModel[32].setRotationPoint(167F, -23F, 0F);
		gunModel[32].rotateAngleX = 2.23402144F;

		gunModel[33].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box55
		gunModel[33].setRotationPoint(167F, -23F, 0F);
		gunModel[33].rotateAngleX = 2.51327412F;

		gunModel[34].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box56
		gunModel[34].setRotationPoint(167F, -23F, 0F);
		gunModel[34].rotateAngleX = 2.7925268F;

		gunModel[35].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box57
		gunModel[35].setRotationPoint(167F, -23F, 0F);
		gunModel[35].rotateAngleX = 2.86233997F;

		gunModel[36].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box58
		gunModel[36].setRotationPoint(165F, -23F, 0F);

		gunModel[37].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box59
		gunModel[37].setRotationPoint(165F, -23F, 0F);
		gunModel[37].rotateAngleX = 0.27925268F;

		gunModel[38].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box60
		gunModel[38].setRotationPoint(165F, -23F, 0F);
		gunModel[38].rotateAngleX = 0.55850536F;

		gunModel[39].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box61
		gunModel[39].setRotationPoint(165F, -23F, 0F);
		gunModel[39].rotateAngleX = 0.83775804F;

		gunModel[40].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box62
		gunModel[40].setRotationPoint(165F, -23F, 0F);
		gunModel[40].rotateAngleX = 1.11701072F;

		gunModel[41].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box63
		gunModel[41].setRotationPoint(165F, -23F, 0F);
		gunModel[41].rotateAngleX = 1.3962634F;

		gunModel[42].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box64
		gunModel[42].setRotationPoint(165F, -23F, 0F);
		gunModel[42].rotateAngleX = 1.67551608F;

		gunModel[43].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box65
		gunModel[43].setRotationPoint(165F, -23F, 0F);
		gunModel[43].rotateAngleX = 1.95476876F;

		gunModel[44].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box66
		gunModel[44].setRotationPoint(165F, -23F, 0F);
		gunModel[44].rotateAngleX = 2.23402144F;

		gunModel[45].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box67
		gunModel[45].setRotationPoint(165F, -23F, 0F);
		gunModel[45].rotateAngleX = 2.51327412F;

		gunModel[46].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box68
		gunModel[46].setRotationPoint(165F, -23F, 0F);
		gunModel[46].rotateAngleX = 2.86233997F;

		gunModel[47].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box69
		gunModel[47].setRotationPoint(165F, -23F, 0F);
		gunModel[47].rotateAngleX = 2.7925268F;

		gunModel[48].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box70
		gunModel[48].setRotationPoint(167F, -18F, 0F);

		gunModel[49].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box71
		gunModel[49].setRotationPoint(167F, -18F, 0F);
		gunModel[49].rotateAngleX = 0.27925268F;

		gunModel[50].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box72
		gunModel[50].setRotationPoint(167F, -18F, 0F);
		gunModel[50].rotateAngleX = 0.55850536F;

		gunModel[51].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box73
		gunModel[51].setRotationPoint(167F, -18F, 0F);
		gunModel[51].rotateAngleX = 0.83775804F;

		gunModel[52].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box74
		gunModel[52].setRotationPoint(167F, -18F, 0F);
		gunModel[52].rotateAngleX = 1.11701072F;

		gunModel[53].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box75
		gunModel[53].setRotationPoint(167F, -18F, 0F);
		gunModel[53].rotateAngleX = 1.3962634F;

		gunModel[54].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box76
		gunModel[54].setRotationPoint(167F, -18F, 0F);
		gunModel[54].rotateAngleX = 1.67551608F;

		gunModel[55].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box77
		gunModel[55].setRotationPoint(167F, -18F, 0F);
		gunModel[55].rotateAngleX = 1.95476876F;

		gunModel[56].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box78
		gunModel[56].setRotationPoint(167F, -18F, 0F);
		gunModel[56].rotateAngleX = 2.23402144F;

		gunModel[57].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box79
		gunModel[57].setRotationPoint(167F, -18F, 0F);
		gunModel[57].rotateAngleX = 2.51327412F;

		gunModel[58].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box80
		gunModel[58].setRotationPoint(167F, -18F, 0F);
		gunModel[58].rotateAngleX = 2.7925268F;

		gunModel[59].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Import Box81
		gunModel[59].setRotationPoint(167F, -18F, 0F);
		gunModel[59].rotateAngleX = 2.86233997F;

		gunModel[60].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box82
		gunModel[60].setRotationPoint(165F, -18F, 0F);

		gunModel[61].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box83
		gunModel[61].setRotationPoint(165F, -18F, 0F);
		gunModel[61].rotateAngleX = 0.27925268F;

		gunModel[62].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box84
		gunModel[62].setRotationPoint(165F, -18F, 0F);
		gunModel[62].rotateAngleX = 0.55850536F;

		gunModel[63].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box85
		gunModel[63].setRotationPoint(165F, -18F, 0F);
		gunModel[63].rotateAngleX = 0.83775804F;

		gunModel[64].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box86
		gunModel[64].setRotationPoint(165F, -18F, 0F);
		gunModel[64].rotateAngleX = 1.11701072F;

		gunModel[65].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box87
		gunModel[65].setRotationPoint(165F, -18F, 0F);
		gunModel[65].rotateAngleX = 1.3962634F;

		gunModel[66].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box88
		gunModel[66].setRotationPoint(165F, -18F, 0F);
		gunModel[66].rotateAngleX = 1.67551608F;

		gunModel[67].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box89
		gunModel[67].setRotationPoint(165F, -18F, 0F);
		gunModel[67].rotateAngleX = 1.95476876F;

		gunModel[68].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box90
		gunModel[68].setRotationPoint(165F, -18F, 0F);
		gunModel[68].rotateAngleX = 2.23402144F;

		gunModel[69].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box91
		gunModel[69].setRotationPoint(165F, -18F, 0F);
		gunModel[69].rotateAngleX = 2.51327412F;

		gunModel[70].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box92
		gunModel[70].setRotationPoint(165F, -18F, 0F);
		gunModel[70].rotateAngleX = 2.7925268F;

		gunModel[71].addShapeBox(0F, -3.5F, -0.5F, 1, 7, 1, 0F,0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F, 0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.05F); // Import Box93
		gunModel[71].setRotationPoint(165F, -18F, 0F);
		gunModel[71].rotateAngleX = 2.86233997F;

		gunModel[72].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Import Box94
		gunModel[72].setRotationPoint(166F, -21F, -3F);

		gunModel[73].addShapeBox(0F, 0.5F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F); // Import Box95
		gunModel[73].setRotationPoint(161F, -27F, -1F);

		gunModel[74].addShapeBox(0F, 0.5F, 0F, 2, 2, 2, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box96
		gunModel[74].setRotationPoint(161F, -27F, -1F);

		gunModel[75].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,-0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Import Box97
		gunModel[75].setRotationPoint(161.5F, -28F, -1F);

		gunModel[76].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,-0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Import Box98
		gunModel[76].setRotationPoint(161.5F, -29F, -1F);

		gunModel[77].addShapeBox(0F, 0.5F, 0.5F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F); // Import Box99
		gunModel[77].setRotationPoint(161.5F, -29F, -1F);

		gunModel[78].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box100
		gunModel[78].setRotationPoint(115F, -18F, 0F);

		gunModel[79].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box101
		gunModel[79].setRotationPoint(115F, -18F, 0F);
		gunModel[79].rotateAngleX = 0.17453293F;

		gunModel[80].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box102
		gunModel[80].setRotationPoint(115F, -18F, 0F);
		gunModel[80].rotateAngleX = 0.34906585F;

		gunModel[81].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box103
		gunModel[81].setRotationPoint(115F, -18F, 0F);
		gunModel[81].rotateAngleX = -0.17453293F;

		gunModel[82].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box104
		gunModel[82].setRotationPoint(115F, -18F, 0F);
		gunModel[82].rotateAngleX = -0.34906585F;

		gunModel[83].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box105
		gunModel[83].setRotationPoint(115F, -18F, 0F);
		gunModel[83].rotateAngleX = -0.52359878F;

		gunModel[84].addBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F); // Import Box106
		gunModel[84].setRotationPoint(115F, -18F, 0F);
		gunModel[84].rotateAngleX = 0.52359878F;

		gunModel[85].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		gunModel[85].setRotationPoint(115F, -18F, 0F);
		gunModel[85].rotateAngleX = -0.6981317F;

		gunModel[86].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box108
		gunModel[86].setRotationPoint(115F, -18F, 0F);
		gunModel[86].rotateAngleX = 0.6981317F;

		gunModel[87].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box109
		gunModel[87].setRotationPoint(115F, -18F, 0F);
		gunModel[87].rotateAngleX = -0.89011792F;

		gunModel[88].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box110
		gunModel[88].setRotationPoint(115F, -18F, 0F);
		gunModel[88].rotateAngleX = 0.89011792F;

		gunModel[89].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Import Box111
		gunModel[89].setRotationPoint(115F, -18F, 0F);
		gunModel[89].rotateAngleX = -1.08210414F;

		gunModel[90].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Import Box112
		gunModel[90].setRotationPoint(115F, -18F, 0F);
		gunModel[90].rotateAngleX = 1.08210414F;

		gunModel[91].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Import Box113
		gunModel[91].setRotationPoint(115F, -18F, 0F);
		gunModel[91].rotateAngleX = -1.29154365F;

		gunModel[92].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F); // Import Box114
		gunModel[92].setRotationPoint(115F, -18F, 0F);
		gunModel[92].rotateAngleX = 1.29154365F;

		gunModel[93].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F); // Import Box115
		gunModel[93].setRotationPoint(115F, -18F, 0F);
		gunModel[93].rotateAngleX = 1.29154365F;

		gunModel[94].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F); // Import Box116
		gunModel[94].setRotationPoint(115F, -18F, 0F);
		gunModel[94].rotateAngleX = -1.51843645F;

		gunModel[95].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Import Box117
		gunModel[95].setRotationPoint(115F, -18F, 0F);
		gunModel[95].rotateAngleX = 1.51843645F;

		gunModel[96].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F); // Import Box118
		gunModel[96].setRotationPoint(115F, -18F, 0F);
		gunModel[96].rotateAngleX = 1.76278254F;

		gunModel[97].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Import Box119
		gunModel[97].setRotationPoint(115F, -18F, 0F);
		gunModel[97].rotateAngleX = -1.76278254F;

		gunModel[98].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Import Box120
		gunModel[98].setRotationPoint(115F, -18F, 0F);
		gunModel[98].rotateAngleX = -1.76278254F;

		gunModel[99].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 1F, 0F, -1.6F, 1F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box121
		gunModel[99].setRotationPoint(115F, -19F, 0F);
		gunModel[99].rotateAngleX = -2.02458193F;

		gunModel[100].addShapeBox(0F, -3.5F, -1.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.6F, 1F, 0F, -1.6F, 1F); // Import Box122
		gunModel[100].setRotationPoint(115F, -19F, 0F);
		gunModel[100].rotateAngleX = 2.00712864F;

		gunModel[101].addBox(0F, 0.5F, 0F, 2, 2, 6, 0F); // Import Box123
		gunModel[101].setRotationPoint(115F, -21.7F, -3F);

		gunModel[102].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box124
		gunModel[102].setRotationPoint(114F, -18F, 0F);

		gunModel[103].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box125
		gunModel[103].setRotationPoint(114F, -18F, 0F);
		gunModel[103].rotateAngleX = 0.17453293F;

		gunModel[104].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box126
		gunModel[104].setRotationPoint(114F, -18F, 0F);
		gunModel[104].rotateAngleX = 0.34906585F;

		gunModel[105].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box127
		gunModel[105].setRotationPoint(114F, -18F, 0F);
		gunModel[105].rotateAngleX = 0.52359878F;

		gunModel[106].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0.05F); // Import Box128
		gunModel[106].setRotationPoint(114F, -18F, 0F);
		gunModel[106].rotateAngleX = 0.6981317F;

		gunModel[107].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box129
		gunModel[107].setRotationPoint(114F, -18F, 0F);
		gunModel[107].rotateAngleX = -0.17453293F;

		gunModel[108].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box130
		gunModel[108].setRotationPoint(114F, -18F, 0F);
		gunModel[108].rotateAngleX = -0.34906585F;

		gunModel[109].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box131
		gunModel[109].setRotationPoint(114F, -18F, 0F);
		gunModel[109].rotateAngleX = -0.52359878F;

		gunModel[110].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.05F); // Import Box132
		gunModel[110].setRotationPoint(114F, -18F, 0F);
		gunModel[110].rotateAngleX = -0.6981317F;

		gunModel[111].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.05F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0.05F); // Import Box135
		gunModel[111].setRotationPoint(114F, -18F, 0F);
		gunModel[111].rotateAngleX = -0.89011792F;

		gunModel[112].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0.05F); // Import Box136
		gunModel[112].setRotationPoint(114F, -18F, 0F);
		gunModel[112].rotateAngleX = -1.08210414F;

		gunModel[113].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.05F, 0F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, 0.05F); // Import Box137
		gunModel[113].setRotationPoint(114F, -18F, 0F);
		gunModel[113].rotateAngleX = -1.29154365F;

		gunModel[114].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.05F, 0F, -1.4F, 0F, 0F, -1.2F, 0F, 0F, -0.7F, 0.05F); // Import Box138
		gunModel[114].setRotationPoint(114F, -18F, 0F);
		gunModel[114].rotateAngleX = -1.51843645F;

		gunModel[115].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.05F, 0F, -1.6F, 0F, 0F, -1.4F, 0F, 0F, -0.9F, 0.05F); // Import Box139
		gunModel[115].setRotationPoint(114F, -18F, 0F);
		gunModel[115].rotateAngleX = -1.76278254F;

		gunModel[116].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0.05F); // Import Box140
		gunModel[116].setRotationPoint(114F, -18F, 0F);
		gunModel[116].rotateAngleX = 0.89011792F;

		gunModel[117].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.05F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, 0.05F); // Import Box141
		gunModel[117].setRotationPoint(114F, -18F, 0F);
		gunModel[117].rotateAngleX = 1.08210414F;

		gunModel[118].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.7F, 0.05F); // Import Box142
		gunModel[118].setRotationPoint(114F, -18F, 0F);
		gunModel[118].rotateAngleX = 1.29154365F;

		gunModel[119].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.05F, 0F, -1.2F, 0F, 0F, -1.4F, 0F, 0F, -0.9F, 0.05F); // Import Box143
		gunModel[119].setRotationPoint(114F, -18F, 0F);
		gunModel[119].rotateAngleX = 1.51843645F;

		gunModel[120].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.05F, 0F, -1.4F, 0F, 0F, -1.6F, 0F, 0F, -1.1F, 0.05F); // Import Box144
		gunModel[120].setRotationPoint(114F, -18F, 0F);
		gunModel[120].rotateAngleX = 1.76278254F;

		gunModel[121].addShapeBox(0F, -3.5F, -1.5F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -2F, 0F, 0F, -1.6F, 1F, 0F, -1.1F, 1F); // Import Box145
		gunModel[121].setRotationPoint(114F, -19F, 0F);
		gunModel[121].rotateAngleX = 2.00712864F;

		gunModel[122].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1F, 0F, -1.6F, 1F, 0F, -2F, 0F, 0F, -1.5F, 0.1F); // Import Box147
		gunModel[122].setRotationPoint(114F, -19F, 0F);
		gunModel[122].rotateAngleX = -2.02458193F;

		gunModel[123].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F); // Import Box148
		gunModel[123].setRotationPoint(46F, -18F, 0F);

		gunModel[124].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.15F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 1F, 0.05F); // Import Box149
		gunModel[124].setRotationPoint(46F, -18F, 0F);
		gunModel[124].rotateAngleX = -0.15707963F;

		gunModel[125].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.15F); // Import Box152
		gunModel[125].setRotationPoint(46F, -18F, 0F);
		gunModel[125].rotateAngleX = -0.34906585F;

		gunModel[126].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.15F); // Import Box153
		gunModel[126].setRotationPoint(46F, -18F, 0F);
		gunModel[126].rotateAngleX = -0.52359878F;

		gunModel[127].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0.05F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.15F); // Import Box154
		gunModel[127].setRotationPoint(46F, -18F, 0F);
		gunModel[127].rotateAngleX = -0.6981317F;

		gunModel[128].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.05F, 0F, 0.3F, 0.1F, 0F, 0.8F, 0.25F); // Import Box155
		gunModel[128].setRotationPoint(46F, -18F, 0F);
		gunModel[128].rotateAngleX = -0.89011792F;

		gunModel[129].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F); // Import Box157
		gunModel[129].setRotationPoint(46F, -18F, 0F);
		gunModel[129].rotateAngleX = 0.17453293F;

		gunModel[130].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F); // Import Box158
		gunModel[130].setRotationPoint(46F, -18F, 0F);
		gunModel[130].rotateAngleX = 0.34906585F;

		gunModel[131].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F); // Import Box159
		gunModel[131].setRotationPoint(46F, -18F, 0F);
		gunModel[131].rotateAngleX = 0.52359878F;

		gunModel[132].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.05F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.8F, 0.05F); // Import Box160
		gunModel[132].setRotationPoint(46F, -18F, 0F);
		gunModel[132].rotateAngleX = 0.6981317F;

		gunModel[133].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0.25F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.05F, 0F, 0.2F, 0.1F); // Import Box162
		gunModel[133].setRotationPoint(46F, -18F, 0F);
		gunModel[133].rotateAngleX = 0.90757121F;

		gunModel[134].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.05F, 0F, 0.1F, 0.1F, 0F, -0.3F, 0.05F, 0F, -0.2F, 0.1F); // Import Box163
		gunModel[134].setRotationPoint(46F, -18F, 0F);
		gunModel[134].rotateAngleX = 1.09955743F;

		gunModel[135].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.3F, 0.05F, 0F, 0.1F, 0.1F, 0F, 0.25F, 0.05F); // Import Box164
		gunModel[135].setRotationPoint(46F, -18F, 0F);
		gunModel[135].rotateAngleX = -1.08210414F;

		gunModel[136].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.1F, 0F, -0.7F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.15F, 0.05F); // Import Box165
		gunModel[136].setRotationPoint(46F, -18F, 0F);
		gunModel[136].rotateAngleX = -1.29154365F;

		gunModel[137].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.7F, 0.05F, 0F, -0.6F, 0.1F); // Import Box166
		gunModel[137].setRotationPoint(46F, -18F, 0F);
		gunModel[137].rotateAngleX = 1.30899694F;

		gunModel[138].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0.05F, 0F, -0.7F, 0.1F, 0F, -0.9F, 0.05F, 0F, -0.8F, 0.1F); // Import Box167
		gunModel[138].setRotationPoint(46F, -18F, 0F);
		gunModel[138].rotateAngleX = 1.53588974F;

		gunModel[139].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.1F, 0F, -0.9F, 0.05F, 0F, -0.7F, 0.1F, 0F, -0.55F, 0.05F); // Import Box168
		gunModel[139].setRotationPoint(46F, -18F, 0F);
		gunModel[139].rotateAngleX = -1.51843645F;

		gunModel[140].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.1F, 0F, -1.1F, 0.05F, 0F, -0.9F, 0.1F, 0F, -0.75F, 0.05F); // Import Box169
		gunModel[140].setRotationPoint(46F, -18F, 0F);
		gunModel[140].rotateAngleX = -1.76278254F;

		gunModel[141].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.05F, 0F, -0.9F, 0.1F, 0F, -1.1F, 0.05F, 0F, -1F, 0.1F); // Import Box170
		gunModel[141].setRotationPoint(46F, -18F, 0F);
		gunModel[141].rotateAngleX = 1.78023584F;

		gunModel[142].addShapeBox(0F, -3.5F, -0.5F, 68, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1F, 0F, -1.1F, 1F, 0F, -1.5F, 0.1F, 0F, -1.4F, 0.1F); // Import Box171
		gunModel[142].setRotationPoint(46F, -19F, 0F);
		gunModel[142].rotateAngleX = -2.02458193F;

		gunModel[143].addShapeBox(0F, -3.5F, -1.5F, 68, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.1F, 1F, 0F, -1.1F, 1F); // Import Box172
		gunModel[143].setRotationPoint(46F, -19F, 0F);
		gunModel[143].rotateAngleX = 2.04203522F;

		gunModel[144].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 0.5F, 0F); // Import Box173
		gunModel[144].setRotationPoint(44F, -18F, 0F);

		gunModel[145].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 1F, 0.15F, 0F, 1F, 0.05F, 0F, 0.5F, 0F); // Import Box174
		gunModel[145].setRotationPoint(44F, -18F, 0F);
		gunModel[145].rotateAngleX = -0.15707963F;

		gunModel[146].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 0.5F, 0F); // Import Box175
		gunModel[146].setRotationPoint(44F, -18F, 0F);
		gunModel[146].rotateAngleX = 0.17453293F;

		gunModel[147].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.15F, 0F, 0.5F, 0F); // Import Box176
		gunModel[147].setRotationPoint(44F, -18F, 0F);
		gunModel[147].rotateAngleX = -0.34906585F;

		gunModel[148].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 0.5F, 0F); // Import Box177
		gunModel[148].setRotationPoint(44F, -18F, 0F);
		gunModel[148].rotateAngleX = 0.34906585F;

		gunModel[149].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.15F, 0F, 0.5F, 0F); // Import Box178
		gunModel[149].setRotationPoint(44F, -18F, 0F);
		gunModel[149].rotateAngleX = -0.52359878F;

		gunModel[150].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 0.5F, 0F); // Import Box179
		gunModel[150].setRotationPoint(44F, -18F, 0F);
		gunModel[150].rotateAngleX = 0.52359878F;

		gunModel[151].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.8F, 0.05F, 0F, 1F, 0.15F, 0F, 0.5F, 0F); // Import Box180
		gunModel[151].setRotationPoint(44F, -18F, 0F);
		gunModel[151].rotateAngleX = -0.6981317F;

		gunModel[152].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.05F, 0F, 0.2F, 0.1F, 0F, 0.8F, 0.25F, 0F, 0.3F, 0.1F); // Import Box181
		gunModel[152].setRotationPoint(44F, -18F, 0F);
		gunModel[152].rotateAngleX = -0.89011792F;

		gunModel[153].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.05F, 0F, -0.2F, 0.1F, 0F, 0.25F, 0.05F, 0F, 0.1F, 0.1F); // Import Box182
		gunModel[153].setRotationPoint(44F, -18F, 0F);
		gunModel[153].rotateAngleX = -1.08210414F;

		gunModel[154].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.05F, 0F, -0.6F, 0.1F, 0F, -0.15F, 0.05F, 0F, -0.3F, 0.1F); // Import Box183
		gunModel[154].setRotationPoint(44F, -18F, 0F);
		gunModel[154].rotateAngleX = -1.29154365F;

		gunModel[155].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.05F, 0F, -0.8F, 0.1F, 0F, -0.55F, 0.05F, 0F, -0.7F, 0.1F); // Import Box184
		gunModel[155].setRotationPoint(44F, -18F, 0F);
		gunModel[155].rotateAngleX = -1.51843645F;

		gunModel[156].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.05F, 0F, -1F, 0.1F, 0F, -0.75F, 0.05F, 0F, -0.9F, 0.1F); // Import Box185
		gunModel[156].setRotationPoint(44F, -18F, 0F);
		gunModel[156].rotateAngleX = -1.76278254F;

		gunModel[157].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 1F, 0F, -1.1F, 1F, 0F, -1.4F, 0.1F, 0F, -1.5F, 0.1F); // Import Box186
		gunModel[157].setRotationPoint(44F, -19F, 0F);
		gunModel[157].rotateAngleX = -2.02458193F;

		gunModel[158].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.05F, 0F, 0.8F, 0.05F, 0F, 0.3F, 0F); // Import Box187
		gunModel[158].setRotationPoint(44F, -18F, 0F);
		gunModel[158].rotateAngleX = 0.6981317F;

		gunModel[159].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.1F, 0F, 0.8F, 0.25F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.05F); // Import Box188
		gunModel[159].setRotationPoint(44F, -18F, 0F);
		gunModel[159].rotateAngleX = 0.90757121F;

		gunModel[160].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.25F, 0.05F, 0F, -0.2F, 0.1F, 0F, -0.3F, 0.05F); // Import Box189
		gunModel[160].setRotationPoint(44F, -18F, 0F);
		gunModel[160].rotateAngleX = 1.09955743F;

		gunModel[161].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.15F, 0.05F, 0F, -0.6F, 0.1F, 0F, -0.7F, 0.05F); // Import Box190
		gunModel[161].setRotationPoint(44F, -18F, 0F);
		gunModel[161].rotateAngleX = 1.30899694F;

		gunModel[162].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.1F, 0F, -0.55F, 0.05F, 0F, -0.8F, 0.1F, 0F, -0.9F, 0.05F); // Import Box191
		gunModel[162].setRotationPoint(44F, -18F, 0F);
		gunModel[162].rotateAngleX = 1.53588974F;

		gunModel[163].addShapeBox(0F, -3.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.1F, 0F, -0.75F, 0.05F, 0F, -1F, 0.1F, 0F, -1.1F, 0.05F); // Import Box192
		gunModel[163].setRotationPoint(44F, -18F, 0F);
		gunModel[163].rotateAngleX = 1.78023584F;

		gunModel[164].addShapeBox(0F, -3.5F, -1.5F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.1F, 0F, -1.4F, 0.1F, 0F, -1.1F, 1F, 0F, -1.1F, 1F); // Import Box193
		gunModel[164].setRotationPoint(44F, -19F, 0F);
		gunModel[164].rotateAngleX = 2.04203522F;

		gunModel[165].addShapeBox(0F, 0.5F, 0F, 68, 2, 7, 0F,0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import Box194
		gunModel[165].setRotationPoint(46F, -21.8F, -3.5F);

		gunModel[166].addShapeBox(0F, 0.5F, 0F, 1, 2, 7, 0F,0F, 0.05F, -0.2F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.45F, 0F, 0.05F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F); // Import Box195
		gunModel[166].setRotationPoint(114F, -21.8F, -3.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box197
		gunModel[167].setRotationPoint(6F, -26.2F, 1.5F);
		gunModel[167].rotateAngleX = -0.36651914F;

		gunModel[168].addShapeBox(0F, 0F, -3F, 33, 1, 3, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		gunModel[168].setRotationPoint(6F, -26.2F, -1.5F);
		gunModel[168].rotateAngleX = 0.36651914F;

		gunModel[169].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.4F, 0F); // Import Box199
		gunModel[169].setRotationPoint(13F, -25.1F, -4.3F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F); // Import Box200
		gunModel[170].setRotationPoint(13F, -25.1F, 3.3F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1F, 0F); // Import Box201
		gunModel[171].setRotationPoint(7F, -25.1F, 3.3F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.65F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.65F, 0F); // Import Box202
		gunModel[172].setRotationPoint(19F, -20.6F, -4.3F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		gunModel[173].setRotationPoint(26F, -20.6F, -4.3F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		gunModel[174].setRotationPoint(30F, -20.6F, -4.3F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box205
		gunModel[175].setRotationPoint(30F, -25.1F, -4.3F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		gunModel[176].setRotationPoint(19F, -25.1F, -4.3F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.4F, 0F); // Import Box208
		gunModel[177].setRotationPoint(26F, -15.6F, -4.3F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, 0F); // Import Box209
		gunModel[178].setRotationPoint(35F, -20.6F, -4.3F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box211
		gunModel[179].setRotationPoint(38F, -25.1F, -4.3F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1F, 0F); // Import Box212
		gunModel[180].setRotationPoint(7F, -25.1F, -4.3F);

		gunModel[181].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		gunModel[181].setRotationPoint(28F, -17.6F, -4.3F);

		gunModel[182].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		gunModel[182].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[182].rotateAngleZ = 0.33161256F;

		gunModel[183].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		gunModel[183].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[183].rotateAngleZ = 0.66322512F;

		gunModel[184].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		gunModel[184].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[184].rotateAngleZ = 1.06465084F;

		gunModel[185].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		gunModel[185].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[185].rotateAngleZ = 1.37881011F;

		gunModel[186].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		gunModel[186].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[186].rotateAngleZ = -0.33161256F;

		gunModel[187].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		gunModel[187].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[187].rotateAngleZ = -0.73303829F;

		gunModel[188].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		gunModel[188].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[188].rotateAngleZ = -1.1693706F;

		gunModel[189].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		gunModel[189].setRotationPoint(28F, -17.6F, -4.3F);
		gunModel[189].rotateAngleZ = -1.1693706F;

		gunModel[190].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		gunModel[190].setRotationPoint(33F, -17.6F, -4.3F);

		gunModel[191].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box211
		gunModel[191].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[191].rotateAngleZ = -0.27925268F;

		gunModel[192].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		gunModel[192].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[192].rotateAngleZ = -0.61086524F;

		gunModel[193].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		gunModel[193].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[193].rotateAngleZ = -0.90757121F;

		gunModel[194].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box214
		gunModel[194].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[194].rotateAngleZ = -1.23918377F;

		gunModel[195].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		gunModel[195].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[195].rotateAngleZ = 0.26179939F;

		gunModel[196].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		gunModel[196].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[196].rotateAngleZ = 0.59341195F;

		gunModel[197].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		gunModel[197].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[197].rotateAngleZ = 0.9250245F;

		gunModel[198].addShapeBox(2F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		gunModel[198].setRotationPoint(33F, -17.6F, -4.3F);
		gunModel[198].rotateAngleZ = 1.30899694F;

		gunModel[199].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box219
		gunModel[199].setRotationPoint(21F, -22.4F, -4.3F);

		gunModel[200].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		gunModel[200].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[200].rotateAngleZ = 0.34906585F;

		gunModel[201].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box225
		gunModel[201].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[201].rotateAngleZ = 0.62831853F;

		gunModel[202].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		gunModel[202].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[202].rotateAngleZ = 1.08210414F;

		gunModel[203].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		gunModel[203].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[203].rotateAngleZ = 0.83775804F;

		gunModel[204].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box228
		gunModel[204].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[204].rotateAngleZ = -0.31415927F;

		gunModel[205].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box229
		gunModel[205].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[205].rotateAngleZ = -0.64577182F;

		gunModel[206].addShapeBox(-3F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box230
		gunModel[206].setRotationPoint(21F, -22.4F, -4.3F);
		gunModel[206].rotateAngleZ = -0.99483767F;

		gunModel[207].addShapeBox(1F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box231
		gunModel[207].setRotationPoint(37F, -22.4F, -4.3F);

		gunModel[208].addShapeBox(1F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		gunModel[208].setRotationPoint(37F, -22.4F, -4.3F);
		gunModel[208].rotateAngleZ = -0.31415927F;

		gunModel[209].addShapeBox(1F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		gunModel[209].setRotationPoint(37F, -22.4F, -4.3F);
		gunModel[209].rotateAngleZ = 0.33161256F;

		gunModel[210].addShapeBox(1F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		gunModel[210].setRotationPoint(37F, -22.4F, -4.3F);
		gunModel[210].rotateAngleZ = 0.6981317F;

		gunModel[211].addShapeBox(1F, -1.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box235
		gunModel[211].setRotationPoint(37F, -22.4F, -4.3F);
		gunModel[211].rotateAngleZ = 1.06465084F;

		gunModel[212].addShapeBox(1F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box236
		gunModel[212].setRotationPoint(37F, -22.4F, -4.3F);
		gunModel[212].rotateAngleZ = -0.71558499F;

		gunModel[213].addShapeBox(1F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box237
		gunModel[213].setRotationPoint(37F, -22.4F, -4.3F);
		gunModel[213].rotateAngleZ = -1.04719755F;

		gunModel[214].addBox(-9F, -1F, 0F, 9, 1, 2, 0F); // Import Box250
		gunModel[214].setRotationPoint(44F, -13.8F, -4.3F);
		gunModel[214].rotateAngleX = -0.62831853F;
		gunModel[214].rotateAngleZ = 0.03490659F;

		gunModel[215].addBox(-9F, 0F, 0F, 9, 1, 2, 0F); // Import Box251
		gunModel[215].setRotationPoint(35F, -13.5F, 4.3F);
		gunModel[215].rotateAngleX = -2.51327412F;
		gunModel[215].rotateAngleZ = 0.03490659F;

		gunModel[216].addBox(-7F, -1F, 0F, 7, 1, 2, 0F); // Import Box252
		gunModel[216].setRotationPoint(26F, -13.2F, -4.3F);
		gunModel[216].rotateAngleX = -0.62831853F;
		gunModel[216].rotateAngleZ = 0.03490659F;

		gunModel[217].addBox(-6F, -1F, 0F, 6, 1, 2, 0F); // Import Box253
		gunModel[217].setRotationPoint(19F, -12.95F, -4.3F);
		gunModel[217].rotateAngleX = -0.62831853F;
		gunModel[217].rotateAngleZ = 0.03490659F;

		gunModel[218].addBox(-6F, -1F, 0F, 6, 1, 2, 0F); // Import Box254
		gunModel[218].setRotationPoint(13F, -12.75F, -4.3F);
		gunModel[218].rotateAngleX = -0.62831853F;
		gunModel[218].rotateAngleZ = 0.10471976F;

		gunModel[219].addBox(-9F, 0F, 0F, 9, 1, 2, 0F); // Import Box256
		gunModel[219].setRotationPoint(44F, -13.8F, 4.3F);
		gunModel[219].rotateAngleX = -2.51327412F;
		gunModel[219].rotateAngleZ = 0.03490659F;

		gunModel[220].addBox(-9F, -1F, 0F, 9, 1, 2, 0F); // Import Box257
		gunModel[220].setRotationPoint(35F, -13.5F, -4.3F);
		gunModel[220].rotateAngleX = -0.62831853F;
		gunModel[220].rotateAngleZ = 0.03490659F;

		gunModel[221].addBox(-7F, 0F, 0F, 7, 1, 2, 0F); // Import Box258
		gunModel[221].setRotationPoint(26F, -13.2F, 4.3F);
		gunModel[221].rotateAngleX = -2.51327412F;
		gunModel[221].rotateAngleZ = 0.03490659F;

		gunModel[222].addBox(-6F, 0F, 0F, 6, 1, 2, 0F); // Import Box259
		gunModel[222].setRotationPoint(19F, -12.95F, 4.3F);
		gunModel[222].rotateAngleX = -2.51327412F;
		gunModel[222].rotateAngleZ = 0.03490659F;

		gunModel[223].addBox(-6F, 0F, 0F, 6, 1, 2, 0F); // Import Box260
		gunModel[223].setRotationPoint(13F, -12.75F, 4.3F);
		gunModel[223].rotateAngleX = -2.51327412F;
		gunModel[223].rotateAngleZ = 0.10471976F;

		gunModel[224].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		gunModel[224].setRotationPoint(38F, -24.1F, -4.3F);

		gunModel[225].addShapeBox(0F, 0F, -3F, 6, 1, 3, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0.9F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		gunModel[225].setRotationPoint(36F, -26.2F, -1.5F);
		gunModel[225].rotateAngleX = 0.36651914F;

		gunModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0.75F, -1F, 1F, 0F); // Import Box263
		gunModel[226].setRotationPoint(36F, -26.2F, 1.5F);
		gunModel[226].rotateAngleX = -0.34906585F;

		gunModel[227].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box264
		gunModel[227].setRotationPoint(38F, -24.1F, 3.3F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1.1F, 0F); // Import Box265
		gunModel[228].setRotationPoint(35F, -20.6F, 3.3F);

		gunModel[229].addShapeBox(-9F, -1F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box266
		gunModel[229].setRotationPoint(44F, -12.7F, -2.7F);
		gunModel[229].rotateAngleX = -0.31415927F;
		gunModel[229].rotateAngleZ = 0.03490659F;

		gunModel[230].addShapeBox(-9F, -1F, -2F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		gunModel[230].setRotationPoint(44F, -12.7F, 2.7F);
		gunModel[230].rotateAngleX = 0.31415927F;
		gunModel[230].rotateAngleZ = 0.03490659F;

		gunModel[231].addShapeBox(-9F, -1F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box268
		gunModel[231].setRotationPoint(35F, -12.35F, -2.7F);
		gunModel[231].rotateAngleX = -0.31415927F;
		gunModel[231].rotateAngleZ = 0.03490659F;

		gunModel[232].addShapeBox(-7F, -1F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box269
		gunModel[232].setRotationPoint(26F, -12F, -2.7F);
		gunModel[232].rotateAngleX = -0.31415927F;
		gunModel[232].rotateAngleZ = 0.03490659F;

		gunModel[233].addShapeBox(-6F, -1F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box270
		gunModel[233].setRotationPoint(19F, -11.75F, -2.7F);
		gunModel[233].rotateAngleX = -0.31415927F;
		gunModel[233].rotateAngleZ = 0.03490659F;

		gunModel[234].addShapeBox(-9F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box271
		gunModel[234].setRotationPoint(35F, -12.35F, 2.7F);
		gunModel[234].rotateAngleX = -2.84488668F;
		gunModel[234].rotateAngleZ = 0.03490659F;

		gunModel[235].addShapeBox(-7F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box272
		gunModel[235].setRotationPoint(26F, -12F, 2.7F);
		gunModel[235].rotateAngleX = -2.86233997F;
		gunModel[235].rotateAngleZ = 0.03490659F;

		gunModel[236].addShapeBox(-6F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box273
		gunModel[236].setRotationPoint(19F, -11.75F, 2.7F);
		gunModel[236].rotateAngleX = -2.86233997F;
		gunModel[236].rotateAngleZ = 0.03490659F;

		gunModel[237].addShapeBox(-6F, 0F, 0F, 6, 12, 1, 0F,0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -2.5F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2.5F, 2F, 0F); // Import Box274
		gunModel[237].setRotationPoint(7F, -25.1F, -4.3F);

		gunModel[238].addShapeBox(-6F, 0F, -1F, 6, 12, 1, 0F,0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -2.5F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2.5F, 2F, 0F); // Import Box275
		gunModel[238].setRotationPoint(7F, -25.1F, 4.3F);

		gunModel[239].addShapeBox(0F, 0.5F, 0F, 2, 2, 2, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box276
		gunModel[239].setRotationPoint(67F, -27.5F, -1F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.1F, 1F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F); // Import Box277
		gunModel[240].setRotationPoint(70F, -26.3F, -0.5F);
		gunModel[240].rotateAngleZ = -0.03490659F;

		gunModel[241].addShapeBox(0F, 0F, -1F, 13, 1, 1, 0F,0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box278
		gunModel[241].setRotationPoint(57F, -27F, -0.5F);
		gunModel[241].rotateAngleZ = -0.05235988F;

		gunModel[242].addShapeBox(0F, 0F, -1F, 13, 1, 1, 0F,0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box279
		gunModel[242].setRotationPoint(57F, -27F, 1.5F);
		gunModel[242].rotateAngleZ = -0.05235988F;

		gunModel[243].addShapeBox(7F, 0F, -1F, 6, 1, 1, 0F,0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box280
		gunModel[243].setRotationPoint(57F, -27F, 0.5F);
		gunModel[243].rotateAngleZ = -0.05235988F;

		gunModel[244].addShapeBox(-1F, 0F, -1F, 1, 1, 2, 0F,0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box281
		gunModel[244].setRotationPoint(57F, -27F, -0.5F);
		gunModel[244].rotateAngleZ = -0.4712389F;

		gunModel[245].addShapeBox(-1F, 0F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.2F, -0.5F, 1F); // Import Box282
		gunModel[245].setRotationPoint(56.4F, -27F, -0.5F);
		gunModel[245].rotateAngleZ = -1.58824962F;

		gunModel[246].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F); // Import Box283
		gunModel[246].setRotationPoint(56.4F, -27.3F, -0.5F);
		gunModel[246].rotateAngleZ = -1.58824962F;

		gunModel[247].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F,-0.2F, -0.2F, 1.2F, 0.1F, -0.2F, 1.2F, 0.1F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, -0.5F, -1F, -0.2F, -0.5F, -1F); // Import Box284
		gunModel[247].setRotationPoint(56.4F, -27.3F, 2.5F);
		gunModel[247].rotateAngleZ = -1.58824962F;

		gunModel[248].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box286
		gunModel[248].setRotationPoint(30F, -20.6F, -3.3F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		gunModel[249].setRotationPoint(26F, -20.6F, -3.3F);

		gunModel[250].addShapeBox(-8F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		gunModel[250].setRotationPoint(6F, -26.2F, 1.5F);
		gunModel[250].rotateAngleX = -0.48869219F;
		gunModel[250].rotateAngleZ = 0.73303829F;

		gunModel[251].addShapeBox(-8F, 0F, -3F, 8, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		gunModel[251].setRotationPoint(6F, -26.2F, -1.5F);
		gunModel[251].rotateAngleX = 0.48869219F;
		gunModel[251].rotateAngleZ = 0.73303829F;

		gunModel[252].addBox(-2F, 0F, -1.5F, 2, 1, 3, 0F); // Import Box291
		gunModel[252].setRotationPoint(6F, -26.2F, 0F);
		gunModel[252].rotateAngleZ = 0.73303829F;

		gunModel[253].addShapeBox(-6F, -1F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box292
		gunModel[253].setRotationPoint(13F, -11.55F, -2.7F);
		gunModel[253].rotateAngleX = -0.31415927F;
		gunModel[253].rotateAngleZ = 0.10471976F;

		gunModel[254].addShapeBox(-6F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		gunModel[254].setRotationPoint(13F, -11.55F, 2.7F);
		gunModel[254].rotateAngleX = -2.84488668F;
		gunModel[254].rotateAngleZ = 0.10471976F;

		gunModel[255].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box294
		gunModel[255].setRotationPoint(116F, -13F, 0F);

		gunModel[256].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box295
		gunModel[256].setRotationPoint(116F, -13F, 0F);
		gunModel[256].rotateAngleY = -0.9250245F;

		gunModel[257].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box296
		gunModel[257].setRotationPoint(116F, -13F, 0F);
		gunModel[257].rotateAngleY = -1.8675023F;

		gunModel[258].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box297
		gunModel[258].setRotationPoint(116F, -13F, 0F);
		gunModel[258].rotateAngleY = -2.19911486F;

		gunModel[259].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box298
		gunModel[259].setRotationPoint(116F, -13F, 0F);
		gunModel[259].rotateAngleY = -2.39110108F;

		gunModel[260].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box299
		gunModel[260].setRotationPoint(116F, -13F, 0F);
		gunModel[260].rotateAngleY = -2.63544717F;

		gunModel[261].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box300
		gunModel[261].setRotationPoint(116F, -13F, 0F);
		gunModel[261].rotateAngleY = -2.82743339F;

		gunModel[262].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box301
		gunModel[262].setRotationPoint(116F, -13F, 0F);
		gunModel[262].rotateAngleY = -3.00196631F;

		gunModel[263].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box302
		gunModel[263].setRotationPoint(116F, -13F, 0F);
		gunModel[263].rotateAngleY = -3.28121899F;

		gunModel[264].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box303
		gunModel[264].setRotationPoint(116F, -13F, 0F);
		gunModel[264].rotateAngleY = -3.40339204F;

		gunModel[265].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box304
		gunModel[265].setRotationPoint(116F, -13F, 0F);
		gunModel[265].rotateAngleY = -3.59537826F;

		gunModel[266].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box305
		gunModel[266].setRotationPoint(116F, -13F, 0F);
		gunModel[266].rotateAngleY = -3.82227106F;

		gunModel[267].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box306
		gunModel[267].setRotationPoint(116F, -13F, 0F);
		gunModel[267].rotateAngleY = -3.99680399F;

		gunModel[268].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box307
		gunModel[268].setRotationPoint(116F, -13F, 0F);
		gunModel[268].rotateAngleY = -4.2062435F;

		gunModel[269].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box308
		gunModel[269].setRotationPoint(116F, -13F, 0F);
		gunModel[269].rotateAngleY = -4.34586984F;

		gunModel[270].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box309
		gunModel[270].setRotationPoint(116F, -13F, 0F);
		gunModel[270].rotateAngleY = -4.52040276F;

		gunModel[271].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box310
		gunModel[271].setRotationPoint(116F, -13F, 0F);
		gunModel[271].rotateAngleY = -4.74729557F;

		gunModel[272].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box311
		gunModel[272].setRotationPoint(116F, -13F, 0F);
		gunModel[272].rotateAngleY = -4.93928178F;

		gunModel[273].addBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F); // Import Box312
		gunModel[273].setRotationPoint(116F, -13F, 0F);
		gunModel[273].rotateAngleY = -5.02654825F;

		gunModel[274].addShapeBox(-1F, 0F, -0.5F, 2, 1, 7, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box313
		gunModel[274].setRotationPoint(116F, -12.3F, -3F);

		gunModel[275].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box314
		gunModel[275].setRotationPoint(116F, -12.3F, 3.5F);
		gunModel[275].rotateAngleX = -0.64577182F;

		gunModel[276].addShapeBox(-1F, 0F, -1F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box315
		gunModel[276].setRotationPoint(116F, -12.3F, -3.5F);
		gunModel[276].rotateAngleX = 0.62831853F;

		gunModel[277].addShapeBox(-1F, 0F, -0.5F, 2, 1, 7, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box316
		gunModel[277].setRotationPoint(116F, -10.3F, -3F);

		gunModel[278].addShapeBox(-1F, -0.4F, -1F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box317
		gunModel[278].setRotationPoint(116F, -9.9F, -3.5F);
		gunModel[278].rotateAngleX = -0.64577182F;

		gunModel[279].addShapeBox(-1F, -0.4F, 0F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box318
		gunModel[279].setRotationPoint(116F, -9.9F, 3.5F);
		gunModel[279].rotateAngleX = 0.64577182F;

		gunModel[280].addShapeBox(-1F, 0F, 0F, 2, 3, 1, 0F,-0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, -0.5F, -0.8F, -0.6F, -0.5F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, -0.5F, -0.8F, -1.1F, -0.5F); // Import Box319
		gunModel[280].setRotationPoint(116F, -12.4F, -4.3F);

		gunModel[281].addShapeBox(-1F, 0F, 0F, 2, 3, 1, 0F,-0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, -0.5F, -0.8F, -0.6F, -0.5F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, -0.5F, -0.8F, -1.1F, -0.5F); // Import Box320
		gunModel[281].setRotationPoint(116F, -12.4F, 3.8F);

		gunModel[282].addShapeBox(0F, 0F, -1.5F, 39, 1, 3, 0F,0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box356
		gunModel[282].setRotationPoint(11F, -27.2F, 0F);

		gunModel[283].addShapeBox(0F, -1F, -1.5F, 39, 1, 1, 0F,0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0.3F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.3F, -0.5F, 0F, 0.5F, -0.5F); // Import Box358
		gunModel[283].setRotationPoint(11F, -27.2F, 0F);

		gunModel[284].addShapeBox(0F, -1F, 1.5F, 39, 1, 1, 0F,0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.5F, -0.9F, 0F, 0.3F, -0.9F); // Import Box359
		gunModel[284].setRotationPoint(11F, -27.2F, 0F);

		gunModel[285].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[285].setRotationPoint(11F, -27.2F, 0F);

		gunModel[286].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		gunModel[286].setRotationPoint(15F, -27.3F, 0F);

		gunModel[287].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		gunModel[287].setRotationPoint(15F, -27.3F, 0F);
		gunModel[287].rotateAngleY = -1.08210414F;

		gunModel[288].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		gunModel[288].setRotationPoint(15F, -27.3F, 0F);
		gunModel[288].rotateAngleY = -2.12930169F;

		gunModel[289].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		gunModel[289].setRotationPoint(36F, -27.3F, 0F);
		gunModel[289].rotateAngleY = -2.12930169F;

		gunModel[290].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box423
		gunModel[290].setRotationPoint(36F, -27.3F, 0F);
		gunModel[290].rotateAngleY = -1.11701072F;

		gunModel[291].addShapeBox(-0.5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box424
		gunModel[291].setRotationPoint(36F, -27.3F, 0F);
		gunModel[291].rotateAngleY = -0.05235988F;

		gunModel[292].addBox(-31F, -1F, -0.5F, 31, 1, 1, 0F); // Import Box425
		gunModel[292].setRotationPoint(44F, -12F, 0F);
		gunModel[292].rotateAngleZ = 0.03490659F;

		gunModel[293].addBox(-6F, -1F, -0.5F, 6, 1, 1, 0F); // Import Box426
		gunModel[293].setRotationPoint(13F, -10.9F, 0F);
		gunModel[293].rotateAngleZ = 0.10471976F;

		gunModel[294].addBox(0F, 0F, -2F, 11, 2, 4, 0F); // Import Box428
		gunModel[294].setRotationPoint(19F, -14.2F, 0F);

		gunModel[295].addShapeBox(0F, 0F, -2F, 11, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F); // Import Box429
		gunModel[295].setRotationPoint(19F, -12F, 0F);

		gunModel[296].addShapeBox(0F, 0F, -2F, 11, 1, 4, 0F,-2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F); // Import Box430
		gunModel[296].setRotationPoint(19F, -11F, 0F);

		gunModel[297].addShapeBox(0F, 0F, -2F, 11, 1, 4, 0F,-3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F); // Import Box431
		gunModel[297].setRotationPoint(19F, -10F, 0F);

		gunModel[298].addShapeBox(0F, 0F, -2F, 11, 1, 4, 0F,-4.2F, 0F, 0F, -3.7F, 0F, 0F, -3.7F, 0F, 0F, -4.2F, 0F, 0F, -4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F); // Import Box432
		gunModel[298].setRotationPoint(19F, -8F, 0F);

		gunModel[299].addShapeBox(0F, 0F, -2F, 11, 1, 4, 0F,-4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F, -4.9F, -0.6F, 0F, -4.4F, -0.6F, 0F, -4.4F, -0.6F, 0F, -4.9F, -0.6F, 0F); // Import Box433
		gunModel[299].setRotationPoint(19F, -7F, 0F);

		gunModel[300].addShapeBox(0F, 0F, -2F, 11, 1, 4, 0F,-4F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, -4.2F, 0F, 0F, -3.7F, 0F, 0F, -3.7F, 0F, 0F, -4.2F, 0F, 0F); // Import Box434
		gunModel[300].setRotationPoint(19F, -9F, 0F);

		gunModel[301].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box443
		gunModel[301].setRotationPoint(24.75F, -7.8F, -2F);

		gunModel[302].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box444
		gunModel[302].setRotationPoint(24.7F, -7.8F, 3F);

		gunModel[303].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box445
		gunModel[303].setRotationPoint(24.7F, -7.8F, 3F);
		gunModel[303].rotateAngleZ = 0.59341195F;

		gunModel[304].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box446
		gunModel[304].setRotationPoint(24.7F, -7.8F, 3F);
		gunModel[304].rotateAngleZ = 1.1693706F;

		gunModel[305].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box447
		gunModel[305].setRotationPoint(24.7F, -7.8F, 3F);
		gunModel[305].rotateAngleZ = 1.78023584F;

		gunModel[306].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box448
		gunModel[306].setRotationPoint(24.7F, -7.8F, 3F);
		gunModel[306].rotateAngleZ = 2.44346095F;

		gunModel[307].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box431
		gunModel[307].setRotationPoint(3.7F, -14.8F, -4.2F);

		gunModel[308].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box432
		gunModel[308].setRotationPoint(3.7F, -14.8F, -4.2F);
		gunModel[308].rotateAngleZ = 0.64577182F;

		gunModel[309].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box433
		gunModel[309].setRotationPoint(3.7F, -14.8F, -4.2F);
		gunModel[309].rotateAngleZ = 1.25663706F;

		gunModel[310].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box434
		gunModel[310].setRotationPoint(3.7F, -14.8F, -4.2F);
		gunModel[310].rotateAngleZ = 1.8675023F;

		gunModel[311].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box435
		gunModel[311].setRotationPoint(3.7F, -14.8F, -4.2F);
		gunModel[311].rotateAngleZ = 2.47836754F;

		gunModel[312].addShapeBox(1F, 0F, 0F, 2, 1, 3, 0F,0.3F, 1F, 0.5F, -0.9F, 1.8F, 0F, -2F, 2.9F, -0.4F, 1.7F, 2.4F, -0.4F, -0.5F, -0.1F, 1.2F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.4F, -0.2F, 0F); // Import Box441
		gunModel[312].setRotationPoint(-1F, -18F, -4.3F);

		gunModel[313].addShapeBox(-24F, 0F, -1.5F, 16, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box443
		gunModel[313].setRotationPoint(0F, -20.9F, 0F);
		gunModel[313].rotateAngleZ = 0.33161256F;

		gunModel[314].addShapeBox(-7F, 0F, -1.5F, 7, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Import Box444
		gunModel[314].setRotationPoint(0F, -20.9F, 0F);
		gunModel[314].rotateAngleZ = 0.33161256F;

		gunModel[315].addShapeBox(-8F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F); // Import Box445
		gunModel[315].setRotationPoint(0F, -20.9F, 0F);
		gunModel[315].rotateAngleZ = 0.33161256F;

		gunModel[316].addShapeBox(-25F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.8F); // Import Box446
		gunModel[316].setRotationPoint(0F, -20.9F, 0F);
		gunModel[316].rotateAngleZ = 0.33161256F;

		gunModel[317].addShapeBox(-10F, 11F, -1.5F, 10, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Import Box447
		gunModel[317].setRotationPoint(0F, -20.9F, 0F);
		gunModel[317].rotateAngleZ = 0.36651914F;

		gunModel[318].addShapeBox(-7F, 0F, -1.5F, 7, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Import Box448
		gunModel[318].setRotationPoint(-5.5F, -7.1F, 0F);
		gunModel[318].rotateAngleZ = 0.45378561F;

		gunModel[319].addShapeBox(-8F, 0F, -1.5F, 8, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Import Box449
		gunModel[319].setRotationPoint(-11.5F, -4.2F, 0F);
		gunModel[319].rotateAngleZ = 0.54105207F;

		gunModel[320].addShapeBox(-10F, 0F, -1.5F, 2, 1, 3, 0F,0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F); // Import Box450
		gunModel[320].setRotationPoint(-11.5F, -4.2F, 0F);
		gunModel[320].rotateAngleZ = 0.54105207F;

		gunModel[321].addShapeBox(-6F, 0F, -1.5F, 6, 1, 3, 0F,0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box451
		gunModel[321].setRotationPoint(-20F, 0.800000000000001F, 0F);
		gunModel[321].rotateAngleZ = 0.73303829F;

		gunModel[322].addShapeBox(-6F, 0F, -1.5F, 6, 1, 3, 0F,-0.7F, -0.3F, 1.4F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, -0.7F, -0.3F, 1.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box452
		gunModel[322].setRotationPoint(-24.5F, 4.8F, 0F);
		gunModel[322].rotateAngleZ = 1.06465084F;

		gunModel[323].addShapeBox(-3F, 0F, -1.5F, 3, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0.2F, 0F, 1.7F); // Import Box453
		gunModel[323].setRotationPoint(-23.2F, -12.7F, 0F);
		gunModel[323].rotateAngleZ = 0.2268928F;

		gunModel[324].addShapeBox(-4F, 0F, -1.5F, 4, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, -0.1F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0.4F, -0.1F, 1.7F); // Import Box454
		gunModel[324].setRotationPoint(-26.1F, -12F, 0F);
		gunModel[324].rotateAngleZ = 0.01745329F;

		gunModel[325].addShapeBox(-4F, 0F, -1.5F, 4, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, 0F, 1.2F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0.4F, 0F, 1.2F); // Import Box455
		gunModel[325].setRotationPoint(-30.1F, -11.95F, 0F);
		gunModel[325].rotateAngleZ = -0.34906585F;

		gunModel[326].addShapeBox(-4F, 0F, -1.5F, 4, 1, 3, 0F,0F, 0.05F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.05F, -0.3F, -0.4F, -0.1F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, -0.4F, -0.1F, 1.2F); // Import Box456
		gunModel[326].setRotationPoint(-33.9F, -13.3F, 0F);
		gunModel[326].rotateAngleZ = -0.6981317F;

		gunModel[327].addShapeBox(-2F, 0F, -1.5F, 2, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.4F, -0.1F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, -0.4F, -0.1F, 1.2F); // Import Box457
		gunModel[327].setRotationPoint(-36.9F, -15.9F, 0F);
		gunModel[327].rotateAngleZ = -0.27925268F;

		gunModel[328].addShapeBox(-47F, 0F, -1.5F, 47, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F); // Import Box458
		gunModel[328].setRotationPoint(-38.8F, -16.45F, 0F);
		gunModel[328].rotateAngleZ = 0.13962634F;

		gunModel[329].addShapeBox(-2F, -1F, -1.5F, 2, 1, 3, 0F,-0.15F, 0F, 1.7F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, -0.15F, 0F, 1.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box459
		gunModel[329].setRotationPoint(-26.55F, 10.55F, 0F);
		gunModel[329].rotateAngleZ = 0.26179939F;

		gunModel[330].addShapeBox(-13F, -1F, -1.5F, 13, 1, 3, 0F,0.2F, -0.3F, 0.6F, -0.4F, 0F, 1.7F, -0.4F, 0F, 1.7F, 0.2F, -0.3F, 0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box460
		gunModel[330].setRotationPoint(-28.5F, 11.1F, 0F);
		gunModel[330].rotateAngleZ = -0.27925268F;

		gunModel[331].addShapeBox(-41F, -1F, -1.5F, 41, 1, 3, 0F,0.8F, 0.2F, 0.5F, 0.2F, -0.4F, 0.5F, 0.2F, -0.4F, 0.5F, 0.8F, 0.2F, 0.5F, 1.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1.6F, 0F, -0.3F); // Import Box461
		gunModel[331].setRotationPoint(-41F, 7.5F, 0F);
		gunModel[331].rotateAngleZ = 0.36651914F;

		gunModel[332].addShapeBox(-50F, -1F, -1.5F, 9, 1, 3, 0F,-0.2F, 0.5F, 1.1F, -0.7F, 0.4F, 0.9F, -0.7F, 0.4F, 0.9F, -0.2F, 0.5F, 1.1F, 0F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Import Box463
		gunModel[332].setRotationPoint(-41F, 7.5F, 0F);
		gunModel[332].rotateAngleZ = 0.36651914F;

		gunModel[333].addShapeBox(-10F, 0F, 0F, 44, 1, 6, 0F,0.2F, 0.95F, -0.3F, 2.3F, 7.45F, -0.3F, 2.3F, 7.45F, -0.3F, 0.2F, 0.95F, -0.3F, 0F, 0F, 1F, 1.1F, -6F, 0.8F, 1.1F, -6F, 0.8F, 0F, 0F, 1F); // Import Box461
		gunModel[333].setRotationPoint(-75F, -8F, -3F);

		gunModel[334].addShapeBox(0F, -4F, 0F, 44, 1, 6, 0F,0F, -5F, 1F, 1.1F, 1F, 0.8F, 1.1F, 1F, 0.8F, 0F, -5F, 1F, -0.5F, 6.15F, 1.5F, 0F, -0.05F, 1.5F, 0F, -0.05F, 1.5F, -0.5F, 6.15F, 1.5F); // Import Box462
		gunModel[334].setRotationPoint(-85F, -8F, -3F);

		gunModel[335].addShapeBox(0F, -4F, 0F, 44, 1, 6, 0F,-0.5F, 0.85F, 1.5F, 0F, 7.05F, 1.5F, 0F, 7.05F, 1.5F, -0.5F, 0.85F, 1.5F, -1F, 1F, 1.8F, 0F, -5F, 1.8F, 0F, -5F, 1.8F, -1F, 1F, 1.8F); // Import Box463
		gunModel[335].setRotationPoint(-85F, 0F, -3F);

		gunModel[336].addShapeBox(0F, -4F, 0F, 44, 5, 6, 0F,-1F, -4F, 1.8F, 0F, 2F, 1.8F, 0F, 2F, 1.8F, -1F, -4F, 1.8F, -2F, 7.15F, 1.5F, 0F, -0.05F, 1.5F, 0F, -0.05F, 1.5F, -2F, 7.15F, 1.5F); // Import Box464
		gunModel[336].setRotationPoint(-85F, -2F, -3F);

		gunModel[337].addShapeBox(0F, -4F, 0F, 44, 5, 6, 0F,-2F, 0.85F, 1.5F, 0F, 8.05F, 1.5F, 0F, 8.05F, 1.5F, -2F, 0.85F, 1.5F, -4F, 6F, -0.2F, 0F, -7F, 0.3F, 0F, -7F, 0.3F, -4F, 6F, -0.2F); // Import Box465
		gunModel[337].setRotationPoint(-85F, 11F, -3F);

		gunModel[338].addShapeBox(0F, -4F, 0F, 44, 3, 6, 0F,-4F, -6F, -0.2F, 0F, 7F, 0.3F, 0F, 7F, 0.3F, -4F, -6F, -0.2F, -4.2F, 6.45F, -1F, 0F, -8.15F, -1F, 0F, -8.15F, -1F, -4.4F, 6.45F, -1F); // Import Box466
		gunModel[338].setRotationPoint(-85F, 16F, -3F);

		gunModel[339].addShapeBox(-10F, 11F, -1.5F, 10, 1, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box467
		gunModel[339].setRotationPoint(0F, -21F, 0F);
		gunModel[339].rotateAngleZ = 0.36651914F;

		gunModel[340].addShapeBox(-7F, 0F, -1.5F, 7, 1, 3, 0F,0F, 0F, 2F, 0.1F, -0.1F, 2F, 0.1F, -0.1F, 2F, 0F, 0F, 2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box468
		gunModel[340].setRotationPoint(-5.5F, -7.2F, 0F);
		gunModel[340].rotateAngleZ = 0.45378561F;

		gunModel[341].addShapeBox(-10F, 0F, -1.5F, 10, 1, 3, 0F,0F, 0F, 1.6F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, 0F, 0F, 1.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box469
		gunModel[341].setRotationPoint(-11.5F, -4.3F, 0F);
		gunModel[341].rotateAngleZ = 0.54105207F;

		gunModel[342].addShapeBox(-8F, 0F, -1.5F, 9, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box470
		gunModel[342].setRotationPoint(0F, -20.8F, 0F);
		gunModel[342].rotateAngleZ = 0.33161256F;

		gunModel[343].addShapeBox(-25F, 0F, -1.5F, 17, 1, 3, 0F,-0.4F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.3F, 0.05F, 1.7F, 0F, 0F, 2F, 0F, 0F, 2F, -0.3F, 0.05F, 1.7F); // Import Box471
		gunModel[343].setRotationPoint(0F, -20.8F, 0F);
		gunModel[343].rotateAngleZ = 0.33161256F;

		gunModel[344].addShapeBox(-8F, 0F, -1.5F, 8, 1, 3, 0F,0F, 0.9F, 2F, 0F, 0.9F, 2F, 0F, 0.9F, 2F, 0F, 0.9F, 2F, 0F, 1F, 3.7F, 0.1F, 1F, 3.7F, 0.1F, 1F, 3.7F, 0F, 1F, 3.7F); // Import Box472
		gunModel[344].setRotationPoint(0F, -18.8F, 0F);
		gunModel[344].rotateAngleZ = 0.33161256F;

		gunModel[345].addShapeBox(-25F, 0F, -1.5F, 17, 1, 3, 0F,-0.3F, 0.85F, 1.7F, 0F, 0.9F, 2F, 0F, 0.9F, 2F, -0.3F, 0.85F, 1.7F, -0.4F, 2F, 3.7F, 0F, 1F, 3.7F, 0F, 1F, 3.7F, -0.4F, 2F, 3.7F); // Import Box473
		gunModel[345].setRotationPoint(0F, -18.8F, 0F);
		gunModel[345].rotateAngleZ = 0.33161256F;

		gunModel[346].addShapeBox(-3F, 0F, -1.5F, 3, 1, 3, 0F,-0.3F, 0.95F, 1.7F, 0F, 0.95F, 1.7F, 0F, 0.95F, 1.7F, -0.3F, 0.95F, 1.7F, 0F, 2F, 3.7F, 0.3F, 1.9F, 3.7F, 0.3F, 1.9F, 3.7F, 0F, 2F, 3.7F); // Import Box474
		gunModel[346].setRotationPoint(-23.2F, -10.7F, 0F);
		gunModel[346].rotateAngleZ = 0.2268928F;

		gunModel[347].addShapeBox(-4F, 0F, -1.5F, 4, 1, 3, 0F,0.4F, 1.1F, 1.7F, 0.1F, 1F, 1.7F, 0.1F, 1F, 1.7F, 0.4F, 1.1F, 1.7F, 0F, 2F, 3.7F, 0.6F, 2F, 3.7F, 0.6F, 2F, 3.7F, 0F, 2F, 3.7F); // Import Box475
		gunModel[347].setRotationPoint(-26.1F, -10F, 0F);
		gunModel[347].rotateAngleZ = 0.01745329F;

		gunModel[348].addShapeBox(-4F, 0F, -1.5F, 4, 1, 3, 0F,0.4F, 0.9F, 1.2F, -0.7F, 0.9F, 1.7F, -0.7F, 0.9F, 1.7F, 0.4F, 0.9F, 1.2F, 0F, 2F, 3.7F, 1.1F, 1.8F, 3.7F, 1.1F, 1.8F, 3.7F, 0F, 2F, 3.7F); // Import Box476
		gunModel[348].setRotationPoint(-30.1F, -9.95F, 0F);
		gunModel[348].rotateAngleZ = -0.34906585F;

		gunModel[349].addShapeBox(-4F, 0F, -1.5F, 4, 1, 3, 0F,0.9F, 0.7F, 1.2F, 0F, 0.7F, 1.2F, 0F, 0.7F, 1.2F, 0.9F, 0.7F, 1.2F, 0F, 2.55F, 3.2F, 1F, 1.8F, 3.7F, 1F, 1.8F, 3.7F, 0F, 2.55F, 3.2F); // Import Box477
		gunModel[349].setRotationPoint(-33.9F, -11.3F, 0F);
		gunModel[349].rotateAngleZ = -0.6981317F;

		gunModel[350].addShapeBox(-2F, 0F, -1.5F, 2, 1, 3, 0F,0.2F, 1F, 1.2F, -0.5F, 0.9F, 1.2F, -0.5F, 0.9F, 1.2F, 0.2F, 1F, 1.2F, 1.1F, 2.8F, 3F, -1.3F, 2.3F, 3.15F, -1.3F, 2.3F, 3.15F, 1.1F, 2.9F, 3F); // Import Box478
		gunModel[350].setRotationPoint(-36.9F, -13.9F, 0F);
		gunModel[350].rotateAngleZ = -0.27925268F;

		gunModel[351].addShapeBox(-10F, 11F, -1.5F, 10, 3, 3, 0F,0F, 0F, 3.5F, -0.9F, 0F, 3.5F, -0.9F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.15F, 2F, -0.4F, 0.15F, 2F, -0.4F, 0.15F, 2F, 0F, 0.15F, 2F); // Import Box475
		gunModel[351].setRotationPoint(-1F, -24F, 0F);
		gunModel[351].rotateAngleZ = 0.36651914F;

		gunModel[352].addShapeBox(-7F, 0F, -1.5F, 7, 3, 3, 0F,0F, 0F, 3.6F, 0.1F, 0F, 3.6F, 0.1F, 0F, 3.6F, 0F, 0F, 3.6F, 0F, 0.15F, 2F, 0.1F, 0.25F, 2F, 0.1F, 0.25F, 2F, 0F, 0.15F, 2F); // Import Box476
		gunModel[352].setRotationPoint(-6.5F, -10.2F, 0F);
		gunModel[352].rotateAngleZ = 0.45378561F;

		gunModel[353].addShapeBox(-10F, 0F, -1.5F, 10, 3, 3, 0F,0F, 0F, 3.6F, -0.3F, 0F, 3.6F, -0.3F, 0F, 3.6F, 0F, 0F, 3.6F, 0F, 0.1F, 1.6F, -0.3F, 0.1F, 2F, -0.3F, 0.1F, 2F, 0F, 0.1F, 1.6F); // Import Box477
		gunModel[353].setRotationPoint(-12.5F, -7.3F, 0F);
		gunModel[353].rotateAngleZ = 0.54105207F;

		gunModel[354].addShapeBox(-6F, 0F, -1.5F, 6, 3, 3, 0F,0F, 0F, 3.6F, 0F, 0F, 3.6F, 0F, 0F, 3.6F, 0F, 0F, 3.6F, 0F, -0.1F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, -0.1F, 1.6F); // Import Box478
		gunModel[354].setRotationPoint(-21F, -2.2F, 0F);
		gunModel[354].rotateAngleZ = 0.73303829F;

		gunModel[355].addShapeBox(-6F, 0F, -1.5F, 6, 3, 3, 0F,-0.8F, -0.3F, 3.8F, 0F, 0F, 3.6F, 0F, 0F, 3.6F, -0.8F, -0.3F, 3.8F, 1.4F, -0.4F, 1.6F, -1F, -0.2F, 1.7F, -1F, -0.2F, 1.7F, 1.4F, -0.4F, 1.6F); // Import Box479
		gunModel[355].setRotationPoint(-25.5F, 1.8F, 0F);
		gunModel[355].rotateAngleZ = 1.06465084F;

		gunModel[356].addShapeBox(-2F, -1F, -1.5F, 2, 3, 3, 0F,-0.2F, 0F, 3.7F, 0F, 0F, 3.7F, 0F, 0F, 3.7F, -0.2F, 0F, 3.7F, -0.35F, 0.15F, 1.7F, 0.2F, 0.15F, 1.3F, 0.2F, 0.15F, 1.3F, -0.35F, 0.15F, 1.7F); // Import Box480
		gunModel[356].setRotationPoint(-27.55F, 7.55F, 0F);
		gunModel[356].rotateAngleZ = 0.26179939F;

		gunModel[357].addShapeBox(-13F, -1F, -1.5F, 13, 3, 3, 0F,-0.8F, 0F, 2.1F, -0.3F, 0F, 3.7F, -0.3F, 0F, 3.7F, -0.8F, 0F, 2.1F, -1.6F, -0.1F, 0.6F, 1.4F, -0.3F, 1.5F, 1.4F, -0.3F, 1.5F, -1.6F, -0.1F, 0.6F); // Import Box481
		gunModel[357].setRotationPoint(-29.5F, 8.1F, 0F);
		gunModel[357].rotateAngleZ = -0.27925268F;

		gunModel[358].addShapeBox(-8F, 3F, -1.5F, 8, 1, 3, 0F,0F, 1F, 3.7F, 0.1F, 1F, 3.7F, 0.1F, 1F, 3.7F, 0F, 1F, 3.7F, 0.8F, 2.1F, 3.5F, 0.2F, 1.9F, 3.5F, 0.1F, 1.9F, 3.5F, 0.8F, 2.1F, 3.5F); // Import Box482
		gunModel[358].setRotationPoint(0F, -18.8F, 0F);
		gunModel[358].rotateAngleZ = 0.33161256F;

		gunModel[359].addShapeBox(-17F, 4F, -1.5F, 9, 1, 3, 0F,-0.8F, 1.5F, 3.7F, 0F, 2F, 3.7F, 0F, 2F, 3.7F, -0.8F, 1.5F, 3.7F, -1.1F, 1.9F, 3.6F, -0.8F, 1.1F, 3.6F, -0.8F, 1.1F, 3.6F, -1.1F, 1.9F, 3.6F); // Import Box484
		gunModel[359].setRotationPoint(0F, -18.8F, 0F);
		gunModel[359].rotateAngleZ = 0.33161256F;

		gunModel[360].addShapeBox(-17F, 4F, -1.5F, 9, 1, 3, 0F,-1.2F, 2.2F, 3.7F, 0.7F, 2.7F, 3.7F, 0.7F, 2.7F, 3.7F, -1.2F, 2.2F, 3.7F, -0.6F, 2.7F, 3.6F, 1F, 0.7F, 3.6F, 1F, 0.7F, 3.6F, -0.6F, 2.7F, 3.6F); // Import Box486
		gunModel[360].setRotationPoint(-8F, -14.8F, 0F);
		gunModel[360].rotateAngleZ = 0.33161256F;

		gunModel[361].addShapeBox(-13F, 4F, -1.5F, 6, 1, 3, 0F,-5F, 3.8F, 3.7F, 2.3F, 3.6F, 3.7F, 2.3F, 3.6F, 3.7F, -5F, 3.8F, 3.7F, -2F, 3.6F, 3.6F, 1.7F, 1.2F, 3.6F, 1.7F, 1.3F, 3.6F, -2F, 3.7F, 3.6F); // Import Box487
		gunModel[361].setRotationPoint(-18F, -9.8F, 0F);
		gunModel[361].rotateAngleZ = 0.33161256F;

		gunModel[362].addShapeBox(-13F, 4F, -1.5F, 6, 1, 3, 0F,-6.4F, 6.4F, 3.7F, 4.8F, 5.1F, 3.7F, 4.8F, 5.1F, 3.7F, -6.4F, 6.5F, 3.7F, -4.1F, 6.1F, 3.7F, 1.8F, 2.4F, 3.6F, 1.8F, 2.4F, 3.6F, -4.1F, 6.1F, 3.6F); // Import Box488
		gunModel[362].setRotationPoint(-23F, -6.8F, 0F);
		gunModel[362].rotateAngleZ = 0.33161256F;

		gunModel[363].addShapeBox(0F, -4F, 0F, 4, 1, 6, 0F,1F, 9.05F, 1.5F, -3.2F, 9.15F, 1.7F, -3.2F, 9.15F, 1.7F, 1F, 9.05F, 1.5F, 1F, -7F, 1.8F, 1.2F, -7.5F, 2.2F, 1.2F, -7.5F, 2.2F, 1F, -7F, 1.8F); // Import Box489
		gunModel[363].setRotationPoint(-40F, 2F, -3F);

		gunModel[364].addShapeBox(-13F, 4F, -1.5F, 6, 1, 3, 0F,-7F, 7.9F, 3.7F, 5.1F, 4.9F, 3.7F, 5.1F, 4.9F, 3.7F, -7F, 7.9F, 3.7F, -7F, 7.6F, 3.7F, 2.9F, 7.7F, 3.7F, 2.9F, 7.7F, 3.7F, -7F, 7.6F, 3.7F); // Import Box491
		gunModel[364].setRotationPoint(-28F, -6.8F, 0F);
		gunModel[364].rotateAngleZ = 0.33161256F;

		gunModel[365].addShapeBox(0F, -4F, 0F, 8, 5, 6, 0F,-1F, 2F, 1.8F, -0.8F, 2.5F, 2.2F, -0.8F, 2.5F, 2.2F, -1F, 2F, 1.8F, -1F, -0.1F, 1.5F, 1.7F, 0F, 2.3F, 1.7F, 0F, 2.2F, -1F, -0.1F, 1.5F); // Import Box492
		gunModel[365].setRotationPoint(-42F, -2F, -3F);

		gunModel[366].addShapeBox(0F, -4F, 0F, 8, 5, 6, 0F,0F, 2F, 1.8F, 0.6F, 2F, 2.3F, 0.6F, 2F, 2.3F, 0F, 2F, 1.8F, 0F, -2.2F, 0.6F, 3.7F, 1F, 2.3F, 3.7F, 1F, 2.2F, 0F, -2.2F, 0.6F); // Import Box493
		gunModel[366].setRotationPoint(-41F, 5F, -3F);

		gunModel[367].addShapeBox(-54F, 0F, -1.5F, 7, 1, 3, 0F,0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0.1F, 0F, 1.4F, 0.5F, 0F, 1.4F, 0.5F, 0F, 1.4F, 0.1F, 0F, 1.4F); // Import Box494
		gunModel[367].setRotationPoint(-38.8F, -16.45F, 0F);
		gunModel[367].rotateAngleZ = 0.13962634F;

		gunModel[368].addShapeBox(-54F, 1F, -1.5F, 7, 2, 3, 0F,0.1F, 0F, 1.4F, 0.5F, 0F, 1.4F, 0.5F, 0F, 1.4F, 0.1F, 0F, 1.4F, 0.1F, -0.1F, 2.8F, 0.5F, -0.1F, 2.8F, 0.5F, -0.1F, 2.8F, 0.1F, -0.1F, 2.8F); // Import Box495
		gunModel[368].setRotationPoint(-38.8F, -16.45F, 0F);
		gunModel[368].rotateAngleZ = 0.13962634F;

		gunModel[369].addShapeBox(-54F, 3F, -1.5F, 7, 2, 3, 0F,0.1F, -0.1F, 2.8F, 0.5F, -0.1F, 2.8F, 0.5F, -0.1F, 2.8F, 0.1F, -0.1F, 2.8F, 0.1F, 0.2F, 3.4F, 0.5F, 0.2F, 3.4F, 0.5F, 0.2F, 3.4F, 0.1F, 0.2F, 3.4F); // Import Box496
		gunModel[369].setRotationPoint(-38.8F, -16.65F, 0F);
		gunModel[369].rotateAngleZ = 0.13962634F;

		gunModel[370].addShapeBox(-54F, 6F, -1.5F, 7, 2, 3, 0F,0.1F, 0.8F, 3.4F, 0.5F, 0.8F, 3.4F, 0.5F, 0.8F, 3.4F, 0.1F, 0.8F, 3.4F, 0.1F, 0.1F, 3.7F, 0.5F, 0.1F, 3.7F, 0.5F, 0.1F, 3.7F, 0.1F, 0.1F, 3.7F); // Import Box497
		gunModel[370].setRotationPoint(-38.8F, -16.65F, 0F);
		gunModel[370].rotateAngleZ = 0.13962634F;

		gunModel[371].addShapeBox(-54F, 8F, -1.5F, 7, 8, 3, 0F,0.1F, -0.1F, 3.7F, 0.5F, -0.1F, 3.7F, 0.5F, -0.1F, 3.7F, 0.1F, -0.1F, 3.7F, 0.2F, 0.4F, 3.4F, 0.5F, 0.4F, 3.4F, 0.5F, 0.4F, 3.4F, 0.2F, 0.4F, 3.4F); // Import Box498
		gunModel[371].setRotationPoint(-38.8F, -16.65F, 0F);
		gunModel[371].rotateAngleZ = 0.13962634F;

		gunModel[372].addShapeBox(-54F, 17F, -1.5F, 7, 11, 3, 0F,0.2F, 0.6F, 3.4F, 0.5F, 0.6F, 3.4F, 0.5F, 0.6F, 3.4F, 0.2F, 0.6F, 3.4F, 0.3F, 0.4F, 1.7F, 0.5F, 0.4F, 1.7F, 0.5F, 0.4F, 1.7F, 0.3F, 0.4F, 1.7F); // Import Box499
		gunModel[372].setRotationPoint(-38.8F, -16.65F, 0F);
		gunModel[372].rotateAngleZ = 0.13962634F;

		gunModel[373].addShapeBox(-54F, 29F, -1.5F, 7, 2, 3, 0F,0.3F, 0.6F, 1.7F, 0.5F, 0.6F, 1.7F, 0.5F, 0.6F, 1.7F, 0.3F, 0.6F, 1.7F, 0.4F, 2.4F, 0.9F, 0.5F, 0.6F, 0.9F, 0.5F, 0.6F, 0.9F, 0.4F, 2.4F, 0.9F); // Import Box500
		gunModel[373].setRotationPoint(-38.8F, -16.65F, 0F);
		gunModel[373].rotateAngleZ = 0.13962634F;

		gunModel[374].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box501
		gunModel[374].setRotationPoint(-69F, 18F, 0F);
		gunModel[374].rotateAngleY = -2.63544717F;

		gunModel[375].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box502
		gunModel[375].setRotationPoint(-69F, 18F, 0F);
		gunModel[375].rotateAngleY = -3.54301838F;

		gunModel[376].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box503
		gunModel[376].setRotationPoint(-69F, 18F, 0F);
		gunModel[376].rotateAngleY = -1.69296937F;

		gunModel[377].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box504
		gunModel[377].setRotationPoint(-69F, 18F, 0F);
		gunModel[377].rotateAngleY = -1.34390352F;

		gunModel[378].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box505
		gunModel[378].setRotationPoint(-69F, 18F, 0F);
		gunModel[378].rotateAngleY = -1.08210414F;

		gunModel[379].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box506
		gunModel[379].setRotationPoint(-69F, 18F, 0F);
		gunModel[379].rotateAngleY = -0.01745329F;

		gunModel[380].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box507
		gunModel[380].setRotationPoint(-69F, 18F, 0F);
		gunModel[380].rotateAngleY = 0.87266463F;

		gunModel[381].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box508
		gunModel[381].setRotationPoint(-69F, 18F, 0F);
		gunModel[381].rotateAngleY = 1.09955743F;

		gunModel[382].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box509
		gunModel[382].setRotationPoint(-69F, 18F, 0F);
		gunModel[382].rotateAngleY = 1.51843645F;

		gunModel[383].addBox(-1F, -0.5F, -0.5F, 2, 3, 1, 0F); // Import Box510
		gunModel[383].setRotationPoint(-69F, 18F, 0F);
		gunModel[383].rotateAngleY = 1.85004901F;

		gunModel[384].addShapeBox(-1F, 0F, -0.5F, 2, 1, 7, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box511
		gunModel[384].setRotationPoint(-69F, 19.7F, -3F);

		gunModel[385].addShapeBox(-1F, 0F, -1F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box512
		gunModel[385].setRotationPoint(-69F, 19.7F, -3.5F);
		gunModel[385].rotateAngleX = 0.62831853F;

		gunModel[386].addShapeBox(-1F, 0F, 0F, 2, 3, 1, 0F,-0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, -0.5F, -0.8F, -0.6F, -0.5F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, -0.5F, -0.8F, -1.1F, -0.5F); // Import Box513
		gunModel[386].setRotationPoint(-69F, 19.6F, -4.3F);

		gunModel[387].addShapeBox(-1F, -0.4F, -1F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box514
		gunModel[387].setRotationPoint(-69F, 22.1F, -3.5F);
		gunModel[387].rotateAngleX = -0.64577182F;

		gunModel[388].addShapeBox(-1F, 0F, -0.5F, 2, 1, 7, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box515
		gunModel[388].setRotationPoint(-69F, 21.7F, -3F);

		gunModel[389].addShapeBox(-1F, 0F, 0F, 2, 3, 1, 0F,-0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, -0.5F, -0.8F, -0.6F, -0.5F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, 0F, -0.8F, -1.1F, -0.5F, -0.8F, -1.1F, -0.5F); // Import Box516
		gunModel[389].setRotationPoint(-69F, 19.6F, 3.8F);

		gunModel[390].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box517
		gunModel[390].setRotationPoint(-69F, 19.7F, 3.5F);
		gunModel[390].rotateAngleX = -0.64577182F;

		gunModel[391].addShapeBox(-1F, -0.4F, 0F, 2, 1, 1, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Import Box518
		gunModel[391].setRotationPoint(-69F, 22.1F, 3.5F);
		gunModel[391].rotateAngleX = 0.64577182F;

		gunModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1.7F, 2.4F, -0.4F, -2F, 2.9F, -0.4F, -0.9F, 1.8F, 0F, 0.3F, 1F, 0.5F, -0.4F, -0.2F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -0.1F, 1.2F); // Import Box519
		gunModel[392].setRotationPoint(0F, -18F, 1.3F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 2.1F, -0.5F, -0.5F, 3.2F, -1.7F, 0F, 3F, 0F, 0F, 2.3F, 0F, -2.3F, 1F, -0.7F, 1F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box520
		gunModel[393].setRotationPoint(0F, -15F, -6F);

		gunModel[394].addBox(-4F, -1F, 0F, 4, 1, 2, 0F); // Import Box524
		gunModel[394].setRotationPoint(7F, -12.1F, -4.3F);
		gunModel[394].rotateAngleX = -0.62831853F;
		gunModel[394].rotateAngleZ = 0.27925268F;

		gunModel[395].addShapeBox(-4F, -1F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box526
		gunModel[395].setRotationPoint(7.3F, -11F, -2.7F);
		gunModel[395].rotateAngleX = -0.31415927F;
		gunModel[395].rotateAngleZ = 0.29670597F;

		gunModel[396].addBox(-3F, -1F, -0.5F, 3, 1, 1, 0F); // Import Box527
		gunModel[396].setRotationPoint(7F, -10.15F, 0F);
		gunModel[396].rotateAngleZ = 0.29670597F;

		gunModel[397].addShapeBox(-4F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box528
		gunModel[397].setRotationPoint(7.5F, -11F, 2.7F);
		gunModel[397].rotateAngleX = -2.84488668F;
		gunModel[397].rotateAngleZ = 0.29670597F;

		gunModel[398].addBox(-4F, 0F, 0F, 4, 1, 2, 0F); // Import Box529
		gunModel[398].setRotationPoint(7F, -12.1F, 4.3F);
		gunModel[398].rotateAngleX = -2.51327412F;
		gunModel[398].rotateAngleZ = 0.29670597F;

		gunModel[399].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1.3F, 2.05F, -0.65F, 0F, 3F, -1.7F, 0F, 3F, 0F, 0.95F, 3.05F, 0F, -1.5F, -2.7F, -1.4F, 0.5F, -3.1F, -1.7F, 1F, -1.4F, 0F, -2F, -1.1F, 0F); // Import Box522
		gunModel[399].setRotationPoint(1F, -10F, -6F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.95F, 3.05F, 0F, 0F, 3F, 0F, 0F, 3F, -1.7F, -1.3F, 2.05F, -0.65F, -2F, -1.1F, 0F, 1F, -1.4F, 0F, 0.5F, -3.1F, -1.7F, -1.5F, -2.7F, -1.4F); // Import Box523
		gunModel[400].setRotationPoint(1F, -10F, 2F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 2.3F, 0F, 0F, 3F, 0F, -0.5F, 3.2F, -1.7F, -0.5F, 2.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.7F, -2.3F, 1F, -0.7F); // Import Box524
		gunModel[401].setRotationPoint(0F, -15F, 2F);

		gunModel[402].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box525
		gunModel[402].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[402].rotateAngleZ = 0.34906585F;

		gunModel[403].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box526
		gunModel[403].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[403].rotateAngleZ = 0.6981317F;

		gunModel[404].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box527
		gunModel[404].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[404].rotateAngleZ = 1.04719755F;

		gunModel[405].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box528
		gunModel[405].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[405].rotateAngleZ = 1.3962634F;

		gunModel[406].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box529
		gunModel[406].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[406].rotateAngleZ = 1.72787596F;

		gunModel[407].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box530
		gunModel[407].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[407].rotateAngleZ = 2.05948852F;

		gunModel[408].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box531
		gunModel[408].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[408].rotateAngleZ = 2.39110108F;

		gunModel[409].addShapeBox(-5.5F, -0.5F, -1F, 11, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box532
		gunModel[409].setRotationPoint(24.75F, -7.8F, -2F);
		gunModel[409].rotateAngleZ = 2.75762022F;

		gunModel[410].addShapeBox(-7F, 0F, 1.5F, 7, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Import Box533
		gunModel[410].setRotationPoint(0F, -20.9F, 0F);
		gunModel[410].rotateAngleZ = 0.33161256F;

		gunModel[411].addShapeBox(-8F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box538
		gunModel[411].setRotationPoint(6F, -26.2F, 0F);
		gunModel[411].rotateAngleZ = 0.73303829F;

		gunModel[412].addBox(0F, 0F, -1.5F, 36, 1, 3, 0F); // Import Box541
		gunModel[412].setRotationPoint(6F, -26.2F, 0F);

		gunModel[413].addShapeBox(1F, 0F, -1F, 2, 1, 2, 0F,0F, -0.3F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.3F, -0.1F, -1.4F, 2F, -0.1F, 2F, 2F, -0.1F, 2F, 2F, 0F, -1.4F, 2F, 0F); // Import Box545
		gunModel[413].setRotationPoint(-5F, -22F, 0F);

		gunModel[414].addShapeBox(1F, 0F, -1F, 3, 1, 2, 0F,0F, -1.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -1.1F, 0.1F, -0.4F, 1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.2F, -0.4F, 1F, 0.2F); // Import Box546
		gunModel[414].setRotationPoint(-8F, -22F, 0F);

		gunModel[415].addShapeBox(1F, 0F, -3F, 3, 1, 2, 0F,0F, -1.5F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.2F, -0.1F, 0F, -1.1F, -0.1F, -0.2F, 1.1F, 0.1F, 0.2F, 0.2F, 0.1F, 0.6F, 0.1F, -0.1F, -0.4F, 1F, -0.1F); // Import Box547
		gunModel[415].setRotationPoint(-8F, -22F, 0F);

		gunModel[416].addShapeBox(1F, 0F, -3F, 3, 1, 2, 0F,0F, -1.1F, -0.1F, -0.2F, -0.2F, -0.1F, 0F, -0.6F, 0.1F, 0F, -1.5F, 0.1F, -0.1F, 0.5F, -0.1F, -0.1F, -0.4F, -0.1F, 0.2F, 0.2F, 0.1F, -0.2F, 1.1F, 0.1F); // Import Box548
		gunModel[416].setRotationPoint(-8F, -22F, -2F);

		gunModel[417].addShapeBox(1F, 0F, -1F, 3, 1, 2, 0F,-0.1F, -0.8F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.2F, -0.1F, -0.8F, -0.2F, 0F, 0.2F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.8F, 0.1F, 0F, 0.1F, 0.1F); // Import Box549
		gunModel[417].setRotationPoint(-8F, -22F, 0F);

		gunModel[418].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box571
		gunModel[418].setRotationPoint(5.7F, -20.8F, -4.2F);
		gunModel[418].rotateAngleZ = 1.25663706F;

		gunModel[419].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box572
		gunModel[419].setRotationPoint(5.7F, -20.8F, -4.2F);
		gunModel[419].rotateAngleZ = 1.85004901F;

		gunModel[420].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box573
		gunModel[420].setRotationPoint(5.7F, -20.8F, -4.2F);
		gunModel[420].rotateAngleZ = 2.46091425F;

		gunModel[421].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box574
		gunModel[421].setRotationPoint(5.7F, -20.8F, -4.2F);
		gunModel[421].rotateAngleZ = 3.05432619F;

		gunModel[422].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box575
		gunModel[422].setRotationPoint(5.7F, -20.8F, -4.2F);
		gunModel[422].rotateAngleZ = 3.70009801F;

		gunModel[423].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box576
		gunModel[423].setRotationPoint(12.7F, -17.8F, -4.2F);
		gunModel[423].rotateAngleZ = 3.82227106F;

		gunModel[424].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box577
		gunModel[424].setRotationPoint(12.7F, -17.8F, -4.2F);
		gunModel[424].rotateAngleZ = 4.4331363F;

		gunModel[425].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box578
		gunModel[425].setRotationPoint(12.7F, -17.8F, -4.2F);
		gunModel[425].rotateAngleZ = 3.22885912F;

		gunModel[426].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box579
		gunModel[426].setRotationPoint(12.7F, -17.8F, -4.2F);
		gunModel[426].rotateAngleZ = 2.58308729F;

		gunModel[427].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F); // Import Box580
		gunModel[427].setRotationPoint(12.7F, -17.8F, -4.2F);
		gunModel[427].rotateAngleZ = 1.90240888F;

		gunModel[428].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box581
		gunModel[428].setRotationPoint(5.7F, -20.8F, 5.2F);
		gunModel[428].rotateAngleZ = 2.46091425F;

		gunModel[429].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box582
		gunModel[429].setRotationPoint(5.7F, -20.8F, 5.2F);
		gunModel[429].rotateAngleZ = 3.05432619F;

		gunModel[430].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box583
		gunModel[430].setRotationPoint(5.7F, -20.8F, 5.2F);
		gunModel[430].rotateAngleZ = 3.66519143F;

		gunModel[431].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box584
		gunModel[431].setRotationPoint(5.7F, -20.8F, 5.2F);
		gunModel[431].rotateAngleZ = 4.27605667F;

		gunModel[432].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box585
		gunModel[432].setRotationPoint(5.7F, -20.8F, 5.2F);
		gunModel[432].rotateAngleZ = 4.93928178F;

		gunModel[433].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box586
		gunModel[433].setRotationPoint(3.7F, -14.8F, 5.2F);
		gunModel[433].rotateAngleZ = 4.93928178F;

		gunModel[434].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box587
		gunModel[434].setRotationPoint(3.7F, -14.8F, 5.2F);
		gunModel[434].rotateAngleZ = 4.32841654F;

		gunModel[435].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box588
		gunModel[435].setRotationPoint(3.7F, -14.8F, 5.2F);
		gunModel[435].rotateAngleZ = 3.75245789F;

		gunModel[436].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box589
		gunModel[436].setRotationPoint(3.7F, -14.8F, 5.2F);
		gunModel[436].rotateAngleZ = 3.19395253F;

		gunModel[437].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box590
		gunModel[437].setRotationPoint(3.7F, -14.8F, 5.2F);
		gunModel[437].rotateAngleZ = 2.58308729F;

		gunModel[438].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box591
		gunModel[438].setRotationPoint(3.7F, -14.8F, 5.2F);
		gunModel[438].rotateAngleZ = 2.47836754F;

		gunModel[439].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box592
		gunModel[439].setRotationPoint(13.7F, -17.8F, 5.2F);
		gunModel[439].rotateAngleZ = 2.47836754F;

		gunModel[440].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box593
		gunModel[440].setRotationPoint(13.7F, -17.8F, 5.2F);
		gunModel[440].rotateAngleZ = 3.07177948F;

		gunModel[441].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box594
		gunModel[441].setRotationPoint(13.7F, -17.8F, 5.2F);
		gunModel[441].rotateAngleZ = 3.70009801F;

		gunModel[442].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box595
		gunModel[442].setRotationPoint(13.7F, -17.8F, 5.2F);
		gunModel[442].rotateAngleZ = 4.31096325F;

		gunModel[443].addShapeBox(-5F, -0.5F, -1F, 10, 1, 1, 0F,-4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F, -4.2F, -0.2F, 0F, -4.2F, -0.2F, 0F, -4.4F, -0.3F, -0.8F, -4.4F, -0.3F, -0.8F); // Import Box596
		gunModel[443].setRotationPoint(13.7F, -17.8F, 5.2F);
		gunModel[443].rotateAngleZ = 4.99164166F;

		gunModel[444].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 1F, 0F, -2.6F, 1F, 0F, -3F, 0F, 0F, -2F, 0F); // Import Box597
		gunModel[444].setRotationPoint(117F, -19F, 0F);
		gunModel[444].rotateAngleX = -2.02458193F;

		gunModel[445].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -2.6F, 0F, 0F, -2.4F, 0F, 0F, -1.4F, 0F); // Import Box598
		gunModel[445].setRotationPoint(117F, -18F, 0F);
		gunModel[445].rotateAngleX = -1.76278254F;

		gunModel[446].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -2.4F, 0F, 0F, -2.2F, 0F, 0F, -1.2F, 0F); // Import Box599
		gunModel[446].setRotationPoint(117F, -18F, 0F);
		gunModel[446].rotateAngleX = -1.51843645F;

		gunModel[447].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -2.2F, 0F, 0F, -1.8F, 0F, 0F, -0.8F, 0F); // Import Box600
		gunModel[447].setRotationPoint(117F, -18F, 0F);
		gunModel[447].rotateAngleX = -1.29154365F;

		gunModel[448].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F); // Import Box601
		gunModel[448].setRotationPoint(117F, -18F, 0F);
		gunModel[448].rotateAngleX = -1.08210414F;

		gunModel[449].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F); // Import Box602
		gunModel[449].setRotationPoint(117F, -18F, 0F);
		gunModel[449].rotateAngleX = -0.89011792F;

		gunModel[450].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box603
		gunModel[450].setRotationPoint(117F, -18F, 0F);
		gunModel[450].rotateAngleX = -0.6981317F;

		gunModel[451].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box604
		gunModel[451].setRotationPoint(117F, -18F, 0F);
		gunModel[451].rotateAngleX = -0.52359878F;

		gunModel[452].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box605
		gunModel[452].setRotationPoint(117F, -18F, 0F);
		gunModel[452].rotateAngleX = -0.34906585F;

		gunModel[453].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box606
		gunModel[453].setRotationPoint(117F, -18F, 0F);
		gunModel[453].rotateAngleX = -0.17453293F;

		gunModel[454].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box607
		gunModel[454].setRotationPoint(117F, -18F, 0F);

		gunModel[455].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box608
		gunModel[455].setRotationPoint(117F, -18F, 0F);
		gunModel[455].rotateAngleX = 0.17453293F;

		gunModel[456].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box609
		gunModel[456].setRotationPoint(117F, -18F, 0F);
		gunModel[456].rotateAngleX = 0.34906585F;

		gunModel[457].addShapeBox(0F, -3.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box610
		gunModel[457].setRotationPoint(117F, -18F, 0F);
		gunModel[457].rotateAngleX = 0.52359878F;

		gunModel[458].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F); // Import Box611
		gunModel[458].setRotationPoint(117F, -18F, 0F);
		gunModel[458].rotateAngleX = 0.6981317F;

		gunModel[459].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F); // Import Box612
		gunModel[459].setRotationPoint(117F, -18F, 0F);
		gunModel[459].rotateAngleX = 0.89011792F;

		gunModel[460].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, 0F, 0F, -1.8F, 0F, 0F, -0.8F, 0F); // Import Box613
		gunModel[460].setRotationPoint(117F, -18F, 0F);
		gunModel[460].rotateAngleX = 1.08210414F;

		gunModel[461].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, 0F, -2.2F, 0F, 0F, -1.2F, 0F); // Import Box614
		gunModel[461].setRotationPoint(117F, -18F, 0F);
		gunModel[461].rotateAngleX = 1.29154365F;

		gunModel[462].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -2.2F, 0F, 0F, -2.4F, 0F, 0F, -1.4F, 0F); // Import Box615
		gunModel[462].setRotationPoint(117F, -18F, 0F);
		gunModel[462].rotateAngleX = 1.51843645F;

		gunModel[463].addShapeBox(0F, -2.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -2.4F, 0F, 0F, -2.6F, 0F, 0F, -1.6F, 0F); // Import Box616
		gunModel[463].setRotationPoint(117F, -18F, 0F);
		gunModel[463].rotateAngleX = 1.76278254F;

		gunModel[464].addShapeBox(0F, -2.5F, -1.5F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2.6F, 1F, 0F, -1.6F, 1F); // Import Box617
		gunModel[464].setRotationPoint(117F, -19F, 0F);
		gunModel[464].rotateAngleX = 2.00712864F;

		gunModel[465].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[465].setRotationPoint(12.5F, -27.2F, 0F);

		gunModel[466].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[466].setRotationPoint(14F, -27.2F, 0F);

		gunModel[467].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[467].setRotationPoint(15.5F, -27.2F, 0F);

		gunModel[468].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[468].setRotationPoint(17F, -27.2F, 0F);

		gunModel[469].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[469].setRotationPoint(18.5F, -27.2F, 0F);

		gunModel[470].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[470].setRotationPoint(20F, -27.2F, 0F);

		gunModel[471].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[471].setRotationPoint(21.5F, -27.2F, 0F);

		gunModel[472].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[472].setRotationPoint(23F, -27.2F, 0F);

		gunModel[473].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[473].setRotationPoint(24.5F, -27.2F, 0F);

		gunModel[474].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[474].setRotationPoint(26F, -27.2F, 0F);

		gunModel[475].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[475].setRotationPoint(27.5F, -27.2F, 0F);

		gunModel[476].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[476].setRotationPoint(29F, -27.2F, 0F);

		gunModel[477].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[477].setRotationPoint(30.5F, -27.2F, 0F);

		gunModel[478].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[478].setRotationPoint(32F, -27.2F, 0F);

		gunModel[479].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[479].setRotationPoint(33.5F, -27.2F, 0F);

		gunModel[480].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[480].setRotationPoint(35F, -27.2F, 0F);

		gunModel[481].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[481].setRotationPoint(36.5F, -27.2F, 0F);

		gunModel[482].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[482].setRotationPoint(38F, -27.2F, 0F);

		gunModel[483].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[483].setRotationPoint(39.5F, -27.2F, 0F);

		gunModel[484].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[484].setRotationPoint(41F, -27.2F, 0F);

		gunModel[485].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[485].setRotationPoint(42.5F, -27.2F, 0F);

		gunModel[486].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[486].setRotationPoint(44F, -27.2F, 0F);

		gunModel[487].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[487].setRotationPoint(45.5F, -27.2F, 0F);

		gunModel[488].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[488].setRotationPoint(48.5F, -27.2F, 0F);

		gunModel[489].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box360
		gunModel[489].setRotationPoint(47F, -27.2F, 0F);

		gunModel[490].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box638
		gunModel[490].setRotationPoint(11F, -27.2F, -4F);

		gunModel[491].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box639
		gunModel[491].setRotationPoint(12.5F, -27.2F, -4F);

		gunModel[492].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box640
		gunModel[492].setRotationPoint(14F, -27.2F, -4F);

		gunModel[493].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box641
		gunModel[493].setRotationPoint(15.5F, -27.2F, -4F);

		gunModel[494].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box642
		gunModel[494].setRotationPoint(17F, -27.2F, -4F);

		gunModel[495].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box643
		gunModel[495].setRotationPoint(18.5F, -27.2F, -4F);

		gunModel[496].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box644
		gunModel[496].setRotationPoint(20F, -27.2F, -4F);

		gunModel[497].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box645
		gunModel[497].setRotationPoint(21.5F, -27.2F, -4F);

		gunModel[498].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box646
		gunModel[498].setRotationPoint(23F, -27.2F, -4F);

		gunModel[499].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box647
		gunModel[499].setRotationPoint(24.5F, -27.2F, -4F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import Box648
		gunModel[501] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Import Box649
		gunModel[502] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Import Box650
		gunModel[503] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import Box651
		gunModel[504] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import Box652
		gunModel[505] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Import Box653
		gunModel[506] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import Box654
		gunModel[507] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import Box655
		gunModel[508] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import Box656
		gunModel[509] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import Box657
		gunModel[510] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Import Box658
		gunModel[511] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Import Box659
		gunModel[512] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Import Box660
		gunModel[513] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Import Box661
		gunModel[514] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Import Box662
		gunModel[515] = new ModelRendererTurbo(this, 1033, 81, textureX, textureY); // Import Box663

		gunModel[500].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box648
		gunModel[500].setRotationPoint(26F, -27.2F, -4F);

		gunModel[501].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box649
		gunModel[501].setRotationPoint(27.5F, -27.2F, -4F);

		gunModel[502].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box650
		gunModel[502].setRotationPoint(29F, -27.2F, -4F);

		gunModel[503].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box651
		gunModel[503].setRotationPoint(30.5F, -27.2F, -4F);

		gunModel[504].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box652
		gunModel[504].setRotationPoint(32F, -27.2F, -4F);

		gunModel[505].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box653
		gunModel[505].setRotationPoint(33.5F, -27.2F, -4F);

		gunModel[506].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box654
		gunModel[506].setRotationPoint(35F, -27.2F, -4F);

		gunModel[507].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box655
		gunModel[507].setRotationPoint(36.5F, -27.2F, -4F);

		gunModel[508].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box656
		gunModel[508].setRotationPoint(38F, -27.2F, -4F);

		gunModel[509].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box657
		gunModel[509].setRotationPoint(39.5F, -27.2F, -4F);

		gunModel[510].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box658
		gunModel[510].setRotationPoint(41F, -27.2F, -4F);

		gunModel[511].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box659
		gunModel[511].setRotationPoint(42.5F, -27.2F, -4F);

		gunModel[512].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box660
		gunModel[512].setRotationPoint(44F, -27.2F, -4F);

		gunModel[513].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box661
		gunModel[513].setRotationPoint(45.5F, -27.2F, -4F);

		gunModel[514].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box662
		gunModel[514].setRotationPoint(48.5F, -27.2F, -4F);

		gunModel[515].addShapeBox(0F, -1F, 1.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box663
		gunModel[515].setRotationPoint(47F, -27.2F, -4F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box3
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box4
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box5
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Import Box6
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Import Box7
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 1633, 1, textureX, textureY); // Import Box8
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box9
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box10
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Import Box11
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Import Box12
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 1081, 9, textureX, textureY); // Import Box15
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 1345, 9, textureX, textureY); // Import Box16
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 1609, 9, textureX, textureY); // Import Box17
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box18
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import Box19
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box20
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import Box21
		defaultBarrelModel[18] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Import Box321
		defaultBarrelModel[19] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import Box322
		defaultBarrelModel[20] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Import Box325
		defaultBarrelModel[21] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import Box330
		defaultBarrelModel[22] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Import Box332
		defaultBarrelModel[23] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Import Box333
		defaultBarrelModel[24] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Import Box334
		defaultBarrelModel[25] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import Box335
		defaultBarrelModel[26] = new ModelRendererTurbo(this, 1233, 57, textureX, textureY); // Import Box336
		defaultBarrelModel[27] = new ModelRendererTurbo(this, 1241, 57, textureX, textureY); // Import Box337
		defaultBarrelModel[28] = new ModelRendererTurbo(this, 1249, 57, textureX, textureY); // Import Box338
		defaultBarrelModel[29] = new ModelRendererTurbo(this, 1257, 57, textureX, textureY); // Import Box340
		defaultBarrelModel[30] = new ModelRendererTurbo(this, 1273, 57, textureX, textureY); // Import Box341
		defaultBarrelModel[31] = new ModelRendererTurbo(this, 1289, 57, textureX, textureY); // Import Box342
		defaultBarrelModel[32] = new ModelRendererTurbo(this, 1297, 57, textureX, textureY); // Import Box343
		defaultBarrelModel[33] = new ModelRendererTurbo(this, 1305, 57, textureX, textureY); // Import Box344
		defaultBarrelModel[34] = new ModelRendererTurbo(this, 1313, 57, textureX, textureY); // Import Box345
		defaultBarrelModel[35] = new ModelRendererTurbo(this, 1321, 57, textureX, textureY); // Import Box346
		defaultBarrelModel[36] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Import Box347
		defaultBarrelModel[37] = new ModelRendererTurbo(this, 1337, 57, textureX, textureY); // Import Box348
		defaultBarrelModel[38] = new ModelRendererTurbo(this, 1345, 57, textureX, textureY); // Import Box349
		defaultBarrelModel[39] = new ModelRendererTurbo(this, 1353, 57, textureX, textureY); // Import Box350
		defaultBarrelModel[40] = new ModelRendererTurbo(this, 1361, 57, textureX, textureY); // Import Box352
		defaultBarrelModel[41] = new ModelRendererTurbo(this, 1473, 57, textureX, textureY); // Import Box353
		defaultBarrelModel[42] = new ModelRendererTurbo(this, 1489, 57, textureX, textureY); // Import Box354
		defaultBarrelModel[43] = new ModelRendererTurbo(this, 1505, 57, textureX, textureY); // Import Box355

		defaultBarrelModel[0].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(41F, -23F, 0F);

		defaultBarrelModel[1].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box3
		defaultBarrelModel[1].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[1].rotateAngleX = 0.31415927F;

		defaultBarrelModel[2].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box4
		defaultBarrelModel[2].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[2].rotateAngleX = 0.62831853F;

		defaultBarrelModel[3].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box5
		defaultBarrelModel[3].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[3].rotateAngleX = 0.9424778F;

		defaultBarrelModel[4].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box6
		defaultBarrelModel[4].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[4].rotateAngleX = 1.25663706F;

		defaultBarrelModel[5].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box7
		defaultBarrelModel[5].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[5].rotateAngleX = 1.57079633F;

		defaultBarrelModel[6].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box8
		defaultBarrelModel[6].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[6].rotateAngleX = 1.88495559F;

		defaultBarrelModel[7].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box9
		defaultBarrelModel[7].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[7].rotateAngleX = 2.19911486F;

		defaultBarrelModel[8].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box10
		defaultBarrelModel[8].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[8].rotateAngleX = 2.47836754F;

		defaultBarrelModel[9].addShapeBox(0F, -3F, -0.5F, 133, 6, 1, 0F,0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0F, 0F); // Import Box11
		defaultBarrelModel[9].setRotationPoint(41F, -23F, 0F);
		defaultBarrelModel[9].rotateAngleX = 2.8099801F;

		defaultBarrelModel[10].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box12
		defaultBarrelModel[10].setRotationPoint(41F, -18F, 0F);

		defaultBarrelModel[11].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box15
		defaultBarrelModel[11].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[11].rotateAngleX = 0.40142573F;

		defaultBarrelModel[12].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box16
		defaultBarrelModel[12].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[12].rotateAngleX = 0.80285146F;

		defaultBarrelModel[13].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box17
		defaultBarrelModel[13].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[13].rotateAngleX = 1.20427718F;

		defaultBarrelModel[14].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box18
		defaultBarrelModel[14].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[14].rotateAngleX = 1.60570291F;

		defaultBarrelModel[15].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box19
		defaultBarrelModel[15].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[15].rotateAngleX = 2.00712864F;

		defaultBarrelModel[16].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box20
		defaultBarrelModel[16].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[16].rotateAngleX = 2.40855437F;

		defaultBarrelModel[17].addShapeBox(0F, -3F, -0.5F, 130, 6, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Import Box21
		defaultBarrelModel[17].setRotationPoint(41F, -18F, 0F);
		defaultBarrelModel[17].rotateAngleX = 2.7925268F;

		defaultBarrelModel[18].addShapeBox(0F, -3F, -0.5F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F); // Import Box321
		defaultBarrelModel[18].setRotationPoint(42F, -23.2F, 0F);

		defaultBarrelModel[19].addShapeBox(0F, -3F, -0.5F, 2, 6, 1, 0F,0F, 0.1F, 0.3F, -0.5F, -0.05F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F); // Import Box322
		defaultBarrelModel[19].setRotationPoint(42F, -23.2F, 0F);
		defaultBarrelModel[19].rotateAngleX = 0.33161256F;

		defaultBarrelModel[20].addShapeBox(0F, -3F, -0.5F, 3, 6, 1, 0F,0F, 0.8F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F); // Import Box325
		defaultBarrelModel[20].setRotationPoint(41F, -23.2F, 0F);
		defaultBarrelModel[20].rotateAngleX = 1.32645023F;

		defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box330
		defaultBarrelModel[21].setRotationPoint(42F, -18.1F, -4.3F);

		defaultBarrelModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Import Box332
		defaultBarrelModel[22].setRotationPoint(42F, -16.1F, -4.3F);

		defaultBarrelModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box333
		defaultBarrelModel[23].setRotationPoint(42F, -20.1F, -4.3F);

		defaultBarrelModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box334
		defaultBarrelModel[24].setRotationPoint(43F, -18.1F, -4.3F);

		defaultBarrelModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.1F, 0.4F, 0F, 0F, 0.3F, 0.1F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F); // Import Box335
		defaultBarrelModel[25].setRotationPoint(43F, -15.1F, -4.3F);

		defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box336
		defaultBarrelModel[26].setRotationPoint(43F, -20.1F, -4.3F);

		defaultBarrelModel[27].addShapeBox(0F, -3F, 0F, 1, 2, 1, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box337
		defaultBarrelModel[27].setRotationPoint(43F, -19.1F, -4.3F);

		defaultBarrelModel[28].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box338
		defaultBarrelModel[28].setRotationPoint(42F, -20.1F, -4.3F);

		defaultBarrelModel[29].addShapeBox(0F, -3F, -0.5F, 3, 6, 1, 0F,0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F); // Import Box340
		defaultBarrelModel[29].setRotationPoint(41F, -23.2F, 0F);
		defaultBarrelModel[29].rotateAngleX = 1.08210414F;

		defaultBarrelModel[30].addShapeBox(0F, -3F, -0.5F, 3, 6, 1, 0F,0F, 0.6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F); // Import Box341
		defaultBarrelModel[30].setRotationPoint(41F, -23.2F, 0F);
		defaultBarrelModel[30].rotateAngleX = 0.75049158F;

		defaultBarrelModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.3F, 0.1F, 1.1F, 0.4F, 0F); // Import Box342
		defaultBarrelModel[31].setRotationPoint(43F, -15.1F, 3.3F);

		defaultBarrelModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box343
		defaultBarrelModel[32].setRotationPoint(43F, -18.1F, 3.3F);

		defaultBarrelModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box344
		defaultBarrelModel[33].setRotationPoint(43F, -20.1F, 3.3F);

		defaultBarrelModel[34].addShapeBox(0F, -3F, 0F, 1, 2, 1, 0F,0.5F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.2F); // Import Box345
		defaultBarrelModel[34].setRotationPoint(43F, -19.1F, 3.3F);

		defaultBarrelModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0.5F, 0F, 0.3F, 0F); // Import Box346
		defaultBarrelModel[35].setRotationPoint(42F, -16.1F, 3.3F);

		defaultBarrelModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box347
		defaultBarrelModel[36].setRotationPoint(42F, -18.1F, 3.3F);

		defaultBarrelModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box348
		defaultBarrelModel[37].setRotationPoint(42F, -20.1F, 3.3F);

		defaultBarrelModel[38].addShapeBox(0F, -3F, 0F, 1, 2, 1, 0F,0.5F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.2F); // Import Box349
		defaultBarrelModel[38].setRotationPoint(43F, -19.1F, 3.3F);

		defaultBarrelModel[39].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Import Box350
		defaultBarrelModel[39].setRotationPoint(42F, -20.1F, 3.3F);

		defaultBarrelModel[40].addShapeBox(0F, -3F, -0.5F, 3, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.8F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Import Box352
		defaultBarrelModel[40].setRotationPoint(41F, -23.2F, 0F);
		defaultBarrelModel[40].rotateAngleX = 1.76278254F;

		defaultBarrelModel[41].addShapeBox(0F, -3F, -0.5F, 3, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.65F, 0F); // Import Box353
		defaultBarrelModel[41].setRotationPoint(41F, -23.2F, 0F);
		defaultBarrelModel[41].rotateAngleX = 2.02458193F;

		defaultBarrelModel[42].addShapeBox(0F, -3F, -0.5F, 3, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.6F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F); // Import Box354
		defaultBarrelModel[42].setRotationPoint(41F, -23.2F, 0F);
		defaultBarrelModel[42].rotateAngleX = 2.35619449F;

		defaultBarrelModel[43].addShapeBox(0F, -3F, -0.5F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, -0.5F, -0.05F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box355
		defaultBarrelModel[43].setRotationPoint(42F, -23.2F, 0F);
		defaultBarrelModel[43].rotateAngleX = 2.8099801F;
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box196
		pumpModel[1] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Import Box238
		pumpModel[2] = new ModelRendererTurbo(this, 1793, 49, textureX, textureY); // Import Box246
		pumpModel[3] = new ModelRendererTurbo(this, 1849, 49, textureX, textureY); // Import Box247
		pumpModel[4] = new ModelRendererTurbo(this, 1905, 49, textureX, textureY); // Import Box248
		pumpModel[5] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Import Box249
		pumpModel[6] = new ModelRendererTurbo(this, 1025, 73, textureX, textureY); // Import Box534
		pumpModel[7] = new ModelRendererTurbo(this, 1041, 73, textureX, textureY); // Import Box535
		pumpModel[8] = new ModelRendererTurbo(this, 1057, 73, textureX, textureY); // Import Box536
		pumpModel[9] = new ModelRendererTurbo(this, 1137, 65, textureX, textureY); // Import Box537
		pumpModel[10] = new ModelRendererTurbo(this, 1073, 73, textureX, textureY); // Import Box539
		pumpModel[11] = new ModelRendererTurbo(this, 1089, 73, textureX, textureY); // Import Box540
		pumpModel[12] = new ModelRendererTurbo(this, 1777, 65, textureX, textureY); // Import Box542
		pumpModel[13] = new ModelRendererTurbo(this, 1833, 65, textureX, textureY); // Import Box543
		pumpModel[14] = new ModelRendererTurbo(this, 1865, 65, textureX, textureY); // Import Box544

		pumpModel[0].addBox(0F, 0F, -1.5F, 3, 1, 3, 0F); // Import Box196
		pumpModel[0].setRotationPoint(1F, -21.2F, 0F);

		pumpModel[1].addShapeBox(0F, -0.5F, -3F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box238
		pumpModel[1].setRotationPoint(18F, -22.4F, -0.8F);

		pumpModel[2].addShapeBox(0F, -0.5F, -3F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box246
		pumpModel[2].setRotationPoint(18F, -22.4F, -0.8F);
		pumpModel[2].rotateAngleX = 0.33161256F;

		pumpModel[3].addShapeBox(0F, -0.5F, -3F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box247
		pumpModel[3].setRotationPoint(18F, -22.4F, -0.8F);
		pumpModel[3].rotateAngleX = 0.66322512F;

		pumpModel[4].addShapeBox(0F, -0.5F, -3F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box248
		pumpModel[4].setRotationPoint(18F, -22.4F, -0.8F);
		pumpModel[4].rotateAngleX = -0.33161256F;

		pumpModel[5].addShapeBox(0F, -0.5F, -3F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		pumpModel[5].setRotationPoint(18F, -22.4F, -0.8F);
		pumpModel[5].rotateAngleX = -0.66322512F;

		pumpModel[6].addShapeBox(-7F, 0F, -1.5F, 5, 1, 1, 0F,-1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box534
		pumpModel[6].setRotationPoint(6F, -26.2F, 0F);
		pumpModel[6].rotateAngleZ = 0.73303829F;

		pumpModel[7].addShapeBox(-8F, 0F, -1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box535
		pumpModel[7].setRotationPoint(6F, -26.2F, 0F);
		pumpModel[7].rotateAngleZ = 0.73303829F;

		pumpModel[8].addShapeBox(-7F, 0F, -1.5F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box536
		pumpModel[8].setRotationPoint(6F, -26.2F, 2F);
		pumpModel[8].rotateAngleZ = 0.73303829F;

		pumpModel[9].addShapeBox(-8F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box537
		pumpModel[9].setRotationPoint(6F, -26.2F, 2F);
		pumpModel[9].rotateAngleZ = 0.73303829F;

		pumpModel[10].addShapeBox(-7F, 0F, -1.5F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 1F, -1.5F, 0F, 1F); // Import Box539
		pumpModel[10].setRotationPoint(6F, -26.2F, 2F);
		pumpModel[10].rotateAngleZ = 0.73303829F;

		pumpModel[11].addShapeBox(0F, 0F, -1.5F, 2, 5, 2, 0F,-0.5F, -0.2F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Import Box540
		pumpModel[11].setRotationPoint(3F, -24.2F, 0.5F);

		pumpModel[12].addShapeBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box542
		pumpModel[12].setRotationPoint(3.2F, -23.1F, 0F);

		pumpModel[13].addShapeBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box543
		pumpModel[13].setRotationPoint(3.2F, -23.1F, 0F);
		pumpModel[13].rotateAngleX = 1.06465084F;

		pumpModel[14].addShapeBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box544
		pumpModel[14].setRotationPoint(3.2F, -23.1F, 0F);
		pumpModel[14].rotateAngleX = -1.02974426F;
	}

	private void initleverActionModel_1()
	{
		leverActionModel[0] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box449
		leverActionModel[1] = new ModelRendererTurbo(this, 2025, 57, textureX, textureY); // Import Box450
		leverActionModel[2] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import Box451
		leverActionModel[3] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import Box452
		leverActionModel[4] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Import Box453
		leverActionModel[5] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import Box454
		leverActionModel[6] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import Box455
		leverActionModel[7] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Import Box456
		leverActionModel[8] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import Box458
		leverActionModel[9] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Import Box459
		leverActionModel[10] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import Box460
		leverActionModel[11] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import Box423
		leverActionModel[12] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box426
		leverActionModel[13] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import Box427
		leverActionModel[14] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import Box428
		leverActionModel[15] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Import Box429
		leverActionModel[16] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Import Box430
		leverActionModel[17] = new ModelRendererTurbo(this, 1265, 73, textureX, textureY); // Import Box550
		leverActionModel[18] = new ModelRendererTurbo(this, 1281, 73, textureX, textureY); // Import Box552
		leverActionModel[19] = new ModelRendererTurbo(this, 1297, 73, textureX, textureY); // Import Box553
		leverActionModel[20] = new ModelRendererTurbo(this, 1313, 73, textureX, textureY); // Import Box554
		leverActionModel[21] = new ModelRendererTurbo(this, 1329, 73, textureX, textureY); // Import Box555
		leverActionModel[22] = new ModelRendererTurbo(this, 1345, 73, textureX, textureY); // Import Box556
		leverActionModel[23] = new ModelRendererTurbo(this, 1361, 73, textureX, textureY); // Import Box557
		leverActionModel[24] = new ModelRendererTurbo(this, 1377, 73, textureX, textureY); // Import Box558
		leverActionModel[25] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Import Box559
		leverActionModel[26] = new ModelRendererTurbo(this, 1409, 73, textureX, textureY); // Import Box561
		leverActionModel[27] = new ModelRendererTurbo(this, 1433, 73, textureX, textureY); // Import Box562
		leverActionModel[28] = new ModelRendererTurbo(this, 1761, 73, textureX, textureY); // Import Box563
		leverActionModel[29] = new ModelRendererTurbo(this, 1777, 73, textureX, textureY); // Import Box564
		leverActionModel[30] = new ModelRendererTurbo(this, 1793, 73, textureX, textureY); // Import Box565
		leverActionModel[31] = new ModelRendererTurbo(this, 1809, 73, textureX, textureY); // Import Box566

		leverActionModel[0].addBox(0F, 0F, -1F, 3, 5, 2, 0F); // Import Box449
		leverActionModel[0].setRotationPoint(22F, -11.6F, 0F);

		leverActionModel[1].addShapeBox(0F, 0F, -1F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Import Box450
		leverActionModel[1].setRotationPoint(21F, -11.6F, 0F);

		leverActionModel[2].addShapeBox(0F, 0F, -1F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F); // Import Box451
		leverActionModel[2].setRotationPoint(20F, -11.6F, 0F);

		leverActionModel[3].addShapeBox(0F, 0F, -1F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 1.9F, 0F); // Import Box452
		leverActionModel[3].setRotationPoint(19F, -11.6F, 0F);

		leverActionModel[4].addShapeBox(0F, 0F, -1F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.9F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, 3.9F, 0F); // Import Box453
		leverActionModel[4].setRotationPoint(18F, -11.6F, 0F);

		leverActionModel[5].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.1F, 1.5F, 0F); // Import Box454
		leverActionModel[5].setRotationPoint(17F, -12.6F, 0F);

		leverActionModel[6].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0.1F, 1.5F, 0F, 0.1F, 1.5F, 0F, 0F, 0.9F, 0F); // Import Box455
		leverActionModel[6].setRotationPoint(16F, -12.6F, 0F);

		leverActionModel[7].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.6F, 0F, 0F, 0.7F, 0.6F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0.7F, 0.6F, 0F); // Import Box456
		leverActionModel[7].setRotationPoint(15F, -12.6F, 0F);

		leverActionModel[8].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.1F, 1.3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.1F, 1.3F, 0F, -0.1F, -1F, 0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, -0.1F, -1F, 0F); // Import Box458
		leverActionModel[8].setRotationPoint(17F, -2.6F, 0F);

		leverActionModel[9].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0.5F, 0F, 0.1F, 1.3F, 0F, 0.1F, 1.3F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0F, -0.2F, 0F); // Import Box459
		leverActionModel[9].setRotationPoint(16F, -2.6F, 0F);

		leverActionModel[10].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0.7F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.7F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0.1F, 0F); // Import Box460
		leverActionModel[10].setRotationPoint(15F, -2.6F, 0F);

		leverActionModel[11].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,5F, -1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 5F, -1F, 0F, 5F, 0.9F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 5F, 0.9F, 0F); // Import Box423
		leverActionModel[11].setRotationPoint(13F, -2.6F, 0F);

		leverActionModel[12].addShapeBox(0F, 0F, -1F, 2, 10, 2, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 3.8F, 0F, -0.6F, 3.2F, 0F, -0.6F, 3.2F, 0F, 0F, 3.8F, 0F); // Import Box426
		leverActionModel[12].setRotationPoint(1.5F, -12.6F, 0F);

		leverActionModel[13].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0.1F, 3F, 0F, -0.1F, 1.3F, 0F, -0.1F, 1.3F, 0F, 0.1F, 3F, 0F, 0.1F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.2F, 0F); // Import Box427
		leverActionModel[13].setRotationPoint(3F, -1.6F, 0F);

		leverActionModel[14].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0.1F, 1.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, 1.3F, 0F, 0.1F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.1F, -0.1F, 0F); // Import Box428
		leverActionModel[14].setRotationPoint(4F, -1.6F, 0F);

		leverActionModel[15].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0.5F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box429
		leverActionModel[15].setRotationPoint(5F, -1.6F, 0F);

		leverActionModel[16].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0.3F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.1F, 0F, 0.4F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.4F, -0.2F, 0F); // Import Box430
		leverActionModel[16].setRotationPoint(7F, -1.6F, 0F);

		leverActionModel[17].addShapeBox(0F, 0F, -1F, 2, 10, 2, 0F,-0.9F, -12.3F, 0F, 0F, -9.95F, 0F, 0F, -9.95F, 0F, -0.9F, -12.3F, 0F, -0.9F, 4.4F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, -0.9F, 4.4F, 0F); // Import Box550
		leverActionModel[17].setRotationPoint(-0.5F, -12.6F, 0F);

		leverActionModel[18].addShapeBox(0F, 0F, -1F, 2, 9, 2, 0F,-0.9F, 4.4F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, -0.9F, 4.4F, 0F, -0.9F, -10.1F, 0F, 0F, -8.8F, 0F, 0F, -8.8F, 0F, -0.9F, -10.1F, 0F); // Import Box552
		leverActionModel[18].setRotationPoint(-0.5F, -5.6F, 0F);

		leverActionModel[19].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,0F, -15F, 0F, -1.1F, -12.3F, 0F, -1.1F, -12.3F, 0F, 0F, -15F, 0F, 0F, 6.7F, 0F, -1.1F, 4.4F, 0F, -1.1F, 4.4F, 0F, 0F, 6.7F, 0F); // Import Box553
		leverActionModel[19].setRotationPoint(-3.5F, -12.6F, 0F);

		leverActionModel[20].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-1.1F, -17.4F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -1.1F, -17.4F, 0F, -1.1F, 8.9F, 0F, 0F, 6.7F, 0F, 0F, 6.7F, 0F, -1.1F, 8.9F, 0F); // Import Box554
		leverActionModel[20].setRotationPoint(-8.5F, -12.6F, 0F);

		leverActionModel[21].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,0F, -20.5F, 0F, -0.9F, -17.4F, 0F, -0.9F, -17.4F, 0F, 0F, -20.5F, 0F, 0F, 11.8F, 0F, -0.9F, 8.9F, 0F, -0.9F, 8.7F, 0F, 0F, 11.8F, 0F); // Import Box555
		leverActionModel[21].setRotationPoint(-11.5F, -12.6F, 0F);

		leverActionModel[22].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-0.9F, -22.5F, 0F, 0F, -20.5F, 0F, 0F, -20.5F, 0F, -0.9F, -22.5F, 0F, -0.9F, 14F, 0F, 0F, 11.8F, 0F, 0F, 11.8F, 0F, -0.9F, 14F, 0F); // Import Box556
		leverActionModel[22].setRotationPoint(-16.5F, -12.6F, 0F);

		leverActionModel[23].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-0.6F, -21.7F, 0F, -1.1F, -22.5F, 0F, -1.1F, -22.5F, 0F, -0.6F, -21.7F, 0F, -0.6F, 13.3F, 0F, -1.1F, 14F, 0F, -1.1F, 14F, 0F, -0.6F, 13.3F, 0F); // Import Box557
		leverActionModel[23].setRotationPoint(-19.5F, -12.6F, 0F);

		leverActionModel[24].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-3.6F, -20.5F, 0F, -0.4F, -21.7F, 0F, -0.4F, -21.7F, 0F, -3.6F, -20.5F, 0F, -2.8F, 11.7F, 0F, -0.4F, 13.3F, 0F, -0.4F, 13.3F, 0F, -2.8F, 11.7F, 0F); // Import Box558
		leverActionModel[24].setRotationPoint(-23.5F, -12.6F, 0F);

		leverActionModel[25].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-4.5F, -20.2F, 0F, -0.4F, -21.5F, 0F, -0.4F, -21.5F, 0F, -4.5F, -20.2F, 0F, -3.4F, 10.4F, 0F, -1.2F, 12.7F, 0F, -1.2F, 12.7F, 0F, -3.4F, 10.4F, 0F); // Import Box559
		leverActionModel[25].setRotationPoint(-24.5F, -13.6F, 0F);

		leverActionModel[26].addShapeBox(0F, 0F, -1F, 6, 10, 2, 0F,0F, -15.6F, 0F, -1.1F, -13.6F, 0F, -1.1F, -13.6F, 0F, 0F, -15.6F, 0F, 0F, 6.7F, 0F, -1.1F, 4.9F, 0F, -1.1F, 4.9F, 0F, 0F, 6.7F, 0F); // Import Box561
		leverActionModel[26].setRotationPoint(-4.5F, -21.6F, 0F);

		leverActionModel[27].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-1.1F, -17.6F, 0F, 0F, -15.6F, 0F, 0F, -15.6F, 0F, -1.1F, -17.6F, 0F, -1.1F, 8.8F, 0F, 0F, 6.7F, 0F, 0F, 6.7F, 0F, -1.1F, 8.8F, 0F); // Import Box562
		leverActionModel[27].setRotationPoint(-9.5F, -21.6F, 0F);

		leverActionModel[28].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,0F, -19.9F, 0F, -0.9F, -17.6F, 0F, -0.9F, -17.6F, 0F, 0F, -20F, 0F, 0F, 11.3F, 0F, -0.9F, 8.8F, 0F, -0.9F, 8.8F, 0F, 0F, 11.3F, 0F); // Import Box563
		leverActionModel[28].setRotationPoint(-12.5F, -21.6F, 0F);

		leverActionModel[29].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-0.9F, -23.4F, 0F, 0F, -20.9F, 0F, 0F, -20.9F, 0F, -0.9F, -23.3F, 0F, -0.9F, 14.7F, 0F, 0F, 12.3F, 0F, 0F, 12.3F, 0F, -0.9F, 14.7F, 0F); // Import Box564
		leverActionModel[29].setRotationPoint(-17.5F, -22.6F, 0F);

		leverActionModel[30].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-0.4F, -26F, 0F, -1.1F, -23.4F, 0F, -1.1F, -23.3F, 0F, -0.4F, -26F, 0F, -0.9F, 17F, 0F, -1.1F, 14.7F, 0F, -1.1F, 14.7F, 0F, -0.9F, 17F, 0F); // Import Box565
		leverActionModel[30].setRotationPoint(-20.5F, -22.6F, 0F);

		leverActionModel[31].addShapeBox(0F, 0F, -1F, 5, 10, 2, 0F,-3.4F, 9.6F, 0F, -0.6F, 13F, 0F, -0.6F, 13F, 0F, -3.4F, 9.6F, 0F, -4.5F, -19.8F, 0F, -0.1F, -22F, 0F, -0.1F, -22F, 0F, -4.5F, -19.8F, 0F); // Import Box566
		leverActionModel[31].setRotationPoint(-24.5F, 16.4F, 0F);
	}

	private void initbreakActionModel_1()
	{
		breakActionModel[0] = new ModelRendererTurbo(this, 1345, 65, textureX, textureY); // Import Box567
		breakActionModel[1] = new ModelRendererTurbo(this, 1449, 65, textureX, textureY); // Import Box568
		breakActionModel[2] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Import Box569
		breakActionModel[3] = new ModelRendererTurbo(this, 1657, 65, textureX, textureY); // Import Box570

		breakActionModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		breakActionModel[0].setRotationPoint(5F, -10F, -0.5F);

		breakActionModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.4F, 1F, 0F, 0.4F, 1F, 0F, -0.5F, 1F, 0F); // Import Box568
		breakActionModel[1].setRotationPoint(5F, -9F, -0.5F);

		breakActionModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 1F, 0F, 0.4F, 1F, 0F, 0.4F, 1F, 0F, -0.5F, 1F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F); // Import Box569
		breakActionModel[2].setRotationPoint(5F, -6F, -0.5F);

		breakActionModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -0.1F, 0F, 2.4F, -0.1F, 0F, 2.4F, -0.1F, 0F, -2.5F, -0.1F, 0F); // Import Box570
		breakActionModel[3].setRotationPoint(5F, -5F, -0.5F);
	}
}