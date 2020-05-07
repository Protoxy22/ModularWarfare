package com.modularwarfare.common.entity;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.entity.ai.EntityAIGunAttack;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.utility.RayUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EntityBot extends EntityCreature {

    public static ArrayList<Item> armorHelmet = new ArrayList<Item>(
            Arrays.asList(
                    ModularWarfare.armorTypes.get("omw.usmcfr_head")
            ));
    public static ArrayList<Item> armorChestplate = new ArrayList<Item>(
            Arrays.asList(
                    ModularWarfare.armorTypes.get("omw.usmcfr_chest"),
                    ModularWarfare.armorTypes.get("omw.uniform_chest")
            ));
    public static ArrayList<Item> armorLeggings = new ArrayList<Item>(
            Arrays.asList(
                    ModularWarfare.armorTypes.get("omw.usmcfr_legs"),
                    ModularWarfare.armorTypes.get("omw.uniform_legs")
            ));
    public static ArrayList<Item> armorBoots = new ArrayList<Item>(
            Arrays.asList(
                    ModularWarfare.armorTypes.get("omw.usmcfr_feet"),
                    ModularWarfare.armorTypes.get("omw.uniform_feet")
            ));

    public static ArrayList<Item> weapons = new ArrayList<Item>(
            Arrays.asList(
                    ModularWarfare.gunTypes.get("omw.mk14"),
                    ModularWarfare.gunTypes.get("omw.sks"),
                    ModularWarfare.gunTypes.get("omw.groza"),
                    ModularWarfare.gunTypes.get("omw.m4a1"),
                    ModularWarfare.gunTypes.get("omw.p1911"),
                    ModularWarfare.gunTypes.get("omw.akm")
            ));

    private Random randomGenerator;


    public NonNullList<ItemStack> inventory = NonNullList.withSize(9, ItemStack.EMPTY);


    public int difficulty;


    public EntityBot(World worldIn) {
        super(worldIn);
        randomGenerator = new Random();

        int randomNum = rand.nextInt((4 - 1) + 1) + 1;

        this.difficulty = randomNum;
        this.preventEntitySpawning = true;
        this.enablePersistence();
        this.setSize(0.6F, 1.95F);

        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        nbtTagCompound.setInteger("skinId", 0);

        ItemStack militaryHelmet = new ItemStack(getRandomArmor(armorHelmet));
        ItemStack militaryChest = new ItemStack(getRandomArmor(armorChestplate));
        ItemStack militaryLeggings = new ItemStack(getRandomArmor(armorLeggings));
        ItemStack militaryBoots = new ItemStack(getRandomArmor(armorBoots));

        militaryHelmet.setTagCompound(nbtTagCompound);
        militaryChest.setTagCompound(nbtTagCompound);
        militaryLeggings.setTagCompound(nbtTagCompound);
        militaryBoots.setTagCompound(nbtTagCompound);

        ItemStack gun = new ItemStack(getRandomArmor(weapons));
        ItemGun itemGun = (ItemGun) gun.getItem();
        GunType gunType = itemGun.type;
        if (gun.getTagCompound() == null) {
            NBTTagCompound tagCompound = new NBTTagCompound();
            tagCompound.setString("firemode", gunType.fireModes[0].name().toLowerCase());
            tagCompound.setInteger("skinId", 0);
            gun.setTagCompound(tagCompound);
        }

        this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, gun);
        this.setItemStackToSlot(EntityEquipmentSlot.HEAD, militaryHelmet);
        this.setItemStackToSlot(EntityEquipmentSlot.CHEST, militaryChest);
        this.setItemStackToSlot(EntityEquipmentSlot.LEGS, militaryLeggings);
        this.setItemStackToSlot(EntityEquipmentSlot.FEET, militaryBoots);



    }

    public EntityBot(World world, BlockPos pos, int difficulty) {
        this(world);
        this.difficulty = difficulty;
        this.setPosition(pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIGunAttack(this));
        //this.tasks.addTask(3, new EntityAISearchLoot(this, 0.05F));
        //this.tasks.addTask(4, new EntityAIMoveIntoZone(this));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D, 1.0E-4F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 40.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 10, true, false, EntitySelectors.IS_ALIVE));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBot.class, true));

    }

    @Override
    protected void entityInit() {
        super.entityInit();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
    }

    /**
     * Called to update the entity's position/logic.
     */

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate() {
        super.onUpdate();
        if(this.dead) {
            this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, ItemStack.EMPTY);
        }
    }



    public boolean isInRangeToRenderDist(double distance) { return true; }

    protected boolean canDropLoot() { return false; }

    @Override
    public boolean canPickUpLoot() {
        // TODO Implement custom loot system
        return false;
    }

    // TODO check is death crate can be spawn
    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
    }

    public boolean hasGun() { return getHeldItemMainhand().getItem() instanceof ItemGun; }

    public ItemGun getGun() { return (ItemGun) getHeldItemMainhand().getItem(); }


    public static void spawnEntity(World world, BlockPos from, int difficulty) {
        if(!world.isRemote) {
            EntityBot ai = new EntityBot(world, from, difficulty);
            world.spawnEntity(ai);
        }
    }

    public Item getRandomArmor(ArrayList<Item> givenArrayList) {
        return givenArrayList.get(randomGenerator.nextInt(givenArrayList.size()));
    }

    public static NonNullList<ItemStack> getBasicInventory() {
        return NonNullList.withSize(9, ItemStack.EMPTY);
    }
}
