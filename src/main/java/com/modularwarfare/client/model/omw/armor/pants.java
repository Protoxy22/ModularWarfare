package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class pants extends ModelArmor //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public pants() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[2];
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 71

		leftLegModel[0].addShapeBox(-2F, -1F, -2F, 4, 12, 4, 0F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F, 0.2F, 0.2F, 0.21F); // Box 102
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(1.5F, 3F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[2];
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 72

		rightLegModel[0].addShapeBox(-2F, -1F, -2F, 4, 12, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 87
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 3F, -1.5F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);


	}
}