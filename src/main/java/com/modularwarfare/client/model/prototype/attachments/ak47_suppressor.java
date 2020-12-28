package com.modularwarfare.client.model.prototype.attachments;

import com.modularwarfare.client.model.ModelAttachment;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import org.lwjgl.util.vector.Vector3f;

public class ak47_suppressor extends ModelAttachment //Same as Filename
{
    int textureX = 64;
    int textureY = 32;

    public ak47_suppressor() //Same as Filename
    {
        attachmentModel = new ModelRendererTurbo[1];

        attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
        attachmentModel[0].addObj("prototype/obj/guns/ak47/suppressor");
        attachmentModel[0].setRotationPoint(0F, 0F, 0F);

        this.modelScale = 1.2f;

        flipAll();
    }
}