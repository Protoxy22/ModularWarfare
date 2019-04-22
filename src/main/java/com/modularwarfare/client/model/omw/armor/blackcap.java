package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class blackcap extends ModelArmor //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public blackcap() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		headModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 9

		headModel[0].addShapeBox(3F, -7.5F, -4F, 1, 3, 8, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8.5F, -4F, 8, 1, 8, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -6F, -7F, 4, 1, 3, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(2F, -6F, -7F, 2, 1, 3, 0F, 0F, -0.6F, 0F, -0.3F, -1.1F, -1.3F, 0F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, -1.3F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.5F, -4F, 1, 3, 8, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2.5F, -7.5F, -4F, 5, 2, 8, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -6F, -7F, 2, 1, 3, 0F, -0.3F, -1.1F, -1.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.1F, 0F, -0.3F, 0.5F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-2.5F, -5.5F, -4F, 5, 1, 8, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F); // Box 7
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-2.5F, -6F, 3F, 1, 1, 1, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F); // Box 8
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(1.5F, -6F, 3F, 1, 1, 1, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F); // Box 9
		headModel[9].setRotationPoint(0F, 0F, 0F);


	}
}