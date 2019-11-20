package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class awm  extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public awm() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[130];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 3
        gunModel[3] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 4
        gunModel[4] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 12
        gunModel[5] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 13
        gunModel[6] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 14
        gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
        gunModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 17
        gunModel[9] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 18
        gunModel[10] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 20
        gunModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 21
        gunModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 22
        gunModel[13] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 23
        gunModel[14] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 24
        gunModel[15] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 25
        gunModel[16] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 26
        gunModel[17] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 27
        gunModel[18] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 28
        gunModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 29
        gunModel[20] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 30
        gunModel[21] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 31
        gunModel[22] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 32
        gunModel[23] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 33
        gunModel[24] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 34
        gunModel[25] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 35
        gunModel[26] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 36
        gunModel[27] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 37
        gunModel[28] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 38
        gunModel[29] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 40
        gunModel[30] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 41
        gunModel[31] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 42
        gunModel[32] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 43
        gunModel[33] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 44
        gunModel[34] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 45
        gunModel[35] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 46
        gunModel[36] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 47
        gunModel[37] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 48
        gunModel[38] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 49
        gunModel[39] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 50
        gunModel[40] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 52
        gunModel[41] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 53
        gunModel[42] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 54
        gunModel[43] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 55
        gunModel[44] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 56
        gunModel[45] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 57
        gunModel[46] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 58
        gunModel[47] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 59
        gunModel[48] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 60
        gunModel[49] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 61
        gunModel[50] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 62
        gunModel[51] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 63
        gunModel[52] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 64
        gunModel[53] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 65
        gunModel[54] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 66
        gunModel[55] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 78
        gunModel[56] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 79
        gunModel[57] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 80
        gunModel[58] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 81
        gunModel[59] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 82
        gunModel[60] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 83
        gunModel[61] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 85
        gunModel[62] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 86
        gunModel[63] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 87
        gunModel[64] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 88
        gunModel[65] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 89
        gunModel[66] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 90
        gunModel[67] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 91
        gunModel[68] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 80
        gunModel[69] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 81
        gunModel[70] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 83
        gunModel[71] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 84
        gunModel[72] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 85
        gunModel[73] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 86
        gunModel[74] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 87
        gunModel[75] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 88
        gunModel[76] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 89
        gunModel[77] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 90
        gunModel[78] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 91
        gunModel[79] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 92
        gunModel[80] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 93
        gunModel[81] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 94
        gunModel[82] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 95
        gunModel[83] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 96
        gunModel[84] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 97
        gunModel[85] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 98
        gunModel[86] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 99
        gunModel[87] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 125
        gunModel[88] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 126
        gunModel[89] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 124
        gunModel[90] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 125
        gunModel[91] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 126
        gunModel[92] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 128
        gunModel[93] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 133
        gunModel[94] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 134
        gunModel[95] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 135
        gunModel[96] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 136
        gunModel[97] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 137
        gunModel[98] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 138
        gunModel[99] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 139
        gunModel[100] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 140
        gunModel[101] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 141
        gunModel[102] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 142
        gunModel[103] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 143
        gunModel[104] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 144
        gunModel[105] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 145
        gunModel[106] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 150
        gunModel[107] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 151
        gunModel[108] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 151
        gunModel[109] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 152
        gunModel[110] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 153
        gunModel[111] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 154
        gunModel[112] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 155
        gunModel[113] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 156
        gunModel[114] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 157
        gunModel[115] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 185
        gunModel[116] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 186
        gunModel[117] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 187
        gunModel[118] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 188
        gunModel[119] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 189
        gunModel[120] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 190
        gunModel[121] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 191
        gunModel[122] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 192
        gunModel[123] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 193
        gunModel[124] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 194
        gunModel[125] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 195
        gunModel[126] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 196
        gunModel[127] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 197
        gunModel[128] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 198
        gunModel[129] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 199

        gunModel[0].addBox(0F, 0F, 0F, 122, 1, 3, 0F); // Box 0
        gunModel[0].setRotationPoint(-36F, -10.5F, -1.5F);

        gunModel[1].addBox(0F, 0F, 0F, 67, 3, 6, 0F); // Box 1
        gunModel[1].setRotationPoint(-43F, -3.5F, -3.01F);

        gunModel[2].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 3
        gunModel[2].setRotationPoint(-36F, -7.5F, -3F);

        gunModel[3].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 4
        gunModel[3].setRotationPoint(22F, -8.5F, -3F);
        gunModel[3].rotateAngleZ = -0.8412487F;

        gunModel[4].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 12
        gunModel[4].setRotationPoint(-35F, -0.5F, -3F);

        gunModel[5].addBox(0F, 0F, 0F, 4, 3, 6, 0F); // Box 13
        gunModel[5].setRotationPoint(-31F, -0.5F, -3F);

        gunModel[6].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 14
        gunModel[6].setRotationPoint(-27F, -0.5F, -3F);

        gunModel[7].addBox(0F, -3F, 0F, 20, 4, 6, 0F); // Box 15
        gunModel[7].setRotationPoint(-25F, 2.5F, -2.99F);
        gunModel[7].rotateAngleZ = 0.20071286F;

        gunModel[8].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 17
        gunModel[8].setRotationPoint(-27F, 0.6F, -3F);
        gunModel[8].rotateAngleZ = -0.34906585F;

        gunModel[9].addBox(-2F, 0F, 0F, 2, 2, 6, 0F); // Box 18
        gunModel[9].setRotationPoint(-30.06F, 0.8F, -3F);
        gunModel[9].rotateAngleZ = 0.45378561F;

        gunModel[10].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 20
        gunModel[10].setRotationPoint(-43F, -6.5F, -3.01F);

        gunModel[11].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 21
        gunModel[11].setRotationPoint(21F, -6.5F, -3.01F);

        gunModel[12].addBox(0F, 0F, 0F, 34, 1, 6, 0F); // Box 22
        gunModel[12].setRotationPoint(-17F, -4.5F, -3.01F);

        gunModel[13].addBox(0F, 0F, 0F, 38, 3, 5, 0F); // Box 23
        gunModel[13].setRotationPoint(-17F, -6.5F, -2.5F);

        gunModel[14].addBox(0F, 0F, 0F, 11, 5, 6, 0F); // Box 24
        gunModel[14].setRotationPoint(-54F, -5.5F, -3.01F);

        gunModel[15].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 25
        gunModel[15].setRotationPoint(-44.75F, -5.5F, -3F);
        gunModel[15].rotateAngleZ = 0.52359878F;

        gunModel[16].addBox(0F, 0F, 0F, 16, 1, 6, 0F); // Box 26
        gunModel[16].setRotationPoint(-51F, -0.5F, -3F);

        gunModel[17].addBox(0F, -1F, 0F, 2, 1, 6, 0F); // Box 27
        gunModel[17].setRotationPoint(-52F, -0.5F, -3F);
        gunModel[17].rotateAngleZ = -0.95993109F;

        gunModel[18].addBox(0F, -1F, 0F, 5, 4, 6, 0F); // Box 28
        gunModel[18].setRotationPoint(-51F, 1.5F, -3F);

        gunModel[19].addBox(-2F, 0F, 0F, 4, 1, 6, 0F); // Box 29
        gunModel[19].setRotationPoint(-52F, 4.5F, -3.01F);
        gunModel[19].rotateAngleZ = 0.95993109F;

        gunModel[20].addBox(-2F, 0F, 0F, 14, 6, 6, 0F); // Box 30
        gunModel[20].setRotationPoint(-60F, 6F, -3F);

        gunModel[21].addBox(0F, -1F, 0F, 5, 2, 6, 0F); // Box 31
        gunModel[21].setRotationPoint(-52F, 5.5F, -3F);

        gunModel[22].addBox(-2F, -6F, 0F, 2, 13, 6, 0F); // Box 32
        gunModel[22].setRotationPoint(-46F, 6F, -3F);
        gunModel[22].rotateAngleZ = -0.27925268F;

        gunModel[23].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 33
        gunModel[23].setRotationPoint(-36.5F, 0.5F, -3F);
        gunModel[23].rotateAngleZ = 0.83775804F;

        gunModel[24].addBox(-1F, 0F, 0F, 1, 2, 6, 0F); // Box 34
        gunModel[24].setRotationPoint(-43.3F, 0.5F, -3F);
        gunModel[24].rotateAngleZ = -0.83775804F;

        gunModel[25].addBox(0F, 0F, 0F, 28, 5, 6, 0F); // Box 35
        gunModel[25].setRotationPoint(-83F, -5.5F, -3.01F);

        gunModel[26].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 36
        gunModel[26].setRotationPoint(-55F, -5F, -2.5F);

        gunModel[27].addBox(-2F, 0F, 0F, 6, 2, 6, 0F); // Box 37
        gunModel[27].setRotationPoint(-52F, 12F, -3F);

        gunModel[28].addBox(-2F, 0F, 0F, 8, 2, 6, 0F); // Box 38
        gunModel[28].setRotationPoint(-59.25F, 10.5F, -3F);
        gunModel[28].rotateAngleZ = -0.26179939F;

        gunModel[29].addBox(-2F, 0F, 0F, 26, 8, 6, 0F); // Box 40
        gunModel[29].setRotationPoint(-85F, -1F, -3.01F);

        gunModel[30].addBox(-1.5F, 0F, 0F, 5, 2, 6, 0F); // Box 41
        gunModel[30].setRotationPoint(-61F, -0.5F, -3F);
        gunModel[30].rotateAngleZ = 0.61086524F;

        gunModel[31].addBox(0.5F, 0F, 0F, 2, 1, 6, 0F); // Box 42
        gunModel[31].setRotationPoint(-61.25F, 4F, -3F);
        gunModel[31].rotateAngleZ = -0.95993109F;

        gunModel[32].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 43
        gunModel[32].setRotationPoint(-87F, -5.5F, -2.5F);

        gunModel[33].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 44
        gunModel[33].setRotationPoint(-86.5F, -4.5F, -3F);

        gunModel[34].addBox(-2F, 0F, 0F, 6, 21, 7, 0F); // Box 45
        gunModel[34].setRotationPoint(-91F, -8F, -3.51F);

        gunModel[35].addBox(-2F, 0F, 0F, 2, 21, 8, 0F); // Box 46
        gunModel[35].setRotationPoint(-93F, -8F, -4F);

        gunModel[36].addBox(-2F, 0F, 0F, 2, 18, 8, 0F); // Box 47
        gunModel[36].setRotationPoint(-93F, -5F, -4F);
        gunModel[36].rotateAngleZ = -0.03490659F;

        gunModel[37].addBox(0F, 0F, 0F, 21, 3, 3, 0F); // Box 48
        gunModel[37].setRotationPoint(-86F, -8.5F, -1.5F);

        gunModel[38].addBox(0F, 0F, 0F, 21, 2, 2, 0F); // Box 49
        gunModel[38].setRotationPoint(-86.01F, -8.5F, 1.5F);
        gunModel[38].rotateAngleX = -0.55850536F;

        gunModel[39].addBox(0F, 0F, -2F, 21, 2, 2, 0F); // Box 50
        gunModel[39].setRotationPoint(-86.01F, -8.5F, -1.5F);
        gunModel[39].rotateAngleX = 0.55850536F;

        gunModel[40].addBox(-10F, -5F, 0F, 10, 5, 6, 0F); // Box 52
        gunModel[40].setRotationPoint(-62F, 12F, -3F);
        gunModel[40].rotateAngleZ = -0.54105207F;

        gunModel[41].addBox(-2F, 0F, 0F, 3, 4, 6, 0F); // Box 53
        gunModel[41].setRotationPoint(-85F, 7F, -3.01F);

        gunModel[42].addBox(-2F, 0F, 0F, 5, 2, 6, 0F); // Box 54
        gunModel[42].setRotationPoint(-82F, 6.75F, -3.01F);

        gunModel[43].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 55
        gunModel[43].setRotationPoint(86F, -11F, -2.5F);

        gunModel[44].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 56
        gunModel[44].setRotationPoint(90F, -10.5F, -2F);

        gunModel[45].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 57
        gunModel[45].setRotationPoint(91.01F, -10.5F, -1F);

        gunModel[46].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 58
        gunModel[46].setRotationPoint(91.01F, -7.5F, -1F);

        gunModel[47].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 59
        gunModel[47].setRotationPoint(90.5F, -9.5F, -1.99F);

        gunModel[48].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 60
        gunModel[48].setRotationPoint(90.5F, -9.5F, 1.01F);

        gunModel[49].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 61
        gunModel[49].setRotationPoint(94.01F, -9.5F, 1F);

        gunModel[50].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 62
        gunModel[50].setRotationPoint(94.01F, -9.5F, -2F);

        gunModel[51].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 63
        gunModel[51].setRotationPoint(-35F, 3F, -2F);
        gunModel[51].rotateAngleZ = -0.55850536F;

        gunModel[52].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 64
        gunModel[52].setRotationPoint(-43.5F, 5F, -2F);

        gunModel[53].addBox(-4.25F, -1.25F, 0F, 5, 2, 4, 0F); // Box 65
        gunModel[53].setRotationPoint(-43.5F, 5F, -2F);
        gunModel[53].rotateAngleZ = -0.97738438F;

        gunModel[54].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 66
        gunModel[54].setRotationPoint(-42F, -0.5F, -1F);
        gunModel[54].rotateAngleZ = 0.26179939F;

        gunModel[55].addBox(-2F, 0F, 0F, 2, 8, 2, 0F); // Box 78
        gunModel[55].setRotationPoint(-79.5F, 8.75F, -1F);

        gunModel[56].addBox(-2F, 0F, 0F, 1, 5, 1, 0F); // Box 79
        gunModel[56].setRotationPoint(-79F, 16.75F, -0.5F);

        gunModel[57].addBox(-2F, 0F, 0F, 5, 1, 3, 0F); // Box 80
        gunModel[57].setRotationPoint(-81F, 21.5F, -1.5F);
        gunModel[57].rotateAngleZ = 0.03490659F;

        gunModel[58].addBox(-2F, 0F, 0F, 5, 1, 5, 0F); // Box 81
        gunModel[58].setRotationPoint(-81F, 13.5F, -2.5F);

        gunModel[59].addBox(-2F, 0F, 0F, 5, 1, 5, 0F); // Box 82
        gunModel[59].setRotationPoint(-81F, 15.5F, -2.5F);

        gunModel[60].addBox(0F, 0F, 0F, 25, 2, 4, 0F); // Box 83
        gunModel[60].setRotationPoint(-36F, -10F, -2F);

        gunModel[61].addBox(0F, 0F, 0F, 25, 1, 2, 0F); // Box 85
        gunModel[61].setRotationPoint(-36.01F, -9.5F, 2F);
        gunModel[61].rotateAngleX = -1.09955743F;

        gunModel[62].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 86
        gunModel[62].setRotationPoint(-18F, -8.75F, -3F);
        gunModel[62].rotateAngleX = 0.20943951F;

        gunModel[63].addBox(0F, 0F, -1F, 58, 1, 1, 0F); // Box 87
        gunModel[63].setRotationPoint(-36F, -8.75F, 3F);
        gunModel[63].rotateAngleX = -0.20943951F;

        gunModel[64].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 88
        gunModel[64].setRotationPoint(91F, -10F, -1.5F);

        gunModel[65].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 89
        gunModel[65].setRotationPoint(91F, -8F, -1.5F);

        gunModel[66].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 90
        gunModel[66].setRotationPoint(91F, -10F, 0.5F);

        gunModel[67].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 91
        gunModel[67].setRotationPoint(91F, -8F, 0.5F);

        gunModel[68].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 80
        gunModel[68].setRotationPoint(-43F, -9.5F, -3.01F);

        gunModel[69].addBox(0F, 0F, 0F, 7, 1, 5, 0F); // Box 81
        gunModel[69].setRotationPoint(-43F, -10.5F, -2.5F);

        gunModel[70].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 83
        gunModel[70].setRotationPoint(-44F, -9.5F, -2.5F);

        gunModel[71].addBox(0F, 0F, 0F, 26, 1, 5, 0F); // Box 84
        gunModel[71].setRotationPoint(-35F, -12F, -2.5F);

        gunModel[72].addBox(0F, 0F, -1F, 25, 1, 1, 0F); // Box 85
        gunModel[72].setRotationPoint(-35F, -11F, -1.5F);
        gunModel[72].rotateAngleX = -0.15707963F;

        gunModel[73].addBox(0F, 0F, 0F, 25, 3, 1, 0F); // Box 86
        gunModel[73].setRotationPoint(-35F, -11F, 1.5F);
        gunModel[73].rotateAngleX = 0.15707963F;

        gunModel[74].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 87
        gunModel[74].setRotationPoint(-34.5F, -12.5F, -2F);

        gunModel[75].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 88
        gunModel[75].setRotationPoint(-32.5F, -12.5F, -2F);

        gunModel[76].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 89
        gunModel[76].setRotationPoint(-28.5F, -12.5F, -2F);

        gunModel[77].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 90
        gunModel[77].setRotationPoint(-30.5F, -12.5F, -2F);

        gunModel[78].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 91
        gunModel[78].setRotationPoint(-24.5F, -12.5F, -2F);

        gunModel[79].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 92
        gunModel[79].setRotationPoint(-26.5F, -12.5F, -2F);

        gunModel[80].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 93
        gunModel[80].setRotationPoint(-20.5F, -12.5F, -2F);

        gunModel[81].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 94
        gunModel[81].setRotationPoint(-22.5F, -12.5F, -2F);

        gunModel[82].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 95
        gunModel[82].setRotationPoint(-16.5F, -12.5F, -2F);

        gunModel[83].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 96
        gunModel[83].setRotationPoint(-18.5F, -12.5F, -2F);

        gunModel[84].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 97
        gunModel[84].setRotationPoint(-12.5F, -12.5F, -2F);

        gunModel[85].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 98
        gunModel[85].setRotationPoint(-14.5F, -12.5F, -2F);

        gunModel[86].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 99
        gunModel[86].setRotationPoint(-10.5F, -12.5F, -2F);

        gunModel[87].addBox(-2F, 0F, -6F, 2, 2, 6, 0F); // Box 125
        gunModel[87].setRotationPoint(-39F, -9F, -3.01F);
        gunModel[87].rotateAngleX = 0.55850536F;
        gunModel[87].rotateAngleY = -0.17453293F;

        gunModel[88].addBox(-2.5F, -0.5F, -8F, 3, 3, 3, 0F); // Box 126
        gunModel[88].setRotationPoint(-39F, -9F, -3.01F);
        gunModel[88].rotateAngleX = 0.55850536F;
        gunModel[88].rotateAngleY = -0.17453293F;

        gunModel[89].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 124
        gunModel[89].setRotationPoint(17.75F, -5.5F, -3.01F);
        gunModel[89].rotateAngleX = 0.2443461F;

        gunModel[90].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 125
        gunModel[90].setRotationPoint(17.75F, -5.5F, -3.01F);
        gunModel[90].rotateAngleX = 0.2443461F;

        gunModel[91].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 126
        gunModel[91].setRotationPoint(19.75F, -5.5F, -3.01F);
        gunModel[91].rotateAngleX = 0.2443461F;

        gunModel[92].addBox(0F, 0F, -2F, 3, 1, 1, 0F); // Box 128
        gunModel[92].setRotationPoint(17.75F, -5.5F, -3.01F);
        gunModel[92].rotateAngleX = 0.2443461F;

        gunModel[93].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 133
        gunModel[93].setRotationPoint(21.5F, -3F, -3.5F);

        gunModel[94].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 134
        gunModel[94].setRotationPoint(3.5F, -3F, -3.5F);

        gunModel[95].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 135
        gunModel[95].setRotationPoint(-18.5F, -2F, -3.5F);

        gunModel[96].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 136
        gunModel[96].setRotationPoint(-35.5F, -3F, -3.5F);

        gunModel[97].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 137
        gunModel[97].setRotationPoint(-53.5F, -4.25F, -3.5F);

        gunModel[98].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 138
        gunModel[98].setRotationPoint(-57.5F, -4.25F, -3.5F);

        gunModel[99].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 139
        gunModel[99].setRotationPoint(-50.5F, 10.75F, -3.5F);

        gunModel[100].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 140
        gunModel[100].setRotationPoint(-82.5F, -4.25F, -3.5F);

        gunModel[101].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 141
        gunModel[101].setRotationPoint(-79.5F, -4.25F, -3.5F);

        gunModel[102].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 142
        gunModel[102].setRotationPoint(-69.5F, -3.7F, -3.5F);

        gunModel[103].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 143
        gunModel[103].setRotationPoint(-85.75F, 4.2F, -3.5F);

        gunModel[104].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 144
        gunModel[104].setRotationPoint(-72.75F, 4.2F, -3.5F);

        gunModel[105].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 145
        gunModel[105].setRotationPoint(-86F, -4F, -3.5F);

        gunModel[106].addBox(0F, 0F, 0F, 44, 4, 3, 0F); // Box 150
        gunModel[106].setRotationPoint(-36.01F, -10.76F, -1.75F);

        gunModel[107].addBox(0F, 0F, 0F, 44, 4, 3, 0F); // Box 151
        gunModel[107].setRotationPoint(-36F, -10.75F, -1.25F);

        gunModel[108].addBox(0F, 0F, 0F, 40, 1, 6, 0F); // Box 151
        gunModel[108].setRotationPoint(-18F, -8.49F, -3F);

        gunModel[109].addBox(0F, 0F, 0F, 41, 1, 6, 0F); // Box 152
        gunModel[109].setRotationPoint(-19F, -7.5F, -3F);

        gunModel[110].addBox(-2F, 0F, 0F, 1, 21, 8, 0F); // Box 153
        gunModel[110].setRotationPoint(-90F, -8.01F, -4F);
        gunModel[110].rotateAngleZ = -0.01745329F;

        gunModel[111].addBox(0F, 0F, 1F, 3, 1, 1, 0F); // Box 154
        gunModel[111].setRotationPoint(17.75F, -5.5F, 2.99F);
        gunModel[111].rotateAngleX = -0.2443461F;

        gunModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 155
        gunModel[112].setRotationPoint(17.75F, -5.5F, 2.99F);
        gunModel[112].rotateAngleX = -0.2443461F;

        gunModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 156
        gunModel[113].setRotationPoint(19.75F, -5.5F, 2.99F);
        gunModel[113].rotateAngleX = -0.2443461F;

        gunModel[114].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 157
        gunModel[114].setRotationPoint(17.75F, -5.5F, 2.99F);
        gunModel[114].rotateAngleX = -0.2443461F;

        gunModel[115].addBox(0F, 0F, 0F, 122, 2, 3, 0F); // Box 185
        gunModel[115].setRotationPoint(-36F, -8.5F, -1.5F);

        gunModel[116].addBox(0F, 0F, 0F, 51, 1, 3, 0F); // Box 186
        gunModel[116].setRotationPoint(-36F, -9.5F, -1.5F);

        gunModel[117].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 187
        gunModel[117].setRotationPoint(81F, -9.5F, -1.5F);

        gunModel[118].addBox(0F, 0F, 0F, 66, 1, 2, 0F); // Box 188
        gunModel[118].setRotationPoint(15F, -9.5F, -1F);

        gunModel[119].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 189
        gunModel[119].setRotationPoint(20.5F, -1.75F, -1F);

        gunModel[120].addBox(-2F, 0F, 0F, 4, 1, 1, 0F); // Box 190
        gunModel[120].setRotationPoint(-80.5F, 13.5F, -3.5F);

        gunModel[121].addBox(-2F, 0F, 0F, 4, 1, 1, 0F); // Box 191
        gunModel[121].setRotationPoint(-80.5F, 15.5F, -3.5F);

        gunModel[122].addBox(-2F, 0F, 0F, 4, 1, 1, 0F); // Box 192
        gunModel[122].setRotationPoint(-80.5F, 13.5F, 2.5F);

        gunModel[123].addBox(-2F, 0F, 0F, 4, 1, 1, 0F); // Box 193
        gunModel[123].setRotationPoint(-80.5F, 15.5F, 2.5F);

        gunModel[124].addBox(0F, 0F, 0F, 34, 2, 1, 0F); // Box 194
        gunModel[124].setRotationPoint(-17F, -6.5F, -2.75F);

        gunModel[125].addBox(0F, 0F, 0F, 34, 2, 1, 0F); // Box 195
        gunModel[125].setRotationPoint(-17F, -6.5F, 1.75F);

        gunModel[126].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 196
        gunModel[126].setRotationPoint(-34F, 3F, -1F);
        gunModel[126].rotateAngleZ = -0.15707963F;

        gunModel[127].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 197
        gunModel[127].setRotationPoint(23.01F, -1F, -3F);

        gunModel[128].addBox(0F, 0F, -1F, 58, 1, 1, 0F); // Box 198
        gunModel[128].setRotationPoint(-36F, -8.5F, 3.01F);

        gunModel[129].addBox(0F, 0F, -1F, 58, 1, 1, 0F); // Box 199
        gunModel[129].setRotationPoint(-36F, -7.5F, 3.01F);



        defaultScopeModel = new ModelRendererTurbo[51];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 100
        defaultScopeModel[1] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 101
        defaultScopeModel[2] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 102
        defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 103
        defaultScopeModel[4] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 104
        defaultScopeModel[5] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 105
        defaultScopeModel[6] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 106
        defaultScopeModel[7] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 107
        defaultScopeModel[8] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 108
        defaultScopeModel[9] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 109
        defaultScopeModel[10] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 111
        defaultScopeModel[11] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 112
        defaultScopeModel[12] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 113
        defaultScopeModel[13] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 114
        defaultScopeModel[14] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 114
        defaultScopeModel[15] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 115
        defaultScopeModel[16] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 116
        defaultScopeModel[17] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 120
        defaultScopeModel[18] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 121
        defaultScopeModel[19] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 122
        defaultScopeModel[20] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 124
        defaultScopeModel[21] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 146
        defaultScopeModel[22] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 147
        defaultScopeModel[23] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 158
        defaultScopeModel[24] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 159
        defaultScopeModel[25] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 160
        defaultScopeModel[26] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 161
        defaultScopeModel[27] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 162
        defaultScopeModel[28] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 163
        defaultScopeModel[29] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 164
        defaultScopeModel[30] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 165
        defaultScopeModel[31] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 166
        defaultScopeModel[32] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 167
        defaultScopeModel[33] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 168
        defaultScopeModel[34] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 169
        defaultScopeModel[35] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 170
        defaultScopeModel[36] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 171
        defaultScopeModel[37] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 172
        defaultScopeModel[38] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 173
        defaultScopeModel[39] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 174
        defaultScopeModel[40] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 175
        defaultScopeModel[41] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 176
        defaultScopeModel[42] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 177
        defaultScopeModel[43] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 178
        defaultScopeModel[44] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 179
        defaultScopeModel[45] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 180
        defaultScopeModel[46] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 181
        defaultScopeModel[47] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 182
        defaultScopeModel[48] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 183
        defaultScopeModel[49] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 184
        defaultScopeModel[50] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 123

        defaultScopeModel[0].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 100
        defaultScopeModel[0].setRotationPoint(-34.5F, -15F, -2.01F);

        defaultScopeModel[1].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 101
        defaultScopeModel[1].setRotationPoint(-19.5F, -15F, -2.01F);

        defaultScopeModel[2].addBox(0F, 0F, 0F, 23, 3, 5, 0F); // Box 102
        defaultScopeModel[2].setRotationPoint(-37.5F, -19F, -3F);

        defaultScopeModel[3].addBox(0F, 0F, 0F, 16, 6, 6, 0F); // Box 103
        defaultScopeModel[3].setRotationPoint(-14.5F, -20.51F, -3F);

        defaultScopeModel[4].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 104
        defaultScopeModel[4].setRotationPoint(-8.5F, -21.5F, -3F);

        defaultScopeModel[5].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 105
        defaultScopeModel[5].setRotationPoint(-8.5F, -20.5F, -4F);

        defaultScopeModel[6].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 106
        defaultScopeModel[6].setRotationPoint(-8.5F, -20.5F, 3F);

        defaultScopeModel[7].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 107
        defaultScopeModel[7].setRotationPoint(-8.5F, -14.5F, -3F);

        defaultScopeModel[8].addBox(0F, 0F, 0F, 13, 6, 6, 0F); // Box 108
        defaultScopeModel[8].setRotationPoint(-50.51F, -20.51F, -3F);

        defaultScopeModel[9].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 109
        defaultScopeModel[9].setRotationPoint(-27F, -23F, -2F);

        defaultScopeModel[10].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 111
        defaultScopeModel[10].setRotationPoint(-52.5F, -20.5F, -3F);

        defaultScopeModel[11].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 112
        defaultScopeModel[11].setRotationPoint(-52.5F, -19.5F, -3F);

        defaultScopeModel[12].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 113
        defaultScopeModel[12].setRotationPoint(-52.5F, -19.5F, 2F);

        defaultScopeModel[13].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 114
        defaultScopeModel[13].setRotationPoint(-52.5F, -15.5F, -3F);

        defaultScopeModel[14].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Box 114
        defaultScopeModel[14].setRotationPoint(-37.5F, -20.55F, -1.5F);

        defaultScopeModel[15].addBox(0F, 0F, -2F, 23, 1, 2, 0F); // Box 115
        defaultScopeModel[15].setRotationPoint(-37.5F, -20.55F, -1.5F);
        defaultScopeModel[15].rotateAngleX = 0.76794487F;

        defaultScopeModel[16].addBox(0F, 0F, 0F, 23, 1, 2, 0F); // Box 116
        defaultScopeModel[16].setRotationPoint(-37.5F, -20.55F, 1.5F);
        defaultScopeModel[16].rotateAngleX = -0.76794487F;

        defaultScopeModel[17].addBox(0F, 0F, 0F, 23, 3, 5, 0F); // Box 120
        defaultScopeModel[17].setRotationPoint(-37.5F, -19F, -2.1F);

        defaultScopeModel[18].addBox(0F, 0F, 0F, 23, 1, 2, 0F); // Box 121
        defaultScopeModel[18].setRotationPoint(-37.5F, -16.75F, -2.25F);
        defaultScopeModel[18].rotateAngleX = -0.76794487F;

        defaultScopeModel[19].addBox(0F, 0F, -2F, 23, 1, 2, 0F); // Box 122
        defaultScopeModel[19].setRotationPoint(-37.5F, -16.75F, 2.25F);
        defaultScopeModel[19].rotateAngleX = 0.76794487F;

        defaultScopeModel[20].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Box 124
        defaultScopeModel[20].setRotationPoint(-37.5F, -15.6F, -1.5F);

        defaultScopeModel[21].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 146
        defaultScopeModel[21].setRotationPoint(-26.5F, -23.25F, -1.5F);

        defaultScopeModel[22].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 147
        defaultScopeModel[22].setRotationPoint(-26F, -23.5F, -0.5F);

        defaultScopeModel[23].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 158
        defaultScopeModel[23].setRotationPoint(1.5F, -15.8F, -3F);
        defaultScopeModel[23].rotateAngleX = -0.76794487F;

        defaultScopeModel[24].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 159
        defaultScopeModel[24].setRotationPoint(1.5F, -15.8F, 3F);
        defaultScopeModel[24].rotateAngleX = 0.76794487F;

        defaultScopeModel[25].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 160
        defaultScopeModel[25].setRotationPoint(1.5F, -21.25F, -2.25F);
        defaultScopeModel[25].rotateAngleX = 0.76794487F;

        defaultScopeModel[26].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 161
        defaultScopeModel[26].setRotationPoint(1.5F, -21.25F, 2.25F);
        defaultScopeModel[26].rotateAngleX = -0.76794487F;

        defaultScopeModel[27].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 162
        defaultScopeModel[27].setRotationPoint(-52.5F, -16F, -3F);
        defaultScopeModel[27].rotateAngleX = -0.76794487F;

        defaultScopeModel[28].addBox(0F, 1F, -2F, 1, 1, 2, 0F); // Box 163
        defaultScopeModel[28].setRotationPoint(-52.5F, -21.25F, -2.25F);
        defaultScopeModel[28].rotateAngleX = 0.76794487F;

        defaultScopeModel[29].addBox(0F, 1F, 0F, 1, 1, 2, 0F); // Box 164
        defaultScopeModel[29].setRotationPoint(-52.5F, -21.25F, 2.25F);
        defaultScopeModel[29].rotateAngleX = -0.76794487F;

        defaultScopeModel[30].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 165
        defaultScopeModel[30].setRotationPoint(-52.5F, -16F, 3F);
        defaultScopeModel[30].rotateAngleX = 0.76794487F;

        defaultScopeModel[31].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 166
        defaultScopeModel[31].setRotationPoint(-39.5F, -21.1F, -3.5F);

        defaultScopeModel[32].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 167
        defaultScopeModel[32].setRotationPoint(-50.5F, -21.1F, -3.5F);

        defaultScopeModel[33].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 168
        defaultScopeModel[33].setRotationPoint(-34.5F, -21F, -2.01F);

        defaultScopeModel[34].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 169
        defaultScopeModel[34].setRotationPoint(-34.5F, -19F, -4.01F);

        defaultScopeModel[35].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 170
        defaultScopeModel[35].setRotationPoint(-34.5F, -19F, 3.01F);

        defaultScopeModel[36].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 171
        defaultScopeModel[36].setRotationPoint(-34.5F, -20F, -3.01F);

        defaultScopeModel[37].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 172
        defaultScopeModel[37].setRotationPoint(-34.5F, -20F, 2.01F);

        defaultScopeModel[38].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 173
        defaultScopeModel[38].setRotationPoint(-34.5F, -16F, -3.01F);

        defaultScopeModel[39].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 174
        defaultScopeModel[39].setRotationPoint(-34.5F, -16F, 2.01F);

        defaultScopeModel[40].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 175
        defaultScopeModel[40].setRotationPoint(-19.5F, -16F, -3.01F);

        defaultScopeModel[41].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 176
        defaultScopeModel[41].setRotationPoint(-19.5F, -19F, -4.01F);

        defaultScopeModel[42].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
        defaultScopeModel[42].setRotationPoint(-19.5F, -20F, -3.01F);

        defaultScopeModel[43].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 178
        defaultScopeModel[43].setRotationPoint(-19.5F, -21F, -2.01F);

        defaultScopeModel[44].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 179
        defaultScopeModel[44].setRotationPoint(-19.5F, -20F, 2.01F);

        defaultScopeModel[45].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 180
        defaultScopeModel[45].setRotationPoint(-19.5F, -19F, 3.01F);

        defaultScopeModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 181
        defaultScopeModel[46].setRotationPoint(-19.5F, -16F, 2.01F);

        defaultScopeModel[47].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 182
        defaultScopeModel[47].setRotationPoint(-27F, -19.75F, -6.25F);

        defaultScopeModel[48].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 183
        defaultScopeModel[48].setRotationPoint(-26.5F, -19.25F, -6.5F);

        defaultScopeModel[49].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 184
        defaultScopeModel[49].setRotationPoint(-26F, -18.25F, -6.75F);

        defaultScopeModel[50].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Box 123
        defaultScopeModel[50].setRotationPoint(-37.5F, -16.55F, -1.5F);

        ammoModel = new ModelRendererTurbo[11];
        ammoModel[0] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 67
        ammoModel[1] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 68
        ammoModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 69
        ammoModel[3] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 70
        ammoModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 71
        ammoModel[5] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 72
        ammoModel[6] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 73
        ammoModel[7] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 74
        ammoModel[8] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 75
        ammoModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 76
        ammoModel[10] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 77

        ammoModel[0].addBox(0F, 0F, 0F, 14, 9, 3, 0F); // Box 67
        ammoModel[0].setRotationPoint(-33F, -0.5F, -1.5F);
        ammoModel[0].rotateAngleZ = 0.06981317F;

        ammoModel[1].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 68
        ammoModel[1].setRotationPoint(-33F, -0.5F, -2F);
        ammoModel[1].rotateAngleZ = 0.06981317F;

        ammoModel[2].addBox(3F, 0F, 0F, 5, 9, 1, 0F); // Box 69
        ammoModel[2].setRotationPoint(-33F, -0.5F, -2F);
        ammoModel[2].rotateAngleZ = 0.06981317F;

        ammoModel[3].addBox(10F, 0F, 0F, 4, 9, 1, 0F); // Box 70
        ammoModel[3].setRotationPoint(-33F, -0.5F, -2F);
        ammoModel[3].rotateAngleZ = 0.06981317F;

        ammoModel[4].addBox(1.5F, 8F, 0.01F, 2, 1, 1, 0F); // Box 71
        ammoModel[4].setRotationPoint(-33F, -0.5F, -2F);
        ammoModel[4].rotateAngleZ = 0.06981317F;

        ammoModel[5].addBox(8F, 8F, 0.01F, 2, 1, 1, 0F); // Box 72
        ammoModel[5].setRotationPoint(-33F, -0.5F, -2F);
        ammoModel[5].rotateAngleZ = 0.06981317F;

        ammoModel[6].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 73
        ammoModel[6].setRotationPoint(-33F, -0.5F, 1F);
        ammoModel[6].rotateAngleZ = 0.06981317F;

        ammoModel[7].addBox(3F, 0F, 0F, 5, 9, 1, 0F); // Box 74
        ammoModel[7].setRotationPoint(-33F, -0.5F, 1F);
        ammoModel[7].rotateAngleZ = 0.06981317F;

        ammoModel[8].addBox(10F, 0F, 0F, 4, 9, 1, 0F); // Box 75
        ammoModel[8].setRotationPoint(-33F, -0.5F, 1F);
        ammoModel[8].rotateAngleZ = 0.06981317F;

        ammoModel[9].addBox(1.5F, 8F, 0.01F, 2, 1, 1, 0F); // Box 76
        ammoModel[9].setRotationPoint(-33F, -0.5F, 1F);
        ammoModel[9].rotateAngleZ = 0.06981317F;

        ammoModel[10].addBox(8F, 8F, 0.01F, 2, 1, 1, 0F); // Box 77
        ammoModel[10].setRotationPoint(-33F, -0.5F, 1F);
        ammoModel[10].rotateAngleZ = 0.06981317F;


        this.modelScale = 0.20F;

