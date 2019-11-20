//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 13.11.2017 - 05:33:34
// Last changed on: 13.11.2017 - 05:33:34
package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;
import org.lwjgl.util.vector.Vector3f;

public class mk14 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public mk14() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[208];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
        gunModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
        gunModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 10
        gunModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 55
        gunModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
        gunModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 57
        gunModel[11] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 59
        gunModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 60
        gunModel[13] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 61
        gunModel[14] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 62
        gunModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 63
        gunModel[16] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 64
        gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 65
        gunModel[18] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 66
        gunModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
        gunModel[20] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 68
        gunModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
        gunModel[22] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 70
        gunModel[23] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 71
        gunModel[24] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 72
        gunModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 73
        gunModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
        gunModel[27] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 75
        gunModel[28] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 76
        gunModel[29] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 77
        gunModel[30] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 78
        gunModel[31] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 79
        gunModel[32] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 80
        gunModel[33] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 81
        gunModel[34] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 82
        gunModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 83
        gunModel[36] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 84
        gunModel[37] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 85
        gunModel[38] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 86
        gunModel[39] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 87
        gunModel[40] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 88
        gunModel[41] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 89
        gunModel[42] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 90
        gunModel[43] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 91
        gunModel[44] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 92
        gunModel[45] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 93
        gunModel[46] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 94
        gunModel[47] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 95
        gunModel[48] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 96
        gunModel[49] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 97
        gunModel[50] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 98
        gunModel[51] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 99
        gunModel[52] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 100
        gunModel[53] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 101
        gunModel[54] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 102
        gunModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
        gunModel[56] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 104
        gunModel[57] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 105
        gunModel[58] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 116
        gunModel[59] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 126
        gunModel[60] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 128
        gunModel[61] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 129
        gunModel[62] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 130
        gunModel[63] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 131
        gunModel[64] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 132
        gunModel[65] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 133
        gunModel[66] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 134
        gunModel[67] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 135
        gunModel[68] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 136
        gunModel[69] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 137
        gunModel[70] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 138
        gunModel[71] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 139
        gunModel[72] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 140
        gunModel[73] = new ModelRendererTurbo(this, 246, 41, textureX, textureY); // Box 141
        gunModel[74] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 142
        gunModel[75] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 143
        gunModel[76] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 144
        gunModel[77] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 145
        gunModel[78] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 146
        gunModel[79] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 147
        gunModel[80] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 148
        gunModel[81] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 149
        gunModel[82] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 150
        gunModel[83] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 151
        gunModel[84] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 152
        gunModel[85] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 154
        gunModel[86] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 156
        gunModel[87] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 157
        gunModel[88] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 158
        gunModel[89] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 159
        gunModel[90] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 160
        gunModel[91] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 161
        gunModel[92] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 162
        gunModel[93] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 163
        gunModel[94] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 164
        gunModel[95] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 165
        gunModel[96] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 166
        gunModel[97] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 167
        gunModel[98] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 169
        gunModel[99] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 170
        gunModel[100] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 171
        gunModel[101] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 172
        gunModel[102] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 173
        gunModel[103] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 174
        gunModel[104] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 175
        gunModel[105] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 176
        gunModel[106] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 177
        gunModel[107] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 178
        gunModel[108] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 179
        gunModel[109] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 180
        gunModel[110] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 181
        gunModel[111] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 182
        gunModel[112] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 183
        gunModel[113] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 184
        gunModel[114] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 185
        gunModel[115] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 186
        gunModel[116] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 187
        gunModel[117] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 188
        gunModel[118] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 189
        gunModel[119] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 190
        gunModel[120] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 191
        gunModel[121] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 192
        gunModel[122] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 193
        gunModel[123] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 194
        gunModel[124] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 195
        gunModel[125] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 196
        gunModel[126] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 197
        gunModel[127] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 198
        gunModel[128] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 199
        gunModel[129] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 200
        gunModel[130] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 201
        gunModel[131] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 202
        gunModel[132] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 203
        gunModel[133] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 204
        gunModel[134] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 205
        gunModel[135] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 206
        gunModel[136] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 207
        gunModel[137] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 208
        gunModel[138] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 209
        gunModel[139] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 211
        gunModel[140] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 212
        gunModel[141] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 213
        gunModel[142] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 214
        gunModel[143] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 215
        gunModel[144] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 216
        gunModel[145] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 217
        gunModel[146] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 218
        gunModel[147] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 219
        gunModel[148] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 220
        gunModel[149] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 221
        gunModel[150] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 222
        gunModel[151] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 223
        gunModel[152] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 224
        gunModel[153] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 225
        gunModel[154] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 226
        gunModel[155] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 227
        gunModel[156] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 228
        gunModel[157] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 229
        gunModel[158] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 230
        gunModel[159] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 231
        gunModel[160] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 232
        gunModel[161] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 233
        gunModel[162] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 234
        gunModel[163] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 235
        gunModel[164] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 236
        gunModel[165] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 237
        gunModel[166] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 238
        gunModel[167] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 239
        gunModel[168] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 240
        gunModel[169] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 241
        gunModel[170] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 242
        gunModel[171] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 243
        gunModel[172] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 244
        gunModel[173] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 246
        gunModel[174] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 247
        gunModel[175] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 248
        gunModel[176] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 249
        gunModel[177] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 250
        gunModel[178] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 254
        gunModel[179] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 255
        gunModel[180] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 256
        gunModel[181] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 257
        gunModel[182] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 258
        gunModel[183] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 261
        gunModel[184] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 262
        gunModel[185] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 263
        gunModel[186] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 264
        gunModel[187] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 265
        gunModel[188] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 266
        gunModel[189] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 267
        gunModel[190] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 268
        gunModel[191] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 269
        gunModel[192] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 270
        gunModel[193] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 271
        gunModel[194] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 274
        gunModel[195] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 275
        gunModel[196] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 209
        gunModel[197] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 210
        gunModel[198] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 211
        gunModel[199] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 212
        gunModel[200] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 213
        gunModel[201] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 212
        gunModel[202] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 213
        gunModel[203] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 214
        gunModel[204] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 215
        gunModel[205] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 216
        gunModel[206] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 217
        gunModel[207] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 218

        gunModel[0].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 0
        gunModel[0].setRotationPoint(-48.5F, -1.5F, -2.5F);

        gunModel[1].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 1
        gunModel[1].setRotationPoint(-48.5F, 0.5F, -3F);

        gunModel[2].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 2
        gunModel[2].setRotationPoint(-48F, 1.5F, -2.5F);

        gunModel[3].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 3
        gunModel[3].setRotationPoint(-47.75F, 2.5F, -2F);

        gunModel[4].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 4
        gunModel[4].setRotationPoint(-47.5F, 3.5F, -2F);

        gunModel[5].addBox(-6F, 0F, 0F, 6, 13, 4, 0F); // Box 7
        gunModel[5].setRotationPoint(-40F, 2.5F, -2F);
        gunModel[5].rotateAngleZ = -0.50614548F;

        gunModel[6].addBox(-6F, 0F, 0F, 8, 4, 4, 0F); // Box 8
        gunModel[6].setRotationPoint(-45.55F, 11F, -2F);

        gunModel[7].addBox(-6F, 0F, 0F, 6, 10, 4, 0F); // Box 10
        gunModel[7].setRotationPoint(-41.5F, 4.5F, -2F);
        gunModel[7].rotateAngleZ = -0.29670597F;

        gunModel[8].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 55
        gunModel[8].setRotationPoint(-49.5F, -3.5F, -2F);

        gunModel[9].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 56
        gunModel[9].setRotationPoint(-49.5F, -3.5F, 1F);

        gunModel[10].addBox(0F, 0F, 0F, 9, 1, 9, 0F); // Box 57
        gunModel[10].setRotationPoint(-49.5F, -4.5F, -4.5F);

        gunModel[11].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 59
        gunModel[11].setRotationPoint(-49.5F, -3.5F, -5F);

        gunModel[12].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 60
        gunModel[12].setRotationPoint(-49.5F, -1.5F, -4.5F);

        gunModel[13].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 61
        gunModel[13].setRotationPoint(-49.5F, -1.5F, 1.5F);

        gunModel[14].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 62
        gunModel[14].setRotationPoint(-49.5F, -3.5F, 4F);

        gunModel[15].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 63
        gunModel[15].setRotationPoint(-67.5F, -3.25F, 2.65F);

        gunModel[16].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 64
        gunModel[16].setRotationPoint(-67.5F, -3F, 2.65F);

        gunModel[17].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 65
        gunModel[17].setRotationPoint(-67.5F, -3F, 2.4F);

        gunModel[18].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 66
        gunModel[18].setRotationPoint(-67.5F, -3.25F, 2.4F);

        gunModel[19].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 67
        gunModel[19].setRotationPoint(-67.5F, -3.25F, -3.65F);

        gunModel[20].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 68
        gunModel[20].setRotationPoint(-67.5F, -3F, -3.65F);

        gunModel[21].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 69
        gunModel[21].setRotationPoint(-67.5F, -3F, -3.4F);

        gunModel[22].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 70
        gunModel[22].setRotationPoint(-67.5F, -3.25F, -3.4F);

        gunModel[23].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 71
        gunModel[23].setRotationPoint(-48.99F, -5.5F, -1.5F);

        gunModel[24].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 72
        gunModel[24].setRotationPoint(-49F, -6F, -2F);

        gunModel[25].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 73
        gunModel[25].setRotationPoint(-48.5F, -6.5F, -1.5F);

        gunModel[26].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 74
        gunModel[26].setRotationPoint(-46.5F, -6.5F, -1.5F);

        gunModel[27].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 75
        gunModel[27].setRotationPoint(-42.5F, -6.5F, -1.5F);

        gunModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 76
        gunModel[28].setRotationPoint(-44.5F, -6.5F, -1.5F);

        gunModel[29].addBox(0F, 0F, 0F, 1, 7, 9, 0F); // Box 77
        gunModel[29].setRotationPoint(-40.55F, -8.5F, -4.5F);

        gunModel[30].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 78
        gunModel[30].setRotationPoint(-40.55F, -10.5F, -2.5F);

        gunModel[31].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 79
        gunModel[31].setRotationPoint(-40.55F, -10.5F, -2.5F);
        gunModel[31].rotateAngleX = 0.85521133F;

        gunModel[32].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 80
        gunModel[32].setRotationPoint(-40.55F, -10.5F, 2.5F);
        gunModel[32].rotateAngleX = -0.85521133F;

        gunModel[33].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 81
        gunModel[33].setRotationPoint(-40.55F, -9.5F, -1F);

        gunModel[34].addBox(0F, 0F, 0F, 14, 6, 6, 0F); // Box 82
        gunModel[34].setRotationPoint(-39.5F, -6.5F, -3F);

        gunModel[35].addBox(0F, -1F, 0F, 16, 1, 6, 0F); // Box 83
        gunModel[35].setRotationPoint(-25.5F, -0.5F, -3F);
        gunModel[35].rotateAngleZ = 0.13962634F;

        gunModel[36].addBox(0F, 0F, 0F, 16, 5, 6, 0F); // Box 84
        gunModel[36].setRotationPoint(-25.5F, -8.5F, -3F);

        gunModel[37].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 85
        gunModel[37].setRotationPoint(-25.5F, -4.5F, -3F);

        gunModel[38].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 86
        gunModel[38].setRotationPoint(-22F, -3.75F, -3F);

        gunModel[39].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 87
        gunModel[39].setRotationPoint(-20F, -4F, -3F);

        gunModel[40].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 88
        gunModel[40].setRotationPoint(-18F, -4F, -3F);

        gunModel[41].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 89
        gunModel[41].setRotationPoint(-15.5F, -3.75F, -3F);

        gunModel[42].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 90
        gunModel[42].setRotationPoint(-24F, -3.75F, -3F);

        gunModel[43].addBox(0F, 0F, 0F, 14, 2, 4, 0F); // Box 91
        gunModel[43].setRotationPoint(-39.5F, -8.5F, -2F);

        gunModel[44].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 92
        gunModel[44].setRotationPoint(-39.5F, -8.5F, -3F);

        gunModel[45].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 93
        gunModel[45].setRotationPoint(-34.5F, -8.5F, -3F);

        gunModel[46].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 94
        gunModel[46].setRotationPoint(-39.5F, -8.5F, 2F);

        gunModel[47].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 95
        gunModel[47].setRotationPoint(-34.5F, -8.5F, 2F);

        gunModel[48].addBox(0F, -0.5F, 1F, 16, 1, 4, 0F); // Box 96
        gunModel[48].setRotationPoint(-25.5F, -0.5F, -3F);
        gunModel[48].rotateAngleZ = 0.13962634F;

        gunModel[49].addBox(0F, -0.5F, 1F, 15, 1, 4, 0F); // Box 97
        gunModel[49].setRotationPoint(-40F, -0.5F, -3F);

        gunModel[50].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 98
        gunModel[50].setRotationPoint(-38F, 0F, -1F);

        gunModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 99
        gunModel[51].setRotationPoint(-38F, 2F, -1F);
        gunModel[51].rotateAngleZ = 0.61086524F;

        gunModel[52].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 100
        gunModel[52].setRotationPoint(-36.9F, 2.7F, -1F);

        gunModel[53].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 101
        gunModel[53].setRotationPoint(-32.9F, 3.7F, -1F);
        gunModel[53].rotateAngleZ = 0.62831853F;

        gunModel[54].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 102
        gunModel[54].setRotationPoint(-32.25F, -0.5F, -1F);

        gunModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
        gunModel[55].setRotationPoint(-31.25F, -0.5F, -0.5F);

        gunModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 104
        gunModel[56].setRotationPoint(-31.25F, 1.5F, -0.5F);

        gunModel[57].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 105
        gunModel[57].setRotationPoint(-30.25F, -0.5F, -0.5F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 116
        gunModel[58].setRotationPoint(-35.9F, -0.5F, -0.5F);
        gunModel[58].rotateAngleZ = 0.2268928F;

        gunModel[59].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 126
        gunModel[59].setRotationPoint(-40.5F, -10.45F, -1.5F);

        gunModel[60].addBox(0F, 0F, -2F, 31, 1, 2, 0F); // Box 128
        gunModel[60].setRotationPoint(-40F, -10.45F, -1.5F);
        gunModel[60].rotateAngleX = 0.75049158F;

        gunModel[61].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 129
        gunModel[61].setRotationPoint(-13.5F, -11.5F, -1.5F);

        gunModel[62].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 130
        gunModel[62].setRotationPoint(-33.1F, -13.1F, -2F);

        gunModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
        gunModel[63].setRotationPoint(-33.5F, -14.5F, -1.99F);

        gunModel[64].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 132
        gunModel[64].setRotationPoint(-31.5F, -14.5F, -2.01F);
        gunModel[64].rotateAngleZ = -0.78539816F;

        gunModel[65].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 133
        gunModel[65].setRotationPoint(-33.5F, -14.5F, -2.01F);
        gunModel[65].rotateAngleZ = 0.78539816F;

        gunModel[66].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 134
        gunModel[66].setRotationPoint(-34.9F, -13.1F, -2.02F);

        gunModel[67].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 135
        gunModel[67].setRotationPoint(-33.1F, -13.1F, 1F);

        gunModel[68].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
        gunModel[68].setRotationPoint(-33.5F, -14.5F, 0.99F);

        gunModel[69].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 137
        gunModel[69].setRotationPoint(-31.5F, -14.5F, 1.01F);
        gunModel[69].rotateAngleZ = -0.78539816F;

        gunModel[70].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 138
        gunModel[70].setRotationPoint(-33.5F, -14.5F, 1.01F);
        gunModel[70].rotateAngleZ = 0.78539816F;

        gunModel[71].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 139
        gunModel[71].setRotationPoint(-34.9F, -13.1F, 1.02F);

        gunModel[72].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 140
        gunModel[72].setRotationPoint(-33.6F, -12.5F, -2.98F);

        gunModel[73].addBox(0F, -1F, -1F, 1, 4, 4, 0F); // Box 141
        gunModel[73].setRotationPoint(-32.9F, -14F, -0.97F);

        gunModel[74].addBox(0F, 0F, 0F, 7, 2, 4, 0F); // Box 142
        gunModel[74].setRotationPoint(-32.1F, -11.5F, -2.01F);

        gunModel[75].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 143
        gunModel[75].setRotationPoint(-32.1F, -12.5F, -2F);
        gunModel[75].rotateAngleZ = -0.15707963F;

        gunModel[76].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 144
        gunModel[76].setRotationPoint(-26.9F, -12.5F, -1.5F);

        gunModel[77].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 145
        gunModel[77].setRotationPoint(-27.1F, -11.5F, -1.5F);
        gunModel[77].rotateAngleZ = 0.31415927F;

        gunModel[78].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 146
        gunModel[78].setRotationPoint(-27.9F, -12.8F, -1.5F);

        gunModel[79].addBox(0F, 0F, 0F, 30, 2, 1, 0F); // Box 147
        gunModel[79].setRotationPoint(-39.5F, -10.5F, 2F);

        gunModel[80].addBox(0F, 0F, 0F, 31, 1, 5, 0F); // Box 148
        gunModel[80].setRotationPoint(-40F, -9.5F, -2.5F);

        gunModel[81].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 149
        gunModel[81].setRotationPoint(-17.5F, -11.5F, 2F);

        gunModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 150
        gunModel[82].setRotationPoint(-20.34F, -10.5F, 2F);
        gunModel[82].rotateAngleZ = 0.3403392F;

        gunModel[83].addBox(0F, 0F, -1F, 23, 1, 2, 0F); // Box 151
        gunModel[83].setRotationPoint(-9.5F, -8.65F, 2.5F);

        gunModel[84].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 152
        gunModel[84].setRotationPoint(-9.5F, -5F, 2.2F);

        gunModel[85].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 154
        gunModel[85].setRotationPoint(-9.5F, -3F, 1.2F);

        gunModel[86].addBox(0F, 0F, -1F, 24, 3, 2, 0F); // Box 156
        gunModel[86].setRotationPoint(-9.5F, -7.65F, 2.5F);
        gunModel[86].rotateAngleX = 0.2443461F;

        gunModel[87].addBox(0F, 0F, -2F, 26, 2, 2, 0F); // Box 157
        gunModel[87].setRotationPoint(-9.51F, -3F, 4.2F);
        gunModel[87].rotateAngleX = -0.57595865F;

        gunModel[88].addBox(0F, 0F, 0F, 26, 2, 3, 0F); // Box 158
        gunModel[88].setRotationPoint(-9.5F, -2.5F, -1.5F);

        gunModel[89].addBox(0F, 0F, 0F, 23, 1, 2, 0F); // Box 159
        gunModel[89].setRotationPoint(-9.5F, -8.65F, -3.5F);

        gunModel[90].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 160
        gunModel[90].setRotationPoint(-9.5F, -5F, -4.2F);

        gunModel[91].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 161
        gunModel[91].setRotationPoint(-9.5F, -3F, -3.2F);

        gunModel[92].addBox(0F, 0F, -1F, 24, 3, 2, 0F); // Box 162
        gunModel[92].setRotationPoint(-9.5F, -7.65F, -2.5F);
        gunModel[92].rotateAngleX = -0.2443461F;

        gunModel[93].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 163
        gunModel[93].setRotationPoint(-9.51F, -3F, -4.2F);
        gunModel[93].rotateAngleX = 0.57595865F;

        gunModel[94].addBox(0F, 0F, -1F, 23, 1, 6, 0F); // Box 164
        gunModel[94].setRotationPoint(-9.5F, -9.65F, -2F);

        gunModel[95].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 165
        gunModel[95].setRotationPoint(14.5F, -6F, 2.2F);

        gunModel[96].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 166
        gunModel[96].setRotationPoint(14.5F, -6F, -4.2F);

        gunModel[97].addBox(0F, 0F, -1F, 38, 1, 4, 0F); // Box 167
        gunModel[97].setRotationPoint(-9.5F, -11F, -1F);

        gunModel[98].addBox(0F, 0F, -1F, 38, 4, 6, 0F); // Box 169
        gunModel[98].setRotationPoint(-9.5F, -9.25F, -2.01F);

        gunModel[99].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 170
        gunModel[99].setRotationPoint(-9.5F, -12F, -0.5F);

        gunModel[100].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 171
        gunModel[100].setRotationPoint(-6F, -12F, -0.5F);

        gunModel[101].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 172
        gunModel[101].setRotationPoint(-2F, -12F, -0.5F);

        gunModel[102].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 173
        gunModel[102].setRotationPoint(2.25F, -12F, -0.5F);

        gunModel[103].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 174
        gunModel[103].setRotationPoint(6.25F, -12F, -0.5F);

        gunModel[104].addBox(0F, 0F, -1F, 3, 3, 3, 0F); // Box 175
        gunModel[104].setRotationPoint(10.25F, -12F, -0.5F);

        gunModel[105].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 176
        gunModel[105].setRotationPoint(16.5F, -12F, -0.5F);

        gunModel[106].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 177
        gunModel[106].setRotationPoint(20.75F, -12F, -0.5F);

        gunModel[107].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 178
        gunModel[107].setRotationPoint(24.75F, -12F, -0.5F);

        gunModel[108].addBox(0F, 0F, -1F, 2, 9, 3, 0F); // Box 179
        gunModel[108].setRotationPoint(28.5F, -12.5F, -0.5F);

        gunModel[109].addBox(0F, 0F, 0F, 38, 1, 3, 0F); // Box 180
        gunModel[109].setRotationPoint(-9.5F, -12.75F, -1.5F);

        gunModel[110].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 181
        gunModel[110].setRotationPoint(-9.5F, -12.75F, 1.5F);
        gunModel[110].rotateAngleX = -1.20427718F;

        gunModel[111].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 182
        gunModel[111].setRotationPoint(-6F, -12.75F, 1.5F);
        gunModel[111].rotateAngleX = -1.20427718F;

        gunModel[112].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 183
        gunModel[112].setRotationPoint(-10.5F, -12.5F, -3F);

        gunModel[113].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 184
        gunModel[113].setRotationPoint(-2F, -12.75F, 1.5F);
        gunModel[113].rotateAngleX = -1.20427718F;

        gunModel[114].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 185
        gunModel[114].setRotationPoint(2.25F, -12.75F, 1.5F);
        gunModel[114].rotateAngleX = -1.20427718F;

        gunModel[115].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 186
        gunModel[115].setRotationPoint(6.25F, -12.75F, 1.5F);
        gunModel[115].rotateAngleX = -1.20427718F;

        gunModel[116].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 187
        gunModel[116].setRotationPoint(10.25F, -12.75F, 1.5F);
        gunModel[116].rotateAngleX = -1.20427718F;

        gunModel[117].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 188
        gunModel[117].setRotationPoint(16.5F, -12.75F, 1.5F);
        gunModel[117].rotateAngleX = -1.20427718F;

        gunModel[118].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 189
        gunModel[118].setRotationPoint(20.75F, -12.75F, 1.5F);
        gunModel[118].rotateAngleX = -1.20427718F;

        gunModel[119].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 190
        gunModel[119].setRotationPoint(24.75F, -12.75F, 1.5F);
        gunModel[119].rotateAngleX = -1.20427718F;

        gunModel[120].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 191
        gunModel[120].setRotationPoint(-9.5F, -12.75F, -1.5F);
        gunModel[120].rotateAngleX = 1.20427718F;

        gunModel[121].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 192
        gunModel[121].setRotationPoint(-6F, -12.75F, -1.5F);
        gunModel[121].rotateAngleX = 1.20427718F;

        gunModel[122].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 193
        gunModel[122].setRotationPoint(-2F, -12.75F, -1.5F);
        gunModel[122].rotateAngleX = 1.20427718F;

        gunModel[123].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 194
        gunModel[123].setRotationPoint(2.25F, -12.75F, -1.5F);
        gunModel[123].rotateAngleX = 1.20427718F;

        gunModel[124].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 195
        gunModel[124].setRotationPoint(6.25F, -12.75F, -1.5F);
        gunModel[124].rotateAngleX = 1.20427718F;

        gunModel[125].addBox(0F, 0F, -4F, 3, 1, 4, 0F); // Box 196
        gunModel[125].setRotationPoint(10.25F, -12.75F, -1.5F);
        gunModel[125].rotateAngleX = 1.20427718F;

        gunModel[126].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 197
        gunModel[126].setRotationPoint(16.5F, -12.75F, -1.5F);
        gunModel[126].rotateAngleX = 1.20427718F;

        gunModel[127].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 198
        gunModel[127].setRotationPoint(20.75F, -12.75F, -1.5F);
        gunModel[127].rotateAngleX = 1.20427718F;

        gunModel[128].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 199
        gunModel[128].setRotationPoint(24.75F, -12.75F, -1.5F);
        gunModel[128].rotateAngleX = 1.20427718F;

        gunModel[129].addBox(0F, 0F, -1F, 2, 7, 1, 0F); // Box 200
        gunModel[129].setRotationPoint(28.5F, -11.5F, -1.5F);

        gunModel[130].addBox(0F, 0F, -1F, 2, 5, 1, 0F); // Box 201
        gunModel[130].setRotationPoint(28.5F, -10.5F, -2F);

        gunModel[131].addBox(0F, 0F, -1F, 2, 7, 1, 0F); // Box 202
        gunModel[131].setRotationPoint(28.5F, -11.5F, 2.5F);

        gunModel[132].addBox(0F, 0F, -1F, 2, 5, 1, 0F); // Box 203
        gunModel[132].setRotationPoint(28.5F, -10.5F, 3F);

        gunModel[133].addBox(0F, 0F, 0F, 12, 4, 1, 0F); // Box 204
        gunModel[133].setRotationPoint(16F, -9.2F, -3.5F);

        gunModel[134].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 205
        gunModel[134].setRotationPoint(16.5F, -8.7F, -4F);

        gunModel[135].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 206
        gunModel[135].setRotationPoint(18.5F, -8.7F, -4F);

        gunModel[136].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 207
        gunModel[136].setRotationPoint(22.5F, -8.7F, -4F);

        gunModel[137].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 208
        gunModel[137].setRotationPoint(20.5F, -8.7F, -4F);

        gunModel[138].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 209
        gunModel[138].setRotationPoint(24.5F, -8.7F, -4F);

        gunModel[139].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 211
        gunModel[139].setRotationPoint(26.5F, -8.7F, -4F);

        gunModel[140].addBox(0F, 0F, 0F, 12, 4, 1, 0F); // Box 212
        gunModel[140].setRotationPoint(16F, -9.2F, 2.5F);

        gunModel[141].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 213
        gunModel[141].setRotationPoint(16.5F, -8.7F, 3F);

        gunModel[142].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 214
        gunModel[142].setRotationPoint(18.5F, -8.7F, 3F);

        gunModel[143].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 215
        gunModel[143].setRotationPoint(22.5F, -8.7F, 3F);

        gunModel[144].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 216
        gunModel[144].setRotationPoint(20.5F, -8.7F, 3F);

        gunModel[145].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 217
        gunModel[145].setRotationPoint(24.5F, -8.7F, 3F);

        gunModel[146].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 218
        gunModel[146].setRotationPoint(26.5F, -8.7F, 3F);

        gunModel[147].addBox(-6F, 0F, 0F, 1, 1, 4, 0F); // Box 219
        gunModel[147].setRotationPoint(-38F, 14F, -2.01F);

        gunModel[148].addBox(0F, 0F, -1F, 1, 4, 1, 0F); // Box 220
        gunModel[148].setRotationPoint(16.5F, -6.5F, 2.5F);

        gunModel[149].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 221
        gunModel[149].setRotationPoint(16.5F, -5.5F, 3F);

        gunModel[150].addBox(0F, 0F, -1F, 1, 6, 3, 0F); // Box 222
        gunModel[150].setRotationPoint(16.5F, -7.5F, -0.5F);

        gunModel[151].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 223
        gunModel[151].setRotationPoint(16.5F, -5.5F, -2F);

        gunModel[152].addBox(0F, 0F, -1F, 1, 4, 1, 0F); // Box 224
        gunModel[152].setRotationPoint(16.5F, -6.5F, -1.5F);

        gunModel[153].addBox(0F, 0F, -1F, 13, 2, 3, 0F); // Box 225
        gunModel[153].setRotationPoint(17F, -4.75F, -0.51F);

        gunModel[154].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 226
        gunModel[154].setRotationPoint(17F, -2.75F, -0.51F);

        gunModel[155].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 227
        gunModel[155].setRotationPoint(18.5F, -2.75F, -0.51F);

        gunModel[156].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 228
        gunModel[156].setRotationPoint(21.5F, -2.75F, -0.51F);

        gunModel[157].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 229
        gunModel[157].setRotationPoint(20F, -2.75F, -0.51F);

        gunModel[158].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 230
        gunModel[158].setRotationPoint(24.5F, -2.75F, -0.51F);

        gunModel[159].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 231
        gunModel[159].setRotationPoint(23F, -2.75F, -0.51F);

        gunModel[160].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 232
        gunModel[160].setRotationPoint(27.5F, -2.75F, -0.51F);

        gunModel[161].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 233
        gunModel[161].setRotationPoint(26F, -2.75F, -0.51F);

        gunModel[162].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 234
        gunModel[162].setRotationPoint(29F, -2.75F, -0.51F);

        gunModel[163].addBox(0F, 0F, -1F, 12, 1, 5, 0F); // Box 235
        gunModel[163].setRotationPoint(17.5F, -3F, -1.51F);

        gunModel[164].addBox(0F, 0F, -1F, 77, 2, 2, 0F); // Box 236
        gunModel[164].setRotationPoint(-10.5F, -11F, 0F);

        gunModel[165].addBox(0F, 0F, -1F, 59, 2, 2, 0F); // Box 237
        gunModel[165].setRotationPoint(-10.5F, -7.8F, 0F);

        gunModel[166].addBox(0F, 0F, -1F, 3, 6, 1, 0F); // Box 238
        gunModel[166].setRotationPoint(42.5F, -11.5F, 0.5F);

        gunModel[167].addBox(0F, 0F, -1F, 1, 6, 1, 0F); // Box 239
        gunModel[167].setRotationPoint(37.5F, -11.5F, 0.5F);

        gunModel[168].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 240
        gunModel[168].setRotationPoint(36.5F, -11.5F, 0.5F);

        gunModel[169].addBox(0F, 0F, -1F, 4, 3, 3, 0F); // Box 241
        gunModel[169].setRotationPoint(63.5F, -11.5F, -0.5F);

        gunModel[170].addBox(0F, 0F, -1F, 3, 2, 2, 0F); // Box 242
        gunModel[170].setRotationPoint(64F, -8.5F, 0F);

        gunModel[171].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 243
        gunModel[171].setRotationPoint(63F, -7.5F, 0.5F);

        gunModel[172].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 244
        gunModel[172].setRotationPoint(64F, -12F, 0.5F);

        gunModel[173].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Box 246
        gunModel[173].setRotationPoint(64F, -14F, 1.85F);
        gunModel[173].rotateAngleX = -0.08726646F;

        gunModel[174].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 247
        gunModel[174].setRotationPoint(64F, -14F, -1.85F);
        gunModel[174].rotateAngleX = 0.08726646F;

        gunModel[175].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 248
        gunModel[175].setRotationPoint(65F, -14F, 0F);

        gunModel[176].addBox(0F, 0F, -1F, 11, 1, 3, 0F); // Box 249
        gunModel[176].setRotationPoint(67.5F, -11.5F, -0.5F);

        gunModel[177].addBox(0F, 0F, -1F, 11, 1, 3, 0F); // Box 250
        gunModel[177].setRotationPoint(67.5F, -9.5F, -0.5F);

        gunModel[178].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 254
        gunModel[178].setRotationPoint(67.5F, -10.5F, -1.5F);

        gunModel[179].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 255
        gunModel[179].setRotationPoint(67.5F, -10.5F, 0.5F);

        gunModel[180].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 256
        gunModel[180].setRotationPoint(-68.5F, -4.25F, 2F);

        gunModel[181].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 257
        gunModel[181].setRotationPoint(-68.5F, -4.25F, -4F);

        gunModel[182].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 258
        gunModel[182].setRotationPoint(-72.5F, -8.25F, -2F);

        gunModel[183].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 261
        gunModel[183].setRotationPoint(-73.5F, -7.25F, -2F);

        gunModel[184].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 262
        gunModel[184].setRotationPoint(-73.5F, -4.25F, -2F);

        gunModel[185].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 263
        gunModel[185].setRotationPoint(-73.5F, -4.25F, 1F);

        gunModel[186].addBox(-2F, -14F, 0F, 2, 14, 1, 0F); // Box 264
        gunModel[186].setRotationPoint(-71.5F, 9.75F, -2F);
        gunModel[186].rotateAngleZ = -0.29670597F;

        gunModel[187].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 265
        gunModel[187].setRotationPoint(-71.5F, -4.25F, -2F);

        gunModel[188].addBox(-2F, -14F, 0F, 2, 14, 1, 0F); // Box 266
        gunModel[188].setRotationPoint(-71.5F, 9.75F, 1F);
        gunModel[188].rotateAngleZ = -0.29670597F;

        gunModel[189].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 267
        gunModel[189].setRotationPoint(-71.5F, -4.25F, 1F);

        gunModel[190].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 268
        gunModel[190].setRotationPoint(-74.5F, -5.25F, -1F);

        gunModel[191].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 269
        gunModel[191].setRotationPoint(-75.5F, -6.75F, -3F);

        gunModel[192].addBox(0F, 0F, 0F, 1, 20, 7, 0F); // Box 270
        gunModel[192].setRotationPoint(-76.5F, -7.5F, -3.5F);

        gunModel[193].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 271
        gunModel[193].setRotationPoint(-77.5F, -6.75F, -3F);

        gunModel[194].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 274
        gunModel[194].setRotationPoint(-72.5F, -3.5F, 2F);

        gunModel[195].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 275
        gunModel[195].setRotationPoint(-72.5F, -3.5F, -3F);

        gunModel[196].addBox(0F, 0F, 0F, 10, 2, 5, 0F); // Box 209
        gunModel[196].setRotationPoint(-24F, -3.75F, -2.5F);
        gunModel[196].rotateAngleZ = 0.12217305F;

        gunModel[197].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 210
        gunModel[197].setRotationPoint(78.5F, -11.5F, -0.5F);

        gunModel[198].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211
        gunModel[198].setRotationPoint(78.5F, -9.5F, -0.5F);

        gunModel[199].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 212
        gunModel[199].setRotationPoint(77.5F, -10.5F, 0.5F);

        gunModel[200].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 213
        gunModel[200].setRotationPoint(77.5F, -10.5F, -1.5F);

        gunModel[201].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 212
        gunModel[201].setRotationPoint(18F, -5.75F, -0.51F);

        gunModel[202].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 213
        gunModel[202].setRotationPoint(21F, -5.75F, -0.51F);

        gunModel[203].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 214
        gunModel[203].setRotationPoint(24F, -5.75F, -0.51F);

        gunModel[204].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 215
        gunModel[204].setRotationPoint(27F, -5.75F, -0.51F);

        gunModel[205].addBox(0F, 0F, -1F, 1, 6, 3, 0F); // Box 216
        gunModel[205].setRotationPoint(30.5F, -11.25F, -0.5F);

        gunModel[206].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 217
        gunModel[206].setRotationPoint(-72.5F, -8.25F, 2F);
        gunModel[206].rotateAngleX = -0.78539816F;

        gunModel[207].addBox(0F, 0F, -2F, 20, 1, 2, 0F); // Box 218
        gunModel[207].setRotationPoint(-72.5F, -8.25F, -2F);
        gunModel[207].rotateAngleX = 0.78539816F;

        ammoModel = new ModelRendererTurbo[7];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 117
        ammoModel[1] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 118
        ammoModel[2] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 119
        ammoModel[3] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 120
        ammoModel[4] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 121
        ammoModel[5] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 122
        ammoModel[6] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 123

        ammoModel[0].addBox(0F, -0.5F, 1F, 11, 16, 2, 0F); // Box 117
        ammoModel[0].setRotationPoint(-24.5F, -3.5F, -2F);
        ammoModel[0].rotateAngleZ = 0.05235988F;

        ammoModel[1].addBox(0F, -0.5F, 1F, 2, 16, 1, 0F); // Box 118
        ammoModel[1].setRotationPoint(-24.51F, -3.5F, -2.5F);
        ammoModel[1].rotateAngleZ = 0.05235988F;

        ammoModel[2].addBox(3F, -0.5F, 1F, 4, 16, 1, 0F); // Box 119
        ammoModel[2].setRotationPoint(-24.5F, -3.5F, -2.5F);
        ammoModel[2].rotateAngleZ = 0.05235988F;

        ammoModel[3].addBox(8F, -0.5F, 1F, 3, 16, 1, 0F); // Box 120
        ammoModel[3].setRotationPoint(-24.49F, -3.5F, -2.5F);
        ammoModel[3].rotateAngleZ = 0.05235988F;

        ammoModel[4].addBox(0F, -0.5F, 1F, 2, 16, 1, 0F); // Box 121
        ammoModel[4].setRotationPoint(-24.51F, -3.5F, -0.5F);
        ammoModel[4].rotateAngleZ = 0.05235988F;

        ammoModel[5].addBox(3F, -0.5F, 1F, 4, 16, 1, 0F); // Box 122
        ammoModel[5].setRotationPoint(-24.5F, -3.5F, -0.5F);
        ammoModel[5].rotateAngleZ = 0.05235988F;

        ammoModel[6].addBox(8F, -0.5F, 1F, 3, 16, 1, 0F); // Box 123
        ammoModel[6].setRotationPoint(-24.49F, -3.5F, -0.5F);
        ammoModel[6].rotateAngleZ = 0.05235988F;

        this.modelScale = 0.20F;

        translateAll = new Vector3f(30F, -19F, -0.15F);//forward/down/right

        hasFlash = false;

        leftArmPos = new Vector3f(-0.2F, -0.7F, 0.07F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
        leftArmReloadPos = new Vector3f(0.0F, -0.70F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);

        rightArmPos = new Vector3f(0.41F, -0.62F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
        rightArmReloadRot = new Vector3f(15F, 15F, -90.0F);
        rightArmChargePos = new Vector3f(0.4F, -0.39F, 0.13F);
        rightArmChargeRot = new Vector3f(-0.0F, 4.95F, -70.0F);

        rightArmScale = new Vector3f(0.7F, 0.8F, 0.7F);
        leftArmScale = new Vector3f(0.7F, 1.0F, 0.7F);

        leftHandAmmo = true;

        gunOffsetScoping = -0.85F;

        crouchZoom = -0.05F;
        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

        attachmentPointMap.put(AttachmentEnum.Sight, new Vector3f(-0.18F, 0.37F, 0F));

        translateSight = new Vector3f(0F, 2.2F, 0.07F);
        rotateSight = new Vector3f(-0.1F, 0F, 0F);


        thirdPersonOffset = new Vector3f(-0.05F, -0.05F, 0F);//forward/up/?
        thirdPersonScale = 0.7f;

        flipAll();
    }
}