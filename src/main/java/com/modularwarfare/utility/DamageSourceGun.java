package com.modularwarfare.utility;

import com.modularwarfare.common.guns.ItemGun;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSourceIndirect;


import javax.annotation.Nullable;
import java.util.Random;

public class DamageSourceGun extends EntityDamageSourceIndirect {

    private final Random rand = new Random();

    private ItemStack weapon;

    private Entity source;

    private Entity indirect;


    public DamageSourceGun(String damageType, Entity source, Entity indirect, ItemStack weapon) {
        super(damageType, source, indirect);
        this.weapon = weapon;
        this.source = source;
        this.indirect = indirect;
    }


    @Nullable
    public ItemStack getGun() { return (this.weapon.getItem() instanceof ItemGun) ? this.weapon : ItemStack.EMPTY; }

    public Entity getSource() { return this.source; }
}
