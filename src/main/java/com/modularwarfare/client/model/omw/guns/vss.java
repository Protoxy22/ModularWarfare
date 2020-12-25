package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;
import org.lwjgl.util.vector.Vector3f;

public class vss extends ModelGun {


    int textureX = 256;
    int textureY = 256;


    public vss() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[123];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
        gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 35
        gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 36
        gunModel[3] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 37
        gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 38
        gunModel[5] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 39
        gunModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 40
        gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41
        gunModel[8] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 42
        gunModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 47
        gunModel[10] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 97
        gunModel[11] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 98
        gunModel[12] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 99
        gunModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 101
        gunModel[14] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 102
        gunModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 103
        gunModel[16] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 104
        gunModel[17] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 105
        gunModel[18] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 138
        gunModel[19] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 139
        gunModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 140
        gunModel[21] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 141
        gunModel[22] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 142
        gunModel[23] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 143
        gunModel[24] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 161
        gunModel[25] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 162
        gunModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 163
        gunModel[27] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 164
        gunModel[28] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 106
        gunModel[29] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 38
        gunModel[30] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 39
        gunModel[31] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 40
        gunModel[32] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 41
        gunModel[33] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 42
        gunModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 43
        gunModel[35] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 44
        gunModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 45
        gunModel[37] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 46
        gunModel[38] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 47
        gunModel[39] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 48
        gunModel[40] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 49
        gunModel[41] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 107
        gunModel[42] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 108
        gunModel[43] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 109
        gunModel[44] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 110
        gunModel[45] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 111
        gunModel[46] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 56
        gunModel[47] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 57
        gunModel[48] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 58
        gunModel[49] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 59
        gunModel[50] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 60
        gunModel[51] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 61
        gunModel[52] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 62
        gunModel[53] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 63
        gunModel[54] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 64
        gunModel[55] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 65
        gunModel[56] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 66
        gunModel[57] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 67
        gunModel[58] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 68
        gunModel[59] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 69
        gunModel[60] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 70
        gunModel[61] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 144
        gunModel[62] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 145
        gunModel[63] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 146
        gunModel[64] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 147
        gunModel[65] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 148
        gunModel[66] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 149
        gunModel[67] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 151
        gunModel[68] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 152
        gunModel[69] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 153
        gunModel[70] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 154
        gunModel[71] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 155
        gunModel[72] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 81
        gunModel[73] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 125
        gunModel[74] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 126
        gunModel[75] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 127
        gunModel[76] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 128
        gunModel[77] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 129
        gunModel[78] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 130
        gunModel[79] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 100
        gunModel[80] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 101
        gunModel[81] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 102
        gunModel[82] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 103
        gunModel[83] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 108
        gunModel[84] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 109
        gunModel[85] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 111
        gunModel[86] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 112
        gunModel[87] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 113
        gunModel[88] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 114
        gunModel[89] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 114
        gunModel[90] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 115
        gunModel[91] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 116
        gunModel[92] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 122
        gunModel[93] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 146
        gunModel[94] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 147
        gunModel[95] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 162
        gunModel[96] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 163
        gunModel[97] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 164
        gunModel[98] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 165
        gunModel[99] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 166
        gunModel[100] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 167
        gunModel[101] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 182
        gunModel[102] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 183
        gunModel[103] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 184
        gunModel[104] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 136
        gunModel[105] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 137
        gunModel[106] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 138
        gunModel[107] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 139
        gunModel[108] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 140
        gunModel[109] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 141
        gunModel[110] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 142
        gunModel[111] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 143
        gunModel[112] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 144
        gunModel[113] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 145
        gunModel[114] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 146
        gunModel[115] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 147
        gunModel[116] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 148
        gunModel[117] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 149
        gunModel[118] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 150
        gunModel[119] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 128
        gunModel[120] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 129
        gunModel[121] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 130
        gunModel[122] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 131

        gunModel[0].addBox(0F, 0F, 0F, 20, 3, 5, 0F); // Box 34
        gunModel[0].setRotationPoint(-29.5F, -14.5F, -2.51F);

        gunModel[1].addBox(0F, 0F, 0F, 32, 1, 5, 0F); // Box 35
        gunModel[1].setRotationPoint(-29.5F, -15.5F, -2.5F);

