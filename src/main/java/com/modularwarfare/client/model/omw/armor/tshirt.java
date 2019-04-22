package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tshirt extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public tshirt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(-4.5F, 0F, -4F, 16, 18, 8, 0F, -0.2F, 0.21F, -1.95F, -7.2F, 0.21F, -1.95F, -7.2F, 0.21F, -1.95F, -0.2F, 0.21F, -1.95F, -0.2F, -5.8F, -1.95F, -7.2F, -5.8F, -1.95F, -7.2F, -5.8F, -1.95F, -0.2F, -5.8F, -1.95F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 8, 24, 8, 0F, 0.1F, 0.1F, 0.1F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F, -11.9F, 0.1F, -3.9F, -11.9F, 0.1F, -3.9F, -11.9F, -3.9F, 0.1F, -11.9F, -3.9F); // Box 0
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 8, 24, 8, 0F, 0.1F, 0.1F, 0.1F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F, -11.9F, 0.1F, -3.9F, -11.9F, 0.1F, -3.9F, -11.9F, -3.9F, 0.1F, -11.9F, -3.9F); // Box 1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}
	
}