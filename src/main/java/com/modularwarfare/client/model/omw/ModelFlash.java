package com.modularwarfare.client.model.omw;


import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ModelFlash extends com.modularwarfare.client.model.ModelFlash {

	int textureX = 256;
	int textureY = 128;

	public ModelFlash() {

		this.flashModel = new ModelRendererTurbo[3][];

		this.flashModel[0] = new ModelRendererTurbo[3];
		this.flashModel[1] = new ModelRendererTurbo[3];
		this.flashModel[2] = new ModelRendererTurbo[3];
		this.flashModel[0][0] = new ModelRendererTurbo(this, 10, 92, this.textureX, this.textureY);
		this.flashModel[1][0] = new ModelRendererTurbo(this, 52, 92, this.textureX, this.textureY);
		this.flashModel[2][0] = new ModelRendererTurbo(this, 95, 92, this.textureX, this.textureY);

		this.flashModel[0][0].addShapeBox(0.0F, 0.0F, 0.0F, 1, 16, 16, 0.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F, 0.0F, 8.0F, 8.0F);
		this.flashModel[0][0].setRotationPoint(70.0F, -23.0F, -8.0F);

		this.flashModel[1][0].addShapeBox(0.0F, 0.0F, 0.0F, 1, 16, 16, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 6.0F, 6.0F);
		this.flashModel[1][0].setRotationPoint(70.0F, -23.0F, -8.0F);

		this.flashModel[2][0].addShapeBox(0.0F, 0.0F, 0.0F, 1, 16, 16, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F, 0.0F, 5.0F, 5.0F);
		this.flashModel[2][0].setRotationPoint(70.0F, -23.0F, -8.0F);
	}


}
