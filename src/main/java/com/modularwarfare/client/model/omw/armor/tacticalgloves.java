package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tacticalgloves extends ModelArmor //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public tacticalgloves() //Same as Filename
	{
		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		leftArmModel[0].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F); // Box 0
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F, 0.08F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}
	
}