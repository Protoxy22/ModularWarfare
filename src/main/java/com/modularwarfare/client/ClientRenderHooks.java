package com.modularwarfare.client;

import org.lwjgl.util.glu.Project;

import com.modularwarfare.client.model.CustomItemRenderType;
import com.modularwarfare.client.model.CustomItemRenderer;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderItemInFrameEvent;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientRenderHooks extends ForgeEvent {
	
	private Minecraft mc;
	private CustomItemRenderer[] customRenderers = new CustomItemRenderer[2];
	private float equippedProgress = 1f, prevEquippedProgress = 1f;
	
	public ClientRenderHooks()
	{
		mc = Minecraft.getMinecraft();
		
		customRenderers[0] = ClientProxy.gunRenderer = new RenderGun();
	}
	
	@SubscribeEvent
	public void renderItemFrame(RenderItemInFrameEvent event)
	{
		if(event.getItem().getItem() instanceof ItemGun)
		{
			GunType type = ((ItemGun)event.getItem().getItem()).type;
			if(type.model != null)
			{
				event.setCanceled(true);
				
				int rotation = event.getEntityItemFrame().getRotation();
				GlStateManager.rotate(-rotation * 45F, 0F, 0F, 1F);
				RenderHelper.enableStandardItemLighting();
				GlStateManager.rotate(rotation * 45F, 0F, 0F, 1F);
				GlStateManager.pushMatrix();
				float scale = 0.75F;
				GlStateManager.scale(scale, scale, scale);
				GlStateManager.translate(0.15F, -0.15F, 0F);
				customRenderers[0].renderItem(CustomItemRenderType.ENTITY, EnumHand.MAIN_HAND, event.getItem());
				GlStateManager.popMatrix();
			}
		}
	}
	
	@SubscribeEvent
	public void renderHeldItem(RenderSpecificHandEvent event)
	{
		EntityPlayer player = mc.player;
		
		ItemStack stack = event.getItemStack();
		if(stack != null && stack.getItem() instanceof BaseItem)
		{
			BaseType type = ((BaseItem)stack.getItem()).baseType;
			
			if(customRenderers[type.id] != null && type.hasModel())
			{
				//Cancel the hand render event so that we can do our own.
				event.setCanceled(true);
				
				float partialTicks = event.getPartialTicks();
				EntityRenderer renderer = mc.entityRenderer;
				float farPlaneDistance = mc.gameSettings.renderDistanceChunks * 16F;
				ItemRenderer itemRenderer = mc.getItemRenderer();
				
				GlStateManager.clear(256);
				GlStateManager.matrixMode(5889);
				GlStateManager.loadIdentity();
				
				float separation = 0.07F;
				
				Project.gluPerspective(getFOVModifier(partialTicks), (float)mc.displayWidth / (float)mc.displayHeight, 0.05F, farPlaneDistance * 2.0F);
				GlStateManager.matrixMode(5888);
				GlStateManager.loadIdentity();
				
				GlStateManager.pushMatrix();
				//hurtCameraEffect(partialTicks);
				
				/*if(mc.gameSettings.viewBobbing)
					setupViewBobbing(partialTicks);*/
				
				boolean flag = mc.getRenderViewEntity() instanceof EntityLivingBase && ((EntityLivingBase)mc.getRenderViewEntity()).isPlayerSleeping();
				
				if(mc.gameSettings.thirdPersonView == 0 && !flag && !mc.gameSettings.hideGUI && !mc.playerController.isSpectator())
				{
					renderer.enableLightmap();
					float f1 = 1.0F - (prevEquippedProgress + (equippedProgress - prevEquippedProgress) * partialTicks);
					EntityPlayerSP entityplayersp = this.mc.player;
					float f2 = entityplayersp.getSwingProgress(partialTicks);
					float f3 = entityplayersp.prevRotationPitch + (entityplayersp.rotationPitch - entityplayersp.prevRotationPitch) * partialTicks;
					float f4 = entityplayersp.prevRotationYaw + (entityplayersp.rotationYaw - entityplayersp.prevRotationYaw) * partialTicks;
					
					//Setup lighting
					GlStateManager.disableLighting();
					GlStateManager.pushMatrix();
					GlStateManager.rotate(f3, 1.0F, 0.0F, 0.0F);
					GlStateManager.rotate(f4, 0.0F, 1.0F, 0.0F);
					RenderHelper.enableStandardItemLighting();
					GlStateManager.popMatrix();
					
					//Do lighting
					int i = this.mc.world.getCombinedLight(new BlockPos(entityplayersp.posX, entityplayersp.posY + (double)entityplayersp.getEyeHeight(), entityplayersp.posZ), 0);
					OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)(i & 65535), (float)(i >> 16));
					
					//Do hand rotations
					float f5 = entityplayersp.prevRenderArmPitch + (entityplayersp.renderArmPitch - entityplayersp.prevRenderArmPitch) * partialTicks;
					float f6 = entityplayersp.prevRenderArmYaw + (entityplayersp.renderArmYaw - entityplayersp.prevRenderArmYaw) * partialTicks;
					GlStateManager.rotate((entityplayersp.rotationPitch - f5) * 0.1F, 1.0F, 0.0F, 0.0F);
					GlStateManager.rotate((entityplayersp.rotationYaw - f6) * 0.1F, 0.0F, 1.0F, 0.0F);
					
					GlStateManager.enableRescaleNormal();
					GlStateManager.pushMatrix();
					
					//Do vanilla weapon swing
					float f7 = -0.4F * MathHelper.sin(MathHelper.sqrt(f2) * (float)Math.PI);
					float f8 = 0.2F * MathHelper.sin(MathHelper.sqrt(f2) * (float)Math.PI * 2.0F);
					float f9 = -0.2F * MathHelper.sin(f2 * (float)Math.PI);
					GlStateManager.translate(f7, f8, f9);
					
					GlStateManager.translate(0.56F, -0.52F, -0.71999997F);
					GlStateManager.translate(0.0F, f1 * -0.6F, 0.0F);
					GlStateManager.rotate(45.0F, 0.0F, 1.0F, 0.0F);
					float f10 = MathHelper.sin(f2 * f2 * (float)Math.PI);
					float f11 = MathHelper.sin(MathHelper.sqrt(f2) * (float)Math.PI);
					GlStateManager.rotate(f10 * -20.0F, 0.0F, 1.0F, 0.0F);
					GlStateManager.rotate(f11 * -20.0F, 0.0F, 0.0F, 1.0F);
					GlStateManager.rotate(f11 * -80.0F, 1.0F, 0.0F, 0.0F);
					GlStateManager.scale(0.4F, 0.4F, 0.4F);
					
					//ClientProxy.gunRenderer.renderItem(CustomItemRenderType.EQUIPPED_FIRST_PERSON, stack, mc.world, mc.player);
					customRenderers[type.id].renderItem(CustomItemRenderType.EQUIPPED_FIRST_PERSON, event.getHand(), stack, mc.world, mc.player);
					
					GlStateManager.popMatrix();
					GlStateManager.disableRescaleNormal();
					RenderHelper.disableStandardItemLighting();
					renderer.disableLightmap();
				}
				
				GlStateManager.popMatrix();
				
				if(mc.gameSettings.thirdPersonView == 0 && !flag)
				{
					itemRenderer.renderOverlays(partialTicks);
					//hurtCameraEffect(partialTicks);
				}
				
				if(mc.gameSettings.viewBobbing)
				{
					//setupViewBobbing(partialTicks);
				}
			}
		}
	}
	
	private float getFOVModifier(float partialTicks)
	{
		Entity entity = this.mc.getRenderViewEntity();
		float f1 = 70.0F;
		
		if(entity instanceof EntityLivingBase && ((EntityLivingBase)entity).getHealth() <= 0.0F)
		{
			float f2 = (float)((EntityLivingBase)entity).deathTime + partialTicks;
			f1 /= (1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F;
		}
		
		IBlockState state = ActiveRenderInfo.getBlockStateAtEntityViewpoint(this.mc.world, entity, partialTicks);
		
		if(state.getMaterial() == Material.WATER)
			f1 = f1 * 60.0F / 70.0F;
		
		return f1;
	}

}
