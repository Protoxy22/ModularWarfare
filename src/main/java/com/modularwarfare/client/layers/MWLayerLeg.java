package com.modularwarfare.client.layers;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.BaublesApi;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.model.ModelArmor.EnumLeg;
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
    	int[] slots = {1};
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
                        this.modelRenderer.postRender(scale);
                        
                        if(legType == EnumLeg.Left)
                     	   GL11.glTranslatef(-0.12f, -0.75f, 0f);
                        else
                     	   GL11.glTranslatef(0.12f, -0.75f, 0f);
                        
                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                        GlStateManager.enableRescaleNormal();
                        
                        int skinId = 0;
                		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                        Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                        GL11.glScalef(1f, 1f, 1f);
                        
                        if(legType == EnumLeg.Left)
                        	armorModel.renderLeftLeg(scale);
                        else
                        	armorModel.renderRightLeg(scale);
                    }
                    GlStateManager.popMatrix();
    			}
    		}
    	}
    	
    	
    	ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
    	if(!legs.isEmpty() && legs.getItem() instanceof ItemMWArmor)
    	{
    		ArmorType armorType = ((ItemMWArmor) legs.getItem()).type;
			if(armorType.hasModel())
			{
				ModelArmor armorModel = (ModelArmor) armorType.bipedModel;
                GlStateManager.pushMatrix(); 
                {
                	if (player.isSneaking()) {
                        GlStateManager.translate(0.0f, 0.2f, 0.0f);
                    }
                    this.modelRenderer.postRender(scale);
                    
                    if(legType == EnumLeg.Left)
                 	   GL11.glTranslatef(-0.12f, -0.75f, 0f);
                    else
                 	   GL11.glTranslatef(0.12f, -0.75f, 0f);
                    
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    GlStateManager.enableRescaleNormal();
                    
                    int skinId = 0;
            		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                    GL11.glScalef(1f, 1f, 1f);
                    
                    if(legType == EnumLeg.Left)
                    	armorModel.renderLeftLeg(scale);
                    else
                    	armorModel.renderRightLeg(scale);
                }
                GlStateManager.popMatrix();
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
                    this.modelRenderer.postRender(scale);
                    
                    if(legType == EnumLeg.Left)
                 	   GL11.glTranslatef(-0.12f, -0.75f, 0f);
                    else
                 	   GL11.glTranslatef(0.12f, -0.75f, 0f);
                    
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    GlStateManager.enableRescaleNormal();
                    
                    int skinId = 0;
            		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                    GL11.glScalef(1f, 1f, 1f);
                    
                    if(legType == EnumLeg.Left)
                    	armorModel.renderLeftLeg(scale);
                    else
                    	armorModel.renderRightLeg(scale);
                }
                GlStateManager.popMatrix();
			}
    	}
    	
    	ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
    	if(!boots.isEmpty() && boots.getItem() instanceof ItemMWArmor)
    	{
    		ArmorType armorType = ((ItemMWArmor) boots.getItem()).type;
			if(armorType.hasModel())
			{
				ModelArmor armorModel = (ModelArmor) armorType.bipedModel;
                GlStateManager.pushMatrix(); 
                {
                	if (player.isSneaking()) {
                        GlStateManager.translate(0.0f, 0.2f, 0.0f);
                    }
                    this.modelRenderer.postRender(scale);
                    
                    if(legType == EnumLeg.Left)
                 	   GL11.glTranslatef(-0.25f, -0.75f, 0f);
                    else
                 	   GL11.glTranslatef(0.25f, -0.75f, 0f);
                    
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    GlStateManager.enableRescaleNormal();
                    
                    int skinId = 0;
            		String path = skinId > 0 ? "skins/" + armorType.modelSkins[skinId].getSkin() : armorType.modelSkins[0].getSkin();
                    Minecraft.getMinecraft().getRenderManager().renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/hd/armor/" + path + ".png"));
                    GL11.glScalef(1f, 1f, 1f);
                    
                    if(legType == EnumLeg.Left)
                    	armorModel.renderLeftFoot(scale);
                    else
                    	armorModel.renderRightFoot(scale);
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