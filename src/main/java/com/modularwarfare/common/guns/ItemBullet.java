package com.modularwarfare.common.guns;

import java.util.List;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBullet extends BaseItem {

	public static final Function<BulletType, ItemBullet> factory = type -> { return new ItemBullet(type); };
	public BulletType type;
	
	public ItemBullet(BulletType type) {
		super(type);
		this.type = type;
		this.render3d = false;
	}
	
	@Override
	public void setType(BaseType type)
	{
		this.type = (BulletType) type;
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		for(String key : type.bulletProperties.keySet())
		{
			tooltip.add(generateLoreHeader("Modifiers"));
			BulletProperty bulletProperty = type.bulletProperties.get(key);
			tooltip.add(generateLoreListEntry(key + " Damage", bulletProperty.bulletDamage + "x"));
			break;
		}
    }
	
}