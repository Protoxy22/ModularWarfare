package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class scarl extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public scarl() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[171];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
        gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 99
        gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 100
        gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 101
        gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 102
        gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 219
        gunModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
        gunModel[10] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
        gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 16
        gunModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 17
        gunModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
        gunModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 20
        gunModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 21
        gunModel[16] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 26
        gunModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 27
        gunModel[18] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 28
        gunModel[19] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 66
        gunModel[20] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 41
        gunModel[21] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 42
        gunModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 43
        gunModel[23] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 44
        gunModel[24] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 45
        gunModel[25] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 46
        gunModel[26] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 47
        gunModel[27] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48
        gunModel[28] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 49
        gunModel[29] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 50
        gunModel[30] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 51
        gunModel[31] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 52
        gunModel[32] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 53
        gunModel[33] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 54
        gunModel[34] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 55
        gunModel[35] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 56
        gunModel[36] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 57
        gunModel[37] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 58
        gunModel[38] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 59
        gunModel[39] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 60
        gunModel[40] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 61
        gunModel[41] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 62
        gunModel[42] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 63
        gunModel[43] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 64
        gunModel[44] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 65
        gunModel[45] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 66
        gunModel[46] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 67
        gunModel[47] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 68
        gunModel[48] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 69
        gunModel[49] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 70
        gunModel[50] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 71
        gunModel[51] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 72
        gunModel[52] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 73
        gunModel[53] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 74
        gunModel[54] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 75
        gunModel[55] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 76
        gunModel[56] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 77
        gunModel[57] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 78
        gunModel[58] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 79
        gunModel[59] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 80
        gunModel[60] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 81
        gunModel[61] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 82
        gunModel[62] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 83
        gunModel[63] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 84
        gunModel[64] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 85
        gunModel[65] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 86
        gunModel[66] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 87
        gunModel[67] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 88
        gunModel[68] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 89
        gunModel[69] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 90
        gunModel[70] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 91
        gunModel[71] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 92
        gunModel[72] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 93
        gunModel[73] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 94
        gunModel[74] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 95
        gunModel[75] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 96
        gunModel[76] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 97
        gunModel[77] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 98
        gunModel[78] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 99
        gunModel[79] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 100
        gunModel[80] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 101
        gunModel[81] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 102
        gunModel[82] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 103
        gunModel[83] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 104
        gunModel[84] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 105
        gunModel[85] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 106
        gunModel[86] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 107
        gunModel[87] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 108
        gunModel[88] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 109
        gunModel[89] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 110
        gunModel[90] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 111
        gunModel[91] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 112
        gunModel[92] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 113
        gunModel[93] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 114
        gunModel[94] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 115
        gunModel[95] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 116
        gunModel[96] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 117
        gunModel[97] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 118
        gunModel[98] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 119
        gunModel[99] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 120
        gunModel[100] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 121
        gunModel[101] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 122
        gunModel[102] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 123
        gunModel[103] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 124
        gunModel[104] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 125
        gunModel[105] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 126
        gunModel[106] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 127
        gunModel[107] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 128
        gunModel[108] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 129
        gunModel[109] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 130
        gunModel[110] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 132
        gunModel[111] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 133
        gunModel[112] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 134
        gunModel[113] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 135
        gunModel[114] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 136
        gunModel[115] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 116
        gunModel[116] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 131
        gunModel[117] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 133
        gunModel[118] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 134
        gunModel[119] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 135
        gunModel[120] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 136
        gunModel[121] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 137
        gunModel[122] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 138
        gunModel[123] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 139
        gunModel[124] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 140
        gunModel[125] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 141
        gunModel[126] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 309
        gunModel[127] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 149
        gunModel[128] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 150
        gunModel[129] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 151
        gunModel[130] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 152
        gunModel[131] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 153
        gunModel[132] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 154
        gunModel[133] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 155
        gunModel[134] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 156
        gunModel[135] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 157
        gunModel[136] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 158
        gunModel[137] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 159
        gunModel[138] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 160
        gunModel[139] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 161
        gunModel[140] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 162
        gunModel[141] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 163
        gunModel[142] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 165
        gunModel[143] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 166
        gunModel[144] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 167
        gunModel[145] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 168
        gunModel[146] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 169
        gunModel[147] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 170
        gunModel[148] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 171
        gunModel[149] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 127
        gunModel[150] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 128
        gunModel[151] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 129
        gunModel[152] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 175
        gunModel[153] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 176
        gunModel[154] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 177
        gunModel[155] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 147
        gunModel[156] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 148
        gunModel[157] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 149
        gunModel[158] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 181
        gunModel[159] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 182
        gunModel[160] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 183
        gunModel[161] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 184
        gunModel[162] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 185
        gunModel[163] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 186
        gunModel[164] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 188
        gunModel[165] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 189
        gunModel[166] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 190
        gunModel[167] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 191
        gunModel[168] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 193
        gunModel[169] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 194
        gunModel[170] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 191

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

        gunModel[4].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 99
        gunModel[4].setRotationPoint(-17.2F, -18.5F, -1.5F);
        gunModel[4].rotateAngleZ = 0.61086524F;

        gunModel[5].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 100
        gunModel[5].setRotationPoint(-16F, -17.8F, -1.5F);

        gunModel[6].addBox(0F, -1F, 0F, 2, 1, 3, 0F); // Box 101
        gunModel[6].setRotationPoint(-8.65F, -16.85F, -1.5F);
        gunModel[6].rotateAngleZ = 0.62831853F;

        gunModel[7].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 102
        gunModel[7].setRotationPoint(-8F, -22F, -2F);

        gunModel[8].addBox(-6F, 0F, 0F, 1, 1, 4, 0F); // Box 219
        gunModel[8].setRotationPoint(-17.2F, -6.85F, -2.01F);

        gunModel[9].addBox(-6F, 0F, 0F, 6, 5, 4, 0F); // Box 14
        gunModel[9].setRotationPoint(-17F, -22F, -2F);

        gunModel[10].addBox(-6F, 0F, 0F, 16, 6, 4, 0F); // Box 15
        gunModel[10].setRotationPoint(-17F, -28F, -2F);

        gunModel[11].addBox(-6F, 0F, 0F, 5, 6, 4, 0F); // Box 16
        gunModel[11].setRotationPoint(-22F, -29F, -2F);

        gunModel[12].addBox(1F, 1.8F, 0F, 3, 1, 4, 0F); // Box 17
        gunModel[12].setRotationPoint(-23.5F, -26F, -2.01F);
        gunModel[12].rotateAngleZ = -0.75049158F;

        gunModel[13].addBox(-6F, 0F, 0F, 11, 11, 5, 0F); // Box 18
        gunModel[13].setRotationPoint(-1.25F, -29F, -2.5F);

        gunModel[14].addBox(-6.01F, 9.25F, 0F, 11, 1, 6, 0F); // Box 20
        gunModel[14].setRotationPoint(-1.75F, -27.5F, -3.01F);
        gunModel[14].rotateAngleZ = 0.05235988F;

        gunModel[15].addBox(0F, 0F, 0F, 62, 3, 4, 0F); // Box 21
        gunModel[15].setRotationPoint(-28F, -32F, -2F);

        gunModel[16].addBox(0F, 0F, 0F, 62, 2, 1, 0F); // Box 26
        gunModel[16].setRotationPoint(-28F, -33.62F, -1.35F);
        gunModel[16].rotateAngleX = -0.61086524F;

        gunModel[17].addBox(0F, 0F, -1F, 62, 2, 1, 0F); // Box 27
        gunModel[17].setRotationPoint(-28F, -33.62F, 1.35F);
        gunModel[17].rotateAngleX = 0.61086524F;

        gunModel[18].addBox(0F, 0F, 0F, 62, 3, 1, 0F); // Box 28
        gunModel[18].setRotationPoint(-28F, -36F, -0.5F);

        gunModel[19].addBox(0F, 0F, 0F, 62, 2, 3, 0F); // Box 66
        gunModel[19].setRotationPoint(-28F, -33.5F, -1.5F);

        gunModel[20].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 41
        gunModel[20].setRotationPoint(-17F, -22F, -2F);

        gunModel[21].addBox(0F, 0F, 0F, 62, 1, 1, 0F); // Box 42
        gunModel[21].setRotationPoint(-28F, -36F, 0.5F);

        gunModel[22].addBox(0F, 0F, 0F, 62, 1, 1, 0F); // Box 43
        gunModel[22].setRotationPoint(-28F, -34F, 0.5F);

        gunModel[23].addBox(0F, 0F, 0F, 62, 1, 1, 0F); // Box 44
        gunModel[23].setRotationPoint(-28F, -36F, -1.5F);

        gunModel[24].addBox(0F, 0F, 0F, 62, 1, 1, 0F); // Box 45
        gunModel[24].setRotationPoint(-28F, -34F, -1.5F);

        gunModel[25].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 46
        gunModel[25].setRotationPoint(-28F, -35F, 0.5F);

        gunModel[26].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 47
        gunModel[26].setRotationPoint(-28F, -35F, -1.5F);

        gunModel[27].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 48
        gunModel[27].setRotationPoint(13.5F, -35F, 0.5F);

        gunModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 49
        gunModel[28].setRotationPoint(19.25F, -35F, 0.5F);

        gunModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 50
        gunModel[29].setRotationPoint(24F, -35F, 0.5F);

        gunModel[30].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 51
        gunModel[30].setRotationPoint(29F, -35F, 0.5F);

        gunModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 52
        gunModel[31].setRotationPoint(13.5F, -35F, -1.5F);

        gunModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 53
        gunModel[32].setRotationPoint(19.25F, -35F, -1.5F);

        gunModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 54
        gunModel[33].setRotationPoint(24F, -35F, -1.5F);

        gunModel[34].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 55
        gunModel[34].setRotationPoint(29F, -35F, -1.5F);

        gunModel[35].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 56
        gunModel[35].setRotationPoint(2F, -31F, 2F);

        gunModel[36].addBox(0F, 0F, -1F, 9, 1, 1, 0F); // Box 57
        gunModel[36].setRotationPoint(2F, -30F, 3F);
        gunModel[36].rotateAngleX = -0.4712389F;

        gunModel[37].addBox(0F, -1F, -1F, 9, 1, 1, 0F); // Box 58
        gunModel[37].setRotationPoint(2F, -31F, 3F);
        gunModel[37].rotateAngleX = 0.4712389F;

        gunModel[38].addBox(0F, 0F, 0F, 30, 3, 1, 0F); // Box 59
        gunModel[38].setRotationPoint(3F, -29.3F, 1.5F);
        gunModel[38].rotateAngleX = -0.26179939F;

        gunModel[39].addBox(0F, 0F, -1F, 30, 3, 1, 0F); // Box 60
        gunModel[39].setRotationPoint(3F, -29.3F, -1.5F);
        gunModel[39].rotateAngleX = 0.26179939F;

        gunModel[40].addBox(0F, 0F, 0F, 30, 1, 3, 0F); // Box 61
        gunModel[40].setRotationPoint(3F, -26.2F, -1.5F);

        gunModel[41].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 62
        gunModel[41].setRotationPoint(32F, -29.2F, -1.5F);

        gunModel[42].addBox(0F, 0F, 0F, 62, 1, 3, 0F); // Box 63
        gunModel[42].setRotationPoint(-28F, -36.5F, -1.49F);

        gunModel[43].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 64
        gunModel[43].setRotationPoint(-20.5F, -37F, -1.5F);

        gunModel[44].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 65
        gunModel[44].setRotationPoint(-19F, -37F, -1.5F);

        gunModel[45].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 66
        gunModel[45].setRotationPoint(-16F, -37F, -1.5F);

        gunModel[46].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 67
        gunModel[46].setRotationPoint(-17.5F, -37F, -1.5F);

        gunModel[47].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 68
        gunModel[47].setRotationPoint(-13F, -37F, -1.5F);

        gunModel[48].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 69
        gunModel[48].setRotationPoint(-14.5F, -37F, -1.5F);

        gunModel[49].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 70
        gunModel[49].setRotationPoint(-4F, -37F, -1.5F);

        gunModel[50].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 71
        gunModel[50].setRotationPoint(-5.5F, -37F, -1.5F);

        gunModel[51].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 72
        gunModel[51].setRotationPoint(-7F, -37F, -1.5F);

        gunModel[52].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 73
        gunModel[52].setRotationPoint(-8.5F, -37F, -1.5F);

        gunModel[53].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 74
        gunModel[53].setRotationPoint(-10F, -37F, -1.5F);

        gunModel[54].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 75
        gunModel[54].setRotationPoint(-11.5F, -37F, -1.5F);

        gunModel[55].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 76
        gunModel[55].setRotationPoint(5F, -37F, -1.5F);

        gunModel[56].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 77
        gunModel[56].setRotationPoint(3.5F, -37F, -1.5F);

        gunModel[57].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 78
        gunModel[57].setRotationPoint(2F, -37F, -1.5F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 79
        gunModel[58].setRotationPoint(0.5F, -37F, -1.5F);

        gunModel[59].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 80
        gunModel[59].setRotationPoint(-1F, -37F, -1.5F);

        gunModel[60].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 81
        gunModel[60].setRotationPoint(-2.5F, -37F, -1.5F);

        gunModel[61].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 82
        gunModel[61].setRotationPoint(31.9F, -37F, -1.5F);

        gunModel[62].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 83
        gunModel[62].setRotationPoint(30.5F, -37F, -1.5F);

        gunModel[63].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 84
        gunModel[63].setRotationPoint(29F, -37F, -1.5F);

        gunModel[64].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 85
        gunModel[64].setRotationPoint(27.5F, -37F, -1.5F);

        gunModel[65].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 86
        gunModel[65].setRotationPoint(26F, -37F, -1.5F);

        gunModel[66].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 87
        gunModel[66].setRotationPoint(24.5F, -37F, -1.5F);

        gunModel[67].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 88
        gunModel[67].setRotationPoint(6.5F, -37F, -1.5F);

        gunModel[68].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 89
        gunModel[68].setRotationPoint(8F, -37F, -1.5F);

        gunModel[69].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
        gunModel[69].setRotationPoint(9.5F, -37F, -1.5F);

        gunModel[70].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
        gunModel[70].setRotationPoint(11F, -37F, -1.5F);

        gunModel[71].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 92
        gunModel[71].setRotationPoint(12.5F, -37F, -1.5F);

        gunModel[72].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 93
        gunModel[72].setRotationPoint(14F, -37F, -1.5F);

        gunModel[73].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 94
        gunModel[73].setRotationPoint(15.5F, -37F, -1.5F);

        gunModel[74].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 95
        gunModel[74].setRotationPoint(17F, -37F, -1.5F);

        gunModel[75].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 96
        gunModel[75].setRotationPoint(18.5F, -37F, -1.5F);

        gunModel[76].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 97
        gunModel[76].setRotationPoint(20F, -37F, -1.5F);

        gunModel[77].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 98
        gunModel[77].setRotationPoint(21.5F, -37F, -1.5F);

        gunModel[78].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 99
        gunModel[78].setRotationPoint(23F, -37F, -1.5F);

        gunModel[79].addBox(0F, 0F, 0F, 33, 3, 1, 0F); // Box 100
        gunModel[79].setRotationPoint(1F, -32F, 1.5F);

        gunModel[80].addBox(0F, 0F, 0F, 33, 3, 1, 0F); // Box 101
        gunModel[80].setRotationPoint(1F, -32F, -2.5F);

        gunModel[81].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 102
        gunModel[81].setRotationPoint(-28F, -32F, 1.5F);

        gunModel[82].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 103
        gunModel[82].setRotationPoint(-28F, -32F, -2.5F);

        gunModel[83].addBox(-6F, 0F, 0F, 21, 1, 5, 0F); // Box 104
        gunModel[83].setRotationPoint(-22F, -29F, -2.51F);

        gunModel[84].addBox(-6F, 0F, 0F, 1, 14, 5, 0F); // Box 105
        gunModel[84].setRotationPoint(-23F, -36.6F, -2.5F);

        gunModel[85].addBox(-6F, 0F, 0F, 2, 3, 5, 0F); // Box 106
        gunModel[85].setRotationPoint(-25F, -35F, -2.5F);

        gunModel[86].addBox(-6F, 0F, 0F, 3, 2, 5, 0F); // Box 107
        gunModel[86].setRotationPoint(-26F, -29.5F, -2.5F);

        gunModel[87].addBox(-6F, 0F, 0F, 3, 2, 5, 0F); // Box 108
        gunModel[87].setRotationPoint(-26F, -24.5F, -2.5F);

        gunModel[88].addBox(0F, 0F, 0F, 19, 8, 4, 0F); // Box 109
        gunModel[88].setRotationPoint(-48F, -32.5F, -2F);

        gunModel[89].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 110
        gunModel[89].setRotationPoint(-48F, -24.15F, -0.5F);

        gunModel[90].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 111
        gunModel[90].setRotationPoint(-48F, -24.5F, -2F);
        gunModel[90].rotateAngleX = 0.78539816F;

        gunModel[91].addBox(0F, 0F, -1F, 19, 2, 1, 0F); // Box 112
        gunModel[91].setRotationPoint(-48F, -24.5F, 2F);
        gunModel[91].rotateAngleX = -0.78539816F;

        gunModel[92].addBox(-3F, 0F, 0F, 23, 5, 4, 0F); // Box 113
        gunModel[92].setRotationPoint(-48F, -34.5F, -2.02F);
        gunModel[92].rotateAngleZ = 0.10471976F;

        gunModel[93].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 114
        gunModel[93].setRotationPoint(-50.5F, -29.5F, -1.99F);
        gunModel[93].rotateAngleZ = 0.40142573F;

        gunModel[94].addBox(0F, 0F, 0F, 20, 7, 3, 0F); // Box 115
        gunModel[94].setRotationPoint(-67.5F, -31F, -1.5F);

        gunModel[95].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 116
        gunModel[95].setRotationPoint(-61.5F, -32F, -1.5F);

        gunModel[96].addBox(0F, 0F, 0F, 17, 1, 3, 0F); // Box 117
        gunModel[96].setRotationPoint(-67.5F, -33F, -1.5F);

        gunModel[97].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 118
        gunModel[97].setRotationPoint(-67.5F, -32F, -1.5F);

        gunModel[98].addBox(0F, 0F, 0F, 2, 23, 4, 0F); // Box 119
        gunModel[98].setRotationPoint(-69.5F, -33.5F, -2F);

        gunModel[99].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 120
        gunModel[99].setRotationPoint(-70.25F, -33.43F, -2.01F);
        gunModel[99].rotateAngleZ = 0.08726646F;

        gunModel[100].addBox(-1F, -3F, 0F, 1, 11, 4, 0F); // Box 121
        gunModel[100].setRotationPoint(-68.75F, -18.43F, -2.01F);
        gunModel[100].rotateAngleZ = -0.08726646F;

        gunModel[101].addBox(0F, 0F, 0F, 3, 12, 3, 0F); // Box 122
        gunModel[101].setRotationPoint(-67.5F, -24F, -1.51F);

        gunModel[102].addBox(0F, -4F, 0F, 14, 4, 3, 0F); // Box 123
        gunModel[102].setRotationPoint(-64.5F, -12F, -1.49F);
        gunModel[102].rotateAngleZ = 1.08210414F;

        gunModel[103].addBox(0F, -4F, 0F, 2, 4, 3, 0F); // Box 124
        gunModel[103].setRotationPoint(-64.5F, -20F, -1.5F);

        gunModel[104].addBox(0F, 0F, 0F, 29, 3, 3, 0F); // Box 125
        gunModel[104].setRotationPoint(34F, -31.5F, -1.5F);

        gunModel[105].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 126
        gunModel[105].setRotationPoint(33F, -32F, -2F);

        gunModel[106].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 127
        gunModel[106].setRotationPoint(44.5F, -32F, -2F);

        gunModel[107].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 128
        gunModel[107].setRotationPoint(58.5F, -32F, -2F);

        gunModel[108].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 129
        gunModel[108].setRotationPoint(63F, -31.5F, -1.5F);

        gunModel[109].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 130
        gunModel[109].setRotationPoint(63F, -29.5F, -1.5F);

        gunModel[110].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 132
        gunModel[110].setRotationPoint(63F, -30.5F, 0.5F);

        gunModel[111].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 133
        gunModel[111].setRotationPoint(63F, -30.5F, -1.5F);

        gunModel[112].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 134
        gunModel[112].setRotationPoint(34F, -34.5F, -1F);

        gunModel[113].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 135
        gunModel[113].setRotationPoint(35F, -36F, -0.5F);

        gunModel[114].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
        gunModel[114].setRotationPoint(35F, -33F, -0.5F);

        gunModel[115].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 116
        gunModel[115].setRotationPoint(-14.5F, -22F, -0.5F);
        gunModel[115].rotateAngleZ = 0.08726646F;

        gunModel[116].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
        gunModel[116].setRotationPoint(-26F, -41F, -1.99F);

        gunModel[117].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 133
        gunModel[117].setRotationPoint(-26F, -41F, -2.01F);
        gunModel[117].rotateAngleZ = 0.78539816F;

        gunModel[118].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 134
        gunModel[118].setRotationPoint(-27.4F, -39.6F, -2.02F);

        gunModel[119].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 135
        gunModel[119].setRotationPoint(-25.6F, -39.6F, 1F);

        gunModel[120].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
        gunModel[120].setRotationPoint(-26F, -41F, 0.99F);

        gunModel[121].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 137
        gunModel[121].setRotationPoint(-24F, -41F, 1.01F);
        gunModel[121].rotateAngleZ = -0.78539816F;

        gunModel[122].addBox(-2F, 0F, 0F, 2, 1, 1, 0F); // Box 138
        gunModel[122].setRotationPoint(-26F, -41F, 1.01F);
        gunModel[122].rotateAngleZ = 0.78539816F;

        gunModel[123].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 139
        gunModel[123].setRotationPoint(-27.4F, -39.6F, 1.02F);

        gunModel[124].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 140
        gunModel[124].setRotationPoint(-26.1F, -40F, -2.98F);

        gunModel[125].addBox(0F, -1F, -1F, 1, 4, 4, 0F); // Box 141
        gunModel[125].setRotationPoint(-25.4F, -42.5F, -0.97F);

        gunModel[126].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 309
        gunModel[126].setRotationPoint(-25.6F, -39.6F, -2F);

        gunModel[127].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 149
        gunModel[127].setRotationPoint(-22.6F, -38.6F, -2F);

        gunModel[128].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 150
        gunModel[128].setRotationPoint(-22.6F, -38.6F, 1F);

        gunModel[129].addBox(0.5F, -0.5F, 0F, 1, 1, 3, 0F); // Box 151
        gunModel[129].setRotationPoint(-64.5F, -12F, -1.5F);
        gunModel[129].rotateAngleZ = 1.08210414F;

        gunModel[130].addBox(2.5F, -0.5F, 0F, 1, 1, 3, 0F); // Box 152
        gunModel[130].setRotationPoint(-64.5F, -12F, -1.5F);
        gunModel[130].rotateAngleZ = 1.08210414F;

        gunModel[131].addBox(6.5F, -0.5F, 0F, 1, 1, 3, 0F); // Box 153
        gunModel[131].setRotationPoint(-64.5F, -12F, -1.5F);
        gunModel[131].rotateAngleZ = 1.08210414F;

        gunModel[132].addBox(4.5F, -0.5F, 0F, 1, 1, 3, 0F); // Box 154
        gunModel[132].setRotationPoint(-64.5F, -12F, -1.5F);
        gunModel[132].rotateAngleZ = 1.08210414F;

        gunModel[133].addBox(10.5F, -0.5F, 0F, 1, 1, 3, 0F); // Box 155
        gunModel[133].setRotationPoint(-64.5F, -12F, -1.5F);
        gunModel[133].rotateAngleZ = 1.08210414F;

        gunModel[134].addBox(8.5F, -0.5F, 0F, 1, 1, 3, 0F); // Box 156
        gunModel[134].setRotationPoint(-64.5F, -12F, -1.5F);
        gunModel[134].rotateAngleZ = 1.08210414F;

        gunModel[135].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 157
        gunModel[135].setRotationPoint(-16F, -31.5F, -3F);

        gunModel[136].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 158
        gunModel[136].setRotationPoint(-16F, -31.5F, -3F);
        gunModel[136].rotateAngleY = 0.43633231F;

        gunModel[137].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 159
        gunModel[137].setRotationPoint(-16F, -31.5F, 3F);
        gunModel[137].rotateAngleY = -0.43633231F;

        gunModel[138].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 160
        gunModel[138].setRotationPoint(35F, -41F, -0.5F);

        gunModel[139].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 161
        gunModel[139].setRotationPoint(36.5F, -41F, -0.5F);

        gunModel[140].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 162
        gunModel[140].setRotationPoint(35F, -42F, -1.5F);

        gunModel[141].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 163
        gunModel[141].setRotationPoint(35F, -44F, -2F);

        gunModel[142].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 165
        gunModel[142].setRotationPoint(35.5F, -43.5F, -0.5F);

        gunModel[143].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 166
        gunModel[143].setRotationPoint(35F, -44F, 1F);

        gunModel[144].addBox(0F, 0F, -1F, 2, 3, 1, 0F); // Box 167
        gunModel[144].setRotationPoint(35F, -42F, 2F);
        gunModel[144].rotateAngleX = -0.54105207F;

        gunModel[145].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 168
        gunModel[145].setRotationPoint(35F, -42F, -2F);
        gunModel[145].rotateAngleX = 0.54105207F;

        gunModel[146].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 169
        gunModel[146].setRotationPoint(38.75F, -35F, -0.5F);

        gunModel[147].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 170
        gunModel[147].setRotationPoint(44.5F, -33F, -1F);

        gunModel[148].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 171
        gunModel[148].setRotationPoint(44F, -33.5F, -0.5F);

        gunModel[149].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 127
        gunModel[149].setRotationPoint(17.5F, -31.5F, 2.5F);

        gunModel[150].addBox(0F, 0F, -1F, 14, 1, 1, 0F); // Box 128
        gunModel[150].setRotationPoint(19.5F, -29.5F, 3.5F);
        gunModel[150].rotateAngleX = -0.26179939F;

        gunModel[151].addBox(0F, -1F, -1F, 14, 1, 1, 0F); // Box 129
        gunModel[151].setRotationPoint(19.5F, -31.5F, 3.5F);
        gunModel[151].rotateAngleX = 0.26179939F;

        gunModel[152].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 175
        gunModel[152].setRotationPoint(17.5F, -31.5F, -3.5F);

        gunModel[153].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 176
        gunModel[153].setRotationPoint(19.5F, -29.5F, -3.5F);
        gunModel[153].rotateAngleX = 0.26179939F;

        gunModel[154].addBox(0F, -1F, 0F, 14, 1, 1, 0F); // Box 177
        gunModel[154].setRotationPoint(19.5F, -31.5F, -3.5F);
        gunModel[154].rotateAngleX = -0.26179939F;

        gunModel[155].addBox(0F, 0F, 0F, 25, 1, 3, 0F); // Box 147
        gunModel[155].setRotationPoint(7F, -25.75F, -1.5F);

        gunModel[156].addBox(0F, -1F, -1F, 25, 1, 1, 0F); // Box 148
        gunModel[156].setRotationPoint(7F, -24.75F, -1.5F);
        gunModel[156].rotateAngleX = -0.43633231F;

        gunModel[157].addBox(0F, -1F, 0F, 25, 1, 1, 0F); // Box 149
        gunModel[157].setRotationPoint(7F, -24.75F, 1.5F);
        gunModel[157].rotateAngleX = 0.43633231F;

        gunModel[158].addBox(0F, 1F, -1F, 16, 1, 1, 0F); // Box 181
        gunModel[158].setRotationPoint(17.5F, -29.5F, 3.5F);
        gunModel[158].rotateAngleX = -0.26179939F;

        gunModel[159].addBox(0F, 1F, 0F, 16, 1, 1, 0F); // Box 182
        gunModel[159].setRotationPoint(17.5F, -29.5F, -3.5F);
        gunModel[159].rotateAngleX = 0.26179939F;

        gunModel[160].addBox(0F, -2F, -1F, 16, 1, 1, 0F); // Box 183
        gunModel[160].setRotationPoint(17.5F, -31.5F, 3.5F);
        gunModel[160].rotateAngleX = 0.26179939F;

        gunModel[161].addBox(0F, -2F, 0F, 16, 1, 1, 0F); // Box 184
        gunModel[161].setRotationPoint(17.5F, -31.5F, -3.5F);
        gunModel[161].rotateAngleX = -0.26179939F;

        gunModel[162].addBox(-6F, 0F, 0F, 2, 5, 5, 0F); // Box 185
        gunModel[162].setRotationPoint(9.75F, -29F, -2.5F);

        gunModel[163].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 186
        gunModel[163].setRotationPoint(11.5F, -35F, -3F);

        gunModel[164].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 188
        gunModel[164].setRotationPoint(2F, -31F, -3F);

        gunModel[165].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 189
        gunModel[165].setRotationPoint(2F, -30F, -3F);
        gunModel[165].rotateAngleX = 0.4712389F;

        gunModel[166].addBox(0F, -1F, 0F, 9, 1, 1, 0F); // Box 190
        gunModel[166].setRotationPoint(2F, -31F, -3F);
        gunModel[166].rotateAngleX = -0.4712389F;

        gunModel[167].addBox(-6F, 0F, 0F, 2, 2, 1, 0F); // Box 191
        gunModel[167].setRotationPoint(-4F, -27F, -2.5F);

        gunModel[168].addBox(-6F, 0F, 0F, 4, 12, 1, 0F); // Box 193
        gunModel[168].setRotationPoint(-26.25F, -36F, -2.25F);

        gunModel[169].addBox(-6F, 0F, 0F, 4, 12, 1, 0F); // Box 194
        gunModel[169].setRotationPoint(-26.25F, -36F, 1.25F);

        gunModel[170].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 191
        gunModel[170].setRotationPoint(-24F, -41F, -2.01F);
        gunModel[170].rotateAngleZ = -0.78539816F;

        ammoModel = new ModelRendererTurbo[21];
        ammoModel[0] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 52
        ammoModel[2] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 54
        ammoModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 106
        ammoModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 107
        ammoModel[5] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 108
        ammoModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 109
        ammoModel[7] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 110
        ammoModel[8] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 111
        ammoModel[9] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 112
        ammoModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 113
        ammoModel[11] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 114
        ammoModel[12] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 115
        ammoModel[13] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 116
        ammoModel[14] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 117
        ammoModel[15] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 118
        ammoModel[16] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 119
        ammoModel[17] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 120
        ammoModel[18] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 121
        ammoModel[19] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 122
        ammoModel[20] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 123

        ammoModel[0].addBox(0F, 0F, 0F, 10, 3, 4, 0F); // Box 51
        ammoModel[0].setRotationPoint(-7.14F, -19F, -2F);
        ammoModel[0].rotateAngleZ = 0.01745329F;

        ammoModel[1].addBox(0F, 0F, 0F, 10, 8, 4, 0F); // Box 52
        ammoModel[1].setRotationPoint(-7.14F, -16F, -2F);
        ammoModel[1].rotateAngleZ = 0.13962634F;

        ammoModel[2].addBox(0F, 0.0499999999999998F, 0.01F, 10, 7, 4, 0F); // Box 54
        ammoModel[2].setRotationPoint(-6F, -8.15F, -2F);
        ammoModel[2].rotateAngleZ = 0.20943951F;

        ammoModel[3].addBox(1F, 0F, 0F, 1, 3, 1, 0F); // Box 106
        ammoModel[3].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[3].rotateAngleZ = 0.01745329F;

        ammoModel[4].addBox(1F, 0F, -0.01F, 1, 8, 1, 0F); // Box 107
        ammoModel[4].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[4].rotateAngleZ = 0.13962634F;

        ammoModel[5].addBox(1F, 0F, 0F, 1, 7, 1, 0F); // Box 108
        ammoModel[5].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[5].rotateAngleZ = 0.20943951F;

        ammoModel[6].addBox(4F, 0F, 0F, 1, 3, 1, 0F); // Box 109
        ammoModel[6].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[6].rotateAngleZ = 0.01745329F;

        ammoModel[7].addBox(4F, 0F, -0.01F, 1, 8, 1, 0F); // Box 110
        ammoModel[7].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[7].rotateAngleZ = 0.13962634F;

        ammoModel[8].addBox(4F, 0F, 0F, 1, 7, 1, 0F); // Box 111
        ammoModel[8].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[8].rotateAngleZ = 0.20943951F;

        ammoModel[9].addBox(7F, 0F, 0F, 1, 3, 1, 0F); // Box 112
        ammoModel[9].setRotationPoint(-7.14F, -19F, 1.15F);
        ammoModel[9].rotateAngleZ = 0.01745329F;

        ammoModel[10].addBox(7F, 0F, -0.01F, 1, 8, 1, 0F); // Box 113
        ammoModel[10].setRotationPoint(-7.14F, -16F, 1.15F);
        ammoModel[10].rotateAngleZ = 0.13962634F;

        ammoModel[11].addBox(7F, 0F, 0F, 1, 7, 1, 0F); // Box 114
        ammoModel[11].setRotationPoint(-6F, -8.15F, 1.15F);
        ammoModel[11].rotateAngleZ = 0.20943951F;

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

        ammoModel[18].addBox(7F, 0F, 0F, 1, 7, 1, 0F); // Box 121
        ammoModel[18].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[18].rotateAngleZ = 0.20943951F;

        ammoModel[19].addBox(4F, 0F, 0F, 1, 7, 1, 0F); // Box 122
        ammoModel[19].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[19].rotateAngleZ = 0.20943951F;

        ammoModel[20].addBox(1F, 0F, 0F, 1, 7, 1, 0F); // Box 123
        ammoModel[20].setRotationPoint(-6F, -8.15F, -2.15F);
        ammoModel[20].rotateAngleZ = 0.20943951F;


        this.modelScale = 0.2f;
        translateAll = new Vector3f(18F, 11F, 0F);
        rotateAimPosition = new Vector3f(0F, 0F, 0.6F);

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


        thirdPersonOffset = new Vector3f(-0.05F, 0.05F, 0F);//forward/up/?
        backPersonOffset = new Vector3f(0.6F, 0F, 0.3F);
        thirdPersonScale = 0.7f;

        flipAll();
    }
}