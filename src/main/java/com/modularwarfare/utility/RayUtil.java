package com.modularwarfare.utility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

public class RayUtil {

    public static boolean isLiving(Entity entity){
        return entity instanceof EntityLivingBase && !(entity instanceof EntityArmorStand);
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
     * @param entity
     * @param range
     * @return
     */
    @Nullable
    public static RayTraceResult standardEntityRayTrace(World world, EntityLivingBase entity, double range){
        double dx = entity.getLookVec().x * range;
        double dy = entity.getLookVec().y * range;
        double dz = entity.getLookVec().z * range;
        HashSet<Entity> hashset = new HashSet<Entity>(1);
        hashset.add(entity);
        return RayUtil.tracePath(world, (float)entity.posX, (float)(entity.getEntityBoundingBox().minY + entity.getEyeHeight()), (float)entity.posZ, (float)(entity.posX + dx), (float)(entity.posY + entity.getEyeHeight() + dy), (float)(entity.posZ + dz), 1.0f, hashset, false);
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
            if((ent.canBeCollidedWith() || !collideablesOnly)
                    && ((excluded != null && !excluded.contains(ent)) || excluded == null)){
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