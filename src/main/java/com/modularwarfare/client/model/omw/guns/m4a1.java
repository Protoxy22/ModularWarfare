package com.modularwarfare.client.model.omw.guns; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m4a1 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public m4a1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[215];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 98
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 99
		gunModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 100
		gunModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 101
		gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 102
		gunModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 116
		gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 219
		gunModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 18
		gunModel[16] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 25
		gunModel[22] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 26
		gunModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 27
		gunModel[24] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 28
		gunModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30
		gunModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 32
		gunModel[28] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 33
		gunModel[29] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 34
		gunModel[30] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 35
		gunModel[31] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 36
		gunModel[32] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 37
		gunModel[33] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 38
		gunModel[34] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 39
		gunModel[35] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 40
		gunModel[36] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 41
		gunModel[37] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 42
		gunModel[38] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 43
		gunModel[39] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 44
		gunModel[40] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 45
		gunModel[41] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 46
		gunModel[42] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 47
		gunModel[43] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 48
		gunModel[44] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 49
		gunModel[45] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 50
		gunModel[46] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 51
		gunModel[47] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 52
		gunModel[48] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 53
		gunModel[49] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 58
		gunModel[50] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 59
		gunModel[51] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 60
		gunModel[52] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 61
		gunModel[53] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 62
		gunModel[54] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 63
		gunModel[55] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 64
		gunModel[56] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 65
		gunModel[57] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 66
		gunModel[58] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 67
		gunModel[59] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 68
		gunModel[60] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 131
		gunModel[61] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 132
		gunModel[62] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 133
		gunModel[63] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 134
		gunModel[64] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 135
		gunModel[65] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 136
		gunModel[66] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 137
		gunModel[67] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 138
		gunModel[68] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 139
		gunModel[69] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 140
		gunModel[70] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 141
		gunModel[71] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 142
		gunModel[72] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 143
		gunModel[73] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 82
		gunModel[74] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 83
		gunModel[75] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 84
		gunModel[76] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 85
		gunModel[77] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 86
		gunModel[78] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 87
		gunModel[79] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 88
		gunModel[80] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 89
		gunModel[81] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 90
		gunModel[82] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 91
		gunModel[83] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 92
		gunModel[84] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 93
		gunModel[85] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 94
		gunModel[86] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 95
		gunModel[87] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 96
		gunModel[88] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 97
		gunModel[89] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 98
		gunModel[90] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 99
		gunModel[91] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 100
		gunModel[92] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 101
		gunModel[93] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 102
		gunModel[94] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 124
		gunModel[95] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 125
		gunModel[96] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 126
		gunModel[97] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 127
		gunModel[98] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 128
		gunModel[99] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 129
		gunModel[100] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 130
		gunModel[101] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 131
		gunModel[102] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 132
		gunModel[103] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 133
		gunModel[104] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 134
		gunModel[105] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 135
		gunModel[106] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 136
		gunModel[107] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 137
		gunModel[108] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 138
		gunModel[109] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 139
		gunModel[110] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 140
		gunModel[111] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 141
		gunModel[112] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 142
		gunModel[113] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 143
		gunModel[114] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 144
		gunModel[115] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 145
		gunModel[116] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 147
		gunModel[117] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 148
		gunModel[118] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 149
		gunModel[119] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 150
		gunModel[120] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 151
		gunModel[121] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 152
		gunModel[122] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 153
		gunModel[123] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 154
		gunModel[124] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 155
		gunModel[125] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 156
		gunModel[126] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 157
		gunModel[127] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 158
		gunModel[128] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 159
		gunModel[129] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 160
		gunModel[130] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 161
		gunModel[131] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 162
		gunModel[132] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 163
		gunModel[133] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 164
		gunModel[134] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 165
		gunModel[135] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 166
		gunModel[136] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 167
		gunModel[137] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 168
		gunModel[138] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 169
		gunModel[139] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 170
		gunModel[140] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 171
		gunModel[141] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 172
		gunModel[142] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 173
		gunModel[143] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 174
		gunModel[144] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 175
		gunModel[145] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 176
		gunModel[146] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 177
		gunModel[147] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 178
		gunModel[148] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 179
		gunModel[149] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 180
		gunModel[150] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 181
		gunModel[151] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 182
		gunModel[152] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 183
		gunModel[153] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 184
		gunModel[154] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 185
		gunModel[155] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 186
		gunModel[156] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 187
		gunModel[157] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 188
		gunModel[158] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 189
		gunModel[159] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 190
		gunModel[160] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 191
		gunModel[161] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 192
		gunModel[162] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 193
		gunModel[163] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 194
		gunModel[164] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 195
		gunModel[165] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 196
		gunModel[166] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 197
		gunModel[167] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 198
		gunModel[168] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 199
		gunModel[169] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 200
		gunModel[170] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 201
		gunModel[171] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 202
		gunModel[172] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 203
		gunModel[173] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 204
		gunModel[174] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 205
		gunModel[175] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 206
		gunModel[176] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 207
		gunModel[177] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 208
		gunModel[178] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 209
		gunModel[179] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 210
		gunModel[180] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 211
		gunModel[181] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 212
		gunModel[182] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 213
		gunModel[183] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 214
		gunModel[184] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 215
		gunModel[185] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 216
		gunModel[186] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 217
		gunModel[187] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 221
		gunModel[188] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 222
		gunModel[189] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 223
		gunModel[190] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 224
		gunModel[191] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 225
		gunModel[192] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 226
		gunModel[193] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 227
		gunModel[194] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 228
		gunModel[195] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 229
		gunModel[196] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 230
		gunModel[197] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 231
		gunModel[198] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 232
		gunModel[199] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 233
		gunModel[200] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 234
		gunModel[201] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 235
		gunModel[202] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 236
		gunModel[203] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 238
		gunModel[204] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 240
		gunModel[205] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 241
		gunModel[206] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 242
		gunModel[207] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 243
		gunModel[208] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 244
		gunModel[209] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 245
		gunModel[210] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 246
		gunModel[211] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 247
		gunModel[212] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 248
		gunModel[213] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 249
		gunModel[214] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 250

		gunModel[0].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 4
		gunModel[0].setRotationPoint(-24.5F, -17.2F, -2F);

		gunModel[1].addBox(-6F, 0F, 0F, 6, 11, 4, 0F); // Box 7
		gunModel[1].setRotationPoint(-17F, -17.2F, -2F);
		gunModel[1].rotateAngleZ = -0.64577182F;

		gunModel[2].addBox(-6.15F, 0F, 0F, 8, 4, 4, 0F); // Box 8
		gunModel[2].setRotationPoint(-22.55F, -10.2F, -2F);
		gunModel[2].rotateAngleZ = -0.31415927F;

		gunModel[3].addBox(-5.55F, -0.2F, 0F, 6, 11, 4, 0F); // Box 10
		gunModel[3].setRotationPoint(-17.5F, -17.2F, -2F);
		gunModel[3].rotateAngleZ = -0.45378561F;

		gunModel[4].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 98
		gunModel[4].setRotationPoint(-16F, -22F, -2F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 99
		gunModel[5].setRotationPoint(-16.2F, -18.7F, -1.5F);
		gunModel[5].rotateAngleZ = 0.61086524F;

		gunModel[6].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 100
		gunModel[6].setRotationPoint(-15F, -18F, -1.5F);

		gunModel[7].addBox(0F, -1F, 0F, 2, 1, 3, 0F); // Box 101
		gunModel[7].setRotationPoint(-8.65F, -17.05F, -1.5F);
		gunModel[7].rotateAngleZ = 0.62831853F;

		gunModel[8].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 102
		gunModel[8].setRotationPoint(-8F, -22F, -2F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 116
		gunModel[9].setRotationPoint(-13.5F, -22.6F, -0.5F);
		gunModel[9].rotateAngleZ = 0.08726646F;

		gunModel[10].addBox(-6F, 0F, 0F, 1, 1, 4, 0F); // Box 219
		gunModel[10].setRotationPoint(-16.2F, -6.85F, -2.01F);

		gunModel[11].addBox(-6F, 0F, 0F, 6, 5, 4, 0F); // Box 14
		gunModel[11].setRotationPoint(-16F, -22F, -2F);

		gunModel[12].addBox(-6F, 0F, 0F, 15, 7, 4, 0F); // Box 15
		gunModel[12].setRotationPoint(-16F, -29F, -2F);

		gunModel[13].addBox(-6F, 0F, 0F, 5, 4, 4, 0F); // Box 16
		gunModel[13].setRotationPoint(-21F, -29F, -2F);

		gunModel[14].addBox(1F, 1.8F, 0F, 3, 1, 4, 0F); // Box 17
		gunModel[14].setRotationPoint(-22.5F, -28F, -2.01F);
		gunModel[14].rotateAngleZ = -0.75049158F;

		gunModel[15].addBox(-6F, 0F, 0F, 11, 11, 5, 0F); // Box 18
		gunModel[15].setRotationPoint(-1.25F, -29F, -2.5F);

		gunModel[16].addBox(-6F, 0F, 0F, 3, 11, 1, 0F); // Box 19
		gunModel[16].setRotationPoint(0F, -28.5F, 1.98F);

		gunModel[17].addBox(-6.01F, 9.25F, 0F, 11, 1, 6, 0F); // Box 20
		gunModel[17].setRotationPoint(-1.75F, -27.5F, -3.01F);
		gunModel[17].rotateAngleZ = 0.05235988F;

		gunModel[18].addBox(0F, 0F, 0F, 33, 2, 5, 0F); // Box 21
		gunModel[18].setRotationPoint(-28F, -32F, -2.5F);

		gunModel[19].addBox(0F, 0F, 0F, 33, 1, 3, 0F); // Box 22
		gunModel[19].setRotationPoint(-28F, -30F, -1.5F);

		gunModel[20].addBox(0F, 0F, 0F, 33, 2, 1, 0F); // Box 24
		gunModel[20].setRotationPoint(-28F, -30F, -2.5F);
		gunModel[20].rotateAngleX = 0.61086524F;

		gunModel[21].addBox(0F, 0F, -1F, 33, 2, 1, 0F); // Box 25
		gunModel[21].setRotationPoint(-28F, -30F, 2.5F);
		gunModel[21].rotateAngleX = -0.61086524F;

		gunModel[22].addBox(0F, 0F, 0F, 33, 2, 1, 0F); // Box 26
		gunModel[22].setRotationPoint(-28F, -33.62F, -1.35F);
		gunModel[22].rotateAngleX = -0.61086524F;

		gunModel[23].addBox(0F, 0F, -1F, 33, 2, 1, 0F); // Box 27
		gunModel[23].setRotationPoint(-28F, -33.62F, 1.35F);
		gunModel[23].rotateAngleX = 0.61086524F;

		gunModel[24].addBox(0F, 0F, 0F, 64, 2, 3, 0F); // Box 28
		gunModel[24].setRotationPoint(-22F, -35F, -1.5F);

		gunModel[25].addBox(0F, 0F, 0F, 60, 1, 3, 0F); // Box 30
		gunModel[25].setRotationPoint(-19F, -36F, -1.49F);

		gunModel[26].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 31
		gunModel[26].setRotationPoint(-12F, -36.5F, -1.51F);

		gunModel[27].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 32
		gunModel[27].setRotationPoint(-10.5F, -36.5F, -1.51F);

		gunModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 33
		gunModel[28].setRotationPoint(-7.5F, -36.5F, -1.51F);

		gunModel[29].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 34
		gunModel[29].setRotationPoint(-9F, -36.5F, -1.51F);

		gunModel[30].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 35
		gunModel[30].setRotationPoint(-4.5F, -36.5F, -1.51F);

		gunModel[31].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 36
		gunModel[31].setRotationPoint(-6F, -36.5F, -1.51F);

		gunModel[32].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 37
		gunModel[32].setRotationPoint(4.5F, -36.5F, -1.51F);

		gunModel[33].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 38
		gunModel[33].setRotationPoint(3F, -36.5F, -1.51F);

		gunModel[34].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 39
		gunModel[34].setRotationPoint(1.5F, -36.5F, -1.51F);

		gunModel[35].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 40
		gunModel[35].setRotationPoint(0F, -36.5F, -1.51F);

		gunModel[36].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 41
		gunModel[36].setRotationPoint(-1.5F, -36.5F, -1.51F);

		gunModel[37].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 42
		gunModel[37].setRotationPoint(-3F, -36.5F, -1.51F);

		gunModel[38].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 43
		gunModel[38].setRotationPoint(23.5F, -27F, -1.51F);

		gunModel[39].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 44
		gunModel[39].setRotationPoint(22F, -27F, -1.51F);

		gunModel[40].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 45
		gunModel[40].setRotationPoint(20.5F, -27F, -1.51F);

		gunModel[41].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 46
		gunModel[41].setRotationPoint(19F, -27F, -1.51F);

		gunModel[42].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 47
		gunModel[42].setRotationPoint(17.5F, -27F, -1.51F);

		gunModel[43].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 48
		gunModel[43].setRotationPoint(16F, -27F, -1.51F);

		gunModel[44].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 49
		gunModel[44].setRotationPoint(14.5F, -27F, -1.51F);

		gunModel[45].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 50
		gunModel[45].setRotationPoint(13F, -27F, -1.51F);

		gunModel[46].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 51
		gunModel[46].setRotationPoint(11.5F, -27F, -1.51F);

		gunModel[47].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 52
		gunModel[47].setRotationPoint(10F, -27F, -1.51F);

		gunModel[48].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 53
		gunModel[48].setRotationPoint(8.5F, -27F, -1.51F);

		gunModel[49].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 58
		gunModel[49].setRotationPoint(34F, -27F, -1.51F);

		gunModel[50].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 59
		gunModel[50].setRotationPoint(32.5F, -27F, -1.51F);

		gunModel[51].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 60
		gunModel[51].setRotationPoint(31F, -27F, -1.51F);

		gunModel[52].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 61
		gunModel[52].setRotationPoint(29.5F, -27F, -1.51F);

		gunModel[53].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 62
		gunModel[53].setRotationPoint(28F, -27F, -1.51F);

		gunModel[54].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 63
		gunModel[54].setRotationPoint(26.5F, -27F, -1.51F);

		gunModel[55].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 64
		gunModel[55].setRotationPoint(25F, -27F, -1.51F);

		gunModel[56].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 65
		gunModel[56].setRotationPoint(35.5F, -27F, -1.51F);

		gunModel[57].addBox(0F, 0F, 0F, 33, 2, 3, 0F); // Box 66
		gunModel[57].setRotationPoint(-28F, -33.5F, -1.5F);

		gunModel[58].addBox(0F, 0F, 0F, 33, 1, 3, 0F); // Box 67
		gunModel[58].setRotationPoint(-28F, -29.3F, -1.5F);

		gunModel[59].addBox(0F, 0F, 0F, 38, 4, 4, 0F); // Box 68
		gunModel[59].setRotationPoint(-66F, -32.75F, -2F);

		gunModel[60].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
		gunModel[60].setRotationPoint(-17.5F, -41F, -1.99F);

		gunModel[61].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 132
		gunModel[61].setRotationPoint(-15.5F, -41F, -2.01F);
		gunModel[61].rotateAngleZ = -0.78539816F;

		gunModel[62].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 133
		gunModel[62].setRotationPoint(-17.5F, -41F, -2.01F);
		gunModel[62].rotateAngleZ = 0.78539816F;

		gunModel[63].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 134
		gunModel[63].setRotationPoint(-18.9F, -39.6F, -2.02F);

		gunModel[64].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 135
		gunModel[64].setRotationPoint(-17.1F, -39.6F, 1F);

		gunModel[65].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
		gunModel[65].setRotationPoint(-17.5F, -41F, 0.99F);

		gunModel[66].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 137
		gunModel[66].setRotationPoint(-15.5F, -41F, 1.01F);
		gunModel[66].rotateAngleZ = -0.78539816F;

		gunModel[67].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 138
		gunModel[67].setRotationPoint(-17.5F, -41F, 1.01F);
		gunModel[67].rotateAngleZ = 0.78539816F;

		gunModel[68].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 139
		gunModel[68].setRotationPoint(-18.9F, -39.6F, 1.02F);

		gunModel[69].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 140
		gunModel[69].setRotationPoint(-17.6F, -39F, -2.98F);

		gunModel[70].addBox(0F, -1F, -1F, 1, 4, 4, 0F); // Box 141
		gunModel[70].setRotationPoint(-16.9F, -40.5F, -0.97F);

		gunModel[71].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 142
		gunModel[71].setRotationPoint(-16.1F, -37.5F, -2.01F);

		gunModel[72].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		gunModel[72].setRotationPoint(-16.1F, -38.5F, -2F);
		gunModel[72].rotateAngleZ = -0.15707963F;

		gunModel[73].addBox(0F, 0F, 0F, 28, 7, 6, 0F); // Box 82
		gunModel[73].setRotationPoint(-66F, -32.5F, -3F);

		gunModel[74].addBox(0F, 0F, 0F, 3, 11, 3, 0F); // Box 83
		gunModel[74].setRotationPoint(-66F, -25.5F, -1.51F);

		gunModel[75].addBox(0F, -6F, 0F, 18, 6, 3, 0F); // Box 84
		gunModel[75].setRotationPoint(-63F, -14.5F, -1.5F);
		gunModel[75].rotateAngleZ = 0.6981317F;

		gunModel[76].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 85
		gunModel[76].setRotationPoint(-63F, -24.5F, -1.49F);

		gunModel[77].addBox(0F, 0F, 0F, 3, 20, 6, 0F); // Box 86
		gunModel[77].setRotationPoint(-69F, -33.5F, -3F);

		gunModel[78].addBox(0F, -7F, 0F, 11, 7, 4, 0F); // Box 87
		gunModel[78].setRotationPoint(-53F, -23F, -2F);

		gunModel[79].addBox(0F, -3F, 0F, 5, 3, 3, 0F); // Box 88
		gunModel[79].setRotationPoint(-42F, -23F, -1.5F);
		gunModel[79].rotateAngleZ = 0.76794487F;

		gunModel[80].addBox(0F, -3F, 0F, 8, 3, 4, 0F); // Box 89
		gunModel[80].setRotationPoint(-55F, -18F, -2F);
		gunModel[80].rotateAngleZ = 0.6981317F;

		gunModel[81].addBox(0F, 0F, 0F, 28, 1, 3, 0F); // Box 90
		gunModel[81].setRotationPoint(-66F, -33.5F, -1.5F);

		gunModel[82].addBox(0F, 0F, 0F, 28, 1, 2, 0F); // Box 91
		gunModel[82].setRotationPoint(-66F, -33.5F, 1.5F);
		gunModel[82].rotateAngleX = -0.80285146F;

		gunModel[83].addBox(0F, 0F, -2F, 28, 1, 2, 0F); // Box 92
		gunModel[83].setRotationPoint(-66F, -33.5F, -1.5F);
		gunModel[83].rotateAngleX = 0.80285146F;

		gunModel[84].addBox(0F, -3F, 0F, 5, 2, 3, 0F); // Box 93
		gunModel[84].setRotationPoint(-38F, -26.25F, -1.5F);

		gunModel[85].addBox(-6F, 0F, 0F, 14, 1, 1, 0F); // Box 94
		gunModel[85].setRotationPoint(-4.25F, -29.1F, -3F);

		gunModel[86].addBox(0F, -7F, 0F, 2, 2, 2, 0F); // Box 95
		gunModel[86].setRotationPoint(-48F, -16F, -1F);

		gunModel[87].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 96
		gunModel[87].setRotationPoint(-25F, -35.75F, -1F);

		gunModel[88].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 97
		gunModel[88].setRotationPoint(-25F, -35.8F, -1.99F);

		gunModel[89].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 98
		gunModel[89].setRotationPoint(-25F, -35.3F, -2F);

		gunModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		gunModel[90].setRotationPoint(-24F, -35.8F, -1.99F);

		gunModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 100
		gunModel[91].setRotationPoint(-24F, -35.3F, -2F);

		gunModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		gunModel[92].setRotationPoint(-24F, -35.8F, 1.01F);

		gunModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		gunModel[93].setRotationPoint(-24F, -35.3F, 1F);

		gunModel[94].addBox(0F, 0F, 0F, 37, 5, 5, 0F); // Box 124
		gunModel[94].setRotationPoint(5F, -33F, -2.5F);

		gunModel[95].addBox(0F, 0F, 0F, 37, 1, 4, 0F); // Box 125
		gunModel[95].setRotationPoint(5F, -28F, -2F);

		gunModel[96].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 126
		gunModel[96].setRotationPoint(37F, -27F, -1.51F);

		gunModel[97].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 127
		gunModel[97].setRotationPoint(5.75F, -27F, -1.51F);

		gunModel[98].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 128
		gunModel[98].setRotationPoint(38.5F, -27F, -1.51F);

		gunModel[99].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 129
		gunModel[99].setRotationPoint(6.5F, -32F, 2.5F);

		gunModel[100].addBox(0F, 0.01F, 0F, 35, 3, 1, 0F); // Box 130
		gunModel[100].setRotationPoint(6F, -32F, 2F);

		gunModel[101].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 131
		gunModel[101].setRotationPoint(8F, -32F, 2.5F);

		gunModel[102].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 132
		gunModel[102].setRotationPoint(11F, -32F, 2.5F);

		gunModel[103].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 133
		gunModel[103].setRotationPoint(9.5F, -32F, 2.5F);

		gunModel[104].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 134
		gunModel[104].setRotationPoint(17F, -32F, 2.5F);

		gunModel[105].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 135
		gunModel[105].setRotationPoint(15.5F, -32F, 2.5F);

		gunModel[106].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 136
		gunModel[106].setRotationPoint(12.5F, -32F, 2.5F);

		gunModel[107].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 137
		gunModel[107].setRotationPoint(14F, -32F, 2.5F);

		gunModel[108].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 138
		gunModel[108].setRotationPoint(29F, -32F, 2.5F);

		gunModel[109].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 139
		gunModel[109].setRotationPoint(27.5F, -32F, 2.5F);

		gunModel[110].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 140
		gunModel[110].setRotationPoint(24.5F, -32F, 2.5F);

		gunModel[111].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 141
		gunModel[111].setRotationPoint(26F, -32F, 2.5F);

		gunModel[112].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 142
		gunModel[112].setRotationPoint(23F, -32F, 2.5F);

		gunModel[113].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 143
		gunModel[113].setRotationPoint(21.5F, -32F, 2.5F);

		gunModel[114].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 144
		gunModel[114].setRotationPoint(20F, -32F, 2.5F);

		gunModel[115].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 145
		gunModel[115].setRotationPoint(18.5F, -32F, 2.5F);

		gunModel[116].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 147
		gunModel[116].setRotationPoint(39.5F, -32F, 2.5F);

		gunModel[117].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 148
		gunModel[117].setRotationPoint(36.5F, -32F, 2.5F);

		gunModel[118].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 149
		gunModel[118].setRotationPoint(38F, -32F, 2.5F);

		gunModel[119].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 150
		gunModel[119].setRotationPoint(35F, -32F, 2.5F);

		gunModel[120].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 151
		gunModel[120].setRotationPoint(33.5F, -32F, 2.5F);

		gunModel[121].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 152
		gunModel[121].setRotationPoint(32F, -32F, 2.5F);

		gunModel[122].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 153
		gunModel[122].setRotationPoint(30.5F, -32F, 2.5F);

		gunModel[123].addBox(0F, 0F, -1F, 37, 3, 1, 0F); // Box 154
		gunModel[123].setRotationPoint(5F, -35F, 1.5F);
		gunModel[123].rotateAngleX = 0.48869219F;

		gunModel[124].addBox(0F, 0F, 0F, 37, 3, 1, 0F); // Box 155
		gunModel[124].setRotationPoint(5F, -35F, -1.5F);
		gunModel[124].rotateAngleX = -0.48869219F;

		gunModel[125].addBox(0F, 0F, -1F, 37, 1, 1, 0F); // Box 156
		gunModel[125].setRotationPoint(5F, -28F, 2.5F);
		gunModel[125].rotateAngleX = -0.48869219F;

		gunModel[126].addBox(0F, 0F, 0F, 37, 1, 1, 0F); // Box 157
		gunModel[126].setRotationPoint(5F, -28F, -2.5F);
		gunModel[126].rotateAngleX = 0.48869219F;

		gunModel[127].addBox(-0.01F, 0F, 0F, 1, 10, 1, 0F); // Box 158
		gunModel[127].setRotationPoint(2.75F, -28.1F, -3F);

		gunModel[128].addBox(0F, 0.01F, 0F, 35, 3, 1, 0F); // Box 159
		gunModel[128].setRotationPoint(6F, -32F, -3F);

		gunModel[129].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 160
		gunModel[129].setRotationPoint(39.5F, -32F, -3.5F);

		gunModel[130].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 161
		gunModel[130].setRotationPoint(38F, -32F, -3.5F);

		gunModel[131].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 162
		gunModel[131].setRotationPoint(36.5F, -32F, -3.5F);

		gunModel[132].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 163
		gunModel[132].setRotationPoint(35F, -32F, -3.5F);

		gunModel[133].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 164
		gunModel[133].setRotationPoint(33.5F, -32F, -3.5F);

		gunModel[134].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 165
		gunModel[134].setRotationPoint(30.5F, -32F, -3.5F);

		gunModel[135].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 166
		gunModel[135].setRotationPoint(29F, -32F, -3.5F);

		gunModel[136].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 167
		gunModel[136].setRotationPoint(27.5F, -32F, -3.5F);

		gunModel[137].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 168
		gunModel[137].setRotationPoint(26F, -32F, -3.5F);

		gunModel[138].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 169
		gunModel[138].setRotationPoint(24.5F, -32F, -3.5F);

		gunModel[139].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 170
		gunModel[139].setRotationPoint(18.5F, -32F, -3.5F);

		gunModel[140].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 171
		gunModel[140].setRotationPoint(17F, -32F, -3.5F);

		gunModel[141].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 172
		gunModel[141].setRotationPoint(15.5F, -32F, -3.5F);

		gunModel[142].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 173
		gunModel[142].setRotationPoint(14F, -32F, -3.5F);

		gunModel[143].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 174
		gunModel[143].setRotationPoint(11F, -32F, -3.5F);

		gunModel[144].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 175
		gunModel[144].setRotationPoint(9.5F, -32F, -3.5F);

		gunModel[145].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 176
		gunModel[145].setRotationPoint(8F, -32F, -3.5F);

		gunModel[146].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 177
		gunModel[146].setRotationPoint(6.5F, -32F, -3.5F);

		gunModel[147].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 178
		gunModel[147].setRotationPoint(23F, -32F, -3.5F);

		gunModel[148].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 179
		gunModel[148].setRotationPoint(21.5F, -32F, -3.5F);

		gunModel[149].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 180
		gunModel[149].setRotationPoint(20F, -32F, -3.5F);

		gunModel[150].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 181
		gunModel[150].setRotationPoint(32F, -32F, -3.5F);

		gunModel[151].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 182
		gunModel[151].setRotationPoint(12.5F, -32F, -3.5F);

		gunModel[152].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 183
		gunModel[152].setRotationPoint(42F, -32.25F, -2.5F);

		gunModel[153].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		gunModel[153].setRotationPoint(42F, -34.25F, -2F);

		gunModel[154].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		gunModel[154].setRotationPoint(42F, -29.25F, -2F);

		gunModel[155].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 186
		gunModel[155].setRotationPoint(44F, -32.25F, -2F);

		gunModel[156].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 187
		gunModel[156].setRotationPoint(51.5F, -32.25F, -2F);

		gunModel[157].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 188
		gunModel[157].setRotationPoint(47.75F, -32.01F, -1.23F);

		gunModel[158].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 189
		gunModel[158].setRotationPoint(47.75F, -32F, -1.74F);

		gunModel[159].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 190
		gunModel[159].setRotationPoint(47.75F, -31.4F, -1.24F);

		gunModel[160].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 191
		gunModel[160].setRotationPoint(47.75F, -31.4F, -1.75F);

		gunModel[161].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 192
		gunModel[161].setRotationPoint(57F, -31.4F, -1.25F);

		gunModel[162].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 193
		gunModel[162].setRotationPoint(57F, -31.4F, -1.75F);

		gunModel[163].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 194
		gunModel[163].setRotationPoint(57F, -32F, -1.75F);

		gunModel[164].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 195
		gunModel[164].setRotationPoint(57F, -32F, -1.25F);

		gunModel[165].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 196
		gunModel[165].setRotationPoint(61F, -31.4F, -1.25F);

		gunModel[166].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 197
		gunModel[166].setRotationPoint(61F, -31.4F, -1.75F);

		gunModel[167].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 198
		gunModel[167].setRotationPoint(61F, -32F, -1.75F);

		gunModel[168].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 199
		gunModel[168].setRotationPoint(61F, -32F, -1.25F);

		gunModel[169].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 200
		gunModel[169].setRotationPoint(58F, -32.25F, -2F);

		gunModel[170].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 201
		gunModel[170].setRotationPoint(62.5F, -32.25F, -2F);

		gunModel[171].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 202
		gunModel[171].setRotationPoint(62.5F, -30.25F, -2F);

		gunModel[172].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		gunModel[172].setRotationPoint(62.5F, -31.25F, -2F);

		gunModel[173].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 204
		gunModel[173].setRotationPoint(62.5F, -31.25F, 0F);

		gunModel[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 205
		gunModel[174].setRotationPoint(66.5F, -31.25F, 0F);

		gunModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 206
		gunModel[175].setRotationPoint(66.5F, -31.25F, -2F);

		gunModel[176].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 207
		gunModel[176].setRotationPoint(23F, -36.5F, -1.51F);

		gunModel[177].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 208
		gunModel[177].setRotationPoint(21.5F, -36.5F, -1.51F);

		gunModel[178].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 209
		gunModel[178].setRotationPoint(20F, -36.5F, -1.51F);

		gunModel[179].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 210
		gunModel[179].setRotationPoint(18.5F, -36.5F, -1.51F);

		gunModel[180].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 211
		gunModel[180].setRotationPoint(17F, -36.5F, -1.51F);

		gunModel[181].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 212
		gunModel[181].setRotationPoint(14F, -36.5F, -1.51F);

		gunModel[182].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 213
		gunModel[182].setRotationPoint(15.5F, -36.5F, -1.51F);

		gunModel[183].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 214
		gunModel[183].setRotationPoint(12.5F, -36.5F, -1.51F);

		gunModel[184].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 215
		gunModel[184].setRotationPoint(11F, -36.5F, -1.51F);

		gunModel[185].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 216
		gunModel[185].setRotationPoint(9.5F, -36.5F, -1.51F);

		gunModel[186].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 217
		gunModel[186].setRotationPoint(8F, -36.5F, -1.51F);

		gunModel[187].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 221
		gunModel[187].setRotationPoint(35F, -36.5F, -1.51F);

		gunModel[188].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 222
		gunModel[188].setRotationPoint(33.5F, -36.5F, -1.51F);

		gunModel[189].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 223
		gunModel[189].setRotationPoint(30.5F, -36.5F, -1.51F);

		gunModel[190].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 224
		gunModel[190].setRotationPoint(32F, -36.5F, -1.51F);

		gunModel[191].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 225
		gunModel[191].setRotationPoint(29F, -36.5F, -1.51F);

		gunModel[192].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 226
		gunModel[192].setRotationPoint(27.5F, -36.5F, -1.51F);

		gunModel[193].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 227
		gunModel[193].setRotationPoint(26F, -36.5F, -1.51F);

		gunModel[194].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 228
		gunModel[194].setRotationPoint(24.5F, -36.5F, -1.51F);

		gunModel[195].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 229
		gunModel[195].setRotationPoint(36.3F, -37F, -1.5F);

		gunModel[196].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 230
		gunModel[196].setRotationPoint(37.3F, -38F, -1.51F);

		gunModel[197].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 231
		gunModel[197].setRotationPoint(38.3F, -39F, -2F);

		gunModel[198].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 232
		gunModel[198].setRotationPoint(37.45F, -41.75F, 0.98F);

		gunModel[199].addBox(0F, -1F, 0F, 3, 2, 1, 0F); // Box 233
		gunModel[199].setRotationPoint(38.5F, -41.5F, 1F);
		gunModel[199].rotateAngleZ = -1.29154365F;

		gunModel[200].addBox(-2F, 0F, 0F, 4, 2, 3, 0F); // Box 234
		gunModel[200].setRotationPoint(37F, -38F, -1.5F);
		gunModel[200].rotateAngleZ = 1.15191731F;

		gunModel[201].addBox(0F, -1F, 0F, 3, 2, 1, 0F); // Box 235
		gunModel[201].setRotationPoint(38.5F, -41.5F, -2F);
		gunModel[201].rotateAngleZ = -1.29154365F;

		gunModel[202].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 236
		gunModel[202].setRotationPoint(37.45F, -41.75F, -2.02F);

		gunModel[203].addBox(0F, -1F, 0F, 1, 2, 1, 0F); // Box 238
		gunModel[203].setRotationPoint(38F, -40F, -0.5F);

		gunModel[204].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 240
		gunModel[204].setRotationPoint(-26F, -32F, -4.5F);
		gunModel[204].rotateAngleY = 0.33161256F;

		gunModel[205].addBox(-1.5F, 0F, 0F, 1, 2, 2, 0F); // Box 241
		gunModel[205].setRotationPoint(-26F, -32F, -4.5F);
		gunModel[205].rotateAngleY = 0.33161256F;

		gunModel[206].addBox(-1F, 0.5F, 0F, 1, 1, 1, 0F); // Box 242
		gunModel[206].setRotationPoint(-26F, -32F, -4F);
		gunModel[206].rotateAngleY = 0.33161256F;

		gunModel[207].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 243
		gunModel[207].setRotationPoint(-13F, -33F, -3.5F);

		gunModel[208].addBox(-3F, 0F, 0F, 3, 3, 2, 0F); // Box 244
		gunModel[208].setRotationPoint(-13F, -33F, -3.5F);
		gunModel[208].rotateAngleY = -0.61086524F;

		gunModel[209].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 245
		gunModel[209].setRotationPoint(-10F, -33.5F, -2.5F);
		gunModel[209].rotateAngleX = -0.15707963F;

		gunModel[210].addBox(5F, 0.2F, -0.5F, 4, 2, 1, 0F); // Box 246
		gunModel[210].setRotationPoint(-10F, -33.25F, -2F);
		gunModel[210].rotateAngleX = -0.40142573F;

		gunModel[211].addBox(0F, -1.25F, 0F, 14, 1, 1, 0F); // Box 247
		gunModel[211].setRotationPoint(-10F, -33.5F, -2F);
		gunModel[211].rotateAngleX = -0.15707963F;

		gunModel[212].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 248
		gunModel[212].setRotationPoint(-6.25F, -28.1F, -3F);

		gunModel[213].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 249
		gunModel[213].setRotationPoint(-9.25F, -24.1F, -3F);

		gunModel[214].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 250
		gunModel[214].setRotationPoint(-9F, -27.1F, -3F);


		ammoModel = new ModelRendererTurbo[21];
		ammoModel[0] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 51
		ammoModel[1] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 52
		ammoModel[2] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 54
		ammoModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		ammoModel[4] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 107
		ammoModel[5] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 108
		ammoModel[6] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 109
		ammoModel[7] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 110
		ammoModel[8] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 111
		ammoModel[9] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 112
		ammoModel[10] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 113
		ammoModel[11] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 114
		ammoModel[12] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 115
		ammoModel[13] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 116
		ammoModel[14] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 117
		ammoModel[15] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 118
		ammoModel[16] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 119
		ammoModel[17] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 120
		ammoModel[18] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 121
		ammoModel[19] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 122
		ammoModel[20] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 123

		ammoModel[0].addBox(0F, 0F, 0F, 10, 3, 4, 0F); // Box 51
		ammoModel[0].setRotationPoint(-7.14F, -19F, -2F);
		ammoModel[0].rotateAngleZ = 0.01745329F;

		ammoModel[1].addBox(0F, 0F, 0F, 10, 8, 4, 0F); // Box 52
		ammoModel[1].setRotationPoint(-7.14F, -16F, -2F);
		ammoModel[1].rotateAngleZ = 0.13962634F;

		ammoModel[2].addBox(0F, 0.05F, 0.01F, 10, 10, 4, 0F); // Box 54
		ammoModel[2].setRotationPoint(-6F, -8.15F, -2F);
		ammoModel[2].rotateAngleZ = 0.36651914F;

		ammoModel[3].addBox(1F, 0F, 0F, 1, 3, 1, 0F); // Box 106
		ammoModel[3].setRotationPoint(-7.14F, -19F, 1.15F);
		ammoModel[3].rotateAngleZ = 0.01745329F;

		ammoModel[4].addBox(1F, 0F, -0.01F, 1, 8, 1, 0F); // Box 107
		ammoModel[4].setRotationPoint(-7.14F, -16F, 1.15F);
		ammoModel[4].rotateAngleZ = 0.13962634F;

		ammoModel[5].addBox(1F, 0F, 0F, 1, 10, 1, 0F); // Box 108
		ammoModel[5].setRotationPoint(-6F, -8.15F, 1.15F);
		ammoModel[5].rotateAngleZ = 0.36651914F;

		ammoModel[6].addBox(4F, 0F, 0F, 1, 3, 1, 0F); // Box 109
		ammoModel[6].setRotationPoint(-7.14F, -19F, 1.15F);
		ammoModel[6].rotateAngleZ = 0.01745329F;

		ammoModel[7].addBox(4F, 0F, -0.01F, 1, 8, 1, 0F); // Box 110
		ammoModel[7].setRotationPoint(-7.14F, -16F, 1.15F);
		ammoModel[7].rotateAngleZ = 0.13962634F;

		ammoModel[8].addBox(4F, 0F, 0F, 1, 10, 1, 0F); // Box 111
		ammoModel[8].setRotationPoint(-6F, -8.15F, 1.15F);
		ammoModel[8].rotateAngleZ = 0.36651914F;

		ammoModel[9].addBox(7F, 0F, 0F, 1, 3, 1, 0F); // Box 112
		ammoModel[9].setRotationPoint(-7.14F, -19F, 1.15F);
		ammoModel[9].rotateAngleZ = 0.01745329F;

		ammoModel[10].addBox(7F, 0F, -0.01F, 1, 8, 1, 0F); // Box 113
		ammoModel[10].setRotationPoint(-7.14F, -16F, 1.15F);
		ammoModel[10].rotateAngleZ = 0.13962634F;

		ammoModel[11].addBox(7F, 0F, 0F, 1, 10, 1, 0F); // Box 114
		ammoModel[11].setRotationPoint(-6F, -8.15F, 1.15F);
		ammoModel[11].rotateAngleZ = 0.36651914F;

		ammoModel[12].addBox(7F, 0F, 0F, 1, 3, 1, 0F); // Box 115
		ammoModel[12].setRotationPoint(-7.14F, -19F, -2.15F);
		ammoModel[12].rotateAngleZ = 0.01745329F;

		ammoModel[13].addBox(4F, 0F, 0F, 1, 3, 1, 0F); // Box 116
		ammoModel[13].setRotationPoint(-7.14F, -19F, -2.15F);
		ammoModel[13].rotateAngleZ = 0.01745329F;

		ammoModel[14].addBox(1F, 0F, 0F, 1, 3, 1, 0F); // Box 117
		ammoModel[14].setRotationPoint(-7.14F, -19F, -2.15F);
		ammoModel[14].rotateAngleZ = 0.01745329F;

		ammoModel[15].addBox(1F, 0F, 0F, 1, 8, 1, 0F); // Box 118
		ammoModel[15].setRotationPoint(-7.14F, -16F, -2.15F);
		ammoModel[15].rotateAngleZ = 0.13962634F;

		ammoModel[16].addBox(4F, 0F, 0F, 1, 8, 1, 0F); // Box 119
		ammoModel[16].setRotationPoint(-7.14F, -16F, -2.15F);
		ammoModel[16].rotateAngleZ = 0.13962634F;

		ammoModel[17].addBox(7F, 0F, 0F, 1, 8, 1, 0F); // Box 120
		ammoModel[17].setRotationPoint(-7.14F, -16F, -2.15F);
		ammoModel[17].rotateAngleZ = 0.13962634F;

		ammoModel[18].addBox(7F, 0F, 0F, 1, 10, 1, 0F); // Box 121
		ammoModel[18].setRotationPoint(-6F, -8.15F, -2.15F);
		ammoModel[18].rotateAngleZ = 0.36651914F;

		ammoModel[19].addBox(4F, 0F, 0F, 1, 10, 1, 0F); // Box 122
		ammoModel[19].setRotationPoint(-6F, -8.15F, -2.15F);
		ammoModel[19].rotateAngleZ = 0.36651914F;

		ammoModel[20].addBox(1F, 0F, 0F, 1, 10, 1, 0F); // Box 123
		ammoModel[20].setRotationPoint(-6F, -8.15F, -2.15F);
		ammoModel[20].rotateAngleZ = 0.36651914F;


		this.modelScale = 0.2f;
		translateAll = new Vector3f(18F, 7.5F, 0F);
		this.crouchZoom = -0.2f;
		
		leftArmPos = new Vector3f(0.1F, -0.45F, 0.15F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
		leftArmReloadPos = new Vector3f(0.F, -0.72F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
        
        rightArmPos = new Vector3f(0.35F, -0.80F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.35F, -0.80F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
        rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);

		rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
		leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
 
        leftHandAmmo = true;

		hasFlash = true;
		flashScale = 2F;
		this.muzzleFlashPointNormal = new Vector3f(1F, 1.40F, 0.9F);
		this.muzzleFlashPointScoping = new Vector3f(1.2F, 1.80F, 0.1F);

		fancyStance = true;
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);


		this.thirdPersonScale = 0.75f;
		this.thirdPersonOffset = new Vector3f(-0.2F, -0.1F, 0F);

		flipAll();
	}
}