package com.modularwarfare.client.layers;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.BaublesApi;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.model.ModelGun.EnumArm;
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
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MWLayerArm implements LayerRenderer<EntityPlayer> {
    
    private final ModelRenderer modelRenderer;
    private final RenderPlayer renderer;
        
    public EnumArm armType;
    
    public MWLayerArm(RenderPlayer renderer, ModelRenderer modelRenderer, EnumArm armType) {
        this.modelRenderer = modelRenderer;
        this.renderer = renderer;
        this.armType = armType;
    }

    @Override
    public void doRenderLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	int[] slots = {1, 2, 6, 3};
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
                            GlStateManager.translate(0.0f, 0.2f, 0.0f);
                        }
                        this.renderer.getMainModel().postRenderArm(0.0625f, armType == EnumArm.Left ? EnumHandSide.LEFT : EnumHandSide.RIGHT);
                        
                        if(armType == EnumArm.Left)
                     	   GL11.glTranslatef(-0.31f, -0.125f, 0f);
                        else
                     	   GL11.glTranslatef(0.31f, -0.125f, 0f);
                                              
                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                        GlStateManager.enableRescaleNormal();
                    	
                        int skinId = 0;
                		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                        Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                        GL11.glScalef(1f, 1f, 1f);
                        if(armType == EnumArm.Left)
                        	armorModel.renderLeftArm(scale);
                        else
                        	armorModel.renderRightArm(scale);
                    }
                    GlStateManager.popMatrix();
    			}
    		}
    	}
    	
    	ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
    	if(!chest.isEmpty() && chest.getItem() instanceof ItemMWArmor)
    	{
    		ArmorType armorType = ((ItemMWArmor) chest.getItem()).type;
			if(armorType.hasModel())
			{
				ModelArmor armorModel = (ModelArmor) armorType.bipedModel;
                GlStateManager.pushMatrix(); 
                {
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
                	
                    int skinId = 0;
            		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                    GL11.glScalef(1f, 1f, 1f);
                    if(armType == EnumArm.Left)
                    	armorModel.renderLeftArm(scale);
                    else
                    	armorModel.renderRightArm(scale);
                }
                GlStateManager.popMatrix();
			}
    	}
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
    
}