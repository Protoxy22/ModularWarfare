package com.modularwarfare.client.model.omw.attachments;

import com.modularwarfare.client.model.ModelAttachment;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class reflex extends ModelAttachment {
    int textureX = 64;
    int textureY = 64;

    public reflex() {
        attachmentModel = new ModelRendererTurbo[15];
        attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
        attachmentModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box237
        attachmentModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box238
        attachmentModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box239
        attachmentModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box240
        attachmentModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box241
        attachmentModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box8
        attachmentModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box9
        attachmentModel[8] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box10
        attachmentModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box11
        attachmentModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box12
        attachmentModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box13
        attachmentModel[12] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import Box14
        attachmentModel[13] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box17
        attachmentModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box18

        attachmentModel[0].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Import Box1
        attachmentModel[0].setRotationPoint(0F, 0F, -2.5F);

        attachmentModel[1].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Import Box237
        attachmentModel[1].setRotationPoint(0F, 0F, 0.5F);

        attachmentModel[2].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Import Box238
        attachmentModel[2].setRotationPoint(0F, 1F, -2.5F);

        attachmentModel[3].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Import Box239
        attachmentModel[3].setRotationPoint(0F, 1F, 1.5F);

        attachmentModel[4].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Import Box240
        attachmentModel[4].setRotationPoint(-0.5F, -0.75F, -3F);

        attachmentModel[5].addBox(-2F, 0F, 0F, 15, 2, 5, 0F); // Import Box241
        attachmentModel[5].setRotationPoint(0F, -2F, -2.5F);
        attachmentModel[5].rotateAngleZ = 0.02617994F;

        attachmentModel[6].addBox(-2F, -1F, 0F, 8, 2, 4, 0F); // Import Box8
        attachmentModel[6].setRotationPoint(0.25F, -2F, -2F);
        attachmentModel[6].rotateAngleZ = -0.14835299F;

        attachmentModel[7].addBox(-2F, -1F, 0F, 4, 2, 3, 0F); // Import Box9
        attachmentModel[7].setRotationPoint(0.5F, -2.5F, -1.5F);

        attachmentModel[8].addBox(-1.5F, -1F, -1.5F, 3, 1, 3, 0F); // Import Box10
        attachmentModel[8].setRotationPoint(7.5F, -2F, 0F);
        attachmentModel[8].rotateAngleY = -0.78539816F;

        attachmentModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Box11
        attachmentModel[9].setRotationPoint(11.75F, -4.75F, -3.25F);
        attachmentModel[9].rotateAngleX = 0.08726646F;

        attachmentModel[10].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Import Box12
        attachmentModel[10].setRotationPoint(11.75F, -4.75F, 3.24F);
        attachmentModel[10].rotateAngleX = -0.08726646F;

        attachmentModel[11].addBox(-1F, -3F, -1F, 1, 3, 1, 0F); // Import Box13
        attachmentModel[11].setRotationPoint(12.75F, -4.6F, -2.24F);
        attachmentModel[11].rotateAngleX = -0.12217305F;
        attachmentModel[11].rotateAngleZ = 0.08726646F;

        attachmentModel[12].addBox(-1F, -3F, 0F, 1, 3, 1, 0F); // Import Box14
        attachmentModel[12].setRotationPoint(12.75F, -4.6F, 2.25F);
        attachmentModel[12].rotateAngleX = 0.12217305F;
        attachmentModel[12].rotateAngleZ = 0.08726646F;

        attachmentModel[13].addBox(-1F, -3F, 0F, 1, 1, 6, 0F); // Import Box17
        attachmentModel[13].setRotationPoint(12.75F, -5F, -3F);
        attachmentModel[13].rotateAngleZ = 0.08726646F;

        attachmentModel[14].addBox(-2F, 0F, 0F, 2, 2, 6, 0F); // Import Box18
        attachmentModel[14].setRotationPoint(13F, -2.75F, -3F);
        attachmentModel[14].rotateAngleZ = 0.02617994F;


        this.modelScale = 0.2f;

        flipAll();
    }
}