        gunModel[2].addBox(0F, 0F, 0F, 46, 1, 3, 0F); // Box 36
        gunModel[2].setRotationPoint(-29.51F, -16.5F, -1.5F);

        gunModel[3].addBox(0F, 0F, -2F, 46, 1, 2, 0F); // Box 37
        gunModel[3].setRotationPoint(-29.51F, -16.5F, -1.5F);
        gunModel[3].rotateAngleX = 1.06465084F;

        gunModel[4].addBox(0F, 0F, 0F, 46, 1, 2, 0F); // Box 38
        gunModel[4].setRotationPoint(-29.51F, -16.5F, 1.5F);
        gunModel[4].rotateAngleX = -1.06465084F;

        gunModel[5].addBox(0F, 0F, 0F, 37, 6, 5, 0F); // Box 39
        gunModel[5].setRotationPoint(-33.5F, -12F, -2.5F);
        gunModel[5].rotateAngleZ = 0.01745329F;

        gunModel[6].addBox(0F, 0F, 0F, 13, 2, 4, 0F); // Box 40
        gunModel[6].setRotationPoint(-9.5F, -14.5F, -2.5F);

        gunModel[7].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 41
        gunModel[7].setRotationPoint(-9.5F, -13.5F, 1.5F);
        gunModel[7].rotateAngleX = -1.20427718F;

        gunModel[8].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 42
        gunModel[8].setRotationPoint(-33F, -14.5F, -2.52F);
        gunModel[8].rotateAngleZ = 0.27925268F;

        gunModel[9].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 47
        gunModel[9].setRotationPoint(-32.05F, -14.9F, -1.5F);
        gunModel[9].rotateAngleZ = 0.55850536F;

        gunModel[10].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 97
        gunModel[10].setRotationPoint(-15F, -7F, -1.5F);

        gunModel[11].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 98
        gunModel[11].setRotationPoint(-15F, -4F, -1.5F);

        gunModel[12].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 99
        gunModel[12].setRotationPoint(-12.55F, -5F, -1.5F);
        gunModel[12].rotateAngleZ = -0.40142573F;

        gunModel[13].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 101
        gunModel[13].setRotationPoint(-22F, -2F, -1F);

        gunModel[14].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 102
        gunModel[14].setRotationPoint(-15F, -1F, -1F);
        gunModel[14].rotateAngleZ = 0.78539816F;

        gunModel[15].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 103
        gunModel[15].setRotationPoint(-33.5F, -13F, -2.5F);
        gunModel[15].rotateAngleZ = 0.01745329F;

        gunModel[16].addBox(-2F, -1F, 0F, 2, 1, 2, 0F); // Box 104
        gunModel[16].setRotationPoint(-22F, -1F, -1F);
        gunModel[16].rotateAngleZ = -0.78539816F;

        gunModel[17].addBox(-2F, -1F, 0F, 1, 4, 2, 0F); // Box 105
        gunModel[17].setRotationPoint(-21.5F, -5.5F, -1F);

        gunModel[18].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 138
        gunModel[18].setRotationPoint(-22.5F, -16.75F, -1.5F);

        gunModel[19].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 139
        gunModel[19].setRotationPoint(-22.5F, -16.75F, -1.5F);
        gunModel[19].rotateAngleX = 1.06465084F;

        gunModel[20].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 140
        gunModel[20].setRotationPoint(-22.5F, -16.75F, 1.5F);
        gunModel[20].rotateAngleX = -1.06465084F;

        gunModel[21].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 141
        gunModel[21].setRotationPoint(-12.5F, -16.75F, -1.5F);

        gunModel[22].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 142
        gunModel[22].setRotationPoint(-12.5F, -16.75F, -1.5F);
        gunModel[22].rotateAngleX = 1.06465084F;

        gunModel[23].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 143
        gunModel[23].setRotationPoint(-12.5F, -16.75F, 1.5F);
        gunModel[23].rotateAngleX = -1.06465084F;

        gunModel[24].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 161
        gunModel[24].setRotationPoint(-29.5F, -11F, -3F);
        gunModel[24].rotateAngleZ = 0.15707963F;

