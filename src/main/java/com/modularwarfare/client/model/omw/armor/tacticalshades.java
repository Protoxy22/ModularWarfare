package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tacticalshades extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public tacticalshades() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];
		headModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 40
		headModel[1] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 41
		headModel[2] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 42
		headModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 43
		headModel[4] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 44
		headModel[5] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 45
		headModel[6] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 46
		headModel[7] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 47
		headModel[8] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 48

		headModel[0].addShapeBox(-2F, -4F, -4.2F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 40
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(1F, -4F, -4.2F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 41
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -4F, -4.2F, 1, 1, 1, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F); // Box 42
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -4F, -4.2F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F); // Box 43
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -4.2F, 2, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F); // Box 44
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(2F, -4F, -4.2F, 2, 1, 1, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F); // Box 45
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -4.1F, -4.25F, 1, 1, 1, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 46
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -4.3F, -4.2F, 1, 1, 5, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 47
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.5F, -4.3F, -4.2F, 1, 1, 5, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 48
		headModel[8].setRotationPoint(0F, 0F, 0F);
	}
	
}