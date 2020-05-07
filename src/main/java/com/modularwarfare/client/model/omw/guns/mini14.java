package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;
import org.lwjgl.util.vector.Vector3f;

public class mini14 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public mini14() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[102];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
        gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 83
        gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 84
        gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 91
        gunModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 96
        gunModel[5] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 97
        gunModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 98
        gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 99
        gunModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 100
        gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 101
        gunModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 102
        gunModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
        gunModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 104
        gunModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 105
        gunModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 116
        gunModel[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 126
        gunModel[16] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 128
        gunModel[17] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 129
        gunModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
        gunModel[19] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 147
        gunModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 148
        gunModel[21] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 149
        gunModel[22] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 150
        gunModel[23] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 151
        gunModel[24] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 152
        gunModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 154
        gunModel[26] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 156
        gunModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 157
        gunModel[28] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 158
        gunModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 159
        gunModel[30] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 160
        gunModel[31] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 161
        gunModel[32] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 162
        gunModel[33] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 163
        gunModel[34] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 164
        gunModel[35] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 167
        gunModel[36] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 169
        gunModel[37] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 170
        gunModel[38] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 175
        gunModel[39] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 176
        gunModel[40] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 177
        gunModel[41] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 178
        gunModel[42] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 179
        gunModel[43] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 180
        gunModel[44] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 181
        gunModel[45] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 183
        gunModel[46] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 188
        gunModel[47] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 189
        gunModel[48] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 190
        gunModel[49] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 191
        gunModel[50] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 197
        gunModel[51] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 198
        gunModel[52] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 199
        gunModel[53] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 200
        gunModel[54] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 201
        gunModel[55] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 202
        gunModel[56] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 203
        gunModel[57] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 236
        gunModel[58] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 241
        gunModel[59] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 242
        gunModel[60] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 244
        gunModel[61] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 246
        gunModel[62] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 247
        gunModel[63] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 248
        gunModel[64] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 249
        gunModel[65] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 250
        gunModel[66] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 254
        gunModel[67] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 255
        gunModel[68] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 209
        gunModel[69] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 210
        gunModel[70] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 211
        gunModel[71] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 212
        gunModel[72] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 213
        gunModel[73] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 216
        gunModel[74] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 215
        gunModel[75] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 216
        gunModel[76] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 22
        gunModel[77] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 23
        gunModel[78] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 24
        gunModel[79] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 25
        gunModel[80] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 26
        gunModel[81] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 27
        gunModel[82] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 28
        gunModel[83] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 29
        gunModel[84] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 30
        gunModel[85] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 31
        gunModel[86] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 32
        gunModel[87] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 33
        gunModel[88] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 111
        gunModel[89] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 112
        gunModel[90] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 113
        gunModel[91] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 114
        gunModel[92] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 115
        gunModel[93] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 116
        gunModel[94] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 117
        gunModel[95] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 118
        gunModel[96] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 119
        gunModel[97] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 120
        gunModel[98] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 121
        gunModel[99] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 129
        gunModel[100] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 130
        gunModel[101] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 131

        gunModel[0].addBox(0F, 0F, 0F, 14, 6, 6, 0F); // Box 82
        gunModel[0].setRotationPoint(-39.5F, -6.5F, -3F);

        gunModel[1].addBox(0F, -3F, 0F, 16, 3, 6, 0F); // Box 83
        gunModel[1].setRotationPoint(-25.5F, -0.5F, -3F);
        gunModel[1].rotateAngleZ = 0.13962634F;

        gunModel[2].addBox(0F, 0F, 0F, 16, 5, 6, 0F); // Box 84
        gunModel[2].setRotationPoint(-25.5F, -8.5F, -3F);

        gunModel[3].addBox(0F, 0F, 0F, 14, 2, 6, 0F); // Box 91
        gunModel[3].setRotationPoint(-39.5F, -8.5F, -3F);

        gunModel[4].addBox(0F, -0.5F, 1F, 16, 1, 4, 0F); // Box 96
        gunModel[4].setRotationPoint(-25.5F, -0.5F, -3F);
        gunModel[4].rotateAngleZ = 0.13962634F;

        gunModel[5].addBox(0F, -0.5F, 1F, 15, 1, 4, 0F); // Box 97
        gunModel[5].setRotationPoint(-40F, -0.5F, -3F);

        gunModel[6].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 98
        gunModel[6].setRotationPoint(-39F, 0F, -1F);

        gunModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 99
        gunModel[7].setRotationPoint(-39F, 3F, -1F);
        gunModel[7].rotateAngleZ = 0.61086524F;

        gunModel[8].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 100
        gunModel[8].setRotationPoint(-37.9F, 3.7F, -1F);

        gunModel[9].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 101
        gunModel[9].setRotationPoint(-32.9F, 4.7F, -1F);
        gunModel[9].rotateAngleZ = 0.62831853F;

        gunModel[10].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 102
        gunModel[10].setRotationPoint(-32.25F, -0.5F, -1F);

        gunModel[11].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
        gunModel[11].setRotationPoint(-31.25F, -0.5F, -0.5F);

        gunModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 104
        gunModel[12].setRotationPoint(-31.25F, 1.5F, -0.5F);

        gunModel[13].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 105
        gunModel[13].setRotationPoint(-30.25F, -0.5F, -0.5F);

        gunModel[14].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 116
        gunModel[14].setRotationPoint(-37F, -1F, -0.5F);
        gunModel[14].rotateAngleZ = 0.2268928F;

        gunModel[15].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 126
        gunModel[15].setRotationPoint(-39.5F, -10.45F, -1.5F);

        gunModel[16].addBox(0F, 0F, -2F, 30, 1, 2, 0F); // Box 128
        gunModel[16].setRotationPoint(-39.5F, -10.45F, -1.5F);
        gunModel[16].rotateAngleX = 0.75049158F;

        gunModel[17].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 129
        gunModel[17].setRotationPoint(-13.5F, -11.5F, -1.5F);

        gunModel[18].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
        gunModel[18].setRotationPoint(-33.5F, -14.5F, 0.99F);

        gunModel[19].addBox(0F, 0F, 0F, 30, 2, 1, 0F); // Box 147
        gunModel[19].setRotationPoint(-39.5F, -10.5F, 2F);

        gunModel[20].addBox(0F, 0F, 0F, 31, 1, 5, 0F); // Box 148
        gunModel[20].setRotationPoint(-39.5F, -9.5F, -2.5F);

        gunModel[21].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 149
        gunModel[21].setRotationPoint(-17.5F, -11.5F, 2F);

        gunModel[22].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 150
        gunModel[22].setRotationPoint(-20.34F, -10.5F, 2F);
        gunModel[22].rotateAngleZ = 0.3403392F;

        gunModel[23].addBox(0F, 0F, -1F, 39, 1, 2, 0F); // Box 151
        gunModel[23].setRotationPoint(-9.5F, -8.65F, 2.5F);
        gunModel[23].rotateAngleZ = 0.03490659F;

        gunModel[24].addBox(0F, 0F, 0F, 39, 2, 2, 0F); // Box 152
        gunModel[24].setRotationPoint(-9.5F, -5F, 2.2F);
        gunModel[24].rotateAngleZ = 0.03490659F;

        gunModel[25].addBox(0F, 0F, 0F, 39, 2, 2, 0F); // Box 154
        gunModel[25].setRotationPoint(-9.5F, -3F, 1.2F);
        gunModel[25].rotateAngleZ = 0.03490659F;

        gunModel[26].addBox(0F, 0F, -1F, 39, 3, 2, 0F); // Box 156
        gunModel[26].setRotationPoint(-9.5F, -7.65F, 2.5F);
        gunModel[26].rotateAngleX = 0.2443461F;
        gunModel[26].rotateAngleZ = 0.03490659F;

        gunModel[27].addBox(0F, 0F, -2F, 39, 2, 2, 0F); // Box 157
        gunModel[27].setRotationPoint(-9.51F, -3F, 4.2F);
        gunModel[27].rotateAngleX = -0.57595865F;
        gunModel[27].rotateAngleZ = 0.03490659F;

        gunModel[28].addBox(0F, 0F, 0F, 39, 2, 3, 0F); // Box 158
        gunModel[28].setRotationPoint(-9.5F, -2.5F, -1.5F);
        gunModel[28].rotateAngleZ = 0.03490659F;

        gunModel[29].addBox(0F, 0F, 0F, 39, 1, 2, 0F); // Box 159
        gunModel[29].setRotationPoint(-9.5F, -8.65F, -3.5F);
        gunModel[29].rotateAngleZ = 0.03490659F;

        gunModel[30].addBox(0F, 0F, 0F, 39, 2, 2, 0F); // Box 160
        gunModel[30].setRotationPoint(-9.5F, -5F, -4.2F);
        gunModel[30].rotateAngleZ = 0.03490659F;

        gunModel[31].addBox(0F, 0F, 0F, 39, 2, 2, 0F); // Box 161
        gunModel[31].setRotationPoint(-9.5F, -3F, -3.2F);
        gunModel[31].rotateAngleZ = 0.03490659F;

        gunModel[32].addBox(0F, 0F, -1F, 39, 3, 2, 0F); // Box 162
        gunModel[32].setRotationPoint(-9.5F, -7.65F, -2.5F);
        gunModel[32].rotateAngleX = -0.2443461F;
        gunModel[32].rotateAngleZ = 0.03490659F;

        gunModel[33].addBox(0F, 0F, 0F, 39, 2, 2, 0F); // Box 163
        gunModel[33].setRotationPoint(-9.51F, -3F, -4.2F);
        gunModel[33].rotateAngleX = 0.57595865F;
        gunModel[33].rotateAngleZ = 0.03490659F;

        gunModel[34].addBox(0F, 0F, -1F, 23, 1, 6, 0F); // Box 164
        gunModel[34].setRotationPoint(-9.5F, -9.65F, -2F);

        gunModel[35].addBox(0F, 0F, -1F, 38, 1, 4, 0F); // Box 167
        gunModel[35].setRotationPoint(-9.5F, -11F, -1F);

        gunModel[36].addBox(0F, 0F, -1F, 38, 4, 6, 0F); // Box 169
        gunModel[36].setRotationPoint(-9.5F, -9.25F, -2.01F);

        gunModel[37].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 170
        gunModel[37].setRotationPoint(-9.5F, -12F, -0.5F);

        gunModel[38].addBox(0F, 0F, -1F, 3, 3, 3, 0F); // Box 175
        gunModel[38].setRotationPoint(10.25F, -12F, -0.5F);

        gunModel[39].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 176
        gunModel[39].setRotationPoint(16.5F, -12F, -0.5F);

        gunModel[40].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 177
        gunModel[40].setRotationPoint(20.75F, -12F, -0.5F);

        gunModel[41].addBox(0F, 0F, -1F, 1, 3, 3, 0F); // Box 178
        gunModel[41].setRotationPoint(24.75F, -12F, -0.5F);

        gunModel[42].addBox(0F, 0F, -1F, 2, 10, 3, 0F); // Box 179
        gunModel[42].setRotationPoint(28.5F, -12.5F, -0.5F);

        gunModel[43].addBox(0F, 0F, 0F, 38, 1, 3, 0F); // Box 180
        gunModel[43].setRotationPoint(-9.5F, -12.75F, -1.5F);

        gunModel[44].addBox(0F, 0F, 0F, 23, 1, 4, 0F); // Box 181
        gunModel[44].setRotationPoint(-9.5F, -12.75F, 1.5F);
        gunModel[44].rotateAngleX = -1.20427718F;

        gunModel[45].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 183
        gunModel[45].setRotationPoint(-10.5F, -12.5F, -3F);

        gunModel[46].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 188
        gunModel[46].setRotationPoint(16.5F, -12.75F, 1.5F);
        gunModel[46].rotateAngleX = -1.20427718F;

        gunModel[47].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 189
        gunModel[47].setRotationPoint(20.75F, -12.75F, 1.5F);
        gunModel[47].rotateAngleX = -1.20427718F;

        gunModel[48].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 190
        gunModel[48].setRotationPoint(24.75F, -12.75F, 1.5F);
        gunModel[48].rotateAngleX = -1.20427718F;

        gunModel[49].addBox(0F, 0F, -4F, 23, 1, 4, 0F); // Box 191
        gunModel[49].setRotationPoint(-9.5F, -12.75F, -1.5F);
        gunModel[49].rotateAngleX = 1.20427718F;

        gunModel[50].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 197
        gunModel[50].setRotationPoint(16.5F, -12.75F, -1.5F);
        gunModel[50].rotateAngleX = 1.20427718F;

        gunModel[51].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 198
        gunModel[51].setRotationPoint(20.75F, -12.75F, -1.5F);
        gunModel[51].rotateAngleX = 1.20427718F;

        gunModel[52].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 199
        gunModel[52].setRotationPoint(24.75F, -12.75F, -1.5F);
        gunModel[52].rotateAngleX = 1.20427718F;

        gunModel[53].addBox(0F, 0F, -1F, 2, 8, 1, 0F); // Box 200
        gunModel[53].setRotationPoint(28.5F, -11.5F, -1.5F);

        gunModel[54].addBox(0F, 0F, -1F, 2, 6, 1, 0F); // Box 201
        gunModel[54].setRotationPoint(28.5F, -10.5F, -2F);

        gunModel[55].addBox(0F, 0F, -1F, 2, 8, 1, 0F); // Box 202
        gunModel[55].setRotationPoint(28.5F, -11.5F, 2.5F);

        gunModel[56].addBox(0F, 0F, -1F, 2, 6, 1, 0F); // Box 203
        gunModel[56].setRotationPoint(28.5F, -10.5F, 3F);

        gunModel[57].addBox(0F, 0F, -1F, 73, 2, 2, 0F); // Box 236
        gunModel[57].setRotationPoint(-10.5F, -10.5F, 0F);

        gunModel[58].addBox(0F, 0F, -1F, 4, 3, 3, 0F); // Box 241
        gunModel[58].setRotationPoint(62.5F, -11F, -0.5F);

        gunModel[59].addBox(0F, 0F, -1F, 3, 2, 2, 0F); // Box 242
        gunModel[59].setRotationPoint(46F, -8.5F, 0F);

        gunModel[60].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 244
        gunModel[60].setRotationPoint(46F, -12.5F, 0.5F);

        gunModel[61].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Box 246
        gunModel[61].setRotationPoint(46F, -13.5F, 1.85F);
        gunModel[61].rotateAngleX = -0.08726646F;

        gunModel[62].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 247
        gunModel[62].setRotationPoint(46F, -13.5F, -1.85F);
        gunModel[62].rotateAngleX = 0.08726646F;

        gunModel[63].addBox(0F, 0F, -1.5F, 1, 2, 3, 0F); // Box 248
        gunModel[63].setRotationPoint(47F, -14.5F, 0F);

        gunModel[64].addBox(0F, 0F, -1F, 11, 1, 3, 0F); // Box 249
        gunModel[64].setRotationPoint(66.5F, -11F, -0.5F);

        gunModel[65].addBox(0F, 0F, -1F, 11, 1, 3, 0F); // Box 250
        gunModel[65].setRotationPoint(66.5F, -9F, -0.5F);

        gunModel[66].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 254
        gunModel[66].setRotationPoint(66.5F, -10F, -1.5F);

        gunModel[67].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 255
        gunModel[67].setRotationPoint(66.5F, -10F, 0.5F);

        gunModel[68].addBox(0F, 0F, 0F, 10, 2, 5, 0F); // Box 209
        gunModel[68].setRotationPoint(-24F, -3.75F, -2.5F);
        gunModel[68].rotateAngleZ = 0.12217305F;

        gunModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 210
        gunModel[69].setRotationPoint(77.5F, -11F, -0.5F);

        gunModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211
        gunModel[70].setRotationPoint(77.5F, -9F, -0.5F);

        gunModel[71].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 212
        gunModel[71].setRotationPoint(76.5F, -10F, 0.5F);

        gunModel[72].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 213
        gunModel[72].setRotationPoint(76.5F, -10F, -1.5F);

        gunModel[73].addBox(0F, 0F, -1F, 1, 7, 3, 0F); // Box 216
        gunModel[73].setRotationPoint(30.5F, -11.25F, -0.5F);

        gunModel[74].addBox(0F, 0F, -4F, 15, 1, 2, 0F); // Box 215
        gunModel[74].setRotationPoint(13.5F, -12.75F, -1.5F);
        gunModel[74].rotateAngleX = 1.20427718F;

        gunModel[75].addBox(0F, 0F, 2F, 15, 1, 2, 0F); // Box 216
        gunModel[75].setRotationPoint(13.5F, -12.75F, 1.5F);
        gunModel[75].rotateAngleX = -1.20427718F;

        gunModel[76].addBox(0F, -6F, 0F, 15, 6, 6, 0F); // Box 22
        gunModel[76].setRotationPoint(-52F, 8F, -3F);
        gunModel[76].rotateAngleZ = 0.61086524F;

        gunModel[77].addBox(-2F, -5F, 0F, 15, 5, 6, 0F); // Box 23
        gunModel[77].setRotationPoint(-51F, 1F, -3F);
        gunModel[77].rotateAngleZ = 0.08290314F;

        gunModel[78].addBox(0F, -5F, 0F, 14, 5, 6, 0F); // Box 24
        gunModel[78].setRotationPoint(-50F, 0.85F, -3F);
        gunModel[78].rotateAngleZ = 0.41887902F;

        gunModel[79].addBox(0F, -5F, 0.02F, 3, 11, 6, 0F); // Box 25
        gunModel[79].setRotationPoint(-55F, 2F, -3F);

        gunModel[80].addBox(-8F, -5F, -0.01F, 8, 4, 6, 0F); // Box 26
        gunModel[80].setRotationPoint(-53F, 1F, -3F);
        gunModel[80].rotateAngleZ = -0.37088247F;

        gunModel[81].addBox(-8F, -5F, 0F, 8, 4, 6, 0F); // Box 27
        gunModel[81].setRotationPoint(-58.6F, -1.55F, -3F);

        gunModel[82].addBox(-37.5F, -4F, 0F, 31, 12, 6, 0F); // Box 28
        gunModel[82].setRotationPoint(-58.9F, -3.15F, -3F);
        gunModel[82].rotateAngleZ = 0.08726646F;

        gunModel[83].addBox(0.5F, 0F, 0.01F, 11, 9, 6, 0F); // Box 29
        gunModel[83].setRotationPoint(-66.5F, -2.55F, -3F);

        gunModel[84].addBox(0F, -5F, 0F, 3, 5, 6, 0F); // Box 30
        gunModel[84].setRotationPoint(-55F, 8F, -3F);
        gunModel[84].rotateAngleZ = 1.25663706F;

        gunModel[85].addBox(-1F, -46F, -0.02F, 5, 42, 6, 0F); // Box 31
        gunModel[85].setRotationPoint(-51.4F, 1.4F, -3F);
        gunModel[85].rotateAngleZ = 1.90240888F;

        gunModel[86].addBox(0F, 0F, 0F, 4, 22, 7, 0F); // Box 32
        gunModel[86].setRotationPoint(-100.4F, -4.1F, -3.5F);
        gunModel[86].rotateAngleZ = 0.08726646F;

        gunModel[87].addBox(-1F, 1.25F, 0F, 18, 6, 6, 0F); // Box 33
        gunModel[87].setRotationPoint(-95.4F, 6.85F, -3F);
        gunModel[87].rotateAngleZ = 0.26179939F;

        gunModel[88].addBox(0F, 0F, -2F, 30, 2, 2, 0F); // Box 111
        gunModel[88].setRotationPoint(-39.51F, -3F, 4.21F);
        gunModel[88].rotateAngleX = -0.57595865F;

        gunModel[89].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 112
        gunModel[89].setRotationPoint(-39.5F, -5F, 2.21F);

        gunModel[90].addBox(0F, 0F, -1F, 30, 3, 2, 0F); // Box 113
        gunModel[90].setRotationPoint(-39.5F, -7.65F, 2.51F);
        gunModel[90].rotateAngleX = 0.2443461F;

        gunModel[91].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 114
        gunModel[91].setRotationPoint(-39.5F, -3F, 1.21F);

        gunModel[92].addBox(0F, 0F, 0F, 30, 2, 3, 0F); // Box 115
        gunModel[92].setRotationPoint(-39.5F, -2.5F, -1.5F);

        gunModel[93].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 116
        gunModel[93].setRotationPoint(-39.5F, -3F, -3.19F);

        gunModel[94].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 117
        gunModel[94].setRotationPoint(-39.51F, -3F, -4.19F);
        gunModel[94].rotateAngleX = 0.57595865F;

        gunModel[95].addBox(0F, 0F, 0F, 30, 2, 2, 0F); // Box 118
        gunModel[95].setRotationPoint(-39.5F, -5F, -4.19F);

        gunModel[96].addBox(0F, 0F, -1F, 30, 3, 2, 0F); // Box 119
        gunModel[96].setRotationPoint(-39.5F, -7.65F, -2.49F);
        gunModel[96].rotateAngleX = -0.2443461F;

        gunModel[97].addBox(0F, 0F, 0F, 30, 1, 2, 0F); // Box 120
        gunModel[97].setRotationPoint(-39.5F, -8.65F, -3.49F);

        gunModel[98].addBox(0F, 0F, -1F, 30, 1, 2, 0F); // Box 121
        gunModel[98].setRotationPoint(-39.5F, -8.65F, 2.51F);

        gunModel[99].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 129
        gunModel[99].setRotationPoint(46F, -11.5F, 0.5F);

        gunModel[100].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // Box 130
        gunModel[100].setRotationPoint(46F, -13.5F, -1.86F);
        gunModel[100].rotateAngleX = 0.08726646F;

        gunModel[101].addBox(0F, -1F, -1F, 3, 3, 1, 0F); // Box 131
        gunModel[101].setRotationPoint(46F, -13.5F, 1.84F);
        gunModel[101].rotateAngleX = -0.08726646F;


        defaultScopeModel = new ModelRendererTurbo[16];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 130
        defaultScopeModel[1] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 131
        defaultScopeModel[2] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 132
        defaultScopeModel[3] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 133
        defaultScopeModel[4] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 134
        defaultScopeModel[5] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 135
        defaultScopeModel[6] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 137
        defaultScopeModel[7] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 138
        defaultScopeModel[8] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 139
        defaultScopeModel[9] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 140
        defaultScopeModel[10] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 141
        defaultScopeModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 142
        defaultScopeModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 143
        defaultScopeModel[13] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 144
        defaultScopeModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 145
        defaultScopeModel[15] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 146

        defaultScopeModel[0].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 130
        defaultScopeModel[0].setRotationPoint(-33.1F, -13.1F, -2F);

        defaultScopeModel[1].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
        defaultScopeModel[1].setRotationPoint(-33.5F, -14.5F, -1.99F);

        defaultScopeModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 132
        defaultScopeModel[2].setRotationPoint(-31.5F, -14.5F, -2.01F);
        defaultScopeModel[2].rotateAngleZ = -0.78539816F;

        defaultScopeModel[3].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 133
        defaultScopeModel[3].setRotationPoint(-33.5F, -14.5F, -2.01F);
        defaultScopeModel[3].rotateAngleZ = 0.78539816F;

        defaultScopeModel[4].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 134
        defaultScopeModel[4].setRotationPoint(-34.9F, -13.1F, -2.02F);

        defaultScopeModel[5].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 135
        defaultScopeModel[5].setRotationPoint(-33.1F, -13.1F, 1F);

        defaultScopeModel[6].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 137
        defaultScopeModel[6].setRotationPoint(-31.5F, -14.5F, 1.01F);
        defaultScopeModel[6].rotateAngleZ = -0.78539816F;

        defaultScopeModel[7].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 138
        defaultScopeModel[7].setRotationPoint(-33.5F, -14.5F, 1.01F);
        defaultScopeModel[7].rotateAngleZ = 0.78539816F;

        defaultScopeModel[8].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 139
        defaultScopeModel[8].setRotationPoint(-34.9F, -13.1F, 1.02F);

        defaultScopeModel[9].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 140
        defaultScopeModel[9].setRotationPoint(-33.6F, -12.5F, -2.98F);

        defaultScopeModel[10].addBox(0F, -1F, -1F, 1, 4, 4, 0F); // Box 141
        defaultScopeModel[10].setRotationPoint(-32.9F, -14F, -0.97F);

        defaultScopeModel[11].addBox(0F, 0F, 0F, 7, 2, 4, 0F); // Box 142
        defaultScopeModel[11].setRotationPoint(-32.1F, -11.5F, -2.01F);

        defaultScopeModel[12].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 143
        defaultScopeModel[12].setRotationPoint(-32.1F, -12.5F, -2F);
        defaultScopeModel[12].rotateAngleZ = -0.15707963F;

        defaultScopeModel[13].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 144
        defaultScopeModel[13].setRotationPoint(-26.9F, -12.5F, -1.5F);

        defaultScopeModel[14].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 145
        defaultScopeModel[14].setRotationPoint(-27.1F, -11.5F, -1.5F);
        defaultScopeModel[14].rotateAngleZ = 0.31415927F;

        defaultScopeModel[15].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 146
        defaultScopeModel[15].setRotationPoint(-27.9F, -12.8F, -1.5F);

        ammoModel = new ModelRendererTurbo[14];
        ammoModel[0] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 117
        ammoModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 118
        ammoModel[2] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 119
        ammoModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 120
        ammoModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 121
        ammoModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 122
        ammoModel[6] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 123
        ammoModel[7] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 122
        ammoModel[8] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 123
        ammoModel[9] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 124
        ammoModel[10] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 125
        ammoModel[11] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 126
        ammoModel[12] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 127
        ammoModel[13] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 128

        ammoModel[0].addBox(0F, -0.5F, 1F, 11, 12, 2, 0F); // Box 117
        ammoModel[0].setRotationPoint(-24.5F, -3.5F, -2.01F);
        ammoModel[0].rotateAngleZ = 0.08726646F;

        ammoModel[1].addBox(0F, -0.5F, 1F, 2, 12, 1, 0F); // Box 118
        ammoModel[1].setRotationPoint(-24.51F, -3.5F, -2.49F);
        ammoModel[1].rotateAngleZ = 0.08726646F;

        ammoModel[2].addBox(3F, -0.5F, 1F, 4, 12, 1, 0F); // Box 119
        ammoModel[2].setRotationPoint(-24.5F, -3.5F, -2.49F);
        ammoModel[2].rotateAngleZ = 0.08726646F;

        ammoModel[3].addBox(8F, -0.5F, 1F, 3, 12, 1, 0F); // Box 120
        ammoModel[3].setRotationPoint(-24.49F, -3.5F, -2.49F);
        ammoModel[3].rotateAngleZ = 0.08726646F;

        ammoModel[4].addBox(0F, -0.5F, 1F, 2, 12, 1, 0F); // Box 121
        ammoModel[4].setRotationPoint(-24.51F, -3.5F, -0.51F);
        ammoModel[4].rotateAngleZ = 0.08726646F;

        ammoModel[5].addBox(3F, -0.5F, 1F, 4, 12, 1, 0F); // Box 122
        ammoModel[5].setRotationPoint(-24.5F, -3.5F, -0.51F);
        ammoModel[5].rotateAngleZ = 0.08726646F;

        ammoModel[6].addBox(8F, -0.5F, 1F, 3, 12, 1, 0F); // Box 123
        ammoModel[6].setRotationPoint(-24.49F, -3.5F, -0.51F);
        ammoModel[6].rotateAngleZ = 0.08726646F;

        ammoModel[7].addBox(3F, -0.5F, 1F, 4, 8, 1, 0F); // Box 122
        ammoModel[7].setRotationPoint(-23.47F, 8.48F, -2.5F);
        ammoModel[7].rotateAngleZ = 0.17453293F;

        ammoModel[8].addBox(8F, -0.5F, 1F, 3, 8, 1, 0F); // Box 123
        ammoModel[8].setRotationPoint(-23.46F, 8.48F, -2.5F);
        ammoModel[8].rotateAngleZ = 0.17453293F;

        ammoModel[9].addBox(0F, -0.5F, 1F, 2, 8, 1, 0F); // Box 124
        ammoModel[9].setRotationPoint(-23.48F, 8.48F, -2.5F);
        ammoModel[9].rotateAngleZ = 0.17453293F;

        ammoModel[10].addBox(0F, -0.5F, 1F, 11, 8, 2, 0F); // Box 125
        ammoModel[10].setRotationPoint(-23.47F, 8.48F, -2F);
        ammoModel[10].rotateAngleZ = 0.17453293F;

        ammoModel[11].addBox(0F, -0.5F, 1F, 2, 8, 1, 0F); // Box 126
        ammoModel[11].setRotationPoint(-23.48F, 8.48F, -0.5F);
        ammoModel[11].rotateAngleZ = 0.17453293F;

        ammoModel[12].addBox(3F, -0.5F, 1F, 4, 8, 1, 0F); // Box 127
        ammoModel[12].setRotationPoint(-23.47F, 8.48F, -0.5F);
        ammoModel[12].rotateAngleZ = 0.17453293F;

        ammoModel[13].addBox(8F, -0.5F, 1F, 3, 8, 1, 0F); // Box 128
        ammoModel[13].setRotationPoint(-23.46F, 8.48F, -0.5F);
        ammoModel[13].rotateAngleZ = 0.17453293F;


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