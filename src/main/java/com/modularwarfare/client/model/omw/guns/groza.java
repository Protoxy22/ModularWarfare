package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class groza extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public groza() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[82];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 236
        gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 34
        gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 39
        gunModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 40
        gunModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 107
        gunModel[5] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 108
        gunModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 109
        gunModel[7] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 15
        gunModel[8] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 16
        gunModel[9] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 17
        gunModel[10] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 18
        gunModel[11] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 19
        gunModel[12] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 20
        gunModel[13] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 36
        gunModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 37
        gunModel[15] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 38
        gunModel[16] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 138
        gunModel[17] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 139
        gunModel[18] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 140
        gunModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 141
        gunModel[20] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 142
        gunModel[21] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 143
        gunModel[22] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 31
        gunModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 32
        gunModel[24] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 33
        gunModel[25] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 34
        gunModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 35
        gunModel[27] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 36
        gunModel[28] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 2
        gunModel[29] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 3
        gunModel[30] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 4
        gunModel[31] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 14
        gunModel[32] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 42
        gunModel[33] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 43
        gunModel[34] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 44
        gunModel[35] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 45
        gunModel[36] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 46
        gunModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 47
        gunModel[38] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 48
        gunModel[39] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 49
        gunModel[40] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 51
        gunModel[41] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 52
        gunModel[42] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 53
        gunModel[43] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 55
        gunModel[44] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 56
        gunModel[45] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 60
        gunModel[46] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 61
        gunModel[47] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 62
        gunModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
        gunModel[49] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 64
        gunModel[50] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 65
        gunModel[51] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 66
        gunModel[52] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 67
        gunModel[53] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 68
        gunModel[54] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 70
        gunModel[55] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 71
        gunModel[56] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 72
        gunModel[57] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 73
        gunModel[58] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 74
        gunModel[59] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 161
        gunModel[60] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 162
        gunModel[61] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 163
        gunModel[62] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 101
        gunModel[63] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 102
        gunModel[64] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 104
        gunModel[65] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 105
        gunModel[66] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 106
        gunModel[67] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 97
        gunModel[68] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 98
        gunModel[69] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 99
        gunModel[70] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 86
        gunModel[71] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 87
        gunModel[72] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 88
        gunModel[73] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 92
        gunModel[74] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 93
        gunModel[75] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 94
        gunModel[76] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 95
        gunModel[77] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 96
        gunModel[78] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 97
        gunModel[79] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 98
        gunModel[80] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 99
        gunModel[81] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 87

        gunModel[0].addBox(0F, 0F, -1.01F, 6, 2, 2, 0F); // Box 236
        gunModel[0].setRotationPoint(19.25F, -11F, 0F);

        gunModel[1].addBox(0F, 0F, 0F, 20, 1, 5, 0F); // Box 34
        gunModel[1].setRotationPoint(-35.5F, -14.5F, -2.51F);

        gunModel[2].addBox(0F, 0F, 0F, 35, 6, 4, 0F); // Box 39
        gunModel[2].setRotationPoint(-35.5F, -12F, -2F);
        gunModel[2].rotateAngleZ = 0.01745329F;

        gunModel[3].addBox(0F, 0F, 0F, 35, 3, 3, 0F); // Box 40
        gunModel[3].setRotationPoint(-35.5F, -14.5F, -1.51F);

        gunModel[4].addBox(0F, 0F, 0F, 8, 2, 4, 0F); // Box 107
        gunModel[4].setRotationPoint(3F, -6.75F, -2F);

        gunModel[5].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 108
        gunModel[5].setRotationPoint(3F, -5F, -1.51F);

        gunModel[6].addBox(0F, -2F, 0F, 6, 13, 3, 0F); // Box 109
        gunModel[6].setRotationPoint(4F, -5F, -1.49F);
        gunModel[6].rotateAngleZ = -0.40142573F;

        gunModel[7].addBox(4F, 5.77F, 0F, 1, 6, 3, 0F); // Box 15
        gunModel[7].setRotationPoint(4F, -5F, -1.5F);
        gunModel[7].rotateAngleZ = -0.2443461F;

        gunModel[8].addBox(5F, -2F, 0F, 1, 4, 3, 0F); // Box 16
        gunModel[8].setRotationPoint(4.9F, -6F, -1.5F);
        gunModel[8].rotateAngleZ = -0.59341195F;

        gunModel[9].addBox(0F, 0F, 0F, 18, 3, 4, 0F); // Box 17
        gunModel[9].setRotationPoint(-0.5F, -9.7F, -2F);

        gunModel[10].addBox(0F, 0F, 0F, 17, 2, 3, 0F); // Box 18
        gunModel[10].setRotationPoint(-0.5F, -11.7F, -1.5F);

        gunModel[11].addBox(0F, 0F, 0F, 18, 1, 4, 0F); // Box 19
        gunModel[11].setRotationPoint(-0.5F, -12.7F, -2F);

        gunModel[12].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 20
        gunModel[12].setRotationPoint(16.5F, -11.7F, -2F);

        gunModel[13].addBox(0F, 0F, 0F, 35, 1, 3, 0F); // Box 36
        gunModel[13].setRotationPoint(-35.5F, -15.5F, -1.51F);

        gunModel[14].addBox(0F, 0F, -2F, 20, 1, 2, 0F); // Box 37
        gunModel[14].setRotationPoint(-35.5F, -15.5F, -1.5F);
        gunModel[14].rotateAngleX = 1.06465084F;

        gunModel[15].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 38
        gunModel[15].setRotationPoint(-35.5F, -15.5F, 1.5F);
        gunModel[15].rotateAngleX = -1.06465084F;

        gunModel[16].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 138
        gunModel[16].setRotationPoint(-28.5F, -15.75F, -1.5F);

        gunModel[17].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 139
        gunModel[17].setRotationPoint(-28.5F, -15.75F, -1.5F);
        gunModel[17].rotateAngleX = 1.06465084F;

        gunModel[18].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 140
        gunModel[18].setRotationPoint(-28.5F, -15.75F, 1.5F);
        gunModel[18].rotateAngleX = -1.06465084F;

        gunModel[19].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 141
        gunModel[19].setRotationPoint(-18.5F, -15.75F, -1.5F);

        gunModel[20].addBox(0F, 0F, -2F, 1, 1, 2, 0F); // Box 142
        gunModel[20].setRotationPoint(-18.5F, -15.75F, -1.5F);
        gunModel[20].rotateAngleX = 1.06465084F;

        gunModel[21].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 143
        gunModel[21].setRotationPoint(-18.5F, -15.75F, 1.5F);
        gunModel[21].rotateAngleX = -1.06465084F;

        gunModel[22].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 31
        gunModel[22].setRotationPoint(-39.5F, -16F, -1.5F);

        gunModel[23].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 32
        gunModel[23].setRotationPoint(-39.5F, -15F, -1.5F);

        gunModel[24].addBox(0F, 0F, 0F, 4, 6, 3, 0F); // Box 33
        gunModel[24].setRotationPoint(-39.5F, -12F, -1.49F);

        gunModel[25].addBox(-4F, 0F, 0F, 4, 2, 3, 0F); // Box 34
        gunModel[25].setRotationPoint(-35.5F, -14F, -1.5F);
        gunModel[25].rotateAngleZ = 0.55850536F;

        gunModel[26].addBox(0F, 0F, -1.01F, 2, 3, 3, 0F); // Box 35
        gunModel[26].setRotationPoint(20.25F, -11.5F, -0.5F);

        gunModel[27].addBox(0F, 0F, -1.01F, 3, 6, 3, 0F); // Box 36
        gunModel[27].setRotationPoint(16.75F, -12.5F, -0.5F);

        gunModel[28].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 2
        gunModel[28].setRotationPoint(0F, -15.5F, -1F);

        gunModel[29].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 3
        gunModel[29].setRotationPoint(0F, -15.5F, 1F);
        gunModel[29].rotateAngleX = -0.57595865F;

        gunModel[30].addBox(0F, 0F, -1F, 16, 1, 1, 0F); // Box 4
        gunModel[30].setRotationPoint(0F, -15.5F, -1F);
        gunModel[30].rotateAngleX = 0.57595865F;

        gunModel[31].addBox(0F, 0F, 0F, 16, 2, 4, 0F); // Box 14
        gunModel[31].setRotationPoint(0F, -15F, -2F);

        gunModel[32].addBox(0F, 0F, 0F, 18, 1, 3, 0F); // Box 42
        gunModel[32].setRotationPoint(-0.5F, -13.7F, -1.5F);

        gunModel[33].addBox(0F, 0F, -1.01F, 2, 1, 2, 0F); // Box 43
        gunModel[33].setRotationPoint(17.75F, -13.5F, 0F);

        gunModel[34].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 44
        gunModel[34].setRotationPoint(16.75F, -16.5F, -1F);

        gunModel[35].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 45
        gunModel[35].setRotationPoint(16.75F, -18.5F, -1F);

        gunModel[36].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 46
        gunModel[36].setRotationPoint(18.75F, -17.5F, -1F);

        gunModel[37].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 47
        gunModel[37].setRotationPoint(16.75F, -17.5F, -1F);

        gunModel[38].addBox(0F, 0F, -0.5F, 2, 1, 1, 0F); // Box 48
        gunModel[38].setRotationPoint(17.75F, -19.5F, 0F);

        gunModel[39].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 49
        gunModel[39].setRotationPoint(18F, -20F, -1F);

        gunModel[40].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 51
        gunModel[40].setRotationPoint(-3.25F, -21.75F, -1.51F);
        gunModel[40].rotateAngleZ = -0.08726646F;

        gunModel[41].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 52
        gunModel[41].setRotationPoint(-0.25F, -20.5F, -1.5F);

        gunModel[42].addBox(0F, 0F, 0F, 3, 8, 3, 0F); // Box 53
        gunModel[42].setRotationPoint(-3.25F, -21F, -1.5F);

        gunModel[43].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 55
        gunModel[43].setRotationPoint(-0.25F, -19.25F, -1F);
        gunModel[43].rotateAngleZ = -0.76794487F;

        gunModel[44].addBox(-1F, 0F, -0.5F, 1, 1, 1, 0F); // Box 56
        gunModel[44].setRotationPoint(16.75F, -19.25F, 0F);
        gunModel[44].rotateAngleZ = 0.76794487F;

        gunModel[45].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 60
        gunModel[45].setRotationPoint(-4.25F, -20.5F, -1F);

        gunModel[46].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 61
        gunModel[46].setRotationPoint(-0.25F, -20.5F, 0.5F);

        gunModel[47].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 62
        gunModel[47].setRotationPoint(-3.25F, -21.75F, 0.51F);
        gunModel[47].rotateAngleZ = -0.08726646F;

        gunModel[48].addBox(0F, 0F, 0F, 18, 1, 3, 0F); // Box 63
        gunModel[48].setRotationPoint(-0.25F, -19.5F, -1.5F);

        gunModel[49].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 64
        gunModel[49].setRotationPoint(18F, -21.5F, -2F);
        gunModel[49].rotateAngleX = 0.15707963F;

        gunModel[50].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 65
        gunModel[50].setRotationPoint(18F, -21.5F, 2F);
        gunModel[50].rotateAngleX = -0.15707963F;

        gunModel[51].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 66
        gunModel[51].setRotationPoint(-9F, -16F, -1.51F);

        gunModel[52].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 67
        gunModel[52].setRotationPoint(-7.15F, -16F, -1.51F);
        gunModel[52].rotateAngleZ = 0.29670597F;

        gunModel[53].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 68
        gunModel[53].setRotationPoint(-7.15F, -16F, 0.49F);
        gunModel[53].rotateAngleZ = 0.29670597F;

        gunModel[54].addBox(0F, 0F, -1.01F, 1, 3, 3, 0F); // Box 70
        gunModel[54].setRotationPoint(22.5F, -11.5F, -0.5F);

        gunModel[55].addBox(-1F, 0F, 0F, 1, 6, 3, 0F); // Box 71
        gunModel[55].setRotationPoint(-35.5F, -6F, -1.49F);
        gunModel[55].rotateAngleZ = -0.54105207F;

        gunModel[56].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 72
        gunModel[56].setRotationPoint(-39.5F, -6F, -1.49F);

        gunModel[57].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // Box 73
        gunModel[57].setRotationPoint(-42F, -16.25F, -2F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 74
        gunModel[58].setRotationPoint(-40F, -15.5F, -1F);

        gunModel[59].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 161
        gunModel[59].setRotationPoint(-29.5F, -10.5F, -2.5F);
        gunModel[59].rotateAngleZ = 0.15707963F;

        gunModel[60].addBox(5F, 0F, 0F, 5, 2, 1, 0F); // Box 162
        gunModel[60].setRotationPoint(-29.5F, -10.5F, -2.5F);
        gunModel[60].rotateAngleZ = 0.15707963F;

        gunModel[61].addBox(0.5F, 1.5F, 0F, 1, 1, 1, 0F); // Box 163
        gunModel[61].setRotationPoint(-29.5F, -10.5F, -2.75F);
        gunModel[61].rotateAngleZ = 0.15707963F;

        gunModel[62].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 101
        gunModel[62].setRotationPoint(11F, -3F, -0.5F);

        gunModel[63].addBox(0F, -1F, 0F, 3, 1, 1, 0F); // Box 102
        gunModel[63].setRotationPoint(17F, -2F, -0.5F);
        gunModel[63].rotateAngleZ = 0.95993109F;

        gunModel[64].addBox(-2F, -1F, 0F, 2, 1, 1, 0F); // Box 104
        gunModel[64].setRotationPoint(11F, -2F, -0.5F);
        gunModel[64].rotateAngleZ = -0.78539816F;

        gunModel[65].addBox(-2F, -1F, 0F, 1, 4, 1, 0F); // Box 105
        gunModel[65].setRotationPoint(11.5F, -6.5F, -0.5F);

        gunModel[66].addBox(-2F, -1F, 0F, 1, 5, 1, 0F); // Box 106
        gunModel[66].setRotationPoint(13.5F, -8F, -0.5F);
        gunModel[66].rotateAngleZ = 0.38397244F;

        gunModel[67].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 97
        gunModel[67].setRotationPoint(17.55F, -8F, -1F);

        gunModel[68].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 98
        gunModel[68].setRotationPoint(17.55F, -6F, -1F);

        gunModel[69].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 99
        gunModel[69].setRotationPoint(19F, -7F, -1F);
        gunModel[69].rotateAngleZ = -0.40142573F;

        gunModel[70].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 86
        gunModel[70].setRotationPoint(-21.5F, -6.5F, -1F);

        gunModel[71].addBox(-1F, 0F, 0F, 1, 2, 2, 0F); // Box 87
        gunModel[71].setRotationPoint(-18.5F, -2.5F, -1F);
        gunModel[71].rotateAngleZ = -0.12217305F;

        gunModel[72].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 88
        gunModel[72].setRotationPoint(-20.5F, -4.5F, -1.5F);

        gunModel[73].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 92
        gunModel[73].setRotationPoint(-5.5F, -14F, -3.5F);

        gunModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
        gunModel[74].setRotationPoint(18F, -21F, -0.5F);

        gunModel[75].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 94
        gunModel[75].setRotationPoint(-1.25F, -15F, -0.5F);

        gunModel[76].addBox(-0.5F, 1F, 1F, 1, 3, 1, 0F); // Box 95
        gunModel[76].setRotationPoint(-35.5F, -6F, -1.49F);
        gunModel[76].rotateAngleZ = -0.54105207F;

        gunModel[77].addBox(0.5F, 1F, 1F, 1, 1, 1, 0F); // Box 96
        gunModel[77].setRotationPoint(-35.5F, -6F, -1.49F);
        gunModel[77].rotateAngleZ = -0.54105207F;

        gunModel[78].addBox(0.5F, 3F, 1F, 1, 1, 1, 0F); // Box 97
        gunModel[78].setRotationPoint(-35.5F, -6F, -1.49F);
        gunModel[78].rotateAngleZ = -0.54105207F;

        gunModel[79].addBox(1.5F, 1F, 1F, 1, 3, 1, 0F); // Box 98
        gunModel[79].setRotationPoint(-35.5F, -6F, -1.49F);
        gunModel[79].rotateAngleZ = -0.54105207F;

        gunModel[80].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 99
        gunModel[80].setRotationPoint(-32.5F, -6.5F, -1F);

        gunModel[81].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 87
        gunModel[81].setRotationPoint(-2.25F, -20F, -2F);


        ammoModel = new ModelRendererTurbo[6];
        ammoModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 51
        ammoModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
        ammoModel[2] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 14
        ammoModel[3] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 89
        ammoModel[4] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 90
        ammoModel[5] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 91

        ammoModel[0].addBox(0.2F, 0F, 0F, 8, 4, 2, 0F); // Box 51
        ammoModel[0].setRotationPoint(-18.25F, -7.5F, -1F);
        ammoModel[0].rotateAngleZ = 0.01745329F;

        ammoModel[1].addBox(0.2F, 0F, 0F, 8, 8, 2, 0F); // Box 52
        ammoModel[1].setRotationPoint(-18.15F, -3.5F, -1F);
        ammoModel[1].rotateAngleZ = 0.17453293F;

        ammoModel[2].addBox(0.2F, 0F, 0F, 8, 10, 2, 0F); // Box 14
        ammoModel[2].setRotationPoint(-16.75F, 4.4F, -1F);
        ammoModel[2].rotateAngleZ = 0.2443461F;

        ammoModel[3].addBox(0F, 0F, 0F, 6, 10, 3, 0F); // Box 89
        ammoModel[3].setRotationPoint(-16.75F, 4.4F, -1.5F);
        ammoModel[3].rotateAngleZ = 0.2443461F;

        ammoModel[4].addBox(0F, 0F, 0F, 6, 4, 3, 0F); // Box 90
        ammoModel[4].setRotationPoint(-18.25F, -7.5F, -1.5F);
        ammoModel[4].rotateAngleZ = 0.01745329F;

        ammoModel[5].addBox(0F, 0F, 0F, 6, 8, 3, 0F); // Box 91
        ammoModel[5].setRotationPoint(-18.15F, -3.5F, -1.5F);
        ammoModel[5].rotateAngleZ = 0.17453293F;


        this.modelScale = 0.2f;

        translateAll = new Vector3f(18F, -12.8F, 0F);
        rotateAimPosition = new Vector3f(0F, 0F, -1.5F);
        this.crouchZoom = -0.2f;

        leftArmPos = new Vector3f(-0.15F, -0.80F, 0.05F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
        leftArmReloadPos = new Vector3f(-0.5F, -0.50F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);

        rightArmPos = new Vector3f(0.60F, -0.70F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);

        leftHandAmmo = true;

        hasFlash = true;
        flashScale = 2F;
        this.muzzleFlashPointNormal = new Vector3f(-1F, 0.8F, 0.9F);
        this.muzzleFlashPointScoping = new Vector3f(-1F, 0.8F, 0.1F);

        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);


        this.thirdPersonScale = 0.75f;
        this.thirdPersonOffset = new Vector3f(-0.2F, -0.1F, 0F);
        backPersonOffset = new Vector3f(0.4F, -0.1F, 0.25F);

        flipAll();

    }
}