//		scopeAttachPoint = new Vector3f(15 /16F, 48F /16F, 0F /16F);
        translateAll = new Vector3f(30F, -15F, -0.15F);//forward/down/right
        thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/?

        actionArm = EnumArm.Right;
        actionType = EnumAction.Bolt;
        rotationHelper = new Vector3f(0, 0.85F, 0);
        boltRotationPoint = new Vector3f(0, 0.85F, 0);
        boltRotation = -45F;

        gunSlideDistance = 0F;
        reloadAnimation = WeaponAnimations.SNIPER;
        translateAimPosition = new Vector3f(0.05F, 0F, 0F);
        rotateGunVertical = 05F;
        rotateGunHorizontal = 21F;
        tiltGun = -05F;
		/*tiltGunTime = 0.20F;
		unloadClipTime = 0.30F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;*/
        translateGun = new Vector3f(3 /16F, -1F /16F, -2F /16F);
        rotateClipVertical = -90F;
        rotateClipHorizontal = -1F;
        tiltClip = -08F;
        translateClip = new Vector3f(-0 /16F, -20F /16F, 1F /16F);

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

        //RecoilSlideDistance = 0.16F;
        //RotateSlideDistance = -1F;

        pumpDelayAfterReload = 65;
        pumpDelay = 10;
        pumpTime = 20;
        gripIsOnPump = false;
        pumpHandleDistance = 0.45F;

        chargeModifier = new Vector3f (0.25F, -0.25F, -0.095F);

        crouchZoom = -0.05F;
        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);


        thirdPersonOffset = new Vector3f(-0.05F, -0.02F, 0F);//forward/up/?
        thirdPersonScale = 0.7f;
        flipAll();
    }
}