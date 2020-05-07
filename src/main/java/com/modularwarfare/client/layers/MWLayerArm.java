package com.modularwarfare.client.layers;

import com.modularwarfare.api.ArmorApi;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

@SideOnly(Side.CLIENT)
public class MWLayerArm implements LayerRenderer<EntityPlayer>
{
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    public ModelGun.EnumArm armType;
    
    public MWLayerArm(final RenderPlayer renderer, final ModelRenderer modelRenderer, final ModelGun.EnumArm armType) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
        this.armType = armType;
    }
    
    public void doRenderLayer(final EntityPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final int[] slots = new int[] { 1, 2, 6, 3 };
        for (final int slot : slots) {
            final ItemStack itemStack = ArmorApi.getArmorInSlot(player, slot);
            if (!itemStack.isEmpty() && itemStack.getItem() instanceof ItemSpecialArmor) {
                this.renderArm(player, ((ItemSpecialArmor)itemStack.getItem()).type, scale);
            }
        }
        final ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        if (!chest.isEmpty() && chest.getItem() instanceof ItemMWArmor) {
            this.renderArm(player, ((ItemMWArmor)chest.getItem()).type, scale);
        }
    }
    
    public void renderArm(final EntityPlayer player, final ArmorType armorType, final float scale) {
        if (armorType.hasModel()) {
            final ModelArmor armorModel = (ModelArmor)armorType.bipedModel;
            GlStateManager.pushMatrix();
            if (player.isSneaking()) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            this.renderer.getMainModel().postRenderArm(0.0625f, (this.armType == ModelGun.EnumArm.Left) ? EnumHandSide.LEFT : EnumHandSide.RIGHT);
            if (this.armType == ModelGun.EnumArm.Left) {
                GlStateManager.translate(-0.315f, -0.125f, 0.0f);
            }
            else {
                GlStateManager.translate(0.315f, -0.125f, 0.0f);
            }
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableRescaleNormal();
            final int skinId = 0;
            final String path = (skinId > 0) ? ("skins/" + armorType.modelSkins[skinId].getSkin()) : armorType.modelSkins[0].getSkin();
            Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation("modularwarfare", "skins/armor/" + path + ".png"));
            GlStateManager.scale(1.0f, 1.0f, 1.0f);
            if (this.armType == ModelGun.EnumArm.Left) {
                armorModel.renderLeftArm(scale);
            }
            else {
                armorModel.renderRightArm(scale);
            }
            GlStateManager.popMatrix();
        }
    }
    
    public boolean shouldCombineTextures() {
        return true;
    }
}
