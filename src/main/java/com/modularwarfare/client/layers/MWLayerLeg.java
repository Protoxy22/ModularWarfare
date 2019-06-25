package com.modularwarfare.client.layers;


import com.modularwarfare.client.model.ModelArmor.EnumLeg;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MWLayerLeg implements LayerRenderer<EntityPlayer> {
    
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
        
    public EnumLeg legType;
    
    public MWLayerLeg(RenderPlayer renderer, ModelRenderer modelRenderer, EnumLeg armType) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
        this.legType = armType;
    }

    @Override
    public void doRenderLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {

    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
    
}