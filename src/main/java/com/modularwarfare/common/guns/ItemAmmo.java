package com.modularwarfare.common.guns;

import java.util.List;
import java.util.function.Function;

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

    public static final Function<AmmoType, ItemAmmo> factory = type -> { return new ItemAmmo(type); };
    public AmmoType type;

	public ItemAmmo(AmmoType type) {
		super(type);
		this.type = type;
		this.maxStackSize = type.subAmmo != null ? 1 : type.maxStackSize;
	}

	@Override
	public void setType(BaseType type) {
		this.type = (AmmoType) type;
	}

	@Override
	public void onUpdate(ItemStack heldStack, World world, Entity holdingEntity, int intI, boolean flag) {
		if (heldStack.getTagCompound() == null && !world.isRemote) {
			ItemAmmo itemAmmo = (ItemAmmo) heldStack.getItem();
			NBTTagCompound nbtTagCompound = new NBTTagCompound();
			nbtTagCompound.setInteger("ammocount", itemAmmo.type.ammoCapacity);
			nbtTagCompound.setInteger("skinId", 0);
			if (itemAmmo.type.magazineCount != null) {
				nbtTagCompound.setInteger("magcount", 1);
				for (int i = 1; i < itemAmmo.type.magazineCount + 1; i++) {
					nbtTagCompound.setInteger("ammocount" + i, itemAmmo.type.ammoCapacity);
				}
			}
			heldStack.setTagCompound(nbtTagCompound);
		}
	}

	public static boolean hasAmmo(ItemStack ammoStack) {
		if (ammoStack.getTagCompound() != null) {
			NBTTagCompound nbtTagCompound = ammoStack.getTagCompound();
			if (nbtTagCompound.hasKey("magcount")) {
				ItemAmmo itemAmmo = ((ItemAmmo) ammoStack.getItem());
				for (int i = 0; i < itemAmmo.type.magazineCount; i++) {
					if (nbtTagCompound.getInteger("ammocount" + i) > 0)
						return true;
				}
			} else {
				return nbtTagCompound.getInteger("ammocount") > 0;
			}
		}
		return false;
	}

	public static ItemBullet getUsedBullet(ItemStack gunStack) {
		if (ItemGun.hasAmmoLoaded(gunStack)) {
			ItemStack ammoStack = new ItemStack(gunStack.getTagCompound().getCompoundTag("ammo"));
			if (ammoStack.hasTagCompound() && ammoStack.getTagCompound().hasKey("bullet")) {
				ItemStack usedBullet = new ItemStack(ammoStack.getTagCompound().getCompoundTag("bullet"));
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
	public void addInformation(ItemStack ammoStack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (type.magazineCount == null) {
			int currentAmmoCount = 0;

			if (ammoStack.getTagCompound() != null) {
				NBTTagCompound tag = ammoStack.getTagCompound();
				currentAmmoCount = tag.hasKey("ammocount") ? tag.getInteger("ammocount") : 0;
			} else {
				currentAmmoCount = type.ammoCapacity;
			}

			tooltip.add(generateLoreLineAlt("Ammo", Integer.toString(currentAmmoCount), Integer.toString(type.ammoCapacity)));
		} else {
			if (ammoStack.getTagCompound() != null) {
				String baseDisplayLine = "%bMag Ammo %s: %g%s%dg/%g%s";
				baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
				baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
				baseDisplayLine = baseDisplayLine.replaceAll("%dg", TextFormatting.DARK_GRAY.toString());

				for (int i = 1; i < type.magazineCount + 1; i++) {
					NBTTagCompound tag = ammoStack.getTagCompound();
					tooltip.add(String.format(baseDisplayLine, i, tag.getInteger("ammocount" + i), type.ammoCapacity));
				}
			}
		}

		if (ammoStack.getTagCompound() != null) {
			if (ammoStack.getTagCompound().hasKey("bullet")) {
				ItemStack usedBullet = new ItemStack(ammoStack.getTagCompound().getCompoundTag("bullet"));
				ItemBullet usedBulletItem = (ItemBullet) usedBullet.getItem();
				tooltip.add(generateLoreLine("Bullet", usedBulletItem.type.displayName));
			}
		}
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

}