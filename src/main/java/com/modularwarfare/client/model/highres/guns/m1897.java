package com.modularwarfare.client.model.highres.guns;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class m1897 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public m1897() {

        gunModel = new ModelRendererTurbo[1];

        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        gunModel[0].addObj("highres/obj/guns/m1897/body");
        gunModel[0].setRotationPoint(0F, 0F, 0F);

        ammoModel = new ModelRendererTurbo[1];

        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        ammoModel[0].addObj("highres/obj/highres/obj/guns/m1897/ammo");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);


        pumpModel = new ModelRendererTurbo[1];

        pumpModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
        pumpModel[0].addObj("highres/obj//guns/m1897/pump");
        pumpModel[0].setRotationPoint(0F, 0F, 0F);

        leftArmPos = new Vector3f(0.25F, -0.59F, 0.06F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
        leftArmReloadPos = new Vector3f(0.25F, -0.59F, 0.06F);
        leftArmReloadRot = new Vector3f(65.0F, 32.0F, -46.0F);

        rightArmPos = new Vector3f(0.2F, -0.57F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.2F, -0.57F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
        leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

        rotateAimPosition = new Vector3f(0F, 0.065F, 0.38F);

        this.gunSlideDistance = 0.0F;
        this.actionArm = ModelGun.EnumArm.Left;
        this.actionType = ModelGun.EnumAction.Pump;
        this.reloadAnimation = WeaponAnimations.SHOTGUN;
        this.endLoadedAmmoDistance = 0.0F;
        this.numBulletsInReloadAnimation = 7.0F;

        this.pumpDelayAfterReload = 115;
        this.pumpDelay = 6;
        this.pumpTime = 9;
        this.pumpHandleDistance = 0.12F;
        this.leftHandAmmo = true;

        this.bulletMap.put("highres.bullet12gauge", new RenderVariables(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(1.0F, 0.75F, 0.75F)));


        hasFlash = true;
        flashScale = 1.5F;
        this.muzzleFlashPointNormal = new Vector3f(0.5F, 0.55F, 1F);
        this.muzzleFlashPointScoping = new Vector3f(1.2F, 0.6F, 0.1F);


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
