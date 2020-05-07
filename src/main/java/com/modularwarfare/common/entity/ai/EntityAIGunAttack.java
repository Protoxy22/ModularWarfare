package com.modularwarfare.common.entity.ai;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.entity.EntityBot;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.item.ItemStack;

public class EntityAIGunAttack
  extends EntityAIBase {

  private final EntityBot aiPlayer;
  private int timeRemaining;
  private int shotsFired;
  private int timeWatching;
  private EntityLivingBase target;
  
  public EntityAIGunAttack(EntityBot aiPlayer) {
    this.aiPlayer = aiPlayer;
    setMutexBits(3);
  }

  
  public boolean shouldExecute() {
    if (!this.aiPlayer.hasGun()) {
      return false;
    }
    this.target = this.aiPlayer.getAttackTarget();
    return (this.target != null);
  }


  
  public boolean shouldContinueExecuting() { return (shouldExecute() || !this.aiPlayer.getNavigator().noPath() || !this.aiPlayer.hasGun()); }


  
  public void resetTask() {
    this.timeWatching = 0;
    this.timeRemaining = 5;
    this.shotsFired = 0;
    this.target = null;
  }

  
  public void updateTask() {
    if (this.target == null)
      return;
    double distanceToTarget = Math.sqrt(this.aiPlayer.getDistanceSq(this.target));
    boolean flag = this.aiPlayer.getEntitySenses().canSee(this.target);
    if(this.target != null){
      this.timeWatching++;
    } else {
      this.timeWatching = 0;
    }

    if (!this.aiPlayer.hasGun()) {
      return;
    }



    ItemGun gun = this.aiPlayer.getGun();
    int botDistance = gun.type.weaponType.botDistance;

    this.aiPlayer.getLookHelper().setLookPositionWithEntity(this.target, 30.0F, 30.0F);

    if (distanceToTarget <= botDistance && this.timeWatching >= ((1+4-this.aiPlayer.difficulty)*8)) {
      this.aiPlayer.getNavigator().tryMoveToEntityLiving(this.target, 1.0D);
      this.aiPlayer.getLookHelper().onUpdateLook();

      if (--this.timeRemaining <= 0) {
        if (!flag) {
          return;
        }
        shoot(gun, this.aiPlayer.getHeldItemMainhand(), distanceToTarget);
      }
    } else {
      this.aiPlayer.getNavigator().clearPath();
    }
  }


  private void shoot(ItemGun gun, ItemStack gunStack, double distanceToTarget) {
    if (distanceToTarget > gun.type.weaponType.botDistance) {
      return;
    }
    this.shotsFired++;

    gun.onGunFireBot(this.aiPlayer, this.aiPlayer.world, gunStack, gun);

    boolean effectiveRange = (distanceToTarget < gun.type.weaponType.botDistance);


    int shootTimeDifficulty = this.aiPlayer.world.rand.nextInt(12);
    switch (this.aiPlayer.difficulty){
      case 2:
        shootTimeDifficulty = this.aiPlayer.world.rand.nextInt(8);
      case 3:
        shootTimeDifficulty = this.aiPlayer.world.rand.nextInt(4);
      case 4:
        shootTimeDifficulty = 0;
        break;
      default:
        break;
    }
    this.timeRemaining = shootTimeDifficulty + gun.type.fireTickDelay + (effectiveRange ? 3 : 9);

    ItemAmmo itemAmmo = ModularWarfare.ammoTypes.get(gun.type.acceptedAmmo[0]);
    final int ammoCapacity = itemAmmo.type.ammoCapacity;

    if (this.shotsFired >= ammoCapacity) {
      this.shotsFired = 0;
      this.timeRemaining = 80;

    }

  }


}