        gunModel[25].addBox(5F, 0F, 0F, 5, 2, 1, 0F); // Box 162
        gunModel[25].setRotationPoint(-29.5F, -11F, -3F);
        gunModel[25].rotateAngleZ = 0.15707963F;

        gunModel[26].addBox(0.5F, 1.5F, 0F, 1, 1, 1, 0F); // Box 163
        gunModel[26].setRotationPoint(-29.5F, -11F, -3.25F);
        gunModel[26].rotateAngleZ = 0.15707963F;

        gunModel[27].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 164
        gunModel[27].setRotationPoint(-33.93F, -12.55F, -1.52F);
        gunModel[27].rotateAngleZ = 0.89011792F;

        gunModel[28].addBox(-2F, -1F, 0F, 1, 5, 1, 0F); // Box 106
        gunModel[28].setRotationPoint(-19.5F, -7F, -0.5F);
        gunModel[28].rotateAngleZ = 0.38397244F;

        gunModel[29].addBox(0F, 0F, 0F, 14, 3, 5, 0F); // Box 38
        gunModel[29].setRotationPoint(-11F, -6.8F, -2.51F);
        gunModel[29].rotateAngleZ = 0.20943951F;

        gunModel[30].addBox(0F, -6F, 0F, 12, 6, 5, 0F); // Box 39
        gunModel[30].setRotationPoint(3.5F, -6.7F, -2.51F);
        gunModel[30].rotateAngleZ = 0.15707963F;

        gunModel[31].addBox(0F, -6F, 0F, 12, 3, 5, 0F); // Box 40
        gunModel[31].setRotationPoint(2.55F, -9.6F, -2.52F);

        gunModel[32].addBox(0F, -6F, 0F, 2, 7, 5, 0F); // Box 41
        gunModel[32].setRotationPoint(14.5F, -9.6F, -2.51F);

        gunModel[33].addBox(0F, 0F, 0F, 45, 3, 4, 0F); // Box 42
        gunModel[33].setRotationPoint(16.5F, -13.5F, -1.9F);

        gunModel[34].addBox(0F, 0F, 0F, 45, 1, 1, 0F); // Box 43
        gunModel[34].setRotationPoint(16.5F, -14.5F, -0.5F);

        gunModel[35].addBox(0F, 0F, 0F, 45, 1, 1, 0F); // Box 44
        gunModel[35].setRotationPoint(16.5F, -10.5F, -0.5F);

        gunModel[36].addBox(0F, 0F, 0F, 45, 1, 2, 0F); // Box 45
        gunModel[36].setRotationPoint(16.5F, -14.5F, 0.5F);
        gunModel[36].rotateAngleX = -0.57595865F;

        gunModel[37].addBox(0F, 0F, 0F, 45, 3, 4, 0F); // Box 46
        gunModel[37].setRotationPoint(16.5F, -13.5F, -2.1F);

        gunModel[38].addBox(0F, 0F, -2F, 45, 1, 2, 0F); // Box 47
        gunModel[38].setRotationPoint(16.5F, -14.5F, -0.5F);
        gunModel[38].rotateAngleX = 0.57595865F;

        gunModel[39].addBox(0F, -1F, 0F, 45, 1, 2, 0F); // Box 48
        gunModel[39].setRotationPoint(16.5F, -9.5F, 0.5F);
        gunModel[39].rotateAngleX = 0.57595865F;

        gunModel[40].addBox(0F, -1F, -2F, 45, 1, 2, 0F); // Box 49
        gunModel[40].setRotationPoint(16.5F, -9.5F, -0.5F);
        gunModel[40].rotateAngleX = -0.57595865F;

        gunModel[41].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 107
        gunModel[41].setRotationPoint(-32.5F, -7F, -2F);

        gunModel[42].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 108
        gunModel[42].setRotationPoint(-31.5F, -5F, -2.01F);

        gunModel[43].addBox(0F, -1F, 0F, 6, 12, 4, 0F); // Box 109
        gunModel[43].setRotationPoint(-31.5F, -3F, -1.99F);
        gunModel[43].rotateAngleZ = -0.2268928F;

        gunModel[44].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Box 110
        gunModel[44].setRotationPoint(-34.8F, 7F, -2F);

