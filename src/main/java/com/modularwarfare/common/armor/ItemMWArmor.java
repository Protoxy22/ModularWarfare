package com.modularwarfare.common.armor;

import javax.annotation.Nullable;

import com.modularwarfare.ModConfig;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.guns.AttachmentEnum;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAttachment;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMWArmor extends ItemArmor {

	public ArmorType type;
	public BaseType baseType;
	public String internalName;
	
	public ItemMWArmor(ArmorType type, EntityEquipmentSlot slot) {
		super(ItemArmor.ArmorMaterial.LEATHER, 0, slot);
		type.initializeArmor(slot);
		type.loadExtraValues();
		internalName = type.armorInfoMap.get(slot.getName()).internalName;
		setUnlocalizedName(internalName);
		setRegistryName(internalName);
		setCreativeTab(ModularWarfare.MOD_TAB);
		this.baseType = type;
		this.type = type;
	}
	
	public void setType(BaseType type)
	{
		this.type = (ArmorType) type;
	}
	
	@Override
    public void onUpdate(ItemStack unused, World world, Entity holdingEntity, int intI, boolean flag)
    {
		if(holdingEntity instanceof EntityPlayer)
		{
			EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;

			if(unused!= null && unused.getItem() instanceof ItemMWArmor)
			{				
				if(unused.getTagCompound() == null)
				{
					NBTTagCompound nbtTagCompound = new NBTTagCompound();
					nbtTagCompound.setInteger("skinId", 0);
					unused.setTagCompound(nbtTagCompound);
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String armourType)
	{
		int skinId = stack.getTagCompound().getInteger("skinId");
		String path = skinId > 0 ? "skins/" + type.modelSkins[skinId].getSkin() : type.modelSkins[0].getSkin();
		return ModularWarfare.MOD_ID + ":skins/" + (ModConfig.INSTANCE.detailedSkins ? "hd" : "default") + "/armor/" + path + ".png";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemMWArmor)
			{
				ArmorType armorType = ((ItemMWArmor)stack.getItem()).type;
				ModelArmor armorModel = (ModelArmor) armorType.bipedModel;
				armorModel.showHead(slot == EntityEquipmentSlot.HEAD);
				armorModel.showChest(slot == EntityEquipmentSlot.CHEST);
				armorModel.showLegs(slot == EntityEquipmentSlot.LEGS);
				armorModel.showFeet(slot == EntityEquipmentSlot.FEET);
				
				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;
				
				return armorModel;
			}
		}
		return null;
	}

}
