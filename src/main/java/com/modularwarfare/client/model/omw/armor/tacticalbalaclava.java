package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tacticalbalaclava extends ModelArmor //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public tacticalbalaclava() //Same as Filename
	{
		headModel = new ModelRendererTurbo[2];
		headModel[0] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 34
		headModel[1] = new ModelRendererTurbo(this, 2, 90, textureX, textureY); // Box 104

		headModel[0].addShapeBox(-4F, -3F, -4F, 8, 3, 8, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 34
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7F, -4.2F, 125, 125, 1, 0F, 0F, 0.5F, 0F, -117F, 0.5F, 0F, -117F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -118F, 0F, -117F, -118F, 0F, -117F, -118F, 0F, 0F, -118F, 0F); // Box 104
		headModel[1].setRotationPoint(0F, 0F, 0F);
	}
	
}