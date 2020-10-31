package com.modularwarfare.client.model.highres.bullets;

import com.modularwarfare.client.model.ModelBullet;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class bullet12gauge extends ModelBullet {
  public bullet12gauge() {
    this.textureX = 256;
    this.textureY = 256;


    
    this.bulletModel = new ModelRendererTurbo[25];
    
    initbulletModel_1();
    
    flipAll();
  }
  
  int textureX;
  
  private void initbulletModel_1() {
    this.bulletModel = new ModelRendererTurbo[1];
    this.bulletModel[0] = new ModelRendererTurbo(this, 222, 117, this.textureX, this.textureY);
    
    this.bulletModel[0].addShapeBox(13.0F, -10.0F, -1.0F, 6, 2, 2, 0.0F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F);
    this.bulletModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
  }
  
  int textureY;
}
