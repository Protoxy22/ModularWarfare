package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.TickHandlerClient;
import com.modularwarfare.common.type.BaseItem;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGun extends BaseItem {
	
	public GunType type;
	public boolean isAiming = false;
	
	public ItemGun(GunType type)
	{
		super(type);
		this.type = type;
	}
	
	@Override
    public void onUpdate(ItemStack itemStack, World world, Entity holdingEntity, int intI, boolean flag)
    {
    	if(!world.isRemote)
    	{
    		if(holdingEntity instanceof EntityPlayer)
    		{
    			EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;
    			//entityPlayer.rayTrace(p_70614_1_, p_70614_3_)
    		}
    	}
    }
	
	@Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 0;
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return isAiming ? EnumAction.bow : EnumAction.none;
    }

}