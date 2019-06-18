package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class m16a4 extends ModelGun { //Same as Filename{
    int textureX = 512;
    int textureY = 256;

    public m16a4() {
        gunModel = new ModelRendererTurbo[519];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
        gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 98
        gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 99
        gunModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 100
        gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 101
        gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 102
        gunModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 116
        gunModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 219
        gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 14
        gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
        gunModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 16
        gunModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
        gunModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 18
        gunModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 19
        gunModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 20
        gunModel[18] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 21
        gunModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 22
        gunModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
        gunModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 25
        gunModel[22] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 26
        gunModel[23] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 27
        gunModel[24] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 28
        gunModel[25] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 30
        gunModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
        gunModel[27] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 32
        gunModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 33
        gunModel[29] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 34
        gunModel[30] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 35
        gunModel[31] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 36
        gunModel[32] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 37
        gunModel[33] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 38
        gunModel[34] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 39
        gunModel[35] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 40
        gunModel[36] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 41
        gunModel[37] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 42
        gunModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 66
        gunModel[39] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 67
        gunModel[40] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 131
        gunModel[41] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 132
        gunModel[42] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 133
        gunModel[43] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 134
        gunModel[44] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 135
        gunModel[45] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 136
        gunModel[46] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 137
        gunModel[47] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 138
        gunModel[48] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 139
        gunModel[49] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 140
        gunModel[50] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 141
        gunModel[51] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 142
        gunModel[52] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 143
        gunModel[53] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 94
        gunModel[54] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 96
        gunModel[55] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 97
        gunModel[56] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 98
        gunModel[57] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 99
        gunModel[58] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 100
        gunModel[59] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 101
        gunModel[60] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 102
        gunModel[61] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 158
        gunModel[62] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 240
        gunModel[63] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 241
        gunModel[64] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 242
        gunModel[65] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 243
        gunModel[66] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 244
        gunModel[67] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 245
        gunModel[68] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 246
        gunModel[69] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 247
        gunModel[70] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 248
        gunModel[71] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 249
        gunModel[72] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 250
        gunModel[73] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 113
        gunModel[74] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 114
        gunModel[75] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 115
        gunModel[76] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 116
        gunModel[77] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 117
        gunModel[78] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 118
        gunModel[79] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 120
        gunModel[80] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 121
        gunModel[81] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 122
        gunModel[82] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 123
        gunModel[83] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 124
        gunModel[84] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 125
        gunModel[85] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 126
        gunModel[86] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 127
        gunModel[87] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 128
        gunModel[88] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 129
        gunModel[89] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 130
        gunModel[90] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 131
        gunModel[91] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 132
        gunModel[92] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 134
        gunModel[93] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 136
        gunModel[94] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 137
        gunModel[95] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 138
        gunModel[96] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 139
        gunModel[97] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 140
        gunModel[98] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 141
        gunModel[99] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 142
        gunModel[100] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 143
        gunModel[101] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 144
        gunModel[102] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 145
        gunModel[103] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 146
        gunModel[104] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 147
        gunModel[105] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 148
        gunModel[106] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 149
        gunModel[107] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 150
        gunModel[108] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 151
        gunModel[109] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 152
        gunModel[110] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 153
        gunModel[111] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 154
        gunModel[112] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 156
        gunModel[113] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 157
        gunModel[114] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 158
        gunModel[115] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 159
        gunModel[116] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 160
        gunModel[117] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 161
        gunModel[118] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 162
        gunModel[119] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 163
        gunModel[120] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 164
        gunModel[121] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 165
        gunModel[122] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 166
        gunModel[123] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 167
        gunModel[124] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 168
        gunModel[125] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 169
        gunModel[126] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 170
        gunModel[127] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 171
        gunModel[128] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 172
        gunModel[129] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 173
        gunModel[130] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 174
        gunModel[131] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 175
        gunModel[132] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 176
        gunModel[133] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 177
        gunModel[134] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 178
        gunModel[135] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 179
        gunModel[136] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 180
        gunModel[137] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 181
        gunModel[138] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 182
        gunModel[139] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 183
        gunModel[140] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 184
        gunModel[141] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 185
        gunModel[142] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 186
        gunModel[143] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 187
        gunModel[144] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 193
        gunModel[145] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 194
        gunModel[146] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 195
        gunModel[147] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 196
        gunModel[148] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 197
        gunModel[149] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 198
        gunModel[150] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 199
        gunModel[151] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 200
        gunModel[152] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 201
        gunModel[153] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 202
        gunModel[154] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 203
        gunModel[155] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 204
        gunModel[156] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 205
        gunModel[157] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 206
        gunModel[158] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 207
        gunModel[159] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 208
        gunModel[160] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 209
        gunModel[161] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 210
        gunModel[162] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 211
        gunModel[163] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 212
        gunModel[164] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 213
        gunModel[165] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 214
        gunModel[166] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 215
        gunModel[167] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 216
        gunModel[168] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 217
        gunModel[169] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 218
        gunModel[170] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 219
        gunModel[171] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 220
        gunModel[172] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 221
        gunModel[173] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 222
        gunModel[174] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 223
        gunModel[175] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 224
        gunModel[176] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 225
        gunModel[177] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 226
        gunModel[178] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 227
        gunModel[179] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 228
        gunModel[180] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 229
        gunModel[181] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 234
        gunModel[182] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 235
        gunModel[183] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 236
        gunModel[184] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 237
        gunModel[185] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 238
        gunModel[186] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 239
        gunModel[187] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 240
        gunModel[188] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 241
        gunModel[189] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 243
        gunModel[190] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 244
        gunModel[191] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 245
        gunModel[192] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 246
        gunModel[193] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 247
        gunModel[194] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 248
        gunModel[195] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 249
        gunModel[196] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 250
        gunModel[197] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 251
        gunModel[198] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 252
        gunModel[199] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 253
        gunModel[200] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 254
        gunModel[201] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 255
        gunModel[202] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 256
        gunModel[203] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 257
        gunModel[204] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 258
        gunModel[205] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 259
        gunModel[206] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 260
        gunModel[207] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 261
        gunModel[208] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 262
        gunModel[209] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 267
        gunModel[210] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 268
        gunModel[211] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 269
        gunModel[212] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 270
        gunModel[213] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 271
        gunModel[214] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 272
        gunModel[215] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 273
        gunModel[216] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 274
        gunModel[217] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 276
        gunModel[218] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 277
        gunModel[219] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 278
        gunModel[220] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 279
        gunModel[221] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 280
        gunModel[222] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 281
        gunModel[223] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 282
        gunModel[224] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 283
        gunModel[225] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 284
        gunModel[226] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 285
        gunModel[227] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 286
        gunModel[228] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 287
        gunModel[229] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 288
        gunModel[230] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 289
        gunModel[231] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 290
        gunModel[232] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 291
        gunModel[233] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 292
        gunModel[234] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 293
        gunModel[235] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 294
        gunModel[236] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 295
        gunModel[237] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 296
        gunModel[238] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 297
        gunModel[239] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 298
        gunModel[240] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 299
        gunModel[241] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 300
        gunModel[242] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 301
        gunModel[243] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 302
        gunModel[244] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 303
        gunModel[245] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 304
        gunModel[246] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 305
        gunModel[247] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 306
        gunModel[248] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 307
        gunModel[249] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 308
        gunModel[250] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 309
        gunModel[251] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 310
        gunModel[252] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 311
        gunModel[253] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 312
        gunModel[254] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 313
        gunModel[255] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 314
        gunModel[256] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 315
        gunModel[257] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 316
        gunModel[258] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 317
        gunModel[259] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 318
        gunModel[260] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 319
        gunModel[261] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 320
        gunModel[262] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 321
        gunModel[263] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 322
        gunModel[264] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 323
        gunModel[265] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 324
        gunModel[266] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 325
        gunModel[267] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 326
        gunModel[268] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 327
        gunModel[269] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 331
        gunModel[270] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 332
        gunModel[271] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 333
        gunModel[272] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 334
        gunModel[273] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 335
        gunModel[274] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 336
        gunModel[275] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 337
        gunModel[276] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 338
        gunModel[277] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 339
        gunModel[278] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 340
        gunModel[279] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 341
        gunModel[280] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 342
        gunModel[281] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 343
        gunModel[282] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 344
        gunModel[283] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 345
        gunModel[284] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 346
        gunModel[285] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 347
        gunModel[286] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 348
        gunModel[287] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 349
        gunModel[288] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 350
        gunModel[289] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 351
        gunModel[290] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 352
        gunModel[291] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 353
        gunModel[292] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 354
        gunModel[293] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 367
        gunModel[294] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 368
        gunModel[295] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 369
        gunModel[296] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 370
        gunModel[297] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 371
        gunModel[298] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 372
        gunModel[299] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 373
        gunModel[300] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 374
        gunModel[301] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 375
        gunModel[302] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 376
        gunModel[303] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 377
        gunModel[304] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 378
        gunModel[305] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 379
        gunModel[306] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 380
        gunModel[307] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 381
        gunModel[308] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 385
        gunModel[309] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 386
        gunModel[310] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 387
        gunModel[311] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 388
        gunModel[312] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 389
        gunModel[313] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 390
        gunModel[314] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 391
        gunModel[315] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 392
        gunModel[316] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 393
        gunModel[317] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 394
        gunModel[318] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 395
        gunModel[319] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 396
        gunModel[320] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 397
        gunModel[321] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 398
        gunModel[322] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 399
        gunModel[323] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 400
        gunModel[324] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 401
        gunModel[325] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 402
        gunModel[326] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 403
        gunModel[327] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 404
        gunModel[328] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 405
        gunModel[329] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 406
        gunModel[330] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 407
        gunModel[331] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 408
        gunModel[332] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 409
        gunModel[333] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 410
        gunModel[334] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 411
        gunModel[335] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 412
        gunModel[336] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 413
        gunModel[337] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 414
        gunModel[338] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 415
        gunModel[339] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 416
        gunModel[340] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 417
        gunModel[341] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 418
        gunModel[342] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 419
        gunModel[343] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 420
        gunModel[344] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 421
        gunModel[345] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 422
        gunModel[346] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 423
        gunModel[347] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 424
        gunModel[348] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 425
        gunModel[349] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 426
        gunModel[350] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 427
        gunModel[351] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 428
        gunModel[352] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 429
        gunModel[353] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 430
        gunModel[354] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 431
        gunModel[355] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 432
        gunModel[356] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 433
        gunModel[357] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 434
        gunModel[358] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 435
        gunModel[359] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 436
        gunModel[360] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 437
        gunModel[361] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 438
        gunModel[362] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 439
        gunModel[363] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 440
        gunModel[364] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 441
        gunModel[365] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 442
        gunModel[366] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 443
        gunModel[367] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 444
        gunModel[368] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 445
        gunModel[369] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 446
        gunModel[370] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 447
        gunModel[371] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 448
        gunModel[372] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 449
        gunModel[373] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 450
        gunModel[374] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 454
        gunModel[375] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 455
        gunModel[376] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 456
        gunModel[377] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 457
        gunModel[378] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 458
        gunModel[379] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 459
        gunModel[380] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 460
        gunModel[381] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 461
        gunModel[382] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 462
        gunModel[383] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 463
        gunModel[384] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 464
        gunModel[385] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 465
        gunModel[386] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 466
        gunModel[387] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 467
        gunModel[388] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 468
        gunModel[389] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 469
        gunModel[390] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 470
        gunModel[391] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 471
        gunModel[392] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 472
        gunModel[393] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 473
        gunModel[394] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 474
        gunModel[395] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 475
        gunModel[396] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 476
        gunModel[397] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 477
        gunModel[398] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 478
        gunModel[399] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 479
        gunModel[400] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 480
        gunModel[401] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 481
        gunModel[402] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 482
        gunModel[403] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 483
        gunModel[404] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 484
        gunModel[405] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 485
        gunModel[406] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 486
        gunModel[407] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 487
        gunModel[408] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 488
        gunModel[409] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 489
        gunModel[410] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 490
        gunModel[411] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 491
        gunModel[412] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 492
        gunModel[413] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 493
        gunModel[414] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 494
        gunModel[415] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 495
        gunModel[416] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 496
        gunModel[417] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 497
        gunModel[418] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 498
        gunModel[419] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 499
        gunModel[420] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 500
        gunModel[421] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 501
        gunModel[422] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 502
        gunModel[423] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 503
        gunModel[424] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 504
        gunModel[425] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 505
        gunModel[426] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 506
        gunModel[427] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 507
        gunModel[428] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 511
        gunModel[429] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 512
        gunModel[430] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 513
        gunModel[431] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 514
        gunModel[432] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 515
        gunModel[433] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 516
        gunModel[434] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 517
        gunModel[435] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 518
        gunModel[436] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 519
        gunModel[437] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 520
        gunModel[438] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 521
        gunModel[439] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 522
        gunModel[440] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 523
        gunModel[441] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 524
        gunModel[442] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 525
        gunModel[443] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 526
        gunModel[444] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 527
        gunModel[445] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 528
        gunModel[446] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 529
        gunModel[447] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 530
        gunModel[448] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 531
        gunModel[449] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 532
        gunModel[450] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 533
        gunModel[451] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 534
        gunModel[452] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 535
        gunModel[453] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 536
        gunModel[454] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 537
        gunModel[455] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 538
        gunModel[456] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 539
        gunModel[457] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 540
        gunModel[458] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 541
        gunModel[459] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 542
        gunModel[460] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 543
        gunModel[461] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 544
        gunModel[462] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 545
        gunModel[463] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 546
        gunModel[464] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 547
        gunModel[465] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 548
        gunModel[466] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 549
        gunModel[467] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 550
        gunModel[468] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 551
        gunModel[469] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 552
        gunModel[470] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 553
        gunModel[471] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 554
        gunModel[472] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 555
        gunModel[473] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 556
        gunModel[474] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 557
        gunModel[475] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 558
        gunModel[476] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 559
        gunModel[477] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 560
        gunModel[478] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 561
        gunModel[479] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 562
        gunModel[480] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 563
        gunModel[481] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 564
        gunModel[482] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 565
        gunModel[483] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 566
        gunModel[484] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 567
        gunModel[485] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 568
        gunModel[486] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 569
        gunModel[487] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 570
        gunModel[488] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 571
        gunModel[489] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 572
        gunModel[490] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 573
        gunModel[491] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 574
        gunModel[492] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 575
        gunModel[493] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 576
        gunModel[494] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 577
        gunModel[495] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 578
        gunModel[496] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 579
        gunModel[497] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 580
        gunModel[498] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 581
        gunModel[499] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 582
        gunModel[500] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 583
        gunModel[501] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 584
        gunModel[502] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 585
        gunModel[503] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 586
        gunModel[504] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 587
        gunModel[505] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 588
        gunModel[506] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 589
        gunModel[507] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 590
        gunModel[508] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 591
        gunModel[509] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 592
        gunModel[510] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 593
        gunModel[511] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 594
        gunModel[512] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 595
        gunModel[513] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 596
        gunModel[514] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 597
        gunModel[515] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 598
        gunModel[516] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 599
        gunModel[517] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 600
        gunModel[518] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 601

        gunModel[0].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 4
        gunModel[0].setRotationPoint(-25.5F, -17.2F, -2F);

        gunModel[1].addBox(-6F, 0F, 0F, 6, 11, 4, 0F); // Box 7
        gunModel[1].setRotationPoint(-18F, -17.2F, -2F);
        gunModel[1].rotateAngleZ = -0.64577182F;

        gunModel[2].addBox(-6.15F, 0F, 0F, 8, 4, 4, 0F); // Box 8
        gunModel[2].setRotationPoint(-23.55F, -10.2F, -2F);
        gunModel[2].rotateAngleZ = -0.31415927F;

        gunModel[3].addBox(-5.55F, -0.2F, 0F, 6, 11, 4, 0F); // Box 10
        gunModel[3].setRotationPoint(-18.5F, -17.2F, -2F);
        gunModel[3].rotateAngleZ = -0.45378561F;

        gunModel[4].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 98
        gunModel[4].setRotationPoint(-17F, -22F, -2F);

        gunModel[5].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 99
        gunModel[5].setRotationPoint(-17.2F, -18.7F, -1.5F);
        gunModel[5].rotateAngleZ = 0.61086524F;

        gunModel[6].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 100
        gunModel[6].setRotationPoint(-16F, -18F, -1.5F);

        gunModel[7].addBox(0F, -1F, 0F, 2, 1, 3, 0F); // Box 101
        gunModel[7].setRotationPoint(-8.65F, -17.05F, -1.5F);
        gunModel[7].rotateAngleZ = 0.62831853F;

        gunModel[8].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 102
        gunModel[8].setRotationPoint(-8F, -22F, -2F);

        gunModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 116
        gunModel[9].setRotationPoint(-13.5F, -22.6F, -0.5F);
        gunModel[9].rotateAngleZ = 0.08726646F;

        gunModel[10].addBox(-6F, 0F, 0F, 1, 1, 4, 0F); // Box 219
        gunModel[10].setRotationPoint(-17.2F, -6.85F, -2.01F);

        gunModel[11].addBox(-6F, 0F, 0F, 6, 5, 4, 0F); // Box 14
        gunModel[11].setRotationPoint(-17F, -22F, -2F);

        gunModel[12].addBox(-6F, 0F, 0F, 16, 7, 4, 0F); // Box 15
        gunModel[12].setRotationPoint(-17F, -29F, -2F);

        gunModel[13].addBox(-6F, 0F, 0F, 5, 4, 4, 0F); // Box 16
        gunModel[13].setRotationPoint(-22F, -29F, -2F);

        gunModel[14].addBox(1F, 1.8F, 0F, 3, 1, 4, 0F); // Box 17
        gunModel[14].setRotationPoint(-23.5F, -28F, -2.01F);
        gunModel[14].rotateAngleZ = -0.75049158F;

        gunModel[15].addBox(-6F, 0F, 0F, 11, 11, 5, 0F); // Box 18
        gunModel[15].setRotationPoint(-1.25F, -29F, -2.5F);

        gunModel[16].addBox(-6F, 0F, 0F, 3, 11, 1, 0F); // Box 19
        gunModel[16].setRotationPoint(0F, -28.5F, 1.98F);

        gunModel[17].addBox(-6.01F, 9.25F, 0F, 11, 1, 6, 0F); // Box 20
        gunModel[17].setRotationPoint(-1.75F, -27.5F, -3.01F);
        gunModel[17].rotateAngleZ = 0.05235988F;

        gunModel[18].addBox(0F, 0F, 0F, 35, 2, 5, 0F); // Box 21
        gunModel[18].setRotationPoint(-28F, -32F, -2.5F);

        gunModel[19].addBox(0F, 0F, 0F, 35, 1, 3, 0F); // Box 22
        gunModel[19].setRotationPoint(-28F, -30F, -1.5F);

        gunModel[20].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Box 24
        gunModel[20].setRotationPoint(-28F, -30F, -2.5F);
        gunModel[20].rotateAngleX = 0.61086524F;

        gunModel[21].addBox(0F, 0F, -1F, 35, 2, 1, 0F); // Box 25
        gunModel[21].setRotationPoint(-28F, -30F, 2.5F);
        gunModel[21].rotateAngleX = -0.61086524F;

        gunModel[22].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Box 26
        gunModel[22].setRotationPoint(-28F, -33.62F, -1.35F);
        gunModel[22].rotateAngleX = -0.61086524F;

        gunModel[23].addBox(0F, 0F, -1F, 35, 2, 1, 0F); // Box 27
        gunModel[23].setRotationPoint(-28F, -33.62F, 1.35F);
        gunModel[23].rotateAngleX = 0.61086524F;

        gunModel[24].addBox(0F, 0F, 0F, 29, 2, 3, 0F); // Box 28
        gunModel[24].setRotationPoint(-22F, -35F, -1.5F);

        gunModel[25].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Box 30
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

        gunModel[32].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 37
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

        gunModel[38].addBox(0F, 0F, 0F, 35, 2, 3, 0F); // Box 66
        gunModel[38].setRotationPoint(-28F, -33.5F, -1.5F);

        gunModel[39].addBox(0F, 0F, 0F, 35, 2, 3, 0F); // Box 67
        gunModel[39].setRotationPoint(-28F, -29.3F, -1.5F);

        gunModel[40].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
        gunModel[40].setRotationPoint(-18.5F, -41F, -1.99F);

        gunModel[41].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 132
        gunModel[41].setRotationPoint(-16.5F, -41F, -2.01F);
        gunModel[41].rotateAngleZ = -0.78539816F;

        gunModel[42].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 133
        gunModel[42].setRotationPoint(-18.5F, -41F, -2.01F);
        gunModel[42].rotateAngleZ = 0.78539816F;

        gunModel[43].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 134
        gunModel[43].setRotationPoint(-19.9F, -39.6F, -2.02F);

        gunModel[44].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 135
        gunModel[44].setRotationPoint(-18.1F, -39.6F, 1F);

        gunModel[45].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
        gunModel[45].setRotationPoint(-18.5F, -41F, 0.99F);

        gunModel[46].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 137
        gunModel[46].setRotationPoint(-16.5F, -41F, 1.01F);
        gunModel[46].rotateAngleZ = -0.78539816F;

        gunModel[47].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 138
        gunModel[47].setRotationPoint(-18.5F, -41F, 1.01F);
        gunModel[47].rotateAngleZ = 0.78539816F;

        gunModel[48].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 139
        gunModel[48].setRotationPoint(-19.9F, -39.6F, 1.02F);

        gunModel[49].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 140
        gunModel[49].setRotationPoint(-18.6F, -39F, -2.98F);

        gunModel[50].addBox(0F, -1F, -1F, 1, 4, 4, 0F); // Box 141
        gunModel[50].setRotationPoint(-17.9F, -41.5F, -0.97F);

        gunModel[51].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 142
        gunModel[51].setRotationPoint(-17.1F, -37.5F, -2.01F);

        gunModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
        gunModel[52].setRotationPoint(-17.1F, -38.5F, -2F);
        gunModel[52].rotateAngleZ = -0.15707963F;

        gunModel[53].addBox(-6F, 0F, 0F, 14, 1, 1, 0F); // Box 94
        gunModel[53].setRotationPoint(-4.25F, -29.1F, -3F);

        gunModel[54].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 96
        gunModel[54].setRotationPoint(-25F, -35.75F, -1F);

        gunModel[55].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 97
        gunModel[55].setRotationPoint(-25F, -35.8F, -1.99F);

        gunModel[56].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 98
        gunModel[56].setRotationPoint(-25F, -35.3F, -2F);

        gunModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
        gunModel[57].setRotationPoint(-24F, -35.8F, -1.99F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 100
        gunModel[58].setRotationPoint(-24F, -35.3F, -2F);

        gunModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
        gunModel[59].setRotationPoint(-24F, -35.8F, 1.01F);

        gunModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
        gunModel[60].setRotationPoint(-24F, -35.3F, 1F);

        gunModel[61].addBox(-0.01F, 0F, 0F, 1, 10, 1, 0F); // Box 158
        gunModel[61].setRotationPoint(2.75F, -28.1F, -3F);

        gunModel[62].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 240
        gunModel[62].setRotationPoint(-26F, -32F, -4.5F);
        gunModel[62].rotateAngleY = 0.33161256F;

        gunModel[63].addBox(-1.5F, 0F, 0F, 1, 2, 2, 0F); // Box 241
        gunModel[63].setRotationPoint(-26F, -32F, -4.5F);
        gunModel[63].rotateAngleY = 0.33161256F;

        gunModel[64].addBox(-1F, 0.5F, 0F, 1, 1, 1, 0F); // Box 242
        gunModel[64].setRotationPoint(-26F, -32F, -4F);
        gunModel[64].rotateAngleY = 0.33161256F;

        gunModel[65].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 243
        gunModel[65].setRotationPoint(-13F, -33F, -3.5F);

        gunModel[66].addBox(-3F, 0F, 0F, 3, 3, 2, 0F); // Box 244
        gunModel[66].setRotationPoint(-13F, -33F, -3.5F);
        gunModel[66].rotateAngleY = -0.61086524F;

        gunModel[67].addBox(0F, 0F, 0F, 14, 3, 1, 0F); // Box 245
        gunModel[67].setRotationPoint(-10F, -33.5F, -2.5F);
        gunModel[67].rotateAngleX = -0.15707963F;

        gunModel[68].addBox(5F, 0.2F, -0.5F, 4, 2, 1, 0F); // Box 246
        gunModel[68].setRotationPoint(-10F, -33.25F, -2F);
        gunModel[68].rotateAngleX = -0.40142573F;

        gunModel[69].addBox(0F, -1.25F, 0F, 14, 1, 1, 0F); // Box 247
        gunModel[69].setRotationPoint(-10F, -33.5F, -2F);
        gunModel[69].rotateAngleX = -0.15707963F;

        gunModel[70].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 248
        gunModel[70].setRotationPoint(-6.25F, -28.1F, -3F);

        gunModel[71].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 249
        gunModel[71].setRotationPoint(-9.25F, -24.1F, -3F);

        gunModel[72].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 250
        gunModel[72].setRotationPoint(-9F, -27.1F, -3F);

        gunModel[73].addBox(0F, -22F, 0F, 45, 9, 4, 0F); // Box 113
        gunModel[73].setRotationPoint(-73F, -12F, -2F);

        gunModel[74].addBox(3F, -10F, 0.01F, 41, 11, 4, 0F); // Box 114
        gunModel[74].setRotationPoint(-73F, -12F, -2F);
        gunModel[74].rotateAngleZ = 0.27925268F;

        gunModel[75].addBox(0F, -22F, 0F, 3, 23, 5, 0F); // Box 115
        gunModel[75].setRotationPoint(-73F, -12F, -2.5F);
        gunModel[75].rotateAngleZ = 0.12217305F;

        gunModel[76].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 116
        gunModel[76].setRotationPoint(-72F, -25F, -2F);
        gunModel[76].rotateAngleZ = 0.05235988F;

        gunModel[77].addBox(0F, -2F, -0.01F, 6, 2, 4, 0F); // Box 117
        gunModel[77].setRotationPoint(-31F, -23F, -2F);
        gunModel[77].rotateAngleZ = 0.33161256F;

        gunModel[78].addBox(-6F, 0F, 0F, 2, 3, 5, 0F); // Box 118
        gunModel[78].setRotationPoint(9.75F, -29F, -2.5F);

        gunModel[79].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 120
        gunModel[79].setRotationPoint(7F, -34.5F, -1.5F);

        gunModel[80].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 121
        gunModel[80].setRotationPoint(7F, -32.5F, 0.77F);

        gunModel[81].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 122
        gunModel[81].setRotationPoint(7F, -34.5F, 1.5F);
        gunModel[81].rotateAngleX = -0.71558499F;

        gunModel[82].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 123
        gunModel[82].setRotationPoint(7F, -32.5F, -3.77F);

        gunModel[83].addBox(0F, 0F, -3F, 2, 2, 3, 0F); // Box 124
        gunModel[83].setRotationPoint(7F, -34.5F, -1.5F);
        gunModel[83].rotateAngleX = 0.71558499F;

        gunModel[84].addBox(0F, -2F, -3F, 2, 2, 3, 0F); // Box 125
        gunModel[84].setRotationPoint(7F, -27.5F, -1.5F);
        gunModel[84].rotateAngleX = -0.71558499F;

        gunModel[85].addBox(0F, -2F, 0F, 2, 2, 3, 0F); // Box 126
        gunModel[85].setRotationPoint(7F, -27.5F, 1.5F);
        gunModel[85].rotateAngleX = 0.71558499F;

        gunModel[86].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Box 127
        gunModel[86].setRotationPoint(10F, -32.5F, 4F);

        gunModel[87].addBox(0F, 0F, -1F, 26, 2, 1, 0F); // Box 128
        gunModel[87].setRotationPoint(10F, -29.5F, 5F);
        gunModel[87].rotateAngleX = -0.26179939F;

        gunModel[88].addBox(0F, -2F, -1F, 26, 2, 1, 0F); // Box 129
        gunModel[88].setRotationPoint(10F, -32.5F, 5F);
        gunModel[88].rotateAngleX = 0.26179939F;

        gunModel[89].addBox(0F, 0F, -1F, 15, 2, 1, 0F); // Box 130
        gunModel[89].setRotationPoint(37F, -29.5F, 5F);
        gunModel[89].rotateAngleX = -0.26179939F;

        gunModel[90].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 131
        gunModel[90].setRotationPoint(37F, -32.5F, 4F);

        gunModel[91].addBox(0F, -2F, -1F, 15, 2, 1, 0F); // Box 132
        gunModel[91].setRotationPoint(37F, -32.5F, 5F);
        gunModel[91].rotateAngleX = 0.26179939F;

        gunModel[92].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 134
        gunModel[92].setRotationPoint(37F, -32.5F, -5F);

        gunModel[93].addBox(0F, 0F, 0F, 26, 2, 1, 0F); // Box 136
        gunModel[93].setRotationPoint(10F, -29.5F, -5F);
        gunModel[93].rotateAngleX = 0.26179939F;

        gunModel[94].addBox(0F, 0F, 0F, 26, 3, 1, 0F); // Box 137
        gunModel[94].setRotationPoint(10F, -32.5F, -5F);

        gunModel[95].addBox(0F, -2F, 0F, 26, 2, 1, 0F); // Box 138
        gunModel[95].setRotationPoint(10F, -32.5F, -5F);
        gunModel[95].rotateAngleX = -0.26179939F;

        gunModel[96].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 139
        gunModel[96].setRotationPoint(37F, -29.5F, -5F);
        gunModel[96].rotateAngleX = 0.26179939F;

        gunModel[97].addBox(0F, -2F, 0F, 15, 2, 1, 0F); // Box 140
        gunModel[97].setRotationPoint(37F, -32.5F, -5F);
        gunModel[97].rotateAngleX = -0.26179939F;

        gunModel[98].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Box 141
        gunModel[98].setRotationPoint(10F, -36.5F, -1.5F);

        gunModel[99].addBox(0F, 0F, 0F, 23, 1, 2, 0F); // Box 142
        gunModel[99].setRotationPoint(10F, -36.5F, 1.5F);
        gunModel[99].rotateAngleX = -0.26179939F;

        gunModel[100].addBox(0F, 0F, -2F, 23, 1, 2, 0F); // Box 143
        gunModel[100].setRotationPoint(10F, -36.5F, -1.5F);
        gunModel[100].rotateAngleX = 0.26179939F;

        gunModel[101].addBox(0F, 0F, 0F, 26, 1, 2, 0F); // Box 144
        gunModel[101].setRotationPoint(34F, -36.5F, 1.5F);
        gunModel[101].rotateAngleX = -0.26179939F;

        gunModel[102].addBox(0F, 0F, -2F, 26, 1, 2, 0F); // Box 145
        gunModel[102].setRotationPoint(34F, -36.5F, -1.5F);
        gunModel[102].rotateAngleX = 0.26179939F;

        gunModel[103].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Box 146
        gunModel[103].setRotationPoint(34F, -36.5F, -1.5F);

        gunModel[104].addBox(0F, 0F, 0F, 26, 1, 3, 0F); // Box 147
        gunModel[104].setRotationPoint(34F, -26.5F, -1.5F);

        gunModel[105].addBox(0F, -1F, -2F, 26, 1, 2, 0F); // Box 148
        gunModel[105].setRotationPoint(34F, -25.5F, -1.5F);
        gunModel[105].rotateAngleX = -0.26179939F;

        gunModel[106].addBox(0F, -1F, 0F, 26, 1, 2, 0F); // Box 149
        gunModel[106].setRotationPoint(34F, -25.5F, 1.5F);
        gunModel[106].rotateAngleX = 0.26179939F;

        gunModel[107].addBox(0F, -1F, -2F, 16, 1, 2, 0F); // Box 150
        gunModel[107].setRotationPoint(11F, -25.5F, -1.5F);
        gunModel[107].rotateAngleX = -0.26179939F;

        gunModel[108].addBox(0F, -1F, 0F, 16, 1, 2, 0F); // Box 151
        gunModel[108].setRotationPoint(11F, -25.5F, 1.5F);
        gunModel[108].rotateAngleX = 0.26179939F;

        gunModel[109].addBox(0F, 0F, 0F, 16, 1, 3, 0F); // Box 152
        gunModel[109].setRotationPoint(11F, -26.5F, -1.5F);

        gunModel[110].addBox(0F, 0F, 0F, 51, 7, 6, 0F); // Box 153
        gunModel[110].setRotationPoint(9F, -34.5F, -3F);

        gunModel[111].addBox(0F, 0F, 0F, 51, 3, 1, 0F); // Box 154
        gunModel[111].setRotationPoint(9F, -32.5F, 2.5F);

        gunModel[112].addBox(0F, 0F, 0F, 51, 1, 3, 0F); // Box 156
        gunModel[112].setRotationPoint(9F, -35F, -1.5F);

        gunModel[113].addBox(0F, 0F, 0F, 51, 1, 3, 0F); // Box 157
        gunModel[113].setRotationPoint(9F, -28F, -1.5F);

        gunModel[114].addBox(0F, 0F, 0F, 51, 3, 1, 0F); // Box 158
        gunModel[114].setRotationPoint(9F, -32.5F, -3.5F);

        gunModel[115].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 159
        gunModel[115].setRotationPoint(9.5F, -27.5F, -1.51F);

        gunModel[116].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 160
        gunModel[116].setRotationPoint(11F, -27.5F, -1.51F);

        gunModel[117].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 161
        gunModel[117].setRotationPoint(14F, -27.5F, -1.51F);

        gunModel[118].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 162
        gunModel[118].setRotationPoint(12.5F, -27.5F, -1.51F);

        gunModel[119].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 163
        gunModel[119].setRotationPoint(20F, -27.5F, -1.51F);

        gunModel[120].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 164
        gunModel[120].setRotationPoint(18.5F, -27.5F, -1.51F);

        gunModel[121].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 165
        gunModel[121].setRotationPoint(15.5F, -27.5F, -1.51F);

        gunModel[122].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 166
        gunModel[122].setRotationPoint(17F, -27.5F, -1.51F);

        gunModel[123].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 167
        gunModel[123].setRotationPoint(26F, -27.5F, -1.51F);

        gunModel[124].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 168
        gunModel[124].setRotationPoint(24.5F, -27.5F, -1.51F);

        gunModel[125].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 169
        gunModel[125].setRotationPoint(21.5F, -27.5F, -1.51F);

        gunModel[126].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 170
        gunModel[126].setRotationPoint(23F, -27.5F, -1.51F);

        gunModel[127].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 171
        gunModel[127].setRotationPoint(32F, -27.5F, -1.51F);

        gunModel[128].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 172
        gunModel[128].setRotationPoint(30.5F, -27.5F, -1.51F);

        gunModel[129].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 173
        gunModel[129].setRotationPoint(27.5F, -27.5F, -1.51F);

        gunModel[130].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 174
        gunModel[130].setRotationPoint(29F, -27.5F, -1.51F);

        gunModel[131].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 175
        gunModel[131].setRotationPoint(38F, -27.5F, -1.51F);

        gunModel[132].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 176
        gunModel[132].setRotationPoint(36.5F, -27.5F, -1.51F);

        gunModel[133].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 177
        gunModel[133].setRotationPoint(33.5F, -27.5F, -1.51F);

        gunModel[134].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 178
        gunModel[134].setRotationPoint(35F, -27.5F, -1.51F);

        gunModel[135].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 179
        gunModel[135].setRotationPoint(52F, -27.5F, -1.51F);

        gunModel[136].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 180
        gunModel[136].setRotationPoint(50.5F, -27.5F, -1.51F);

        gunModel[137].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 181
        gunModel[137].setRotationPoint(47.5F, -27.5F, -1.51F);

        gunModel[138].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 182
        gunModel[138].setRotationPoint(49F, -27.5F, -1.51F);

        gunModel[139].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 183
        gunModel[139].setRotationPoint(46F, -27.5F, -1.51F);

        gunModel[140].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 184
        gunModel[140].setRotationPoint(44.5F, -27.5F, -1.51F);

        gunModel[141].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 185
        gunModel[141].setRotationPoint(43F, -27.5F, -1.51F);

        gunModel[142].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 186
        gunModel[142].setRotationPoint(41.5F, -27.5F, -1.51F);

        gunModel[143].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 187
        gunModel[143].setRotationPoint(40F, -27.5F, -1.51F);

        gunModel[144].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 193
        gunModel[144].setRotationPoint(58.5F, -27.5F, -1.51F);

        gunModel[145].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 194
        gunModel[145].setRotationPoint(57F, -27.5F, -1.51F);

        gunModel[146].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 195
        gunModel[146].setRotationPoint(55.5F, -27.5F, -1.51F);

        gunModel[147].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 196
        gunModel[147].setRotationPoint(54F, -27.5F, -1.51F);

        gunModel[148].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 197
        gunModel[148].setRotationPoint(54F, -35.5F, -1.51F);

        gunModel[149].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 198
        gunModel[149].setRotationPoint(55.5F, -35.5F, -1.51F);

        gunModel[150].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 199
        gunModel[150].setRotationPoint(57F, -35.5F, -1.51F);

        gunModel[151].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 200
        gunModel[151].setRotationPoint(58.5F, -35.5F, -1.51F);

        gunModel[152].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 201
        gunModel[152].setRotationPoint(40F, -35.5F, -1.51F);

        gunModel[153].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 202
        gunModel[153].setRotationPoint(41.5F, -35.5F, -1.51F);

        gunModel[154].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 203
        gunModel[154].setRotationPoint(43F, -35.5F, -1.51F);

        gunModel[155].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 204
        gunModel[155].setRotationPoint(44.5F, -35.5F, -1.51F);

        gunModel[156].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 205
        gunModel[156].setRotationPoint(46F, -35.5F, -1.51F);

        gunModel[157].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 206
        gunModel[157].setRotationPoint(49F, -35.5F, -1.51F);

        gunModel[158].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 207
        gunModel[158].setRotationPoint(47.5F, -35.5F, -1.51F);

        gunModel[159].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 208
        gunModel[159].setRotationPoint(50.5F, -35.5F, -1.51F);

        gunModel[160].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 209
        gunModel[160].setRotationPoint(52F, -35.5F, -1.51F);

        gunModel[161].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 210
        gunModel[161].setRotationPoint(35F, -35.5F, -1.51F);

        gunModel[162].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 211
        gunModel[162].setRotationPoint(33.5F, -35.5F, -1.51F);

        gunModel[163].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 212
        gunModel[163].setRotationPoint(36.5F, -35.5F, -1.51F);

        gunModel[164].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 213
        gunModel[164].setRotationPoint(38F, -35.5F, -1.51F);

        gunModel[165].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 214
        gunModel[165].setRotationPoint(29F, -35.5F, -1.51F);

        gunModel[166].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 215
        gunModel[166].setRotationPoint(27.5F, -35.5F, -1.51F);

        gunModel[167].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 216
        gunModel[167].setRotationPoint(30.5F, -35.5F, -1.51F);

        gunModel[168].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 217
        gunModel[168].setRotationPoint(32F, -35.5F, -1.51F);

        gunModel[169].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 218
        gunModel[169].setRotationPoint(23F, -35.5F, -1.51F);

        gunModel[170].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 219
        gunModel[170].setRotationPoint(21.5F, -35.5F, -1.51F);

        gunModel[171].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 220
        gunModel[171].setRotationPoint(24.5F, -35.5F, -1.51F);

        gunModel[172].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 221
        gunModel[172].setRotationPoint(26F, -35.5F, -1.51F);

        gunModel[173].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 222
        gunModel[173].setRotationPoint(17F, -35.5F, -1.51F);

        gunModel[174].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 223
        gunModel[174].setRotationPoint(15.5F, -35.5F, -1.51F);

        gunModel[175].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 224
        gunModel[175].setRotationPoint(18.5F, -35.5F, -1.51F);

        gunModel[176].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 225
        gunModel[176].setRotationPoint(20F, -35.5F, -1.51F);

        gunModel[177].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 226
        gunModel[177].setRotationPoint(12.5F, -35.5F, -1.51F);

        gunModel[178].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 227
        gunModel[178].setRotationPoint(14F, -35.5F, -1.51F);

        gunModel[179].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 228
        gunModel[179].setRotationPoint(11F, -35.5F, -1.51F);

        gunModel[180].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 229
        gunModel[180].setRotationPoint(9.5F, -35.5F, -1.51F);

        gunModel[181].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 234
        gunModel[181].setRotationPoint(40F, -29.51F, -4F);
        gunModel[181].rotateAngleX = 1.57079633F;

        gunModel[182].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 235
        gunModel[182].setRotationPoint(41.5F, -29.51F, -4F);
        gunModel[182].rotateAngleX = 1.57079633F;

        gunModel[183].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 236
        gunModel[183].setRotationPoint(43F, -29.51F, -4F);
        gunModel[183].rotateAngleX = 1.57079633F;

        gunModel[184].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 237
        gunModel[184].setRotationPoint(44.5F, -29.51F, -4F);
        gunModel[184].rotateAngleX = 1.57079633F;

        gunModel[185].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 238
        gunModel[185].setRotationPoint(46F, -29.51F, -4F);
        gunModel[185].rotateAngleX = 1.57079633F;

        gunModel[186].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 239
        gunModel[186].setRotationPoint(49F, -29.51F, -4F);
        gunModel[186].rotateAngleX = 1.57079633F;

        gunModel[187].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 240
        gunModel[187].setRotationPoint(47.5F, -29.51F, -4F);
        gunModel[187].rotateAngleX = 1.57079633F;

        gunModel[188].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 241
        gunModel[188].setRotationPoint(50.5F, -29.51F, -4F);
        gunModel[188].rotateAngleX = 1.57079633F;

        gunModel[189].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 243
        gunModel[189].setRotationPoint(35F, -29.51F, -4F);
        gunModel[189].rotateAngleX = 1.57079633F;

        gunModel[190].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 244
        gunModel[190].setRotationPoint(33.5F, -29.51F, -4F);
        gunModel[190].rotateAngleX = 1.57079633F;

        gunModel[191].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 245
        gunModel[191].setRotationPoint(36.5F, -29.51F, -4F);
        gunModel[191].rotateAngleX = 1.57079633F;

        gunModel[192].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 246
        gunModel[192].setRotationPoint(38F, -29.51F, -4F);
        gunModel[192].rotateAngleX = 1.57079633F;

        gunModel[193].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 247
        gunModel[193].setRotationPoint(29F, -29.51F, -4F);
        gunModel[193].rotateAngleX = 1.57079633F;

        gunModel[194].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 248
        gunModel[194].setRotationPoint(27.5F, -29.51F, -4F);
        gunModel[194].rotateAngleX = 1.57079633F;

        gunModel[195].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 249
        gunModel[195].setRotationPoint(30.5F, -29.51F, -4F);
        gunModel[195].rotateAngleX = 1.57079633F;

        gunModel[196].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 250
        gunModel[196].setRotationPoint(32F, -29.51F, -4F);
        gunModel[196].rotateAngleX = 1.57079633F;

        gunModel[197].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 251
        gunModel[197].setRotationPoint(23F, -29.51F, -4F);
        gunModel[197].rotateAngleX = 1.57079633F;

        gunModel[198].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 252
        gunModel[198].setRotationPoint(21.5F, -29.51F, -4F);
        gunModel[198].rotateAngleX = 1.57079633F;

        gunModel[199].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 253
        gunModel[199].setRotationPoint(24.5F, -29.51F, -4F);
        gunModel[199].rotateAngleX = 1.57079633F;

        gunModel[200].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 254
        gunModel[200].setRotationPoint(26F, -29.51F, -4F);
        gunModel[200].rotateAngleX = 1.57079633F;

        gunModel[201].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 255
        gunModel[201].setRotationPoint(17F, -29.51F, -4F);
        gunModel[201].rotateAngleX = 1.57079633F;

        gunModel[202].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 256
        gunModel[202].setRotationPoint(15.5F, -29.51F, -4F);
        gunModel[202].rotateAngleX = 1.57079633F;

        gunModel[203].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 257
        gunModel[203].setRotationPoint(18.5F, -29.51F, -4F);
        gunModel[203].rotateAngleX = 1.57079633F;

        gunModel[204].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 258
        gunModel[204].setRotationPoint(20F, -29.51F, -4F);
        gunModel[204].rotateAngleX = 1.57079633F;

        gunModel[205].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 259
        gunModel[205].setRotationPoint(12.5F, -29.51F, -4F);
        gunModel[205].rotateAngleX = 1.57079633F;

        gunModel[206].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 260
        gunModel[206].setRotationPoint(14F, -29.51F, -4F);
        gunModel[206].rotateAngleX = 1.57079633F;

        gunModel[207].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 261
        gunModel[207].setRotationPoint(11F, -29.51F, -4F);
        gunModel[207].rotateAngleX = 1.57079633F;

        gunModel[208].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 262
        gunModel[208].setRotationPoint(9.5F, -29.51F, -4F);
        gunModel[208].rotateAngleX = 1.57079633F;

        gunModel[209].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 267
        gunModel[209].setRotationPoint(40F, -29.51F, 3F);
        gunModel[209].rotateAngleX = 1.57079633F;

        gunModel[210].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 268
        gunModel[210].setRotationPoint(41.5F, -29.51F, 3F);
        gunModel[210].rotateAngleX = 1.57079633F;

        gunModel[211].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 269
        gunModel[211].setRotationPoint(43F, -29.51F, 3F);
        gunModel[211].rotateAngleX = 1.57079633F;

        gunModel[212].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 270
        gunModel[212].setRotationPoint(44.5F, -29.51F, 3F);
        gunModel[212].rotateAngleX = 1.57079633F;

        gunModel[213].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 271
        gunModel[213].setRotationPoint(46F, -29.51F, 3F);
        gunModel[213].rotateAngleX = 1.57079633F;

        gunModel[214].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 272
        gunModel[214].setRotationPoint(49F, -29.51F, 3F);
        gunModel[214].rotateAngleX = 1.57079633F;

        gunModel[215].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 273
        gunModel[215].setRotationPoint(47.5F, -29.51F, 3F);
        gunModel[215].rotateAngleX = 1.57079633F;

        gunModel[216].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 274
        gunModel[216].setRotationPoint(50.5F, -29.51F, 3F);
        gunModel[216].rotateAngleX = 1.57079633F;

        gunModel[217].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 276
        gunModel[217].setRotationPoint(35F, -29.51F, 3F);
        gunModel[217].rotateAngleX = 1.57079633F;

        gunModel[218].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 277
        gunModel[218].setRotationPoint(33.5F, -29.51F, 3F);
        gunModel[218].rotateAngleX = 1.57079633F;

        gunModel[219].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 278
        gunModel[219].setRotationPoint(36.5F, -29.51F, 3F);
        gunModel[219].rotateAngleX = 1.57079633F;

        gunModel[220].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 279
        gunModel[220].setRotationPoint(38F, -29.51F, 3F);
        gunModel[220].rotateAngleX = 1.57079633F;

        gunModel[221].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 280
        gunModel[221].setRotationPoint(29F, -29.51F, 3F);
        gunModel[221].rotateAngleX = 1.57079633F;

        gunModel[222].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 281
        gunModel[222].setRotationPoint(27.5F, -29.51F, 3F);
        gunModel[222].rotateAngleX = 1.57079633F;

        gunModel[223].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 282
        gunModel[223].setRotationPoint(30.5F, -29.51F, 3F);
        gunModel[223].rotateAngleX = 1.57079633F;

        gunModel[224].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 283
        gunModel[224].setRotationPoint(32F, -29.51F, 3F);
        gunModel[224].rotateAngleX = 1.57079633F;

        gunModel[225].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 284
        gunModel[225].setRotationPoint(23F, -29.51F, 3F);
        gunModel[225].rotateAngleX = 1.57079633F;

        gunModel[226].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 285
        gunModel[226].setRotationPoint(21.5F, -29.51F, 3F);
        gunModel[226].rotateAngleX = 1.57079633F;

        gunModel[227].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 286
        gunModel[227].setRotationPoint(24.5F, -29.51F, 3F);
        gunModel[227].rotateAngleX = 1.57079633F;

        gunModel[228].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 287
        gunModel[228].setRotationPoint(26F, -29.51F, 3F);
        gunModel[228].rotateAngleX = 1.57079633F;

        gunModel[229].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 288
        gunModel[229].setRotationPoint(17F, -29.51F, 3F);
        gunModel[229].rotateAngleX = 1.57079633F;

        gunModel[230].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 289
        gunModel[230].setRotationPoint(15.5F, -29.51F, 3F);
        gunModel[230].rotateAngleX = 1.57079633F;

        gunModel[231].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 290
        gunModel[231].setRotationPoint(18.5F, -29.51F, 3F);
        gunModel[231].rotateAngleX = 1.57079633F;

        gunModel[232].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 291
        gunModel[232].setRotationPoint(20F, -29.51F, 3F);
        gunModel[232].rotateAngleX = 1.57079633F;

        gunModel[233].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 292
        gunModel[233].setRotationPoint(12.5F, -29.51F, 3F);
        gunModel[233].rotateAngleX = 1.57079633F;

        gunModel[234].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 293
        gunModel[234].setRotationPoint(14F, -29.51F, 3F);
        gunModel[234].rotateAngleX = 1.57079633F;

        gunModel[235].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 294
        gunModel[235].setRotationPoint(11F, -29.51F, 3F);
        gunModel[235].rotateAngleX = 1.57079633F;

        gunModel[236].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 295
        gunModel[236].setRotationPoint(9.5F, -29.51F, 3F);
        gunModel[236].rotateAngleX = 1.57079633F;

        gunModel[237].addBox(0F, 0F, 0F, 32, 3, 3, 0F); // Box 296
        gunModel[237].setRotationPoint(60F, -32.5F, -1.51F);

        gunModel[238].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 297
        gunModel[238].setRotationPoint(67.5F, -33F, -1.5F);

        gunModel[239].addBox(0F, 0F, 0F, 1, 7, 3, 0F); // Box 298
        gunModel[239].setRotationPoint(68.5F, -40F, -1.5F);

        gunModel[240].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 299
        gunModel[240].setRotationPoint(67.5F, -40F, -1F);

        gunModel[241].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 300
        gunModel[241].setRotationPoint(62.5F, -34.5F, -1F);

        gunModel[242].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 301
        gunModel[242].setRotationPoint(61.5F, -35.5F, -1.5F);

        gunModel[243].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 302
        gunModel[243].setRotationPoint(65.5F, -41F, -1.5F);

        gunModel[244].addBox(0F, -7F, 0F, 1, 7, 3, 0F); // Box 303
        gunModel[244].setRotationPoint(61.5F, -35.5F, -1.5F);
        gunModel[244].rotateAngleZ = -0.62831853F;

        gunModel[245].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 304
        gunModel[245].setRotationPoint(65.5F, -42F, -2F);

        gunModel[246].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 305
        gunModel[246].setRotationPoint(66F, -43F, -2F);

        gunModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 306
        gunModel[247].setRotationPoint(66F, -43F, 1F);

        gunModel[248].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 307
        gunModel[248].setRotationPoint(65.5F, -42F, 1F);

        gunModel[249].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 308
        gunModel[249].setRotationPoint(67F, -42.5F, -0.5F);

        gunModel[250].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 309
        gunModel[250].setRotationPoint(-18.1F, -39.6F, -2F);

        gunModel[251].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 310
        gunModel[251].setRotationPoint(38F, -29.51F, 5.25F);
        gunModel[251].rotateAngleX = -0.26179939F;

        gunModel[252].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 311
        gunModel[252].setRotationPoint(38F, -32.51F, 5.25F);
        gunModel[252].rotateAngleX = 0.26179939F;

        gunModel[253].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 312
        gunModel[253].setRotationPoint(38F, -32.51F, 4.25F);

        gunModel[254].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 313
        gunModel[254].setRotationPoint(40F, -29.51F, 5.25F);
        gunModel[254].rotateAngleX = -0.26179939F;

        gunModel[255].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 314
        gunModel[255].setRotationPoint(40F, -32.51F, 5.25F);
        gunModel[255].rotateAngleX = 0.26179939F;

        gunModel[256].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 315
        gunModel[256].setRotationPoint(40F, -32.51F, 4.25F);

        gunModel[257].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 316
        gunModel[257].setRotationPoint(44F, -29.51F, 5.25F);
        gunModel[257].rotateAngleX = -0.26179939F;

        gunModel[258].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 317
        gunModel[258].setRotationPoint(44F, -32.51F, 5.25F);
        gunModel[258].rotateAngleX = 0.26179939F;

        gunModel[259].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 318
        gunModel[259].setRotationPoint(44F, -32.51F, 4.25F);

        gunModel[260].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 319
        gunModel[260].setRotationPoint(42F, -32.51F, 5.25F);
        gunModel[260].rotateAngleX = 0.26179939F;

        gunModel[261].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 320
        gunModel[261].setRotationPoint(42F, -32.51F, 4.25F);

        gunModel[262].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 321
        gunModel[262].setRotationPoint(42F, -29.51F, 5.25F);
        gunModel[262].rotateAngleX = -0.26179939F;

        gunModel[263].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 322
        gunModel[263].setRotationPoint(48F, -29.51F, 5.25F);
        gunModel[263].rotateAngleX = -0.26179939F;

        gunModel[264].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 323
        gunModel[264].setRotationPoint(48F, -32.51F, 5.25F);
        gunModel[264].rotateAngleX = 0.26179939F;

        gunModel[265].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 324
        gunModel[265].setRotationPoint(48F, -32.51F, 4.25F);

        gunModel[266].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 325
        gunModel[266].setRotationPoint(46F, -32.51F, 5.25F);
        gunModel[266].rotateAngleX = 0.26179939F;

        gunModel[267].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 326
        gunModel[267].setRotationPoint(46F, -32.51F, 4.25F);

        gunModel[268].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 327
        gunModel[268].setRotationPoint(46F, -29.51F, 5.25F);
        gunModel[268].rotateAngleX = -0.26179939F;

        gunModel[269].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 331
        gunModel[269].setRotationPoint(50F, -32.51F, 5.25F);
        gunModel[269].rotateAngleX = 0.26179939F;

        gunModel[270].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 332
        gunModel[270].setRotationPoint(50F, -32.51F, 4.25F);

        gunModel[271].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 333
        gunModel[271].setRotationPoint(50F, -29.51F, 5.25F);
        gunModel[271].rotateAngleX = -0.26179939F;

        gunModel[272].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 334
        gunModel[272].setRotationPoint(23.5F, -32.51F, 4.25F);

        gunModel[273].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 335
        gunModel[273].setRotationPoint(23.5F, -29.51F, 5.25F);
        gunModel[273].rotateAngleX = -0.26179939F;

        gunModel[274].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 336
        gunModel[274].setRotationPoint(23.5F, -32.51F, 5.25F);
        gunModel[274].rotateAngleX = 0.26179939F;

        gunModel[275].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 337
        gunModel[275].setRotationPoint(21.5F, -32.51F, 4.25F);

        gunModel[276].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 338
        gunModel[276].setRotationPoint(21.5F, -32.51F, 5.25F);
        gunModel[276].rotateAngleX = 0.26179939F;

        gunModel[277].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 339
        gunModel[277].setRotationPoint(21.5F, -29.51F, 5.25F);
        gunModel[277].rotateAngleX = -0.26179939F;

        gunModel[278].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 340
        gunModel[278].setRotationPoint(19.5F, -29.51F, 5.25F);
        gunModel[278].rotateAngleX = -0.26179939F;

        gunModel[279].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 341
        gunModel[279].setRotationPoint(19.5F, -32.51F, 4.25F);

        gunModel[280].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 342
        gunModel[280].setRotationPoint(19.5F, -32.51F, 5.25F);
        gunModel[280].rotateAngleX = 0.26179939F;

        gunModel[281].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 343
        gunModel[281].setRotationPoint(17.5F, -32.51F, 5.25F);
        gunModel[281].rotateAngleX = 0.26179939F;

        gunModel[282].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 344
        gunModel[282].setRotationPoint(17.5F, -32.51F, 4.25F);

        gunModel[283].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 345
        gunModel[283].setRotationPoint(17.5F, -29.51F, 5.25F);
        gunModel[283].rotateAngleX = -0.26179939F;

        gunModel[284].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 346
        gunModel[284].setRotationPoint(15.5F, -29.51F, 5.25F);
        gunModel[284].rotateAngleX = -0.26179939F;

        gunModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 347
        gunModel[285].setRotationPoint(15.5F, -32.51F, 4.25F);

        gunModel[286].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 348
        gunModel[286].setRotationPoint(15.5F, -32.51F, 5.25F);
        gunModel[286].rotateAngleX = 0.26179939F;

        gunModel[287].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 349
        gunModel[287].setRotationPoint(13.5F, -32.51F, 5.25F);
        gunModel[287].rotateAngleX = 0.26179939F;

        gunModel[288].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 350
        gunModel[288].setRotationPoint(13.5F, -32.51F, 4.25F);

        gunModel[289].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 351
        gunModel[289].setRotationPoint(13.5F, -29.51F, 5.25F);
        gunModel[289].rotateAngleX = -0.26179939F;

        gunModel[290].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 352
        gunModel[290].setRotationPoint(11.5F, -29.51F, 5.25F);
        gunModel[290].rotateAngleX = -0.26179939F;

        gunModel[291].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 353
        gunModel[291].setRotationPoint(11.5F, -32.51F, 4.25F);

        gunModel[292].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 354
        gunModel[292].setRotationPoint(11.5F, -32.51F, 5.25F);
        gunModel[292].rotateAngleX = 0.26179939F;

        gunModel[293].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 367
        gunModel[293].setRotationPoint(29.5F, -29.51F, 5.25F);
        gunModel[293].rotateAngleX = -0.26179939F;

        gunModel[294].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 368
        gunModel[294].setRotationPoint(29.5F, -32.51F, 4.25F);

        gunModel[295].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 369
        gunModel[295].setRotationPoint(29.5F, -32.51F, 5.25F);
        gunModel[295].rotateAngleX = 0.26179939F;

        gunModel[296].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 370
        gunModel[296].setRotationPoint(27.5F, -32.51F, 5.25F);
        gunModel[296].rotateAngleX = 0.26179939F;

        gunModel[297].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 371
        gunModel[297].setRotationPoint(27.5F, -32.51F, 4.25F);

        gunModel[298].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 372
        gunModel[298].setRotationPoint(27.5F, -29.51F, 5.25F);
        gunModel[298].rotateAngleX = -0.26179939F;

        gunModel[299].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 373
        gunModel[299].setRotationPoint(25.5F, -29.51F, 5.25F);
        gunModel[299].rotateAngleX = -0.26179939F;

        gunModel[300].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 374
        gunModel[300].setRotationPoint(25.5F, -32.51F, 4.25F);

        gunModel[301].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 375
        gunModel[301].setRotationPoint(25.5F, -32.51F, 5.25F);
        gunModel[301].rotateAngleX = 0.26179939F;

        gunModel[302].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 376
        gunModel[302].setRotationPoint(31.5F, -29.51F, 5.25F);
        gunModel[302].rotateAngleX = -0.26179939F;

        gunModel[303].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 377
        gunModel[303].setRotationPoint(31.5F, -32.51F, 4.25F);

        gunModel[304].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 378
        gunModel[304].setRotationPoint(31.5F, -32.51F, 5.25F);
        gunModel[304].rotateAngleX = 0.26179939F;

        gunModel[305].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 379
        gunModel[305].setRotationPoint(33.5F, -29.51F, 5.25F);
        gunModel[305].rotateAngleX = -0.26179939F;

        gunModel[306].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 380
        gunModel[306].setRotationPoint(33.5F, -32.51F, 4.25F);

        gunModel[307].addBox(0F, -2F, -1F, 1, 2, 1, 0F); // Box 381
        gunModel[307].setRotationPoint(33.5F, -32.51F, 5.25F);
        gunModel[307].rotateAngleX = 0.26179939F;

        gunModel[308].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 385
        gunModel[308].setRotationPoint(35.5F, -36.75F, -1.51F);

        gunModel[309].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 386
        gunModel[309].setRotationPoint(35.5F, -36.75F, 1.49F);
        gunModel[309].rotateAngleX = -0.26179939F;

        gunModel[310].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 387
        gunModel[310].setRotationPoint(35.5F, -36.75F, -1.51F);
        gunModel[310].rotateAngleX = 0.26179939F;

        gunModel[311].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 388
        gunModel[311].setRotationPoint(37.5F, -36.75F, -1.51F);

        gunModel[312].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 389
        gunModel[312].setRotationPoint(37.5F, -36.75F, 1.49F);
        gunModel[312].rotateAngleX = -0.26179939F;

        gunModel[313].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 390
        gunModel[313].setRotationPoint(37.5F, -36.75F, -1.51F);
        gunModel[313].rotateAngleX = 0.26179939F;

        gunModel[314].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 391
        gunModel[314].setRotationPoint(41.5F, -36.75F, -1.51F);

        gunModel[315].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 392
        gunModel[315].setRotationPoint(41.5F, -36.75F, 1.49F);
        gunModel[315].rotateAngleX = -0.26179939F;

        gunModel[316].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 393
        gunModel[316].setRotationPoint(41.5F, -36.75F, -1.51F);
        gunModel[316].rotateAngleX = 0.26179939F;

        gunModel[317].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 394
        gunModel[317].setRotationPoint(39.5F, -36.75F, 1.49F);
        gunModel[317].rotateAngleX = -0.26179939F;

        gunModel[318].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 395
        gunModel[318].setRotationPoint(39.5F, -36.75F, -1.51F);

        gunModel[319].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 396
        gunModel[319].setRotationPoint(39.5F, -36.75F, -1.51F);
        gunModel[319].rotateAngleX = 0.26179939F;

        gunModel[320].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 397
        gunModel[320].setRotationPoint(45.5F, -36.75F, -1.51F);

        gunModel[321].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 398
        gunModel[321].setRotationPoint(45.5F, -36.75F, 1.49F);
        gunModel[321].rotateAngleX = -0.26179939F;

        gunModel[322].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 399
        gunModel[322].setRotationPoint(45.5F, -36.75F, -1.51F);
        gunModel[322].rotateAngleX = 0.26179939F;

        gunModel[323].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 400
        gunModel[323].setRotationPoint(43.5F, -36.75F, 1.49F);
        gunModel[323].rotateAngleX = -0.26179939F;

        gunModel[324].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 401
        gunModel[324].setRotationPoint(43.5F, -36.75F, -1.51F);

        gunModel[325].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 402
        gunModel[325].setRotationPoint(43.5F, -36.75F, -1.51F);
        gunModel[325].rotateAngleX = 0.26179939F;

        gunModel[326].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 403
        gunModel[326].setRotationPoint(49.5F, -36.75F, -1.51F);

        gunModel[327].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 404
        gunModel[327].setRotationPoint(49.5F, -36.75F, 1.49F);
        gunModel[327].rotateAngleX = -0.26179939F;

        gunModel[328].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 405
        gunModel[328].setRotationPoint(49.5F, -36.75F, -1.51F);
        gunModel[328].rotateAngleX = 0.26179939F;

        gunModel[329].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 406
        gunModel[329].setRotationPoint(47.5F, -36.75F, 1.49F);
        gunModel[329].rotateAngleX = -0.26179939F;

        gunModel[330].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 407
        gunModel[330].setRotationPoint(47.5F, -36.75F, -1.51F);

        gunModel[331].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 408
        gunModel[331].setRotationPoint(47.5F, -36.75F, -1.51F);
        gunModel[331].rotateAngleX = 0.26179939F;

        gunModel[332].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 409
        gunModel[332].setRotationPoint(53.5F, -36.75F, -1.51F);

        gunModel[333].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 410
        gunModel[333].setRotationPoint(53.5F, -36.75F, 1.49F);
        gunModel[333].rotateAngleX = -0.26179939F;

        gunModel[334].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 411
        gunModel[334].setRotationPoint(53.5F, -36.75F, -1.51F);
        gunModel[334].rotateAngleX = 0.26179939F;

        gunModel[335].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 412
        gunModel[335].setRotationPoint(51.5F, -36.75F, 1.49F);
        gunModel[335].rotateAngleX = -0.26179939F;

        gunModel[336].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 413
        gunModel[336].setRotationPoint(51.5F, -36.75F, -1.51F);

        gunModel[337].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 414
        gunModel[337].setRotationPoint(51.5F, -36.75F, -1.51F);
        gunModel[337].rotateAngleX = 0.26179939F;

        gunModel[338].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 415
        gunModel[338].setRotationPoint(57.5F, -36.75F, -1.51F);

        gunModel[339].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 416
        gunModel[339].setRotationPoint(57.5F, -36.75F, 1.49F);
        gunModel[339].rotateAngleX = -0.26179939F;

        gunModel[340].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 417
        gunModel[340].setRotationPoint(57.5F, -36.75F, -1.51F);
        gunModel[340].rotateAngleX = 0.26179939F;

        gunModel[341].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 418
        gunModel[341].setRotationPoint(55.5F, -36.75F, 1.49F);
        gunModel[341].rotateAngleX = -0.26179939F;

        gunModel[342].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 419
        gunModel[342].setRotationPoint(55.5F, -36.75F, -1.51F);

        gunModel[343].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 420
        gunModel[343].setRotationPoint(55.5F, -36.75F, -1.51F);
        gunModel[343].rotateAngleX = 0.26179939F;

        gunModel[344].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 421
        gunModel[344].setRotationPoint(11F, -36.75F, -1.51F);
        gunModel[344].rotateAngleX = 0.26179939F;

        gunModel[345].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 422
        gunModel[345].setRotationPoint(11F, -36.75F, -1.51F);

        gunModel[346].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 423
        gunModel[346].setRotationPoint(11F, -36.75F, 1.49F);
        gunModel[346].rotateAngleX = -0.26179939F;

        gunModel[347].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 424
        gunModel[347].setRotationPoint(13F, -36.75F, -1.51F);
        gunModel[347].rotateAngleX = 0.26179939F;

        gunModel[348].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 425
        gunModel[348].setRotationPoint(13F, -36.75F, -1.51F);

        gunModel[349].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 426
        gunModel[349].setRotationPoint(13F, -36.75F, 1.49F);
        gunModel[349].rotateAngleX = -0.26179939F;

        gunModel[350].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 427
        gunModel[350].setRotationPoint(17F, -36.75F, -1.51F);
        gunModel[350].rotateAngleX = 0.26179939F;

        gunModel[351].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 428
        gunModel[351].setRotationPoint(17F, -36.75F, -1.51F);

        gunModel[352].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 429
        gunModel[352].setRotationPoint(17F, -36.75F, 1.49F);
        gunModel[352].rotateAngleX = -0.26179939F;

        gunModel[353].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 430
        gunModel[353].setRotationPoint(15F, -36.75F, -1.51F);
        gunModel[353].rotateAngleX = 0.26179939F;

        gunModel[354].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 431
        gunModel[354].setRotationPoint(15F, -36.75F, -1.51F);

        gunModel[355].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 432
        gunModel[355].setRotationPoint(15F, -36.75F, 1.49F);
        gunModel[355].rotateAngleX = -0.26179939F;

        gunModel[356].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 433
        gunModel[356].setRotationPoint(21F, -36.75F, -1.51F);
        gunModel[356].rotateAngleX = 0.26179939F;

        gunModel[357].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 434
        gunModel[357].setRotationPoint(21F, -36.75F, -1.51F);

        gunModel[358].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 435
        gunModel[358].setRotationPoint(21F, -36.75F, 1.49F);
        gunModel[358].rotateAngleX = -0.26179939F;

        gunModel[359].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 436
        gunModel[359].setRotationPoint(19F, -36.75F, -1.51F);
        gunModel[359].rotateAngleX = 0.26179939F;

        gunModel[360].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 437
        gunModel[360].setRotationPoint(19F, -36.75F, -1.51F);

        gunModel[361].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 438
        gunModel[361].setRotationPoint(19F, -36.75F, 1.49F);
        gunModel[361].rotateAngleX = -0.26179939F;

        gunModel[362].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 439
        gunModel[362].setRotationPoint(25F, -36.75F, -1.51F);
        gunModel[362].rotateAngleX = 0.26179939F;

        gunModel[363].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 440
        gunModel[363].setRotationPoint(25F, -36.75F, -1.51F);

        gunModel[364].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 441
        gunModel[364].setRotationPoint(25F, -36.75F, 1.49F);
        gunModel[364].rotateAngleX = -0.26179939F;

        gunModel[365].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 442
        gunModel[365].setRotationPoint(23F, -36.75F, -1.51F);
        gunModel[365].rotateAngleX = 0.26179939F;

        gunModel[366].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 443
        gunModel[366].setRotationPoint(23F, -36.75F, -1.51F);

        gunModel[367].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 444
        gunModel[367].setRotationPoint(23F, -36.75F, 1.49F);
        gunModel[367].rotateAngleX = -0.26179939F;

        gunModel[368].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 445
        gunModel[368].setRotationPoint(29F, -36.75F, -1.51F);
        gunModel[368].rotateAngleX = 0.26179939F;

        gunModel[369].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 446
        gunModel[369].setRotationPoint(29F, -36.75F, -1.51F);

        gunModel[370].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 447
        gunModel[370].setRotationPoint(29F, -36.75F, 1.49F);
        gunModel[370].rotateAngleX = -0.26179939F;

        gunModel[371].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 448
        gunModel[371].setRotationPoint(27F, -36.75F, -1.51F);
        gunModel[371].rotateAngleX = 0.26179939F;

        gunModel[372].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 449
        gunModel[372].setRotationPoint(27F, -36.75F, -1.51F);

        gunModel[373].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 450
        gunModel[373].setRotationPoint(27F, -36.75F, 1.49F);
        gunModel[373].rotateAngleX = -0.26179939F;

        gunModel[374].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 454
        gunModel[374].setRotationPoint(31F, -36.75F, -1.51F);
        gunModel[374].rotateAngleX = 0.26179939F;

        gunModel[375].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 455
        gunModel[375].setRotationPoint(31F, -36.75F, -1.51F);

        gunModel[376].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 456
        gunModel[376].setRotationPoint(31F, -36.75F, 1.49F);
        gunModel[376].rotateAngleX = -0.26179939F;

        gunModel[377].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 457
        gunModel[377].setRotationPoint(11.5F, -25.25F, 1.49F);
        gunModel[377].rotateAngleX = 0.26179939F;

        gunModel[378].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 458
        gunModel[378].setRotationPoint(11.5F, -25.25F, -1.51F);
        gunModel[378].rotateAngleX = -0.26179939F;

        gunModel[379].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 459
        gunModel[379].setRotationPoint(11.5F, -26.25F, -1.51F);

        gunModel[380].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 460
        gunModel[380].setRotationPoint(13.5F, -25.25F, -1.51F);
        gunModel[380].rotateAngleX = -0.26179939F;

        gunModel[381].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 461
        gunModel[381].setRotationPoint(13.5F, -26.25F, -1.51F);

        gunModel[382].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 462
        gunModel[382].setRotationPoint(13.5F, -25.25F, 1.49F);
        gunModel[382].rotateAngleX = 0.26179939F;

        gunModel[383].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 463
        gunModel[383].setRotationPoint(15.5F, -25.25F, -1.51F);
        gunModel[383].rotateAngleX = -0.26179939F;

        gunModel[384].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 464
        gunModel[384].setRotationPoint(15.5F, -26.25F, -1.51F);

        gunModel[385].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 465
        gunModel[385].setRotationPoint(15.5F, -25.25F, 1.49F);
        gunModel[385].rotateAngleX = 0.26179939F;

        gunModel[386].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 466
        gunModel[386].setRotationPoint(17.5F, -25.25F, -1.51F);
        gunModel[386].rotateAngleX = -0.26179939F;

        gunModel[387].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 467
        gunModel[387].setRotationPoint(17.5F, -26.25F, -1.51F);

        gunModel[388].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 468
        gunModel[388].setRotationPoint(17.5F, -25.25F, 1.49F);
        gunModel[388].rotateAngleX = 0.26179939F;

        gunModel[389].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 469
        gunModel[389].setRotationPoint(19.5F, -25.25F, -1.51F);
        gunModel[389].rotateAngleX = -0.26179939F;

        gunModel[390].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 470
        gunModel[390].setRotationPoint(19.5F, -26.25F, -1.51F);

        gunModel[391].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 471
        gunModel[391].setRotationPoint(19.5F, -25.25F, 1.49F);
        gunModel[391].rotateAngleX = 0.26179939F;

        gunModel[392].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 472
        gunModel[392].setRotationPoint(21.5F, -25.25F, -1.51F);
        gunModel[392].rotateAngleX = -0.26179939F;

        gunModel[393].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 473
        gunModel[393].setRotationPoint(21.5F, -26.25F, -1.51F);

        gunModel[394].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 474
        gunModel[394].setRotationPoint(21.5F, -25.25F, 1.49F);
        gunModel[394].rotateAngleX = 0.26179939F;

        gunModel[395].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 475
        gunModel[395].setRotationPoint(23.5F, -25.25F, -1.51F);
        gunModel[395].rotateAngleX = -0.26179939F;

        gunModel[396].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 476
        gunModel[396].setRotationPoint(23.5F, -26.25F, -1.51F);

        gunModel[397].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 477
        gunModel[397].setRotationPoint(23.5F, -25.25F, 1.49F);
        gunModel[397].rotateAngleX = 0.26179939F;

        gunModel[398].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 478
        gunModel[398].setRotationPoint(25.5F, -25.25F, -1.51F);
        gunModel[398].rotateAngleX = -0.26179939F;

        gunModel[399].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 479
        gunModel[399].setRotationPoint(25.5F, -26.25F, -1.51F);

        gunModel[400].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 480
        gunModel[400].setRotationPoint(25.5F, -25.25F, 1.49F);
        gunModel[400].rotateAngleX = 0.26179939F;

        gunModel[401].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 481
        gunModel[401].setRotationPoint(37.5F, -25.25F, 1.49F);
        gunModel[401].rotateAngleX = 0.26179939F;

        gunModel[402].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 482
        gunModel[402].setRotationPoint(37.5F, -26.25F, -1.51F);

        gunModel[403].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 483
        gunModel[403].setRotationPoint(37.5F, -25.25F, -1.51F);
        gunModel[403].rotateAngleX = -0.26179939F;

        gunModel[404].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 484
        gunModel[404].setRotationPoint(39.5F, -25.25F, -1.51F);
        gunModel[404].rotateAngleX = -0.26179939F;

        gunModel[405].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 485
        gunModel[405].setRotationPoint(39.5F, -26.25F, -1.51F);

        gunModel[406].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 486
        gunModel[406].setRotationPoint(39.5F, -25.25F, 1.49F);
        gunModel[406].rotateAngleX = 0.26179939F;

        gunModel[407].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 487
        gunModel[407].setRotationPoint(41.5F, -25.25F, 1.49F);
        gunModel[407].rotateAngleX = 0.26179939F;

        gunModel[408].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 488
        gunModel[408].setRotationPoint(41.5F, -26.25F, -1.51F);

        gunModel[409].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 489
        gunModel[409].setRotationPoint(41.5F, -25.25F, -1.51F);
        gunModel[409].rotateAngleX = -0.26179939F;

        gunModel[410].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 490
        gunModel[410].setRotationPoint(43.5F, -25.25F, -1.51F);
        gunModel[410].rotateAngleX = -0.26179939F;

        gunModel[411].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 491
        gunModel[411].setRotationPoint(43.5F, -26.25F, -1.51F);

        gunModel[412].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 492
        gunModel[412].setRotationPoint(43.5F, -25.25F, 1.49F);
        gunModel[412].rotateAngleX = 0.26179939F;

        gunModel[413].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 493
        gunModel[413].setRotationPoint(49.5F, -25.25F, 1.49F);
        gunModel[413].rotateAngleX = 0.26179939F;

        gunModel[414].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 494
        gunModel[414].setRotationPoint(49.5F, -26.25F, -1.51F);

        gunModel[415].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 495
        gunModel[415].setRotationPoint(49.5F, -25.25F, -1.51F);
        gunModel[415].rotateAngleX = -0.26179939F;

        gunModel[416].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 496
        gunModel[416].setRotationPoint(51.5F, -25.25F, -1.51F);
        gunModel[416].rotateAngleX = -0.26179939F;

        gunModel[417].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 497
        gunModel[417].setRotationPoint(51.5F, -26.25F, -1.51F);

        gunModel[418].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 498
        gunModel[418].setRotationPoint(51.5F, -25.25F, 1.49F);
        gunModel[418].rotateAngleX = 0.26179939F;

        gunModel[419].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 499
        gunModel[419].setRotationPoint(47.5F, -25.25F, -1.51F);
        gunModel[419].rotateAngleX = -0.26179939F;

        gunModel[420].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 500
        gunModel[420].setRotationPoint(47.5F, -26.25F, -1.51F);

        gunModel[421].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 501
        gunModel[421].setRotationPoint(47.5F, -25.25F, 1.49F);
        gunModel[421].rotateAngleX = 0.26179939F;

        gunModel[422].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 502
        gunModel[422].setRotationPoint(45.5F, -25.25F, 1.49F);
        gunModel[422].rotateAngleX = 0.26179939F;

        gunModel[423].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 503
        gunModel[423].setRotationPoint(45.5F, -26.25F, -1.51F);

        gunModel[424].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 504
        gunModel[424].setRotationPoint(45.5F, -25.25F, -1.51F);
        gunModel[424].rotateAngleX = -0.26179939F;

        gunModel[425].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 505
        gunModel[425].setRotationPoint(57.5F, -25.25F, 1.49F);
        gunModel[425].rotateAngleX = 0.26179939F;

        gunModel[426].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 506
        gunModel[426].setRotationPoint(57.5F, -26.25F, -1.51F);

        gunModel[427].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 507
        gunModel[427].setRotationPoint(57.5F, -25.25F, -1.51F);
        gunModel[427].rotateAngleX = -0.26179939F;

        gunModel[428].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 511
        gunModel[428].setRotationPoint(55.5F, -25.25F, -1.51F);
        gunModel[428].rotateAngleX = -0.26179939F;

        gunModel[429].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 512
        gunModel[429].setRotationPoint(55.5F, -26.25F, -1.51F);

        gunModel[430].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 513
        gunModel[430].setRotationPoint(55.5F, -25.25F, 1.49F);
        gunModel[430].rotateAngleX = 0.26179939F;

        gunModel[431].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 514
        gunModel[431].setRotationPoint(53.5F, -25.25F, 1.49F);
        gunModel[431].rotateAngleX = 0.26179939F;

        gunModel[432].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 515
        gunModel[432].setRotationPoint(53.5F, -26.25F, -1.51F);

        gunModel[433].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 516
        gunModel[433].setRotationPoint(53.5F, -25.25F, -1.51F);
        gunModel[433].rotateAngleX = -0.26179939F;

        gunModel[434].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 517
        gunModel[434].setRotationPoint(35.5F, -25.25F, -1.51F);
        gunModel[434].rotateAngleX = -0.26179939F;

        gunModel[435].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 518
        gunModel[435].setRotationPoint(35.5F, -26.25F, -1.51F);

        gunModel[436].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 519
        gunModel[436].setRotationPoint(35.5F, -25.25F, 1.49F);
        gunModel[436].rotateAngleX = 0.26179939F;

        gunModel[437].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 520
        gunModel[437].setRotationPoint(50F, -29.51F, -5.25F);
        gunModel[437].rotateAngleX = 0.26179939F;

        gunModel[438].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 521
        gunModel[438].setRotationPoint(50F, -32.51F, -5.25F);

        gunModel[439].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 522
        gunModel[439].setRotationPoint(50F, -32.51F, -5.25F);
        gunModel[439].rotateAngleX = -0.26179939F;

        gunModel[440].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 523
        gunModel[440].setRotationPoint(48F, -32.51F, -5.25F);
        gunModel[440].rotateAngleX = -0.26179939F;

        gunModel[441].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 524
        gunModel[441].setRotationPoint(48F, -32.51F, -5.25F);

        gunModel[442].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 525
        gunModel[442].setRotationPoint(48F, -29.51F, -5.25F);
        gunModel[442].rotateAngleX = 0.26179939F;

        gunModel[443].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 526
        gunModel[443].setRotationPoint(46F, -29.51F, -5.25F);
        gunModel[443].rotateAngleX = 0.26179939F;

        gunModel[444].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 527
        gunModel[444].setRotationPoint(46F, -32.51F, -5.25F);

        gunModel[445].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 528
        gunModel[445].setRotationPoint(46F, -32.51F, -5.25F);
        gunModel[445].rotateAngleX = -0.26179939F;

        gunModel[446].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 529
        gunModel[446].setRotationPoint(44F, -32.51F, -5.25F);
        gunModel[446].rotateAngleX = -0.26179939F;

        gunModel[447].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 530
        gunModel[447].setRotationPoint(44F, -32.51F, -5.25F);

        gunModel[448].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 531
        gunModel[448].setRotationPoint(44F, -29.51F, -5.25F);
        gunModel[448].rotateAngleX = 0.26179939F;

        gunModel[449].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 532
        gunModel[449].setRotationPoint(42F, -29.51F, -5.25F);
        gunModel[449].rotateAngleX = 0.26179939F;

        gunModel[450].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 533
        gunModel[450].setRotationPoint(42F, -32.51F, -5.25F);

        gunModel[451].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 534
        gunModel[451].setRotationPoint(42F, -32.51F, -5.25F);
        gunModel[451].rotateAngleX = -0.26179939F;

        gunModel[452].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 535
        gunModel[452].setRotationPoint(40F, -32.51F, -5.25F);
        gunModel[452].rotateAngleX = -0.26179939F;

        gunModel[453].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 536
        gunModel[453].setRotationPoint(40F, -32.51F, -5.25F);

        gunModel[454].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 537
        gunModel[454].setRotationPoint(40F, -29.51F, -5.25F);
        gunModel[454].rotateAngleX = 0.26179939F;

        gunModel[455].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 538
        gunModel[455].setRotationPoint(38F, -29.51F, -5.25F);
        gunModel[455].rotateAngleX = 0.26179939F;

        gunModel[456].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 539
        gunModel[456].setRotationPoint(38F, -32.51F, -5.25F);

        gunModel[457].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 540
        gunModel[457].setRotationPoint(38F, -32.51F, -5.25F);
        gunModel[457].rotateAngleX = -0.26179939F;

        gunModel[458].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 541
        gunModel[458].setRotationPoint(33.5F, -32.51F, -5.25F);
        gunModel[458].rotateAngleX = -0.26179939F;

        gunModel[459].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 542
        gunModel[459].setRotationPoint(33.5F, -32.51F, -5.25F);

        gunModel[460].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 543
        gunModel[460].setRotationPoint(33.5F, -29.51F, -5.25F);
        gunModel[460].rotateAngleX = 0.26179939F;

        gunModel[461].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 544
        gunModel[461].setRotationPoint(31.5F, -29.51F, -5.25F);
        gunModel[461].rotateAngleX = 0.26179939F;

        gunModel[462].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 545
        gunModel[462].setRotationPoint(31.5F, -32.51F, -5.25F);

        gunModel[463].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 546
        gunModel[463].setRotationPoint(31.5F, -32.51F, -5.25F);
        gunModel[463].rotateAngleX = -0.26179939F;

        gunModel[464].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 547
        gunModel[464].setRotationPoint(29.5F, -32.51F, -5.25F);
        gunModel[464].rotateAngleX = -0.26179939F;

        gunModel[465].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 548
        gunModel[465].setRotationPoint(29.5F, -29.51F, -5.25F);
        gunModel[465].rotateAngleX = 0.26179939F;

        gunModel[466].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 549
        gunModel[466].setRotationPoint(29.5F, -32.51F, -5.25F);

        gunModel[467].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 550
        gunModel[467].setRotationPoint(27.5F, -29.51F, -5.25F);
        gunModel[467].rotateAngleX = 0.26179939F;

        gunModel[468].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 551
        gunModel[468].setRotationPoint(27.5F, -32.51F, -5.25F);

        gunModel[469].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 552
        gunModel[469].setRotationPoint(27.5F, -32.51F, -5.25F);
        gunModel[469].rotateAngleX = -0.26179939F;

        gunModel[470].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 553
        gunModel[470].setRotationPoint(25.5F, -32.51F, -5.25F);
        gunModel[470].rotateAngleX = -0.26179939F;

        gunModel[471].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 554
        gunModel[471].setRotationPoint(25.5F, -32.51F, -5.25F);

        gunModel[472].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 555
        gunModel[472].setRotationPoint(25.5F, -29.51F, -5.25F);
        gunModel[472].rotateAngleX = 0.26179939F;

        gunModel[473].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 556
        gunModel[473].setRotationPoint(23.5F, -29.51F, -5.25F);
        gunModel[473].rotateAngleX = 0.26179939F;

        gunModel[474].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 557
        gunModel[474].setRotationPoint(23.5F, -32.51F, -5.25F);

        gunModel[475].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 558
        gunModel[475].setRotationPoint(23.5F, -32.51F, -5.25F);
        gunModel[475].rotateAngleX = -0.26179939F;

        gunModel[476].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 559
        gunModel[476].setRotationPoint(21.5F, -32.51F, -5.25F);
        gunModel[476].rotateAngleX = -0.26179939F;

        gunModel[477].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 560
        gunModel[477].setRotationPoint(21.5F, -29.51F, -5.25F);
        gunModel[477].rotateAngleX = 0.26179939F;

        gunModel[478].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 561
        gunModel[478].setRotationPoint(21.5F, -32.51F, -5.25F);

        gunModel[479].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 562
        gunModel[479].setRotationPoint(19.5F, -29.51F, -5.25F);
        gunModel[479].rotateAngleX = 0.26179939F;

        gunModel[480].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 563
        gunModel[480].setRotationPoint(19.5F, -32.51F, -5.25F);

        gunModel[481].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 564
        gunModel[481].setRotationPoint(19.5F, -32.51F, -5.25F);
        gunModel[481].rotateAngleX = -0.26179939F;

        gunModel[482].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 565
        gunModel[482].setRotationPoint(17.5F, -32.51F, -5.25F);
        gunModel[482].rotateAngleX = -0.26179939F;

        gunModel[483].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 566
        gunModel[483].setRotationPoint(17.5F, -32.51F, -5.25F);

        gunModel[484].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 567
        gunModel[484].setRotationPoint(17.5F, -29.51F, -5.25F);
        gunModel[484].rotateAngleX = 0.26179939F;

        gunModel[485].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 568
        gunModel[485].setRotationPoint(15.5F, -29.51F, -5.25F);
        gunModel[485].rotateAngleX = 0.26179939F;

        gunModel[486].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 569
        gunModel[486].setRotationPoint(15.5F, -32.51F, -5.25F);

        gunModel[487].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 570
        gunModel[487].setRotationPoint(15.5F, -32.51F, -5.25F);
        gunModel[487].rotateAngleX = -0.26179939F;

        gunModel[488].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 571
        gunModel[488].setRotationPoint(13.5F, -32.51F, -5.25F);
        gunModel[488].rotateAngleX = -0.26179939F;

        gunModel[489].addBox(0F, -2F, 0F, 1, 2, 1, 0F); // Box 572
        gunModel[489].setRotationPoint(11.5F, -32.51F, -5.25F);
        gunModel[489].rotateAngleX = -0.26179939F;

        gunModel[490].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 573
        gunModel[490].setRotationPoint(11.5F, -32.51F, -5.25F);

        gunModel[491].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 574
        gunModel[491].setRotationPoint(13.5F, -32.51F, -5.25F);

        gunModel[492].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 575
        gunModel[492].setRotationPoint(13.5F, -29.51F, -5.25F);
        gunModel[492].rotateAngleX = 0.26179939F;

        gunModel[493].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 576
        gunModel[493].setRotationPoint(11.5F, -29.51F, -5.25F);
        gunModel[493].rotateAngleX = 0.26179939F;

        gunModel[494].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 577
        gunModel[494].setRotationPoint(92F, -33F, -2F);

        gunModel[495].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 578
        gunModel[495].setRotationPoint(94F, -33F, -2F);

        gunModel[496].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 579
        gunModel[496].setRotationPoint(93F, -32.5F, -1.5F);

        gunModel[497].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 580
        gunModel[497].setRotationPoint(95F, -33F, -1.5F);

        gunModel[498].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 581
        gunModel[498].setRotationPoint(95F, -30F, -1.5F);

        gunModel[499].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 582
        gunModel[499].setRotationPoint(95F, -32.5F, -2F);

        gunModel[500].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 583
        gunModel[500].setRotationPoint(95F, -30.5F, -2F);

        gunModel[501].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 584
        gunModel[501].setRotationPoint(95F, -32.5F, 1F);

        gunModel[502].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 585
        gunModel[502].setRotationPoint(95F, -30.5F, 1F);

        gunModel[503].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 586
        gunModel[503].setRotationPoint(95F, -31.5F, 1F);

        gunModel[504].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 587
        gunModel[504].setRotationPoint(95F, -31.5F, -2F);

        gunModel[505].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 588
        gunModel[505].setRotationPoint(99F, -31.5F, 1F);

        gunModel[506].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 589
        gunModel[506].setRotationPoint(99F, -31.5F, -2F);

        gunModel[507].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 590
        gunModel[507].setRotationPoint(67.5F, -30F, -1.5F);

        gunModel[508].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 591
        gunModel[508].setRotationPoint(69F, -29F, -1F);
        gunModel[508].rotateAngleZ = -0.15707963F;

        gunModel[509].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 592
        gunModel[509].setRotationPoint(61.5F, -30.54F, -1.5F);

        gunModel[510].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 593
        gunModel[510].setRotationPoint(62F, -27.54F, -2.5F);
        gunModel[510].rotateAngleZ = 0.12217305F;

        gunModel[511].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Box 594
        gunModel[511].setRotationPoint(62F, -27.54F, -2.5F);
        gunModel[511].rotateAngleZ = 0.12217305F;

        gunModel[512].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Box 595
        gunModel[512].setRotationPoint(62F, -27.54F, 1.5F);
        gunModel[512].rotateAngleZ = 0.12217305F;

        gunModel[513].addBox(0F, 3F, 0F, 1, 1, 5, 0F); // Box 596
        gunModel[513].setRotationPoint(62F, -27.54F, -2.5F);
        gunModel[513].rotateAngleZ = 0.12217305F;

        gunModel[514].addBox(0F, 0F, -1F, 6, 2, 1, 0F); // Box 597
        gunModel[514].setRotationPoint(-5F, -33.62F, 2.35F);

        gunModel[515].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Box 598
        gunModel[515].setRotationPoint(-69F, -12.5F, -2.5F);
        gunModel[515].rotateAngleZ = 0.87266463F;

        gunModel[516].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 599
        gunModel[516].setRotationPoint(-69F, -12.5F, -2.5F);
        gunModel[516].rotateAngleZ = 0.87266463F;

        gunModel[517].addBox(0F, 1F, 0F, 1, 2, 1, 0F); // Box 600
        gunModel[517].setRotationPoint(-69F, -12.5F, 1.5F);
        gunModel[517].rotateAngleZ = 0.87266463F;

        gunModel[518].addBox(0F, 3F, 0F, 1, 1, 5, 0F); // Box 601
        gunModel[518].setRotationPoint(-69F, -12.5F, -2.5F);
        gunModel[518].rotateAngleZ = 0.87266463F;

        ammoModel = new ModelRendererTurbo[21];
        ammoModel[0] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 52
        ammoModel[2] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 54
        ammoModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 106
        ammoModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 107
        ammoModel[5] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 108
        ammoModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 109
        ammoModel[7] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 110
        ammoModel[8] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 111
        ammoModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 112
        ammoModel[10] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 113
        ammoModel[11] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 114
        ammoModel[12] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 115
        ammoModel[13] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 116
        ammoModel[14] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 117
        ammoModel[15] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 118
        ammoModel[16] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 119
        ammoModel[17] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 120
        ammoModel[18] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 121
        ammoModel[19] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122
        ammoModel[20] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 123

        ammoModel[0].addBox(0F, 0F, 0F, 10, 3, 4, 0F); // Box 51
        ammoModel[0].setRotationPoint(-7.14F, -19F, -2F);
        ammoModel[0].rotateAngleZ = 0.01745329F;

        ammoModel[1].addBox(0F, 0F, 0F, 10, 8, 4, 0F); // Box 52
        ammoModel[1].setRotationPoint(-7.14F, -16F, -2F);
        ammoModel[1].rotateAngleZ = 0.13962634F;

        ammoModel[2].addBox(0F, 0.05F, 0.01F, 10, 9, 4, 0F); // Box 54
        ammoModel[2].setRotationPoint(-6F, -8.15F, -2F);
        ammoModel[2].rotateAngleZ = 0.26179939F;

        ammoModel[3].addBox(1F, 0F, 0F, 1, 3, 1, 0F); // Box 106
        ammoModel[3].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[3].rotateAngleZ = 0.01745329F;

        ammoModel[4].addBox(1F, 0F, -0.01F, 1, 8, 1, 0F); // Box 107
        ammoModel[4].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[4].rotateAngleZ = 0.13962634F;

        ammoModel[5].addBox(1F, 0F, 0F, 1, 9, 1, 0F); // Box 108
        ammoModel[5].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[5].rotateAngleZ = 0.26179939F;

        ammoModel[6].addBox(4F, 0F, 0F, 1, 3, 1, 0F); // Box 109
        ammoModel[6].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[6].rotateAngleZ = 0.01745329F;

        ammoModel[7].addBox(4F, 0F, -0.01F, 1, 8, 1, 0F); // Box 110
        ammoModel[7].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[7].rotateAngleZ = 0.13962634F;

        ammoModel[8].addBox(4F, 0F, 0F, 1, 9, 1, 0F); // Box 111
        ammoModel[8].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[8].rotateAngleZ = 0.26179939F;

        ammoModel[9].addBox(7F, 0F, 0F, 1, 3, 1, 0F); // Box 112
        ammoModel[9].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[9].rotateAngleZ = 0.01745329F;

        ammoModel[10].addBox(7F, 0F, -0.01F, 1, 8, 1, 0F); // Box 113
        ammoModel[10].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[10].rotateAngleZ = 0.13962634F;

        ammoModel[11].addBox(7F, 0F, 0F, 1, 9, 1, 0F); // Box 114
        ammoModel[11].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[11].rotateAngleZ = 0.26179939F;

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

        ammoModel[18].addBox(7F, 0F, 0F, 1, 9, 1, 0F); // Box 121
        ammoModel[18].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[18].rotateAngleZ = 0.26179939F;

        ammoModel[19].addBox(4F, 0F, 0F, 1, 9, 1, 0F); // Box 122
        ammoModel[19].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[19].rotateAngleZ = 0.26179939F;

        ammoModel[20].addBox(1F, 0F, 0F, 1, 9, 1, 0F); // Box 123
        ammoModel[20].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[20].rotateAngleZ = 0.26179939F;



        this.modelScale = 0.2f;
        translateAll = new Vector3f(18F, 7.5F, 0F);
        this.crouchZoom = -0.2f;

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