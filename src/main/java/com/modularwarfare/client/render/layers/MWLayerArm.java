package com.modularwarfare.client.render.layers;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.model.mwp.armor.outfit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MWLayerArm implements LayerRenderer<EntityPlayer> {
    
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    
    private final outfit outfitmodel = new outfit();
    
    public EnumArm armType;
    
    public MWLayerArm(RenderPlayer renderer, ModelRenderer modelRenderer, EnumArm armType) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
        this.armType = armType;
    }

    @Override
    public void doRenderLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	if (outfitmodel == null) return;
           GlStateManager.pushMatrix();
           
           if (player.isSneaking()) {
               GlStateManager.translate(0.0f, 0.2f, 0.0f);
           }
           this.renderer.getMainModel().postRenderArm(0.0625f, armType == EnumArm.Left ? EnumHandSide.LEFT : EnumHandSide.RIGHT);
           
           if(armType == EnumArm.Left)
        	   GL11.glTranslatef(-0.31f, -0.125f, 0f);
           else
        	   GL11.glTranslatef(0.31f, -0.125f, 0f);
                                 
           GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
           GlStateManager.enableRescaleNormal();
           Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/mwp.desertcamo.png"));
           GL11.glScalef(1f, 1f, 1f);
           if(armType == EnumArm.Left)
        	   outfitmodel.renderLeftArm(scale);
           else
        	   outfitmodel.renderRightArm(scale);
           GlStateManager.popMatrix();

    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
    
}