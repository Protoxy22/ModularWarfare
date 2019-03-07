package com.modularwarfare.client.render.layers;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.mwp.armor.outfit;
import com.modularwarfare.client.model.mwp.armor.platevest;

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
public class MWLayerBody implements LayerRenderer<EntityPlayer> {
    
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    
    private final outfit outfitmodel = new outfit();
    private final platevest vestmodel = new platevest();
    
    public MWLayerBody(RenderPlayer renderer, ModelRenderer modelRenderer) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
    }

    @Override
    public void doRenderLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	if (outfitmodel == null) return;
           GlStateManager.pushMatrix();           
           
           if (player.isSneaking() && this.renderer.getMainModel().bipedBodyWear.rotationPointY == 0) {
               this.renderer.getMainModel().bipedBodyWear.rotationPointY = (float)((double)this.renderer.getMainModel().bipedBodyWear.rotationPointY + 0.2);
           }
           this.renderer.getMainModel().bipedBodyWear.postRender(1f);
           
           GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
           GlStateManager.enableRescaleNormal();
           Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/mwp.desertcamo.png"));
           GL11.glScalef(1f, 1f, 1f);
           outfitmodel.renderChest(scale);
           Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/mwp.platevest.png"));
           vestmodel.renderAll(scale);
           GlStateManager.popMatrix();

    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
    
}