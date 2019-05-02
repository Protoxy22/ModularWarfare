package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class dogtags extends ModelArmor //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public dogtags() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 13

		bodyModel[0].addShapeBox(-3F, -0.5F, -2F, 1, 1, 3, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2F, -0.5F, -2F, 1, 1, 3, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F); // Box 2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2F, -0.1F, -3F, 1, 3, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 1.9F, -0.3F, -0.3F, -2.5F, -0.3F, -0.3F, -2.5F, -0.3F, -0.3F, 1.9F, -0.3F, -0.3F); // Box 4
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, -0.1F, -3F, 1, 3, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -2.5F, -0.3F, -0.3F, 1.9F, -0.3F, -0.3F, 1.9F, -0.3F, -0.3F, -2.5F, -0.3F, -0.3F); // Box 5
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, -0.5F, 1F, 6, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.550000000000001F, 3F, -3.15F, 1, 1, 1, 0F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F); // Box 8
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.550000000000001F, 1.75F, -3.15F, 1, 1, 1, 0F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.550000000000001F, 4.25F, -3.15F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F); // Box 10
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.25F, 1.5F, -3F, 1, 1, 1, 0F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 11
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.25F, 4F, -3F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F, -0.2F, -0.75F, -0.4F); // Box 12
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.25F, 2.75F, -3F, 1, 1, 1, 0F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F); // Box 13
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
	}
	
}