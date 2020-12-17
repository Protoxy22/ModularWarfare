package com.modularwarfare.client.layers;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.ArmorApi;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.model.objects.CustomItemRenderType;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;

@SideOnly(Side.CLIENT)
public class MWLayerBody implements LayerRenderer<EntityPlayer>
{
    private final ModelRenderer modelRenderer;
    private RenderPlayer renderer;
    
    public MWLayerBody(final RenderPlayer renderer, final ModelRenderer modelRenderer) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
    }
    
    public void doRenderLayer(final EntityPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final int[] slots = new int[] { 1, 5, 3 };
        for (final int slot : slots) {
            final ItemStack itemStack = ArmorApi.getArmorInSlot(player, slot);
            if (!itemStack.isEmpty() && itemStack.getItem() instanceof ItemSpecialArmor) {
                this.renderBody(player, ((ItemSpecialArmor)itemStack.getItem()).type, scale);
            }
        }
        final ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        if (!chest.isEmpty() && chest.getItem() instanceof ItemMWArmor) {
            this.renderBody(player, ((ItemMWArmor)chest.getItem()).type, scale);
        }
    }

    public void renderBody(final EntityPlayer player, final ArmorType armorType, final float scale) {
        if (armorType.hasModel()) {
            final ModelArmor armorModel = (ModelArmor)armorType.bipedModel;
            GlStateManager.pushMatrix();
            if (player.isSneaking()) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            this.renderer.getMainModel().bipedBody.postRender(1.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableRescaleNormal();
            final int skinId = 0;
            String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
            Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armor/" + path + ".png"));
            GL11.glScalef(1.0f, 1.0f, 1.0f);

            if(armorType.isModelOBJ) {
                armorModel.renderChest(1.0f, true);
            } else {
                armorModel.renderChest(scale, false);
            }

            GlStateManager.popMatrix();
        }

        final ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (!legs.isEmpty() && legs.getItem() instanceof ItemMWArmor) {
            final ArmorType armorType2 = ((ItemMWArmor) legs.getItem()).type;
            if (armorType2.hasModel()) {
                final ModelArmor armorModel2 = (ModelArmor) armorType2.bipedModel;
                if (armorModel2.shouldLegsRenderChest) {
                    GlStateManager.pushMatrix();
                    if (player.isSneaking()) {
                        GlStateManager.translate(0.0f, 0.2f, 0.0f);
                    }
                    this.renderer.getMainModel().bipedBody.postRender(1.0f);
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.enableRescaleNormal();
                    final int skinId = 0;
                    String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armor/" + path + ".png"));
                    GL11.glScalef(1.0f, 1.0f, 1.0f);

                    if(armorType.isModelOBJ) {
                        armorModel2.renderChest(1.0f, true);
                    } else {
                        armorModel2.renderChest(scale, false);
                    }

                    GlStateManager.popMatrix();
                }
            }
        }

    }

    
    public boolean shouldCombineTextures() {
        return true;
    }
}
