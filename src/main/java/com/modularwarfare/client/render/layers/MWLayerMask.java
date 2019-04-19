package com.modularwarfare.client.render.layers;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.mwp.armor.facemask;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MWLayerMask implements LayerRenderer<EntityPlayer> {
    
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    
    private final facemask facemask = new facemask();
    
    public MWLayerMask(RenderPlayer renderer, ModelRenderer modelRenderer) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
    }

    @Override
    public void doRenderLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
           /*if (facemask == null) return;
           GlStateManager.pushMatrix();

           if (player.isSneaking()) {
               GlStateManager.translate(0.0f, -0.75f, 0.0f);
           }
           this.modelRenderer.postRender(1f);
           GlStateManager.translate(0.0D, 0.0D, 0.0D);
           GL11.glScalef(1f, 1f, 1f);
           
           GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
           GlStateManager.enableRescaleNormal();
           Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/mwp.mask.png"));
           facemask.renderAll(scale);
           GlStateManager.popMatrix();
           */
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
    
}