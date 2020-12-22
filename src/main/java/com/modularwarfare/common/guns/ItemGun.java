package com.modularwarfare.common.guns;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

import com.google.common.collect.Multimap;
import com.modularwarfare.ModConfig;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponFireEvent;
import com.modularwarfare.common.entity.EntityBot;
import com.modularwarfare.common.entity.decals.EntityDecal;
import com.modularwarfare.common.entity.decals.EntityShell;
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.common.network.*;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.RayUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGun extends BaseItem {

    public static final Function<GunType, ItemGun> factory = type -> { return new ItemGun((type)); };

    public GunType type;
    public static float modelScale = 0;
    public static boolean canDryFire = true;
    public static boolean fireButtonHeld = false;
    public static boolean lastFireButtonHeld = false;
    public static int delay;

    public ItemGun(GunType type){
        super(type);
        this.type = type;
        this.setNoRepair();
    }

    @Override
    public void setType(BaseType type) {
        this.type = (GunType) type;
    }


    @Override
    public void onUpdate(ItemStack unused, World world, Entity holdingEntity, int intI, boolean flag) {
        if (holdingEntity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;

            if (entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun) {
                ItemStack heldStack = entityPlayer.getHeldItemMainhand();
                ItemGun itemGun = (ItemGun) heldStack.getItem();
                GunType gunType = itemGun.type;

                if (world.isRemote)
                    onUpdateClient(entityPlayer, world, heldStack, itemGun, gunType);
                else
                    onUpdateServer(entityPlayer, world, heldStack, itemGun, gunType);

                if (heldStack.getTagCompound() == null) {
                    NBTTagCompound nbtTagCompound = new NBTTagCompound();
                    nbtTagCompound.setString("firemode", gunType.fireModes[0].name().toLowerCase());
                    nbtTagCompound.setInteger("skinId", 0);
                    nbtTagCompound.setBoolean("punched", gunType.isEnergyGun);
                    heldStack.setTagCompound(nbtTagCompound);
                }
            }
        }
    }

    public void onUpdateClient(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, GunType gunType) {
        if(delay > 0){
            delay--;
        }
        if (entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun && delay == 0) {
            if (fireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && gunType.getFireMode(heldStack) == WeaponFireMode.FULL) {
                ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
            } else if (fireButtonHeld & !lastFireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && gunType.getFireMode(heldStack) == WeaponFireMode.SEMI) {
                ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
            } else if (gunType.getFireMode(heldStack) == WeaponFireMode.BURST) {
                NBTTagCompound tagCompound = heldStack.getTagCompound();
                boolean canFire = true;
                if (tagCompound.hasKey("shotsremaining") && tagCompound.getInteger("shotsremaining") > 0) {
                    ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
                    canFire = false;
                } else if (fireButtonHeld & !lastFireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && canFire) {
                    ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
                }
            }
            lastFireButtonHeld = fireButtonHeld;
        }
    }

    public void onUpdateServer(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, GunType gunType) {

    }

    public void onGunFire(EntityPlayer entityPlayer, World world, ItemStack gunStack, ItemGun itemGun, WeaponFireMode fireMode) {
        GunType gunType = itemGun.type;

        // Can fire checks
        if (isOnShootCooldown(entityPlayer) || isReloading(entityPlayer) || (!type.allowSprintFiring && entityPlayer.isSprinting()) || !itemGun.type.hasFireMode(fireMode))
            return;

        int shotCount = fireMode == WeaponFireMode.BURST ? gunStack.getTagCompound().getInteger("shotsremaining") > 0 ? gunStack.getTagCompound().getInteger("shotsremaining") : gunType.numBurstRounds : 1;
        if (!hasNextShot(gunStack)) {
            if (canDryFire) {
                gunType.playSound(entityPlayer, WeaponSoundType.DryFire, gunStack);
                canDryFire = false;
            }
            if (fireMode == WeaponFireMode.BURST) gunStack.getTagCompound().setInteger("shotsremaining", 0);
            return;
        }

        // Weapon pre fire event
        WeaponFireEvent.Pre preFireEvent = new WeaponFireEvent.Pre(entityPlayer, gunStack, itemGun, type.weaponMaxRange);
        MinecraftForge.EVENT_BUS.post(preFireEvent);
        if (preFireEvent.isCanceled())
            return;

        List<Entity> entities = new ArrayList();

        ArrayList<RayTraceResult> rayTraceList = new ArrayList<RayTraceResult>();
        for (int i = 0; i < gunType.numBullets; i++) {
            RayTraceResult rayTrace = RayUtil.standardEntityRayTrace(world, (EntityPlayerMP) entityPlayer, 200, itemGun, GunType.isPackAPunched(gunStack));
            rayTraceList.add(rayTrace);
        }

        boolean headshot = false;
        for (RayTraceResult rayTrace : rayTraceList) {
            if (rayTrace != null && rayTrace.typeOfHit == RayTraceResult.Type.ENTITY && rayTrace.entityHit instanceof EntityLivingBase) {
                if (!world.isRemote) {
                    if (rayTrace.entityHit != null) {
                        entities.add(rayTrace.entityHit);
                        gunType.playSoundPos(rayTrace.entityHit.getPosition(), world, WeaponSoundType.Penetration);
                        headshot = canEntityGetHeadshot(rayTrace.entityHit) && rayTrace.hitVec.y >= rayTrace.entityHit.getPosition().getY() + rayTrace.entityHit.getEyeHeight() - 0.15f;
                        if (entityPlayer instanceof EntityPlayerMP) {
                            ModularWarfare.NETWORK.sendTo(new PacketPlayHitmarker(headshot), (EntityPlayerMP) entityPlayer);
                        }
                    }
                }
            } else if (rayTrace != null) {
                BlockPos blockPos = rayTrace.getBlockPos();
                gunType.playSoundPos(blockPos, world, WeaponSoundType.Hit);
                doHit(rayTrace, entityPlayer);
            }
        }


        EntityShell shell = new EntityShell(world, entityPlayer, itemGun);
        shell.setHeadingFromThrower(entityPlayer, entityPlayer.rotationPitch, entityPlayer.rotationYaw + 110, 0.0F,0.2F,5);

        if (!world.isRemote) {
            world.spawnEntity(shell);
        }

        // Weapon post fire event
        WeaponFireEvent.Post postFireEvent = new WeaponFireEvent.Post(entityPlayer, gunStack, itemGun, entities, headshot);
        MinecraftForge.EVENT_BUS.post(postFireEvent);

        if (postFireEvent.getAffectedEntities() != null && !postFireEvent.getAffectedEntities().isEmpty()) {
            for (Entity target : postFireEvent.getAffectedEntities()) {
                if (target != null) {
                    if (target != entityPlayer) {
                        float damage = postFireEvent.getDamage();
                        if(GunType.isPackAPunched(gunStack)){
                            damage *= 1.75;
                        }
                        if (!ModConfig.INSTANCE.applyKnockback) {
                            RayUtil.attackEntityWithoutKnockback(target, DamageSource.causePlayerDamage(entityPlayer), damage);
                        } else {
                            target.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer), damage);
                        }
                        target.hurtResistantTime = 0;
                    }
                }
            }
        }

        consumeShot(gunStack);
        canDryFire = true;

        // Sound
        if(GunType.getAttachment(gunStack, AttachmentEnum.Barrel) != null){
            gunType.playSound(entityPlayer, WeaponSoundType.FireSuppressed, gunStack);
        } else if(GunType.isPackAPunched(gunStack)){
            gunType.playSound(entityPlayer, WeaponSoundType.Punched, gunStack);
            gunType.playSound(entityPlayer, WeaponSoundType.Fire, gunStack);

        } else {
            gunType.playSound(entityPlayer, WeaponSoundType.Fire, gunStack);
        }

        // Shoot Packet
        ModularWarfare.NETWORK.sendTo(new PacketClientAnimation(gunType.internalName, postFireEvent.getFireDelay(), postFireEvent.getRecoilPitch(), postFireEvent.getRecoilYaw()), (EntityPlayerMP) entityPlayer);

        // Burst Stuff
        if (fireMode == WeaponFireMode.BURST) {
            shotCount = shotCount - 1;
            gunStack.getTagCompound().setInteger("shotsremaining", shotCount);
        }

        // Fire Delay
        ServerTickHandler.playerShootCooldown.put(entityPlayer.getUniqueID(), postFireEvent.getFireDelay());

        //Hands upwards when shooting
        if(ServerTickHandler.playerAimShootCooldown.get(entityPlayer.getName()) == null){
            ModularWarfare.NETWORK.sendToAll(new PacketAimingReponse(entityPlayer.getName(), true));
        }
        ServerTickHandler.playerAimShootCooldown.put(entityPlayer.getName(), 60);
    }



    public void onGunFireBot(EntityBot entityBot, World world, ItemStack gunStack, ItemGun itemGun) {
        GunType gunType = itemGun.type;

        List<Entity> entities = new ArrayList();

        ArrayList<RayTraceResult> rayTraceList = new ArrayList<RayTraceResult>();
        for (int i = 0; i < gunType.numBullets; i++) {
            RayTraceResult rayTrace = RayUtil.standardEntityRayTrace(world, entityBot, 200, itemGun, GunType.isPackAPunched(gunStack));
            rayTraceList.add(rayTrace);
        }

        for (RayTraceResult rayTrace : rayTraceList) {
            if (rayTrace != null && rayTrace.typeOfHit == RayTraceResult.Type.ENTITY && rayTrace.entityHit instanceof EntityLivingBase) {
                if (!world.isRemote) {
                    if (rayTrace.entityHit != null) {
                        entities.add(rayTrace.entityHit);
                        gunType.playSoundPos(rayTrace.entityHit.getPosition(), world, WeaponSoundType.Penetration);
                    }
                }
            } else if (rayTrace != null && rayTrace.typeOfHit == RayTraceResult.Type.BLOCK) {
                BlockPos blockPos = rayTrace.getBlockPos();
                gunType.playSoundPos(blockPos, world, WeaponSoundType.Impact);
            }
        }

        // Sound
        if(GunType.getAttachment(gunStack, AttachmentEnum.Barrel) != null){
            gunType.playSound(entityBot, WeaponSoundType.FireSuppressed, gunStack);
        } else {
            gunType.playSound(entityBot, WeaponSoundType.Fire, gunStack);
        }

        if (entities != null && !entities.isEmpty()) {
            for (Entity target : entities) {
                if (target != null && target instanceof EntityLivingBase) {
                    if (target != entityBot) {
                        float damage = type.gunDamage;
                        RayUtil.attackEntityWithoutKnockback(target, DamageSource.causeMobDamage(entityBot), damage);
                        target.hurtResistantTime = 0;
                    }
                }
            }
        }

    }

    protected static final UUID MOVEMENT_SPEED_MODIFIER = UUID.fromString("99999999-4180-4865-B01B-BCCE9785ACA3");

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack)
    {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(slot, stack);
        if(slot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(MOVEMENT_SPEED_MODIFIER, "MovementSpeed", type.moveSpeedModifier - 1.0f, 2));
        }
        return multimap;
    }

    public void doHit(RayTraceResult raytraceResultIn, EntityPlayer shooter){
        if (raytraceResultIn.getBlockPos() != null) {
            BlockPos pos = raytraceResultIn.getBlockPos();

            EntityDecal.EnumDecalSide side = EntityDecal.EnumDecalSide.ALL;
            boolean shouldRender = false;
            double hitX = raytraceResultIn.hitVec.x;
            double hitY = raytraceResultIn.hitVec.y;
            double hitZ = raytraceResultIn.hitVec.z;
            double milieuX = (double) pos.getX() + 0.5D;
            double milieuY = (double) pos.getY() + 0.5D;
            double milieuZ = (double) pos.getZ() + 0.5D;
            double differenceX = hitX - milieuX;
            double differenceY = hitY - milieuY;
            double differenceZ = hitZ - milieuZ;
            if (differenceX == 0.0D) {
                if (shooter.posX < hitX) {
                    hitX -= 0.5D;
                    differenceX -= 0.5D;
                } else {
                    hitX += 0.5D;
                    differenceX += 0.5D;
                }
            }

            if (differenceY == 0.0D) {
                hitY += 0.5D;
                differenceY += 0.5D;
            }

            if (differenceZ == 0.0D) {
                if (shooter.posZ < hitZ) {
                    hitZ -= 0.5D;
                    differenceZ -= 0.5D;
                } else {
                    hitZ += 0.5D;
                    differenceZ += 0.5D;
                }
            }

            if (differenceX == -0.5D) {
                side = EntityDecal.EnumDecalSide.EAST;
                shouldRender = true;
            }

            if (differenceX == 0.5D) {
                side = EntityDecal.EnumDecalSide.WEST;
                shouldRender = true;
            }

            if (differenceZ == -0.5D) {
                side = EntityDecal.EnumDecalSide.SOUTH;
                shouldRender = true;
            }

            if (differenceZ == 0.5D) {
                side = EntityDecal.EnumDecalSide.NORTH;
                shouldRender = true;
            }

            if (differenceY == 0.5D) {
                side = EntityDecal.EnumDecalSide.FLOOR;
                shouldRender = true;
            }

            if (shouldRender) {
                ModularWarfare.NETWORK.sendToAll(new PacketDecal(0, side, hitX, hitY + 0.095D, hitZ, false));
            }
        }
    }

    private boolean canEntityGetHeadshot(Entity e) {
        return e instanceof EntityZombie || e instanceof EntityBot || e instanceof EntitySkeleton || e instanceof EntityCreeper || e instanceof EntityWitch || e instanceof EntityPigZombie || e instanceof EntityEnderman || e instanceof EntityWitherSkeleton || e instanceof EntityPlayer || e instanceof EntityVillager || e instanceof EntityEvoker || e instanceof EntityStray || e instanceof EntityVindicator || e instanceof EntityIronGolem || e instanceof EntitySnowman || e.getName().contains("common");
    }


    public void onGunSwitchMode(EntityPlayer entityPlayer, World world, ItemStack gunStack, ItemGun itemGun, WeaponFireMode fireMode) {
        GunType.setFireMode(gunStack, fireMode);

        GunType gunType = itemGun.type;
        if (WeaponSoundType.ModeSwitch != null) {
            gunType.playSound(entityPlayer, WeaponSoundType.ModeSwitch, gunStack);
        }
    }

    /**
     * If the player is on a shoot cooldown
     *
     * @param entityPlayer
     * @return shoot cooldown
     */
    public static boolean isOnShootCooldown(EntityPlayer entityPlayer) {
        return ServerTickHandler.playerShootCooldown.containsKey(entityPlayer.getUniqueID());
    }

    /**
     * If the player is on a reload cooldown
     *
     * @param entityPlayer
     * @return reload cooldown
     */
    public static boolean isReloading(EntityPlayer entityPlayer) {
        return ServerTickHandler.playerReloadCooldown.containsKey(entityPlayer.getUniqueID());
    }

    public static boolean hasAmmoLoaded(ItemStack gunStack) {
        return !gunStack.isEmpty() ? !(gunStack.getItem() instanceof ItemAir) ? gunStack.hasTagCompound() ? gunStack.getTagCompound().hasKey("ammo") ? gunStack.getTagCompound().getTag("ammo") != null : false : false : false : false;
    }

    public static int getMagazineBullets(ItemStack gunStack) {
        if (hasAmmoLoaded(gunStack)) {
            ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
            ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
            if (ammoStack.getTagCompound() != null) {
                String key = itemAmmo.type.magazineCount != null ? "ammocount" + ammoStack.getTagCompound().getInteger("magcount") : "ammocount";
                int ammoCount = ammoStack.getTagCompound().getInteger(key);
                return ammoCount;
            }
        }
        return 0;
    }

    public static void giveLoadedWeapon(EntityPlayerMP playerMP, String name, int slot) {
        if (ModularWarfare.gunTypes.containsKey(name)) {
            ItemGun gun = ModularWarfare.gunTypes.get(name);
            GunType gunType = gun.type;
            ItemStack gunStack = new ItemStack(gun);

            NBTTagCompound nbtTagCompound0 = new NBTTagCompound();
            nbtTagCompound0.setString("firemode", gunType.fireModes[0].name().toLowerCase());
            nbtTagCompound0.setInteger("skinId", 0);
            gunStack.setTagCompound(nbtTagCompound0);

            NBTTagCompound nbtTagCompound = gunStack.getTagCompound();
            ItemStack ammoStackToLoad = null;

            for (ItemAmmo itemAmmo : ModularWarfare.ammoTypes.values()) {
                if (itemAmmo.type.internalName.equalsIgnoreCase(gunType.acceptedAmmo[0])) {
                    ammoStackToLoad = new ItemStack(itemAmmo);
                }
            }

            if (!ammoStackToLoad.hasTagCompound()) {
                ItemAmmo itemAmmo = (ItemAmmo) ammoStackToLoad.getItem();
                NBTTagCompound nbtTagCompoundBis = new NBTTagCompound();
                nbtTagCompoundBis.setInteger("ammocount", itemAmmo.type.ammoCapacity);
                nbtTagCompoundBis.setInteger("skinId", 0);
                if (itemAmmo.type.magazineCount != null) {
                    nbtTagCompoundBis.setInteger("magcount", 1);
                    for (int i = 1; i < itemAmmo.type.magazineCount + 1; i++) {
                        nbtTagCompoundBis.setInteger("ammocount" + i, itemAmmo.type.ammoCapacity);
                    }
                }
                ammoStackToLoad.setTagCompound(nbtTagCompoundBis);
            }

            ItemStack loadingItemStack = ammoStackToLoad.copy();
            nbtTagCompound.setTag("ammo", loadingItemStack.writeToNBT(new NBTTagCompound()));

            gunStack.setTagCompound(nbtTagCompound);

            playerMP.inventory.add(slot,gunStack);
        }
        else {
            playerMP.sendMessage(new TextComponentString("This gun doesn't exist."));
        }
    }



    public static boolean hasNextShot(ItemStack gunStack) {
        if (hasAmmoLoaded(gunStack)) {
            ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
            ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
            if (ammoStack.getTagCompound() != null) {
                String key = itemAmmo.type.magazineCount != null ? "ammocount" + ammoStack.getTagCompound().getInteger("magcount") : "ammocount";
                int ammoCount = ammoStack.getTagCompound().getInteger(key) - 1;
                return ammoCount >= 0;
            }
        } else if (gunStack.getTagCompound() != null && gunStack.getTagCompound().hasKey("ammocount")) {
            return gunStack.getTagCompound().getInteger("ammocount") > 0;
        }
        return false;
    }

    public static void consumeShot(ItemStack gunStack) {
        if (hasAmmoLoaded(gunStack)) {
            ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
            ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
            if (ammoStack.getTagCompound() != null) {
                NBTTagCompound nbtTagCompound = ammoStack.getTagCompound();
                String key = itemAmmo.type.magazineCount != null ? "ammocount" + nbtTagCompound.getInteger("magcount") : "ammocount";
                nbtTagCompound.setInteger(key, nbtTagCompound.getInteger(key) - 1);
                gunStack.getTagCompound().setTag("ammo", ammoStack.writeToNBT(new NBTTagCompound()));
            }
        } else if (gunStack.getTagCompound() != null && gunStack.getTagCompound().hasKey("ammocount")) {
            int ammoCount = gunStack.getTagCompound().getInteger("ammocount");
            gunStack.getTagCompound().setInteger("ammocount", ammoCount - 1);
        }
    }

    public static ItemBullet getUsedBullet(ItemStack gunStack, GunType gunType) {
        if (gunType.acceptedAmmo != null)
            return ItemAmmo.getUsedBullet(gunStack);
        else if (gunType.acceptedBullets != null) {
            if (gunStack.hasTagCompound() && gunStack.getTagCompound().hasKey("bullet")) {
                ItemStack usedBullet = new ItemStack(gunStack.getTagCompound().getCompoundTag("bullet"));
                ItemBullet usedBulletItem = (ItemBullet) usedBullet.getItem();
                return usedBulletItem;
            }
        }
        return null;
    }

    /**
     * Minecraft Overrides
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        GunType gunType = ((ItemGun) stack.getItem()).type;

        if (gunType == null)
            return;


        if (hasAmmoLoaded(stack)) {
            ItemStack ammoStack = new ItemStack(stack.getTagCompound().getCompoundTag("ammo"));
            ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();

            if (itemAmmo.type.magazineCount == null) {
                int currentAmmoCount = 0;
                if (ammoStack.getTagCompound() != null) {
                    NBTTagCompound tag = ammoStack.getTagCompound();
                    currentAmmoCount = tag.hasKey("ammocount") ? tag.getInteger("ammocount") : 0;
                }

                tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(currentAmmoCount), Integer.toString(itemAmmo.type.ammoCapacity)));
            } else {
                if (stack.getTagCompound() != null) {
                    if (gunType.acceptedBullets != null) {
                        int ammoCount = stack.getTagCompound().hasKey("ammocount") ? stack.getTagCompound().getInteger("ammocount") : 0;
                        tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(ammoCount), Integer.toString(gunType.internalAmmoStorage)));
                    }

                    String baseDisplayLine = "Ammo %s: %g%s%dg/%g%s";
                    baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
                    baseDisplayLine = baseDisplayLine.replaceAll("%dg", TextFormatting.DARK_GRAY.toString());

                    for (int i = 1; i < itemAmmo.type.magazineCount + 1; i++) {
                        NBTTagCompound tag = ammoStack.getTagCompound();
                        String displayLine = baseDisplayLine.replaceAll("%g", i == tag.getInteger("magcount") ? TextFormatting.YELLOW.toString() : TextFormatting.GRAY.toString());
                        tooltip.add(String.format(displayLine, i, tag.getInteger("ammocount" + i), itemAmmo.type.ammoCapacity));
                    }
                }
            }
        }

        if (stack.getTagCompound() != null) {
            if (gunType.acceptedBullets != null) {
                int ammoCount = stack.getTagCompound().hasKey("ammocount") ? stack.getTagCompound().getInteger("ammocount") : 0;
                tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(ammoCount), Integer.toString(gunType.internalAmmoStorage)));
            }
        }

        if (ItemAmmo.getUsedBullet(stack) != null) {
            ItemBullet itemBullet = ItemAmmo.getUsedBullet(stack);
            tooltip.add(generateLoreLine("Bullet", itemBullet.type.displayName));
        }

        String baseDisplayLine = "%bFire Mode: %g%s";
        baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
        baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
        tooltip.add(String.format(baseDisplayLine, GunType.getFireMode(stack) != null ? GunType.getFireMode(stack) : gunType.fireModes[0]));


        tooltip.add("Accepted attachments:");
        List<String> attachments = null;

        if (gunType.acceptedAttachments != null) {
            if (!gunType.acceptedAttachments.isEmpty()) {
                for (ArrayList<String> strings : gunType.acceptedAttachments.values()) {
                    for (int i = 0; i < strings.size(); i++) {
                        try {
                            final String attachment = ModularWarfare.attachmentTypes.get(strings.get(i)).type.displayName;
                            if (attachment != null) {
                                tooltip.add("- " + attachment);
                            }
                        } catch (NullPointerException error) {
                        }
                    }
                }
            }
        }
    }

    public static boolean isIndoors(final EntityLivingBase givenEntity) {
        final BlockPos blockPos = givenEntity.world.getPrecipitationHeight(givenEntity.getPosition());
        if (blockPos != null) {
            if (blockPos.getY() > givenEntity.posY) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean getShareTag() {
        return true;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 0;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.BLOCK;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        return true;
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        modelScale = type.model.modelScale;
        boolean result = !oldStack.equals(newStack);
        if (result) {
            // TODO: Requip animation
        }
        return result;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
        World world = player.world;
        if (!world.isRemote) {
            // Client will still render block break if player is in creative so update block state
            IBlockState state = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, state, state, 3);
        }
        return true;
    }

    @Override
    public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
        return false;
    }

    @Override
    public boolean canItemEditBlocks() {
        return false;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        return true;
    }
}