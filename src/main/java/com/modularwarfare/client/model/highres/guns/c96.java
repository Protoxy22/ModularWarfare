package com.modularwarfare.client.model.highres.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class c96 extends ModelGun {

    int textureX = 250;
    int textureY = 250;

    public c96() {

        gunModel = new ModelRendererTurbo[1];

        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        gunModel[0].addObj("highres/obj/guns/c96/body");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];

        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        ammoModel[0].addObj("highres/obj/guns/c96/ammo");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);

        slideModel = new ModelRendererTurbo[1];

        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
        slideModel[0].addObj("highres/obj/guns/c96/slide");
        slideModel[0].setRotationPoint(0F, 0F, 0F);

        gunSlideDistance = 0.1F;
        reloadAnimation = WeaponAnimations.PISTOL;

        leftArmPos = new Vector3f(-0.23F, -0.58F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -40.0F);
        leftArmReloadPos = new Vector3f(-0.1F, -0.60F, 0.1F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -35.0F);

        leftArmChargePos = new Vector3f(-0.27F, -0.40F, 0.07F);
        leftArmChargeRot = new Vector3f(75.0F, 15.0F, -45.0F);

        rightArmPos = new Vector3f(0.5F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.5F, -0.5F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 8.0F, -90.0F);

        leftHandAmmo = true;
        translateAimPosition = new Vector3f(0F, 0.008F, -0.002F);
        rotateAimPosition = new Vector3f(0.0F, -0.050F, -0.45F);

        rightArmScale = new Vector3f(0.6F, 0.8F, 0.6F);
        leftArmScale = new Vector3f(0.6F, 0.8F, 0.6F);
        //RecoilSlideDistance = 0.1F;
        //RotateSlideDistance = -2F;

        hasFlash = true;
        flashScale = 0.4F;
        this.muzzleFlashPointNormal = new Vector3f(-2.2F, 1.4F, 1F);
        this.muzzleFlashPointScoping = new Vector3f(-2.2F, 1.6F, 0.15F);

        scopeIsOnSlide = false;
        slideLockOnEmpty = false;

        casingAnimDistance = new Vector3f(-5, -1, 12);
        casingAnimSpread = new Vector3f(2, 2, 0);
        casingAnimTime = 8;
        casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);

        crouchZoom = -0.1F;
        fancyStance = true;
        sprintRotate = new Vector3f(0.0F, -10.0F, 30.0F);
        sprintTranslate = new Vector3f(0.7F, 0.60F, 0.1F);

        chargeHandleDistance = 0.08F;
        chargeDelay = 0;
        chargeDelayAfterReload = 65;
        chargeTime = 20;

        actionArm = EnumArm.Left;
        actionType = EnumAction.Charge;

        chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);

        this.thirdPersonOffset = new Vector3f(0F, -0.25F, 0F);


        modelScale = 0.9F;
        translateAll = new Vector3f(2F, -2.05F, 0F);

        flipAll();
    }
}
