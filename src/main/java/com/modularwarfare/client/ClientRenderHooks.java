package com.modularwarfare.client;

import java.util.HashMap;

import org.lwjgl.util.glu.Project;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.RenderAmmo;
import com.modularwarfare.client.model.RenderAttachment;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.client.model.objects.CustomItemRenderType;
import com.modularwarfare.client.model.objects.CustomItemRenderer;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBiped.ArmPose;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderItemInFrameEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientRenderHooks extends ForgeEvent {
	
	public static HashMap<EntityLivingBase, AnimStateMachine> gunAnimations = new HashMap<EntityLivingBase, AnimStateMachine>();
	private Minecraft mc;
	private CustomItemRenderer[] customRenderers = new CustomItemRenderer[3];
	private float equippedProgress = 1f, prevEquippedProgress = 1f;
	private float partialTicks;
	
	public ClientRenderHooks()
	{
		mc = Minecraft.getMinecraft();
		
		customRenderers[0] = ClientProxy.gunRenderer = new RenderGun();
		customRenderers[1] = ClientProxy.ammoRenderer = new RenderAmmo();
		customRenderers[2] = ClientProxy.attachmentRenderer = new RenderAttachment();
	}
	
	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event)
	{
		switch(event.phase)
		{
			case START:
			{
				RenderGun.smoothing = event.renderTickTime;
				//FlansModClient.UpdateCameraZoom(event.renderTickTime);
				SetPartialTick(event.renderTickTime);
				break;
			}
			case END:
			{
				
				break;
			}
		}
	}
	
	@SubscribeEvent
	public void renderItemFrame(RenderItemInFrameEvent event)
	{
		Item item = event.getItem().getItem();
		if(item instanceof BaseItem)
		{
			BaseType type = ((BaseItem)event.getItem().getItem()).baseType;
			if(type.hasModel())
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
				customRenderers[type.id].renderItem(CustomItemRenderType.ENTITY, EnumHand.MAIN_HAND, event.getItem());
				GlStateManager.popMatrix();
			}
		}
	}
	
	@SubscribeEvent
	public void renderGameOverlay(RenderGameOverlayEvent.Pre event)
	{
		EntityPlayer player = mc.player;
		
		ItemStack stack = player.getHeldItemMainhand();
		if(stack != null && stack.getItem() instanceof ItemGun)
		{
			switch(event.getType())
			{
			
			case CROSSHAIRS:
				if(!ModularWarfare.DEV_ENV)
				{
					event.setCanceled(true);
				} else
				{
					if(player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == Items.GOLDEN_HELMET)
					{
						event.setCanceled(false);
					} else
					{
						event.setCanceled(true);
					}
				}
				break;
			
			default:
				break;
			
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
			BaseItem item = ((BaseItem)stack.getItem());
			
			if(event.getHand() != EnumHand.MAIN_HAND)
			{
				event.setCanceled(true);
				return;
			}
			
			if(item.render3d && customRenderers[type.id] != null && type.hasModel())
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
	
	public void SetPartialTick(float dT)
	{
		partialTicks = dT;
	}
	
	@SubscribeEvent
	public void renderThirdPersonWeapons(RenderLivingEvent.Pre event)
	{
		ModelBase mainModel = event.getRenderer().getMainModel();
		EntityLivingBase entity = event.getEntity();
		
		for(int i = 0; i < 1; i++)
		{
			EnumHand hand = EnumHand.values()[i];
			if(entity.getHeldItem(hand) != null && entity.getHeldItem(hand).getItem() instanceof BaseItem && mainModel instanceof ModelBiped)
			{
				ModelBiped biped = (ModelBiped)mainModel;
				ItemStack stack = entity.getHeldItem(hand);
				BaseType type = ((BaseItem)stack.getItem()).baseType;
				if(!type.hasModel())
					return;
				
				GlStateManager.pushMatrix();
				GlStateManager.disableCull();
				mainModel.swingProgress = entity.getSwingProgress(partialTicks);
				mainModel.isRiding = entity.isRiding();
				mainModel.isChild = entity.isChild();
				
				float f2 = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, partialTicks);
				float f3 = this.interpolateRotation(entity.prevRotationYawHead, entity.rotationYawHead, partialTicks);
				float f4 = f3 - f2;
				float f5;
				
				
				if(Math.abs(entity.prevRenderYawOffset - entity.renderYawOffset) > 30F)
					f2 = entity.renderYawOffset;
				if(Math.abs(entity.prevRotationYawHead - entity.rotationYawHead) > 30F)
					f3 = entity.rotationYawHead;
				f4 = f3 - f2;
								
				if(entity.isRiding() && entity.getRidingEntity() instanceof EntityLivingBase)
				{
					EntityLivingBase entitylivingbase1 = (EntityLivingBase)entity.getRidingEntity();
					f2 = this.interpolateRotation(entitylivingbase1.prevRenderYawOffset, entitylivingbase1.renderYawOffset, partialTicks);
					f4 = f3 - f2;
					f5 = MathHelper.wrapDegrees(f4);
					
					if(f5 < -85.0F)
					{
						f5 = -85.0F;
					}
					
					if(f5 >= 85.0F)
					{
						f5 = 85.0F;
					}
					
					f2 = f3 - f5;
					
					if(f5 * f5 > 2500.0F)
					{
						f2 += f5 * 0.2F;
					}
				}
				
				float f9 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
				if(Math.abs(entity.prevRotationPitch - entity.rotationPitch) > 5F)
					f9 = entity.rotationPitch;
				GlStateManager.translate(event.getX(), event.getY(), event.getZ());
				
				f5 = entity.ticksExisted + partialTicks;
				GlStateManager.rotate(180.0F - f2, 0.0F, 1.0F, 0.0F);
				GlStateManager.enableRescaleNormal();
				GlStateManager.scale(-1.0F, -1.0F, 1.0F);
				float f6 = 0.0625F;
				GlStateManager.translate(0.0F, -1.5078125F, 0.0F);
				float f7 = entity.prevLimbSwingAmount + (entity.limbSwingAmount - entity.prevLimbSwingAmount) * partialTicks;
				float f8 = entity.limbSwing - entity.limbSwingAmount * (1.0F - partialTicks);
				
				if(entity.isChild())
				{
					f8 *= 3.0F;
				}
				
				if(f7 > 1.0F)
				{
					f7 = 1.0F;
				}
				
				GlStateManager.enableAlpha();
				
				if(type.id == 0)
					biped.rightArmPose = ArmPose.BOW_AND_ARROW;
					
				biped.setLivingAnimations(entity, f8, f7, partialTicks);
				biped.setRotationAngles(f8, f7, f5, f4, f9, 0.0625F, entity);
				
				//Render main hand item
				{
					GlStateManager.pushMatrix();
					if(hand == EnumHand.MAIN_HAND)
					{
						biped.bipedRightArm.postRender(0.0625F);
						GlStateManager.translate(-0.05F, 0.4F, 0.05F);
						customRenderers[type.id].renderItem(CustomItemRenderType.EQUIPPED, hand, stack, mc.world, entity);
					}
					GlStateManager.popMatrix();
				}
				
				GlStateManager.depthMask(true);
				GlStateManager.disableRescaleNormal();
				GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
				GlStateManager.enableTexture2D();
				GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
				GlStateManager.enableCull();
				GlStateManager.popMatrix();
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
	
	private float interpolateRotation(float x, float y, float dT)
	{
		float f3;
		
		for(f3 = y - x; f3 < -180.0F; f3 += 360.0F)
		{
		}
		for(; f3 >= 180.0F; f3 -= 360.0F)
		{
		}
		
		return x + dT * f3;
	}
	
	public static AnimStateMachine getAnimations(EntityPlayer entityPlayer)
	{
		AnimStateMachine animation = null;
		if(gunAnimations.containsKey(entityPlayer))
		{
			animation = gunAnimations.get(entityPlayer);
		} else
		{
			animation = new AnimStateMachine();
			gunAnimations.put(entityPlayer, animation);
		}
		return animation;
	}

}
