package com.modularwarfare.client.layers;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.ArmorApi;
import com.modularwarfare.client.model.ModelArmor;
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
public class MWLayerHead implements LayerRenderer<EntityPlayer>
{
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    
    public MWLayerHead(final RenderPlayer renderer, final ModelRenderer modelRenderer) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
    }
    
    public void doRenderLayer(final EntityPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final int[] slots = new int[] { 0, 4, 3 };
        for (final int slot : slots) {
            final ItemStack itemStack = ArmorApi.getArmorInSlot(player, slot);
            if (!itemStack.isEmpty() && itemStack.getItem() instanceof ItemSpecialArmor) {
                this.renderHead(player, ((ItemSpecialArmor)itemStack.getItem()).type, scale);
            }
        }
        final ItemStack hat = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (!hat.isEmpty() && hat.getItem() instanceof ItemMWArmor) {
            this.renderHead(player, ((ItemMWArmor)hat.getItem()).type, scale);
        }
    }
    
    public void renderHead(final EntityPlayer player, final ArmorType armorType, final float scale) {
        if (armorType.hasModel()) {
            final ModelArmor armorModel = (ModelArmor)armorType.bipedModel;
            GlStateManager.pushMatrix();
            if (player.isSneaking()) {
                GlStateManager.translate(0.0f, -0.74f, 0.0f);
            }
            this.modelRenderer.postRender(1.0f);
            GlStateManager.translate(0.0, 0.0, 0.0);
            GlStateManager.scale(1.0f, 1.0f, 1.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableRescaleNormal();
            final int skinId = 0;
            final String path = (skinId > 0) ? ("skins/" + armorType.modelSkins[skinId].getSkin()) : armorType.modelSkins[0].getSkin();
            Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armor/" + path + ".png"));
            GlStateManager.scale(1.0f, 1.0f, 1.0f);
            armorModel.renderHead(scale);
            GlStateManager.popMatrix();
        }
    }
    
    public boolean shouldCombineTextures() {
        return true;
    }
}
