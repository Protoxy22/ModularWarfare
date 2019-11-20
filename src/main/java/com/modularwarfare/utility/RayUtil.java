package com.modularwarfare.utility;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.network.PacketGunTrail;
import com.modularwarfare.common.network.PacketPlaySound;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RayUtil {

    public static boolean isLiving(Entity entity){
        return entity instanceof EntityLivingBase && !(entity instanceof EntityArmorStand);
    }


    public static Vec3d getGunAccuracy(float pitch, float yaw, final float accuracy, final Random rand) {
        final float randAccPitch = rand.nextFloat() * accuracy;
        final float randAccYaw = rand.nextFloat() * accuracy;
        pitch += (rand.nextBoolean() ? randAccPitch : (-randAccPitch));
        yaw += (rand.nextBoolean() ? randAccYaw : (-randAccYaw));
        final float f = MathHelper.cos(-yaw * 0.017453292f - 3.1415927f);
        final float f2 = MathHelper.sin(-yaw * 0.017453292f - 3.1415927f);
        final float f3 = -MathHelper.cos(-pitch * 0.017453292f);
        final float f4 = MathHelper.sin(-pitch * 0.017453292f);
        return new Vec3d((double)(f2 * f3), (double)f4, (double)(f * f3));
    }

    public static float calculateAccuracyServer(final ItemGun item, final EntityPlayerMP player) {
        final GunType gun = item.type;
        float acc = gun.bulletSpread;
        if (player.posX != player.lastTickPosX || player.posZ != player.lastTickPosZ) {
            acc += 0.75f;
        }
        if (!player.onGround) {
            acc += 1.5f;
        }
        if (player.isSprinting()) {
            acc += 0.25f;
        }
        if (player.isSneaking()) {
            acc *= 0.5f;
        }
        return acc;
    }

    public static float calculateAccuracyClient(final ItemGun item, final EntityPlayer player) {
        final GunType gun = item.type;
        float acc = gun.bulletSpread;
        final GameSettings settings = Minecraft.getMinecraft().gameSettings;
        if (settings.keyBindForward.isKeyDown() || settings.keyBindLeft.isKeyDown() || settings.keyBindBack.isKeyDown() || settings.keyBindRight.isKeyDown()) {
            acc += 0.75f;
        }
        if (!player.onGround) {
            acc += 1.5f;
        }
        if (player.isSprinting()) {
            acc += 0.25f;
        }
        if (player.isSneaking()) {
            acc *= 0.5f;
        }
        return acc;
    }


    /**
     * Attacks the given entity with the given damage source and amount, but
     * preserving the entity's original velocity instead of applying knockback, as
     * would happen with
     * {@link EntityLivingBase#attackEntityFrom(DamageSource, float)} <i>(More
     * accurately, calls that method as normal and then resets the entity's velocity
     * to what it was before).</i> Handy for when you need to damage an entity
     * repeatedly in a short space of time.
     *
     * @param entity The entity to attack
     * @param source The source of the damage
     * @param amount The amount of damage to apply
     * @return True if the attack succeeded, false if not.
     */
    public static boolean attackEntityWithoutKnockback(Entity entity, DamageSource source, float amount) {
        double vx = entity.motionX;
        double vy = entity.motionY;
        double vz = entity.motionZ;
        boolean succeeded = entity.attackEntityFrom(source, amount);
        entity.motionX = vx;
        entity.motionY = vy;
        entity.motionZ = vz;
        return succeeded;
    }

    /**
     * Helper method which does a rayTrace for entities from an entity's eye level in the direction they are looking
     * with a specified range, using the tracePath method. Tidies up the code a bit. Border size defaults to 1.
     *
     * @param world
     * @param range
     * @return
     */
    @Nullable
    public static RayTraceResult standardEntityRayTrace(World world, EntityPlayerMP player, double range, ItemGun item){

        HashSet<Entity> hashset = new HashSet<Entity>(1);
        hashset.add(player);
        final float accuracy = calculateAccuracyServer(item, player);
        final Vec3d dir = getGunAccuracy(player.rotationPitch, player.rotationYaw, accuracy, player.world.rand);

        double dx = dir.x * range;
        double dy = dir.y * range;
        double dz = dir.z * range;

        ModularWarfare.NETWORK.sendToDimension(new PacketGunTrail(player.posX,player.getEntityBoundingBox().minY + player.getEyeHeight() - 0.10000000149011612, player.posZ, player.motionX, player.motionZ, dir.x, dir.y, dir.z, range), player.world.provider.getDimension());

        return RayUtil.tracePath(world, (float)player.posX, (float)(player.getEntityBoundingBox().minY + player.getEyeHeight() - 0.10000000149011612), (float)player.posZ, (float)(player.posX + dx+ player.motionX), (float)(player.posY + dy), (float)(player.posZ + dz + player.motionZ), 0.1f, hashset, false);
    }

    /**
     * Helper method which does a rayTrace for entities from a entity's eye level in the direction they are looking with
     * a specified range and radius, using the tracePath method. Tidies up the code a bit.
     *
     * @param world
     * @param entity
     * @param range
     * @param borderSize
     * @return
     */
    @Nullable
    public static RayTraceResult standardEntityRayTrace(World world, EntityLivingBase entity, double range,
                                                        float borderSize){
        double dx = entity.getLookVec().x * range;
        double dy = entity.getLookVec().y * range;
        double dz = entity.getLookVec().z * range;
        HashSet<Entity> hashset = new HashSet<Entity>(1);
        hashset.add(entity);
        return RayUtil.tracePath(world, (float)entity.posX, (float)(entity.getEntityBoundingBox().minY + entity.getEyeHeight()), (float)entity.posZ, (float)(entity.posX + dx), (float)(entity.posY + entity.getEyeHeight() + dy), (float)(entity.posZ + dz),
                borderSize, hashset, false);
    }

    /**
     * Method for ray tracing entities (the useless default method doesn't work, despite EnumHitType having an ENTITY
     * field...) You can also use this for seeking.
     *
     * @param world
     * @param x startX
     * @param y startY
     * @param z startZ
     * @param tx endX
     * @param ty endY
     * @param tz endZ
     * @param borderSize extra area to examine around line for entities
     * @param excluded any excluded entities (the player, etc)
     * @return a RayTraceResult of either the block hit (no entity hit), the entity hit (hit an entity), or null for
     *         nothing hit
     */
    @Nullable
    public static RayTraceResult tracePath(World world, float x, float y, float z, float tx, float ty, float tz, float borderSize, HashSet<Entity> excluded, boolean collideablesOnly){

        Vec3d startVec = new Vec3d(x, y, z);
        // Vec3d lookVec = new Vec3d(tx-x, ty-y, tz-z);
        Vec3d endVec = new Vec3d(tx, ty, tz);

        float minX = x < tx ? x : tx;
        float minY = y < ty ? y : ty;
        float minZ = z < tz ? z : tz;
        float maxX = x > tx ? x : tx;
        float maxY = y > ty ? y : ty;
        float maxZ = z > tz ? z : tz;
        AxisAlignedBB bb = new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ).grow(borderSize, borderSize,
                borderSize);
        List<Entity> allEntities = world.getEntitiesWithinAABBExcludingEntity(null, bb);
        RayTraceResult blockHit = world.rayTraceBlocks(startVec, endVec,  true, true, false);
        startVec = new Vec3d(x, y, z);
        endVec = new Vec3d(tx, ty, tz);
        float maxDistance = (float)endVec.distanceTo(startVec);
        if(blockHit != null){
            maxDistance = (float)blockHit.hitVec.distanceTo(startVec);
        }

        Entity closestHitEntity = null;
        Vec3d hit = null;
        float closestHit = maxDistance;
        float currentHit = 0.f;
        AxisAlignedBB entityBb;// = ent.getBoundingBox();
        RayTraceResult intercept;
        for(Entity ent : allEntities){
            if((ent.canBeCollidedWith() || !collideablesOnly) && ((excluded != null && !excluded.contains(ent)) || excluded == null)){
                if(ent instanceof EntityPlayerMP){
                    ModularWarfare.NETWORK.sendTo(new PacketPlaySound(ent.getPosition(), "flyby", 0.4f, 1f), (EntityPlayerMP) ent);
                }
                float entBorder = ent.getCollisionBorderSize();
                entityBb = ent.getEntityBoundingBox();
                if(entityBb != null){
                    entityBb = entityBb.grow(entBorder, entBorder, entBorder);
                    intercept = entityBb.calculateIntercept(startVec, endVec);
                    if(intercept != null){
                        currentHit = (float)intercept.hitVec.distanceTo(startVec);
                        hit = intercept.hitVec;
                        if(currentHit < closestHit || currentHit == 0){
                            closestHit = currentHit;
                            closestHitEntity = ent;
                        }
                    }
                }
            }
        }
        if(closestHitEntity != null && hit != null){
            blockHit = new RayTraceResult(closestHitEntity, hit);
        }
        return blockHit;
    }
}