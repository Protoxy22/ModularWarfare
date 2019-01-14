package com.modularwarfare.common.guns;

import java.util.List;
import java.util.Random;

import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.RaytraceHelper.Line;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGun extends BaseItem {
	
	public GunType type;
	public boolean isAiming = false;
	public static boolean isSprinting = false;
	public static boolean isCrouching = false;
	
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
    public void onUpdate(ItemStack itemStack, World world, Entity holdingEntity, int intI, boolean flag)
    {
		if(holdingEntity instanceof EntityPlayer)
		{
			EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;

			if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
			{
				ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
				
				if(world.isRemote)
					onUpdateClient(entityPlayer, world, itemStack, itemGun);
				else
					onUpdateServer(entityPlayer, world, itemStack, itemGun);
				
				//If crouching, set true
				isCrouching = entityPlayer.isSneaking();
				//If running, set true
				isSprinting = entityPlayer.isSprinting();
			}	
		}
    }
	
	public void onUpdateClient(EntityPlayer player, World world, ItemStack itemStack, ItemGun itemGun)
	{
		
	}
	
	public void onUpdateServer(EntityPlayer player, World world, ItemStack itemStack, ItemGun itemGun)
	{
		
	}
	
	public void onGunFire(EntityPlayer player, World world, ItemStack itemStack, ItemGun itemGun)
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
		// SEMI-AUTO GUN FIRING
		World world = entityLiving.world;
		if(!world.isRemote)
		{
			if(entityLiving instanceof EntityPlayer)
			{
				EntityPlayer entityPlayer = (EntityPlayer) entityLiving;
				Line line = Line.fromRaytrace(entityPlayer, 200);
				line.spawnParticles2(world, 0.1, 10, 10, 0.01, 100);
				List<Entity> entities = line.getEntities(world, Entity.class, false);
				for(Entity e : entities)
				{
					if(e instanceof EntityLiving)
					{
						EntityLiving targetLiving = (EntityLiving) e;
						targetLiving.setHealth(0f);
					}
				}
			}
		}	
        return true;
    }
	
	@Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged)
    {
    	boolean result = !oldStack.equals(newStack);
    	if(result)
    	{
    		// RUN CODE FOR REEQUIP ANIMATION
			Random random = new Random();
			RenderGun.randomOffset = random.nextFloat() / 10;
    	}
        return result; 
    }

}