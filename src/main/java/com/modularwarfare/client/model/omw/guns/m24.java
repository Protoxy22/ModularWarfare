package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class m24 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public m24() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[117];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
        gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 101
        gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 102
        gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 103
        gunModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 104
        gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 105
        gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 106
        gunModel[7] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 107
        gunModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 108
        gunModel[9] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 109
        gunModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 111
        gunModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 112
        gunModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 113
        gunModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 114
        gunModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 114
        gunModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 115
        gunModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 116
        gunModel[17] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 120
        gunModel[18] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 121
        gunModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 122
        gunModel[20] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 124
        gunModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 146
        gunModel[22] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 147
        gunModel[23] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 158
        gunModel[24] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 159
        gunModel[25] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 160
        gunModel[26] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 161
        gunModel[27] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 162
        gunModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 163
        gunModel[29] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 164
        gunModel[30] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 165
        gunModel[31] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 168
        gunModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 169
        gunModel[33] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 170
        gunModel[34] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 171
        gunModel[35] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 172
        gunModel[36] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 173
        gunModel[37] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 174
        gunModel[38] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 175
        gunModel[39] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 176
        gunModel[40] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 177
        gunModel[41] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 178
        gunModel[42] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 179
        gunModel[43] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 180
        gunModel[44] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 181
        gunModel[45] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 182
        gunModel[46] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 183
        gunModel[47] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 184
        gunModel[48] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 56
        gunModel[49] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 52
        gunModel[50] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 53
        gunModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 54
        gunModel[52] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 55
        gunModel[53] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 56
        gunModel[54] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 57
        gunModel[55] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 58
        gunModel[56] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 62
        gunModel[57] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 63
        gunModel[58] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 64
        gunModel[59] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 65
        gunModel[60] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 66
        gunModel[61] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 67
        gunModel[62] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 68
        gunModel[63] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 69
        gunModel[64] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 70
        gunModel[65] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 71
        gunModel[66] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 72
        gunModel[67] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 73
        gunModel[68] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 74
        gunModel[69] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 75
        gunModel[70] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 83
        gunModel[71] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 150
        gunModel[72] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 80
        gunModel[73] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 82
        gunModel[74] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 83
        gunModel[75] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 84
        gunModel[76] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 89
        gunModel[77] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 90
        gunModel[78] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 92
        gunModel[79] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 93
        gunModel[80] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 156
        gunModel[81] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 157
        gunModel[82] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 158
        gunModel[83] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 159
        gunModel[84] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 98
        gunModel[85] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 100
        gunModel[86] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 101
        gunModel[87] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 114
        gunModel[88] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 115
        gunModel[89] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 116
        gunModel[90] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 117
        gunModel[91] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 118
        gunModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 119
        gunModel[93] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 120
        gunModel[94] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 121
        gunModel[95] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 122
        gunModel[96] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 123
        gunModel[97] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 124
        gunModel[98] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 125
        gunModel[99] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 126
        gunModel[100] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 127
        gunModel[101] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 128
        gunModel[102] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 129
        gunModel[103] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 130
        gunModel[104] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 131
        gunModel[105] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 132
        gunModel[106] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 133
        gunModel[107] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 134
        gunModel[108] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 135
        gunModel[109] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 136
        gunModel[110] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 66
        gunModel[111] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 101
        gunModel[112] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 102
        gunModel[113] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 104
        gunModel[114] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 105
        gunModel[115] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 71
        gunModel[116] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 143

        gunModel[0].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 100
        gunModel[0].setRotationPoint(-39.5F, -15F, -2.01F);

        gunModel[1].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 101
        gunModel[1].setRotationPoint(-19.5F, -15F, -2.01F);

        gunModel[2].addBox(0F, 0F, 0F, 33, 3, 5, 0F); // Box 102
        gunModel[2].setRotationPoint(-47.5F, -19F, -3F);

        gunModel[3].addBox(0F, 0F, 0F, 17, 6, 6, 0F); // Box 103
        gunModel[3].setRotationPoint(-14.5F, -20.51F, -3F);

        gunModel[4].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 104
        gunModel[4].setRotationPoint(-8.5F, -21.5F, -3F);

        gunModel[5].addBox(0F, 0F, 0F, 12, 6, 1, 0F); // Box 105
        gunModel[5].setRotationPoint(-8.5F, -20.5F, -4F);

        gunModel[6].addBox(0F, 0F, 0F, 12, 6, 1, 0F); // Box 106
        gunModel[6].setRotationPoint(-8.5F, -20.5F, 3F);

        gunModel[7].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 107
        gunModel[7].setRotationPoint(-8.5F, -14.5F, -3F);

        gunModel[8].addBox(0F, 0F, 0F, 3, 6, 6, 0F); // Box 108
        gunModel[8].setRotationPoint(-50.51F, -20.51F, -3F);

        gunModel[9].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 109
        gunModel[9].setRotationPoint(-30F, -23F, -2F);

        gunModel[10].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 111
        gunModel[10].setRotationPoint(-52.5F, -20.5F, -3F);

        gunModel[11].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 112
        gunModel[11].setRotationPoint(-52.5F, -19.5F, -3F);

        gunModel[12].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 113
        gunModel[12].setRotationPoint(-52.5F, -19.5F, 2F);

        gunModel[13].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 114
        gunModel[13].setRotationPoint(-52.5F, -15.5F, -3F);

        gunModel[14].addBox(0F, 0F, 0F, 33, 1, 3, 0F); // Box 114
        gunModel[14].setRotationPoint(-47.5F, -20.55F, -1.5F);

        gunModel[15].addBox(0F, 0F, -2F, 33, 1, 2, 0F); // Box 115
        gunModel[15].setRotationPoint(-47.5F, -20.55F, -1.5F);
        gunModel[15].rotateAngleX = 0.76794487F;

        gunModel[16].addBox(0F, 0F, 0F, 33, 1, 2, 0F); // Box 116
        gunModel[16].setRotationPoint(-47.5F, -20.55F, 1.5F);
        gunModel[16].rotateAngleX = -0.76794487F;

        gunModel[17].addBox(0F, 0F, 0F, 33, 3, 5, 0F); // Box 120
        gunModel[17].setRotationPoint(-47.5F, -19F, -2.1F);

        gunModel[18].addBox(0F, 0F, 0F, 33, 1, 2, 0F); // Box 121
        gunModel[18].setRotationPoint(-47.5F, -16.75F, -2.25F);
        gunModel[18].rotateAngleX = -0.76794487F;

        gunModel[19].addBox(0F, 0F, -2F, 33, 1, 2, 0F); // Box 122
        gunModel[19].setRotationPoint(-47.5F, -16.75F, 2.25F);
        gunModel[19].rotateAngleX = 0.76794487F;

        gunModel[20].addBox(0F, 0F, 0F, 33, 1, 3, 0F); // Box 124
        gunModel[20].setRotationPoint(-47.5F, -15.6F, -1.5F);

        gunModel[21].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 146
        gunModel[21].setRotationPoint(-29.5F, -23.25F, -1.5F);

        gunModel[22].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 147
        gunModel[22].setRotationPoint(-29F, -23.5F, -0.5F);

        gunModel[23].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 158
        gunModel[23].setRotationPoint(1.5F, -15.8F, -3F);
        gunModel[23].rotateAngleX = -0.76794487F;

        gunModel[24].addBox(0F, 0F, -2F, 2, 1, 2, 0F); // Box 159
        gunModel[24].setRotationPoint(1.5F, -15.8F, 3F);
        gunModel[24].rotateAngleX = 0.76794487F;

        gunModel[25].addBox(0F, 0F, -2F, 2, 1, 2, 0F); // Box 160
        gunModel[25].setRotationPoint(1.5F, -21.25F, -2.25F);
        gunModel[25].rotateAngleX = 0.76794487F;

        gunModel[26].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 161
        gunModel[26].setRotationPoint(1.5F, -21.25F, 2.25F);
        gunModel[26].rotateAngleX = -0.76794487F;

        gunModel[27].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 162
        gunModel[27].setRotationPoint(-52.5F, -16F, -3F);
        gunModel[27].rotateAngleX = -0.76794487F;

        gunModel[28].addBox(0F, 1F, -2F, 1, 1, 2, 0F); // Box 163
        gunModel[28].setRotationPoint(-52.5F, -21.25F, -2.25F);
        gunModel[28].rotateAngleX = 0.76794487F;

        gunModel[29].addBox(0F, 1F, 0F, 1, 1, 2, 0F); // Box 164
        gunModel[29].setRotationPoint(-52.5F, -21.25F, 2.25F);
        gunModel[29].rotateAngleX = -0.76794487F;

        gunModel[30].addBox(0F, -1F, -2F, 1, 1, 2, 0F); // Box 165
        gunModel[30].setRotationPoint(-52.5F, -16F, 3F);
        gunModel[30].rotateAngleX = 0.76794487F;

        gunModel[31].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 168
        gunModel[31].setRotationPoint(-39.5F, -21F, -2.01F);

        gunModel[32].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 169
        gunModel[32].setRotationPoint(-39.5F, -19F, -4.01F);

        gunModel[33].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 170
        gunModel[33].setRotationPoint(-39.5F, -19F, 3.01F);

        gunModel[34].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 171
        gunModel[34].setRotationPoint(-39.5F, -20F, -3.01F);

        gunModel[35].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 172
        gunModel[35].setRotationPoint(-39.5F, -20F, 2.01F);

        gunModel[36].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 173
        gunModel[36].setRotationPoint(-39.5F, -16F, -3.01F);

        gunModel[37].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 174
        gunModel[37].setRotationPoint(-39.5F, -16F, 2.01F);

        gunModel[38].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 175
        gunModel[38].setRotationPoint(-19.5F, -16F, -3.01F);

        gunModel[39].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 176
        gunModel[39].setRotationPoint(-19.5F, -19F, -4.01F);

        gunModel[40].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
        gunModel[40].setRotationPoint(-19.5F, -20F, -3.01F);

        gunModel[41].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 178
        gunModel[41].setRotationPoint(-19.5F, -21F, -2.01F);

        gunModel[42].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 179
        gunModel[42].setRotationPoint(-19.5F, -20F, 2.01F);

        gunModel[43].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 180
        gunModel[43].setRotationPoint(-19.5F, -19F, 3.01F);

        gunModel[44].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 181
        gunModel[44].setRotationPoint(-19.5F, -16F, 2.01F);

        gunModel[45].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 182
        gunModel[45].setRotationPoint(-30F, -19.75F, -6.25F);

        gunModel[46].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 183
        gunModel[46].setRotationPoint(-29.5F, -19.25F, -6.5F);

        gunModel[47].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 184
        gunModel[47].setRotationPoint(-29F, -18.25F, -6.75F);

        gunModel[48].addBox(0F, 0F, 0F, 120, 4, 4, 0F); // Box 56
        gunModel[48].setRotationPoint(-16F, -12.5F, -2F);

        gunModel[49].addBox(4F, -1F, 0F, 7, 1, 7, 0F); // Box 52
        gunModel[49].setRotationPoint(2.5F, -20.5F, -3.5F);
        gunModel[49].rotateAngleZ = 1.91986218F;

        gunModel[50].addBox(1F, -1F, 0F, 3, 1, 3, 0F); // Box 53
        gunModel[50].setRotationPoint(2.5F, -20.5F, -1.5F);
        gunModel[50].rotateAngleZ = 1.91986218F;

        gunModel[51].addBox(4F, -1F, 0F, 6, 1, 6, 0F); // Box 54
        gunModel[51].setRotationPoint(-51.5F, -18.5F, -3F);
        gunModel[51].rotateAngleZ = 1.15191731F;

        gunModel[52].addBox(1F, -1F, 0F, 3, 1, 2, 0F); // Box 55
        gunModel[52].setRotationPoint(-51.5F, -18.5F, -1F);
        gunModel[52].rotateAngleZ = 1.15191731F;

        gunModel[53].addBox(0F, 0F, 0F, 73, 7, 6, 0F); // Box 56
        gunModel[53].setRotationPoint(-43F, -11F, -3F);

        gunModel[54].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // Box 57
        gunModel[54].setRotationPoint(30F, -11F, -2.99F);
        gunModel[54].rotateAngleZ = -0.05235988F;

        gunModel[55].addBox(-2F, 0F, 0F, 2, 2, 6, 0F); // Box 58
        gunModel[55].setRotationPoint(31.68F, -4.9F, -3.01F);
        gunModel[55].rotateAngleZ = -1.11701072F;

        gunModel[56].addBox(0F, 0F, 0F, 61, 2, 6, 0F); // Box 62
        gunModel[56].setRotationPoint(-43F, -4F, -3.01F);
        gunModel[56].rotateAngleZ = 0.03316126F;

        gunModel[57].addBox(0F, 0F, 0F, 15, 7, 1, 0F); // Box 63
        gunModel[57].setRotationPoint(-57F, -6F, -3.01F);
        gunModel[57].rotateAngleZ = 0.3403392F;

        gunModel[58].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 64
        gunModel[58].setRotationPoint(-47.9F, -4F, -2.98F);

        gunModel[59].addBox(0F, 0F, 0F, 6, 8, 6, 0F); // Box 65
        gunModel[59].setRotationPoint(-60F, -6F, -3.01F);

        gunModel[60].addBox(0F, -3.5F, 0F, 6, 8, 6, 0F); // Box 66
        gunModel[60].setRotationPoint(-60F, 2F, -3F);
        gunModel[60].rotateAngleZ = -0.19198622F;

        gunModel[61].addBox(0F, -1F, 0F, 4, 2, 6, 0F); // Box 67
        gunModel[61].setRotationPoint(-55F, 1F, -3.02F);
        gunModel[61].rotateAngleZ = 0.65449847F;

        gunModel[62].addBox(0F, 0F, 0F, 28, 7, 6, 0F); // Box 68
        gunModel[62].setRotationPoint(-88F, -8F, -3.01F);

        gunModel[63].addBox(0F, 2F, 0F, 24, 11, 6, 0F); // Box 69
        gunModel[63].setRotationPoint(-88.5F, -3F, -3.01F);
        gunModel[63].rotateAngleZ = 0.26179939F;

        gunModel[64].addBox(-2F, -2.5F, 0F, 7, 6, 6, 0F); // Box 70
        gunModel[64].setRotationPoint(-62.25F, 0.5F, -2.98F);
        gunModel[64].rotateAngleZ = -0.71558499F;

        gunModel[65].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 71
        gunModel[65].setRotationPoint(-60F, -8F, -3F);
        gunModel[65].rotateAngleZ = -1.09955743F;

        gunModel[66].addBox(0F, 0F, 0F, 5, 8, 4, 0F); // Box 72
        gunModel[66].setRotationPoint(-91F, -3F, -2F);

        gunModel[67].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 73
        gunModel[67].setRotationPoint(-91F, -6F, -1F);

        gunModel[68].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 74
        gunModel[68].setRotationPoint(-91F, 6F, -1F);

        gunModel[69].addBox(0F, 0F, 0F, 5, 18, 6, 0F); // Box 75
        gunModel[69].setRotationPoint(-95F, -7F, -3F);
        gunModel[69].rotateAngleZ = 0.10471976F;

        gunModel[70].addBox(0F, 0F, 0F, 4, 3, 6, 0F); // Box 83
        gunModel[70].setRotationPoint(-40F, -14F, -3F);

        gunModel[71].addBox(0F, 0F, 0F, 26, 4, 5, 0F); // Box 150
        gunModel[71].setRotationPoint(-41.01F, -13.26F, -2.5F);

        gunModel[72].addBox(0F, 0F, 0F, 4, 3, 6, 0F); // Box 80
        gunModel[72].setRotationPoint(-20F, -14F, -3F);

        gunModel[73].addBox(0F, 0F, 0F, 15, 7, 1, 0F); // Box 82
        gunModel[73].setRotationPoint(-57F, -6F, 2.01F);
        gunModel[73].rotateAngleZ = 0.3403392F;

        gunModel[74].addBox(0F, 1F, 0F, 15, 6, 4, 0F); // Box 83
        gunModel[74].setRotationPoint(-57F, -6F, -2F);
        gunModel[74].rotateAngleZ = 0.3403392F;

        gunModel[75].addBox(0F, 0F, 0F, 11, 6, 4, 0F); // Box 84
        gunModel[75].setRotationPoint(-57F, -6F, -2F);
        gunModel[75].rotateAngleZ = 0.2443461F;

        gunModel[76].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 89
        gunModel[76].setRotationPoint(-57F, -6F, 2F);
        gunModel[76].rotateAngleX = -0.71558499F;
        gunModel[76].rotateAngleZ = 0.3403392F;

        gunModel[77].addBox(0F, 0F, -1F, 11, 2, 1, 0F); // Box 90
        gunModel[77].setRotationPoint(-57F, -6F, -2F);
        gunModel[77].rotateAngleX = 0.71558499F;
        gunModel[77].rotateAngleZ = 0.3403392F;

        gunModel[78].addBox(0F, 0F, 0F, 16, 3, 1, 0F); // Box 92
        gunModel[78].setRotationPoint(-36F, -14F, 2F);

        gunModel[79].addBox(0F, 0F, 0F, 16, 1, 4, 0F); // Box 93
        gunModel[79].setRotationPoint(-36F, -14F, -2F);

        gunModel[80].addBox(-81F, 12.5F, -1.51F, 1, 1, 3, 0F); // Box 156
        gunModel[80].setRotationPoint(-1.5F, -12F, 0F);
        gunModel[80].rotateAngleZ = 0.08726646F;

        gunModel[81].addBox(-81F, 14.5F, -1.51F, 1, 1, 3, 0F); // Box 157
        gunModel[81].setRotationPoint(-1.5F, -12F, 0F);
        gunModel[81].rotateAngleZ = 0.08726646F;

        gunModel[82].addBox(-81F, 13.5F, -1.51F, 1, 1, 1, 0F); // Box 158
        gunModel[82].setRotationPoint(-1.5F, -12F, 0F);
        gunModel[82].rotateAngleZ = 0.08726646F;

        gunModel[83].addBox(-81F, 13.5F, 0.51F, 1, 1, 1, 0F); // Box 159
        gunModel[83].setRotationPoint(-1.5F, -12F, 0F);
        gunModel[83].rotateAngleZ = 0.08726646F;

        gunModel[84].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 98
        gunModel[84].setRotationPoint(23F, -4F, 1.5F);
        gunModel[84].rotateAngleX = 0.20943951F;

        gunModel[85].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 100
        gunModel[85].setRotationPoint(27F, -4F, 1.5F);
        gunModel[85].rotateAngleX = 0.20943951F;

        gunModel[86].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 101
        gunModel[86].setRotationPoint(21F, -4F, 1.5F);
        gunModel[86].rotateAngleX = 0.20943951F;

        gunModel[87].addBox(0F, 3F, 0F, 1, 1, 1, 0F); // Box 114
        gunModel[87].setRotationPoint(27F, -4F, 1.5F);
        gunModel[87].rotateAngleX = 0.20943951F;

        gunModel[88].addBox(1F, 3F, 0F, 1, 1, 1, 0F); // Box 115
        gunModel[88].setRotationPoint(21F, -4F, 1.5F);
        gunModel[88].rotateAngleX = 0.20943951F;

        gunModel[89].addBox(0F, 0F, -1F, 4, 5, 1, 0F); // Box 116
        gunModel[89].setRotationPoint(23F, -4F, -1.5F);
        gunModel[89].rotateAngleX = -0.20943951F;

        gunModel[90].addBox(0F, 0F, -1F, 2, 3, 1, 0F); // Box 117
        gunModel[90].setRotationPoint(27F, -4F, -1.5F);
        gunModel[90].rotateAngleX = -0.20943951F;

        gunModel[91].addBox(0F, 0F, -1F, 2, 3, 1, 0F); // Box 118
        gunModel[91].setRotationPoint(21F, -4F, -1.5F);
        gunModel[91].rotateAngleX = -0.20943951F;

        gunModel[92].addBox(0F, 3F, -1F, 1, 1, 1, 0F); // Box 119
        gunModel[92].setRotationPoint(27F, -4F, -1.5F);
        gunModel[92].rotateAngleX = -0.20943951F;

        gunModel[93].addBox(1F, 3F, -1F, 1, 1, 1, 0F); // Box 120
        gunModel[93].setRotationPoint(21F, -4F, -1.5F);
        gunModel[93].rotateAngleX = -0.20943951F;

        gunModel[94].addBox(3F, 1F, -0.5F, 8, 2, 2, 0F); // Box 121
        gunModel[94].setRotationPoint(23F, -4F, 1.5F);
        gunModel[94].rotateAngleX = 0.20943951F;

        gunModel[95].addBox(3F, 1F, -1.5F, 8, 2, 2, 0F); // Box 122
        gunModel[95].setRotationPoint(23F, -4F, -1.5F);
        gunModel[95].rotateAngleX = -0.20943951F;

        gunModel[96].addBox(11F, 1.5F, 0.5F, 8, 1, 1, 0F); // Box 123
        gunModel[96].setRotationPoint(23F, -4F, 1F);
        gunModel[96].rotateAngleX = 0.20943951F;

        gunModel[97].addBox(11F, 1.5F, -0.5F, 8, 1, 1, 0F); // Box 124
        gunModel[97].setRotationPoint(23F, -4F, -2F);
        gunModel[97].rotateAngleX = -0.20943951F;

        gunModel[98].addBox(3F, 1F, -0.5F, 10, 2, 2, 0F); // Box 125
        gunModel[98].setRotationPoint(39F, -4F, 1.5F);
        gunModel[98].rotateAngleX = 0.20943951F;

        gunModel[99].addBox(3F, 1F, -1.5F, 10, 2, 2, 0F); // Box 126
        gunModel[99].setRotationPoint(39F, -4F, -1.5F);
        gunModel[99].rotateAngleX = -0.20943951F;

        gunModel[100].addBox(3F, 0.5F, -1F, 2, 3, 3, 0F); // Box 127
        gunModel[100].setRotationPoint(49F, -4F, 1.5F);
        gunModel[100].rotateAngleX = 0.20943951F;

        gunModel[101].addBox(3F, 0.5F, -2F, 2, 3, 3, 0F); // Box 128
        gunModel[101].setRotationPoint(49F, -4F, -1.5F);
        gunModel[101].rotateAngleX = -0.20943951F;

        gunModel[102].addBox(3F, 0F, -1.5F, 1, 4, 4, 0F); // Box 129
        gunModel[102].setRotationPoint(51F, -4F, 1.5F);
        gunModel[102].rotateAngleX = 0.20943951F;

        gunModel[103].addBox(3F, 0F, -2.5F, 1, 4, 4, 0F); // Box 130
        gunModel[103].setRotationPoint(51F, -4F, -1.5F);
        gunModel[103].rotateAngleX = -0.20943951F;

        gunModel[104].addBox(3.5F, 0.5F, -1F, 1, 3, 3, 0F); // Box 131
        gunModel[104].setRotationPoint(51F, -4F, 1.5F);
        gunModel[104].rotateAngleX = 0.20943951F;

        gunModel[105].addBox(3.5F, 0.5F, -2F, 1, 3, 3, 0F); // Box 132
        gunModel[105].setRotationPoint(51F, -4F, -1.5F);
        gunModel[105].rotateAngleX = -0.20943951F;

        gunModel[106].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 133
        gunModel[106].setRotationPoint(104F, -12.5F, -2F);

        gunModel[107].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 134
        gunModel[107].setRotationPoint(104F, -9.5F, -2F);

        gunModel[108].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 135
        gunModel[108].setRotationPoint(104F, -11.5F, -2F);

        gunModel[109].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 136
        gunModel[109].setRotationPoint(104F, -11.5F, 1F);

        gunModel[110].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 66
        gunModel[110].setRotationPoint(-45.5F, -3.5F, -0.5F);
        gunModel[110].rotateAngleZ = 0.10471976F;

        gunModel[111].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 101
        gunModel[111].setRotationPoint(-47F, 2.25F, -1F);

        gunModel[112].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 102
        gunModel[112].setRotationPoint(-40F, 3.25F, -1F);
        gunModel[112].rotateAngleZ = 0.78539816F;

        gunModel[113].addBox(-2F, -1F, 0F, 2, 1, 2, 0F); // Box 104
        gunModel[113].setRotationPoint(-47F, 3.25F, -1F);
        gunModel[113].rotateAngleZ = -0.78539816F;

        gunModel[114].addBox(0F, -1F, 0F, 1, 4, 2, 0F); // Box 105
        gunModel[114].setRotationPoint(-48.5F, -1.25F, -1F);

        gunModel[115].addBox(0F, -1F, 0F, 1, 4, 2, 0F); // Box 71
        gunModel[115].setRotationPoint(-39.5F, -1.25F, -1F);

        gunModel[116].addBox(0F, -1F, 0F, 1, 4, 2, 0F); // Box 143
        gunModel[116].setRotationPoint(-47.4F, -2.25F, -1.01F);
        gunModel[116].rotateAngleZ = -0.36651914F;


        pumpModel = new ModelRendererTurbo[7];
        pumpModel[0] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 125
        pumpModel[1] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 126
        pumpModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 81
        pumpModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 85
        pumpModel[4] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 86
        pumpModel[5] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 87
        pumpModel[6] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 88

        pumpModel[0].addBox(-2F, 0F, -6F, 2, 2, 6, 0F); // Box 125
        pumpModel[0].setRotationPoint(-42F, -12F, -2.01F);
        pumpModel[0].rotateAngleX = 0.66322512F;
        pumpModel[0].rotateAngleY = -0.08726646F;

        pumpModel[1].addBox(-2.5F, -0.5F, -8F, 3, 3, 3, 0F); // Box 126
        pumpModel[1].setRotationPoint(-42F, -12F, -2.01F);
        pumpModel[1].rotateAngleX = 0.66322512F;
        pumpModel[1].rotateAngleY = -0.08726646F;

        pumpModel[2].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 81
        pumpModel[2].setRotationPoint(-47F, -12.5F, -2F);

        pumpModel[3].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 85
        pumpModel[3].setRotationPoint(-47F, -12.5F, 1F);

        pumpModel[4].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 86
        pumpModel[4].setRotationPoint(-47F, -12.5F, -1F);

        pumpModel[5].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 87
        pumpModel[5].setRotationPoint(-47F, -9.5F, -1F);

        pumpModel[6].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Box 88
        pumpModel[6].setRotationPoint(-46F, -12.5F, -2F);



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

        pumpDelayAfterReload = 40;
        pumpDelay = 10;
        pumpTime = 10;
        gripIsOnPump = false;
        pumpHandleDistance = 0.45F;

        chargeModifier = new Vector3f (0.25F, -0.25F, -0.095F);

        crouchZoom = -0.05F;
        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

        thirdPersonOffset = new Vector3f(-0.05F, -0.05F, 0F);//forward/up/?
        thirdPersonScale = 0.7f;

        flipAll();
    }
}