package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;
import org.lwjgl.util.vector.Vector3f;

import java.util.ArrayList;
import java.util.List;

public class m16a4 extends ModelGun { //Same as Filename{
    int textureX = 512;
    int textureY = 256;

    public m16a4() {
        gunModel = new ModelRendererTurbo[496];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box4
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box7
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box8
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box10
        gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box98
        gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box99
        gunModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box100
        gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box101
        gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box102
        gunModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box116
        gunModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box219
        gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box14
        gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box15
        gunModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box16
        gunModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box17
        gunModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box18
        gunModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box19
        gunModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box20
        gunModel[18] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box21
        gunModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box22
        gunModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box24
        gunModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box25
        gunModel[22] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box26
        gunModel[23] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box27
        gunModel[24] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box28
        gunModel[25] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box30
        gunModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box31
        gunModel[27] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box32
        gunModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box33
        gunModel[29] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box34
        gunModel[30] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box35
        gunModel[31] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box36
        gunModel[32] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box37
        gunModel[33] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box38
        gunModel[34] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box39
        gunModel[35] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box40
        gunModel[36] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box41
        gunModel[37] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box42
        gunModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box66
        gunModel[39] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box67
        gunModel[40] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box94
        gunModel[41] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import Box96
        gunModel[42] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box97
        gunModel[43] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box98
        gunModel[44] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box99
        gunModel[45] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box100
        gunModel[46] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box101
        gunModel[47] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box102
        gunModel[48] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box158
        gunModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box240
        gunModel[50] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box241
        gunModel[51] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box242
        gunModel[52] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box243
        gunModel[53] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import Box244
        gunModel[54] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import Box245
        gunModel[55] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box246
        gunModel[56] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box247
        gunModel[57] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box248
        gunModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box249
        gunModel[59] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box250
        gunModel[60] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box113
        gunModel[61] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box114
        gunModel[62] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box115
        gunModel[63] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import Box116
        gunModel[64] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box117
        gunModel[65] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box118
        gunModel[66] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box120
        gunModel[67] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import Box121
        gunModel[68] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import Box122
        gunModel[69] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import Box123
        gunModel[70] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Import Box124
        gunModel[71] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import Box125
        gunModel[72] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box126
        gunModel[73] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box127
        gunModel[74] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box128
        gunModel[75] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box129
        gunModel[76] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import Box130
        gunModel[77] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box131
        gunModel[78] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box132
        gunModel[79] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box134
        gunModel[80] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import Box136
        gunModel[81] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box137
        gunModel[82] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box138
        gunModel[83] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box139
        gunModel[84] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import Box140
        gunModel[85] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import Box141
        gunModel[86] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import Box142
        gunModel[87] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box143
        gunModel[88] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import Box144
        gunModel[89] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import Box145
        gunModel[90] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box146
        gunModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box147
        gunModel[92] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import Box148
        gunModel[93] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import Box149
        gunModel[94] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box150
        gunModel[95] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import Box151
        gunModel[96] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box152
        gunModel[97] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box153
        gunModel[98] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import Box154
        gunModel[99] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box156
        gunModel[100] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import Box157
        gunModel[101] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Import Box158
        gunModel[102] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import Box159
        gunModel[103] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import Box160
        gunModel[104] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import Box161
        gunModel[105] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Box162
        gunModel[106] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import Box163
        gunModel[107] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Import Box164
        gunModel[108] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box165
        gunModel[109] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box166
        gunModel[110] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import Box167
        gunModel[111] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Box168
        gunModel[112] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Import Box169
        gunModel[113] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import Box170
        gunModel[114] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box171
        gunModel[115] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import Box172
        gunModel[116] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import Box173
        gunModel[117] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import Box174
        gunModel[118] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Import Box175
        gunModel[119] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import Box176
        gunModel[120] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box177
        gunModel[121] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import Box178
        gunModel[122] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import Box179
        gunModel[123] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Box180
        gunModel[124] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Import Box181
        gunModel[125] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import Box182
        gunModel[126] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box183
        gunModel[127] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import Box184
        gunModel[128] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box185
        gunModel[129] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import Box186
        gunModel[130] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import Box187
        gunModel[131] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import Box193
        gunModel[132] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Import Box194
        gunModel[133] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import Box195
        gunModel[134] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import Box196
        gunModel[135] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import Box197
        gunModel[136] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import Box198
        gunModel[137] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box199
        gunModel[138] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import Box200
        gunModel[139] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box201
        gunModel[140] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box202
        gunModel[141] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Import Box203
        gunModel[142] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import Box204
        gunModel[143] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import Box205
        gunModel[144] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import Box206
        gunModel[145] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import Box207
        gunModel[146] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import Box208
        gunModel[147] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import Box209
        gunModel[148] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import Box210
        gunModel[149] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import Box211
        gunModel[150] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import Box212
        gunModel[151] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import Box213
        gunModel[152] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import Box214
        gunModel[153] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import Box215
        gunModel[154] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import Box216
        gunModel[155] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import Box217
        gunModel[156] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import Box218
        gunModel[157] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Import Box219
        gunModel[158] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Import Box220
        gunModel[159] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import Box221
        gunModel[160] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import Box222
        gunModel[161] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import Box223
        gunModel[162] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import Box224
        gunModel[163] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import Box225
        gunModel[164] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import Box226
        gunModel[165] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import Box227
        gunModel[166] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Import Box228
        gunModel[167] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Import Box229
        gunModel[168] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box234
        gunModel[169] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Box235
        gunModel[170] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box236
        gunModel[171] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Import Box237
        gunModel[172] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box238
        gunModel[173] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Box239
        gunModel[174] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import Box240
        gunModel[175] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import Box241
        gunModel[176] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import Box243
        gunModel[177] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import Box244
        gunModel[178] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import Box245
        gunModel[179] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Import Box246
        gunModel[180] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Import Box247
        gunModel[181] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Import Box248
        gunModel[182] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import Box249
        gunModel[183] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box250
        gunModel[184] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Import Box251
        gunModel[185] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Import Box252
        gunModel[186] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Import Box253
        gunModel[187] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Import Box254
        gunModel[188] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box255
        gunModel[189] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import Box256
        gunModel[190] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import Box257
        gunModel[191] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Import Box258
        gunModel[192] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box259
        gunModel[193] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import Box260
        gunModel[194] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Import Box261
        gunModel[195] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import Box262
        gunModel[196] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Import Box267
        gunModel[197] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import Box268
        gunModel[198] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Import Box269
        gunModel[199] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Import Box270
        gunModel[200] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import Box271
        gunModel[201] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Import Box272
        gunModel[202] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import Box273
        gunModel[203] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Import Box274
        gunModel[204] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box276
        gunModel[205] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import Box277
        gunModel[206] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import Box278
        gunModel[207] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import Box279
        gunModel[208] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Import Box280
        gunModel[209] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import Box281
        gunModel[210] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import Box282
        gunModel[211] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import Box283
        gunModel[212] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import Box284
        gunModel[213] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Import Box285
        gunModel[214] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import Box286
        gunModel[215] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import Box287
        gunModel[216] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Import Box288
        gunModel[217] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Import Box289
        gunModel[218] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import Box290
        gunModel[219] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Box291
        gunModel[220] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Import Box292
        gunModel[221] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import Box293
        gunModel[222] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Import Box294
        gunModel[223] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import Box295
        gunModel[224] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Import Box296
        gunModel[225] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import Box297
        gunModel[226] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Import Box300
        gunModel[227] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import Box301
        gunModel[228] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import Box310
        gunModel[229] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box311
        gunModel[230] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box312
        gunModel[231] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import Box313
        gunModel[232] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import Box314
        gunModel[233] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box315
        gunModel[234] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import Box316
        gunModel[235] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box317
        gunModel[236] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box318
        gunModel[237] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box319
        gunModel[238] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Import Box320
        gunModel[239] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import Box321
        gunModel[240] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Import Box322
        gunModel[241] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import Box323
        gunModel[242] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import Box324
        gunModel[243] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Import Box325
        gunModel[244] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import Box326
        gunModel[245] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box327
        gunModel[246] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box331
        gunModel[247] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Import Box332
        gunModel[248] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import Box333
        gunModel[249] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box334
        gunModel[250] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Import Box335
        gunModel[251] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import Box336
        gunModel[252] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box337
        gunModel[253] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import Box338
        gunModel[254] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Import Box339
        gunModel[255] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import Box340
        gunModel[256] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Import Box341
        gunModel[257] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box342
        gunModel[258] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box343
        gunModel[259] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import Box344
        gunModel[260] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import Box345
        gunModel[261] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Box346
        gunModel[262] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box347
        gunModel[263] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import Box348
        gunModel[264] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Import Box349
        gunModel[265] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Import Box350
        gunModel[266] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import Box351
        gunModel[267] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Import Box352
        gunModel[268] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import Box353
        gunModel[269] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import Box354
        gunModel[270] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import Box367
        gunModel[271] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Import Box368
        gunModel[272] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import Box369
        gunModel[273] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import Box370
        gunModel[274] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import Box371
        gunModel[275] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box372
        gunModel[276] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import Box373
        gunModel[277] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import Box374
        gunModel[278] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Import Box375
        gunModel[279] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Import Box376
        gunModel[280] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box377
        gunModel[281] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Import Box378
        gunModel[282] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Import Box379
        gunModel[283] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Import Box380
        gunModel[284] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Import Box381
        gunModel[285] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Import Box385
        gunModel[286] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import Box386
        gunModel[287] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import Box387
        gunModel[288] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Import Box388
        gunModel[289] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import Box389
        gunModel[290] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Import Box390
        gunModel[291] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import Box391
        gunModel[292] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Import Box392
        gunModel[293] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import Box393
        gunModel[294] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box394
        gunModel[295] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Import Box395
        gunModel[296] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Import Box396
        gunModel[297] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Import Box397
        gunModel[298] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import Box398
        gunModel[299] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import Box399
        gunModel[300] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Import Box400
        gunModel[301] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import Box401
        gunModel[302] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Import Box402
        gunModel[303] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Import Box403
        gunModel[304] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import Box404
        gunModel[305] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import Box405
        gunModel[306] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Import Box406
        gunModel[307] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import Box407
        gunModel[308] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Import Box408
        gunModel[309] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import Box409
        gunModel[310] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import Box410
        gunModel[311] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import Box411
        gunModel[312] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Import Box412
        gunModel[313] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import Box413
        gunModel[314] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Import Box414
        gunModel[315] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import Box415
        gunModel[316] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box416
        gunModel[317] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import Box417
        gunModel[318] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Import Box418
        gunModel[319] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box419
        gunModel[320] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Import Box420
        gunModel[321] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import Box421
        gunModel[322] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Import Box422
        gunModel[323] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import Box423
        gunModel[324] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import Box424
        gunModel[325] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Import Box425
        gunModel[326] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Import Box426
        gunModel[327] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Import Box427
        gunModel[328] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Import Box428
        gunModel[329] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Import Box429
        gunModel[330] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box430
        gunModel[331] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box431
        gunModel[332] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box432
        gunModel[333] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import Box433
        gunModel[334] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import Box434
        gunModel[335] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import Box435
        gunModel[336] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Import Box436
        gunModel[337] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import Box437
        gunModel[338] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import Box438
        gunModel[339] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Import Box439
        gunModel[340] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import Box440
        gunModel[341] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import Box441
        gunModel[342] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box442
        gunModel[343] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Import Box443
        gunModel[344] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Import Box444
        gunModel[345] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box445
        gunModel[346] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import Box446
        gunModel[347] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import Box447
        gunModel[348] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import Box448
        gunModel[349] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Import Box449
        gunModel[350] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Import Box450
        gunModel[351] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import Box454
        gunModel[352] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Import Box455
        gunModel[353] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Import Box456
        gunModel[354] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Box457
        gunModel[355] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Import Box458
        gunModel[356] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import Box459
        gunModel[357] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import Box460
        gunModel[358] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Import Box461
        gunModel[359] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Import Box462
        gunModel[360] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import Box463
        gunModel[361] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import Box464
        gunModel[362] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import Box465
        gunModel[363] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Import Box466
        gunModel[364] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import Box467
        gunModel[365] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import Box468
        gunModel[366] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Import Box469
        gunModel[367] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import Box470
        gunModel[368] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Import Box471
        gunModel[369] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Import Box472
        gunModel[370] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Import Box473
        gunModel[371] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Import Box474
        gunModel[372] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Import Box475
        gunModel[373] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import Box476
        gunModel[374] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Import Box477
        gunModel[375] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Import Box478
        gunModel[376] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Import Box479
        gunModel[377] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import Box480
        gunModel[378] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Import Box481
        gunModel[379] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Import Box482
        gunModel[380] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import Box483
        gunModel[381] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Import Box484
        gunModel[382] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box485
        gunModel[383] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import Box486
        gunModel[384] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box487
        gunModel[385] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Box488
        gunModel[386] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Import Box489
        gunModel[387] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import Box490
        gunModel[388] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import Box491
        gunModel[389] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box492
        gunModel[390] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box493
        gunModel[391] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Import Box494
        gunModel[392] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import Box495
        gunModel[393] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import Box496
        gunModel[394] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box497
        gunModel[395] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import Box498
        gunModel[396] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import Box499
        gunModel[397] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import Box500
        gunModel[398] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import Box501
        gunModel[399] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Import Box502
        gunModel[400] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box503
        gunModel[401] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box504
        gunModel[402] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import Box505
        gunModel[403] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import Box506
        gunModel[404] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import Box507
        gunModel[405] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box511
        gunModel[406] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import Box512
        gunModel[407] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import Box513
        gunModel[408] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import Box514
        gunModel[409] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Box515
        gunModel[410] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import Box516
        gunModel[411] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box517
        gunModel[412] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box518
        gunModel[413] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box519
        gunModel[414] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import Box520
        gunModel[415] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box521
        gunModel[416] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box522
        gunModel[417] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Import Box523
        gunModel[418] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box524
        gunModel[419] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import Box525
        gunModel[420] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box526
        gunModel[421] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Import Box527
        gunModel[422] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import Box528
        gunModel[423] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box529
        gunModel[424] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Import Box530
        gunModel[425] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box531
        gunModel[426] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Import Box532
        gunModel[427] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box533
        gunModel[428] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import Box534
        gunModel[429] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box535
        gunModel[430] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Import Box536
        gunModel[431] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box537
        gunModel[432] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Import Box538
        gunModel[433] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Import Box539
        gunModel[434] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import Box540
        gunModel[435] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Import Box541
        gunModel[436] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Import Box542
        gunModel[437] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Import Box543
        gunModel[438] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Import Box544
        gunModel[439] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Import Box545
        gunModel[440] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box546
        gunModel[441] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box547
        gunModel[442] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box548
        gunModel[443] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Import Box549
        gunModel[444] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Import Box550
        gunModel[445] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import Box551
        gunModel[446] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box552
        gunModel[447] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Import Box553
        gunModel[448] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import Box554
        gunModel[449] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import Box555
        gunModel[450] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Box556
        gunModel[451] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import Box557
        gunModel[452] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import Box558
        gunModel[453] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box559
        gunModel[454] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import Box560
        gunModel[455] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box561
        gunModel[456] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import Box562
        gunModel[457] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import Box563
        gunModel[458] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Import Box564
        gunModel[459] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box565
        gunModel[460] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Import Box566
        gunModel[461] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import Box567
        gunModel[462] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import Box568
        gunModel[463] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import Box569
        gunModel[464] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import Box570
        gunModel[465] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import Box571
        gunModel[466] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import Box572
        gunModel[467] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import Box573
        gunModel[468] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import Box574
        gunModel[469] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import Box575
        gunModel[470] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Import Box576
        gunModel[471] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Import Box577
        gunModel[472] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box578
        gunModel[473] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import Box579
        gunModel[474] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import Box580
        gunModel[475] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Import Box581
        gunModel[476] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Import Box582
        gunModel[477] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Import Box583
        gunModel[478] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import Box584
        gunModel[479] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import Box585
        gunModel[480] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box586
        gunModel[481] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import Box587
        gunModel[482] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box588
        gunModel[483] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box589
        gunModel[484] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Import Box590
        gunModel[485] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import Box591
        gunModel[486] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box592
        gunModel[487] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box593
        gunModel[488] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import Box594
        gunModel[489] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import Box595
        gunModel[490] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box596
        gunModel[491] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Import Box597
        gunModel[492] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import Box598
        gunModel[493] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import Box599
        gunModel[494] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import Box600
        gunModel[495] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box601

        gunModel[0].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Import Box4
        gunModel[0].setRotationPoint(-25.5F, -17.2F, -2F);

        gunModel[1].addBox(-6F, 0F, 0F, 6, 11, 4, 0F); // Import Box7
        gunModel[1].setRotationPoint(-18F, -17.2F, -2F);
        gunModel[1].rotateAngleZ = -0.64577182F;

        gunModel[2].addBox(-6.15F, 0F, 0F, 8, 4, 4, 0F); // Import Box8
        gunModel[2].setRotationPoint(-23.55F, -10.2F, -2F);
        gunModel[2].rotateAngleZ = -0.31415927F;

        gunModel[3].addBox(-5.55F, -0.2F, 0F, 6, 11, 4, 0F); // Import Box10
        gunModel[3].setRotationPoint(-18.5F, -17.2F, -2F);
        gunModel[3].rotateAngleZ = -0.45378561F;

        gunModel[4].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Import Box98
        gunModel[4].setRotationPoint(-17F, -22F, -2F);

        gunModel[5].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Import Box99
        gunModel[5].setRotationPoint(-17.2F, -18.7F, -1.5F);
        gunModel[5].rotateAngleZ = 0.61086524F;

        gunModel[6].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Import Box100
        gunModel[6].setRotationPoint(-16F, -18F, -1.5F);

        gunModel[7].addBox(0F, -1F, 0F, 2, 1, 3, 0F); // Import Box101
        gunModel[7].setRotationPoint(-8.65F, -17.05F, -1.5F);
        gunModel[7].rotateAngleZ = 0.62831853F;

        gunModel[8].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box102
        gunModel[8].setRotationPoint(-8F, -22F, -2F);

        gunModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import Box116
        gunModel[9].setRotationPoint(-13.5F, -22.6F, -0.5F);
        gunModel[9].rotateAngleZ = 0.08726646F;

        gunModel[10].addBox(-6F, 0F, 0F, 1, 1, 4, 0F); // Import Box219
        gunModel[10].setRotationPoint(-17.2F, -6.85F, -2.01F);

        gunModel[11].addBox(-6F, 0F, 0F, 6, 5, 4, 0F); // Import Box14
        gunModel[11].setRotationPoint(-17F, -22F, -2F);

        gunModel[12].addBox(-6F, 0F, 0F, 16, 7, 4, 0F); // Import Box15
        gunModel[12].setRotationPoint(-17F, -29F, -2F);

        gunModel[13].addBox(-6F, 0F, 0F, 5, 4, 4, 0F); // Import Box16
        gunModel[13].setRotationPoint(-22F, -29F, -2F);

        gunModel[14].addBox(1F, 1.8F, 0F, 3, 1, 4, 0F); // Import Box17
        gunModel[14].setRotationPoint(-23.5F, -28F, -2.01F);
        gunModel[14].rotateAngleZ = -0.75049158F;

        gunModel[15].addBox(-6F, 0F, 0F, 11, 11, 5, 0F); // Import Box18
        gunModel[15].setRotationPoint(-1.25F, -29F, -2.5F);

        gunModel[16].addBox(-6F, 0F, 0F, 3, 11, 1, 0F); // Import Box19
        gunModel[16].setRotationPoint(0F, -28.5F, 1.98F);

        gunModel[17].addBox(-6.01F, 9.25F, 0F, 11, 1, 6, 0F); // Import Box20
        gunModel[17].setRotationPoint(-1.75F, -27.5F, -3.01F);
        gunModel[17].rotateAngleZ = 0.05235988F;

        gunModel[18].addBox(0F, 0F, 0F, 35, 2, 5, 0F); // Import Box21
        gunModel[18].setRotationPoint(-28F, -32F, -2.5F);

        gunModel[19].addBox(0F, 0F, 0F, 35, 1, 3, 0F); // Import Box22
        gunModel[19].setRotationPoint(-28F, -30F, -1.5F);

        gunModel[20].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Import Box24
        gunModel[20].setRotationPoint(-28F, -30F, -2.5F);
        gunModel[20].rotateAngleX = 0.61086524F;

        gunModel[21].addBox(0F, 0F, -1F, 35, 2, 1, 0F); // Import Box25
        gunModel[21].setRotationPoint(-28F, -30F, 2.5F);
        gunModel[21].rotateAngleX = -0.61086524F;

        gunModel[22].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Import Box26
        gunModel[22].setRotationPoint(-28F, -33.62F, -1.35F);
        gunModel[22].rotateAngleX = -0.61086524F;

        gunModel[23].addBox(0F, 0F, -1F, 35, 2, 1, 0F); // Import Box27
        gunModel[23].setRotationPoint(-28F, -33.62F, 1.35F);
        gunModel[23].rotateAngleX = 0.61086524F;

        gunModel[24].addBox(0F, 0F, 0F, 29, 2, 3, 0F); // Import Box28
        gunModel[24].setRotationPoint(-22F, -35F, -1.5F);

        gunModel[25].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Import Box30
        gunModel[25].setRotationPoint(-19F, -36F, -1.49F);

        gunModel[26].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box31
        gunModel[26].setRotationPoint(-12F, -36.5F, -1.51F);

        gunModel[27].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box32
        gunModel[27].setRotationPoint(-10.5F, -36.5F, -1.51F);

        gunModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box33
        gunModel[28].setRotationPoint(-7.5F, -36.5F, -1.51F);

        gunModel[29].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box34
        gunModel[29].setRotationPoint(-9F, -36.5F, -1.51F);

        gunModel[30].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box35
        gunModel[30].setRotationPoint(-4.5F, -36.5F, -1.51F);

        gunModel[31].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box36
        gunModel[31].setRotationPoint(-6F, -36.5F, -1.51F);

        gunModel[32].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import Box37
        gunModel[32].setRotationPoint(4.5F, -36.5F, -1.51F);

        gunModel[33].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box38
        gunModel[33].setRotationPoint(3F, -36.5F, -1.51F);

        gunModel[34].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box39
        gunModel[34].setRotationPoint(1.5F, -36.5F, -1.51F);

        gunModel[35].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box40
        gunModel[35].setRotationPoint(0F, -36.5F, -1.51F);

        gunModel[36].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box41
        gunModel[36].setRotationPoint(-1.5F, -36.5F, -1.51F);

        gunModel[37].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box42
        gunModel[37].setRotationPoint(-3F, -36.5F, -1.51F);

        gunModel[38].addBox(0F, 0F, 0F, 35, 2, 3, 0F); // Import Box66
        gunModel[38].setRotationPoint(-28F, -33.5F, -1.5F);

        gunModel[39].addBox(0F, 0F, 0F, 35, 2, 3, 0F); // Import Box67
        gunModel[39].setRotationPoint(-28F, -29.3F, -1.5F);

        gunModel[40].addBox(-6F, 0F, 0F, 14, 1, 1, 0F); // Import Box94
        gunModel[40].setRotationPoint(-4.25F, -29.1F, -3F);

        gunModel[41].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Import Box96
        gunModel[41].setRotationPoint(-25F, -35.75F, -1F);

        gunModel[42].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import Box97
        gunModel[42].setRotationPoint(-25F, -35.8F, -1.99F);

        gunModel[43].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import Box98
        gunModel[43].setRotationPoint(-25F, -35.3F, -2F);

        gunModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box99
        gunModel[44].setRotationPoint(-24F, -35.8F, -1.99F);

        gunModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box100
        gunModel[45].setRotationPoint(-24F, -35.3F, -2F);

        gunModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box101
        gunModel[46].setRotationPoint(-24F, -35.8F, 1.01F);

        gunModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box102
        gunModel[47].setRotationPoint(-24F, -35.3F, 1F);

        gunModel[48].addBox(-0.01F, 0F, 0F, 1, 10, 1, 0F); // Import Box158
        gunModel[48].setRotationPoint(2.75F, -28.1F, -3F);

        gunModel[49].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Import Box240
        gunModel[49].setRotationPoint(-26F, -32F, -4.5F);
        gunModel[49].rotateAngleY = 0.33161256F;

        gunModel[50].addBox(-1.5F, 0F, 0F, 1, 2, 2, 0F); // Import Box241
        gunModel[50].setRotationPoint(-26F, -32F, -4.5F);
        gunModel[50].rotateAngleY = 0.33161256F;

        gunModel[51].addBox(-1F, 0.5F, 0F, 1, 1, 1, 0F); // Import Box242
        gunModel[51].setRotationPoint(-26F, -32F, -4F);
        gunModel[51].rotateAngleY = 0.33161256F;

        gunModel[52].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Import Box243
        gunModel[52].setRotationPoint(-13F, -33F, -3.5F);

        gunModel[53].addBox(-3F, 0F, 0F, 3, 3, 2, 0F); // Import Box244
        gunModel[53].setRotationPoint(-13F, -33F, -3.5F);
        gunModel[53].rotateAngleY = -0.61086524F;

        gunModel[54].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Import Box245
        gunModel[54].setRotationPoint(-10F, -33.5F, -2.5F);
        gunModel[54].rotateAngleX = -0.15707963F;

        gunModel[55].addBox(5F, 0.2F, -0.5F, 4, 2, 1, 0F); // Import Box246
        gunModel[55].setRotationPoint(-10F, -33.25F, -2F);
        gunModel[55].rotateAngleX = -0.40142573F;

        gunModel[56].addBox(0F, -1.25F, 0F, 14, 1, 1, 0F); // Import Box247
        gunModel[56].setRotationPoint(-10F, -33.5F, -2F);
        gunModel[56].rotateAngleX = -0.15707963F;

        gunModel[57].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box248
        gunModel[57].setRotationPoint(-6.25F, -28.1F, -3F);

        gunModel[58].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box249
        gunModel[58].setRotationPoint(-9.25F, -24.1F, -3F);

        gunModel[59].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Import Box250
        gunModel[59].setRotationPoint(-9F, -27.1F, -3F);

        gunModel[60].addBox(0F, -22F, 0F, 45, 9, 4, 0F); // Import Box113
        gunModel[60].setRotationPoint(-73F, -12F, -2F);

        gunModel[61].addBox(3F, -10F, 0.01F, 41, 11, 4, 0F); // Import Box114
        gunModel[61].setRotationPoint(-73F, -12F, -2F);
        gunModel[61].rotateAngleZ = 0.27925268F;

        gunModel[62].addBox(0F, -22F, 0F, 3, 23, 5, 0F); // Import Box115
        gunModel[62].setRotationPoint(-73F, -12F, -2.5F);
        gunModel[62].rotateAngleZ = 0.12217305F;

        gunModel[63].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Import Box116
        gunModel[63].setRotationPoint(-72F, -25F, -2F);
        gunModel[63].rotateAngleZ = 0.05235988F;

        gunModel[64].addBox(0F, -2F, -0.01F, 6, 2, 4, 0F); // Import Box117
        gunModel[64].setRotationPoint(-31F, -23F, -2F);
        gunModel[64].rotateAngleZ = 0.33161256F;

        gunModel[65].addBox(-6F, 0F, 0F, 2, 3, 5, 0F); // Import Box118
        gunModel[65].setRotationPoint(9.75F, -29F, -2.5F);

        gunModel[66].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Import Box120
        gunModel[66].setRotationPoint(7F, -34.5F, -1.5F);

        gunModel[67].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box121
        gunModel[67].setRotationPoint(7F, -32.5F, 0.77F);

        gunModel[68].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Import Box122
        gunModel[68].setRotationPoint(7F, -34.5F, 1.5F);
        gunModel[68].rotateAngleX = -0.71558499F;

        gunModel[69].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box123
        gunModel[69].setRotationPoint(7F, -32.5F, -3.77F);

        gunModel[70].addBox(0F, 0F, -3F, 2, 2, 3, 0F); // Import Box124
        gunModel[70].setRotationPoint(7F, -34.5F, -1.5F);
        gunModel[70].rotateAngleX = 0.71558499F;

        gunModel[71].addBox(0F, -2F, -3F, 2, 2, 3, 0F); // Import Box125
        gunModel[71].setRotationPoint(7F, -27.5F, -1.5F);
        gunModel[71].rotateAngleX = -0.71558499F;

        gunModel[72].addBox(0F, -2F, 0F, 2, 2, 3, 0F); // Import Box126
        gunModel[72].setRotationPoint(7F, -27.5F, 1.5F);
        gunModel[72].rotateAngleX = 0.71558499F;

        gunModel[73].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Import Box127
        gunModel[73].setRotationPoint(10F, -32.5F, 4F);

        gunModel[74].addBox(0F, 0F, -1F, 26, 2, 1, 0F); // Import Box128
        gunModel[74].setRotationPoint(10F, -29.5F, 5F);
        gunModel[74].rotateAngleX = -0.26179939F;

        gunModel[75].addBox(0F, -2F, -1F, 26, 2, 1, 0F); // Import Box129
        gunModel[75].setRotationPoint(10F, -32.5F, 5F);
        gunModel[75].rotateAngleX = 0.26179939F;

        gunModel[76].addBox(0F, 0F, -1F, 15, 2, 1, 0F); // Import Box130
        gunModel[76].setRotationPoint(37F, -29.5F, 5F);
        gunModel[76].rotateAngleX = -0.26179939F;

        gunModel[77].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Import Box131
        gunModel[77].setRotationPoint(37F, -32.5F, 4F);

        gunModel[78].addBox(0F, -2F, -1F, 15, 2, 1, 0F); // Import Box132
        gunModel[78].setRotationPoint(37F, -32.5F, 5F);
        gunModel[78].rotateAngleX = 0.26179939F;

        gunModel[79].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Import Box134
        gunModel[79].setRotationPoint(37F, -32.5F, -5F);

        gunModel[80].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // Import Box136
        gunModel[80].setRotationPoint(10F, -29.5F, -5F);
        gunModel[80].rotateAngleX = 0.26179939F;

        gunModel[81].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Import Box137
        gunModel[81].setRotationPoint(10F, -32.5F, -5F);

        gunModel[82].addBox(0F, -2F, 0F, 26, 2, 1, 0F); // Import Box138
        gunModel[82].setRotationPoint(10F, -32.5F, -5F);
        gunModel[82].rotateAngleX = -0.26179939F;

        gunModel[83].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Import Box139
        gunModel[83].setRotationPoint(37F, -29.5F, -5F);
        gunModel[83].rotateAngleX = 0.26179939F;

        gunModel[84].addBox(0F, -2F, 0F, 15, 2, 1, 0F); // Import Box140
        gunModel[84].setRotationPoint(37F, -32.5F, -5F);
        gunModel[84].rotateAngleX = -0.26179939F;

        gunModel[85].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Import Box141
        gunModel[85].setRotationPoint(10F, -36.5F, -1.5F);

        gunModel[86].addBox(0F, 0F, 0F, 23, 1, 2, 0F); // Import Box142
        gunModel[86].setRotationPoint(10F, -36.5F, 1.5F);
        gunModel[86].rotateAngleX = -0.26179939F;

        gunModel[87].addBox(0F, 0F, -2F, 23, 1, 2, 0F); // Import Box143
        gunModel[87].setRotationPoint(10F, -36.5F, -1.5F);
        gunModel[87].rotateAngleX = 0.26179939F;

        gunModel[88].addBox(0F, 0F, 0F, 26, 1, 2, 0F); // Import Box144
        gunModel[88].setRotationPoint(34F, -36.5F, 1.5F);
        gunModel[88].rotateAngleX = -0.26179939F;

        gunModel[89].addBox(0F, 0F, -2F, 26, 1, 2, 0F); // Import Box145
        gunModel[89].setRotationPoint(34F, -36.5F, -1.5F);
        gunModel[89].rotateAngleX = 0.26179939F;

        gunModel[90].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Import Box146
        gunModel[90].setRotationPoint(34F, -36.5F, -1.5F);

        gunModel[91].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Import Box147
        gunModel[91].setRotationPoint(34F, -26.5F, -1.5F);

        gunModel[92].addBox(0F, -1F, -2F, 26, 1, 2, 0F); // Import Box148
        gunModel[92].setRotationPoint(34F, -25.5F, -1.5F);
        gunModel[92].rotateAngleX = -0.26179939F;

        gunModel[93].addBox(0F, -1F, 0F, 26, 1, 2, 0F); // Import Box149
        gunModel[93].setRotationPoint(34F, -25.5F, 1.5F);
        gunModel[93].rotateAngleX = 0.26179939F;

        gunModel[94].addBox(0F, -1F, -2F, 16, 1, 2, 0F); // Import Box150
        gunModel[94].setRotationPoint(11F, -25.5F, -1.5F);
        gunModel[94].rotateAngleX = -0.26179939F;

        gunModel[95].addBox(0F, -1F, 0F, 16, 1, 2, 0F); // Import Box151
        gunModel[95].setRotationPoint(11F, -25.5F, 1.5F);
        gunModel[95].rotateAngleX = 0.26179939F;

        gunModel[96].addBox(0F, 0F, 0F, 16, 1, 3, 0F); // Import Box152
        gunModel[96].setRotationPoint(11F, -26.5F, -1.5F);

        gunModel[97].addBox(0F, 0F, 0F, 51, 7, 6, 0F); // Import Box153
        gunModel[97].setRotationPoint(9F, -34.5F, -3F);

        gunModel[98].addBox(0F, 0F, 0F, 51, 3, 1, 0F); // Import Box154
        gunModel[98].setRotationPoint(9F, -32.5F, 2.5F);

        gunModel[99].addBox(0F, 0F, 0F, 51, 1, 3, 0F); // Import Box156
        gunModel[99].setRotationPoint(9F, -35F, -1.5F);

        gunModel[100].addBox(0F, 0F, 0F, 51, 1, 3, 0F); // Import Box157
        gunModel[100].setRotationPoint(9F, -28F, -1.5F);

        gunModel[101].addBox(0F, 0F, 0F, 51, 3, 1, 0F); // Import Box158
        gunModel[101].setRotationPoint(9F, -32.5F, -3.5F);

        gunModel[102].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box159
        gunModel[102].setRotationPoint(9.5F, -27.5F, -1.51F);

        gunModel[103].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box160
        gunModel[103].setRotationPoint(11F, -27.5F, -1.51F);

        gunModel[104].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box161
        gunModel[104].setRotationPoint(14F, -27.5F, -1.51F);

        gunModel[105].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box162
        gunModel[105].setRotationPoint(12.5F, -27.5F, -1.51F);

        gunModel[106].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box163
        gunModel[106].setRotationPoint(20F, -27.5F, -1.51F);

        gunModel[107].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box164
        gunModel[107].setRotationPoint(18.5F, -27.5F, -1.51F);

        gunModel[108].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box165
        gunModel[108].setRotationPoint(15.5F, -27.5F, -1.51F);

        gunModel[109].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box166
        gunModel[109].setRotationPoint(17F, -27.5F, -1.51F);

        gunModel[110].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box167
        gunModel[110].setRotationPoint(26F, -27.5F, -1.51F);

        gunModel[111].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box168
        gunModel[111].setRotationPoint(24.5F, -27.5F, -1.51F);

        gunModel[112].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box169
        gunModel[112].setRotationPoint(21.5F, -27.5F, -1.51F);

        gunModel[113].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box170
        gunModel[113].setRotationPoint(23F, -27.5F, -1.51F);

        gunModel[114].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box171
        gunModel[114].setRotationPoint(32F, -27.5F, -1.51F);

        gunModel[115].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box172
        gunModel[115].setRotationPoint(30.5F, -27.5F, -1.51F);

        gunModel[116].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box173
        gunModel[116].setRotationPoint(27.5F, -27.5F, -1.51F);

        gunModel[117].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box174
        gunModel[117].setRotationPoint(29F, -27.5F, -1.51F);

        gunModel[118].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box175
        gunModel[118].setRotationPoint(38F, -27.5F, -1.51F);

        gunModel[119].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box176
        gunModel[119].setRotationPoint(36.5F, -27.5F, -1.51F);

        gunModel[120].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box177
        gunModel[120].setRotationPoint(33.5F, -27.5F, -1.51F);

        gunModel[121].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box178
        gunModel[121].setRotationPoint(35F, -27.5F, -1.51F);

        gunModel[122].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box179
        gunModel[122].setRotationPoint(52F, -27.5F, -1.51F);

        gunModel[123].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box180
        gunModel[123].setRotationPoint(50.5F, -27.5F, -1.51F);

        gunModel[124].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box181
        gunModel[124].setRotationPoint(47.5F, -27.5F, -1.51F);

        gunModel[125].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box182
        gunModel[125].setRotationPoint(49F, -27.5F, -1.51F);

        gunModel[126].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box183
        gunModel[126].setRotationPoint(46F, -27.5F, -1.51F);

        gunModel[127].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box184
        gunModel[127].setRotationPoint(44.5F, -27.5F, -1.51F);

        gunModel[128].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box185
        gunModel[128].setRotationPoint(43F, -27.5F, -1.51F);

        gunModel[129].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box186
        gunModel[129].setRotationPoint(41.5F, -27.5F, -1.51F);

        gunModel[130].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box187
        gunModel[130].setRotationPoint(40F, -27.5F, -1.51F);

        gunModel[131].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box193
        gunModel[131].setRotationPoint(58.5F, -27.5F, -1.51F);

        gunModel[132].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box194
        gunModel[132].setRotationPoint(57F, -27.5F, -1.51F);

        gunModel[133].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box195
        gunModel[133].setRotationPoint(55.5F, -27.5F, -1.51F);

        gunModel[134].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box196
        gunModel[134].setRotationPoint(54F, -27.5F, -1.51F);

        gunModel[135].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box197
        gunModel[135].setRotationPoint(54F, -35.5F, -1.51F);

        gunModel[136].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box198
        gunModel[136].setRotationPoint(55.5F, -35.5F, -1.51F);

        gunModel[137].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box199
        gunModel[137].setRotationPoint(57F, -35.5F, -1.51F);

        gunModel[138].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box200
        gunModel[138].setRotationPoint(58.5F, -35.5F, -1.51F);

        gunModel[139].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box201
        gunModel[139].setRotationPoint(40F, -35.5F, -1.51F);

        gunModel[140].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box202
        gunModel[140].setRotationPoint(41.5F, -35.5F, -1.51F);

        gunModel[141].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box203
        gunModel[141].setRotationPoint(43F, -35.5F, -1.51F);

        gunModel[142].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box204
        gunModel[142].setRotationPoint(44.5F, -35.5F, -1.51F);

        gunModel[143].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box205
        gunModel[143].setRotationPoint(46F, -35.5F, -1.51F);

        gunModel[144].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box206
        gunModel[144].setRotationPoint(49F, -35.5F, -1.51F);

        gunModel[145].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box207
        gunModel[145].setRotationPoint(47.5F, -35.5F, -1.51F);

        gunModel[146].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box208
        gunModel[146].setRotationPoint(50.5F, -35.5F, -1.51F);

        gunModel[147].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box209
        gunModel[147].setRotationPoint(52F, -35.5F, -1.51F);

        gunModel[148].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box210
        gunModel[148].setRotationPoint(35F, -35.5F, -1.51F);

        gunModel[149].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box211
        gunModel[149].setRotationPoint(33.5F, -35.5F, -1.51F);

        gunModel[150].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box212
        gunModel[150].setRotationPoint(36.5F, -35.5F, -1.51F);

        gunModel[151].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box213
        gunModel[151].setRotationPoint(38F, -35.5F, -1.51F);

        gunModel[152].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box214
        gunModel[152].setRotationPoint(29F, -35.5F, -1.51F);

        gunModel[153].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box215
        gunModel[153].setRotationPoint(27.5F, -35.5F, -1.51F);

        gunModel[154].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box216
        gunModel[154].setRotationPoint(30.5F, -35.5F, -1.51F);

        gunModel[155].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box217
        gunModel[155].setRotationPoint(32F, -35.5F, -1.51F);

        gunModel[156].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box218
        gunModel[156].setRotationPoint(23F, -35.5F, -1.51F);

        gunModel[157].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box219
        gunModel[157].setRotationPoint(21.5F, -35.5F, -1.51F);

        gunModel[158].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box220
        gunModel[158].setRotationPoint(24.5F, -35.5F, -1.51F);

        gunModel[159].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box221
        gunModel[159].setRotationPoint(26F, -35.5F, -1.51F);

        gunModel[160].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box222
        gunModel[160].setRotationPoint(17F, -35.5F, -1.51F);

        gunModel[161].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box223
        gunModel[161].setRotationPoint(15.5F, -35.5F, -1.51F);

        gunModel[162].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box224
        gunModel[162].setRotationPoint(18.5F, -35.5F, -1.51F);

        gunModel[163].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box225
        gunModel[163].setRotationPoint(20F, -35.5F, -1.51F);

        gunModel[164].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box226
        gunModel[164].setRotationPoint(12.5F, -35.5F, -1.51F);

        gunModel[165].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box227
        gunModel[165].setRotationPoint(14F, -35.5F, -1.51F);

        gunModel[166].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box228
        gunModel[166].setRotationPoint(11F, -35.5F, -1.51F);

        gunModel[167].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box229
        gunModel[167].setRotationPoint(9.5F, -35.5F, -1.51F);

        gunModel[168].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box234
        gunModel[168].setRotationPoint(40F, -29.51F, -4F);
        gunModel[168].rotateAngleX = 1.57079633F;

        gunModel[169].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box235
        gunModel[169].setRotationPoint(41.5F, -29.51F, -4F);
        gunModel[169].rotateAngleX = 1.57079633F;

        gunModel[170].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box236
        gunModel[170].setRotationPoint(43F, -29.51F, -4F);
        gunModel[170].rotateAngleX = 1.57079633F;

        gunModel[171].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box237
        gunModel[171].setRotationPoint(44.5F, -29.51F, -4F);
        gunModel[171].rotateAngleX = 1.57079633F;

        gunModel[172].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box238
        gunModel[172].setRotationPoint(46F, -29.51F, -4F);
        gunModel[172].rotateAngleX = 1.57079633F;

        gunModel[173].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box239
        gunModel[173].setRotationPoint(49F, -29.51F, -4F);
        gunModel[173].rotateAngleX = 1.57079633F;

        gunModel[174].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box240
        gunModel[174].setRotationPoint(47.5F, -29.51F, -4F);
        gunModel[174].rotateAngleX = 1.57079633F;

        gunModel[175].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box241
        gunModel[175].setRotationPoint(50.5F, -29.51F, -4F);
        gunModel[175].rotateAngleX = 1.57079633F;

        gunModel[176].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box243
        gunModel[176].setRotationPoint(35F, -29.51F, -4F);
        gunModel[176].rotateAngleX = 1.57079633F;

        gunModel[177].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box244
        gunModel[177].setRotationPoint(33.5F, -29.51F, -4F);
        gunModel[177].rotateAngleX = 1.57079633F;

        gunModel[178].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box245
        gunModel[178].setRotationPoint(36.5F, -29.51F, -4F);
        gunModel[178].rotateAngleX = 1.57079633F;

        gunModel[179].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box246
        gunModel[179].setRotationPoint(38F, -29.51F, -4F);
        gunModel[179].rotateAngleX = 1.57079633F;

        gunModel[180].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box247
        gunModel[180].setRotationPoint(29F, -29.51F, -4F);
        gunModel[180].rotateAngleX = 1.57079633F;

        gunModel[181].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box248
        gunModel[181].setRotationPoint(27.5F, -29.51F, -4F);
        gunModel[181].rotateAngleX = 1.57079633F;

        gunModel[182].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box249
        gunModel[182].setRotationPoint(30.5F, -29.51F, -4F);
        gunModel[182].rotateAngleX = 1.57079633F;

        gunModel[183].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box250
        gunModel[183].setRotationPoint(32F, -29.51F, -4F);
        gunModel[183].rotateAngleX = 1.57079633F;

        gunModel[184].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box251
        gunModel[184].setRotationPoint(23F, -29.51F, -4F);
        gunModel[184].rotateAngleX = 1.57079633F;

        gunModel[185].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box252
        gunModel[185].setRotationPoint(21.5F, -29.51F, -4F);
        gunModel[185].rotateAngleX = 1.57079633F;

        gunModel[186].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box253
        gunModel[186].setRotationPoint(24.5F, -29.51F, -4F);
        gunModel[186].rotateAngleX = 1.57079633F;

        gunModel[187].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box254
        gunModel[187].setRotationPoint(26F, -29.51F, -4F);
        gunModel[187].rotateAngleX = 1.57079633F;

        gunModel[188].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box255
        gunModel[188].setRotationPoint(17F, -29.51F, -4F);
        gunModel[188].rotateAngleX = 1.57079633F;

        gunModel[189].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box256
        gunModel[189].setRotationPoint(15.5F, -29.51F, -4F);
        gunModel[189].rotateAngleX = 1.57079633F;

        gunModel[190].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box257
        gunModel[190].setRotationPoint(18.5F, -29.51F, -4F);
        gunModel[190].rotateAngleX = 1.57079633F;

        gunModel[191].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box258
        gunModel[191].setRotationPoint(20F, -29.51F, -4F);
        gunModel[191].rotateAngleX = 1.57079633F;

        gunModel[192].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box259
        gunModel[192].setRotationPoint(12.5F, -29.51F, -4F);
        gunModel[192].rotateAngleX = 1.57079633F;

        gunModel[193].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box260
        gunModel[193].setRotationPoint(14F, -29.51F, -4F);
        gunModel[193].rotateAngleX = 1.57079633F;

        gunModel[194].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box261
        gunModel[194].setRotationPoint(11F, -29.51F, -4F);
        gunModel[194].rotateAngleX = 1.57079633F;

        gunModel[195].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box262
        gunModel[195].setRotationPoint(9.5F, -29.51F, -4F);
        gunModel[195].rotateAngleX = 1.57079633F;

        gunModel[196].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box267
        gunModel[196].setRotationPoint(40F, -29.51F, 3F);
        gunModel[196].rotateAngleX = 1.57079633F;

        gunModel[197].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box268
        gunModel[197].setRotationPoint(41.5F, -29.51F, 3F);
        gunModel[197].rotateAngleX = 1.57079633F;

        gunModel[198].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box269
        gunModel[198].setRotationPoint(43F, -29.51F, 3F);
        gunModel[198].rotateAngleX = 1.57079633F;

        gunModel[199].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box270
        gunModel[199].setRotationPoint(44.5F, -29.51F, 3F);
        gunModel[199].rotateAngleX = 1.57079633F;

        gunModel[200].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box271
        gunModel[200].setRotationPoint(46F, -29.51F, 3F);
        gunModel[200].rotateAngleX = 1.57079633F;

        gunModel[201].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box272
        gunModel[201].setRotationPoint(49F, -29.51F, 3F);
        gunModel[201].rotateAngleX = 1.57079633F;

        gunModel[202].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box273
        gunModel[202].setRotationPoint(47.5F, -29.51F, 3F);
        gunModel[202].rotateAngleX = 1.57079633F;

        gunModel[203].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box274
        gunModel[203].setRotationPoint(50.5F, -29.51F, 3F);
        gunModel[203].rotateAngleX = 1.57079633F;

        gunModel[204].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box276
        gunModel[204].setRotationPoint(35F, -29.51F, 3F);
        gunModel[204].rotateAngleX = 1.57079633F;

        gunModel[205].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box277
        gunModel[205].setRotationPoint(33.5F, -29.51F, 3F);
        gunModel[205].rotateAngleX = 1.57079633F;

        gunModel[206].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box278
        gunModel[206].setRotationPoint(36.5F, -29.51F, 3F);
        gunModel[206].rotateAngleX = 1.57079633F;

        gunModel[207].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box279
        gunModel[207].setRotationPoint(38F, -29.51F, 3F);
        gunModel[207].rotateAngleX = 1.57079633F;

        gunModel[208].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box280
        gunModel[208].setRotationPoint(29F, -29.51F, 3F);
        gunModel[208].rotateAngleX = 1.57079633F;

        gunModel[209].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box281
        gunModel[209].setRotationPoint(27.5F, -29.51F, 3F);
        gunModel[209].rotateAngleX = 1.57079633F;

        gunModel[210].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box282
        gunModel[210].setRotationPoint(30.5F, -29.51F, 3F);
        gunModel[210].rotateAngleX = 1.57079633F;

        gunModel[211].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box283
        gunModel[211].setRotationPoint(32F, -29.51F, 3F);
        gunModel[211].rotateAngleX = 1.57079633F;

        gunModel[212].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box284
        gunModel[212].setRotationPoint(23F, -29.51F, 3F);
        gunModel[212].rotateAngleX = 1.57079633F;

        gunModel[213].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box285
        gunModel[213].setRotationPoint(21.5F, -29.51F, 3F);
        gunModel[213].rotateAngleX = 1.57079633F;

        gunModel[214].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box286
        gunModel[214].setRotationPoint(24.5F, -29.51F, 3F);
        gunModel[214].rotateAngleX = 1.57079633F;

        gunModel[215].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box287
        gunModel[215].setRotationPoint(26F, -29.51F, 3F);
        gunModel[215].rotateAngleX = 1.57079633F;

        gunModel[216].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box288
        gunModel[216].setRotationPoint(17F, -29.51F, 3F);
        gunModel[216].rotateAngleX = 1.57079633F;

        gunModel[217].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box289
        gunModel[217].setRotationPoint(15.5F, -29.51F, 3F);
        gunModel[217].rotateAngleX = 1.57079633F;

        gunModel[218].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box290
        gunModel[218].setRotationPoint(18.5F, -29.51F, 3F);
        gunModel[218].rotateAngleX = 1.57079633F;

        gunModel[219].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box291
        gunModel[219].setRotationPoint(20F, -29.51F, 3F);
        gunModel[219].rotateAngleX = 1.57079633F;

        gunModel[220].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box292
        gunModel[220].setRotationPoint(12.5F, -29.51F, 3F);
        gunModel[220].rotateAngleX = 1.57079633F;

        gunModel[221].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box293
        gunModel[221].setRotationPoint(14F, -29.51F, 3F);
        gunModel[221].rotateAngleX = 1.57079633F;

        gunModel[222].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box294
        gunModel[222].setRotationPoint(11F, -29.51F, 3F);
        gunModel[222].rotateAngleX = 1.57079633F;

        gunModel[223].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box295
        gunModel[223].setRotationPoint(9.5F, -29.51F, 3F);
        gunModel[223].rotateAngleX = 1.57079633F;

        gunModel[224].addBox(0F, 0F, 0F, 32, 3, 3, 0F); // Import Box296
        gunModel[224].setRotationPoint(60F, -32.5F, -1.51F);

        gunModel[225].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Import Box297
        gunModel[225].setRotationPoint(67.5F, -33F, -1.5F);

        gunModel[226].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Import Box300
        gunModel[226].setRotationPoint(62.5F, -34.5F, -1F);

        gunModel[227].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Import Box301
        gunModel[227].setRotationPoint(61.5F, -35.5F, -1.5F);

        gunModel[228].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box310
        gunModel[228].setRotationPoint(38F, -29.51F, 5.25F);
        gunModel[228].rotateAngleX = -0.26179939F;

        gunModel[229].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box311
        gunModel[229].setRotationPoint(38F, -32.51F, 5.25F);
        gunModel[229].rotateAngleX = 0.26179939F;

        gunModel[230].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box312
        gunModel[230].setRotationPoint(38F, -32.51F, 4.25F);

        gunModel[231].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box313
        gunModel[231].setRotationPoint(40F, -29.51F, 5.25F);
        gunModel[231].rotateAngleX = -0.26179939F;

        gunModel[232].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box314
        gunModel[232].setRotationPoint(40F, -32.51F, 5.25F);
        gunModel[232].rotateAngleX = 0.26179939F;

        gunModel[233].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box315
        gunModel[233].setRotationPoint(40F, -32.51F, 4.25F);

        gunModel[234].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box316
        gunModel[234].setRotationPoint(44F, -29.51F, 5.25F);
        gunModel[234].rotateAngleX = -0.26179939F;

        gunModel[235].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box317
        gunModel[235].setRotationPoint(44F, -32.51F, 5.25F);
        gunModel[235].rotateAngleX = 0.26179939F;

        gunModel[236].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box318
        gunModel[236].setRotationPoint(44F, -32.51F, 4.25F);

        gunModel[237].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box319
        gunModel[237].setRotationPoint(42F, -32.51F, 5.25F);
        gunModel[237].rotateAngleX = 0.26179939F;

        gunModel[238].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box320
        gunModel[238].setRotationPoint(42F, -32.51F, 4.25F);

        gunModel[239].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box321
        gunModel[239].setRotationPoint(42F, -29.51F, 5.25F);
        gunModel[239].rotateAngleX = -0.26179939F;

        gunModel[240].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box322
        gunModel[240].setRotationPoint(48F, -29.51F, 5.25F);
        gunModel[240].rotateAngleX = -0.26179939F;

        gunModel[241].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box323
        gunModel[241].setRotationPoint(48F, -32.51F, 5.25F);
        gunModel[241].rotateAngleX = 0.26179939F;

        gunModel[242].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box324
        gunModel[242].setRotationPoint(48F, -32.51F, 4.25F);

        gunModel[243].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box325
        gunModel[243].setRotationPoint(46F, -32.51F, 5.25F);
        gunModel[243].rotateAngleX = 0.26179939F;

        gunModel[244].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box326
        gunModel[244].setRotationPoint(46F, -32.51F, 4.25F);

        gunModel[245].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box327
        gunModel[245].setRotationPoint(46F, -29.51F, 5.25F);
        gunModel[245].rotateAngleX = -0.26179939F;

        gunModel[246].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box331
        gunModel[246].setRotationPoint(50F, -32.51F, 5.25F);
        gunModel[246].rotateAngleX = 0.26179939F;

        gunModel[247].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box332
        gunModel[247].setRotationPoint(50F, -32.51F, 4.25F);

        gunModel[248].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box333
        gunModel[248].setRotationPoint(50F, -29.51F, 5.25F);
        gunModel[248].rotateAngleX = -0.26179939F;

        gunModel[249].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box334
        gunModel[249].setRotationPoint(23.5F, -32.51F, 4.25F);

        gunModel[250].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box335
        gunModel[250].setRotationPoint(23.5F, -29.51F, 5.25F);
        gunModel[250].rotateAngleX = -0.26179939F;

        gunModel[251].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box336
        gunModel[251].setRotationPoint(23.5F, -32.51F, 5.25F);
        gunModel[251].rotateAngleX = 0.26179939F;

        gunModel[252].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box337
        gunModel[252].setRotationPoint(21.5F, -32.51F, 4.25F);

        gunModel[253].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box338
        gunModel[253].setRotationPoint(21.5F, -32.51F, 5.25F);
        gunModel[253].rotateAngleX = 0.26179939F;

        gunModel[254].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box339
        gunModel[254].setRotationPoint(21.5F, -29.51F, 5.25F);
        gunModel[254].rotateAngleX = -0.26179939F;

        gunModel[255].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box340
        gunModel[255].setRotationPoint(19.5F, -29.51F, 5.25F);
        gunModel[255].rotateAngleX = -0.26179939F;

        gunModel[256].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box341
        gunModel[256].setRotationPoint(19.5F, -32.51F, 4.25F);

        gunModel[257].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box342
        gunModel[257].setRotationPoint(19.5F, -32.51F, 5.25F);
        gunModel[257].rotateAngleX = 0.26179939F;

        gunModel[258].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box343
        gunModel[258].setRotationPoint(17.5F, -32.51F, 5.25F);
        gunModel[258].rotateAngleX = 0.26179939F;

        gunModel[259].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box344
        gunModel[259].setRotationPoint(17.5F, -32.51F, 4.25F);

        gunModel[260].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box345
        gunModel[260].setRotationPoint(17.5F, -29.51F, 5.25F);
        gunModel[260].rotateAngleX = -0.26179939F;

        gunModel[261].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box346
        gunModel[261].setRotationPoint(15.5F, -29.51F, 5.25F);
        gunModel[261].rotateAngleX = -0.26179939F;

        gunModel[262].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box347
        gunModel[262].setRotationPoint(15.5F, -32.51F, 4.25F);

        gunModel[263].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box348
        gunModel[263].setRotationPoint(15.5F, -32.51F, 5.25F);
        gunModel[263].rotateAngleX = 0.26179939F;

        gunModel[264].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box349
        gunModel[264].setRotationPoint(13.5F, -32.51F, 5.25F);
        gunModel[264].rotateAngleX = 0.26179939F;

        gunModel[265].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box350
        gunModel[265].setRotationPoint(13.5F, -32.51F, 4.25F);

        gunModel[266].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box351
        gunModel[266].setRotationPoint(13.5F, -29.51F, 5.25F);
        gunModel[266].rotateAngleX = -0.26179939F;

        gunModel[267].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box352
        gunModel[267].setRotationPoint(11.5F, -29.51F, 5.25F);
        gunModel[267].rotateAngleX = -0.26179939F;

        gunModel[268].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box353
        gunModel[268].setRotationPoint(11.5F, -32.51F, 4.25F);

        gunModel[269].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box354
        gunModel[269].setRotationPoint(11.5F, -32.51F, 5.25F);
        gunModel[269].rotateAngleX = 0.26179939F;

        gunModel[270].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box367
        gunModel[270].setRotationPoint(29.5F, -29.51F, 5.25F);
        gunModel[270].rotateAngleX = -0.26179939F;

        gunModel[271].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box368
        gunModel[271].setRotationPoint(29.5F, -32.51F, 4.25F);

        gunModel[272].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box369
        gunModel[272].setRotationPoint(29.5F, -32.51F, 5.25F);
        gunModel[272].rotateAngleX = 0.26179939F;

        gunModel[273].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box370
        gunModel[273].setRotationPoint(27.5F, -32.51F, 5.25F);
        gunModel[273].rotateAngleX = 0.26179939F;

        gunModel[274].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box371
        gunModel[274].setRotationPoint(27.5F, -32.51F, 4.25F);

        gunModel[275].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box372
        gunModel[275].setRotationPoint(27.5F, -29.51F, 5.25F);
        gunModel[275].rotateAngleX = -0.26179939F;

        gunModel[276].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box373
        gunModel[276].setRotationPoint(25.5F, -29.51F, 5.25F);
        gunModel[276].rotateAngleX = -0.26179939F;

        gunModel[277].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box374
        gunModel[277].setRotationPoint(25.5F, -32.51F, 4.25F);

        gunModel[278].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box375
        gunModel[278].setRotationPoint(25.5F, -32.51F, 5.25F);
        gunModel[278].rotateAngleX = 0.26179939F;

        gunModel[279].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box376
        gunModel[279].setRotationPoint(31.5F, -29.51F, 5.25F);
        gunModel[279].rotateAngleX = -0.26179939F;

        gunModel[280].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box377
        gunModel[280].setRotationPoint(31.5F, -32.51F, 4.25F);

        gunModel[281].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box378
        gunModel[281].setRotationPoint(31.5F, -32.51F, 5.25F);
        gunModel[281].rotateAngleX = 0.26179939F;

        gunModel[282].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Import Box379
        gunModel[282].setRotationPoint(33.5F, -29.51F, 5.25F);
        gunModel[282].rotateAngleX = -0.26179939F;

        gunModel[283].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box380
        gunModel[283].setRotationPoint(33.5F, -32.51F, 4.25F);

        gunModel[284].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Import Box381
        gunModel[284].setRotationPoint(33.5F, -32.51F, 5.25F);
        gunModel[284].rotateAngleX = 0.26179939F;

        gunModel[285].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box385
        gunModel[285].setRotationPoint(35.5F, -36.75F, -1.51F);

        gunModel[286].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box386
        gunModel[286].setRotationPoint(35.5F, -36.75F, 1.49F);
        gunModel[286].rotateAngleX = -0.26179939F;

        gunModel[287].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box387
        gunModel[287].setRotationPoint(35.5F, -36.75F, -1.51F);
        gunModel[287].rotateAngleX = 0.26179939F;

        gunModel[288].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box388
        gunModel[288].setRotationPoint(37.5F, -36.75F, -1.51F);

        gunModel[289].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box389
        gunModel[289].setRotationPoint(37.5F, -36.75F, 1.49F);
        gunModel[289].rotateAngleX = -0.26179939F;

        gunModel[290].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box390
        gunModel[290].setRotationPoint(37.5F, -36.75F, -1.51F);
        gunModel[290].rotateAngleX = 0.26179939F;

        gunModel[291].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box391
        gunModel[291].setRotationPoint(41.5F, -36.75F, -1.51F);

        gunModel[292].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box392
        gunModel[292].setRotationPoint(41.5F, -36.75F, 1.49F);
        gunModel[292].rotateAngleX = -0.26179939F;

        gunModel[293].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box393
        gunModel[293].setRotationPoint(41.5F, -36.75F, -1.51F);
        gunModel[293].rotateAngleX = 0.26179939F;

        gunModel[294].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box394
        gunModel[294].setRotationPoint(39.5F, -36.75F, 1.49F);
        gunModel[294].rotateAngleX = -0.26179939F;

        gunModel[295].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box395
        gunModel[295].setRotationPoint(39.5F, -36.75F, -1.51F);

        gunModel[296].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box396
        gunModel[296].setRotationPoint(39.5F, -36.75F, -1.51F);
        gunModel[296].rotateAngleX = 0.26179939F;

        gunModel[297].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box397
        gunModel[297].setRotationPoint(45.5F, -36.75F, -1.51F);

        gunModel[298].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box398
        gunModel[298].setRotationPoint(45.5F, -36.75F, 1.49F);
        gunModel[298].rotateAngleX = -0.26179939F;

        gunModel[299].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box399
        gunModel[299].setRotationPoint(45.5F, -36.75F, -1.51F);
        gunModel[299].rotateAngleX = 0.26179939F;

        gunModel[300].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box400
        gunModel[300].setRotationPoint(43.5F, -36.75F, 1.49F);
        gunModel[300].rotateAngleX = -0.26179939F;

        gunModel[301].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box401
        gunModel[301].setRotationPoint(43.5F, -36.75F, -1.51F);

        gunModel[302].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box402
        gunModel[302].setRotationPoint(43.5F, -36.75F, -1.51F);
        gunModel[302].rotateAngleX = 0.26179939F;

        gunModel[303].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box403
        gunModel[303].setRotationPoint(49.5F, -36.75F, -1.51F);

        gunModel[304].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box404
        gunModel[304].setRotationPoint(49.5F, -36.75F, 1.49F);
        gunModel[304].rotateAngleX = -0.26179939F;

        gunModel[305].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box405
        gunModel[305].setRotationPoint(49.5F, -36.75F, -1.51F);
        gunModel[305].rotateAngleX = 0.26179939F;

        gunModel[306].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box406
        gunModel[306].setRotationPoint(47.5F, -36.75F, 1.49F);
        gunModel[306].rotateAngleX = -0.26179939F;

        gunModel[307].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box407
        gunModel[307].setRotationPoint(47.5F, -36.75F, -1.51F);

        gunModel[308].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box408
        gunModel[308].setRotationPoint(47.5F, -36.75F, -1.51F);
        gunModel[308].rotateAngleX = 0.26179939F;

        gunModel[309].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box409
        gunModel[309].setRotationPoint(53.5F, -36.75F, -1.51F);

        gunModel[310].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box410
        gunModel[310].setRotationPoint(53.5F, -36.75F, 1.49F);
        gunModel[310].rotateAngleX = -0.26179939F;

        gunModel[311].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box411
        gunModel[311].setRotationPoint(53.5F, -36.75F, -1.51F);
        gunModel[311].rotateAngleX = 0.26179939F;

        gunModel[312].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box412
        gunModel[312].setRotationPoint(51.5F, -36.75F, 1.49F);
        gunModel[312].rotateAngleX = -0.26179939F;

        gunModel[313].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box413
        gunModel[313].setRotationPoint(51.5F, -36.75F, -1.51F);

        gunModel[314].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box414
        gunModel[314].setRotationPoint(51.5F, -36.75F, -1.51F);
        gunModel[314].rotateAngleX = 0.26179939F;

        gunModel[315].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box415
        gunModel[315].setRotationPoint(57.5F, -36.75F, -1.51F);

        gunModel[316].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box416
        gunModel[316].setRotationPoint(57.5F, -36.75F, 1.49F);
        gunModel[316].rotateAngleX = -0.26179939F;

        gunModel[317].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box417
        gunModel[317].setRotationPoint(57.5F, -36.75F, -1.51F);
        gunModel[317].rotateAngleX = 0.26179939F;

        gunModel[318].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box418
        gunModel[318].setRotationPoint(55.5F, -36.75F, 1.49F);
        gunModel[318].rotateAngleX = -0.26179939F;

        gunModel[319].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box419
        gunModel[319].setRotationPoint(55.5F, -36.75F, -1.51F);

        gunModel[320].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box420
        gunModel[320].setRotationPoint(55.5F, -36.75F, -1.51F);
        gunModel[320].rotateAngleX = 0.26179939F;

        gunModel[321].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box421
        gunModel[321].setRotationPoint(11F, -36.75F, -1.51F);
        gunModel[321].rotateAngleX = 0.26179939F;

        gunModel[322].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box422
        gunModel[322].setRotationPoint(11F, -36.75F, -1.51F);

        gunModel[323].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box423
        gunModel[323].setRotationPoint(11F, -36.75F, 1.49F);
        gunModel[323].rotateAngleX = -0.26179939F;

        gunModel[324].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box424
        gunModel[324].setRotationPoint(13F, -36.75F, -1.51F);
        gunModel[324].rotateAngleX = 0.26179939F;

        gunModel[325].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box425
        gunModel[325].setRotationPoint(13F, -36.75F, -1.51F);

        gunModel[326].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box426
        gunModel[326].setRotationPoint(13F, -36.75F, 1.49F);
        gunModel[326].rotateAngleX = -0.26179939F;

        gunModel[327].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box427
        gunModel[327].setRotationPoint(17F, -36.75F, -1.51F);
        gunModel[327].rotateAngleX = 0.26179939F;

        gunModel[328].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box428
        gunModel[328].setRotationPoint(17F, -36.75F, -1.51F);

        gunModel[329].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box429
        gunModel[329].setRotationPoint(17F, -36.75F, 1.49F);
        gunModel[329].rotateAngleX = -0.26179939F;

        gunModel[330].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box430
        gunModel[330].setRotationPoint(15F, -36.75F, -1.51F);
        gunModel[330].rotateAngleX = 0.26179939F;

        gunModel[331].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box431
        gunModel[331].setRotationPoint(15F, -36.75F, -1.51F);

        gunModel[332].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box432
        gunModel[332].setRotationPoint(15F, -36.75F, 1.49F);
        gunModel[332].rotateAngleX = -0.26179939F;

        gunModel[333].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box433
        gunModel[333].setRotationPoint(21F, -36.75F, -1.51F);
        gunModel[333].rotateAngleX = 0.26179939F;

        gunModel[334].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box434
        gunModel[334].setRotationPoint(21F, -36.75F, -1.51F);

        gunModel[335].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box435
        gunModel[335].setRotationPoint(21F, -36.75F, 1.49F);
        gunModel[335].rotateAngleX = -0.26179939F;

        gunModel[336].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box436
        gunModel[336].setRotationPoint(19F, -36.75F, -1.51F);
        gunModel[336].rotateAngleX = 0.26179939F;

        gunModel[337].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box437
        gunModel[337].setRotationPoint(19F, -36.75F, -1.51F);

        gunModel[338].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box438
        gunModel[338].setRotationPoint(19F, -36.75F, 1.49F);
        gunModel[338].rotateAngleX = -0.26179939F;

        gunModel[339].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box439
        gunModel[339].setRotationPoint(25F, -36.75F, -1.51F);
        gunModel[339].rotateAngleX = 0.26179939F;

        gunModel[340].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box440
        gunModel[340].setRotationPoint(25F, -36.75F, -1.51F);

        gunModel[341].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box441
        gunModel[341].setRotationPoint(25F, -36.75F, 1.49F);
        gunModel[341].rotateAngleX = -0.26179939F;

        gunModel[342].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box442
        gunModel[342].setRotationPoint(23F, -36.75F, -1.51F);
        gunModel[342].rotateAngleX = 0.26179939F;

        gunModel[343].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box443
        gunModel[343].setRotationPoint(23F, -36.75F, -1.51F);

        gunModel[344].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box444
        gunModel[344].setRotationPoint(23F, -36.75F, 1.49F);
        gunModel[344].rotateAngleX = -0.26179939F;

        gunModel[345].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box445
        gunModel[345].setRotationPoint(29F, -36.75F, -1.51F);
        gunModel[345].rotateAngleX = 0.26179939F;

        gunModel[346].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box446
        gunModel[346].setRotationPoint(29F, -36.75F, -1.51F);

        gunModel[347].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box447
        gunModel[347].setRotationPoint(29F, -36.75F, 1.49F);
        gunModel[347].rotateAngleX = -0.26179939F;

        gunModel[348].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box448
        gunModel[348].setRotationPoint(27F, -36.75F, -1.51F);
        gunModel[348].rotateAngleX = 0.26179939F;

        gunModel[349].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box449
        gunModel[349].setRotationPoint(27F, -36.75F, -1.51F);

        gunModel[350].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box450
        gunModel[350].setRotationPoint(27F, -36.75F, 1.49F);
        gunModel[350].rotateAngleX = -0.26179939F;

        gunModel[351].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Import Box454
        gunModel[351].setRotationPoint(31F, -36.75F, -1.51F);
        gunModel[351].rotateAngleX = 0.26179939F;

        gunModel[352].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box455
        gunModel[352].setRotationPoint(31F, -36.75F, -1.51F);

        gunModel[353].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box456
        gunModel[353].setRotationPoint(31F, -36.75F, 1.49F);
        gunModel[353].rotateAngleX = -0.26179939F;

        gunModel[354].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box457
        gunModel[354].setRotationPoint(11.5F, -25.25F, 1.49F);
        gunModel[354].rotateAngleX = 0.26179939F;

        gunModel[355].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box458
        gunModel[355].setRotationPoint(11.5F, -25.25F, -1.51F);
        gunModel[355].rotateAngleX = -0.26179939F;

        gunModel[356].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box459
        gunModel[356].setRotationPoint(11.5F, -26.25F, -1.51F);

        gunModel[357].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box460
        gunModel[357].setRotationPoint(13.5F, -25.25F, -1.51F);
        gunModel[357].rotateAngleX = -0.26179939F;

        gunModel[358].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box461
        gunModel[358].setRotationPoint(13.5F, -26.25F, -1.51F);

        gunModel[359].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box462
        gunModel[359].setRotationPoint(13.5F, -25.25F, 1.49F);
        gunModel[359].rotateAngleX = 0.26179939F;

        gunModel[360].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box463
        gunModel[360].setRotationPoint(15.5F, -25.25F, -1.51F);
        gunModel[360].rotateAngleX = -0.26179939F;

        gunModel[361].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box464
        gunModel[361].setRotationPoint(15.5F, -26.25F, -1.51F);

        gunModel[362].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box465
        gunModel[362].setRotationPoint(15.5F, -25.25F, 1.49F);
        gunModel[362].rotateAngleX = 0.26179939F;

        gunModel[363].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box466
        gunModel[363].setRotationPoint(17.5F, -25.25F, -1.51F);
        gunModel[363].rotateAngleX = -0.26179939F;

        gunModel[364].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box467
        gunModel[364].setRotationPoint(17.5F, -26.25F, -1.51F);

        gunModel[365].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box468
        gunModel[365].setRotationPoint(17.5F, -25.25F, 1.49F);
        gunModel[365].rotateAngleX = 0.26179939F;

        gunModel[366].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box469
        gunModel[366].setRotationPoint(19.5F, -25.25F, -1.51F);
        gunModel[366].rotateAngleX = -0.26179939F;

        gunModel[367].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box470
        gunModel[367].setRotationPoint(19.5F, -26.25F, -1.51F);

        gunModel[368].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box471
        gunModel[368].setRotationPoint(19.5F, -25.25F, 1.49F);
        gunModel[368].rotateAngleX = 0.26179939F;

        gunModel[369].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box472
        gunModel[369].setRotationPoint(21.5F, -25.25F, -1.51F);
        gunModel[369].rotateAngleX = -0.26179939F;

        gunModel[370].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box473
        gunModel[370].setRotationPoint(21.5F, -26.25F, -1.51F);

        gunModel[371].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box474
        gunModel[371].setRotationPoint(21.5F, -25.25F, 1.49F);
        gunModel[371].rotateAngleX = 0.26179939F;

        gunModel[372].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box475
        gunModel[372].setRotationPoint(23.5F, -25.25F, -1.51F);
        gunModel[372].rotateAngleX = -0.26179939F;

        gunModel[373].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box476
        gunModel[373].setRotationPoint(23.5F, -26.25F, -1.51F);

        gunModel[374].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box477
        gunModel[374].setRotationPoint(23.5F, -25.25F, 1.49F);
        gunModel[374].rotateAngleX = 0.26179939F;

        gunModel[375].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box478
        gunModel[375].setRotationPoint(25.5F, -25.25F, -1.51F);
        gunModel[375].rotateAngleX = -0.26179939F;

        gunModel[376].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box479
        gunModel[376].setRotationPoint(25.5F, -26.25F, -1.51F);

        gunModel[377].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box480
        gunModel[377].setRotationPoint(25.5F, -25.25F, 1.49F);
        gunModel[377].rotateAngleX = 0.26179939F;

        gunModel[378].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box481
        gunModel[378].setRotationPoint(37.5F, -25.25F, 1.49F);
        gunModel[378].rotateAngleX = 0.26179939F;

        gunModel[379].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box482
        gunModel[379].setRotationPoint(37.5F, -26.25F, -1.51F);

        gunModel[380].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box483
        gunModel[380].setRotationPoint(37.5F, -25.25F, -1.51F);
        gunModel[380].rotateAngleX = -0.26179939F;

        gunModel[381].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box484
        gunModel[381].setRotationPoint(39.5F, -25.25F, -1.51F);
        gunModel[381].rotateAngleX = -0.26179939F;

        gunModel[382].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box485
        gunModel[382].setRotationPoint(39.5F, -26.25F, -1.51F);

        gunModel[383].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box486
        gunModel[383].setRotationPoint(39.5F, -25.25F, 1.49F);
        gunModel[383].rotateAngleX = 0.26179939F;

        gunModel[384].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box487
        gunModel[384].setRotationPoint(41.5F, -25.25F, 1.49F);
        gunModel[384].rotateAngleX = 0.26179939F;

        gunModel[385].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box488
        gunModel[385].setRotationPoint(41.5F, -26.25F, -1.51F);

        gunModel[386].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box489
        gunModel[386].setRotationPoint(41.5F, -25.25F, -1.51F);
        gunModel[386].rotateAngleX = -0.26179939F;

        gunModel[387].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box490
        gunModel[387].setRotationPoint(43.5F, -25.25F, -1.51F);
        gunModel[387].rotateAngleX = -0.26179939F;

        gunModel[388].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box491
        gunModel[388].setRotationPoint(43.5F, -26.25F, -1.51F);

        gunModel[389].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box492
        gunModel[389].setRotationPoint(43.5F, -25.25F, 1.49F);
        gunModel[389].rotateAngleX = 0.26179939F;

        gunModel[390].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box493
        gunModel[390].setRotationPoint(49.5F, -25.25F, 1.49F);
        gunModel[390].rotateAngleX = 0.26179939F;

        gunModel[391].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box494
        gunModel[391].setRotationPoint(49.5F, -26.25F, -1.51F);

        gunModel[392].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box495
        gunModel[392].setRotationPoint(49.5F, -25.25F, -1.51F);
        gunModel[392].rotateAngleX = -0.26179939F;

        gunModel[393].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box496
        gunModel[393].setRotationPoint(51.5F, -25.25F, -1.51F);
        gunModel[393].rotateAngleX = -0.26179939F;

        gunModel[394].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box497
        gunModel[394].setRotationPoint(51.5F, -26.25F, -1.51F);

        gunModel[395].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box498
        gunModel[395].setRotationPoint(51.5F, -25.25F, 1.49F);
        gunModel[395].rotateAngleX = 0.26179939F;

        gunModel[396].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box499
        gunModel[396].setRotationPoint(47.5F, -25.25F, -1.51F);
        gunModel[396].rotateAngleX = -0.26179939F;

        gunModel[397].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box500
        gunModel[397].setRotationPoint(47.5F, -26.25F, -1.51F);

        gunModel[398].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box501
        gunModel[398].setRotationPoint(47.5F, -25.25F, 1.49F);
        gunModel[398].rotateAngleX = 0.26179939F;

        gunModel[399].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box502
        gunModel[399].setRotationPoint(45.5F, -25.25F, 1.49F);
        gunModel[399].rotateAngleX = 0.26179939F;

        gunModel[400].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box503
        gunModel[400].setRotationPoint(45.5F, -26.25F, -1.51F);

        gunModel[401].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box504
        gunModel[401].setRotationPoint(45.5F, -25.25F, -1.51F);
        gunModel[401].rotateAngleX = -0.26179939F;

        gunModel[402].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box505
        gunModel[402].setRotationPoint(57.5F, -25.25F, 1.49F);
        gunModel[402].rotateAngleX = 0.26179939F;

        gunModel[403].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box506
        gunModel[403].setRotationPoint(57.5F, -26.25F, -1.51F);

        gunModel[404].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box507
        gunModel[404].setRotationPoint(57.5F, -25.25F, -1.51F);
        gunModel[404].rotateAngleX = -0.26179939F;

        gunModel[405].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box511
        gunModel[405].setRotationPoint(55.5F, -25.25F, -1.51F);
        gunModel[405].rotateAngleX = -0.26179939F;

        gunModel[406].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box512
        gunModel[406].setRotationPoint(55.5F, -26.25F, -1.51F);

        gunModel[407].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box513
        gunModel[407].setRotationPoint(55.5F, -25.25F, 1.49F);
        gunModel[407].rotateAngleX = 0.26179939F;

        gunModel[408].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box514
        gunModel[408].setRotationPoint(53.5F, -25.25F, 1.49F);
        gunModel[408].rotateAngleX = 0.26179939F;

        gunModel[409].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box515
        gunModel[409].setRotationPoint(53.5F, -26.25F, -1.51F);

        gunModel[410].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box516
        gunModel[410].setRotationPoint(53.5F, -25.25F, -1.51F);
        gunModel[410].rotateAngleX = -0.26179939F;

        gunModel[411].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Import Box517
        gunModel[411].setRotationPoint(35.5F, -25.25F, -1.51F);
        gunModel[411].rotateAngleX = -0.26179939F;

        gunModel[412].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box518
        gunModel[412].setRotationPoint(35.5F, -26.25F, -1.51F);

        gunModel[413].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Import Box519
        gunModel[413].setRotationPoint(35.5F, -25.25F, 1.49F);
        gunModel[413].rotateAngleX = 0.26179939F;

        gunModel[414].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box520
        gunModel[414].setRotationPoint(50F, -29.51F, -5.25F);
        gunModel[414].rotateAngleX = 0.26179939F;

        gunModel[415].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box521
        gunModel[415].setRotationPoint(50F, -32.51F, -5.25F);

        gunModel[416].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box522
        gunModel[416].setRotationPoint(50F, -32.51F, -5.25F);
        gunModel[416].rotateAngleX = -0.26179939F;

        gunModel[417].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box523
        gunModel[417].setRotationPoint(48F, -32.51F, -5.25F);
        gunModel[417].rotateAngleX = -0.26179939F;

        gunModel[418].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box524
        gunModel[418].setRotationPoint(48F, -32.51F, -5.25F);

        gunModel[419].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box525
        gunModel[419].setRotationPoint(48F, -29.51F, -5.25F);
        gunModel[419].rotateAngleX = 0.26179939F;

        gunModel[420].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box526
        gunModel[420].setRotationPoint(46F, -29.51F, -5.25F);
        gunModel[420].rotateAngleX = 0.26179939F;

        gunModel[421].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box527
        gunModel[421].setRotationPoint(46F, -32.51F, -5.25F);

        gunModel[422].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box528
        gunModel[422].setRotationPoint(46F, -32.51F, -5.25F);
        gunModel[422].rotateAngleX = -0.26179939F;

        gunModel[423].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box529
        gunModel[423].setRotationPoint(44F, -32.51F, -5.25F);
        gunModel[423].rotateAngleX = -0.26179939F;

        gunModel[424].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box530
        gunModel[424].setRotationPoint(44F, -32.51F, -5.25F);

        gunModel[425].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box531
        gunModel[425].setRotationPoint(44F, -29.51F, -5.25F);
        gunModel[425].rotateAngleX = 0.26179939F;

        gunModel[426].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box532
        gunModel[426].setRotationPoint(42F, -29.51F, -5.25F);
        gunModel[426].rotateAngleX = 0.26179939F;

        gunModel[427].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box533
        gunModel[427].setRotationPoint(42F, -32.51F, -5.25F);

        gunModel[428].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box534
        gunModel[428].setRotationPoint(42F, -32.51F, -5.25F);
        gunModel[428].rotateAngleX = -0.26179939F;

        gunModel[429].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box535
        gunModel[429].setRotationPoint(40F, -32.51F, -5.25F);
        gunModel[429].rotateAngleX = -0.26179939F;

        gunModel[430].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box536
        gunModel[430].setRotationPoint(40F, -32.51F, -5.25F);

        gunModel[431].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box537
        gunModel[431].setRotationPoint(40F, -29.51F, -5.25F);
        gunModel[431].rotateAngleX = 0.26179939F;

        gunModel[432].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box538
        gunModel[432].setRotationPoint(38F, -29.51F, -5.25F);
        gunModel[432].rotateAngleX = 0.26179939F;

        gunModel[433].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box539
        gunModel[433].setRotationPoint(38F, -32.51F, -5.25F);

        gunModel[434].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box540
        gunModel[434].setRotationPoint(38F, -32.51F, -5.25F);
        gunModel[434].rotateAngleX = -0.26179939F;

        gunModel[435].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box541
        gunModel[435].setRotationPoint(33.5F, -32.51F, -5.25F);
        gunModel[435].rotateAngleX = -0.26179939F;

        gunModel[436].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box542
        gunModel[436].setRotationPoint(33.5F, -32.51F, -5.25F);

        gunModel[437].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box543
        gunModel[437].setRotationPoint(33.5F, -29.51F, -5.25F);
        gunModel[437].rotateAngleX = 0.26179939F;

        gunModel[438].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box544
        gunModel[438].setRotationPoint(31.5F, -29.51F, -5.25F);
        gunModel[438].rotateAngleX = 0.26179939F;

        gunModel[439].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box545
        gunModel[439].setRotationPoint(31.5F, -32.51F, -5.25F);

        gunModel[440].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box546
        gunModel[440].setRotationPoint(31.5F, -32.51F, -5.25F);
        gunModel[440].rotateAngleX = -0.26179939F;

        gunModel[441].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box547
        gunModel[441].setRotationPoint(29.5F, -32.51F, -5.25F);
        gunModel[441].rotateAngleX = -0.26179939F;

        gunModel[442].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box548
        gunModel[442].setRotationPoint(29.5F, -29.51F, -5.25F);
        gunModel[442].rotateAngleX = 0.26179939F;

        gunModel[443].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box549
        gunModel[443].setRotationPoint(29.5F, -32.51F, -5.25F);

        gunModel[444].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box550
        gunModel[444].setRotationPoint(27.5F, -29.51F, -5.25F);
        gunModel[444].rotateAngleX = 0.26179939F;

        gunModel[445].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box551
        gunModel[445].setRotationPoint(27.5F, -32.51F, -5.25F);

        gunModel[446].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box552
        gunModel[446].setRotationPoint(27.5F, -32.51F, -5.25F);
        gunModel[446].rotateAngleX = -0.26179939F;

        gunModel[447].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box553
        gunModel[447].setRotationPoint(25.5F, -32.51F, -5.25F);
        gunModel[447].rotateAngleX = -0.26179939F;

        gunModel[448].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box554
        gunModel[448].setRotationPoint(25.5F, -32.51F, -5.25F);

        gunModel[449].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box555
        gunModel[449].setRotationPoint(25.5F, -29.51F, -5.25F);
        gunModel[449].rotateAngleX = 0.26179939F;

        gunModel[450].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box556
        gunModel[450].setRotationPoint(23.5F, -29.51F, -5.25F);
        gunModel[450].rotateAngleX = 0.26179939F;

        gunModel[451].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box557
        gunModel[451].setRotationPoint(23.5F, -32.51F, -5.25F);

        gunModel[452].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box558
        gunModel[452].setRotationPoint(23.5F, -32.51F, -5.25F);
        gunModel[452].rotateAngleX = -0.26179939F;

        gunModel[453].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box559
        gunModel[453].setRotationPoint(21.5F, -32.51F, -5.25F);
        gunModel[453].rotateAngleX = -0.26179939F;

        gunModel[454].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box560
        gunModel[454].setRotationPoint(21.5F, -29.51F, -5.25F);
        gunModel[454].rotateAngleX = 0.26179939F;

        gunModel[455].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box561
        gunModel[455].setRotationPoint(21.5F, -32.51F, -5.25F);

        gunModel[456].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box562
        gunModel[456].setRotationPoint(19.5F, -29.51F, -5.25F);
        gunModel[456].rotateAngleX = 0.26179939F;

        gunModel[457].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box563
        gunModel[457].setRotationPoint(19.5F, -32.51F, -5.25F);

        gunModel[458].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box564
        gunModel[458].setRotationPoint(19.5F, -32.51F, -5.25F);
        gunModel[458].rotateAngleX = -0.26179939F;

        gunModel[459].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box565
        gunModel[459].setRotationPoint(17.5F, -32.51F, -5.25F);
        gunModel[459].rotateAngleX = -0.26179939F;

        gunModel[460].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box566
        gunModel[460].setRotationPoint(17.5F, -32.51F, -5.25F);

        gunModel[461].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box567
        gunModel[461].setRotationPoint(17.5F, -29.51F, -5.25F);
        gunModel[461].rotateAngleX = 0.26179939F;

        gunModel[462].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box568
        gunModel[462].setRotationPoint(15.5F, -29.51F, -5.25F);
        gunModel[462].rotateAngleX = 0.26179939F;

        gunModel[463].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box569
        gunModel[463].setRotationPoint(15.5F, -32.51F, -5.25F);

        gunModel[464].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box570
        gunModel[464].setRotationPoint(15.5F, -32.51F, -5.25F);
        gunModel[464].rotateAngleX = -0.26179939F;

        gunModel[465].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box571
        gunModel[465].setRotationPoint(13.5F, -32.51F, -5.25F);
        gunModel[465].rotateAngleX = -0.26179939F;

        gunModel[466].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Import Box572
        gunModel[466].setRotationPoint(11.5F, -32.51F, -5.25F);
        gunModel[466].rotateAngleX = -0.26179939F;

        gunModel[467].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box573
        gunModel[467].setRotationPoint(11.5F, -32.51F, -5.25F);

        gunModel[468].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box574
        gunModel[468].setRotationPoint(13.5F, -32.51F, -5.25F);

        gunModel[469].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box575
        gunModel[469].setRotationPoint(13.5F, -29.51F, -5.25F);
        gunModel[469].rotateAngleX = 0.26179939F;

        gunModel[470].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box576
        gunModel[470].setRotationPoint(11.5F, -29.51F, -5.25F);
        gunModel[470].rotateAngleX = 0.26179939F;

        gunModel[471].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box577
        gunModel[471].setRotationPoint(92F, -33F, -2F);

        gunModel[472].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box578
        gunModel[472].setRotationPoint(94F, -33F, -2F);

        gunModel[473].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Import Box579
        gunModel[473].setRotationPoint(93F, -32.5F, -1.5F);

        gunModel[474].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Import Box580
        gunModel[474].setRotationPoint(95F, -33F, -1.5F);

        gunModel[475].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Import Box581
        gunModel[475].setRotationPoint(95F, -30F, -1.5F);

        gunModel[476].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Box582
        gunModel[476].setRotationPoint(95F, -32.5F, -2F);

        gunModel[477].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Box583
        gunModel[477].setRotationPoint(95F, -30.5F, -2F);

        gunModel[478].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Box584
        gunModel[478].setRotationPoint(95F, -32.5F, 1F);

        gunModel[479].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Import Box585
        gunModel[479].setRotationPoint(95F, -30.5F, 1F);

        gunModel[480].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box586
        gunModel[480].setRotationPoint(95F, -31.5F, 1F);

        gunModel[481].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box587
        gunModel[481].setRotationPoint(95F, -31.5F, -2F);

        gunModel[482].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box588
        gunModel[482].setRotationPoint(99F, -31.5F, 1F);

        gunModel[483].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box589
        gunModel[483].setRotationPoint(99F, -31.5F, -2F);

        gunModel[484].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box590
        gunModel[484].setRotationPoint(67.5F, -30F, -1.5F);

        gunModel[485].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Box591
        gunModel[485].setRotationPoint(69F, -29F, -1F);
        gunModel[485].rotateAngleZ = -0.15707963F;

        gunModel[486].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import Box592
        gunModel[486].setRotationPoint(61.5F, -30.54F, -1.5F);

        gunModel[487].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box593
        gunModel[487].setRotationPoint(62F, -27.54F, -2.5F);
        gunModel[487].rotateAngleZ = 0.12217305F;

        gunModel[488].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Import Box594
        gunModel[488].setRotationPoint(62F, -27.54F, -2.5F);
        gunModel[488].rotateAngleZ = 0.12217305F;

        gunModel[489].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Import Box595
        gunModel[489].setRotationPoint(62F, -27.54F, 1.5F);
        gunModel[489].rotateAngleZ = 0.12217305F;

        gunModel[490].addBox(0F, 3F, 0F, 1, 1, 5, 0F); // Import Box596
        gunModel[490].setRotationPoint(62F, -27.54F, -2.5F);
        gunModel[490].rotateAngleZ = 0.12217305F;

        gunModel[491].addBox(0F, 0F, -1F, 6, 2, 1, 0F); // Import Box597
        gunModel[491].setRotationPoint(-5F, -33.62F, 2.35F);

        gunModel[492].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Import Box598
        gunModel[492].setRotationPoint(-69F, -12.5F, -2.5F);
        gunModel[492].rotateAngleZ = 0.87266463F;

        gunModel[493].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box599
        gunModel[493].setRotationPoint(-69F, -12.5F, -2.5F);
        gunModel[493].rotateAngleZ = 0.87266463F;

        gunModel[494].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Import Box600
        gunModel[494].setRotationPoint(-69F, -12.5F, 1.5F);
        gunModel[494].rotateAngleZ = 0.87266463F;

        gunModel[495].addBox(0F, 3F, 0F, 1, 1, 5, 0F); // Import Box601
        gunModel[495].setRotationPoint(-69F, -12.5F, -2.5F);
        gunModel[495].rotateAngleZ = 0.87266463F;


        defaultScopeModel = new ModelRendererTurbo[23];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box308
        defaultScopeModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box131
        defaultScopeModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box132
        defaultScopeModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box133
        defaultScopeModel[4] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box134
        defaultScopeModel[5] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box135
        defaultScopeModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box136
        defaultScopeModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box137
        defaultScopeModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box138
        defaultScopeModel[9] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box139
        defaultScopeModel[10] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box140
        defaultScopeModel[11] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box141
        defaultScopeModel[12] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box142
        defaultScopeModel[13] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box143
        defaultScopeModel[14] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import Box298
        defaultScopeModel[15] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import Box299
        defaultScopeModel[16] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import Box302
        defaultScopeModel[17] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Import Box303
        defaultScopeModel[18] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box304
        defaultScopeModel[19] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box305
        defaultScopeModel[20] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box306
        defaultScopeModel[21] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box307
        defaultScopeModel[22] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import Box309

        defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box308
        defaultScopeModel[0].setRotationPoint(67F, -42.5F, -0.5F);

        defaultScopeModel[1].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Import Box131
        defaultScopeModel[1].setRotationPoint(-18.5F, -41F, -1.99F);

        defaultScopeModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box132
        defaultScopeModel[2].setRotationPoint(-16.5F, -41F, -2.01F);
        defaultScopeModel[2].rotateAngleZ = -0.78539816F;

        defaultScopeModel[3].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Import Box133
        defaultScopeModel[3].setRotationPoint(-18.5F, -41F, -2.01F);
        defaultScopeModel[3].rotateAngleZ = 0.78539816F;

        defaultScopeModel[4].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Import Box134
        defaultScopeModel[4].setRotationPoint(-19.9F, -39.6F, -2.02F);

        defaultScopeModel[5].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Import Box135
        defaultScopeModel[5].setRotationPoint(-18.1F, -39.6F, 1F);

        defaultScopeModel[6].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Import Box136
        defaultScopeModel[6].setRotationPoint(-18.5F, -41F, 0.99F);

        defaultScopeModel[7].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import Box137
        defaultScopeModel[7].setRotationPoint(-16.5F, -41F, 1.01F);
        defaultScopeModel[7].rotateAngleZ = -0.78539816F;

        defaultScopeModel[8].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Import Box138
        defaultScopeModel[8].setRotationPoint(-18.5F, -41F, 1.01F);
        defaultScopeModel[8].rotateAngleZ = 0.78539816F;

        defaultScopeModel[9].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Import Box139
        defaultScopeModel[9].setRotationPoint(-19.9F, -39.6F, 1.02F);

        defaultScopeModel[10].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Box140
        defaultScopeModel[10].setRotationPoint(-18.6F, -39F, -2.98F);

        defaultScopeModel[11].addBox(0F, -1F, -1F, 1, 4, 4, 0F); // Import Box141
        defaultScopeModel[11].setRotationPoint(-17.9F, -41.5F, -0.97F);

        defaultScopeModel[12].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Import Box142
        defaultScopeModel[12].setRotationPoint(-17.1F, -37.5F, -2.01F);

        defaultScopeModel[13].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Import Box143
        defaultScopeModel[13].setRotationPoint(-17.1F, -38.5F, -2F);
        defaultScopeModel[13].rotateAngleZ = -0.15707963F;

        defaultScopeModel[14].addBox(0F, 0F, 0F, 1, 7, 3, 0F); // Import Box298
        defaultScopeModel[14].setRotationPoint(68.5F, -40F, -1.5F);

        defaultScopeModel[15].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box299
        defaultScopeModel[15].setRotationPoint(67.5F, -40F, -1F);

        defaultScopeModel[16].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Import Box302
        defaultScopeModel[16].setRotationPoint(65.5F, -41F, -1.5F);

        defaultScopeModel[17].addBox(0F, -7F, 0F, 1, 7, 3, 0F); // Import Box303
        defaultScopeModel[17].setRotationPoint(61.5F, -35.5F, -1.5F);
        defaultScopeModel[17].rotateAngleZ = -0.62831853F;

        defaultScopeModel[18].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import Box304
        defaultScopeModel[18].setRotationPoint(65.5F, -42F, -2F);

        defaultScopeModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box305
        defaultScopeModel[19].setRotationPoint(66F, -43F, -2F);

        defaultScopeModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box306
        defaultScopeModel[20].setRotationPoint(66F, -43F, 1F);

        defaultScopeModel[21].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Import Box307
        defaultScopeModel[21].setRotationPoint(65.5F, -42F, 1F);

        defaultScopeModel[22].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Import Box309
        defaultScopeModel[22].setRotationPoint(-18.1F, -39.6F, -2F);


        ammoModel = new ModelRendererTurbo[21];
        ammoModel[0] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box51
        ammoModel[1] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import Box52
        ammoModel[2] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box54
        ammoModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box106
        ammoModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box107
        ammoModel[5] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box108
        ammoModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box109
        ammoModel[7] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box110
        ammoModel[8] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import Box111
        ammoModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box112
        ammoModel[10] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box113
        ammoModel[11] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box114
        ammoModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box115
        ammoModel[13] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box116
        ammoModel[14] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import Box117
        ammoModel[15] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import Box118
        ammoModel[16] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box119
        ammoModel[17] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Import Box120
        ammoModel[18] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box121
        ammoModel[19] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box122
        ammoModel[20] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box123

        ammoModel[0].addBox(0F, 0F, 0F, 10, 3, 4, 0F); // Import Box51
        ammoModel[0].setRotationPoint(-7.14F, -19F, -2F);
        ammoModel[0].rotateAngleZ = 0.01745329F;

        ammoModel[1].addBox(0F, 0F, 0F, 10, 8, 4, 0F); // Import Box52
        ammoModel[1].setRotationPoint(-7.14F, -16F, -2F);
        ammoModel[1].rotateAngleZ = 0.13962634F;

        ammoModel[2].addBox(0F, 0.05F, 0.01F, 10, 9, 4, 0F); // Import Box54
        ammoModel[2].setRotationPoint(-6F, -8.15F, -2F);
        ammoModel[2].rotateAngleZ = 0.26179939F;

        ammoModel[3].addBox(1F, 0F, 0F, 1, 3, 1, 0F); // Import Box106
        ammoModel[3].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[3].rotateAngleZ = 0.01745329F;

        ammoModel[4].addBox(1F, 0F, -0.01F, 1, 8, 1, 0F); // Import Box107
        ammoModel[4].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[4].rotateAngleZ = 0.13962634F;

        ammoModel[5].addBox(1F, 0F, 0F, 1, 9, 1, 0F); // Import Box108
        ammoModel[5].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[5].rotateAngleZ = 0.26179939F;

        ammoModel[6].addBox(4F, 0F, 0F, 1, 3, 1, 0F); // Import Box109
        ammoModel[6].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[6].rotateAngleZ = 0.01745329F;

        ammoModel[7].addBox(4F, 0F, -0.01F, 1, 8, 1, 0F); // Import Box110
        ammoModel[7].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[7].rotateAngleZ = 0.13962634F;

        ammoModel[8].addBox(4F, 0F, 0F, 1, 9, 1, 0F); // Import Box111
        ammoModel[8].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[8].rotateAngleZ = 0.26179939F;

        ammoModel[9].addBox(7F, 0F, 0F, 1, 3, 1, 0F); // Import Box112
        ammoModel[9].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[9].rotateAngleZ = 0.01745329F;

        ammoModel[10].addBox(7F, 0F, -0.01F, 1, 8, 1, 0F); // Import Box113
        ammoModel[10].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[10].rotateAngleZ = 0.13962634F;

        ammoModel[11].addBox(7F, 0F, 0F, 1, 9, 1, 0F); // Import Box114
        ammoModel[11].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[11].rotateAngleZ = 0.26179939F;

        ammoModel[12].addBox(7F, 0F, 0F, 1, 3, 1, 0F); // Import Box115
        ammoModel[12].setRotationPoint(-7.14F, -19F, -2.15F);
        ammoModel[12].rotateAngleZ = 0.01745329F;

        ammoModel[13].addBox(4F, 0F, 0F, 1, 3, 1, 0F); // Import Box116
        ammoModel[13].setRotationPoint(-7.14F, -19F, -2.15F);
        ammoModel[13].rotateAngleZ = 0.01745329F;

        ammoModel[14].addBox(1F, 0F, 0F, 1, 3, 1, 0F); // Import Box117
        ammoModel[14].setRotationPoint(-7.14F, -19F, -2.15F);
        ammoModel[14].rotateAngleZ = 0.01745329F;

        ammoModel[15].addBox(1F, 0F, 0F, 1, 8, 1, 0F); // Import Box118
        ammoModel[15].setRotationPoint(-7.14F, -16F, -2.15F);
        ammoModel[15].rotateAngleZ = 0.13962634F;

        ammoModel[16].addBox(4F, 0F, 0F, 1, 8, 1, 0F); // Import Box119
        ammoModel[16].setRotationPoint(-7.14F, -16F, -2.15F);
        ammoModel[16].rotateAngleZ = 0.13962634F;

        ammoModel[17].addBox(7F, 0F, 0F, 1, 8, 1, 0F); // Import Box120
        ammoModel[17].setRotationPoint(-7.14F, -16F, -2.15F);
        ammoModel[17].rotateAngleZ = 0.13962634F;

        ammoModel[18].addBox(7F, 0F, 0F, 1, 9, 1, 0F); // Import Box121
        ammoModel[18].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[18].rotateAngleZ = 0.26179939F;

        ammoModel[19].addBox(4F, 0F, 0F, 1, 9, 1, 0F); // Import Box122
        ammoModel[19].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[19].rotateAngleZ = 0.26179939F;

        ammoModel[20].addBox(1F, 0F, 0F, 1, 9, 1, 0F); // Import Box123
        ammoModel[20].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[20].rotateAngleZ = 0.26179939F;



        this.modelScale = 0.2f;
        translateAll = new Vector3f(18F, 10F, 0F);
        this.crouchZoom = -0.2f;
        this.rotateAimPosition = new Vector3f(0F, 0F, 0.8F);

        leftArmPos = new Vector3f(0.1F, -0.45F, 0.1F);
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
        this.muzzleFlashPointNormal = new Vector3f(3F, 1.40F, 0.9F);
        this.muzzleFlashPointScoping = new Vector3f(1.2F, 1.80F, 0.1F);

        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);


        this.thirdPersonScale = 0.60f;
        this.thirdPersonOffset = new Vector3f(-0.1F, 0.05F, 0F);

        List<Vector3f> attachmentVectorsSight = new ArrayList<Vector3f>();
        attachmentVectorsSight.add(new Vector3f(0F, 0.33F, 0F)); //Sight translation
        attachmentVectorsSight.add(new Vector3f(0F, 0F, 0F)); //Sight rotation
        attachmentPointMap.put(AttachmentEnum.Sight, attachmentVectorsSight);

        List<Vector3f> attachmentVectorsBarrel = new ArrayList<Vector3f>();
        attachmentVectorsBarrel.add(new Vector3f(1.3F, 0.29F, 0.035F)); //Sight translation
        attachmentVectorsBarrel.add(new Vector3f(0F, 0F, 0F)); //Sight rotation
        attachmentPointMap.put(AttachmentEnum.Barrel, attachmentVectorsBarrel);

        flipAll();
    }
}