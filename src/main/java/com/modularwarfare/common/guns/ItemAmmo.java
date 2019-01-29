package com.modularwarfare.common.guns;

import java.util.List;

import javax.annotation.Nullable;

import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAmmo extends BaseItem {
	
	public AmmoType type;
	
	public ItemAmmo(AmmoType type)
	{
		super(type);
		this.type = type;
		this.setMaxStackSize(type.maxStackSize);
		this.setMaxDamage(type.ammoCapacity);
	}
	
	@Override
	public void setType(BaseType type)
	{
		this.type = (AmmoType) type;
	}
	
	@Override
	public void onUpdate(ItemStack heldStack, World world, Entity holdingEntity, int intI, boolean flag)
    {
		if(heldStack.getTagCompound() == null && !world.isRemote)
		{
			ItemAmmo itemAmmo = (ItemAmmo) heldStack.getItem();
			NBTTagCompound nbtTagCompound = new NBTTagCompound();
			nbtTagCompound.setInteger("ammocount", itemAmmo.type.ammoCapacity);
			nbtTagCompound.setInteger("skinId", 0);
			if(itemAmmo.type.magazineCount != null)
			{
				nbtTagCompound.setInteger("magcount", 1);
				for(int i = 1; i < itemAmmo.type.magazineCount+1; i++)
				{
					nbtTagCompound.setInteger("ammocount" + i, itemAmmo.type.ammoCapacity);
				}
			}
			heldStack.setTagCompound(nbtTagCompound);
		}
    }
	
	/**
	 * Minecraft Overrides
	 */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {	    	
    	if(type.magazineCount == null)
    	{
        	int currentAmmoCount = 0;
    		
    		if(stack.getTagCompound() != null)
        	{
        		NBTTagCompound tag = stack.getTagCompound();
        		currentAmmoCount = tag.hasKey("ammocount") ? tag.getInteger("ammocount") : 0;
        	} else
        	{
        		currentAmmoCount = type.ammoCapacity;
        	}
        		
        	String baseDisplayLine = "%bAmmo: %g%s%dg/%g%s";
        	baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
        	baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
        	baseDisplayLine = baseDisplayLine.replaceAll("%dg", TextFormatting.DARK_GRAY.toString());
        	tooltip.add(String.format(baseDisplayLine, currentAmmoCount, type.ammoCapacity));
    	} else
    	{    		
    		if(stack.getTagCompound() != null)
        	{
    			String baseDisplayLine = "%bMag Ammo %s: %g%s%dg/%g%s";
            	baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
            	baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
            	baseDisplayLine = baseDisplayLine.replaceAll("%dg", TextFormatting.DARK_GRAY.toString());
            	
            	for(int i = 1; i < type.magazineCount+1; i++)
    			{
            		NBTTagCompound tag = stack.getTagCompound();
                	tooltip.add(String.format(baseDisplayLine, i, tag.getInteger("ammocount" + i), type.ammoCapacity));
    			}
        	} 
    	}
    }
    
	@Override
    public boolean getShareTag()
    {
        return true;
    }

}