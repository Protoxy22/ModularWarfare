package com.modularwarfare.client.layers;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.BaublesApi;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MWLayerHead implements LayerRenderer<EntityPlayer> {
    
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
    
    public MWLayerHead(RenderPlayer renderer, ModelRenderer modelRenderer) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
    }

    @Override
    public void doRenderLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	int[] slots = {0, 4, 3};
    	for(int slot : slots)
    	{
    		ItemStack itemStack = BaublesApi.getArmorInSlot(player, slot);
    		if(!itemStack.isEmpty())
    		{
    			ArmorType armorType = ((ItemSpecialArmor) itemStack.getItem()).type;
    			if(armorType.hasModel())
    			{
    				ModelArmor armorModel = (ModelArmor) armorType.bipedModel;
                    GlStateManager.pushMatrix(); 
                    {
                    	if (player.isSneaking()) {
                            GlStateManager.translate(0.0f, -0.74f, 0.0f);
                        }
                        this.modelRenderer.postRender(1f);
                        
                        GlStateManager.translate(0.0D, 0, 0.0D);
                        GL11.glScalef(1f, 1f, 1f);
                        
                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                        GlStateManager.enableRescaleNormal();
                    	
                        int skinId = 0;
                		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                        Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                        GL11.glScalef(1f, 1f, 1f);
                        armorModel.renderHead(scale);
                    }
                    GlStateManager.popMatrix();
    			}
    		}
    	}

    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
    
}