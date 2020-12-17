package com.modularwarfare.client.model.highres.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class military extends ModelArmor //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public military() {

		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[0].addObj("highres/obj/armor/military", "body");

		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		leftArmModel[0].addObj("highres/obj/armor/military", "leftArm");

		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		rightArmModel[0].addObj("highres/obj/armor/military", "rightArm");

		headModel = new ModelRendererTurbo[1];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		headModel[0].addObj("highres/obj/armor/military", "head");


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		rightLegModel[0].addObj("highres/obj/armor/military", "rightLeg");

		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		leftLegModel[0].addObj("highres/obj/armor/military", "leftLeg");


		rightFootModel = new ModelRendererTurbo[1];
		rightFootModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		rightFootModel[0].addObj("highres/obj/armor/military", "rightBoot");

		leftFootModel = new ModelRendererTurbo[1];
		leftFootModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		leftFootModel[0].addObj("highres/obj/armor/military", "leftBoot");

		shouldChestRenderHead = true;

	}

}