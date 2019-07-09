package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.model.ModelCustomArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class uniform extends ModelArmor //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public uniform() //Same as Filename
	{
		headModel = new ModelRendererTurbo[1];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15

		headModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 15
		headModel[0].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 2
		bodyModel[0].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 29, 51, textureX, textureY); // Box 10
		leftArmModel[2] = new ModelRendererTurbo(this, 21, 55, textureX, textureY); // Box 11

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.5F, 3F, 1.02F, 3, 3, 1, 0F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F); // Box 10
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 4F, -2F, 4, 1, 4, 0F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F); // Box 11
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rightArmModel[1] = new ModelRendererTurbo(this, 29, 51, textureX, textureY); // Box 9
		rightArmModel[2] = new ModelRendererTurbo(this, 21, 55, textureX, textureY); // Box 12

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2.5F, 3F, 1.02F, 3, 3, 1, 0F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F, -0.2F, 0.15F, 0.15F); // Box 9
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 4F, -2F, 4, 1, 4, 0F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F); // Box 12
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 4
		leftLegModel[1] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 6
		leftLegModel[2] = new ModelRendererTurbo(this, 29, 51, textureX, textureY); // Box 8
		leftLegModel[3] = new ModelRendererTurbo(this, 21, 55, textureX, textureY); // Box 14

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 9F, -2F, 4, 3, 4, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 6
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 3F, -2.02F, 3, 3, 1, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 8
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 4F, -2F, 4, 1, 4, 0F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F); // Box 14
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 3
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 29, 51, textureX, textureY); // Box 7
		rightLegModel[3] = new ModelRendererTurbo(this, 21, 55, textureX, textureY); // Box 13

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 3
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 9F, -2F, 4, 3, 4, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1.5F, 3F, -2.02F, 3, 3, 1, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 7
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 4F, -2F, 4, 1, 4, 0F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F, 0.16F, 0.1F, 0.16F); // Box 13
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
	
}