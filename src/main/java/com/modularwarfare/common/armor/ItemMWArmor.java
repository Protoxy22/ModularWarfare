package com.modularwarfare.common.armor;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMWArmor extends ItemArmor implements ISpecialArmor {
	public ArmorType type;
	public BaseType baseType;
	public String internalName;

	public ItemMWArmor(final ArmorType type, final MWArmorType armorSlot) {
		super(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.fromString(armorSlot.name().toLowerCase()));
		type.initializeArmor(armorSlot.name().toLowerCase());
		type.loadExtraValues();
		this.setUnlocalizedName(this.internalName = type.armorTypes.get(armorSlot).internalName);
		this.setRegistryName(this.internalName);
		this.setCreativeTab(ModularWarfare.MOD_TAB);
		if (type.durability != null) {
			this.setMaxDamage(type.durability);
		}
		this.baseType = type;
		this.type = type;
	}

	public void setType(final BaseType type) {
		this.type = (ArmorType)type;
	}

	public void onUpdate(final ItemStack unused, final World world, final Entity holdingEntity, final int intI, final boolean flag) {
		if (holdingEntity instanceof EntityPlayer) {
			final EntityPlayer entityPlayer = (EntityPlayer)holdingEntity;
			if (unused != null && unused.getItem() instanceof ItemMWArmor && unused.getTagCompound() == null) {
				final NBTTagCompound nbtTagCompound = new NBTTagCompound();
				nbtTagCompound.setInteger("skinId", 0);
				unused.setTagCompound(nbtTagCompound);
			}
		}
	}

	public boolean getShareTag() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		return type.bipedModel;
	}

	public String getArmorTexture(final ItemStack stack, final Entity entity, final EntityEquipmentSlot slot, final String armourType) {
		return "modularwarfare:skins/armor/blank.png";
	}

	public ISpecialArmor.ArmorProperties getProperties(final EntityLivingBase player, final ItemStack armor, final DamageSource source, final double damage, final int slot) {
		return new ISpecialArmor.ArmorProperties(1, this.type.defense, Integer.MAX_VALUE);
	}

	public int getArmorDisplay(final EntityPlayer player, final ItemStack armor, final int slot) {
		return (int)(this.type.defense * 20.0);
	}

	public void damageArmor(final EntityLivingBase entity, final ItemStack stack, final DamageSource source, final int damage, final int slot) {
		if (this.type.durability != null) {
			stack.damageItem(damage, entity);
		}
	}
}
