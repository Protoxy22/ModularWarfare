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
	
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	
    }
	
	@Override
    public void onUpdate(ItemStack itemStack, World world, Entity holdingEntity, int intI, boolean flag)
    {
		if(holdingEntity instanceof EntityPlayer)
		{
			EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;

			if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
			{
				ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
				
				if(world.isRemote)
					onUpdateClient(entityPlayer, world, itemStack, itemGun, itemGun.type);
				else
					onUpdateServer(entityPlayer, world, itemStack, itemGun, itemGun.type);
			}	
		}
    }
	
	public void onUpdateClient(EntityPlayer entityPlayer, World world, ItemStack itemStack, ItemGun itemGun, GunType gunType)
	{
		if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			if(fireButtonHeld && Minecraft.getMinecraft().inGameHasFocus && gunType.hasFireMode(WeaponFireMode.FULL))
			{
				ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
			} else if(fireButtonHeld & !lastFireButtonHeld && Minecraft.getMinecraft().inGameHasFocus)
			{
				ModularWarfare.NETWORK.sendToServer(new PacketGunFire());
			}
			lastFireButtonHeld = fireButtonHeld;
		}
	}
	
	public void onUpdateServer(EntityPlayer entityPlayer, World world, ItemStack itemStack, ItemGun itemGun, GunType gunType)
	{
		// Create default nbt data
		if(itemStack.getTagCompound() == null)
		{
			NBTTagCompound nbtTagCompound = new NBTTagCompound();
			nbtTagCompound.setString("firemode", gunType.fireModes[0].name());
			itemStack.setTagCompound(nbtTagCompound);
		}
	}
	
	public void onGunFire(EntityPlayer entityPlayer, World world, ItemStack itemStack, ItemGun itemGun, WeaponFireMode fireMode)
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
			if(e instanceof EntityLiving)
			{
				EntityLiving targetLiving = (EntityLiving) e;
				targetLiving.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer), (gunType.gunDamage /** * ammoType.damageMultiplier */));
			}
		}
		
		// Sound
		gunType.playSound(entityPlayer, WeaponSoundType.Fire);
		
		// Fire Delay
		ServerTickHandler.playerShootCooldown.put(entityPlayer.getUniqueID(), gunType.fireTickDelay);
	}
	
	public static boolean isOnShootCooldown(EntityPlayer entityPlayer)
	{
		return ServerTickHandler.playerShootCooldown.containsKey(entityPlayer.getUniqueID());
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
		// SEMI-AUTO GUN FIRING
		/*World world = entityLiving.world;
		if(!world.isRemote)
		{
			if(entityLiving instanceof EntityPlayer)
			{
				EntityPlayer entityPlayer = (EntityPlayer) entityLiving;
				if(stack != null && stack.getItem() instanceof ItemGun)
				{
					ItemGun itemGun = (ItemGun)stack.getItem();
					if(itemGun.type.hasFireMode(WeaponFireMode.SEMI))
					{
						onGunFire(entityPlayer, entityPlayer.world, stack, itemGun, false);
					}
				}
			}
		}*/
        return true;
    }
	
	@Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged)
    {
		modelScale = type.model.modelScale;
    	boolean result = !oldStack.equals(newStack);
    	if(result)
    	{
    		// RUN CODE FOR REEQUIP ANIMATION
			Random random = new Random();
			RenderGun.randomOffset = random.nextFloat() / 10 * modelScale;
			RenderGun.randomRotateOffset = random.nextFloat() * 5 * modelScale;
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