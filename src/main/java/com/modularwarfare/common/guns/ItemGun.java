package com.modularwarfare.common.guns;

import java.util.List;

import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.RaytraceHelper.Line;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
				//If crouching, set true
				isCrouching = entityPlayer.isSneaking();
				//If running, set true
				isSprinting = entityPlayer.isSprinting();
				if(!world.isRemote)
				{
					Line line = Line.fromRaytrace(entityPlayer, 200);
					line.spawnParticles2(world, 0.1, 10, 10, 0.01, 100);
					List<Entity> entities = line.getEntities(world, Entity.class, false);
					for(Entity e : entities)
					{
						if(e instanceof EntityLiving)
						{
							EntityLiving entityLiving = (EntityLiving) e;
							entityLiving.setHealth(0f);
						}
					}
				}	
			}	
		}
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
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged)
    {
    	boolean result = !oldStack.equals(newStack);
    	if(result)
    	{
    		// RUN CODE FOR REEQUIP ANIMATION
    	}
        return result; 
    }

}