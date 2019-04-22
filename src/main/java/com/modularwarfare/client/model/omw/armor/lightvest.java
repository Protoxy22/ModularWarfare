package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class lightvest extends ModelArmor //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public lightvest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[66];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 20, 26, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 25, 26, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 11, 21, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 62
		bodyModel[48] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 63
		bodyModel[49] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 67
		bodyModel[53] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 70
		bodyModel[56] = new ModelRendererTurbo(this, 23, 29, textureX, textureY); // Box 71
		bodyModel[57] = new ModelRendererTurbo(this, 43, 37, textureX, textureY); // Box 72
		bodyModel[58] = new ModelRendererTurbo(this, 45, 29, textureX, textureY); // Box 73
		bodyModel[59] = new ModelRendererTurbo(this, 18, 38, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 46, 45, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 76
		bodyModel[62] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 77
		bodyModel[63] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 78
		bodyModel[64] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 79
		bodyModel[65] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 81

		bodyModel[0].addShapeBox(-4F, 5F, -2.5F, 8, 7, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.5F, 2, 1, 5, 0F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 1F, -2.5F, 2, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2F, 0F, -2.5F, 2, 1, 5, 0F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, 1F, -2.5F, 2, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1.5F, 3F, -2.5F, 1, 1, 1, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0.5F, 3F, -2.5F, 1, 1, 1, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 4F, -2.5F, 3, 1, 1, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 8
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 2.5F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 9
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, 1F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 11
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, 2.5F, -2.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 12
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 5F, 1.5F, 8, 7, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 13
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2F, 1F, 1.5F, 2, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 1F, 1.5F, 2, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 2.5F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 16
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 4F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 17
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, 4F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2F, 2.5F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 20
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 21
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 8F, -1.5F, 1, 1, 3, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 22
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 11F, -1.5F, 1, 1, 3, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 23
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.6F, 7.9F, -2.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 24
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.6F, 10.9F, -2.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 25
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.6F, 10.9F, 1.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 26
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.6F, 7.9F, 1.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 27
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(3.6F, 10.9F, 1.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 28
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(3.6F, 7.9F, 1.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 29
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3F, 8F, -1.5F, 1, 1, 3, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 30
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3F, 11F, -1.5F, 1, 1, 3, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 31
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3.6F, 10.9F, -2.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 32
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(3.6F, 7.9F, -2.5F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F); // Box 33
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-4F, 4.5F, -2.6F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 7.5F, -2.8F, 8, 4, 1, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.75F, 7.5F, -3F, 1, 4, 1, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 36
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3F, 7.5F, -3.5F, 1, 4, 1, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 38
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4.5F, 7.5F, -3.5F, 1, 4, 1, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 40
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.75F, 7.5F, -3.5F, 1, 4, 1, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 44
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2.5F, 7.5F, -3F, 1, 4, 1, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 45
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.25F, 7.5F, -3.5F, 1, 4, 1, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 46
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3.5F, 7.5F, -3.5F, 1, 4, 1, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 56
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2F, 7.5F, -3.5F, 1, 4, 1, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 57
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(2.75F, 7.5F, -3F, 1, 4, 1, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 58
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2.25F, 7.5F, -3.5F, 1, 4, 1, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 59
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(0.75F, 7.5F, -3.5F, 1, 4, 1, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 60
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(1.5F, 7.5F, -3F, 1, 4, 1, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 61
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(1F, 7.5F, -3.5F, 1, 4, 1, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 62
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-0.5F, 7.5F, -3.5F, 1, 4, 1, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 63
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(0.25F, 7.5F, -3F, 1, 4, 1, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 64
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-0.5F, 7.5F, -3.5F, 1, 4, 1, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 65
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-2F, 7.5F, -3.5F, 1, 4, 1, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -1F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 66
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-1.25F, 7.5F, -3F, 1, 4, 1, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 67
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.8F, 4.6F, -3F, 2, 2, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 68
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(1.8F, 5F, -3F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1.7F, 4.65F, -3.15F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3.8F, 4.5F, -3F, 2, 1, 1, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 71
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-0.5F, 4F, -2.65F, 1, 4, 1, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F); // Box 72
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4F, 5.5F, 1.5F, 8, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 73
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-4F, 7F, 1.5F, 8, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 74
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4F, 8.5F, 1.5F, 8, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 75
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4F, 10F, 1.5F, 8, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 76
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(2F, -0.25F, -2F, 2, 1, 4, 0F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4F, -0.25F, -2F, 2, 1, 4, 0F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(1.8F, 4.5F, -3F, 2, 1, 1, 0F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 79
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(2.9F, 4.65F, -3.15F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 81
		bodyModel[65].setRotationPoint(0F, 0F, 0F);


	}
}