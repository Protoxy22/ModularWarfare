package com.modularwarfare.client.model.omw.guns;


import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class p1911 extends ModelGun //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public p1911() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[70];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
        gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 104
        gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 105
        gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 106
        gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
        gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
        gunModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
        gunModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 18
        gunModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 19
        gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
        gunModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 21
        gunModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 22
        gunModel[14] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 23
        gunModel[15] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 25
        gunModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
        gunModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 36
        gunModel[18] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 37
        gunModel[19] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 38
        gunModel[20] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 39
        gunModel[21] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 40
        gunModel[22] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 41
        gunModel[23] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 42
        gunModel[24] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 43
        gunModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 44
        gunModel[26] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 45
        gunModel[27] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 46
        gunModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 47
        gunModel[29] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 48
        gunModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 49
        gunModel[31] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 50
        gunModel[32] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 51
        gunModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 52
        gunModel[34] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 53
        gunModel[35] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 54
        gunModel[36] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 55
        gunModel[37] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 56
        gunModel[38] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 57
        gunModel[39] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 58
        gunModel[40] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 60
        gunModel[41] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 62
        gunModel[42] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 63
        gunModel[43] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 64
        gunModel[44] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 70
        gunModel[45] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 71
        gunModel[46] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 72
        gunModel[47] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 73
        gunModel[48] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 74
        gunModel[49] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 75
        gunModel[50] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 77
        gunModel[51] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 78
        gunModel[52] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 79
        gunModel[53] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 81
        gunModel[54] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 82
        gunModel[55] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 83
        gunModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 84
        gunModel[57] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 85
        gunModel[58] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 86
        gunModel[59] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 87
        gunModel[60] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 88
        gunModel[61] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 89
        gunModel[62] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 90
        gunModel[63] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 91
        gunModel[64] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 92
        gunModel[65] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 93
        gunModel[66] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 94
        gunModel[67] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 95
        gunModel[68] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 96
        gunModel[69] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 70

        gunModel[0].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 101
        gunModel[0].setRotationPoint(-7.5F, -2.25F, -1.5F);

        gunModel[1].addBox(-2F, -1F, 0F, 2, 1, 3, 0F); // Box 104
        gunModel[1].setRotationPoint(-7.5F, -1.25F, -1.5F);
        gunModel[1].rotateAngleZ = -0.78539816F;

        gunModel[2].addBox(-2F, -1F, 0F, 1, 4, 3, 0F); // Box 105
        gunModel[2].setRotationPoint(-7F, -5.75F, -1.5F);

        gunModel[3].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 106
        gunModel[3].setRotationPoint(-8.5F, -5.25F, -0.5F);

        gunModel[4].addBox(0F, -1F, 0F, 2, 1, 3, 0F); // Box 4
        gunModel[4].setRotationPoint(-1.5F, -1.25F, -1.5F);
        gunModel[4].rotateAngleZ = 0.78539816F;

        gunModel[5].addBox(-2F, -1F, 0F, 1, 4, 3, 0F); // Box 5
        gunModel[5].setRotationPoint(1F, -5.75F, -1.5F);

        gunModel[6].addBox(0F, 0F, 0F, 10, 1, 5, 0F); // Box 11
        gunModel[6].setRotationPoint(-9F, -7F, -2.5F);

        gunModel[7].addBox(0F, 0F, 0F, 32, 3, 5, 0F); // Box 13
        gunModel[7].setRotationPoint(-22F, -10F, -2.5F);

        gunModel[8].addBox(0F, 0F, 0F, 12, 1, 5, 0F); // Box 14
        gunModel[8].setRotationPoint(10F, -11.75F, -2.5F);

        gunModel[9].addBox(0F, 0F, 0F, 13, 4, 2, 0F); // Box 18
        gunModel[9].setRotationPoint(-20F, -13.8F, -2.6F);

        gunModel[10].addBox(0F, 0F, 0F, 29, 1, 2, 0F); // Box 19
        gunModel[10].setRotationPoint(-21F, -15.1F, -1F);

        gunModel[11].addBox(0F, 0F, 0F, 43, 1, 2, 0F); // Box 20
        gunModel[11].setRotationPoint(-21F, -15.1F, 1F);
        gunModel[11].rotateAngleX = -0.6981317F;

        gunModel[12].addBox(0F, 0F, -2F, 14, 1, 2, 0F); // Box 21
        gunModel[12].setRotationPoint(-21F, -15.1F, -1F);
        gunModel[12].rotateAngleX = 0.6981317F;

        gunModel[13].addBox(0F, 0F, 0F, 30, 4, 2, 0F); // Box 22
        gunModel[13].setRotationPoint(-20F, -13.8F, 0.6F);

        gunModel[14].addBox(0F, 0F, 0F, 12, 2, 5, 0F); // Box 23
        gunModel[14].setRotationPoint(10F, -13.75F, -2.5F);

        gunModel[15].addBox(0F, 0F, 0F, 18, 1, 3, 0F); // Box 25
        gunModel[15].setRotationPoint(4F, -10.75F, 2.25F);
        gunModel[15].rotateAngleX = -1.74532925F;

        gunModel[16].addBox(0F, 0F, 0F, 41, 2, 2, 0F); // Box 29
        gunModel[16].setRotationPoint(-19.01F, -15.2F, -1F);

        gunModel[17].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 36
        gunModel[17].setRotationPoint(-18F, -13.8F, 1.8F);

        gunModel[18].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 37
        gunModel[18].setRotationPoint(-16.5F, -13.8F, 1.8F);

        gunModel[19].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 38
        gunModel[19].setRotationPoint(-13.5F, -13.8F, 1.8F);

        gunModel[20].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 39
        gunModel[20].setRotationPoint(-15F, -13.8F, 1.8F);

        gunModel[21].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 40
        gunModel[21].setRotationPoint(-10.5F, -13.8F, 1.8F);

        gunModel[22].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 41
        gunModel[22].setRotationPoint(-12F, -13.8F, 1.8F);

        gunModel[23].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 42
        gunModel[23].setRotationPoint(-10.5F, -13.8F, -2.8F);

        gunModel[24].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 43
        gunModel[24].setRotationPoint(-12F, -13.8F, -2.8F);

        gunModel[25].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 44
        gunModel[25].setRotationPoint(-13.5F, -13.8F, -2.8F);

        gunModel[26].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 45
        gunModel[26].setRotationPoint(-15F, -13.8F, -2.8F);

        gunModel[27].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 46
        gunModel[27].setRotationPoint(-16.5F, -13.8F, -2.8F);

        gunModel[28].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 47
        gunModel[28].setRotationPoint(-18F, -13.8F, -2.8F);

        gunModel[29].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 48
        gunModel[29].setRotationPoint(12.5F, -14.2F, -1.5F);

        gunModel[30].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 49
        gunModel[30].setRotationPoint(18.8F, -16.25F, -0.5F);

        gunModel[31].addBox(0F, 0F, -2F, 22, 1, 2, 0F); // Box 50
        gunModel[31].setRotationPoint(0F, -15.1F, -1F);
        gunModel[31].rotateAngleX = 0.6981317F;

        gunModel[32].addBox(0F, 0F, 0F, 10, 4, 2, 0F); // Box 51
        gunModel[32].setRotationPoint(0F, -13.8F, -2.6F);

        gunModel[33].addBox(0F, 0F, 0F, 7, 3, 2, 0F); // Box 52
        gunModel[33].setRotationPoint(-7F, -12.8F, -2.6F);

        gunModel[34].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 53
        gunModel[34].setRotationPoint(-7F, -14.5F, -1.75F);
        gunModel[34].rotateAngleX = -0.33161256F;

        gunModel[35].addBox(0F, 0F, -1F, 7, 1, 1, 0F); // Box 54
        gunModel[35].setRotationPoint(-7F, -15.1F, -1F);
        gunModel[35].rotateAngleX = 0.6981317F;

        gunModel[36].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 55
        gunModel[36].setRotationPoint(-18.2F, -15.5F, -1F);

        gunModel[37].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 56
        gunModel[37].setRotationPoint(-18F, -16.2F, 0.5F);

        gunModel[38].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 57
        gunModel[38].setRotationPoint(-18F, -16.2F, -1.5F);

        gunModel[39].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 58
        gunModel[39].setRotationPoint(-19F, -8.5F, -3F);

        gunModel[40].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 60
        gunModel[40].setRotationPoint(-2F, -7.5F, -3F);

        gunModel[41].addBox(0F, 0F, -3F, 18, 1, 3, 0F); // Box 62
        gunModel[41].setRotationPoint(4F, -10.75F, -2.25F);
        gunModel[41].rotateAngleX = 1.74532925F;

        gunModel[42].addBox(0F, 0F, -3F, 18, 3, 3, 0F); // Box 63
        gunModel[42].setRotationPoint(4.01F, -10.75F, 1.5F);

        gunModel[43].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 64
        gunModel[43].setRotationPoint(12.25F, -10.2F, -1F);

        gunModel[44].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 70
        gunModel[44].setRotationPoint(-21F, -13.8F, -2.6F);

        gunModel[45].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 71
        gunModel[45].setRotationPoint(-21F, -13.8F, -2.6F);
        gunModel[45].rotateAngleZ = -0.20943951F;

        gunModel[46].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 72
        gunModel[46].setRotationPoint(-21.05F, -14.8F, -1F);

        gunModel[47].addBox(0F, -2F, 0F, 2, 2, 1, 0F); // Box 73
        gunModel[47].setRotationPoint(-8.5F, -5.25F, -0.5F);
        gunModel[47].rotateAngleZ = -0.43633231F;

        gunModel[48].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 74
        gunModel[48].setRotationPoint(-8.5F, -3.25F, -0.5F);
        gunModel[48].rotateAngleZ = 0.43633231F;

        gunModel[49].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 75
        gunModel[49].setRotationPoint(-12F, -6F, -2F);

        gunModel[50].addBox(0F, -2F, 0F, 1, 2, 4, 0F); // Box 77
        gunModel[50].setRotationPoint(-9F, -1F, -2F);

        gunModel[51].addBox(0F, -2F, 0F, 1, 1, 4, 0F); // Box 78
        gunModel[51].setRotationPoint(-8F, 0F, -2F);

        gunModel[52].addBox(0F, 0F, 0F, 11, 7, 5, 0F); // Box 79
        gunModel[52].setRotationPoint(-20F, -6F, -2.49F);
        gunModel[52].rotateAngleZ = -0.38397244F;

        gunModel[53].addBox(0F, 0F, 0F, 11, 5, 5, 0F); // Box 81
        gunModel[53].setRotationPoint(-20F, -7F, -2.51F);

        gunModel[54].addBox(0F, 0F, 0F, 11, 11, 5, 0F); // Box 82
        gunModel[54].setRotationPoint(-22.6F, 0.5F, -2.51F);
        gunModel[54].rotateAngleZ = -0.26179939F;

        gunModel[55].addBox(0F, -3F, 0F, 3, 14, 5, 0F); // Box 83
        gunModel[55].setRotationPoint(-23F, 0.5F, -2.5F);
        gunModel[55].rotateAngleZ = -0.52359878F;

        gunModel[56].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 84
        gunModel[56].setRotationPoint(-28.61F, 9.51F, -2.51F);
        gunModel[56].rotateAngleZ = -0.2443461F;

        gunModel[57].addBox(0F, 0F, 0F, 15, 3, 5, 0F); // Box 85
        gunModel[57].setRotationPoint(-28.6F, 9.5F, -2.49F);
        gunModel[57].rotateAngleZ = -0.2443461F;

        gunModel[58].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 86
        gunModel[58].setRotationPoint(-21F, -7F, -1.5F);
        gunModel[58].rotateAngleZ = -0.41887902F;

        gunModel[59].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 87
        gunModel[59].setRotationPoint(-22F, -9F, -1.51F);

        gunModel[60].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 88
        gunModel[60].setRotationPoint(-26F, -8.5F, -1.5F);
        gunModel[60].rotateAngleZ = 0.2443461F;

        gunModel[61].addBox(0F, -2F, 0F, 5, 2, 3, 0F); // Box 89
        gunModel[61].setRotationPoint(-26F, -6.5F, -1.49F);
        gunModel[61].rotateAngleZ = -0.26179939F;

        gunModel[62].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 90
        gunModel[62].setRotationPoint(-26F, -8.5F, -1.5F);

        gunModel[63].addBox(1F, 0F, 0F, 2, 1, 1, 0F); // Box 91
        gunModel[63].setRotationPoint(-23F, -15F, -0.5F);
        gunModel[63].rotateAngleZ = -0.55850536F;

        gunModel[64].addBox(2F, -1F, 0F, 7, 19, 6, 0F); // Box 92
        gunModel[64].setRotationPoint(-20F, -6F, -3F);
        gunModel[64].rotateAngleZ = -0.38397244F;

        gunModel[65].addBox(3.5F, -3F, 0F, 4, 2, 6, 0F); // Box 93
        gunModel[65].setRotationPoint(-20F, -6F, -3F);
        gunModel[65].rotateAngleZ = -0.38397244F;

        gunModel[66].addBox(2.5F, -2F, 0F, 1, 1, 6, 0F); // Box 94
        gunModel[66].setRotationPoint(-20F, -6F, -3F);
        gunModel[66].rotateAngleZ = -0.38397244F;

        gunModel[67].addBox(7.5F, -2F, 0F, 1, 1, 6, 0F); // Box 95
        gunModel[67].setRotationPoint(-20F, -6F, -3F);
        gunModel[67].rotateAngleZ = -0.38397244F;

        gunModel[68].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 96
        gunModel[68].setRotationPoint(-24.85F, 11.4F, -3.01F);
        gunModel[68].rotateAngleZ = -0.27925268F;

        gunModel[69].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 70
        gunModel[69].setRotationPoint(-10.5F, -6.8F, 1.8F);
        gunModel[69].rotateAngleZ = 1.44862328F;

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 61

        ammoModel[0].addBox(-0.5F, -12.75F, 0F, 9, 21, 4, 0F); // Box 61
        ammoModel[0].setRotationPoint(-23.5F, 6F, -2F);
        ammoModel[0].rotateAngleZ = -0.31415927F;



        this.modelScale = 0.2f;
        translateAll = new Vector3f(18F, -16.3F, 0.38F);


        gunSlideDistance = 0.06F;
        reloadAnimation = WeaponAnimations.PISTOL;

        leftArmPos = new Vector3f(-0.25F, -0.75F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -45.0F);
        leftArmReloadPos = new Vector3f(-0.25F, -0.75F, 0.12F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -35.0F);

        leftArmChargePos = new Vector3f(-0.27F, -0.60F, 0.07F);
        leftArmChargeRot = new Vector3f(75.0F, 15.0F, -45.0F);

        rightArmPos = new Vector3f(0.45F, -0.70F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.45F, -0.65F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 8.0F, -85.0F);

        leftHandAmmo = true;
        translateAimPosition = new Vector3f(0F, 0.01F, -0.0045F);

        rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        //RecoilSlideDistance = 0.1F;
        //RotateSlideDistance = -2F;

        hasFlash = true;
        flashScale = 1F;
        this.muzzleFlashPointNormal = new Vector3f(0.1F, 1.4F, 1F);
        this.muzzleFlashPointScoping = new Vector3f(0.1F, 1.6F, 0.15F);

        scopeIsOnSlide = false;
        slideLockOnEmpty = false;

        casingAnimDistance = new Vector3f(-5, -1, 12);
        casingAnimSpread = new Vector3f(2, 2, 0);
        casingAnimTime = 8;
        casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);

        crouchZoom = -0.05F;
        fancyStance = true;
        sprintRotate = new Vector3f(0.0F, -10.0F, 30.0F);
        sprintTranslate = new Vector3f(0.7F, 0.60F, 0.1F);

        chargeHandleDistance = 0.5F;
        chargeDelay = 0;
        chargeDelayAfterReload = 65;
        chargeTime = 10;

        actionArm = EnumArm.Left;
        actionType = EnumAction.Charge;

        chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);

        thirdPersonOffset = new Vector3f(-0.3F, -0.1F, 0F);//forward/up/?
        thirdPersonScale = 0.7f;

        flipAll();
    }
}