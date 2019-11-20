package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class s12k extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public s12k() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[88];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 236
        gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
        gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
        gunModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
        gunModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 8
        gunModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
        gunModel[7] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 10
        gunModel[8] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 15
        gunModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
        gunModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
        gunModel[11] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 35
        gunModel[12] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 36
        gunModel[13] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 37
        gunModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
        gunModel[15] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 39
        gunModel[16] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 40
        gunModel[17] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 42
        gunModel[18] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 43
        gunModel[19] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 46
        gunModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 47
        gunModel[21] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 48
        gunModel[22] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 49
        gunModel[23] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 50
        gunModel[24] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 101
        gunModel[25] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 102
        gunModel[26] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 103
        gunModel[27] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 104
        gunModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 105
        gunModel[29] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 106
        gunModel[30] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 107
        gunModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 108
        gunModel[32] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 109
        gunModel[33] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 110
        gunModel[34] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 111
        gunModel[35] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 112
        gunModel[36] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 113
        gunModel[37] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 114
        gunModel[38] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 115
        gunModel[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 116
        gunModel[40] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 117
        gunModel[41] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 119
        gunModel[42] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 120
        gunModel[43] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 132
        gunModel[44] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 133
        gunModel[45] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 134
        gunModel[46] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 135
        gunModel[47] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 138
        gunModel[48] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 139
        gunModel[49] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 140
        gunModel[50] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 141
        gunModel[51] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 142
        gunModel[52] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 143
        gunModel[53] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 156
        gunModel[54] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 157
        gunModel[55] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 158
        gunModel[56] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 159
        gunModel[57] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 161
        gunModel[58] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 162
        gunModel[59] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 163
        gunModel[60] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 164
        gunModel[61] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 157
        gunModel[62] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 158
        gunModel[63] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 159
        gunModel[64] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 160
        gunModel[65] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 161
        gunModel[66] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 162
        gunModel[67] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 163
        gunModel[68] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 164
        gunModel[69] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 165
        gunModel[70] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 169
        gunModel[71] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 172
        gunModel[72] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 173
        gunModel[73] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 174
        gunModel[74] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 175
        gunModel[75] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 178
        gunModel[76] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 179
        gunModel[77] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 83
        gunModel[78] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 84
        gunModel[79] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 85
        gunModel[80] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 86
        gunModel[81] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 87
        gunModel[82] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 88
        gunModel[83] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 89
        gunModel[84] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 90
        gunModel[85] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 91
        gunModel[86] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 92
        gunModel[87] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 93

        gunModel[0].addBox(0F, 0F, 0F, 25, 3, 3, 0F); // Box 236
        gunModel[0].setRotationPoint(37.5F, -11F, -1.5F);

        gunModel[1].addBox(0F, 0F, 0F, 7, 6, 5, 0F); // Box 1
        gunModel[1].setRotationPoint(30.5F, -13.5F, -2.5F);

        gunModel[2].addBox(0F, 0F, 0F, 35, 1, 2, 0F); // Box 2
        gunModel[2].setRotationPoint(2F, -16F, -1F);

        gunModel[3].addBox(0F, 0F, 0F, 35, 1, 1, 0F); // Box 3
        gunModel[3].setRotationPoint(2F, -16F, 1F);
        gunModel[3].rotateAngleX = -0.57595865F;

        gunModel[4].addBox(0F, 0F, -1F, 35, 1, 1, 0F); // Box 4
        gunModel[4].setRotationPoint(2F, -16F, -1F);
        gunModel[4].rotateAngleX = 0.57595865F;

        gunModel[5].addBox(0F, -1F, -2F, 32, 1, 2, 0F); // Box 8
        gunModel[5].setRotationPoint(4.5F, -6F, -1F);
        gunModel[5].rotateAngleX = -0.57595865F;

        gunModel[6].addBox(0F, 0F, 0F, 32, 1, 2, 0F); // Box 9
        gunModel[6].setRotationPoint(4.5F, -7F, -1F);

        gunModel[7].addBox(0F, -1F, 0F, 32, 1, 2, 0F); // Box 10
        gunModel[7].setRotationPoint(4.5F, -6F, 1F);
        gunModel[7].rotateAngleX = 0.57595865F;

        gunModel[8].addBox(0F, 0F, 0F, 28, 6, 4, 0F); // Box 15
        gunModel[8].setRotationPoint(2.5F, -13F, -2F);

        gunModel[9].addBox(0F, 0F, 0F, 18, 2, 5, 0F); // Box 30
        gunModel[9].setRotationPoint(12.5F, -9.5F, -2.5F);

        gunModel[10].addBox(0F, 0F, 0F, 20, 3, 5, 0F); // Box 34
        gunModel[10].setRotationPoint(-29.5F, -14.5F, -2.51F);

        gunModel[11].addBox(0F, 0F, 0F, 32, 1, 5, 0F); // Box 35
        gunModel[11].setRotationPoint(-29.5F, -15.5F, -2.5F);

        gunModel[12].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 36
        gunModel[12].setRotationPoint(-29.5F, -16.5F, -1.5F);

        gunModel[13].addBox(0F, 0F, -2F, 32, 1, 2, 0F); // Box 37
        gunModel[13].setRotationPoint(-29.5F, -16.5F, -1.5F);
        gunModel[13].rotateAngleX = 1.06465084F;

        gunModel[14].addBox(0F, 0F, 0F, 32, 1, 2, 0F); // Box 38
        gunModel[14].setRotationPoint(-29.5F, -16.5F, 1.5F);
        gunModel[14].rotateAngleX = -1.06465084F;

        gunModel[15].addBox(0F, 0F, 0F, 36, 6, 5, 0F); // Box 39
        gunModel[15].setRotationPoint(-33.5F, -12F, -2.5F);
        gunModel[15].rotateAngleZ = 0.01745329F;

        gunModel[16].addBox(0F, 0F, 0F, 12, 3, 4, 0F); // Box 40
        gunModel[16].setRotationPoint(-9.5F, -14.5F, -1.51F);

        gunModel[17].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 42
        gunModel[17].setRotationPoint(-32.3F, -12.75F, -2.52F);
        gunModel[17].rotateAngleZ = 0.76794487F;

        gunModel[18].addBox(0F, 0F, 0F, 35, 3, 4, 0F); // Box 43
        gunModel[18].setRotationPoint(2.01F, -15.5F, -2F);

        gunModel[19].addBox(0F, 0F, -2F, 3, 1, 2, 0F); // Box 46
        gunModel[19].setRotationPoint(-32.05F, -14.9F, -1.5F);
        gunModel[19].rotateAngleX = 1.06465084F;
        gunModel[19].rotateAngleZ = 0.55850536F;

        gunModel[20].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 47
        gunModel[20].setRotationPoint(-32.05F, -14.9F, -1.5F);
        gunModel[20].rotateAngleZ = 0.55850536F;

        gunModel[21].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 48
        gunModel[21].setRotationPoint(-32.05F, -14.9F, 1.5F);
        gunModel[21].rotateAngleX = -1.06465084F;
        gunModel[21].rotateAngleZ = 0.55850536F;

        gunModel[22].addBox(0F, 0F, 0F, 33, 1, 1, 0F); // Box 49
        gunModel[22].setRotationPoint(4.48F, -13.5F, -2.5F);
        gunModel[22].rotateAngleX = 0.90757121F;

        gunModel[23].addBox(0F, 0F, -1F, 33, 1, 1, 0F); // Box 50
        gunModel[23].setRotationPoint(4.48F, -13.5F, 2.5F);
        gunModel[23].rotateAngleX = -0.90757121F;

        gunModel[24].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 101
        gunModel[24].setRotationPoint(-22F, -1.5F, -0.5F);

        gunModel[25].addBox(0F, -1F, 0F, 2, 1, 1, 0F); // Box 102
        gunModel[25].setRotationPoint(-16F, -0.5F, -0.5F);
        gunModel[25].rotateAngleZ = 0.78539816F;

        gunModel[26].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 103
        gunModel[26].setRotationPoint(-33.5F, -13F, -2.5F);
        gunModel[26].rotateAngleZ = 0.01745329F;

        gunModel[27].addBox(-2F, -1F, 0F, 2, 1, 1, 0F); // Box 104
        gunModel[27].setRotationPoint(-22F, -0.5F, -0.5F);
        gunModel[27].rotateAngleZ = -0.78539816F;

        gunModel[28].addBox(-2F, -1F, 0F, 1, 5, 1, 0F); // Box 105
        gunModel[28].setRotationPoint(-21.5F, -6F, -0.5F);

        gunModel[29].addBox(-2F, -1F, 0F, 1, 5, 1, 0F); // Box 106
        gunModel[29].setRotationPoint(-19.5F, -7F, -0.5F);
        gunModel[29].rotateAngleZ = 0.26179939F;

        gunModel[30].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 107
        gunModel[30].setRotationPoint(-32.5F, -7F, -2F);

        gunModel[31].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 108
        gunModel[31].setRotationPoint(-31.5F, -5F, -2.01F);

        gunModel[32].addBox(0F, -1F, 0F, 6, 12, 4, 0F); // Box 109
        gunModel[32].setRotationPoint(-31F, -4F, -1.99F);
        gunModel[32].rotateAngleZ = -0.34906585F;

        gunModel[33].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 110
        gunModel[33].setRotationPoint(-33.8F, 5F, -2F);

        gunModel[34].addBox(0F, -1F, 0F, 3, 4, 4, 0F); // Box 111
        gunModel[34].setRotationPoint(-34F, 4.6F, -2.01F);
        gunModel[34].rotateAngleZ = -0.75049158F;

        gunModel[35].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 112
        gunModel[35].setRotationPoint(-36.3F, 7F, -1.99F);
        gunModel[35].rotateAngleZ = 0.71558499F;

        gunModel[36].addBox(0F, 0F, 0F, 2, 7, 5, 0F); // Box 113
        gunModel[36].setRotationPoint(-35F, -13F, -2.51F);

        gunModel[37].addBox(0F, 0F, 0F, 5, 17, 5, 0F); // Box 114
        gunModel[37].setRotationPoint(-70F, -11F, -2.49F);

        gunModel[38].addBox(0F, 0F, 0F, 23, 11, 5, 0F); // Box 115
        gunModel[38].setRotationPoint(-69F, -11F, -2.51F);
        gunModel[38].rotateAngleZ = 0.06981317F;

        gunModel[39].addBox(0F, -5F, 0F, 36, 5, 5, 0F); // Box 116
        gunModel[39].setRotationPoint(-68F, 6F, -2.5F);
        gunModel[39].rotateAngleZ = 0.33161256F;

        gunModel[40].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 117
        gunModel[40].setRotationPoint(-46F, -12.58F, -2.49F);
        gunModel[40].rotateAngleZ = -0.50614548F;

        gunModel[41].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 119
        gunModel[41].setRotationPoint(-46F, -10F, -2.51F);
        gunModel[41].rotateAngleZ = 0.2443461F;

        gunModel[42].addBox(0F, 0F, -1.01F, 1, 7, 4, 0F); // Box 120
        gunModel[42].setRotationPoint(36.5F, -14F, -1F);

        gunModel[43].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 132
        gunModel[43].setRotationPoint(59.5F, -11.25F, -1.25F);

        gunModel[44].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 133
        gunModel[44].setRotationPoint(59.5F, -10.75F, -1.25F);

        gunModel[45].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 134
        gunModel[45].setRotationPoint(59.5F, -10.75F, -1.75F);

        gunModel[46].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 135
        gunModel[46].setRotationPoint(59.5F, -11.25F, -1.75F);

        gunModel[47].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 138
        gunModel[47].setRotationPoint(-22.5F, -16.75F, -1.5F);

        gunModel[48].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 139
        gunModel[48].setRotationPoint(-22.5F, -16.75F, -1.5F);
        gunModel[48].rotateAngleX = 1.06465084F;

        gunModel[49].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 140
        gunModel[49].setRotationPoint(-22.5F, -16.75F, 1.5F);
        gunModel[49].rotateAngleX = -1.06465084F;

        gunModel[50].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 141
        gunModel[50].setRotationPoint(-12.5F, -16.75F, -1.5F);

        gunModel[51].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 142
        gunModel[51].setRotationPoint(-12.5F, -16.75F, -1.5F);
        gunModel[51].rotateAngleX = 1.06465084F;

        gunModel[52].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 143
        gunModel[52].setRotationPoint(-12.5F, -16.75F, 1.5F);
        gunModel[52].rotateAngleX = -1.06465084F;

        gunModel[53].addBox(0F, -5F, 0F, 1, 1, 3, 0F); // Box 156
        gunModel[53].setRotationPoint(-58F, 7F, -1.51F);

        gunModel[54].addBox(0F, -5F, 0F, 1, 1, 3, 0F); // Box 157
        gunModel[54].setRotationPoint(-58F, 9F, -1.51F);

        gunModel[55].addBox(0F, -5F, 0F, 1, 1, 1, 0F); // Box 158
        gunModel[55].setRotationPoint(-58F, 8F, -1.51F);

        gunModel[56].addBox(0F, -5F, 0F, 1, 1, 1, 0F); // Box 159
        gunModel[56].setRotationPoint(-58F, 8F, 0.51F);

        gunModel[57].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 161
        gunModel[57].setRotationPoint(-29.5F, -11F, -3F);
        gunModel[57].rotateAngleZ = 0.15707963F;

        gunModel[58].addBox(5F, 0F, 0F, 5, 2, 1, 0F); // Box 162
        gunModel[58].setRotationPoint(-29.5F, -11F, -3F);
        gunModel[58].rotateAngleZ = 0.15707963F;

        gunModel[59].addBox(0.5F, 1.5F, 0F, 1, 1, 1, 0F); // Box 163
        gunModel[59].setRotationPoint(-29.5F, -11F, -3.25F);
        gunModel[59].rotateAngleZ = 0.15707963F;

        gunModel[60].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 164
        gunModel[60].setRotationPoint(-33.93F, -12.55F, -1.52F);
        gunModel[60].rotateAngleZ = 0.89011792F;

        gunModel[61].addBox(0F, 0F, 0F, 8, 6, 5, 0F); // Box 157
        gunModel[61].setRotationPoint(4.5F, -13.5F, -2.5F);

        gunModel[62].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 158
        gunModel[62].setRotationPoint(0.5F, -14.5F, -2.51F);

        gunModel[63].addBox(0F, 0F, 0F, 35, 1, 0, 0F); // Box 159
        gunModel[63].setRotationPoint(0.25F, -18.25F, -0.5F);

        gunModel[64].addBox(5F, 1F, 0F, 2, 1, 1, 0F); // Box 160
        gunModel[64].setRotationPoint(4.25F, -18.25F, -0.5F);

        gunModel[65].addBox(12F, 1F, 0F, 2, 1, 1, 0F); // Box 161
        gunModel[65].setRotationPoint(4.25F, -18.25F, -0.5F);

        gunModel[66].addBox(19F, 1F, 0F, 2, 1, 1, 0F); // Box 162
        gunModel[66].setRotationPoint(4.25F, -18.25F, -0.5F);

        gunModel[67].addBox(27F, 1F, 0F, 4, 2, 1, 0F); // Box 163
        gunModel[67].setRotationPoint(5.25F, -18.25F, -0.5F);

        gunModel[68].addBox(27F, 1F, 0F, 1, 1, 1, 0F); // Box 164
        gunModel[68].setRotationPoint(4.25F, -18.25F, -0.5F);

        gunModel[69].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 165
        gunModel[69].setRotationPoint(-0.75F, -17.25F, -1F);

        gunModel[70].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 169
        gunModel[70].setRotationPoint(63.5F, -11.5F, -2F);

        gunModel[71].addBox(-2F, -1F, 0F, 1, 5, 1, 0F); // Box 172
        gunModel[71].setRotationPoint(-13.5F, -6F, -0.5F);

        gunModel[72].addBox(-2F, -1F, 0F, 1, 5, 2, 0F); // Box 173
        gunModel[72].setRotationPoint(-10.5F, -5.5F, -1F);
        gunModel[72].rotateAngleZ = -0.08726646F;

        gunModel[73].addBox(-3F, 0F, -2F, 3, 1, 2, 0F); // Box 174
        gunModel[73].setRotationPoint(-32.05F, -14.9F, -1.5F);
        gunModel[73].rotateAngleX = 1.06465084F;
        gunModel[73].rotateAngleZ = 0.89011792F;

        gunModel[74].addBox(-3F, 0F, 0F, 3, 1, 2, 0F); // Box 175
        gunModel[74].setRotationPoint(-32.05F, -14.9F, 1.5F);
        gunModel[74].rotateAngleX = -1.06465084F;
        gunModel[74].rotateAngleZ = 0.89011792F;

        gunModel[75].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 178
        gunModel[75].setRotationPoint(-0.75F, -17.26F, -0.5F);

        gunModel[76].addBox(0F, 0F, 0F, 35, 1, 0, 0F); // Box 179
        gunModel[76].setRotationPoint(0.25F, -18.25F, 0.5F);

        gunModel[77].addBox(-58F, 8F, 0.51F, 1, 1, 1, 0F); // Box 83
        gunModel[77].setRotationPoint(32F, 52.25F, 0F);
        gunModel[77].rotateAngleZ = -1.74532925F;

        gunModel[78].addBox(-58F, 8F, -1.51F, 1, 1, 1, 0F); // Box 84
        gunModel[78].setRotationPoint(32F, 52.25F, 0F);
        gunModel[78].rotateAngleZ = -1.74532925F;

        gunModel[79].addBox(-58F, 9F, -1.51F, 1, 1, 3, 0F); // Box 85
        gunModel[79].setRotationPoint(32F, 52.25F, 0F);
        gunModel[79].rotateAngleZ = -1.74532925F;

        gunModel[80].addBox(-58F, 7F, -1.51F, 1, 1, 3, 0F); // Box 86
        gunModel[80].setRotationPoint(32F, 52.25F, 0F);
        gunModel[80].rotateAngleZ = -1.74532925F;

        gunModel[81].addBox(0F, 0F, 0F, 34, 1, 6, 0F); // Box 87
        gunModel[81].setRotationPoint(-32.5F, -7.25F, -3F);
        gunModel[81].rotateAngleZ = 0.01745329F;

        gunModel[82].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 88
        gunModel[82].setRotationPoint(37.5F, -13.35F, -2.51F);
        gunModel[82].rotateAngleZ = -0.80285146F;

        gunModel[83].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 89
        gunModel[83].setRotationPoint(35.25F, -18.25F, 0.51F);
        gunModel[83].rotateAngleZ = -1.06465084F;

        gunModel[84].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 90
        gunModel[84].setRotationPoint(35.25F, -18.25F, -0.49F);
        gunModel[84].rotateAngleZ = -1.06465084F;

        gunModel[85].addBox(-2F, 0F, 0F, 2, 1, 0, 0F); // Box 91
        gunModel[85].setRotationPoint(0.25F, -18.25F, 0.51F);
        gunModel[85].rotateAngleZ = 1.06465084F;

        gunModel[86].addBox(-2F, 0F, 0F, 2, 1, 0, 0F); // Box 92
        gunModel[86].setRotationPoint(0.25F, -18.25F, -0.49F);
        gunModel[86].rotateAngleZ = 1.06465084F;

        gunModel[87].addBox(-3F, -1.25F, 0F, 1, 2, 2, 0F); // Box 93
        gunModel[87].setRotationPoint(-10.5F, -5.5F, -1F);
        gunModel[87].rotateAngleZ = -0.08726646F;

        ammoModel = new ModelRendererTurbo[6];
        ammoModel[0] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 52
        ammoModel[2] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 170
        ammoModel[3] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 171
        ammoModel[4] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 176
        ammoModel[5] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 177

        ammoModel[0].addBox(0F, 0F, 0F, 11, 4, 3, 0F); // Box 51
        ammoModel[0].setRotationPoint(-10.14F, -7F, -1.5F);
        ammoModel[0].rotateAngleZ = 0.01745329F;

        ammoModel[1].addBox(0F, 0F, 0F, 11, 18, 3, 0F); // Box 52
        ammoModel[1].setRotationPoint(-10F, -3F, -1.51F);
        ammoModel[1].rotateAngleZ = 0.26179939F;

        ammoModel[2].addBox(0F, 0F, 0F, 6, 18, 4, 0F); // Box 170
        ammoModel[2].setRotationPoint(-10F, -3.02F, -2.01F);
        ammoModel[2].rotateAngleZ = 0.26179939F;

        ammoModel[3].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 171
        ammoModel[3].setRotationPoint(-10.14F, -7.02F, -2F);
        ammoModel[3].rotateAngleZ = 0.01745329F;

        ammoModel[4].addBox(1F, 17.5F, 0F, 9, 1, 2, 0F); // Box 176
        ammoModel[4].setRotationPoint(-10F, -3F, -1F);
        ammoModel[4].rotateAngleZ = 0.26179939F;

        ammoModel[5].addBox(0.5F, 18.5F, 0F, 10, 1, 3, 0F); // Box 177
        ammoModel[5].setRotationPoint(-10F, -3F, -1.5F);
        ammoModel[5].rotateAngleZ = 0.26179939F;

        this.modelScale = 0.2F;

        translateAll = new Vector3f(30F, -15F, -0.15F);
        thirdPersonOffset = new Vector3f(0F, -.05F, 0F);

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

        this.thirdPersonScale = 0.60f;
        this.thirdPersonOffset = new Vector3f(-0.2F, -0.05F, 0F);

        flipAll();
    }
}