        gunModel[45].addBox(0F, -1F, 0F, 3, 4, 4, 0F); // Box 111
        gunModel[45].setRotationPoint(-33F, 4.6F, -2.01F);
        gunModel[45].rotateAngleZ = -0.40142573F;

        gunModel[46].addBox(0F, 0F, 0F, 51, 3, 4, 0F); // Box 56
        gunModel[46].setRotationPoint(-83.8F, 7F, -2F);
        gunModel[46].rotateAngleZ = 0.05235988F;

        gunModel[47].addBox(0F, -1F, 0F, 6, 3, 4, 0F); // Box 57
        gunModel[47].setRotationPoint(-39.8F, 6.3F, -2.01F);
        gunModel[47].rotateAngleZ = -0.31415927F;

        gunModel[48].addBox(0F, 0F, 0F, 51, 3, 4, 0F); // Box 58
        gunModel[48].setRotationPoint(-83.8F, -11F, -2F);
        gunModel[48].rotateAngleZ = 0.01745329F;

        gunModel[49].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 59
        gunModel[49].setRotationPoint(-41.8F, -11.7F, -2.01F);
        gunModel[49].rotateAngleZ = 0.26179939F;

        gunModel[50].addBox(0F, 0F, 0F, 6, 15, 3, 0F); // Box 60
        gunModel[50].setRotationPoint(-57.8F, -9F, -1.51F);
        gunModel[50].rotateAngleZ = 0.01745329F;

        gunModel[51].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 61
        gunModel[51].setRotationPoint(-60.8F, -9F, -1.5F);
        gunModel[51].rotateAngleZ = 0.89011792F;

        gunModel[52].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 62
        gunModel[52].setRotationPoint(-56.8F, 3F, -1.5F);
        gunModel[52].rotateAngleZ = -0.89011792F;

        gunModel[53].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 63
        gunModel[53].setRotationPoint(-50.8F, -10F, -1.5F);
        gunModel[53].rotateAngleZ = -0.89011792F;

        gunModel[54].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 64
        gunModel[54].setRotationPoint(-53F, 4.5F, -1.5F);
        gunModel[54].rotateAngleZ = 0.89011792F;

        gunModel[55].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 65
        gunModel[55].setRotationPoint(-37.8F, -10.78F, -2.02F);
        gunModel[55].rotateAngleZ = -0.15707963F;

        gunModel[56].addBox(0F, 0F, 0F, 4, 23, 5, 0F); // Box 66
        gunModel[56].setRotationPoint(-84.8F, -12F, -2.5F);

        gunModel[57].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 67
        gunModel[57].setRotationPoint(-81F, -3F, -2.01F);
        gunModel[57].rotateAngleZ = -1.22173048F;

        gunModel[58].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 68
        gunModel[58].setRotationPoint(-83.5F, -7F, -2.01F);
        gunModel[58].rotateAngleZ = 0.76794487F;

        gunModel[59].addBox(0F, 0F, 0F, 2, 11, 5, 0F); // Box 69
        gunModel[59].setRotationPoint(-86.8F, -11.7F, -2.51F);
        gunModel[59].rotateAngleZ = 0.17453293F;

        gunModel[60].addBox(1F, 0F, 0F, 2, 11, 5, 0F); // Box 70
        gunModel[60].setRotationPoint(-85.8F, -0.3F, -2.51F);
        gunModel[60].rotateAngleZ = -0.17453293F;

        gunModel[61].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 144
        gunModel[61].setRotationPoint(17F, -14.5F, -1.75F);

        gunModel[62].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 145
        gunModel[62].setRotationPoint(17F, -14.5F, 0.75F);

        gunModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 146
        gunModel[63].setRotationPoint(23F, -15.5F, -1.75F);

        gunModel[64].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 147
        gunModel[64].setRotationPoint(23F, -15.5F, 0.75F);

        gunModel[65].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 148
        gunModel[65].setRotationPoint(23F, -15.5F, -1.75F);
        gunModel[65].rotateAngleZ = 0.26179939F;

        gunModel[66].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 149
        gunModel[66].setRotationPoint(23F, -15.5F, 0.75F);
        gunModel[66].rotateAngleZ = 0.26179939F;

