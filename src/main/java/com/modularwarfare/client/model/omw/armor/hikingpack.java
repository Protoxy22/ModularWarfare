package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class hikingpack extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public hikingpack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 24
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 41
		bodyModel[9] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 42
		bodyModel[10] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 43
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 45
		bodyModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 46
		bodyModel[14] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 49
		bodyModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[16] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 51
		bodyModel[17] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 64
		bodyModel[20] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 65
		bodyModel[21] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 67
		bodyModel[22] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 68
		bodyModel[23] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 69
		bodyModel[24] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		bodyModel[25] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 71
		bodyModel[26] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 72
		bodyModel[27] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 73
		bodyModel[28] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 74
		bodyModel[29] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 79
		bodyModel[30] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 80
		bodyModel[31] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 17
		bodyModel[32] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 25
		bodyModel[33] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 57
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		bodyModel[36] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 55
		bodyModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 56
		bodyModel[38] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 57
		bodyModel[39] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 58
		bodyModel[40] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 59

		bodyModel[0].addShapeBox(3.5F, -0.5F, -3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
		bodyModel[0].setRotationPoint(0F, 0F, 1F);

		bodyModel[1].addShapeBox(3.5F, -0.5F, -4F, 1, 10, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[1].setRotationPoint(0F, 0F, 1F);

		bodyModel[2].addShapeBox(3.5F, -0.5F, 1F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 25
		bodyModel[2].setRotationPoint(0F, 0F, 1F);

		bodyModel[3].addShapeBox(3.5F, 9F, -3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 1F);

		bodyModel[4].addShapeBox(-4.5F, -0.5F, -4F, 1, 10, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 1F);

		bodyModel[5].addShapeBox(-4.5F, 9F, -3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[5].setRotationPoint(0F, 0F, 1F);

		bodyModel[6].addShapeBox(-4.5F, -0.5F, 1F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 29
		bodyModel[6].setRotationPoint(0F, 0F, 1F);

		bodyModel[7].addShapeBox(-4.5F, -0.5F, -3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		bodyModel[7].setRotationPoint(0F, 0F, 1F);

		bodyModel[8].addShapeBox(-3F, -2F, 2F, 6, 2, 3, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 41
		bodyModel[8].setRotationPoint(0F, 0F, 1F);

		bodyModel[9].addShapeBox(-3.5F, 0F, 3F, 7, 6, 2, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 42
		bodyModel[9].setRotationPoint(0F, 0F, 1F);

		bodyModel[10].addShapeBox(-3.5F, 6F, 3F, 7, 4, 2, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 43
		bodyModel[10].setRotationPoint(0F, 0F, 1F);

		bodyModel[11].addShapeBox(-2.5F, -1F, 4.5F, 5, 1, 2, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 44
		bodyModel[11].setRotationPoint(0F, 0F, 1F);

		bodyModel[12].addShapeBox(-3F, 0F, 4.5F, 6, 6, 2, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 45
		bodyModel[12].setRotationPoint(0F, 0F, 1F);

		bodyModel[13].addShapeBox(-3F, 6F, 4F, 6, 4, 2, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F); // Box 46
		bodyModel[13].setRotationPoint(0F, 0F, 1F);

		bodyModel[14].addShapeBox(-1F, -3.5F, 3.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 49
		bodyModel[14].setRotationPoint(0F, 0F, 1F);

		bodyModel[15].addShapeBox(0F, -3.5F, 3.5F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[15].setRotationPoint(0F, 0F, 1F);

		bodyModel[16].addShapeBox(-1F, -3.5F, 3.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 51
		bodyModel[16].setRotationPoint(0F, 0F, 1F);

		bodyModel[17].addShapeBox(-2F, 0F, 0.5F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[17].setRotationPoint(0F, -2F, 7F);
		bodyModel[17].rotateAngleX = -1.01229097F;

		bodyModel[18].addShapeBox(-2.2F, -0.2F, 0.5F, 1, 1, 2, 0F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 63
		bodyModel[18].setRotationPoint(0F, -2F, 7F);
		bodyModel[18].rotateAngleX = -1.01229097F;

		bodyModel[19].addShapeBox(1.2F, -0.2F, 0.5F, 1, 1, 2, 0F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 64
		bodyModel[19].setRotationPoint(0F, -2F, 7F);
		bodyModel[19].rotateAngleX = -1.01229097F;

		bodyModel[20].addShapeBox(-4.5F, 8F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[20].setRotationPoint(0F, 0F, 1F);

		bodyModel[21].addShapeBox(-4.5F, 2F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[21].setRotationPoint(0F, 0F, 1F);

		bodyModel[22].addShapeBox(-4F, 0F, 1.5F, 1, 10, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 68
		bodyModel[22].setRotationPoint(0F, 0F, 1F);

		bodyModel[23].addShapeBox(3F, 0F, 1.5F, 1, 10, 1, 0F, -0.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 69
		bodyModel[23].setRotationPoint(0F, 0F, 1F);

		bodyModel[24].addShapeBox(-3F, -1F, 1.5F, 6, 1, 1, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 70
		bodyModel[24].setRotationPoint(0F, 0F, 1F);

		bodyModel[25].addShapeBox(-3F, 9F, 1.5F, 6, 1, 1, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 71
		bodyModel[25].setRotationPoint(0F, 0F, 1F);

		bodyModel[26].addShapeBox(-3F, 4F, 1.5F, 6, 2, 1, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 72
		bodyModel[26].setRotationPoint(0F, 0F, 1F);

		bodyModel[27].addShapeBox(-3.5F, 8F, -3.8F, 7, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 73
		bodyModel[27].setRotationPoint(0F, 0F, 1F);

		bodyModel[28].addShapeBox(-1F, 8F, -3.8F, 2, 1, 1, 0F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F); // Box 74
		bodyModel[28].setRotationPoint(0F, 0F, 1F);

		bodyModel[29].addShapeBox(3F, 8F, 1.5F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[29].setRotationPoint(0F, 0F, 1F);

		bodyModel[30].addShapeBox(3F, 2F, 1.5F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[30].setRotationPoint(0F, 0F, 1F);

		bodyModel[31].addShapeBox(3.5F, 7.3F, 4F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[31].setRotationPoint(0F, -4F, 0F);
		bodyModel[31].rotateAngleY = 1.57079633F;

		bodyModel[32].addShapeBox(4F, 9F, 5.07F, 2, 3, 1, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 25
		bodyModel[32].setRotationPoint(0F, -4F, 0F);
		bodyModel[32].rotateAngleY = 1.57079633F;

		bodyModel[33].addShapeBox(3.5F, 7.2F, 4F, 3, 1, 2, 0F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 48
		bodyModel[33].setRotationPoint(0F, -4F, 0F);
		bodyModel[33].rotateAngleY = 1.57079633F;

		bodyModel[34].addShapeBox(4.5F, 7.69F, 4.17F, 1, 1, 2, 0F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F); // Box 57
		bodyModel[34].setRotationPoint(0F, -4F, 0F);
		bodyModel[34].rotateAngleY = 1.57079633F;

		bodyModel[35].addShapeBox(4.5F, 8.3F, 4.07F, 1, 2, 2, 0F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F); // Box 60
		bodyModel[35].setRotationPoint(0F, -4F, 0F);
		bodyModel[35].rotateAngleY = 1.57079633F;

		bodyModel[36].addShapeBox(-6.5F, 7.3F, 4F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[36].setRotationPoint(0F, -4F, 0F);
		bodyModel[36].rotateAngleY = -1.57079633F;

		bodyModel[37].addShapeBox(-6F, 9F, 5.07F, 2, 3, 1, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 56
		bodyModel[37].setRotationPoint(0F, -4F, 0F);
		bodyModel[37].rotateAngleY = -1.57079633F;

		bodyModel[38].addShapeBox(-5.5F, 7.69F, 4.17F, 1, 1, 2, 0F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F); // Box 57
		bodyModel[38].setRotationPoint(0F, -4F, 0F);
		bodyModel[38].rotateAngleY = -1.57079633F;

		bodyModel[39].addShapeBox(-5.5F, 8.3F, 4.07F, 1, 2, 2, 0F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F, -0.23F, -0.4F, 0.1F); // Box 58
		bodyModel[39].setRotationPoint(0F, -4F, 0F);
		bodyModel[39].rotateAngleY = -1.57079633F;

		bodyModel[40].addShapeBox(-6.5F, 7.2F, 4F, 3, 1, 2, 0F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 59
		bodyModel[40].setRotationPoint(0F, -4F, 0F);
		bodyModel[40].rotateAngleY = -1.57079633F;
	}
	
}