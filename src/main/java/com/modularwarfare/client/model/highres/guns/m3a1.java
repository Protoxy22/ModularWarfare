package com.modularwarfare.client.model.highres.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class m3a1 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public m3a1() {

        gunModel = new ModelRendererTurbo[1];

        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        gunModel[0].addObj("highres/obj/guns/m3a1/body");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];

        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        ammoModel[0].addObj("highres/obj/guns/m3a1/ammo");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);


        slideModel = new ModelRendererTurbo[1];

        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
        slideModel[0].addObj("highres/obj/guns/m3a1/slide");
        slideModel[0].setRotationPoint(0F, 0F, 0F);

        leftArmPos = new Vector3f(-0.10F, -0.67F, 0.06F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.72F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);

        rightArmPos = new Vector3f(0.2F, -0.6F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.6F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
        rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
        leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

        rotateAimPosition = new Vector3f(0F, 0.065F, 0.38F);

        hasFlash = true;
        flashScale = 1.5F;
        this.muzzleFlashPointNormal = new Vector3f(-1F, 0.55F, 1.5F);
        this.muzzleFlashPointScoping = new Vector3f(1.2F, 0.6F, 0.1F);

        leftHandAmmo = true;

        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

        this.gunSlideDistance = 0.1F;

        this.thirdPersonScale = 0.8F;
        this.thirdPersonOffset = new Vector3f(0F, -0.15F, 0F);

        translateAll = new Vector3f(1F, -1.9F, -0.06F);
        this.crouchZoom = -0.05f;

        flipAll();
    }
}