        gunModel[67].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 151
        gunModel[67].setRotationPoint(16.9F, -16.75F, -1F);
        gunModel[67].rotateAngleZ = -0.15707963F;

        gunModel[68].addBox(0F, -0.5F, 1.51F, 1, 1, 1, 0F); // Box 152
        gunModel[68].setRotationPoint(16.9F, -16.75F, -1F);
        gunModel[68].rotateAngleZ = -0.15707963F;

        gunModel[69].addBox(0F, 0.01F, 1.5F, 4, 1, 1, 0F); // Box 153
        gunModel[69].setRotationPoint(16.9F, -16.75F, -1F);
        gunModel[69].rotateAngleZ = -0.15707963F;

        gunModel[70].addBox(0F, 0.01F, -0.5F, 4, 1, 1, 0F); // Box 154
        gunModel[70].setRotationPoint(16.9F, -16.75F, -1F);
        gunModel[70].rotateAngleZ = -0.15707963F;

        gunModel[71].addBox(0F, -0.5F, -0.49F, 1, 1, 1, 0F); // Box 155
        gunModel[71].setRotationPoint(16.9F, -16.75F, -1F);
        gunModel[71].rotateAngleZ = -0.15707963F;

        gunModel[72].addBox(-0.25F, 2.2F, 0F, 14, 1, 6, 0F); // Box 81
        gunModel[72].setRotationPoint(-11F, -6.8F, -3F);
        gunModel[72].rotateAngleZ = 0.20943951F;

        gunModel[73].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 125
        gunModel[73].setRotationPoint(57.5F, -15.5F, 0.5F);

        gunModel[74].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 126
        gunModel[74].setRotationPoint(57.5F, -17.5F, 2F);

        gunModel[75].addBox(0F, 0F, -1F, 3, 1, 1, 0F); // Box 127
        gunModel[75].setRotationPoint(57.5F, -17.5F, -1F);

        gunModel[76].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 128
        gunModel[76].setRotationPoint(57.5F, -16.5F, -2F);
        gunModel[76].rotateAngleX = 0.52359878F;

        gunModel[77].addBox(0F, 0F, -1F, 3, 3, 1, 0F); // Box 129
        gunModel[77].setRotationPoint(57.5F, -16.5F, 2F);
        gunModel[77].rotateAngleX = -0.50614548F;

        gunModel[78].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 130
        gunModel[78].setRotationPoint(58.5F, -17F, 0.5F);

        gunModel[79].addBox(0F, 0F, 0F, 3, 10, 2, 0F); // Box 100
        gunModel[79].setRotationPoint(-17.5F, -25F, 2.5F);

        gunModel[80].addBox(0F, 0F, 0F, 3, 10, 2, 0F); // Box 101
        gunModel[80].setRotationPoint(-3.5F, -25F, 2.5F);

        gunModel[81].addBox(0F, 0F, 0F, 18, 5, 8, 0F); // Box 102
        gunModel[81].setRotationPoint(-17.5F, -26F, -4F);

        gunModel[82].addBox(0F, 0F, 0F, 10, 6, 6, 0F); // Box 103
        gunModel[82].setRotationPoint(0.5F, -26.5F, -3F);

        gunModel[83].addBox(0F, 0F, 0F, 13, 6, 6, 0F); // Box 108
        gunModel[83].setRotationPoint(-41.51F, -26.51F, -3F);

        gunModel[84].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 109
        gunModel[84].setRotationPoint(-13.5F, -30F, -2F);

        gunModel[85].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 111
        gunModel[85].setRotationPoint(-43.5F, -26.5F, -3F);

        gunModel[86].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 112
        gunModel[86].setRotationPoint(-43.5F, -25.5F, -3F);

        gunModel[87].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 113
        gunModel[87].setRotationPoint(-43.5F, -25.5F, 2F);

        gunModel[88].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 114
        gunModel[88].setRotationPoint(-43.5F, -21.5F, -3F);

        gunModel[89].addBox(0F, 0F, 0F, 18, 2, 5, 0F); // Box 114
        gunModel[89].setRotationPoint(-17.5F, -27.55F, -2.5F);

