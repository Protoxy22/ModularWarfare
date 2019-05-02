package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tacticalcap extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public tacticalcap() //Same as Filename
	{
		headModel = new ModelRendererTurbo[3];
		headModel[0] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 7
		headModel[1] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 11

		headModel[0].addShapeBox(-4F, -6F, -6F, 8, 1, 2, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 7
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -9.1F, -4F, 8, 1, 8, 0F, -0.9F, -0.5F, -0.9F, -0.9F, -0.5F, -0.9F, -0.9F, -0.5F, -0.9F, -0.9F, -0.5F, -0.9F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 11
		headModel[2].setRotationPoint(0F, 0F, 0F);
	}
	
}