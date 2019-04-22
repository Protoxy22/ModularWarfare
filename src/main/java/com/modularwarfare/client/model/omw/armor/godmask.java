package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class godmask extends ModelArmor //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public godmask() //Same as Filename
	{
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		headModel[3] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 6
		headModel[4] = new ModelRendererTurbo(this, 18, 9, textureX, textureY); // Box 8

		headModel[0].addShapeBox(-3.5F, -6.5F, -4.75F, 7, 5, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F); // Box 1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3.5F, -1.5F, -4.75F, 7, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, -1F, -0.25F, -0.3F, -1F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.3F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -7.5F, -4.75F, 7, 1, 1, 0F, -1F, -0.25F, -0.3F, -1F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F); // Box 5
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.5F, -4F, 8, 1, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 6
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -4F, -4.75F, 1, 2, 1, 0F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.75F, 0.1F, 0F, 0.75F, 0.1F, 0F); // Box 8
		headModel[4].setRotationPoint(0F, 0F, 0F);
	}
	
}