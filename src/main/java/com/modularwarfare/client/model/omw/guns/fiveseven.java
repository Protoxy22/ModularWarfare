package com.modularwarfare.client.model.omw.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class fiveseven extends ModelGun //Same as Filename
{
    int textureX = 128;
    int textureY = 128;

    public fiveseven() //Same as Filename
    {
        gunModel = new ModelRendererTurbo[61];
        gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
        gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 104
        gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 105
        gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 106
        gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
        gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
        gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
        gunModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 7
        gunModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 8
        gunModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
        gunModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
        gunModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 11
        gunModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
        gunModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 13
        gunModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
        gunModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 16
        gunModel[16] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 17
        gunModel[17] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 18
        gunModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 19
        gunModel[19] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 20
        gunModel[20] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 21
        gunModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 22
        gunModel[22] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 23
        gunModel[23] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 24
        gunModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 25
        gunModel[25] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 26
        gunModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 27
        gunModel[27] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 29
        gunModel[28] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 30
        gunModel[29] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 31
        gunModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 32
        gunModel[31] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 33
        gunModel[32] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 34
        gunModel[33] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 35
        gunModel[34] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 36
        gunModel[35] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 37
        gunModel[36] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 38
        gunModel[37] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 39
        gunModel[38] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 40
        gunModel[39] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 41
        gunModel[40] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 42
        gunModel[41] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 43
        gunModel[42] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 44
        gunModel[43] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 45
        gunModel[44] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 46
        gunModel[45] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 47
        gunModel[46] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 48
        gunModel[47] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 49
        gunModel[48] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 50
        gunModel[49] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 51
        gunModel[50] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 52
        gunModel[51] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 53
        gunModel[52] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 54
        gunModel[53] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 55
        gunModel[54] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 56
        gunModel[55] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 57
        gunModel[56] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 58
        gunModel[57] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 59
        gunModel[58] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 60
        gunModel[59] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 61
        gunModel[60] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 62

        gunModel[0].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 101
        gunModel[0].setRotationPoint(-4.5F, -1.5F, -1.5F);

        gunModel[1].addBox(-2F, -1F, 0F, 2, 1, 3, 0F); // Box 104
        gunModel[1].setRotationPoint(-4.5F, -0.5F, -1.5F);
        gunModel[1].rotateAngleZ = -0.78539816F;

        gunModel[2].addBox(-2F, -1F, 0F, 1, 4, 3, 0F); // Box 105
        gunModel[2].setRotationPoint(-4F, -5F, -1.5F);

        gunModel[3].addBox(-2F, 0F, 0F, 1, 4, 1, 0F); // Box 106
        gunModel[3].setRotationPoint(-0.5F, -6.5F, -0.5F);
        gunModel[3].rotateAngleZ = 0.20943951F;

        gunModel[4].addBox(0F, -1F, 0F, 2, 1, 3, 0F); // Box 4
        gunModel[4].setRotationPoint(4.5F, -0.5F, -1.5F);
        gunModel[4].rotateAngleZ = 0.78539816F;

        gunModel[5].addBox(-2F, -1F, 0F, 1, 4, 3, 0F); // Box 5
        gunModel[5].setRotationPoint(7F, -5F, -1.5F);

        gunModel[6].addBox(0F, 0F, 0F, 11, 6, 5, 0F); // Box 6
        gunModel[6].setRotationPoint(-17F, -6F, -2.5F);

        gunModel[7].addBox(-10F, -1F, 0F, 11, 12, 5, 0F); // Box 7
        gunModel[7].setRotationPoint(-7.5F, 0F, -2.5F);
        gunModel[7].rotateAngleZ = -0.29670597F;

        gunModel[8].addBox(-10.7F, 0F, 0F, 12, 3, 5, 0F); // Box 8
        gunModel[8].setRotationPoint(-10.5F, 10.4F, -2.5F);

        gunModel[9].addBox(-10.2F, -0.6F, 0F, 11, 3, 5, 0F); // Box 9
        gunModel[9].setRotationPoint(-10.5F, 10.4F, -2.51F);
        gunModel[9].rotateAngleZ = -0.2268928F;

        gunModel[10].addShapeBox(-2F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F); // Box 10
        gunModel[10].setRotationPoint(-4F, -1F, -1F);

        gunModel[11].addBox(0F, 0F, 0F, 24, 1, 5, 0F); // Box 11
        gunModel[11].setRotationPoint(-18F, -7F, -2.5F);

        gunModel[12].addBox(1F, 0F, 0F, 2, 1, 5, 0F); // Box 12
        gunModel[12].setRotationPoint(-20.6F, -7.7F, -2.5F);
        gunModel[12].rotateAngleZ = -0.26179939F;

        gunModel[13].addBox(0F, 0F, 0F, 27, 2, 5, 0F); // Box 13
        gunModel[13].setRotationPoint(-20F, -9F, -2.5F);

        gunModel[14].addBox(0F, 0F, 0F, 40, 3, 5, 0F); // Box 14
        gunModel[14].setRotationPoint(-18F, -12F, -2.5F);

        gunModel[15].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 16
        gunModel[15].setRotationPoint(7F, -8F, -1.25F);

        gunModel[16].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 17
        gunModel[16].setRotationPoint(7F, -8F, -1.75F);

        gunModel[17].addBox(0F, 0F, 0F, 12, 4, 2, 0F); // Box 18
        gunModel[17].setRotationPoint(-19F, -13.8F, -2.6F);

        gunModel[18].addBox(0F, 0F, 0F, 27, 1, 2, 0F); // Box 19
        gunModel[18].setRotationPoint(-19F, -15.1F, -1F);

        gunModel[19].addBox(0F, 0F, 0F, 27, 1, 2, 0F); // Box 20
        gunModel[19].setRotationPoint(-19F, -15.1F, 1F);
        gunModel[19].rotateAngleX = -0.6981317F;

        gunModel[20].addBox(0F, 0F, -2F, 12, 1, 2, 0F); // Box 21
        gunModel[20].setRotationPoint(-19F, -15.1F, -1F);
        gunModel[20].rotateAngleX = 0.6981317F;

        gunModel[21].addBox(0F, 0F, 0F, 27, 4, 2, 0F); // Box 22
        gunModel[21].setRotationPoint(-19F, -13.8F, 0.6F);

        gunModel[22].addBox(0F, 0F, 0F, 14, 2, 4, 0F); // Box 23
        gunModel[22].setRotationPoint(8F, -14F, -2F);

        gunModel[23].addBox(0F, 0F, 0F, 14, 1, 4, 0F); // Box 24
        gunModel[23].setRotationPoint(8F, -14.5F, -2F);

        gunModel[24].addBox(0F, 0F, -2F, 14, 1, 2, 0F); // Box 25
        gunModel[24].setRotationPoint(8F, -14F, -2F);
        gunModel[24].rotateAngleX = 1.29154365F;

        gunModel[25].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 26
        gunModel[25].setRotationPoint(8F, -14F, 2F);
        gunModel[25].rotateAngleX = -1.29154365F;

        gunModel[26].addBox(-2F, 0F, 0F, 3, 6, 4, 0F); // Box 27
        gunModel[26].setRotationPoint(-17.2F, -13.8F, -2F);
        gunModel[26].rotateAngleZ = -0.29670597F;

        gunModel[27].addBox(0F, 0F, 0F, 40, 1, 2, 0F); // Box 29
        gunModel[27].setRotationPoint(-18.2F, -15.2F, -1F);

        gunModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 30
        gunModel[28].setRotationPoint(7.5F, -7.4F, -1.5F);

        gunModel[29].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 31
        gunModel[29].setRotationPoint(9.5F, -7.4F, -1.5F);

        gunModel[30].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 32
        gunModel[30].setRotationPoint(13.5F, -7.4F, -1.5F);

        gunModel[31].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 33
        gunModel[31].setRotationPoint(11.5F, -7.4F, -1.5F);

        gunModel[32].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 34
        gunModel[32].setRotationPoint(17.5F, -7.4F, -1.5F);

        gunModel[33].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 35
        gunModel[33].setRotationPoint(15.5F, -7.4F, -1.5F);

        gunModel[34].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 36
        gunModel[34].setRotationPoint(-18F, -13.8F, 1.8F);

        gunModel[35].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 37
        gunModel[35].setRotationPoint(-16.5F, -13.8F, 1.8F);

        gunModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 38
        gunModel[36].setRotationPoint(-13.5F, -13.8F, 1.8F);

        gunModel[37].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 39
        gunModel[37].setRotationPoint(-15F, -13.8F, 1.8F);

        gunModel[38].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 40
        gunModel[38].setRotationPoint(-10.5F, -13.8F, 1.8F);

        gunModel[39].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 41
        gunModel[39].setRotationPoint(-12F, -13.8F, 1.8F);

        gunModel[40].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 42
        gunModel[40].setRotationPoint(-10.5F, -13.8F, -2.8F);

        gunModel[41].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 43
        gunModel[41].setRotationPoint(-12F, -13.8F, -2.8F);

        gunModel[42].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 44
        gunModel[42].setRotationPoint(-13.5F, -13.8F, -2.8F);

        gunModel[43].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 45
        gunModel[43].setRotationPoint(-15F, -13.8F, -2.8F);

        gunModel[44].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 46
        gunModel[44].setRotationPoint(-16.5F, -13.8F, -2.8F);

        gunModel[45].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 47
        gunModel[45].setRotationPoint(-18F, -13.8F, -2.8F);

        gunModel[46].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 48
        gunModel[46].setRotationPoint(21.5F, -13.2F, -1.5F);

        gunModel[47].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 49
        gunModel[47].setRotationPoint(18.8F, -16.5F, -0.5F);
        gunModel[47].rotateAngleZ = -0.29670597F;

        gunModel[48].addBox(0F, 0F, -2F, 8, 1, 2, 0F); // Box 50
        gunModel[48].setRotationPoint(0F, -15.1F, -1F);
        gunModel[48].rotateAngleX = 0.6981317F;

        gunModel[49].addBox(0F, 0F, 0F, 8, 4, 2, 0F); // Box 51
        gunModel[49].setRotationPoint(0F, -13.8F, -2.6F);

        gunModel[50].addBox(0F, 0F, 0F, 7, 3, 2, 0F); // Box 52
        gunModel[50].setRotationPoint(-7F, -12.8F, -2.6F);

        gunModel[51].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 53
        gunModel[51].setRotationPoint(-7F, -14.5F, -1.5F);
        gunModel[51].rotateAngleX = -0.45378561F;

        gunModel[52].addBox(0F, 0F, -1F, 7, 1, 1, 0F); // Box 54
        gunModel[52].setRotationPoint(-7F, -15.1F, -1F);
        gunModel[52].rotateAngleX = 0.6981317F;

        gunModel[53].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 55
        gunModel[53].setRotationPoint(-17.2F, -16.2F, -1F);

        gunModel[54].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 56
        gunModel[54].setRotationPoint(-17F, -17.2F, 0.5F);

        gunModel[55].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 57
        gunModel[55].setRotationPoint(-17F, -17.2F, -1.5F);

        gunModel[56].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 58
        gunModel[56].setRotationPoint(-19F, -8.5F, -3F);

        gunModel[57].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 59
        gunModel[57].setRotationPoint(-16F, -8.5F, -3F);

        gunModel[58].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 60
        gunModel[58].setRotationPoint(-6F, -7.5F, -3F);

        gunModel[59].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 61
        gunModel[59].setRotationPoint(4F, -7.5F, -3F);

        gunModel[60].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 62
        gunModel[60].setRotationPoint(7F, -9F, -1.5F);

        ammoModel = new ModelRendererTurbo[1];
        ammoModel[0] = new ModelRendererTurbo(this, 84, 102, textureX, textureY); // Box 61

        ammoModel[0].addBox(-8F, -4F, 0F, 7, 17, 4, 0F); // Box 61
        ammoModel[0].setRotationPoint(-7.5F, 0F, -2F);
        ammoModel[0].rotateAngleZ = -0.29670597F;

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

        flipAll();
    }
}