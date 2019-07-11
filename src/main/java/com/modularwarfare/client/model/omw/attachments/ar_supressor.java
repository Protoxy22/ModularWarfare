package com.modularwarfare.client.model.omw.attachments;

import com.modularwarfare.client.model.ModelAttachment;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ar_supressor extends ModelAttachment //Same as Filename
{
    int textureX = 64;
    int textureY = 32;

    public ar_supressor() //Same as Filename
    {
        attachmentModel = new ModelRendererTurbo[1];
        attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 200

        attachmentModel[0].addBox(0F, 0F, 0F, 25, 5, 5, 0F); // Box 200
        attachmentModel[0].setRotationPoint(0F, 0F, 0F);

        this.modelScale = 0.2f;


        flipAll();
    }
}