package com.modularwarfare.client.model.omw;

import com.modularwarfare.client.model.ModelShell;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class OmwModelShell extends ModelShell {

    int textureX = 32;
    int textureY = 32;

    public OmwModelShell() {

        shellModel = new ModelRendererTurbo[2];
        shellModel[0] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Import Box0
        shellModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box0

        shellModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.45F, -0.15F, -0.15F, -0.45F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.15F, -0.15F, -0.45F, -0.15F, -0.15F, 0F, 0F, 0F); // Import Box0
        shellModel[0].setRotationPoint(4F, 0F, 0F);

        shellModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box0
        shellModel[1].setRotationPoint(1F, 0F, 0F);
    }
}
