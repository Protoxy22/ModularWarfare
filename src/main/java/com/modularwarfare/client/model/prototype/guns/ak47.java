package com.modularwarfare.client.model.prototype.guns;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;
import org.lwjgl.util.vector.Vector3f;

import java.util.ArrayList;
import java.util.List;

public class ak47 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ak47() {

        gunModel = new ModelRendererTurbo[1];

        gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        gunModel[0].addObj("prototype/obj/guns/ak47/body");
        gunModel[0].setRotationPoint(0F, 0F, 0F);


        ammoModel = new ModelRendererTurbo[1];

        ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        ammoModel[0].addObj("prototype/obj/guns/ak47/ammo");
        ammoModel[0].setRotationPoint(0F, 0F, 0F);



        slideModel = new ModelRendererTurbo[1];

        slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
        slideModel[0].addObj("prototype/obj/guns/ak47/slide");
        slideModel[0].setRotationPoint(0F, 0F, 0F);

        leftArmPos = new Vector3f(0.25F, -0.59F, 0.06F);
        leftArmRot = new Vector3f(65.0F, 32.0F, -46.0F);
        leftArmReloadPos = new Vector3f(-0.2F, -0.72F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);

        rightArmPos = new Vector3f(0.26F, -0.65F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.27F, -0.65F, 0.04F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
        rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);

        rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
        leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);


        hasFlash = true;
        flashScale = 1.5F;
        this.muzzleFlashPointNormal = new Vector3f(0.5F, 0.55F, 1F);
        this.muzzleFlashPointScoping = new Vector3f(1.2F, 0.6F, 0.1F);

        leftHandAmmo = true;

        fancyStance = true;
        sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
        sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

        this.gunSlideDistance = 0.1F;

        this.thirdPersonScale = 0.8F;
        this.thirdPersonOffset = new Vector3f(0F, -0.1F, 0F);

        this.translateAimPosition = new Vector3f(0.14f, 0.008f, 0f);
        this.rotateAimPosition = new Vector3f(0F, 0.065F, 0.38F);


        translateAll = new Vector3f(1F, -1F, -0.07F);
        this.crouchZoom = -0.035f;

        List<Vector3f> attachmentVectorsBarrel = new ArrayList<Vector3f>();
        attachmentVectorsBarrel.add(new Vector3f(0.08F, 0.073F, 0.0F)); //Sight translation
        attachmentVectorsBarrel.add(new Vector3f(0F, 0F, 0F)); //Sight rotation
        attachmentPointMap.put(AttachmentEnum.Barrel, attachmentVectorsBarrel);

        this.modelScale = 1.2f;

        flipAll();
    }
}
