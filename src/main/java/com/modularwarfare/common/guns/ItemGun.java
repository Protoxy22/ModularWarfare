package com.modularwarfare.common.guns;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.common.network.PacketGunFire;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.objects.WeaponFireMode;
import com.modularwarfare.objects.WeaponSoundType;
import com.modularwarfare.utility.RaytraceHelper.Line;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGun extends BaseItem {
	
	public GunType type;
	public boolean isAiming = false;
	public static float modelScale = 0;
	
	public static boolean fireButtonHeld = false;
	public static boolean lastFireButtonHeld = false;
	
	public ItemGun(GunType type)
	{
		super(type);
		this.type = type;
		this.setMaxStackSize(1);
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
			}
			lastFireButtonHeld = fireButtonHeld;
		}
	}
	
	public void onUpdateServer(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, GunType gunType)
	{
		
	}
	
	public void onGunFire(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, WeaponFireMode fireMode)
	{
		GunType gunType = itemGun.type;
		
		// Can fire checks
		if(isOnShootCooldown(entityPlayer) || (!type.allowSprintFiring && entityPlayer.isSprinting()) || !itemGun.type.hasFireMode(fireMode)) 
			return;
				
		// Fire Code
		Line line = Line.fromRaytrace(entityPlayer, 200);
		List<Entity> entities = line.getEntities(world, Entity.class, false);
		for(Entity e : entities)
		{
			if(e instanceof EntityLivingBase)
			{
				EntityLivingBase targetLiving = (EntityLivingBase) e;
				if(targetLiving != entityPlayer)
				{
					// TODO: do a hacky fix to stop any damage penetration reduction for going through host player
					targetLiving.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer), (gunType.gunDamage /** * ammoType.damageMultiplier */));
				}
			}
		}
		
		// Sound
		gunType.playSound(entityPlayer, WeaponSoundType.Fire);
		
		// Fire Delay
		ServerTickHandler.playerShootCooldown.put(entityPlayer.getUniqueID(), gunType.fireTickDelay);
	}
	
	public void onGunSwitchMode(EntityPlayer entityPlayer, World world, ItemStack heldStack, ItemGun itemGun, WeaponFireMode fireMode)
	{	
		GunType.setFireMode(heldStack, fireMode);
		
		GunType gunType = itemGun.type;
		gunType.playSound(entityPlayer, WeaponSoundType.ModeSwitch);		
	}
	
	/**
	 * 
	 * @param entityPlayer
	 * @return 
	 */
	public static boolean isOnShootCooldown(EntityPlayer entityPlayer)
	{
		return ServerTickHandler.playerShootCooldown.containsKey(entityPlayer.getUniqueID());
	}
	
	/**
	 * Minecraft Overrides
	 */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	
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
		return false;
	}

}