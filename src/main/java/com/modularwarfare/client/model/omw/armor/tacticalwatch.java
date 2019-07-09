package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tacticalwatch extends ModelArmor //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public tacticalwatch() //Same as Filename
	{
		leftArmModel = new ModelRendererTurbo[9];
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		leftArmModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		leftArmModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 4
		leftArmModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 5
		leftArmModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		leftArmModel[8] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 8

		leftArmModel[0].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 0
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.5F, 6F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.5F, 5F, -1F, 1, 1, 2, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.5F, 8F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 3
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.45F, 6F, -1.15F, 1, 2, 2, 0F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.35F); // Box 4
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.5F, 6F, 0.25F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F); // Box 5
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.5F, 7F, 0.25F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F); // Box 6
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.5F, 6.5F, 0.25F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F); // Box 7
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F, 0.34F, -0.4F, 0.34F); // Box 8
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
	}
	
}