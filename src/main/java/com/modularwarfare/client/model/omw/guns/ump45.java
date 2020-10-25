package com.modularwarfare.client.model.omw.guns;


import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;
import org.lwjgl.util.vector.Vector3f;

public class ump45 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public ump45() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[114];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
        gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
        gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 100
        gunModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 102
        gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 116
        gunModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 219
        gunModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
        gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
        gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
        gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
        gunModel[12] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 18
        gunModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 20
        gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 18
        gunModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
        gunModel[16] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 21
        gunModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
        gunModel[18] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 23
        gunModel[19] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 24
        gunModel[20] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 25
        gunModel[21] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 27
        gunModel[22] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 28
        gunModel[23] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 29
        gunModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 30
        gunModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 31
        gunModel[26] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 32
        gunModel[27] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 33
        gunModel[28] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 34
        gunModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 35
        gunModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 37
        gunModel[31] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 38
        gunModel[32] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 39
        gunModel[33] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 40
        gunModel[34] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 41
        gunModel[35] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 42
        gunModel[36] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 30
        gunModel[37] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 31
        gunModel[38] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 32
        gunModel[39] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 34
        gunModel[40] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 47
        gunModel[41] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 48
        gunModel[42] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 49
        gunModel[43] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 50
        gunModel[44] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 51
        gunModel[45] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 52
        gunModel[46] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 53
        gunModel[47] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 54
        gunModel[48] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 55
        gunModel[49] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 56
        gunModel[50] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 57
        gunModel[51] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 58
        gunModel[52] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 59
        gunModel[53] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 60
        gunModel[54] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 61
        gunModel[55] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 63
        gunModel[56] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 64
        gunModel[57] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 65
        gunModel[58] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 66
        gunModel[59] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 67
        gunModel[60] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 68
        gunModel[61] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 75
        gunModel[62] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 76
        gunModel[63] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 77
        gunModel[64] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 78
        gunModel[65] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 79
        gunModel[66] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 80
        gunModel[67] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 81
        gunModel[68] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 82
        gunModel[69] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 83
        gunModel[70] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 84
        gunModel[71] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 86
        gunModel[72] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 87
        gunModel[73] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 88
        gunModel[74] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 89
        gunModel[75] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 90
        gunModel[76] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 91
        gunModel[77] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 92
        gunModel[78] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 93
        gunModel[79] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 201
        gunModel[80] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 202
        gunModel[81] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 205
        gunModel[82] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 103
        gunModel[83] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 104
        gunModel[84] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 105
        gunModel[85] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 106
        gunModel[86] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 107
        gunModel[87] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 110
        gunModel[88] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 111
        gunModel[89] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 112
        gunModel[90] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 113
        gunModel[91] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 114
        gunModel[92] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 115
        gunModel[93] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 123
        gunModel[94] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 126
        gunModel[95] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 127
        gunModel[96] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 128
        gunModel[97] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 129
        gunModel[98] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 130
        gunModel[99] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 131
        gunModel[100] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 132
        gunModel[101] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 133
        gunModel[102] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 134
        gunModel[103] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 135
        gunModel[104] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 136
        gunModel[105] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 137
        gunModel[106] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 138
        gunModel[107] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 139
        gunModel[108] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 140
        gunModel[109] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 141
        gunModel[110] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 142
        gunModel[111] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 143
        gunModel[112] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 144
        gunModel[113] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 145

        gunModel[0].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 4
        gunModel[0].setRotationPoint(-10.5F, -5.2F, -2F);

        gunModel[1].addBox(-6F, 0F, 0F, 6, 11, 4, 0F); // Box 7
        gunModel[1].setRotationPoint(-3F, -5.2F, -2F);
        gunModel[1].rotateAngleZ = -0.64577182F;

        gunModel[2].addBox(-6.15F, 0F, 0F, 9, 4, 4, 0F); // Box 8
        gunModel[2].setRotationPoint(-8.55F, 1.8F, -2F);
        gunModel[2].rotateAngleZ = -0.31415927F;

        gunModel[3].addBox(-5.55F, -1.2F, 0F, 7, 12, 4, 0F); // Box 10
        gunModel[3].setRotationPoint(-3.5F, -5.2F, -2F);
        gunModel[3].rotateAngleZ = -0.45378561F;

        gunModel[4].addBox(0F, 0F, 0F, 9, 1, 2, 0F); // Box 100
        gunModel[4].setRotationPoint(2F, -5F, -1F);

        gunModel[5].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 102
        gunModel[5].setRotationPoint(13F, -11F, -2.01F);
        gunModel[5].rotateAngleZ = 0.06981317F;

        gunModel[6].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 116
        gunModel[6].setRotationPoint(2.25F, -11F, -0.5F);
        gunModel[6].rotateAngleZ = 0.08726646F;

        gunModel[7].addBox(-6F, 0F, 0F, 2, 1, 4, 0F); // Box 219
        gunModel[7].setRotationPoint(-2.2F, 5.15F, -2.01F);

        gunModel[8].addBox(-6F, 0F, 0F, 7, 6, 4, 0F); // Box 14
        gunModel[8].setRotationPoint(-2F, -11F, -2F);

        gunModel[9].addBox(-6F, 0F, 0F, 33, 6, 4, 0F); // Box 15
        gunModel[9].setRotationPoint(-2F, -17F, -2F);

        gunModel[10].addBox(-6F, 0F, 0F, 5, 3, 4, 0F); // Box 16
        gunModel[10].setRotationPoint(-7F, -17F, -2F);

        gunModel[11].addBox(-1F, 0.8F, 0F, 5, 2, 4, 0F); // Box 17
        gunModel[11].setRotationPoint(-9F, -16F, -2.01F);
        gunModel[11].rotateAngleZ = -0.75049158F;

        gunModel[12].addBox(-6F, 0F, 0F, 9, 10, 5, 0F); // Box 18
        gunModel[12].setRotationPoint(22.75F, -18F, -2.51F);
        gunModel[12].rotateAngleZ = 0.13962634F;

        gunModel[13].addBox(-6.01F, 4.75F, 0F, 7, 6, 6, 0F); // Box 20
        gunModel[13].setRotationPoint(23.5F, -19.5F, -3.01F);
        gunModel[13].rotateAngleZ = 0.13962634F;

        gunModel[14].addBox(-5F, -1F, 0F, 5, 1, 2, 0F); // Box 18
        gunModel[14].setRotationPoint(2.25F, -4F, -1F);
        gunModel[14].rotateAngleZ = -0.34906585F;

        gunModel[15].addBox(0F, -1F, 0F, 5, 1, 2, 0F); // Box 20
        gunModel[15].setRotationPoint(11F, -4F, -1F);
        gunModel[15].rotateAngleZ = 0.87266463F;

        gunModel[16].addBox(-6F, 0F, 0F, 54, 2, 5, 0F); // Box 21
        gunModel[16].setRotationPoint(-15F, -19F, -2.5F);

        gunModel[17].addBox(-6F, 0F, 0F, 54, 2, 5, 0F); // Box 22
        gunModel[17].setRotationPoint(-15F, -23F, -2.5F);

        gunModel[18].addBox(-6F, 0F, 0F, 48, 2, 5, 0F); // Box 23
        gunModel[18].setRotationPoint(-15F, -21F, -2.5F);

        gunModel[19].addBox(-6F, 0F, 0F, 26, 5, 5, 0F); // Box 24
        gunModel[19].setRotationPoint(39F, -22F, -2.5F);

        gunModel[20].addBox(-9F, -3F, 0F, 9, 3, 4, 0F); // Box 25
        gunModel[20].setRotationPoint(-13F, -14F, -2.01F);
        gunModel[20].rotateAngleZ = -0.27925268F;

        gunModel[21].addBox(-6F, 0F, 0F, 1, 1, 4, 0F); // Box 27
        gunModel[21].setRotationPoint(39F, -23F, -2F);

        gunModel[22].addBox(-6F, 0F, 0F, 4, 1, 4, 0F); // Box 28
        gunModel[22].setRotationPoint(49F, -23F, -2F);

        gunModel[23].addBox(-6F, 0F, 0F, 4, 1, 4, 0F); // Box 29
        gunModel[23].setRotationPoint(61F, -23F, -2F);

        gunModel[24].addBox(-6F, 0F, 0F, 72, 1, 4, 0F); // Box 30
        gunModel[24].setRotationPoint(-7F, -24F, -2F);

        gunModel[25].addBox(-6F, 0F, 0F, 72, 1, 3, 0F); // Box 31
        gunModel[25].setRotationPoint(-7F, -25F, -1.5F);

        gunModel[26].addBox(-6F, 0F, 0F, 6, 3, 3, 0F); // Box 32
        gunModel[26].setRotationPoint(59F, -28F, -1.5F);

        gunModel[27].addBox(-6F, 0F, 0F, 46, 3, 3, 0F); // Box 33
        gunModel[27].setRotationPoint(-7F, -28F, -1.5F);

        gunModel[28].addBox(-6F, 0F, 0F, 16, 1, 3, 0F); // Box 34
        gunModel[28].setRotationPoint(43F, -28F, -1.5F);

        gunModel[29].addBox(-6F, -1F, 0F, 72, 1, 1, 0F); // Box 35
        gunModel[29].setRotationPoint(-7.01F, -24F, -2F);
        gunModel[29].rotateAngleX = -0.45378561F;

        gunModel[30].addBox(-6F, -1F, -1F, 72, 1, 1, 0F); // Box 37
        gunModel[30].setRotationPoint(-7.01F, -24F, 2F);
        gunModel[30].rotateAngleX = 0.45378561F;

        gunModel[31].addBox(-6F, 0F, 0F, 20, 3, 2, 0F); // Box 38
        gunModel[31].setRotationPoint(39F, -27.75F, -1.25F);

        gunModel[32].addBox(-6F, 0F, 0F, 20, 3, 2, 0F); // Box 39
        gunModel[32].setRotationPoint(39F, -27.76F, -0.75F);

        gunModel[33].addBox(-6F, 0F, 0F, 22, 1, 1, 0F); // Box 40
        gunModel[33].setRotationPoint(43F, -28.9F, -0.5F);

        gunModel[34].addBox(-6F, 0F, 0F, 22, 1, 2, 0F); // Box 41
        gunModel[34].setRotationPoint(43.01F, -28.9F, 0.5F);
        gunModel[34].rotateAngleX = -0.6981317F;

        gunModel[35].addBox(-6F, 0F, -2F, 22, 1, 2, 0F); // Box 42
        gunModel[35].setRotationPoint(43.01F, -28.9F, -0.5F);
        gunModel[35].rotateAngleX = 0.6981317F;

        gunModel[36].addBox(0F, 0F, 0F, 45, 2, 2, 0F); // Box 30
        gunModel[36].setRotationPoint(-13F, -29.5F, -1.25F);

        gunModel[37].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 31
        gunModel[37].setRotationPoint(-1F, -30F, -1.51F);

        gunModel[38].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 32
        gunModel[38].setRotationPoint(0.5F, -30F, -1.51F);

        gunModel[39].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 34
        gunModel[39].setRotationPoint(2F, -30F, -1.51F);

        gunModel[40].addBox(0F, 0F, 0F, 45, 2, 2, 0F); // Box 47
        gunModel[40].setRotationPoint(-13.01F, -29.5F, -0.75F);

        gunModel[41].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 48
        gunModel[41].setRotationPoint(3.5F, -30F, -1.51F);

        gunModel[42].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 49
        gunModel[42].setRotationPoint(5F, -30F, -1.51F);

        gunModel[43].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 50
        gunModel[43].setRotationPoint(6.5F, -30F, -1.51F);

        gunModel[44].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 51
        gunModel[44].setRotationPoint(12.5F, -30F, -1.51F);

        gunModel[45].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 52
        gunModel[45].setRotationPoint(14F, -30F, -1.51F);

        gunModel[46].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 53
        gunModel[46].setRotationPoint(15.5F, -30F, -1.51F);

        gunModel[47].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 54
        gunModel[47].setRotationPoint(8F, -30F, -1.51F);

        gunModel[48].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 55
        gunModel[48].setRotationPoint(9.5F, -30F, -1.51F);

        gunModel[49].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 56
        gunModel[49].setRotationPoint(11F, -30F, -1.51F);

        gunModel[50].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 57
        gunModel[50].setRotationPoint(23F, -30F, -1.51F);

        gunModel[51].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 58
        gunModel[51].setRotationPoint(21.5F, -30F, -1.51F);

        gunModel[52].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 59
        gunModel[52].setRotationPoint(20F, -30F, -1.51F);

        gunModel[53].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 60
        gunModel[53].setRotationPoint(18.5F, -30F, -1.51F);

        gunModel[54].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 61
        gunModel[54].setRotationPoint(17F, -30F, -1.51F);

        gunModel[55].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 63
        gunModel[55].setRotationPoint(29F, -30F, -1.51F);

        gunModel[56].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 64
        gunModel[56].setRotationPoint(27.5F, -30F, -1.51F);

        gunModel[57].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 65
        gunModel[57].setRotationPoint(26F, -30F, -1.51F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 66
        gunModel[58].setRotationPoint(24.5F, -30F, -1.51F);

        gunModel[59].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 67
        gunModel[59].setRotationPoint(-6F, -30F, -1.51F);

        gunModel[60].addBox(0F, 0F, 0F, 12, 6, 6, 0F); // Box 68
        gunModel[60].setRotationPoint(-16F, -29F, -3F);

        gunModel[61].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 75
        gunModel[61].setRotationPoint(16.5F, -8F, -0.5F);
        gunModel[61].rotateAngleZ = 0.12217305F;

        gunModel[62].addBox(-6F, 0F, 0F, 1, 2, 4, 0F); // Box 76
        gunModel[62].setRotationPoint(38.5F, -21F, -2F);

        gunModel[63].addBox(-6F, 0F, 0F, 1, 2, 4, 0F); // Box 77
        gunModel[63].setRotationPoint(32.5F, -21F, -2F);

        gunModel[64].addBox(-6F, 0F, 0F, 3, 6, 5, 0F); // Box 78
        gunModel[64].setRotationPoint(60.6F, -17F, -2.51F);

        gunModel[65].addBox(-6F, 0F, 0F, 1, 5, 5, 0F); // Box 79
        gunModel[65].setRotationPoint(63.5F, -16F, -2.49F);
        gunModel[65].rotateAngleZ = -0.2443461F;

        gunModel[66].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 80
        gunModel[66].setRotationPoint(53F, -16F, -1.51F);

        gunModel[67].addBox(0F, 0F, 0F, 21, 2, 2, 0F); // Box 81
        gunModel[67].setRotationPoint(33.99F, -17.5F, -0.75F);

        gunModel[68].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 82
        gunModel[68].setRotationPoint(50F, -16F, -1.51F);

        gunModel[69].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 83
        gunModel[69].setRotationPoint(44F, -16F, -1.51F);

        gunModel[70].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 84
        gunModel[70].setRotationPoint(47F, -16F, -1.51F);

        gunModel[71].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 86
        gunModel[71].setRotationPoint(35F, -16F, -1.51F);

        gunModel[72].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 87
        gunModel[72].setRotationPoint(38F, -16F, -1.51F);

        gunModel[73].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 88
        gunModel[73].setRotationPoint(41F, -16F, -1.51F);

        gunModel[74].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 89
        gunModel[74].setRotationPoint(25.99F, -17.5F, -0.75F);

        gunModel[75].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 90
        gunModel[75].setRotationPoint(27.99F, -17.5F, -0.75F);

        gunModel[76].addBox(0F, -3F, 0F, 5, 3, 2, 0F); // Box 91
        gunModel[76].setRotationPoint(29.99F, -14.5F, -0.74F);
        gunModel[76].rotateAngleZ = 0.33161256F;

        gunModel[77].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 92
        gunModel[77].setRotationPoint(26.99F, -17.5F, -0.75F);

        gunModel[78].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 93
        gunModel[78].setRotationPoint(26.99F, -15.5F, -0.75F);

        gunModel[79].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 201
        gunModel[79].setRotationPoint(70.5F, -22.25F, -2.5F);

        gunModel[80].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 202
        gunModel[80].setRotationPoint(70.5F, -18.25F, -2.5F);

        gunModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 205
        gunModel[81].setRotationPoint(71.5F, -21.25F, 1.5F);

        gunModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
        gunModel[82].setRotationPoint(71.5F, -21.25F, -2.5F);

        gunModel[83].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 104
        gunModel[83].setRotationPoint(62.5F, -21.75F, -2F);

        gunModel[84].addBox(0F, 0F, 0F, 4, 6, 6, 0F); // Box 105
        gunModel[84].setRotationPoint(58.5F, -22.75F, -3F);

        gunModel[85].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 106
        gunModel[85].setRotationPoint(67.5F, -21.25F, 1.5F);

        gunModel[86].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 107
        gunModel[86].setRotationPoint(67.5F, -21.25F, -2.5F);

        gunModel[87].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 110
        gunModel[87].setRotationPoint(71.5F, -22.25F, -2.5F);

        gunModel[88].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 111
        gunModel[88].setRotationPoint(71.5F, -18.25F, -2.5F);

        gunModel[89].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 112
        gunModel[89].setRotationPoint(67.5F, -22.25F, -2.5F);

        gunModel[90].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 113
        gunModel[90].setRotationPoint(67.5F, -18.25F, -2.5F);

        gunModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 114
        gunModel[91].setRotationPoint(71.5F, -19.25F, -2.5F);

        gunModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 115
        gunModel[92].setRotationPoint(71.5F, -19.25F, 1.5F);

        gunModel[93].addBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 123
        gunModel[93].setRotationPoint(54F, -32.15F, 0F);
        gunModel[93].rotateAngleX = 0.78539816F;

        gunModel[94].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 126
        gunModel[94].setRotationPoint(-21F, -26F, -3F);

        gunModel[95].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 127
        gunModel[95].setRotationPoint(-19F, -28F, -3F);

        gunModel[96].addBox(-8F, 0F, 0F, 8, 4, 6, 0F); // Box 128
        gunModel[96].setRotationPoint(-19F, -28F, -3F);
        gunModel[96].rotateAngleZ = 0.45378561F;

        gunModel[97].addBox(0F, 0F, 0F, 6, 8, 6, 0F); // Box 129
        gunModel[97].setRotationPoint(-27F, -24.5F, -3F);

        gunModel[98].addBox(0F, 0F, 0F, 6, 8, 6, 0F); // Box 130
        gunModel[98].setRotationPoint(-33F, -23.5F, -3F);

        gunModel[99].addBox(-22F, 1F, 0F, 29, 2, 6, 0F); // Box 131
        gunModel[99].setRotationPoint(-33F, -16.5F, -3.01F);
        gunModel[99].rotateAngleZ = 0.38397244F;

        gunModel[100].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 132
        gunModel[100].setRotationPoint(-59F, -23.5F, -3F);

        gunModel[101].addBox(-6F, 0F, 0F, 6, 1, 6, 0F); // Box 133
        gunModel[101].setRotationPoint(-27F, -24.5F, -3.01F);
        gunModel[101].rotateAngleZ = 0.19198622F;

        gunModel[102].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 134
        gunModel[102].setRotationPoint(-35F, -20.5F, -2.5F);

        gunModel[103].addBox(0F, 0F, 0F, 2, 10, 5, 0F); // Box 135
        gunModel[103].setRotationPoint(-41F, -21.5F, -2.5F);
        gunModel[103].rotateAngleZ = -0.08726646F;

        gunModel[104].addBox(-1F, 0F, 0F, 1, 8, 5, 0F); // Box 136
        gunModel[104].setRotationPoint(-40F, -18.5F, -2.5F);
        gunModel[104].rotateAngleZ = -0.2268928F;

        gunModel[105].addBox(0F, 0F, 0F, 2, 10, 5, 0F); // Box 137
        gunModel[105].setRotationPoint(-41F, -21.5F, -2.51F);
        gunModel[105].rotateAngleZ = 0.13962634F;

        gunModel[106].addBox(-22F, 1F, 0F, 6, 2, 6, 0F); // Box 138
        gunModel[106].setRotationPoint(-36F, -8.5F, -3.01F);

        gunModel[107].addBox(-22F, 1F, 0F, 4, 20, 7, 0F); // Box 139
        gunModel[107].setRotationPoint(-39.5F, -25.5F, -3.5F);

        gunModel[108].addBox(-22F, 1F, 0F, 2, 1, 5, 0F); // Box 140
        gunModel[108].setRotationPoint(-36F, -10.5F, -2.5F);

        gunModel[109].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 141
        gunModel[109].setRotationPoint(-56F, -9.5F, -2.5F);
        gunModel[109].rotateAngleZ = -0.66322512F;

        gunModel[110].addBox(-22F, 1F, 0F, 1, 1, 5, 0F); // Box 142
        gunModel[110].setRotationPoint(-36F, -9.5F, -2.5F);

        gunModel[111].addBox(-22F, 1F, 0F, 6, 1, 5, 0F); // Box 143
        gunModel[111].setRotationPoint(-36.75F, -10.25F, -2.5F);
        gunModel[111].rotateAngleZ = 0.17453293F;

        gunModel[112].addBox(-22F, 1F, 0F, 1, 9, 7, 0F); // Box 144
        gunModel[112].setRotationPoint(-40.5F, -27.5F, -3.51F);
        gunModel[112].rotateAngleZ = 0.08726646F;

        gunModel[113].addBox(-22F, 1F, 0F, 1, 9, 7, 0F); // Box 145
        gunModel[113].setRotationPoint(-39.5F, -12.5F, -3.51F);
        gunModel[113].rotateAngleZ = -0.08726646F;


        defaultScopeModel = new ModelRendererTurbo[20];
        defaultScopeModel[0] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 69
        defaultScopeModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 70
        defaultScopeModel[2] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 71
        defaultScopeModel[3] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 72
        defaultScopeModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 73
        defaultScopeModel[5] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 74
        defaultScopeModel[6] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 118
        defaultScopeModel[7] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 119
        defaultScopeModel[8] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 120
        defaultScopeModel[9] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 121
        defaultScopeModel[10] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 122
        defaultScopeModel[11] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 129
        defaultScopeModel[12] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 130
        defaultScopeModel[13] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 131
        defaultScopeModel[14] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 132
        defaultScopeModel[15] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 133
        defaultScopeModel[16] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 134
        defaultScopeModel[17] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 135
        defaultScopeModel[18] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 136
        defaultScopeModel[19] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 137

        defaultScopeModel[0].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 69
        defaultScopeModel[0].setRotationPoint(-10F, -34F, -3F);

        defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 70
        defaultScopeModel[1].setRotationPoint(-5F, -32F, -3F);

        defaultScopeModel[2].addBox(-4F, 0F, 0F, 11, 5, 1, 0F); // Box 71
        defaultScopeModel[2].setRotationPoint(-15.78F, -30.1F, -2.99F);
        defaultScopeModel[2].rotateAngleZ = 0.59341195F;

        defaultScopeModel[3].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 72
        defaultScopeModel[3].setRotationPoint(-10F, -34F, 2F);

        defaultScopeModel[4].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 73
        defaultScopeModel[4].setRotationPoint(-5F, -32F, 2F);

        defaultScopeModel[5].addBox(-4F, 0F, 0F, 11, 5, 1, 0F); // Box 74
        defaultScopeModel[5].setRotationPoint(-15.78F, -30.1F, 1.99F);
        defaultScopeModel[5].rotateAngleZ = 0.59341195F;

        defaultScopeModel[6].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 118
        defaultScopeModel[6].setRotationPoint(51F, -29.9F, -1.5F);

        defaultScopeModel[7].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 119
        defaultScopeModel[7].setRotationPoint(53F, -31.9F, -1.5F);

        defaultScopeModel[8].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 120
        defaultScopeModel[8].setRotationPoint(53F, -33.9F, -2F);

        defaultScopeModel[9].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 121
        defaultScopeModel[9].setRotationPoint(53F, -33.9F, 1F);

        defaultScopeModel[10].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 122
        defaultScopeModel[10].setRotationPoint(53F, -34.9F, -1.5F);

        defaultScopeModel[11].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 129
        defaultScopeModel[11].setRotationPoint(-15.78F, -28.1F, -2F);
        defaultScopeModel[11].rotateAngleZ = 0.59341195F;

        defaultScopeModel[12].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 130
        defaultScopeModel[12].setRotationPoint(-10F, -32F, -1.99F);

        defaultScopeModel[13].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 131
        defaultScopeModel[13].setRotationPoint(-15.78F, -28.1F, 1F);
        defaultScopeModel[13].rotateAngleZ = 0.59341195F;

        defaultScopeModel[14].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 132
        defaultScopeModel[14].setRotationPoint(-10F, -32F, 0.99F);

        defaultScopeModel[15].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 133
        defaultScopeModel[15].setRotationPoint(-15.78F, -27.1F, -1F);
        defaultScopeModel[15].rotateAngleZ = 0.59341195F;

        defaultScopeModel[16].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 134
        defaultScopeModel[16].setRotationPoint(-10F, -33.9F, -2F);

        defaultScopeModel[17].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 135
        defaultScopeModel[17].setRotationPoint(-10F, -34.9F, -1.5F);

        defaultScopeModel[18].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 136
        defaultScopeModel[18].setRotationPoint(-10F, -33.9F, 1F);

        defaultScopeModel[19].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 137
        defaultScopeModel[19].setRotationPoint(-10F, -31.9F, -1.5F);


        ammoModel = new ModelRendererTurbo[4];
        ammoModel[0] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 116
        ammoModel[1] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 117
        ammoModel[2] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 124
        ammoModel[3] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 125

        ammoModel[0].addBox(-1F, 10F, 0F, 3, 38, 4, 0F); // Box 116
        ammoModel[0].setRotationPoint(22F, -22F, -2F);
        ammoModel[0].rotateAngleZ = 0.20943951F;

        ammoModel[1].addBox(-6F, 48F, 0F, 8, 3, 5, 0F); // Box 117
        ammoModel[1].setRotationPoint(22F, -22F, -2.5F);
        ammoModel[1].rotateAngleZ = 0.20943951F;

        ammoModel[2].addBox(-6F, 10F, 0F, 3, 38, 4, 0F); // Box 124
        ammoModel[2].setRotationPoint(22F, -22F, -2F);
        ammoModel[2].rotateAngleZ = 0.20943951F;

        ammoModel[3].addBox(-3F, 10F, 0F, 2, 38, 3, 0F); // Box 125
        ammoModel[3].setRotationPoint(22F, -22F, -1.5F);
        ammoModel[3].rotateAngleZ = 0.20943951F;

        this.modelScale = 0.15F;
        translateAll = new Vector3f(0F, -10.5F, 0F);

        this.crouchZoom = -0.2f;

        leftArmPos = new Vector3f(0.05F, -0.70F, 0.1F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
        leftArmReloadPos = new Vector3f(0.F, -0.72F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);

        rightArmPos = new Vector3f(0.27F, -0.76F, 0.0F);
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
        this.muzzleFlashPointNormal = new Vector3f(0F, 1.2F, 0.9F);
        this.muzzleFlashPointScoping = new Vector3f(0F, 1.2F, 0.1F);

        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

        thirdPersonOffset = new Vector3f(-0.1F, -0.13F, 0F);
        thirdPersonScale = 0.8f;
        translateAll(0F, 0F, 0F);

        flipAll();
    }
}