        gunModel[90].addBox(0F, 0F, -2F, 18, 1, 2, 0F); // Box 115
        gunModel[90].setRotationPoint(-17.5F, -27.55F, -2.5F);
        gunModel[90].rotateAngleX = 0.76794487F;

        gunModel[91].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 116
        gunModel[91].setRotationPoint(-17.5F, -27.55F, 2.5F);
        gunModel[91].rotateAngleX = -0.76794487F;

        gunModel[92].addBox(0F, 0F, -2F, 18, 1, 2, 0F); // Box 122
        gunModel[92].setRotationPoint(-17.5F, -21.75F, 3.25F);
        gunModel[92].rotateAngleX = 0.76794487F;

        gunModel[93].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 146
        gunModel[93].setRotationPoint(-13F, -30.25F, -1.5F);

        gunModel[94].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 147
        gunModel[94].setRotationPoint(-12.5F, -30.5F, -0.5F);

        gunModel[95].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 162
        gunModel[95].setRotationPoint(-43.5F, -21.95F, -3F);
        gunModel[95].rotateAngleX = -0.76794487F;

        gunModel[96].addBox(0F, 1F, -2F, 2, 1, 2, 0F); // Box 163
        gunModel[96].setRotationPoint(-43.5F, -27.2F, -2.25F);
        gunModel[96].rotateAngleX = 0.76794487F;

        gunModel[97].addBox(0F, 1F, 0F, 2, 1, 2, 0F); // Box 164
        gunModel[97].setRotationPoint(-43.5F, -27.2F, 2.25F);
        gunModel[97].rotateAngleX = -0.76794487F;

        gunModel[98].addBox(0F, -1F, -2F, 2, 1, 2, 0F); // Box 165
        gunModel[98].setRotationPoint(-43.5F, -21.95F, 3F);
        gunModel[98].rotateAngleX = 0.76794487F;

        gunModel[99].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 166
        gunModel[99].setRotationPoint(-30.5F, -27.1F, -3.5F);

        gunModel[100].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 167
        gunModel[100].setRotationPoint(-41.5F, -27.1F, -3.5F);

        gunModel[101].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 182
        gunModel[101].setRotationPoint(-13.5F, -25F, -7.25F);

        gunModel[102].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 183
        gunModel[102].setRotationPoint(-13F, -24.5F, -7.5F);

        gunModel[103].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 184
        gunModel[103].setRotationPoint(-12.5F, -23.5F, -7.75F);

        gunModel[104].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 136
        gunModel[104].setRotationPoint(-17.5F, -21.75F, -3.25F);
        gunModel[104].rotateAngleX = -0.76794487F;

        gunModel[105].addBox(0F, 0F, 0F, 18, 2, 5, 0F); // Box 137
        gunModel[105].setRotationPoint(-17.5F, -21.65F, -2.5F);

        gunModel[106].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 138
        gunModel[106].setRotationPoint(-28.51F, -25.5F, -2F);

        gunModel[107].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 139
        gunModel[107].setRotationPoint(-18.5F, -27.1F, -3.5F);

        gunModel[108].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 140
        gunModel[108].setRotationPoint(-23F, -20F, -1F);

        gunModel[109].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 141
        gunModel[109].setRotationPoint(-24F, -19.5F, -0.5F);

