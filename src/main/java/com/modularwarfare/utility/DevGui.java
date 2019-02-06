package com.modularwarfare.utility;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.ItemStack;
import scala.actors.threadpool.Arrays;

public class DevGui extends Gui
{

	
	public DevGui(Minecraft mc, ItemStack itemStack, ItemGun itemGun)
	{
    	GunType gunType = ((ItemGun) itemStack.getItem()).type;

    	if(gunType == null)
    		return;

    	boolean hasAmmo = ItemGun.hasAmmoLoaded(itemStack);

    		
		
		
		//Visual variables
		String displayName = "Display - " + gunType.displayName;
		String internalName = "Internal - " + gunType.internalName;
		String modelName = "Model - " + gunType.modelName;
		String modelScale =  "Scale - " + Float.toString(gunType.model.modelScale);
		String iconName = "Icon - " + gunType.iconName;
		String skinNames = Arrays.toString(gunType.modelSkins);
		//WeaponAnimation weaponAnimation = animationMap.get(internalName);
		String reloadAnim = ((ModelGun)gunType.model).reloadAnimation;
		String animType = "Anim - " + reloadAnim;
		
		//Gun stats
		String gunDamage = "Damage - " + Float.toString(gunType.gunDamage);
		String gunRpm = "RPM - " + Float.toString(gunType.roundsPerMin);
		String reloadTime = "Reload - " + Float.toString(gunType.reloadTime) + "ticks";
		String ammoTypes = Arrays.toString(gunType.acceptedAmmo);
		String text2 = Float.toString((float) ItemGun.modelScale);
        ScaledResolution scaled = new ScaledResolution(mc);
        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();
        
        drawCenteredString(mc.fontRenderer, internalName, (width / 2) + 180, (height / 2) - 126, Integer.parseInt("FF0000", 16));
        drawCenteredString(mc.fontRenderer, "Visual Variables;", (width / 2) + 180, (height / 2) - 118, Integer.parseInt("D2691E", 16));
		drawCenteredString(mc.fontRenderer, displayName, (width / 2) + 180, (height / 2) - 110, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, modelName, (width / 2) + 180, (height / 2) - 102, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, modelScale, (width / 2) + 180, (height / 2) - 94, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, iconName, (width / 2) + 180, (height / 2) - 86, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, skinNames, (width / 2) + 180, (height / 2) - 78, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, animType, (width / 2) + 180, (height / 2) - 70, Integer.parseInt("FFAA00", 16));
		
		
		drawCenteredString(mc.fontRenderer, gunDamage, (width / 2) + 180, (height / 2) - 36, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, gunRpm, (width / 2) + 180, (height / 2) - 44, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, reloadTime, (width / 2) + 180, (height / 2) - 52, Integer.parseInt("FFAA00", 16));
		drawCenteredString(mc.fontRenderer, ammoTypes, (width / 2) + 180, (height / 2) - 60, Integer.parseInt("FFAA00", 16));
		
    	if(hasAmmo) 
    	{
    		ItemStack ammoStack = new ItemStack(itemStack.getTagCompound().getCompoundTag("ammo"));
    		ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
    	}
	
	}

}

