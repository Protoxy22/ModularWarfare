package com.modularwarfare.common.guns;

import java.util.List;

import javax.annotation.Nullable;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponFireEvent;
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.common.network.PacketGunFire;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.RaytraceHelper.Line;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGun extends BaseItem {
	
	public GunType type;
	public boolean isAiming = false;
	public static float modelScale = 0;
	public static boolean canDryFire = true;
	public static boolean fireButtonHeld = false;
	public static boolean lastFireButtonHeld = false;
	
	public ItemGun(GunType type)
	{
		super(type);
		this.type = type;
		this.setNoRepair();		
	}
	
	@Override
	public void setType(BaseType type)
	{
		this.type = (GunType) type;
	}
	
	@Override
    public void onUpdate(ItemStack unused, World world, Entity holdingEntity, int intI, boolean flag)
    {
		if(holdingEntity instanceof EntityPlayer)
		{
			EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;

			if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
			{
				ItemStack heldStack = entityPlayer.getHeldItemMainhand();
				ItemGun itemGun = (ItemGun) heldStack.getItem();
				GunType gunType = itemGun.type;
				
				if(world.isRemote)
					onUpdateClient(entityPlayer, world, heldStack, itemGun, gunType);
				else
					onUpdateServer(entityPlayer, world, heldStack, itemGun, gunType);
				
				if(heldStack.getTagCompound() == null)
				{
					NBTTagCompound nbtTagCompound = new NBTTagCompound();
					nbtTagCompound.setString("firemode", gunType.fireModes[0].name().toLowerCase());
					nbtTagCompound.setInteger("skinId", 0);
					heldStack.setTagCompound(nbtTagCompound);
				}
			}	
		}
    }
	
	public void onUpdateClient(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, GunType gunType)
	{
		if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			if(fireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && gunType.getFireMode(heldStack) == WeaponFireMode.FULL)
			{
				ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
			} else if(fireButtonHeld & !lastFireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && gunType.getFireMode(heldStack) == WeaponFireMode.SEMI)
			{
				ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
			}  else if(gunType.getFireMode(heldStack) == WeaponFireMode.BURST)
			{
				NBTTagCompound tagCompound = heldStack.getTagCompound();
				boolean canFire = true;
				if(tagCompound.hasKey("shotsremaining") && tagCompound.getInteger("shotsremaining") > 0)
				{
					ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
					canFire = false;
				} else if(fireButtonHeld & !lastFireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && canFire)
				{
					ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
				}
			}
			lastFireButtonHeld = fireButtonHeld;
		}
	}
	
	public void onUpdateServer(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, GunType gunType)
	{
		
	}
	
	public void onGunFire(EntityPlayer entityPlayer, World world, ItemStack gunStack, ItemGun itemGun, WeaponFireMode fireMode)
	{
		GunType gunType = itemGun.type;
		
		// Can fire checks
		if(isOnShootCooldown(entityPlayer) || isReloading(entityPlayer) || (!type.allowSprintFiring && entityPlayer.isSprinting()) || !itemGun.type.hasFireMode(fireMode)) 
			return;
		
		int shotCount = fireMode == WeaponFireMode.BURST ? gunStack.getTagCompound().getInteger("shotsremaining") > 0 ? gunStack.getTagCompound().getInteger("shotsremaining") : gunType.numBurstRounds: 1;
		if(!hasNextShot(gunStack))
		{
			if(canDryFire) {
				gunType.playSound(entityPlayer, WeaponSoundType.DryFire, gunStack);
				canDryFire = false;
			}
			if(fireMode == WeaponFireMode.BURST) gunStack.getTagCompound().setInteger("shotsremaining", 0);
			return;
		} 
					
		// Weapon pre fire event
		WeaponFireEvent.Pre preFireEvent = new WeaponFireEvent.Pre(entityPlayer, gunStack, itemGun, type.weaponMaxRange);
		MinecraftForge.EVENT_BUS.post(preFireEvent);
		if(preFireEvent.isCanceled())
			return;
		
		// Raytrace
		Line line = Line.fromRaytrace(entityPlayer, preFireEvent.getWeaponRange());
		List<Entity> entities = line.getEntities(world, Entity.class, false);
		
		// Weapon post fire event
		WeaponFireEvent.Post postFireEvent = new WeaponFireEvent.Post(entityPlayer, gunStack, itemGun, entities);
		MinecraftForge.EVENT_BUS.post(postFireEvent);
		
		ItemBullet bulletItem = getUsedBullet(gunStack, gunType);
		BulletType bulletType = null;			
		if(bulletItem != null)
			bulletType = bulletItem.type;
		
		for(Entity e : postFireEvent.getAffectedEntities())
		{
			if(e instanceof EntityLivingBase)
			{
				EntityLivingBase targetLiving = (EntityLivingBase) e;
				if(targetLiving != entityPlayer)
				{
					float damage = postFireEvent.getDamage();
					if(bulletType != null)
					{
						BulletProperty bulletProperty = bulletType.bulletProperties.get(targetLiving.getName()) != null ? bulletType.bulletProperties.get(targetLiving.getName()) : bulletType.bulletProperties.get("All");
						if(bulletProperty != null)
						{
							damage *= bulletProperty.bulletDamage;
							
							if(bulletProperty.potionEffects != null)
							{
								for(PotionEntry potionEntry : bulletProperty.potionEffects)
								{
									targetLiving.addPotionEffect(new PotionEffect(potionEntry.potionEffect.getPotion(), potionEntry.duration, potionEntry.level));
								}
							}
						}
					}
					targetLiving.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer), damage);
					targetLiving.hurtResistantTime = 0;
				}
			}
		}
		
		consumeShot(gunStack);
		canDryFire = true;
		
		// Sound
		gunType.playSound(entityPlayer, WeaponSoundType.Fire, gunStack);
		
		// Burst Stuff
		if(fireMode == WeaponFireMode.BURST)
		{
			shotCount = shotCount - 1;
			gunStack.getTagCompound().setInteger("shotsremaining", shotCount);
		}
		
		// Fire Delay
		ServerTickHandler.playerShootCooldown.put(entityPlayer.getUniqueID(), postFireEvent.getFireDelay());
	}
	
	public void onGunSwitchMode(EntityPlayer entityPlayer, World world, ItemStack gunStack, ItemGun itemGun, WeaponFireMode fireMode)
	{	
		GunType.setFireMode(gunStack, fireMode);
		
		GunType gunType = itemGun.type;
		if(WeaponSoundType.ModeSwitch != null) 
		{
			gunType.playSound(entityPlayer, WeaponSoundType.ModeSwitch, gunStack);	
		}
	}
	/**
	 * If the player is on a shoot cooldown
	 * @param entityPlayer
	 * @return shoot cooldown
	 */
	public static boolean isOnShootCooldown(EntityPlayer entityPlayer)
	{
		return ServerTickHandler.playerShootCooldown.containsKey(entityPlayer.getUniqueID());
	}
	
	/**
	 * If the player is on a reload cooldown
	 * @param entityPlayer
	 * @return reload cooldown
	 */
	public static boolean isReloading(EntityPlayer entityPlayer)
	{
		return ServerTickHandler.playerReloadCooldown.containsKey(entityPlayer.getUniqueID());
	}
	
	public static boolean hasAmmoLoaded(ItemStack gunStack)
	{
		return !(gunStack.getItem() instanceof ItemAir) ? gunStack.hasTagCompound() ? gunStack.getTagCompound().hasKey("ammo") ? gunStack.getTagCompound().getTag("ammo") != null : false : false : false;
	}
	
	public static int getMagazineBullets(ItemStack gunStack)
	{
		if(hasAmmoLoaded(gunStack))
		{
			ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
			ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
			if(ammoStack.getTagCompound() != null)
			{
				String key = itemAmmo.type.magazineCount != null ? "ammocount" + ammoStack.getTagCompound().getInteger("magcount") : "ammocount";
				int ammoCount = ammoStack.getTagCompound().getInteger(key);
				return ammoCount;
			}
		}
		return 0;
	}
	
	public static boolean hasNextShot(ItemStack gunStack)
	{
		if(hasAmmoLoaded(gunStack))
		{
			ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
			ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
			if(ammoStack.getTagCompound() != null)
			{
				String key = itemAmmo.type.magazineCount != null ? "ammocount" + ammoStack.getTagCompound().getInteger("magcount") : "ammocount";
				int ammoCount = ammoStack.getTagCompound().getInteger(key) - 1;
				return ammoCount >= 0;
			}
		} else if(gunStack.getTagCompound() != null && gunStack.getTagCompound().hasKey("ammocount"))
		{
			return gunStack.getTagCompound().getInteger("ammocount") > 0;
		}
		return false;
	}
	
	public static void consumeShot(ItemStack gunStack)
	{
		if(hasAmmoLoaded(gunStack))
		{
			ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
			ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
			if(ammoStack.getTagCompound() != null)
			{
				NBTTagCompound nbtTagCompound = ammoStack.getTagCompound();
				String key = itemAmmo.type.magazineCount != null ? "ammocount" + nbtTagCompound.getInteger("magcount") : "ammocount";
				nbtTagCompound.setInteger(key, nbtTagCompound.getInteger(key) - 1);
				gunStack.getTagCompound().setTag("ammo", ammoStack.writeToNBT(new NBTTagCompound()));
			}
		 }else if(gunStack.getTagCompound() != null && gunStack.getTagCompound().hasKey("ammocount"))
		{
			int ammoCount = gunStack.getTagCompound().getInteger("ammocount");
			gunStack.getTagCompound().setInteger("ammocount", ammoCount-1);
		}
	}
	
	public static ItemBullet getUsedBullet(ItemStack gunStack, GunType gunType)
	{
		if(gunType.acceptedAmmo != null)
			return ItemAmmo.getUsedBullet(gunStack);
		else if(gunType.acceptedBullets != null)
		{
			if(gunStack.hasTagCompound() && gunStack.getTagCompound().hasKey("bullet"))
			{
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
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	GunType gunType = ((ItemGun) stack.getItem()).type;
    	
    	if(gunType == null)
    		return;
    	
    	
    	if(hasAmmoLoaded(stack))
    	{
    		ItemStack ammoStack = new ItemStack(stack.getTagCompound().getCompoundTag("ammo"));
			ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
			
			if(itemAmmo.type.magazineCount == null)
			{
				int currentAmmoCount = 0;
		    	if(ammoStack.getTagCompound() != null)
		    	{
		    		NBTTagCompound tag = ammoStack.getTagCompound();
		    		currentAmmoCount = tag.hasKey("ammocount") ? tag.getInteger("ammocount") : 0;
		    	}
		    	
	        	tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(currentAmmoCount), Integer.toString(itemAmmo.type.ammoCapacity)));
			} else
			{
				if(stack.getTagCompound() != null)
	        	{
					if(gunType.acceptedBullets != null)
					{
						int ammoCount = stack.getTagCompound().hasKey("ammocount") ? stack.getTagCompound().getInteger("ammocount") : 0;
			        	tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(ammoCount), Integer.toString(gunType.internalAmmoStorage)));
					}
					
	    			String baseDisplayLine = "Ammo %s: %g%s%dg/%g%s";
	            	baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
	            	baseDisplayLine = baseDisplayLine.replaceAll("%dg", TextFormatting.DARK_GRAY.toString());
	            	
	            	for(int i = 1; i < itemAmmo.type.magazineCount+1; i++)
	    			{
	            		NBTTagCompound tag = ammoStack.getTagCompound();
	            		String displayLine = baseDisplayLine.replaceAll("%g", i == tag.getInteger("magcount") ? TextFormatting.YELLOW.toString() : TextFormatting.GRAY.toString());
	                	tooltip.add(String.format(displayLine, i, tag.getInteger("ammocount" + i), itemAmmo.type.ammoCapacity));
	    			}
	        	} 
			}
    	}
    	
    	if(stack.getTagCompound() != null)
    	{
			if(gunType.acceptedBullets != null)
			{
				int ammoCount = stack.getTagCompound().hasKey("ammocount") ? stack.getTagCompound().getInteger("ammocount") : 0;
	        	tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(ammoCount), Integer.toString(gunType.internalAmmoStorage)));
			}
    	}
    	
    	if(ItemAmmo.getUsedBullet(stack) != null)
    	{
    		ItemBullet itemBullet = ItemAmmo.getUsedBullet(stack);
        	tooltip.add(generateLoreLine("Bullet", itemBullet.type.displayName));
    	}
    	
    	String baseDisplayLine = "%bFire Mode: %g%s";
    	baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
    	baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
		tooltip.add(String.format(baseDisplayLine, GunType.getFireMode(stack) != null ? GunType.getFireMode(stack) : gunType.fireModes[0]));
    }
	
	@Override
    public boolean getShareTag()
    {
        return true;
    }
	
	@Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 0;
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return isAiming ? EnumAction.BOW : EnumAction.BOW;
    }
	
	@Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
    {
        return true;
    }
	
	@Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged)
    {
		modelScale = type.model.modelScale;
    	boolean result = !oldStack.equals(newStack);
    	if(result)
    	{
    		// TODO: Requip animation
    	}
        return result; 
    }
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
	{
		World world = player.world;
		if(!world.isRemote)
		{
			// Client will still render block break if player is in creative so update block state
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
		}
		return true;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState state, ItemStack stack)
	{
		return false;
	}
	
	@Override
	public boolean canItemEditBlocks()
	{
		return false;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		return true;
	}

}