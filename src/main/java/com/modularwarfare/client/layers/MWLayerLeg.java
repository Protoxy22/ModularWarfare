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
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;


@SideOnly(Side.CLIENT)
public class MWLayerLeg implements LayerRenderer<EntityPlayer>
{
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    public ModelArmor.EnumLeg legType;
    
    public MWLayerLeg(final RenderPlayer renderer, final ModelRenderer modelRenderer, final ModelArmor.EnumLeg armType) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
        this.legType = armType;
    }
    
    public void doRenderLayer(final EntityPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final int[] slots = new int[] { 1 };
        for (final int slot : slots) {
            final ItemStack itemStack = ArmorApi.getArmorInSlot(player, slot);
            if (!itemStack.isEmpty()) {
                final ArmorType armorType = ((ItemSpecialArmor)itemStack.getItem()).type;
                if (armorType.hasModel()) {
                    final ModelArmor armorModel = (ModelArmor)armorType.bipedModel;
                    GlStateManager.pushMatrix();
                    if (player.isSneaking()) {
                        GlStateManager.translate(0.0f, 0.2f, 0.0f);
                    }
                    this.modelRenderer.postRender(scale);
                    if (this.legType == ModelArmor.EnumLeg.Left) {
                        GL11.glTranslatef(-0.12f, -0.75f, 0.0f);
                    }
                    else {
                        GL11.glTranslatef(0.115f, -0.75f, 0.0f);
                    }
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.enableRescaleNormal();
                    final int skinId = 0;
                    final String path = (skinId > 0) ? ("skins/" + armorType.modelSkins[skinId].getSkin()) : armorType.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armor/" + path + ".png"));
                    GL11.glScalef(armorModel.modelScale, armorModel.modelScale, armorModel.modelScale);
                    if (this.legType == ModelArmor.EnumLeg.Left) {
                        if(armorType.isModelOBJ) {
                            armorModel.renderLeftLeg(1.0f, true);
                        } else {
                            armorModel.renderLeftLeg(scale, false);
                        }
                    } else {
                        if(armorType.isModelOBJ) {
                            armorModel.renderRightLeg(1.0f, true);
                        } else {
                            armorModel.renderRightLeg(scale, false);
                        }                        }
                    GlStateManager.popMatrix();
                }
            }
        }
        final ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (!legs.isEmpty() && legs.getItem() instanceof ItemMWArmor) {
            final ArmorType armorType2 = ((ItemMWArmor)legs.getItem()).type;
            if (armorType2.hasModel()) {
                final ModelArmor armorModel2 = (ModelArmor)armorType2.bipedModel;
                GlStateManager.pushMatrix();
                if (player.isSneaking()) {
                    GlStateManager.translate(0.0f, 0.2f, 0.0f);
                }
                this.modelRenderer.postRender(scale);
                if (this.legType == ModelArmor.EnumLeg.Left) {
                    GL11.glTranslatef(-0.12f, -0.75f, 0.0f);
                }
                else {
                    GL11.glTranslatef(0.115f, -0.75f, 0.0f);
                }
                if (armorModel2.thirdPersonOffset != null) {
                    GL11.glTranslatef(armorModel2.thirdPersonOffset.x, armorModel2.thirdPersonOffset.y, armorModel2.thirdPersonOffset.z);
                }
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.enableRescaleNormal();
                final int skinId2 = 0;
                final String path2 = (skinId2 > 0) ? ("skins/" + armorType2.modelSkins[skinId2].getSkin()) : armorType2.modelSkins[0].getSkin();
                Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation("modularwarfare", "skins/armor/" + path2 + ".png"));
                GL11.glScalef(armorModel2.modelScale, armorModel2.modelScale, armorModel2.modelScale);
                if (this.legType == ModelArmor.EnumLeg.Left) {
                    if(armorType2.isModelOBJ) {
                        armorModel2.renderLeftLeg(1.0f, true);
                    } else {
                        armorModel2.renderLeftLeg(scale, false);
                    }
                } else {
                    if(armorType2.isModelOBJ) {
                        armorModel2.renderRightLeg(1.0f, true);
                    } else {
                        armorModel2.renderRightLeg(scale, false);
                    }                }
                GlStateManager.popMatrix();
            }
        }
        final ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        if (!chest.isEmpty() && chest.getItem() instanceof ItemMWArmor) {
            final ArmorType armorType3 = ((ItemMWArmor)chest.getItem()).type;
            if (armorType3.hasModel()) {
                final ModelArmor armorModel3 = (ModelArmor)armorType3.bipedModel;
                if (armorModel3.shouldChestRenderLegs) {
                    GlStateManager.pushMatrix();
                    if (player.isSneaking()) {
                        GlStateManager.translate(0.0f, 0.2f, 0.0f);
                    }
                    this.modelRenderer.postRender(scale);
                    if (this.legType == ModelArmor.EnumLeg.Left) {
                        GL11.glTranslatef(-0.12f, -0.75f, 0.0f);
                    }
                    else {
                        GL11.glTranslatef(0.12f, -0.75f, 0.0f);
                    }
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.enableRescaleNormal();
                    final int skinId3 = 0;
                    final String path3 = (skinId3 > 0) ? ("skins/" + armorType3.modelSkins[skinId3].getSkin()) : armorType3.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation("modularwarfare", "skins/armor/" + path3 + ".png"));
                    GL11.glScalef(1.0f, 1.0f, 1.0f);
                    if (this.legType == ModelArmor.EnumLeg.Left) {
                        if(armorType3.isModelOBJ) {
                            armorModel3.renderLeftLeg(1.0f, true);
                        } else {
                            armorModel3.renderLeftLeg(scale, false);
                        }                          }
                    else {
                        if(armorType3.isModelOBJ) {
                            armorModel3.renderRightLeg(1.0f, true);
                        } else {
                            armorModel3.renderRightLeg(scale, false);
                        }                        }
                    GlStateManager.popMatrix();
                }
            }
        }
        final ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        if (!boots.isEmpty() && boots.getItem() instanceof ItemMWArmor) {
            final ArmorType armorType4 = ((ItemMWArmor)boots.getItem()).type;
            if (armorType4.hasModel()) {
                final ModelArmor armorModel4 = (ModelArmor)armorType4.bipedModel;
                GlStateManager.pushMatrix();
                if (player.isSneaking()) {
                    GlStateManager.translate(0.0f, 0.2f, 0.0f);
                }
                this.modelRenderer.postRender(scale);
                if (this.legType == ModelArmor.EnumLeg.Left) {
                    GL11.glTranslatef(-0.12f, -0.75f, 0.0f);
                }
                else {
                    GL11.glTranslatef(0.115f, -0.75f, 0.0f);
                }
                if (armorModel4.thirdPersonOffset != null) {
                    GL11.glTranslatef(armorModel4.thirdPersonOffset.x, armorModel4.thirdPersonOffset.y, armorModel4.thirdPersonOffset.z);
                }
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.enableRescaleNormal();
                final int skinId4 = 0;
                final String path4 = (skinId4 > 0) ? ("skins/" + armorType4.modelSkins[skinId4].getSkin()) : armorType4.modelSkins[0].getSkin();
                Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation("modularwarfare", "skins/armor/" + path4 + ".png"));
                GL11.glScalef(armorModel4.modelScale, armorModel4.modelScale, armorModel4.modelScale);
                if (this.legType == ModelArmor.EnumLeg.Left) {
                    if(armorType4.isModelOBJ) {
                        armorModel4.renderLeftFoot(1.0f, true);
                    } else {
                        armorModel4.renderLeftFoot(scale, false);
                    }
                } else {
                    if(armorType4.isModelOBJ) {
                        armorModel4.renderRightFoot(1.0f, true);
                    } else {
                        armorModel4.renderRightFoot(scale, false);
                    }                }
                GlStateManager.popMatrix();
            }
        }
    }
    
    public boolean shouldCombineTextures() {
        return true;
    }
}
