package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class flannelhoodie extends ModelArmor //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public flannelhoodie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 33
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 64
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 65
		bodyModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 66
		bodyModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 51
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 52
		bodyModel[14] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 53

		bodyModel[0].addShapeBox(-4F, 8.9F, -2F, 8, 4, 4, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 122
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -2.35F, 2, 1, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 0F, -2.35F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 1F, -2.3F, 1, 12, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F); // Box 39
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, -0.1F, -2F, 4, 1, 4, 0F, 0F, 0F, 0.2F, -1.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0.9F, -2F, 8, 8, 4, 0F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 33
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.1F, -2F, 4, 1, 4, 0F, -1.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 34
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5F, -1.1F, 2F, 5, 4, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F); // Box 63
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, -1.1F, 2F, 5, 4, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.45F, 0.75F, -2.75F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 65
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.45F, 0.75F, -2.75F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 66
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.7F, 2.5F, -2.4F, 3, 1, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 50
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.7F, 2.5F, -2.4F, 3, 1, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 51
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.7F, 3.5F, -2.35F, 3, 2, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 52
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0.7F, 3.5F, -2.35F, 3, 2, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 53
		bodyModel[14].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 57
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 59

		leftArmModel[0].addShapeBox(-1F, -0.1F, -2F, 4, 7, 4, 0F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F); // Box 57
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6.9F, -2F, 4, 2, 4, 0F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 56
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 58

		rightArmModel[0].addShapeBox(-3F, -0.1F, -2F, 4, 7, 4, 0F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F); // Box 56
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 6.9F, -2F, 4, 2, 4, 0F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.21F, 0F, 0.21F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 58
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


	}
}