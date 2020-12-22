package com.modularwarfare.client.model;

import com.modularwarfare.client.model.objects.TurboBase;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ModelShell extends TurboBase {

    public ModelRendererTurbo[] shellModel = new ModelRendererTurbo[0];

    @Override
    public void translateAll(float x, float y, float z) {
        translate(shellModel, x, y, z);
    }

    @Override
    public void flipAll() {
        flip(shellModel);
    }

    public void render() {
        float f5 = 1F / 16F;

        for(ModelRendererTurbo model : shellModel)
            model.render(f5);
    }

}