package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class akm extends ModelGun {
    public int textureX = 256;
    public int textureY = 256;

    public akm() {
        gunModel = new ModelRendererTurbo[112];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 236
        gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 14
        gunModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
        gunModel[16] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 16
        gunModel[17] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 23
        gunModel[18] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 24
        gunModel[19] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 25
        gunModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 26
        gunModel[21] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 27
        gunModel[22] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 28
        gunModel[23] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 29
        gunModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 30
        gunModel[25] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 31
        gunModel[26] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 32
        gunModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
        gunModel[28] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 34
        gunModel[29] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 35
        gunModel[30] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 36
        gunModel[31] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 37
        gunModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
        gunModel[33] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 39
        gunModel[34] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 40
        gunModel[35] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 41
        gunModel[36] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 42
        gunModel[37] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
        gunModel[38] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 44
        gunModel[39] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 46
        gunModel[40] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 47
        gunModel[41] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 48
        gunModel[42] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 49
        gunModel[43] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 50
        gunModel[44] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 97
        gunModel[45] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 98
        gunModel[46] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 99
        gunModel[47] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 100
        gunModel[48] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 101
        gunModel[49] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 102
        gunModel[50] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 103
        gunModel[51] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 104
        gunModel[52] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 105
        gunModel[53] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 106
        gunModel[54] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 107
        gunModel[55] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 108
        gunModel[56] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 109
        gunModel[57] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 110
        gunModel[58] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 111
        gunModel[59] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 112
        gunModel[60] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 113
        gunModel[61] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 114
        gunModel[62] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 115
        gunModel[63] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 116
        gunModel[64] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 117
        gunModel[65] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 119
        gunModel[66] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 120
        gunModel[67] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 121
        gunModel[68] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 122
        gunModel[69] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 123
        gunModel[70] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 124
        gunModel[71] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 125
        gunModel[72] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 126
        gunModel[73] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 127
        gunModel[74] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 128
        gunModel[75] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 129
        gunModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
        gunModel[77] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 131
        gunModel[78] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 132
        gunModel[79] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 133
        gunModel[80] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 134
        gunModel[81] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 135
        gunModel[82] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 136
        gunModel[83] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 137
        gunModel[84] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 138
        gunModel[85] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 139
        gunModel[86] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 140
        gunModel[87] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 141
        gunModel[88] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 142
        gunModel[89] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 143
        gunModel[90] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 144
        gunModel[91] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 145
        gunModel[92] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 146
        gunModel[93] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 147
        gunModel[94] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 148
        gunModel[95] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 149
        gunModel[96] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 150
        gunModel[97] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 151
        gunModel[98] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 152
        gunModel[99] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 153
        gunModel[100] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 154
        gunModel[101] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 155
        gunModel[102] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 156
        gunModel[103] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 157
        gunModel[104] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 158
        gunModel[105] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 159
        gunModel[106] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 161
        gunModel[107] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 162
        gunModel[108] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 163
        gunModel[109] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 164
        gunModel[110] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 165
        gunModel[111] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 166

        gunModel[0].addBox(0F, 0F, -1.01F, 32, 2, 2, 0F); // Box 236
        gunModel[0].setRotationPoint(30.5F, -11F, 0F);

        gunModel[1].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 1
        gunModel[1].setRotationPoint(27.5F, -12.5F, -2.5F);

        gunModel[2].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 2
        gunModel[2].setRotationPoint(14.5F, -16.5F, -1F);

        gunModel[3].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 3
        gunModel[3].setRotationPoint(14.5F, -16.5F, 1F);
        gunModel[3].rotateAngleX = -0.57595865F;

        gunModel[4].addBox(0F, 0F, -1F, 16, 1, 1, 0F); // Box 4
        gunModel[4].setRotationPoint(14.5F, -16.5F, -1F);
        gunModel[4].rotateAngleX = 0.57595865F;

        gunModel[5].addBox(0F, -1F, 0F, 9, 1, 2, 0F); // Box 5
        gunModel[5].setRotationPoint(21.5F, -6.5F, 1F);
        gunModel[5].rotateAngleX = 0.57595865F;

        gunModel[6].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 6
        gunModel[6].setRotationPoint(21.5F, -7.5F, -1F);

        gunModel[7].addBox(0F, -1F, -2F, 9, 1, 2, 0F); // Box 7
        gunModel[7].setRotationPoint(21.5F, -6.5F, -1F);
        gunModel[7].rotateAngleX = -0.57595865F;

        gunModel[8].addBox(0F, -1F, -2F, 4, 1, 2, 0F); // Box 8
        gunModel[8].setRotationPoint(7.5F, -6F, -1F);
        gunModel[8].rotateAngleX = -0.57595865F;

        gunModel[9].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 9
        gunModel[9].setRotationPoint(7.5F, -7F, -1F);

        gunModel[10].addBox(0F, -1F, 0F, 4, 1, 2, 0F); // Box 10
        gunModel[10].setRotationPoint(7.5F, -6F, 1F);
        gunModel[10].rotateAngleX = 0.57595865F;

        gunModel[11].addBox(0F, -1F, -2F, 5, 1, 2, 0F); // Box 11
        gunModel[11].setRotationPoint(14.5F, -7.5F, -1F);
        gunModel[11].rotateAngleX = -0.57595865F;

        gunModel[12].addBox(0F, -1F, 0F, 5, 1, 2, 0F); // Box 12
        gunModel[12].setRotationPoint(14.5F, -7.5F, -1F);

        gunModel[13].addBox(0F, -1F, 0F, 5, 1, 2, 0F); // Box 13
        gunModel[13].setRotationPoint(14.5F, -7.5F, 1F);
        gunModel[13].rotateAngleX = 0.57595865F;

        gunModel[14].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 14
        gunModel[14].setRotationPoint(14.5F, -16F, -2F);

        gunModel[15].addBox(0F, 0F, 0F, 25, 4, 5, 0F); // Box 15
        gunModel[15].setRotationPoint(2.5F, -12.5F, -2.5F);

        gunModel[16].addBox(0F, 0F, 0F, 6, 1, 5, 0F); // Box 16
        gunModel[16].setRotationPoint(21.5F, -8.5F, -2.5F);

        gunModel[17].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 23
        gunModel[17].setRotationPoint(20.5F, -13.5F, -2.01F);

        gunModel[18].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 24
        gunModel[18].setRotationPoint(19.5F, -7F, 1F);
        gunModel[18].rotateAngleX = 0.57595865F;

        gunModel[19].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 25
        gunModel[19].setRotationPoint(19.5F, -8F, -1F);

        gunModel[20].addBox(0F, -1F, -2F, 2, 1, 2, 0F); // Box 26
        gunModel[20].setRotationPoint(19.5F, -7F, -1F);
        gunModel[20].rotateAngleX = -0.57595865F;

        gunModel[21].addBox(0F, -1F, 0F, 3, 1, 2, 0F); // Box 27
        gunModel[21].setRotationPoint(11.5F, -7F, 1F);
        gunModel[21].rotateAngleX = 0.57595865F;

        gunModel[22].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 28
        gunModel[22].setRotationPoint(11.5F, -8F, -1F);

        gunModel[23].addBox(0F, -1F, -2F, 3, 1, 2, 0F); // Box 29
        gunModel[23].setRotationPoint(11.5F, -7F, -1F);
        gunModel[23].rotateAngleX = -0.57595865F;

        gunModel[24].addBox(0F, 0F, 0F, 9, 1, 5, 0F); // Box 30
        gunModel[24].setRotationPoint(2.5F, -8.5F, -2.5F);

        gunModel[25].addBox(0F, 0F, 0F, 12, 4, 4, 0F); // Box 31
        gunModel[25].setRotationPoint(2.5F, -16.5F, -2F);

        gunModel[26].addBox(0F, 0F, -1F, 12, 3, 2, 0F); // Box 32
        gunModel[26].setRotationPoint(30.5F, -15.5F, 0.01F);

        gunModel[27].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 33
        gunModel[27].setRotationPoint(2.5F, -7.5F, -2.5F);

        gunModel[28].addBox(0F, 0F, 0F, 20, 3, 5, 0F); // Box 34
        gunModel[28].setRotationPoint(-29.5F, -14.5F, -2.51F);

        gunModel[29].addBox(0F, 0F, 0F, 32, 1, 5, 0F); // Box 35
        gunModel[29].setRotationPoint(-29.5F, -15.5F, -2.5F);

        gunModel[30].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 36
        gunModel[30].setRotationPoint(-29.5F, -16.5F, -1.5F);

        gunModel[31].addBox(0F, 0F, -2F, 32, 1, 2, 0F); // Box 37
        gunModel[31].setRotationPoint(-29.5F, -16.5F, -1.5F);
        gunModel[31].rotateAngleX = 1.06465084F;

        gunModel[32].addBox(0F, 0F, 0F, 32, 1, 2, 0F); // Box 38
        gunModel[32].setRotationPoint(-29.5F, -16.5F, 1.5F);
        gunModel[32].rotateAngleX = -1.06465084F;

        gunModel[33].addBox(0F, 0F, 0F, 36, 6, 5, 0F); // Box 39
        gunModel[33].setRotationPoint(-33.5F, -12F, -2.5F);
        gunModel[33].rotateAngleZ = 0.01745329F;

        gunModel[34].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 40
        gunModel[34].setRotationPoint(-9.5F, -14.5F, -2.5F);

        gunModel[35].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 41
        gunModel[35].setRotationPoint(-9.5F, -13.5F, 1.5F);
        gunModel[35].rotateAngleX = -1.20427718F;

        gunModel[36].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 42
        gunModel[36].setRotationPoint(-33F, -14.5F, -2.52F);
        gunModel[36].rotateAngleZ = 0.27925268F;

        gunModel[37].addBox(0F, 0F, 0F, 16, 1, 4, 0F); // Box 43
        gunModel[37].setRotationPoint(14.5F, -14F, -2F);

        gunModel[38].addBox(0F, 0F, -1F, 30, 1, 1, 0F); // Box 44
        gunModel[38].setRotationPoint(30.5F, -8.25F, 0.5F);

        gunModel[39].addBox(0F, 0F, -2F, 3, 1, 2, 0F); // Box 46
        gunModel[39].setRotationPoint(-32.05F, -14.9F, -1.5F);
        gunModel[39].rotateAngleX = 1.06465084F;
        gunModel[39].rotateAngleZ = 0.55850536F;

        gunModel[40].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 47
        gunModel[40].setRotationPoint(-32.05F, -14.9F, -1.5F);
        gunModel[40].rotateAngleZ = 0.55850536F;

        gunModel[41].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 48
        gunModel[41].setRotationPoint(-32.05F, -14.9F, 1.5F);
        gunModel[41].rotateAngleX = -1.06465084F;
        gunModel[41].rotateAngleZ = 0.55850536F;

        gunModel[42].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 49
        gunModel[42].setRotationPoint(2.5F, -12.5F, -2.5F);
        gunModel[42].rotateAngleX = 0.90757121F;

        gunModel[43].addBox(0F, 0F, -1F, 12, 1, 1, 0F); // Box 50
        gunModel[43].setRotationPoint(2.5F, -12.5F, 2.5F);
        gunModel[43].rotateAngleX = -0.90757121F;

        gunModel[44].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 97
        gunModel[44].setRotationPoint(-15F, -7F, -1F);

        gunModel[45].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 98
        gunModel[45].setRotationPoint(-15F, -4F, -1F);

        gunModel[46].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 99
        gunModel[46].setRotationPoint(-12.55F, -5F, -1F);
        gunModel[46].rotateAngleZ = -0.40142573F;

        gunModel[47].addBox(0F, 0F, -1F, 2, 7, 2, 0F); // Box 100
        gunModel[47].setRotationPoint(41.1F, -14.1F, 0F);
        gunModel[47].rotateAngleZ = 0.76794487F;

        gunModel[48].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 101
        gunModel[48].setRotationPoint(-22F, -2F, -0.5F);

        gunModel[49].addBox(0F, -1F, 0F, 2, 1, 1, 0F); // Box 102
        gunModel[49].setRotationPoint(-15F, -1F, -0.5F);
        gunModel[49].rotateAngleZ = 0.78539816F;

        gunModel[50].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 103
        gunModel[50].setRotationPoint(-33.5F, -13F, -2.5F);
        gunModel[50].rotateAngleZ = 0.01745329F;

        gunModel[51].addBox(-2F, -1F, 0F, 2, 1, 1, 0F); // Box 104
        gunModel[51].setRotationPoint(-22F, -1F, -0.5F);
        gunModel[51].rotateAngleZ = -0.78539816F;

        gunModel[52].addBox(-2F, -1F, 0F, 1, 4, 1, 0F); // Box 105
        gunModel[52].setRotationPoint(-21.5F, -5.5F, -0.5F);

        gunModel[53].addBox(-2F, -1F, 0F, 1, 5, 1, 0F); // Box 106
        gunModel[53].setRotationPoint(-19.5F, -7F, -0.5F);
        gunModel[53].rotateAngleZ = 0.38397244F;

        gunModel[54].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 107
        gunModel[54].setRotationPoint(-32.5F, -7F, -2F);

        gunModel[55].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 108
        gunModel[55].setRotationPoint(-31.5F, -5F, -2.01F);

        gunModel[56].addBox(0F, -1F, 0F, 6, 10, 4, 0F); // Box 109
        gunModel[56].setRotationPoint(-30F, -5F, -1.99F);
        gunModel[56].rotateAngleZ = -0.57595865F;

        gunModel[57].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 110
        gunModel[57].setRotationPoint(-34.8F, 3F, -2F);

        gunModel[58].addBox(0F, -1F, 0F, 3, 4, 4, 0F); // Box 111
        gunModel[58].setRotationPoint(-35F, 2.6F, -2.01F);
        gunModel[58].rotateAngleZ = -0.75049158F;

        gunModel[59].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 112
        gunModel[59].setRotationPoint(-37.3F, 5F, -1.99F);
        gunModel[59].rotateAngleZ = 0.71558499F;

        gunModel[60].addBox(0F, 0F, 0F, 2, 7, 5, 0F); // Box 113
        gunModel[60].setRotationPoint(-35F, -13F, -2.51F);

        gunModel[61].addBox(0F, 0F, 0F, 5, 17, 5, 0F); // Box 114
        gunModel[61].setRotationPoint(-70F, -11F, -2.49F);

        gunModel[62].addBox(0F, 0F, 0F, 23, 11, 5, 0F); // Box 115
        gunModel[62].setRotationPoint(-69F, -11F, -2.51F);
        gunModel[62].rotateAngleZ = 0.06981317F;

        gunModel[63].addBox(0F, -5F, 0F, 36, 5, 5, 0F); // Box 116
        gunModel[63].setRotationPoint(-68F, 6F, -2.5F);
        gunModel[63].rotateAngleZ = 0.33161256F;

        gunModel[64].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 117
        gunModel[64].setRotationPoint(-46F, -12.58F, -2.49F);
        gunModel[64].rotateAngleZ = -0.50614548F;

        gunModel[65].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 119
        gunModel[65].setRotationPoint(-46F, -10F, -2.51F);
        gunModel[65].rotateAngleZ = 0.2443461F;

        gunModel[66].addBox(0F, 0F, -1.01F, 1, 9, 3, 0F); // Box 120
        gunModel[66].setRotationPoint(30.5F, -16F, -0.5F);

        gunModel[67].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 121
        gunModel[67].setRotationPoint(27.5F, -13F, -2F);

        gunModel[68].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 122
        gunModel[68].setRotationPoint(14.5F, -13F, -2F);

        gunModel[69].addBox(0F, 0F, -1.01F, 1, 6, 1, 0F); // Box 123
        gunModel[69].setRotationPoint(57.5F, -16F, 0.5F);
        gunModel[69].rotateAngleZ = -0.34906585F;

        gunModel[70].addBox(0F, 0F, -1.01F, 1, 4, 1, 0F); // Box 124
        gunModel[70].setRotationPoint(59.5F, -14F, 0.5F);

        gunModel[71].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Box 125
        gunModel[71].setRotationPoint(57.5F, -16F, 0.5F);

        gunModel[72].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 126
        gunModel[72].setRotationPoint(57.5F, -18F, 2F);

        gunModel[73].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 127
        gunModel[73].setRotationPoint(57.5F, -18F, -1F);

        gunModel[74].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 128
        gunModel[74].setRotationPoint(57.5F, -17F, -2F);
        gunModel[74].rotateAngleX = 0.52359878F;

        gunModel[75].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Box 129
        gunModel[75].setRotationPoint(57.5F, -17F, 2F);
        gunModel[75].rotateAngleX = -0.50614548F;

        gunModel[76].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 130
        gunModel[76].setRotationPoint(58.5F, -17.5F, 0.5F);

        gunModel[77].addBox(0F, 0F, 0F, 3, 5, 3, 0F); // Box 131
        gunModel[77].setRotationPoint(56.5F, -11.5F, -1.5F);

        gunModel[78].addBox(0F, 0F, -1.01F, 4, 2, 2, 0F); // Box 132
        gunModel[78].setRotationPoint(62.5F, -11.25F, 0.25F);

        gunModel[79].addBox(0F, 0F, -1.01F, 4, 2, 2, 0F); // Box 133
        gunModel[79].setRotationPoint(62.5F, -10.75F, 0.25F);

        gunModel[80].addBox(0F, 0F, -1.01F, 4, 2, 2, 0F); // Box 134
        gunModel[80].setRotationPoint(62.5F, -10.75F, -0.25F);

        gunModel[81].addBox(0F, 0F, -1.01F, 4, 2, 2, 0F); // Box 135
        gunModel[81].setRotationPoint(62.5F, -11.25F, -0.25F);

        gunModel[82].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 136
        gunModel[82].setRotationPoint(43.5F, -11.5F, -1.5F);

        gunModel[83].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 137
        gunModel[83].setRotationPoint(45.5F, -9F, -1F);

        gunModel[84].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 138
        gunModel[84].setRotationPoint(-22.5F, -16.75F, -1.5F);

        gunModel[85].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 139
        gunModel[85].setRotationPoint(-22.5F, -16.75F, -1.5F);
        gunModel[85].rotateAngleX = 1.06465084F;

        gunModel[86].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 140
        gunModel[86].setRotationPoint(-22.5F, -16.75F, 1.5F);
        gunModel[86].rotateAngleX = -1.06465084F;

        gunModel[87].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 141
        gunModel[87].setRotationPoint(-12.5F, -16.75F, -1.5F);

        gunModel[88].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 142
        gunModel[88].setRotationPoint(-12.5F, -16.75F, -1.5F);
        gunModel[88].rotateAngleX = 1.06465084F;

        gunModel[89].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 143
        gunModel[89].setRotationPoint(-12.5F, -16.75F, 1.5F);
        gunModel[89].rotateAngleX = -1.06465084F;

        gunModel[90].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 144
        gunModel[90].setRotationPoint(3F, -17.5F, -1.75F);

        gunModel[91].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 145
        gunModel[91].setRotationPoint(3F, -17.5F, 0.75F);

        gunModel[92].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 146
        gunModel[92].setRotationPoint(9F, -18.5F, -1.75F);

        gunModel[93].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
        gunModel[93].setRotationPoint(9F, -18.5F, 0.75F);

        gunModel[94].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 148
        gunModel[94].setRotationPoint(9F, -18.5F, -1.75F);
        gunModel[94].rotateAngleZ = 0.26179939F;

        gunModel[95].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 149
        gunModel[95].setRotationPoint(9F, -18.5F, 0.75F);
        gunModel[95].rotateAngleZ = 0.26179939F;

        gunModel[96].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 150
        gunModel[96].setRotationPoint(2.9F, -17.3F, -1F);

        gunModel[97].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 151
        gunModel[97].setRotationPoint(2.9F, -19F, -1F);
        gunModel[97].rotateAngleZ = -0.08726646F;

        gunModel[98].addBox(0F, -0.5F, 1.51F, 1, 1, 1, 0F); // Box 152
        gunModel[98].setRotationPoint(2.9F, -19F, -1F);
        gunModel[98].rotateAngleZ = -0.08726646F;

        gunModel[99].addBox(0F, 0.01F, 1.5F, 4, 1, 1, 0F); // Box 153
        gunModel[99].setRotationPoint(2.9F, -19F, -1F);
        gunModel[99].rotateAngleZ = -0.08726646F;

        gunModel[100].addBox(0F, 0.01F, -0.5F, 4, 1, 1, 0F); // Box 154
        gunModel[100].setRotationPoint(2.9F, -19F, -1F);
        gunModel[100].rotateAngleZ = -0.08726646F;

        gunModel[101].addBox(0F, -0.5F, -0.49F, 1, 1, 1, 0F); // Box 155
        gunModel[101].setRotationPoint(2.9F, -19F, -1F);
        gunModel[101].rotateAngleZ = -0.08726646F;

        gunModel[102].addBox(0F, -5F, 0F, 1, 1, 3, 0F); // Box 156
        gunModel[102].setRotationPoint(-58F, 7F, -1.51F);

        gunModel[103].addBox(0F, -5F, 0F, 1, 1, 3, 0F); // Box 157
        gunModel[103].setRotationPoint(-58F, 9F, -1.51F);

        gunModel[104].addBox(0F, -5F, 0F, 1, 1, 1, 0F); // Box 158
        gunModel[104].setRotationPoint(-58F, 8F, -1.51F);

        gunModel[105].addBox(0F, -5F, 0F, 1, 1, 1, 0F); // Box 159
        gunModel[105].setRotationPoint(-58F, 8F, 0.51F);

        gunModel[106].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 161
        gunModel[106].setRotationPoint(-29.5F, -11F, -3F);
        gunModel[106].rotateAngleZ = 0.15707963F;

        gunModel[107].addBox(5F, 0F, 0F, 5, 2, 1, 0F); // Box 162
        gunModel[107].setRotationPoint(-29.5F, -11F, -3F);
        gunModel[107].rotateAngleZ = 0.15707963F;

        gunModel[108].addBox(0.5F, 1.5F, 0F, 1, 1, 1, 0F); // Box 163
        gunModel[108].setRotationPoint(-29.5F, -11F, -3.25F);
        gunModel[108].rotateAngleZ = 0.15707963F;

        gunModel[109].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 164
        gunModel[109].setRotationPoint(-33.93F, -12.55F, -1.52F);
        gunModel[109].rotateAngleZ = 0.89011792F;

        gunModel[110].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 165
        gunModel[110].setRotationPoint(10.5F, -11.5F, -1F);

        gunModel[111].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 166
        gunModel[111].setRotationPoint(10.5F, -11.5F, -3F);

        ammoModel = new ModelRendererTurbo[45];
        ammoModel[0] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 52
        ammoModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 54
        ammoModel[3] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 55
        ammoModel[4] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 56
        ammoModel[5] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 57
        ammoModel[6] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 58
        ammoModel[7] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 59
        ammoModel[8] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 60
        ammoModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 61
        ammoModel[10] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 62
        ammoModel[11] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 63
        ammoModel[12] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 64
        ammoModel[13] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 65
        ammoModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 66
        ammoModel[15] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 67
        ammoModel[16] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 68
        ammoModel[17] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 69
        ammoModel[18] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 70
        ammoModel[19] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 71
        ammoModel[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 72
        ammoModel[21] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 73
        ammoModel[22] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 74
        ammoModel[23] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 75
        ammoModel[24] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 76
        ammoModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 77
        ammoModel[26] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 78
        ammoModel[27] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 79
        ammoModel[28] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 80
        ammoModel[29] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 81
        ammoModel[30] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 82
        ammoModel[31] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 83
        ammoModel[32] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 84
        ammoModel[33] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 85
        ammoModel[34] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 86
        ammoModel[35] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 87
        ammoModel[36] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 88
        ammoModel[37] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 89
        ammoModel[38] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 90
        ammoModel[39] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 91
        ammoModel[40] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 92
        ammoModel[41] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 93
        ammoModel[42] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 94
        ammoModel[43] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 95
        ammoModel[44] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 96

        ammoModel[0].addBox(0F, 0F, 0F, 10, 3, 4, 0F); // Box 51
        ammoModel[0].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[0].rotateAngleZ = 0.01745329F;

        ammoModel[1].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // Box 52
        ammoModel[1].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[1].rotateAngleZ = 0.2443461F;

        ammoModel[2].addBox(0F, 0F, 0F, 10, 9, 4, 0F); // Box 54
        ammoModel[2].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[2].rotateAngleZ = 0.45378561F;

        ammoModel[3].addBox(0F, 0F, 0F, 10, 9, 4, 0F); // Box 55
        ammoModel[3].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[3].rotateAngleZ = 0.68067841F;

        ammoModel[4].addBox(0F, 0.05F, 0F, 10, 7, 4, 0F); // Box 56
        ammoModel[4].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[4].rotateAngleZ = 0.89011792F;

        ammoModel[5].addBox(1F, 0F, 0.1F, 1, 9, 4, 0F); // Box 57
        ammoModel[5].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[5].rotateAngleZ = 0.68067841F;

        ammoModel[6].addBox(1F, 0F, 0.1F, 1, 7, 4, 0F); // Box 58
        ammoModel[6].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[6].rotateAngleZ = 0.89011792F;

        ammoModel[7].addBox(1F, 0F, 0.1F, 1, 9, 4, 0F); // Box 59
        ammoModel[7].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[7].rotateAngleZ = 0.45378561F;

        ammoModel[8].addBox(1F, 0F, 0.1F, 1, 5, 4, 0F); // Box 60
        ammoModel[8].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[8].rotateAngleZ = 0.2443461F;

        ammoModel[9].addBox(1F, 0F, 0.1F, 1, 3, 4, 0F); // Box 61
        ammoModel[9].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[9].rotateAngleZ = 0.01745329F;

        ammoModel[10].addBox(3F, 0F, 0.1F, 1, 9, 4, 0F); // Box 62
        ammoModel[10].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[10].rotateAngleZ = 0.68067841F;

        ammoModel[11].addBox(3F, 0F, 0.1F, 1, 7, 4, 0F); // Box 63
        ammoModel[11].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[11].rotateAngleZ = 0.89011792F;

        ammoModel[12].addBox(3F, 0F, 0.1F, 1, 9, 4, 0F); // Box 64
        ammoModel[12].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[12].rotateAngleZ = 0.45378561F;

        ammoModel[13].addBox(3F, 0F, 0.1F, 1, 5, 4, 0F); // Box 65
        ammoModel[13].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[13].rotateAngleZ = 0.2443461F;

        ammoModel[14].addBox(3F, 0F, 0.1F, 1, 3, 4, 0F); // Box 66
        ammoModel[14].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[14].rotateAngleZ = 0.01745329F;

        ammoModel[15].addBox(5.5F, 0F, 0.1F, 1, 9, 4, 0F); // Box 67
        ammoModel[15].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[15].rotateAngleZ = 0.68067841F;

        ammoModel[16].addBox(5.5F, 0F, 0.1F, 1, 7, 4, 0F); // Box 68
        ammoModel[16].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[16].rotateAngleZ = 0.89011792F;

        ammoModel[17].addBox(5.5F, 0F, 0.1F, 1, 9, 4, 0F); // Box 69
        ammoModel[17].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[17].rotateAngleZ = 0.45378561F;

        ammoModel[18].addBox(5.5F, 0F, 0.1F, 1, 5, 4, 0F); // Box 70
        ammoModel[18].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[18].rotateAngleZ = 0.2443461F;

        ammoModel[19].addBox(5.5F, 0F, 0.1F, 1, 3, 4, 0F); // Box 71
        ammoModel[19].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[19].rotateAngleZ = 0.01745329F;

        ammoModel[20].addBox(8F, 0F, 0.1F, 1, 9, 4, 0F); // Box 72
        ammoModel[20].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[20].rotateAngleZ = 0.68067841F;

        ammoModel[21].addBox(8F, 0F, 0.1F, 1, 7, 4, 0F); // Box 73
        ammoModel[21].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[21].rotateAngleZ = 0.89011792F;

        ammoModel[22].addBox(8F, 0F, 0.1F, 1, 9, 4, 0F); // Box 74
        ammoModel[22].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[22].rotateAngleZ = 0.45378561F;

        ammoModel[23].addBox(8F, 0F, 0.1F, 1, 5, 4, 0F); // Box 75
        ammoModel[23].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[23].rotateAngleZ = 0.2443461F;

        ammoModel[24].addBox(8F, 0F, 0.1F, 1, 3, 4, 0F); // Box 76
        ammoModel[24].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[24].rotateAngleZ = 0.01745329F;

        ammoModel[25].addBox(8F, 0F, -0.1F, 1, 3, 4, 0F); // Box 77
        ammoModel[25].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[25].rotateAngleZ = 0.01745329F;

        ammoModel[26].addBox(8F, 0F, -0.1F, 1, 5, 4, 0F); // Box 78
        ammoModel[26].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[26].rotateAngleZ = 0.2443461F;

        ammoModel[27].addBox(8F, 0F, -0.1F, 1, 9, 4, 0F); // Box 79
        ammoModel[27].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[27].rotateAngleZ = 0.45378561F;

        ammoModel[28].addBox(8F, 0F, -0.1F, 1, 7, 4, 0F); // Box 80
        ammoModel[28].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[28].rotateAngleZ = 0.89011792F;

        ammoModel[29].addBox(8F, 0F, -0.1F, 1, 9, 4, 0F); // Box 81
        ammoModel[29].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[29].rotateAngleZ = 0.68067841F;

        ammoModel[30].addBox(5.5F, 0F, -0.1F, 1, 3, 4, 0F); // Box 82
        ammoModel[30].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[30].rotateAngleZ = 0.01745329F;

        ammoModel[31].addBox(5.5F, 0F, -0.1F, 1, 5, 4, 0F); // Box 83
        ammoModel[31].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[31].rotateAngleZ = 0.2443461F;

        ammoModel[32].addBox(5.5F, 0F, -0.1F, 1, 9, 4, 0F); // Box 84
        ammoModel[32].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[32].rotateAngleZ = 0.45378561F;

        ammoModel[33].addBox(5.5F, 0F, -0.1F, 1, 7, 4, 0F); // Box 85
        ammoModel[33].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[33].rotateAngleZ = 0.89011792F;

        ammoModel[34].addBox(5.5F, 0F, -0.1F, 1, 9, 4, 0F); // Box 86
        ammoModel[34].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[34].rotateAngleZ = 0.68067841F;

        ammoModel[35].addBox(3F, 0F, -0.1F, 1, 3, 4, 0F); // Box 87
        ammoModel[35].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[35].rotateAngleZ = 0.01745329F;

        ammoModel[36].addBox(3F, 0F, -0.1F, 1, 5, 4, 0F); // Box 88
        ammoModel[36].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[36].rotateAngleZ = 0.2443461F;

        ammoModel[37].addBox(3F, 0F, -0.1F, 1, 9, 4, 0F); // Box 89
        ammoModel[37].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[37].rotateAngleZ = 0.45378561F;

        ammoModel[38].addBox(3F, 0F, -0.1F, 1, 7, 4, 0F); // Box 90
        ammoModel[38].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[38].rotateAngleZ = 0.89011792F;

        ammoModel[39].addBox(3F, 0F, -0.1F, 1, 9, 4, 0F); // Box 91
        ammoModel[39].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[39].rotateAngleZ = 0.68067841F;

        ammoModel[40].addBox(1F, 0F, -0.1F, 1, 3, 4, 0F); // Box 92
        ammoModel[40].setRotationPoint(-11.5F, -7F, -2F);
        ammoModel[40].rotateAngleZ = 0.01745329F;

        ammoModel[41].addBox(1F, 0F, -0.1F, 1, 5, 4, 0F); // Box 93
        ammoModel[41].setRotationPoint(-11.5F, -4F, -2F);
        ammoModel[41].rotateAngleZ = 0.2443461F;

        ammoModel[42].addBox(1F, 0F, -0.1F, 1, 9, 4, 0F); // Box 94
        ammoModel[42].setRotationPoint(-10.3F, 0.85F, -2F);
        ammoModel[42].rotateAngleZ = 0.45378561F;

        ammoModel[43].addBox(1F, 0F, -0.1F, 1, 7, 4, 0F); // Box 95
        ammoModel[43].setRotationPoint(-0.7F, 15.95F, -2F);
        ammoModel[43].rotateAngleZ = 0.89011792F;

        ammoModel[44].addBox(1F, 0F, -0.1F, 1, 9, 4, 0F); // Box 96
        ammoModel[44].setRotationPoint(-6.35F, 8.95F, -2F);
        ammoModel[44].rotateAngleZ = 0.68067841F;


        this.modelScale = 0.2f;

        translateAll = new Vector3f(18F, -15.8F, 0F);
        rotateAimPosition = new Vector3f(0F, 0F, -2F);

        this.crouchZoom = -0.2f;

        leftArmPos = new Vector3f(0.1F, -0.70F, 0.1F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
        leftArmReloadPos = new Vector3f(0.F, -0.72F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);

        rightArmPos = new Vector3f(0.22F, -0.67F, 0.0F);
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
        this.muzzleFlashPointNormal = new Vector3f(1F, 0.9F, 0.9F);
        this.muzzleFlashPointScoping = new Vector3f(1.2F, 1F, 0.1F);

        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);


        this.thirdPersonScale = 0.75f;
        this.thirdPersonOffset = new Vector3f(-0.2F, -0.1F, 0F);

        flipAll();
    }
}