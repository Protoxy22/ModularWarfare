package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class kar98k extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public kar98k() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[87];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 66
        gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 185
        gunModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
        gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
        gunModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
        gunModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 10
        gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
        gunModel[7] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 12
        gunModel[8] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 13
        gunModel[9] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 14
        gunModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 15
        gunModel[11] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 16
        gunModel[12] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 17
        gunModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
        gunModel[14] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 19
        gunModel[15] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 20
        gunModel[16] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 22
        gunModel[17] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 23
        gunModel[18] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 24
        gunModel[19] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 25
        gunModel[20] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 26
        gunModel[21] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 27
        gunModel[22] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 28
        gunModel[23] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 29
        gunModel[24] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 30
        gunModel[25] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 31
        gunModel[26] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 32
        gunModel[27] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 33
        gunModel[28] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 29
        gunModel[29] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 30
        gunModel[30] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 32
        gunModel[31] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 33
        gunModel[32] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 34
        gunModel[33] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 35
        gunModel[34] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 36
        gunModel[35] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 37
        gunModel[36] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 38
        gunModel[37] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 39
        gunModel[38] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 40
        gunModel[39] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 42
        gunModel[40] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 43
        gunModel[41] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 44
        gunModel[42] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 45
        gunModel[43] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 46
        gunModel[44] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 47
        gunModel[45] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 50
        gunModel[46] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 51
        gunModel[47] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 52
        gunModel[48] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 53
        gunModel[49] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 144
        gunModel[50] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 145
        gunModel[51] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 146
        gunModel[52] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 147
        gunModel[53] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 148
        gunModel[54] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 149
        gunModel[55] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 150
        gunModel[56] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 151
        gunModel[57] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 152
        gunModel[58] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 153
        gunModel[59] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 154
        gunModel[60] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 155
        gunModel[61] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 101
        gunModel[62] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 102
        gunModel[63] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 104
        gunModel[64] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 105
        gunModel[65] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 71
        gunModel[66] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 72
        gunModel[67] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 73
        gunModel[68] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 74
        gunModel[69] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 75
        gunModel[70] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 76
        gunModel[71] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 77
        gunModel[72] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 78
        gunModel[73] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 79
        gunModel[74] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 125
        gunModel[75] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 126
        gunModel[76] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 127
        gunModel[77] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 128
        gunModel[78] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 129
        gunModel[79] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 130
        gunModel[80] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 88
        gunModel[81] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 89
        gunModel[82] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 90
        gunModel[83] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 91
        gunModel[84] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 92
        gunModel[85] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 93
        gunModel[86] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 96

        gunModel[0].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 66
        gunModel[0].setRotationPoint(-46F, -2F, -0.5F);
        gunModel[0].rotateAngleZ = 0.10471976F;

        gunModel[1].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Box 185
        gunModel[1].setRotationPoint(64.5F, -13.1F, -1.5F);

        gunModel[2].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 5
        gunModel[2].setRotationPoint(109F, -13.5F, -1.25F);

        gunModel[3].addBox(0F, 0F, 0F, 111, 4, 6, 0F); // Box 6
        gunModel[3].setRotationPoint(-50F, -10F, -3F);

        gunModel[4].addBox(0F, -3F, 0.01F, 111, 5, 6, 0F); // Box 9
        gunModel[4].setRotationPoint(-50F, -3F, -3F);
        gunModel[4].rotateAngleZ = 0.03490659F;

        gunModel[5].addBox(0F, 0F, 0.01F, 106, 2, 6, 0F); // Box 10
        gunModel[5].setRotationPoint(-45F, -12F, -3F);

        gunModel[6].addBox(0F, 0F, -3F, 34, 2, 3, 0F); // Box 11
        gunModel[6].setRotationPoint(27F, -13F, 2.4F);
        gunModel[6].rotateAngleX = -0.87266463F;
        gunModel[6].rotateAngleZ = -0.02617994F;

        gunModel[7].addBox(0F, 0F, 0F, 34, 2, 3, 0F); // Box 12
        gunModel[7].setRotationPoint(27F, -13F, -2.4F);
        gunModel[7].rotateAngleX = 0.87266463F;
        gunModel[7].rotateAngleZ = -0.02617994F;

        gunModel[8].addBox(0F, 0F, 0F, 34, 1, 5, 0F); // Box 13
        gunModel[8].setRotationPoint(27F, -13F, -2.5F);
        gunModel[8].rotateAngleZ = -0.02617994F;

        gunModel[9].addBox(0F, -2.25F, -5F, 34, 2, 1, 0F); // Box 14
        gunModel[9].setRotationPoint(27F, -13F, 4.5F);
        gunModel[9].rotateAngleZ = -0.02617994F;

        gunModel[10].addBox(0F, 0F, 0F, 21, 2, 5, 0F); // Box 15
        gunModel[10].setRotationPoint(6.01F, -14F, -2.51F);

        gunModel[11].addBox(0F, -3F, 0F, 20, 4, 5, 0F); // Box 16
        gunModel[11].setRotationPoint(65F, -8F, -2.5F);

        gunModel[12].addBox(0F, -3F, 0F, 4, 8, 6, 0F); // Box 17
        gunModel[12].setRotationPoint(61F, -10.25F, -3F);

        gunModel[13].addBox(0F, -3F, 0F, 4, 1, 4, 0F); // Box 18
        gunModel[13].setRotationPoint(61F, -11.25F, -2F);

        gunModel[14].addBox(0F, -3F, 0F, 4, 1, 4, 0F); // Box 19
        gunModel[14].setRotationPoint(61F, -2.25F, -2F);

        gunModel[15].addBox(0F, -3F, 0F, 20, 2, 4, 0F); // Box 20
        gunModel[15].setRotationPoint(65F, -4.5F, -2F);
        gunModel[15].rotateAngleZ = 0.03490659F;

        gunModel[16].addBox(0F, -6F, 0F, 15, 6, 6, 0F); // Box 22
        gunModel[16].setRotationPoint(-63F, 7F, -3F);
        gunModel[16].rotateAngleZ = 0.61086524F;

        gunModel[17].addBox(-2F, -5F, 0F, 15, 5, 6, 0F); // Box 23
        gunModel[17].setRotationPoint(-62F, 0F, -3F);
        gunModel[17].rotateAngleZ = 0.08290314F;

        gunModel[18].addBox(0F, -5F, 0F, 14, 5, 6, 0F); // Box 24
        gunModel[18].setRotationPoint(-61F, -0.15F, -3F);
        gunModel[18].rotateAngleZ = 0.41887902F;

        gunModel[19].addBox(0F, -5F, 0.02F, 3, 11, 6, 0F); // Box 25
        gunModel[19].setRotationPoint(-66F, 1F, -3F);

        gunModel[20].addBox(-8F, -5F, -0.01F, 8, 4, 6, 0F); // Box 26
        gunModel[20].setRotationPoint(-64F, 0F, -3F);
        gunModel[20].rotateAngleZ = -0.37088247F;

        gunModel[21].addBox(-8F, -5F, 0F, 8, 4, 6, 0F); // Box 27
        gunModel[21].setRotationPoint(-69.6F, -2.55F, -3F);

        gunModel[22].addBox(-37.5F, -4F, 0F, 38, 16, 6, 0F); // Box 28
        gunModel[22].setRotationPoint(-77.5F, -3.55F, -3F);
        gunModel[22].rotateAngleZ = 0.08726646F;

        gunModel[23].addBox(0.5F, 0F, 0.01F, 11, 9, 6, 0F); // Box 29
        gunModel[23].setRotationPoint(-77.5F, -3.55F, -3F);

        gunModel[24].addBox(0F, -5F, 0F, 3, 5, 6, 0F); // Box 30
        gunModel[24].setRotationPoint(-66F, 7F, -3F);
        gunModel[24].rotateAngleZ = 1.25663706F;

        gunModel[25].addBox(-1F, -46F, -0.02F, 3, 47, 6, 0F); // Box 31
        gunModel[25].setRotationPoint(-70F, 5F, -3F);
        gunModel[25].rotateAngleZ = 1.90240888F;

        gunModel[26].addBox(0F, 0F, 0F, 4, 26, 7, 0F); // Box 32
        gunModel[26].setRotationPoint(-119F, -4.5F, -3.5F);
        gunModel[26].rotateAngleZ = 0.08726646F;

        gunModel[27].addBox(-1F, 1.25F, 0F, 26, 6, 6, 0F); // Box 33
        gunModel[27].setRotationPoint(-114F, 10.45F, -3F);
        gunModel[27].rotateAngleZ = 0.26179939F;

        gunModel[28].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 29
        gunModel[28].setRotationPoint(6.01F, -15F, -2.01F);

        gunModel[29].addBox(0F, -3F, 0F, 8, 4, 6, 0F); // Box 30
        gunModel[29].setRotationPoint(85F, -8.75F, -3F);

        gunModel[30].addBox(0F, -3F, 0F, 3, 2, 2, 0F); // Box 32
        gunModel[30].setRotationPoint(85F, -10.75F, -1F);

        gunModel[31].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 33
        gunModel[31].setRotationPoint(85F, -13.75F, 1F);
        gunModel[31].rotateAngleX = -0.87266463F;

        gunModel[32].addBox(0F, 0F, -3F, 3, 2, 3, 0F); // Box 34
        gunModel[32].setRotationPoint(85F, -13.75F, -1F);
        gunModel[32].rotateAngleX = 0.87266463F;

        gunModel[33].addBox(0F, -2F, 0F, 3, 2, 3, 0F); // Box 35
        gunModel[33].setRotationPoint(85F, -5.75F, 1F);
        gunModel[33].rotateAngleX = 0.87266463F;

        gunModel[34].addBox(0F, -2F, -3F, 3, 2, 3, 0F); // Box 36
        gunModel[34].setRotationPoint(85F, -5.75F, -1F);
        gunModel[34].rotateAngleX = -0.87266463F;

        gunModel[35].addBox(0F, -3F, 0F, 3, 2, 2, 0F); // Box 37
        gunModel[35].setRotationPoint(85F, -4.75F, -1F);

        gunModel[36].addBox(0F, 0F, -3F, 3, 2, 3, 0F); // Box 38
        gunModel[36].setRotationPoint(90F, -13.75F, -1F);
        gunModel[36].rotateAngleX = 0.87266463F;

        gunModel[37].addBox(0F, -3F, 0F, 3, 2, 2, 0F); // Box 39
        gunModel[37].setRotationPoint(90F, -10.75F, -1F);

        gunModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 40
        gunModel[38].setRotationPoint(90F, -13.75F, 1F);
        gunModel[38].rotateAngleX = -0.87266463F;

        gunModel[39].addBox(0F, -2F, 0F, 3, 2, 3, 0F); // Box 42
        gunModel[39].setRotationPoint(90F, -5.75F, 1F);
        gunModel[39].rotateAngleX = 0.87266463F;

        gunModel[40].addBox(0F, -3F, 0F, 3, 2, 2, 0F); // Box 43
        gunModel[40].setRotationPoint(90F, -4.75F, -1F);

        gunModel[41].addBox(0F, -2F, -3F, 3, 2, 3, 0F); // Box 44
        gunModel[41].setRotationPoint(90F, -5.75F, -1F);
        gunModel[41].rotateAngleX = -0.87266463F;

        gunModel[42].addBox(0F, -3F, 0F, 14, 3, 2, 0F); // Box 45
        gunModel[42].setRotationPoint(87F, -7F, -1F);

        gunModel[43].addBox(0F, -3F, 0F, 11, 1, 1, 0F); // Box 46
        gunModel[43].setRotationPoint(101F, -5.5F, -0.5F);

        gunModel[44].addBox(0F, -3F, 0F, 14, 1, 2, 0F); // Box 47
        gunModel[44].setRotationPoint(87F, -7.5F, -1.25F);

        gunModel[45].addBox(0F, 0F, 0F, 11, 3, 5, 0F); // Box 50
        gunModel[45].setRotationPoint(-26F, -15F, -2.5F);

        gunModel[46].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 51
        gunModel[46].setRotationPoint(-26F, -16F, -1.5F);

        gunModel[47].addBox(0F, 0F, 0F, 18, 3, 6, 0F); // Box 52
        gunModel[47].setRotationPoint(-44F, -15F, -3F);

        gunModel[48].addBox(0F, 0F, 0F, 18, 1, 4, 0F); // Box 53
        gunModel[48].setRotationPoint(-44F, -16F, -2F);

        gunModel[49].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 144
        gunModel[49].setRotationPoint(16F, -15.5F, -1.75F);

        gunModel[50].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 145
        gunModel[50].setRotationPoint(16F, -15.5F, 0.75F);

        gunModel[51].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 146
        gunModel[51].setRotationPoint(22F, -16.5F, -1.75F);
        gunModel[51].rotateAngleZ = -0.20943951F;

        gunModel[52].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
        gunModel[52].setRotationPoint(22F, -16.5F, 0.75F);
        gunModel[52].rotateAngleZ = -0.20943951F;

        gunModel[53].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 148
        gunModel[53].setRotationPoint(22F, -16.5F, -1.75F);
        gunModel[53].rotateAngleZ = 0.26179939F;

        gunModel[54].addBox(-4F, 0F, 0F, 4, 1, 1, 0F); // Box 149
        gunModel[54].setRotationPoint(22F, -16.5F, 0.75F);
        gunModel[54].rotateAngleZ = 0.26179939F;

        gunModel[55].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 150
        gunModel[55].setRotationPoint(15.9F, -15.3F, -1F);

        gunModel[56].addBox(-2F, 0F, 0F, 11, 1, 2, 0F); // Box 151
        gunModel[56].setRotationPoint(15.9F, -17F, -1F);
        gunModel[56].rotateAngleZ = -0.08726646F;

        gunModel[57].addBox(-2F, -0.5F, 1.51F, 1, 1, 1, 0F); // Box 152
        gunModel[57].setRotationPoint(15.9F, -17F, -1F);
        gunModel[57].rotateAngleZ = -0.08726646F;

        gunModel[58].addBox(-2F, 0.01F, 1.5F, 4, 1, 1, 0F); // Box 153
        gunModel[58].setRotationPoint(15.9F, -17F, -1F);
        gunModel[58].rotateAngleZ = -0.08726646F;

        gunModel[59].addBox(-2F, 0.01F, -0.5F, 4, 1, 1, 0F); // Box 154
        gunModel[59].setRotationPoint(15.9F, -17F, -1F);
        gunModel[59].rotateAngleZ = -0.08726646F;

        gunModel[60].addBox(-2F, -0.5F, -0.49F, 1, 1, 1, 0F); // Box 155
        gunModel[60].setRotationPoint(15.9F, -17F, -1F);
        gunModel[60].rotateAngleZ = -0.08726646F;

        gunModel[61].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 101
        gunModel[61].setRotationPoint(-48F, 3.5F, -1F);

        gunModel[62].addBox(0F, -1F, 0F, 2, 1, 2, 0F); // Box 102
        gunModel[62].setRotationPoint(-40F, 4.5F, -1F);
        gunModel[62].rotateAngleZ = 0.78539816F;

        gunModel[63].addBox(-2F, -1F, 0F, 2, 1, 2, 0F); // Box 104
        gunModel[63].setRotationPoint(-48F, 4.5F, -1F);
        gunModel[63].rotateAngleZ = -0.78539816F;

        gunModel[64].addBox(0F, -1F, 0F, 1, 5, 2, 0F); // Box 105
        gunModel[64].setRotationPoint(-49.5F, -1F, -1F);

        gunModel[65].addBox(0F, -1F, 0F, 1, 5, 2, 0F); // Box 71
        gunModel[65].setRotationPoint(-39.5F, -1F, -1F);

        gunModel[66].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 72
        gunModel[66].setRotationPoint(-53F, -14.1F, -1.49F);

        gunModel[67].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 73
        gunModel[67].setRotationPoint(-53F, -12.1F, -1.49F);

        gunModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 74
        gunModel[68].setRotationPoint(-53F, -13.1F, -1.49F);

        gunModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 75
        gunModel[69].setRotationPoint(-53F, -13.1F, 0.51F);

        gunModel[70].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 76
        gunModel[70].setRotationPoint(-97.5F, -0.55F, -3.5F);

        gunModel[71].addBox(0F, 0F, 0F, 2, 4, 7, 0F); // Box 77
        gunModel[71].setRotationPoint(-85.5F, -3.55F, -3.5F);

        gunModel[72].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 78
        gunModel[72].setRotationPoint(-83.5F, -3.05F, -3.5F);

        gunModel[73].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 79
        gunModel[73].setRotationPoint(3.5F, -9.55F, -3.5F);

        gunModel[74].addBox(0F, 0F, -1F, 4, 3, 1, 0F); // Box 125
        gunModel[74].setRotationPoint(115.5F, -16F, 0.5F);

        gunModel[75].addBox(0F, 0F, -1F, 4, 3, 1, 0F); // Box 126
        gunModel[75].setRotationPoint(115.5F, -19F, 2F);

        gunModel[76].addBox(0F, 0F, -1F, 4, 3, 1, 0F); // Box 127
        gunModel[76].setRotationPoint(115.5F, -19F, -1F);

        gunModel[77].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
        gunModel[77].setRotationPoint(115.5F, -16F, -2F);
        gunModel[77].rotateAngleX = 0.87266463F;

        gunModel[78].addBox(0F, 0F, -1F, 4, 2, 1, 0F); // Box 129
        gunModel[78].setRotationPoint(115.5F, -16F, 2F);
        gunModel[78].rotateAngleX = -0.87266463F;

        gunModel[79].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 130
        gunModel[79].setRotationPoint(117.5F, -18F, 0.5F);

        gunModel[80].addBox(0F, -2F, 0F, 4, 2, 1, 0F); // Box 88
        gunModel[80].setRotationPoint(115.5F, -19F, -2F);
        gunModel[80].rotateAngleX = -0.87266463F;

        gunModel[81].addBox(0F, -2F, -1F, 4, 2, 1, 0F); // Box 89
        gunModel[81].setRotationPoint(115.5F, -19F, 2F);
        gunModel[81].rotateAngleX = 0.87266463F;

        gunModel[82].addBox(0F, 0F, -1F, 4, 1, 1, 0F); // Box 90
        gunModel[82].setRotationPoint(115.5F, -20.3F, 0.5F);

        gunModel[83].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 91
        gunModel[83].setRotationPoint(109F, -13.5F, -1.75F);

        gunModel[84].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 92
        gunModel[84].setRotationPoint(109F, -12.9F, -1.75F);

        gunModel[85].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 93
        gunModel[85].setRotationPoint(109F, -12.9F, -1.25F);

        gunModel[86].addBox(0F, -3F, 0F, 14, 1, 2, 0F); // Box 96
        gunModel[86].setRotationPoint(87.01F, -7.5F, -0.75F);


        pumpModel = new ModelRendererTurbo[3];
        pumpModel[0] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 125
        pumpModel[1] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 126
        pumpModel[2] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 90

        pumpModel[0].addBox(-2F, 0F, -6F, 2, 2, 5, 0F); // Box 125
        pumpModel[0].setRotationPoint(-48F, -14F, -1.01F);
        pumpModel[0].rotateAngleX = 0.29670597F;

        pumpModel[1].addBox(-2.5F, -0.5F, -8F, 3, 3, 3, 0F); // Box 126
        pumpModel[1].setRotationPoint(-48F, -14F, -1.01F);
        pumpModel[1].rotateAngleX = 0.29670597F;

        pumpModel[2].addBox(0F, 0F, 0F, 59, 4, 4, 0F); // Box 90
        pumpModel[2].setRotationPoint(-52.5F, -14.7F, -2F);


        ammoModel = new ModelRendererTurbo[30];
        ammoModel[0] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 91
        ammoModel[1] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 92
        ammoModel[2] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 93
        ammoModel[3] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 94
        ammoModel[4] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 95
        ammoModel[5] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 96
        ammoModel[6] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 97
        ammoModel[7] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 98
        ammoModel[8] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 99
        ammoModel[9] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 100
        ammoModel[10] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 101
        ammoModel[11] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 102
        ammoModel[12] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 103
        ammoModel[13] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 104
        ammoModel[14] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 105
        ammoModel[15] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 106
        ammoModel[16] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 107
        ammoModel[17] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 108
        ammoModel[18] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 109
        ammoModel[19] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 110
        ammoModel[20] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 111
        ammoModel[21] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 112
        ammoModel[22] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 113
        ammoModel[23] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 114
        ammoModel[24] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 115
        ammoModel[25] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 116
        ammoModel[26] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 117
        ammoModel[27] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 118
        ammoModel[28] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 119
        ammoModel[29] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 120

        ammoModel[0].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 91
        ammoModel[0].setRotationPoint(-11.5F, -7F, -1.5F);

        ammoModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 92
        ammoModel[1].setRotationPoint(-3.5F, -6.25F, -1.25F);

        ammoModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 93
        ammoModel[2].setRotationPoint(-3.5F, -6.75F, -1.25F);

        ammoModel[3].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 94
        ammoModel[3].setRotationPoint(-3.5F, -6.25F, -0.75F);

        ammoModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 95
        ammoModel[4].setRotationPoint(-3.5F, -6.75F, -0.75F);

        ammoModel[5].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 96
        ammoModel[5].setRotationPoint(-0.5F, -6.5F, -1F);

        ammoModel[6].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 97
        ammoModel[6].setRotationPoint(-3.5F, -8.5F, -1.25F);

        ammoModel[7].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 98
        ammoModel[7].setRotationPoint(-3.5F, -9F, -1.25F);

        ammoModel[8].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 99
        ammoModel[8].setRotationPoint(-3.5F, -9F, -0.75F);

        ammoModel[9].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 100
        ammoModel[9].setRotationPoint(-3.5F, -8.5F, -0.75F);

        ammoModel[10].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 101
        ammoModel[10].setRotationPoint(-0.5F, -8.75F, -1F);

        ammoModel[11].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 102
        ammoModel[11].setRotationPoint(-11.5F, -9.25F, -1.5F);

        ammoModel[12].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 103
        ammoModel[12].setRotationPoint(-3.5F, -10.75F, -1.25F);

        ammoModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 104
        ammoModel[13].setRotationPoint(-3.5F, -11.25F, -1.25F);

        ammoModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 105
        ammoModel[14].setRotationPoint(-3.5F, -11.25F, -0.75F);

        ammoModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 106
        ammoModel[15].setRotationPoint(-3.5F, -10.75F, -0.75F);

        ammoModel[16].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 107
        ammoModel[16].setRotationPoint(-0.5F, -11F, -1F);

        ammoModel[17].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 108
        ammoModel[17].setRotationPoint(-11.5F, -11.5F, -1.5F);

        ammoModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 109
        ammoModel[18].setRotationPoint(-3.5F, -4F, -1.25F);

        ammoModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 110
        ammoModel[19].setRotationPoint(-3.5F, -4.5F, -1.25F);

        ammoModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 111
        ammoModel[20].setRotationPoint(-3.5F, -4.5F, -0.75F);

        ammoModel[21].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 112
        ammoModel[21].setRotationPoint(-3.5F, -4F, -0.75F);

        ammoModel[22].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 113
        ammoModel[22].setRotationPoint(-0.5F, -4.25F, -1F);

        ammoModel[23].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 114
        ammoModel[23].setRotationPoint(-11.5F, -4.75F, -1.5F);

        ammoModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 115
        ammoModel[24].setRotationPoint(-3.5F, -13F, -1.25F);

        ammoModel[25].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 116
        ammoModel[25].setRotationPoint(-3.5F, -13.5F, -1.25F);

        ammoModel[26].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 117
        ammoModel[26].setRotationPoint(-3.5F, -13.5F, -0.75F);

        ammoModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 118
        ammoModel[27].setRotationPoint(-3.5F, -13F, -0.75F);

        ammoModel[28].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 119
        ammoModel[28].setRotationPoint(-0.5F, -13.25F, -1F);

        ammoModel[29].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 120
        ammoModel[29].setRotationPoint(-11.5F, -13.75F, -1.5F);


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
        reloadAnimation = WeaponAnimations.SNIPER_TOP;
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
        //translateClip = new Vector3f(-0 /16F, -20F /16F, 1F /16F);

        hasFlash = false;

        leftArmPos = new Vector3f(-0.2F, -0.7F, 0.07F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.7F, 0.07F);
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