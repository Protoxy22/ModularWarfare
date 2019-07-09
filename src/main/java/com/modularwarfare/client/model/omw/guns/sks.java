package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class sks extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public sks() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[112];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
        gunModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
        gunModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
        gunModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 82
        gunModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 84
        gunModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 96
        gunModel[11] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 97
        gunModel[12] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 126
        gunModel[13] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 128
        gunModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 158
        gunModel[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 161
        gunModel[16] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 169
        gunModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 227
        gunModel[18] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 228
        gunModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 229
        gunModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 230
        gunModel[21] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 231
        gunModel[22] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 232
        gunModel[23] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 233
        gunModel[24] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 235
        gunModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 237
        gunModel[26] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 241
        gunModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 242
        gunModel[28] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 243
        gunModel[29] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 244
        gunModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 246
        gunModel[31] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 247
        gunModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 248
        gunModel[33] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 249
        gunModel[34] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 250
        gunModel[35] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 254
        gunModel[36] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 255
        gunModel[37] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 210
        gunModel[38] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 211
        gunModel[39] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 212
        gunModel[40] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 213
        gunModel[41] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 215
        gunModel[42] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 218
        gunModel[43] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 219
        gunModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 220
        gunModel[45] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 221
        gunModel[46] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 223
        gunModel[47] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 224
        gunModel[48] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 225
        gunModel[49] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 226
        gunModel[50] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 227
        gunModel[51] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 228
        gunModel[52] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 72
        gunModel[53] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 73
        gunModel[54] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 74
        gunModel[55] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 75
        gunModel[56] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 76
        gunModel[57] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 235
        gunModel[58] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 236
        gunModel[59] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 237
        gunModel[60] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 238
        gunModel[61] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 239
        gunModel[62] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 98
        gunModel[63] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 99
        gunModel[64] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 100
        gunModel[65] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 101
        gunModel[66] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 102
        gunModel[67] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 116
        gunModel[68] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 113
        gunModel[69] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 114
        gunModel[70] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 115
        gunModel[71] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 116
        gunModel[72] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 117
        gunModel[73] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 119
        gunModel[74] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 32
        gunModel[75] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 100
        gunModel[76] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 99
        gunModel[77] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 259
        gunModel[78] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 260
        gunModel[79] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 261
        gunModel[80] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 264
        gunModel[81] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 265
        gunModel[82] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 266
        gunModel[83] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 267
        gunModel[84] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 268
        gunModel[85] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 269
        gunModel[86] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 270
        gunModel[87] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 271
        gunModel[88] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 272
        gunModel[89] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 144
        gunModel[90] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 145
        gunModel[91] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 146
        gunModel[92] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 147
        gunModel[93] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 148
        gunModel[94] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 149
        gunModel[95] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 150
        gunModel[96] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 151
        gunModel[97] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 152
        gunModel[98] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 153
        gunModel[99] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 154
        gunModel[100] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 155
        gunModel[101] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 104
        gunModel[102] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 105
        gunModel[103] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 106
        gunModel[104] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 107
        gunModel[105] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 108
        gunModel[106] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 109
        gunModel[107] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 110
        gunModel[108] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 111
        gunModel[109] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 112
        gunModel[110] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 114
        gunModel[111] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 130

        gunModel[0].addBox(0F, 0F, 0F, 9, 2, 5, 0F); // Box 0
        gunModel[0].setRotationPoint(-48.5F, -1.5F, -2.5F);

        gunModel[1].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 1
        gunModel[1].setRotationPoint(-49.5F, 0.5F, -3F);

        gunModel[2].addBox(0F, 0F, 0F, 9, 1, 5, 0F); // Box 2
        gunModel[2].setRotationPoint(-49F, 1.5F, -2.5F);

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
        gunModel[7].rotateAngleZ = -0.19198622F;

        gunModel[8].addBox(0F, 0F, 0F, 14, 8, 6, 0F); // Box 82
        gunModel[8].setRotationPoint(-39.5F, -8.5F, -3F);

        gunModel[9].addBox(0F, 0F, 0F, 16, 8, 6, 0F); // Box 84
        gunModel[9].setRotationPoint(-25.5F, -8.5F, -3F);

        gunModel[10].addBox(0F, -0.5F, 1F, 16, 1, 4, 0F); // Box 96
        gunModel[10].setRotationPoint(-25.51F, -0.5F, -3F);

        gunModel[11].addBox(0F, -0.5F, 1F, 15, 1, 4, 0F); // Box 97
        gunModel[11].setRotationPoint(-40F, -0.5F, -3F);

        gunModel[12].addBox(0F, 0F, 0F, 13, 4, 3, 0F); // Box 126
        gunModel[12].setRotationPoint(-43F, -10.45F, -1.5F);

        gunModel[13].addBox(0F, 0F, -2F, 10, 2, 2, 0F); // Box 128
        gunModel[13].setRotationPoint(-40F, -10.45F, -1.5F);
        gunModel[13].rotateAngleX = 0.75049158F;

        gunModel[14].addBox(0F, 0F, 0F, 26, 2, 3, 0F); // Box 158
        gunModel[14].setRotationPoint(-9.5F, -2.5F, -1.5F);

        gunModel[15].addBox(0F, 0F, 0F, 26, 4, 6, 0F); // Box 161
        gunModel[15].setRotationPoint(-9.5F, -5.5F, -3F);

        gunModel[16].addBox(0F, 0F, -1F, 29, 2, 6, 0F); // Box 169
        gunModel[16].setRotationPoint(-9.5F, -7.25F, -2.01F);

        gunModel[17].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 227
        gunModel[17].setRotationPoint(-2.5F, -0.75F, -0.51F);

        gunModel[18].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 228
        gunModel[18].setRotationPoint(0.5F, -0.75F, -0.51F);

        gunModel[19].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 229
        gunModel[19].setRotationPoint(-1F, -0.75F, -0.51F);

        gunModel[20].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 230
        gunModel[20].setRotationPoint(3.5F, -0.75F, -0.51F);

        gunModel[21].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 231
        gunModel[21].setRotationPoint(2F, -0.75F, -0.51F);

        gunModel[22].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 232
        gunModel[22].setRotationPoint(6.5F, -0.75F, -0.51F);

        gunModel[23].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 233
        gunModel[23].setRotationPoint(5F, -0.75F, -0.51F);

        gunModel[24].addBox(0F, 0F, -1F, 15, 2, 4, 0F); // Box 235
        gunModel[24].setRotationPoint(-3.5F, -2F, -1F);

        gunModel[25].addBox(0F, 0F, 0F, 53, 2, 2, 0F); // Box 237
        gunModel[25].setRotationPoint(-10.5F, -8F, -1F);

        gunModel[26].addBox(0F, 0F, -1F, 4, 3, 3, 0F); // Box 241
        gunModel[26].setRotationPoint(42.5F, -8.5F, -0.5F);

        gunModel[27].addBox(0F, 0F, -1F, 2, 4, 2, 0F); // Box 242
        gunModel[27].setRotationPoint(39.5F, -6.5F, 0F);

        gunModel[28].addBox(0F, 0F, -1F, 2, 1, 1, 0F); // Box 243
        gunModel[28].setRotationPoint(38F, -5.5F, 0.5F);

        gunModel[29].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Box 244
        gunModel[29].setRotationPoint(45F, -11F, 0.5F);

        gunModel[30].addBox(0F, 0F, -1F, 3, 5, 1, 0F); // Box 246
        gunModel[30].setRotationPoint(45F, -13F, 1.85F);
        gunModel[30].rotateAngleX = -0.08726646F;

        gunModel[31].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 247
        gunModel[31].setRotationPoint(45F, -13F, -1.85F);
        gunModel[31].rotateAngleX = 0.08726646F;

        gunModel[32].addBox(0F, 0F, -1.5F, 1, 2, 1, 0F); // Box 248
        gunModel[32].setRotationPoint(46F, -13F, 1F);

        gunModel[33].addBox(0F, 0F, -1F, 11, 1, 3, 0F); // Box 249
        gunModel[33].setRotationPoint(46.5F, -8.5F, -0.5F);

        gunModel[34].addBox(0F, 0F, -1F, 11, 1, 3, 0F); // Box 250
        gunModel[34].setRotationPoint(46.5F, -6.5F, -0.5F);

        gunModel[35].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 254
        gunModel[35].setRotationPoint(46.5F, -7.5F, -1.5F);

        gunModel[36].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 255
        gunModel[36].setRotationPoint(46.5F, -7.5F, 0.5F);

        gunModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 210
        gunModel[37].setRotationPoint(57.5F, -8.5F, -0.5F);

        gunModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211
        gunModel[38].setRotationPoint(57.5F, -6.5F, -0.5F);

        gunModel[39].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 212
        gunModel[39].setRotationPoint(53.5F, -7.5F, 0.5F);

        gunModel[40].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 213
        gunModel[40].setRotationPoint(53.5F, -7.5F, -1.5F);

        gunModel[41].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 215
        gunModel[41].setRotationPoint(-40F, -10.45F, 1.5F);
        gunModel[41].rotateAngleX = -0.75049158F;

        gunModel[42].addBox(0F, 0F, 0F, 15, 6, 6, 0F); // Box 218
        gunModel[42].setRotationPoint(-54.5F, -5.5F, -3F);

        gunModel[43].addBox(0F, 0F, 0.01F, 10, 3, 6, 0F); // Box 219
        gunModel[43].setRotationPoint(-48.5F, -5.5F, -3F);
        gunModel[43].rotateAngleZ = 0.2443461F;

        gunModel[44].addBox(0F, -4F, 0F, 5, 4, 6, 0F); // Box 220
        gunModel[44].setRotationPoint(16.5F, -1.5F, -3.01F);
        gunModel[44].rotateAngleZ = 0.85521133F;

        gunModel[45].addBox(0F, 0F, -1F, 29, 1, 6, 0F); // Box 221
        gunModel[45].setRotationPoint(-9.5F, -9.25F, -2.01F);

        gunModel[46].addBox(0F, 0F, -1F, 4, 1, 6, 0F); // Box 223
        gunModel[46].setRotationPoint(15.5F, -8.25F, -2.01F);

        gunModel[47].addBox(0F, 0F, -1F, 2, 1, 6, 0F); // Box 224
        gunModel[47].setRotationPoint(10.5F, -8.25F, -2.01F);

        gunModel[48].addBox(0F, 0F, -1F, 2, 1, 6, 0F); // Box 225
        gunModel[48].setRotationPoint(5.5F, -8.25F, -2.01F);

        gunModel[49].addBox(0F, 0F, -1F, 12, 1, 6, 0F); // Box 226
        gunModel[49].setRotationPoint(-9.5F, -8.25F, -2.01F);

        gunModel[50].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 227
        gunModel[50].setRotationPoint(9.5F, -0.75F, -0.51F);

        gunModel[51].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 228
        gunModel[51].setRotationPoint(8F, -0.75F, -0.51F);

        gunModel[52].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 72
        gunModel[52].setRotationPoint(-47F, -11.5F, -2F);

        gunModel[53].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 73
        gunModel[53].setRotationPoint(-46F, -12F, -1.5F);

        gunModel[54].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 74
        gunModel[54].setRotationPoint(-44F, -12F, -1.5F);

        gunModel[55].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 75
        gunModel[55].setRotationPoint(-40F, -12F, -1.5F);

        gunModel[56].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 76
        gunModel[56].setRotationPoint(-42F, -12F, -1.5F);

        gunModel[57].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 235
        gunModel[57].setRotationPoint(-34F, -12F, -1.5F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 236
        gunModel[58].setRotationPoint(-36F, -12F, -1.5F);

        gunModel[59].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 237
        gunModel[59].setRotationPoint(-38F, -12F, -1.5F);

        gunModel[60].addBox(0F, 0F, 0F, 15, 1, 3, 0F); // Box 238
        gunModel[60].setRotationPoint(-47F, -10.5F, -1.51F);

        gunModel[61].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 239
        gunModel[61].setRotationPoint(-43.55F, 14F, -2F);
        gunModel[61].rotateAngleZ = -0.19198622F;

        gunModel[62].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 98
        gunModel[62].setRotationPoint(-40F, 0F, -1F);

        gunModel[63].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 99
        gunModel[63].setRotationPoint(-40F, 3F, -1F);
        gunModel[63].rotateAngleZ = 0.61086524F;

        gunModel[64].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 100
        gunModel[64].setRotationPoint(-38.9F, 3.7F, -1F);

        gunModel[65].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 101
        gunModel[65].setRotationPoint(-33.9F, 4.7F, -1F);
        gunModel[65].rotateAngleZ = 0.62831853F;

        gunModel[66].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 102
        gunModel[66].setRotationPoint(-33.25F, -0.5F, -1F);

        gunModel[67].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 116
        gunModel[67].setRotationPoint(-37.9F, 0F, -0.5F);
        gunModel[67].rotateAngleZ = 0.2268928F;

        gunModel[68].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // Box 113
        gunModel[68].setRotationPoint(-57F, -5.49F, -2.51F);

        gunModel[69].addBox(0F, 0F, 0F, 5, 18, 5, 0F); // Box 114
        gunModel[69].setRotationPoint(-92F, -6F, -2.49F);

        gunModel[70].addBox(0F, 0F, 0F, 23, 11, 5, 0F); // Box 115
        gunModel[70].setRotationPoint(-91F, -5.5F, -2.51F);
        gunModel[70].rotateAngleZ = 0.03490659F;

        gunModel[71].addBox(0F, -5F, 0F, 36, 5, 5, 0F); // Box 116
        gunModel[71].setRotationPoint(-90F, 11.5F, -2.5F);
        gunModel[71].rotateAngleZ = 0.31415927F;

        gunModel[72].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 117
        gunModel[72].setRotationPoint(-68F, -6.08F, -2.49F);
        gunModel[72].rotateAngleZ = -0.50614548F;

        gunModel[73].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 119
        gunModel[73].setRotationPoint(-68F, -4.5F, -2.51F);
        gunModel[73].rotateAngleZ = 0.08726646F;

        gunModel[74].addBox(0F, 0F, -1F, 12, 2, 2, 0F); // Box 32
        gunModel[74].setRotationPoint(18.5F, -11F, 0.02F);

        gunModel[75].addBox(0F, 0F, -1F, 2, 5, 2, 0F); // Box 100
        gunModel[75].setRotationPoint(29.1F, -9.6F, 0.01F);
        gunModel[75].rotateAngleZ = 0.76794487F;

        gunModel[76].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 99
        gunModel[76].setRotationPoint(-26F, 0F, -1F);
        gunModel[76].rotateAngleZ = -0.05235988F;

        gunModel[77].addBox(0F, 0F, 0F, 27, 4, 3, 0F); // Box 259
        gunModel[77].setRotationPoint(-30F, -10.01F, -1.5F);

        gunModel[78].addBox(0F, 0F, -2F, 7, 2, 2, 0F); // Box 260
        gunModel[78].setRotationPoint(-30F, -10.45F, -1.5F);
        gunModel[78].rotateAngleX = 0.75049158F;

        gunModel[79].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 261
        gunModel[79].setRotationPoint(-30F, -10.45F, 1.5F);
        gunModel[79].rotateAngleX = -0.75049158F;

        gunModel[80].addBox(0F, 0F, -2F, 9, 2, 2, 0F); // Box 264
        gunModel[80].setRotationPoint(-12.5F, -10.45F, -1.5F);
        gunModel[80].rotateAngleX = 0.75049158F;

        gunModel[81].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 265
        gunModel[81].setRotationPoint(-12.5F, -10.45F, 1.5F);
        gunModel[81].rotateAngleX = -0.75049158F;

        gunModel[82].addBox(0F, 0F, -2F, 5, 2, 2, 0F); // Box 266
        gunModel[82].setRotationPoint(-3.5F, -10.45F, -1.5F);
        gunModel[82].rotateAngleX = 0.75049158F;

        gunModel[83].addBox(0F, 0F, 0F, 5, 4, 3, 0F); // Box 267
        gunModel[83].setRotationPoint(-3.5F, -10.45F, -1.5F);

        gunModel[84].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 268
        gunModel[84].setRotationPoint(-3.5F, -10.45F, 1.5F);
        gunModel[84].rotateAngleX = -0.75049158F;

        gunModel[85].addBox(0F, 0F, 0F, 18, 2, 2, 0F); // Box 269
        gunModel[85].setRotationPoint(1.5F, -11.45F, 1.5F);
        gunModel[85].rotateAngleX = -0.75049158F;

        gunModel[86].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 270
        gunModel[86].setRotationPoint(1.5F, -11.45F, -1.5F);

        gunModel[87].addBox(0F, 0F, -2F, 18, 2, 2, 0F); // Box 271
        gunModel[87].setRotationPoint(1.5F, -11.45F, -1.5F);
        gunModel[87].rotateAngleX = 0.75049158F;

        gunModel[88].addBox(0F, 0F, -1F, 18, 1, 6, 0F); // Box 272
        gunModel[88].setRotationPoint(1.5F, -10.25F, -2.01F);

        gunModel[89].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 144
        gunModel[89].setRotationPoint(-10F, -10F, -1.75F);

        gunModel[90].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 145
        gunModel[90].setRotationPoint(-10F, -10F, 0.75F);

        gunModel[91].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 146
        gunModel[91].setRotationPoint(-4F, -11F, -1.75F);

        gunModel[92].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
        gunModel[92].setRotationPoint(-4F, -11F, 0.75F);

        gunModel[93].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 148
        gunModel[93].setRotationPoint(-4F, -11F, -1.75F);
        gunModel[93].rotateAngleZ = 0.26179939F;

        gunModel[94].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 149
        gunModel[94].setRotationPoint(-4F, -11F, 0.75F);
        gunModel[94].rotateAngleZ = 0.26179939F;

        gunModel[95].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 150
        gunModel[95].setRotationPoint(-10.1F, -9.8F, -1F);

        gunModel[96].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 151
        gunModel[96].setRotationPoint(-10.1F, -12.5F, -1F);
        gunModel[96].rotateAngleZ = -0.13962634F;

        gunModel[97].addBox(0F, -0.5F, 1.51F, 1, 1, 1, 0F); // Box 152
        gunModel[97].setRotationPoint(-10.1F, -12.5F, -1F);
        gunModel[97].rotateAngleZ = -0.13962634F;

        gunModel[98].addBox(0F, 0.01F, 1.5F, 4, 1, 1, 0F); // Box 153
        gunModel[98].setRotationPoint(-10.1F, -12.5F, -1F);
        gunModel[98].rotateAngleZ = -0.13962634F;

        gunModel[99].addBox(0F, 0.01F, -0.5F, 4, 1, 1, 0F); // Box 154
        gunModel[99].setRotationPoint(-10.1F, -12.5F, -1F);
        gunModel[99].rotateAngleZ = -0.13962634F;

        gunModel[100].addBox(0F, -0.5F, -0.49F, 1, 1, 1, 0F); // Box 155
        gunModel[100].setRotationPoint(-10.1F, -12.5F, -1F);
        gunModel[100].rotateAngleZ = -0.13962634F;

        gunModel[101].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 104
        gunModel[101].setRotationPoint(-0.5F, -5.5F, 2.25F);

        gunModel[102].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 105
        gunModel[102].setRotationPoint(-0.5F, -7F, 2.25F);

        gunModel[103].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 106
        gunModel[103].setRotationPoint(-0.5F, -4F, 2.25F);

        gunModel[104].addBox(0F, 0.01F, 0F, 16, 1, 1, 0F); // Box 107
        gunModel[104].setRotationPoint(-0.5F, -2.5F, 2.25F);

        gunModel[105].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 108
        gunModel[105].setRotationPoint(-0.5F, -5.5F, -3.25F);

        gunModel[106].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 109
        gunModel[106].setRotationPoint(-0.5F, -7F, -3.25F);

        gunModel[107].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 110
        gunModel[107].setRotationPoint(-0.5F, -4F, -3.25F);

        gunModel[108].addBox(0F, 0.01F, 0F, 16, 1, 1, 0F); // Box 111
        gunModel[108].setRotationPoint(-0.5F, -2.5F, -3.25F);

        gunModel[109].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 112
        gunModel[109].setRotationPoint(2.5F, -9.5F, 2.25F);

        gunModel[110].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 114
        gunModel[110].setRotationPoint(2.5F, -9.5F, -3.25F);

        gunModel[111].addBox(0F, 0F, 0F, 5, 4, 3, 0F); // Box 130
        gunModel[111].setRotationPoint(-9.5F, -10.45F, -1.5F);

        ammoModel = new ModelRendererTurbo[19];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 52
        ammoModel[2] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 54
        ammoModel[3] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 115
        ammoModel[4] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 116
        ammoModel[5] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 117
        ammoModel[6] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 118
        ammoModel[7] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 119
        ammoModel[8] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 120
        ammoModel[9] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 124
        ammoModel[10] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 125
        ammoModel[11] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 126
        ammoModel[12] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 127
        ammoModel[13] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 128
        ammoModel[14] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 129
        ammoModel[15] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 130
        ammoModel[16] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 131
        ammoModel[17] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 132
        ammoModel[18] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 133

        ammoModel[0].addBox(0F, 0F, 0F, 9, 5, 3, 0F); // Box 51
        ammoModel[0].setRotationPoint(-20.2F, -1F, -1.5F);
        ammoModel[0].rotateAngleZ = 0.08726646F;

        ammoModel[1].addBox(0F, 0F, 0F, 9, 7, 3, 0F); // Box 52
        ammoModel[1].setRotationPoint(-19.7F, 4F, -1.51F);
        ammoModel[1].rotateAngleZ = 0.43633231F;

        ammoModel[2].addBox(0F, 2.01F, 0F, 9, 8, 3, 0F); // Box 54
        ammoModel[2].setRotationPoint(-18F, 8.85F, -1.5F);
        ammoModel[2].rotateAngleZ = 0.73303829F;

        ammoModel[3].addBox(2F, 2F, 0F, 2, 8, 1, 0F); // Box 115
        ammoModel[3].setRotationPoint(-18F, 8.85F, -1.75F);
        ammoModel[3].rotateAngleZ = 0.73303829F;

        ammoModel[4].addBox(2F, 0F, 0F, 2, 7, 1, 0F); // Box 116
        ammoModel[4].setRotationPoint(-19.7F, 4F, -1.75F);
        ammoModel[4].rotateAngleZ = 0.43633231F;

        ammoModel[5].addBox(2F, 0F, 0F, 2, 5, 1, 0F); // Box 117
        ammoModel[5].setRotationPoint(-20.2F, -1F, -1.75F);
        ammoModel[5].rotateAngleZ = 0.08726646F;

        ammoModel[6].addBox(2F, 2F, 0F, 2, 8, 1, 0F); // Box 118
        ammoModel[6].setRotationPoint(-18F, 8.85F, 0.75F);
        ammoModel[6].rotateAngleZ = 0.73303829F;

        ammoModel[7].addBox(2F, 0F, 0F, 2, 7, 1, 0F); // Box 119
        ammoModel[7].setRotationPoint(-19.7F, 4F, 0.75F);
        ammoModel[7].rotateAngleZ = 0.43633231F;

        ammoModel[8].addBox(2F, 0F, 0F, 2, 5, 1, 0F); // Box 120
        ammoModel[8].setRotationPoint(-20.2F, -1F, 0.75F);
        ammoModel[8].rotateAngleZ = 0.08726646F;

        ammoModel[9].addBox(0.5F, 8.01F, 0F, 8, 1, 1, 0F); // Box 124
        ammoModel[9].setRotationPoint(-18F, 8.85F, -1.6F);
        ammoModel[9].rotateAngleZ = 0.73303829F;

        ammoModel[10].addBox(0.5F, 2.5F, 0F, 8, 1, 1, 0F); // Box 125
        ammoModel[10].setRotationPoint(-19.7F, 4F, -1.6F);
        ammoModel[10].rotateAngleZ = 0.43633231F;

        ammoModel[11].addBox(0.5F, 3F, 0F, 8, 1, 1, 0F); // Box 126
        ammoModel[11].setRotationPoint(-20.2F, -1F, -1.6F);
        ammoModel[11].rotateAngleZ = 0.08726646F;

        ammoModel[12].addBox(0.5F, 5.5F, 0F, 8, 1, 1, 0F); // Box 127
        ammoModel[12].setRotationPoint(-19.7F, 4F, -1.6F);
        ammoModel[12].rotateAngleZ = 0.43633231F;

        ammoModel[13].addBox(0.5F, 5.01F, 0F, 8, 1, 1, 0F); // Box 128
        ammoModel[13].setRotationPoint(-18F, 8.85F, -1.6F);
        ammoModel[13].rotateAngleZ = 0.73303829F;

        ammoModel[14].addBox(0.5F, 8.01F, 0F, 8, 1, 1, 0F); // Box 129
        ammoModel[14].setRotationPoint(-18F, 8.85F, 0.6F);
        ammoModel[14].rotateAngleZ = 0.73303829F;

        ammoModel[15].addBox(0.5F, 2.5F, 0F, 8, 1, 1, 0F); // Box 130
        ammoModel[15].setRotationPoint(-19.7F, 4F, 0.6F);
        ammoModel[15].rotateAngleZ = 0.43633231F;

        ammoModel[16].addBox(0.5F, 3F, 0F, 8, 1, 1, 0F); // Box 131
        ammoModel[16].setRotationPoint(-20.2F, -1F, 0.6F);
        ammoModel[16].rotateAngleZ = 0.08726646F;

        ammoModel[17].addBox(0.5F, 5.5F, 0F, 8, 1, 1, 0F); // Box 132
        ammoModel[17].setRotationPoint(-19.7F, 4F, 0.6F);
        ammoModel[17].rotateAngleZ = 0.43633231F;

        ammoModel[18].addBox(0.5F, 5.01F, 0F, 8, 1, 1, 0F); // Box 133
        ammoModel[18].setRotationPoint(-18F, 8.85F, 0.6F);
        ammoModel[18].rotateAngleZ = 0.73303829F;

        this.modelScale = 0.20F;

        translateAll = new Vector3f(30F, -19.4F, -0.15F);//forward/down/right
        thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/?

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

        flipAll();
    }
}