        gunModel[110].addBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F); // Box 142
        gunModel[110].setRotationPoint(-25F, -18.25F, 0.5F);
        gunModel[110].rotateAngleX = 0.78539816F;

        gunModel[111].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 143
        gunModel[111].setRotationPoint(10.5F, -26.5F, -3F);

        gunModel[112].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 144
        gunModel[112].setRotationPoint(10.5F, -21.5F, -3F);

        gunModel[113].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 145
        gunModel[113].setRotationPoint(10.5F, -25.5F, -3F);

        gunModel[114].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 146
        gunModel[114].setRotationPoint(10.5F, -25.5F, 2F);

        gunModel[115].addBox(0F, -1F, -2F, 2, 1, 2, 0F); // Box 147
        gunModel[115].setRotationPoint(10.5F, -22F, 3F);
        gunModel[115].rotateAngleX = 0.76794487F;

        gunModel[116].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 148
        gunModel[116].setRotationPoint(10.5F, -22F, -3F);
        gunModel[116].rotateAngleX = -0.76794487F;

        gunModel[117].addBox(0F, 1F, -2F, 2, 1, 2, 0F); // Box 149
        gunModel[117].setRotationPoint(10.5F, -27.25F, -2.25F);
        gunModel[117].rotateAngleX = 0.76794487F;

        gunModel[118].addBox(0F, 1F, 0F, 2, 1, 2, 0F); // Box 150
        gunModel[118].setRotationPoint(10.5F, -27.25F, 2.25F);
        gunModel[118].rotateAngleX = -0.76794487F;

        gunModel[119].addBox(0F, 0F, -2F, 3, 4, 2, 0F); // Box 128
        gunModel[119].setRotationPoint(-3.5F, -15F, 4.5F);
        gunModel[119].rotateAngleX = -0.50614548F;

        gunModel[120].addBox(0F, 0F, -2F, 3, 4, 2, 0F); // Box 129
        gunModel[120].setRotationPoint(-17.5F, -15F, 4.5F);
        gunModel[120].rotateAngleX = -0.50614548F;

        gunModel[121].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 130
        gunModel[121].setRotationPoint(-3F, -24.5F, 4F);

        gunModel[122].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 131
        gunModel[122].setRotationPoint(-17F, -24.5F, 4F);

        ammoModel = new ModelRendererTurbo[9];
        ammoModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 62
        ammoModel[2] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 63
        ammoModel[3] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 64
        ammoModel[4] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 65
        ammoModel[5] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 66
        ammoModel[6] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 67
        ammoModel[7] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 68
        ammoModel[8] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 69

        ammoModel[0].addBox(0.01F, -2F, 0F, 12, 14, 4, 0F); // Box 51
        ammoModel[0].setRotationPoint(-9.8F, -4.3F, -2.25F);
        ammoModel[0].rotateAngleZ = 0.2443461F;

        ammoModel[1].addBox(-0.5F, 11.25F, 0F, 13, 2, 5, 0F); // Box 62
        ammoModel[1].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[1].rotateAngleZ = 0.2443461F;

        ammoModel[2].addBox(1F, 2F, 0F, 7, 1, 5, 0F); // Box 63
        ammoModel[2].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[2].rotateAngleZ = 0.2443461F;

        ammoModel[3].addBox(4F, 3.5F, 0F, 7, 1, 5, 0F); // Box 64
        ammoModel[3].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[3].rotateAngleZ = 0.2443461F;

        ammoModel[4].addBox(4F, 6.5F, 0F, 7, 1, 5, 0F); // Box 65
        ammoModel[4].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[4].rotateAngleZ = 0.2443461F;

        ammoModel[5].addBox(1F, 5F, 0F, 7, 1, 5, 0F); // Box 66
        ammoModel[5].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[5].rotateAngleZ = 0.2443461F;

        ammoModel[6].addBox(4F, 9.5F, 0F, 7, 1, 5, 0F); // Box 67
        ammoModel[6].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[6].rotateAngleZ = 0.2443461F;

        ammoModel[7].addBox(1F, 8F, 0F, 7, 1, 5, 0F); // Box 68
        ammoModel[7].setRotationPoint(-9.8F, -4.3F, -2.5F);
        ammoModel[7].rotateAngleZ = 0.2443461F;

        ammoModel[8].addBox(0F, -2.01F, 0F, 12, 14, 4, 0F); // Box 69
        ammoModel[8].setRotationPoint(-9.8F, -4.3F, -1.75F);
        ammoModel[8].rotateAngleZ = 0.2443461F;

        this.modelScale = 0.20F;

        translateAll = new Vector3f(30F, -12F, -0.15F);//forward/down/right

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

        crouchZoom = -0.05F;
        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

        //attachmentPointMap.put(AttachmentEnum.Sight, new Vector3f(-0.18F, 0.37F, 0F));

        translateSight = new Vector3f(0F, 2.2F, 0.07F);
        rotateSight = new Vector3f(-0.1F, 0F, 0F);


        thirdPersonOffset = new Vector3f(-0.05F, -0.05F, 0F);//forward/up/?
        thirdPersonScale = 0.7f;
        gunOffsetScoping = -1.1F;

        flipAll();
    }
}