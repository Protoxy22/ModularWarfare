package com.modularwarfare.client;

import java.util.HashMap;

import com.modularwarfare.ModConfig;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.AnimationUtils;
import com.modularwarfare.client.handler.ClientTickHandler;
import com.modularwarfare.client.input.KeyType;
import com.modularwarfare.common.guns.*;
import com.modularwarfare.common.network.BackWeaponsManager;
import com.modularwarfare.utility.RayUtil;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.util.glu.Project;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.model.RenderAmmo;
import com.modularwarfare.client.model.RenderAttachment;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.client.model.objects.CustomItemRenderType;
import com.modularwarfare.client.model.objects.CustomItemRenderer;
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
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientRenderHooks extends ForgeEvent {

	public static HashMap<EntityLivingBase, AnimStateMachine> weaponAnimations = new HashMap<EntityLivingBase, AnimStateMachine>();
	private Minecraft mc;
	public static CustomItemRenderer[] customRenderers = new CustomItemRenderer[4];
	private float equippedProgress = 1f, prevEquippedProgress = 1f;
	private float partialTicks;
	private static RenderItem itemRenderer = Minecraft.getMinecraft().getRenderItem();

	public static final ResourceLocation hitMarker = new ResourceLocation("modularwarfare", "textures/gui/hitmarker.png");
	public static final ResourceLocation hitMarkerHS = new ResourceLocation("modularwarfare", "textures/gui/hitmarkerhs.png");
	public static final ResourceLocation crosshair = new ResourceLocation("modularwarfare", "textures/gui/crosshair.png");
	public static final ResourceLocation reddot = new ResourceLocation("modularwarfare", "textures/gui/reddot.png");

	public static final ResourceLocation Scope2X = new ResourceLocation("modularwarfare", "textures/overlay/scope2x.png");
	public static final ResourceLocation Scope4X = new ResourceLocation("modularwarfare", "textures/overlay/scope4x.png");
	public static final ResourceLocation Scope8X = new ResourceLocation("modularwarfare", "textures/overlay/scope8x.png");
	public static final ResourceLocation Scope15X = new ResourceLocation("modularwarfare", "textures/overlay/scope15x.png");


	public static int hitMarkerTime = 0;
	public static boolean hitMarkerheadshot;

	public static boolean isAimingScope;
	public static boolean isAiming;

	public ClientRenderHooks() {
		mc = Minecraft.getMinecraft();

		customRenderers[0] = ClientProxy.gunRenderer = new RenderGun();
		customRenderers[1] = ClientProxy.ammoRenderer = new RenderAmmo();
		customRenderers[2] = ClientProxy.attachmentRenderer = new RenderAttachment();
	}

	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event) {
		switch (event.phase) {
			case START: {
				RenderGun.smoothing = event.renderTickTime;
				SetPartialTick(event.renderTickTime);
				break;
			}
			case END: {
				if (mc.player == null || mc.world == null)
					return;
				if (hitMarkerTime > 0)
					hitMarkerTime--;
				break;
			}
		}
	}


	public static void AddHitMarker(boolean headshot) {
		hitMarkerTime = 20;
		hitMarkerheadshot = headshot;
	}


	@SubscribeEvent
	public void renderItemFrame(RenderItemInFrameEvent event) {
		Item item = event.getItem().getItem();
		if (item instanceof BaseItem) {
			BaseType type = ((BaseItem) event.getItem().getItem()).baseType;
			if (type.hasModel()) {
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
	public void renderGameOverlay(RenderGameOverlayEvent.Pre event) {
		EntityPlayer player = mc.player;

		if (event.getType() == RenderGameOverlayEvent.ElementType.HOTBAR) {
			ScaledResolution scaledresolution = new ScaledResolution(mc);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			RenderPlayerAmmo(i, j);
		}
		ItemStack stack = player.getHeldItemMainhand();
		if (stack != null && stack.getItem() instanceof ItemGun) {

			switch (event.getType()) {
				case CROSSHAIRS:
					if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == Items.GOLDEN_HELMET) {
						event.setCanceled(false);
					} else {
						event.setCanceled(true);
					}
					break;
				case ALL:
					ScaledResolution scaledresolution = new ScaledResolution(mc);
					int i = scaledresolution.getScaledWidth();
					int j = scaledresolution.getScaledHeight();
					if (isAimingScope && mc.gameSettings.thirdPersonView == 0 && player.getHeldItemMainhand().getItem() instanceof ItemGun) {
						ItemGun gun = (ItemGun) player.getHeldItemMainhand().getItem();
						WeaponScopeType scopeType = gun.type.scopeType;

						if(GunType.getAttachment(stack, AttachmentEnum.Sight) != null) {
							ItemAttachment attachmentSight = (ItemAttachment) GunType.getAttachment(stack, AttachmentEnum.Sight).getItem();
							if (attachmentSight != null && attachmentSight.type.scopeType != WeaponScopeType.DEFAULT) {
								scopeType = attachmentSight.type.scopeType;
							}
						}

						switch (scopeType) {
							case DEFAULT:
								break;
							case REDDOT:
								this.mc.renderEngine.bindTexture(reddot);
								float gunRotX = ClientTickHandler.GUN_ROT_X_LAST + (ClientTickHandler.GUN_ROT_X - ClientTickHandler.GUN_ROT_X_LAST) * partialTicks;
								float gunRotY = ClientTickHandler.GUN_ROT_Y_LAST + (ClientTickHandler.GUN_ROT_Y - ClientTickHandler.GUN_ROT_Y_LAST) * partialTicks;

								if (gunRotX > -1 && gunRotX < 1 && gunRotY > -1 && gunRotY < 1) {
									GL11.glRotatef(gunRotX, 0, -1, 0);
									GL11.glRotatef(gunRotY, 0, 0, -1);
									Gui.drawModalRectWithCustomSizedTexture(i / 2, j / 2, 2.0f, 2.0f, 2, 2, 16.0f, 16.0f);
								}
								break;
							case TWO:
								drawFullScreenImage(mc, scaledresolution, Scope2X, true);
								break;
							case FOUR:
								drawFullScreenImage(mc, scaledresolution, Scope4X, true);
								break;
							case EIGHT:
								drawFullScreenImage(mc, scaledresolution, Scope8X, true);
								break;
							case FIFTEEN:
								drawFullScreenImage(mc, scaledresolution, Scope15X, true);
								break;
							default:
								break;
						}
					}
					if (ModConfig.INSTANCE.dynamicCrosshair && !isAimingScope && !isAiming && mc.gameSettings.thirdPersonView == 0 && player.getHeldItemMainhand().getItem() instanceof ItemGun) {
						final float accuracy = RayUtil.calculateAccuracyClient((ItemGun) player.getHeldItemMainhand().getItem(), player);
						int move = Math.max(0, (int) (accuracy * 3.0f));
						this.mc.renderEngine.bindTexture(crosshair);
						int xPos = i / 2;
						int yPos = j / 2;
						Gui.drawModalRectWithCustomSizedTexture(xPos, yPos, 1.0f, 1.0f, 1, 1, 16.0f, 16.0f);
						Gui.drawModalRectWithCustomSizedTexture(xPos, yPos + move, 1.0f, 1.0f, 1, 4, 16.0f, 16.0f);
						Gui.drawModalRectWithCustomSizedTexture(xPos, yPos - move - 3, 1.0f, 1.0f, 1, 4, 16.0f, 16.0f);
						Gui.drawModalRectWithCustomSizedTexture(xPos + move, yPos, 1.0f, 1.0f, 4, 1, 16.0f, 16.0f);
						Gui.drawModalRectWithCustomSizedTexture(xPos - move - 3, yPos, 1.0f, 1.0f, 4, 1, 16.0f, 16.0f);

					}
					RenderHitMarker(Tessellator.getInstance(), i, j);
				default:
					break;
			}
		}
	}



		@SubscribeEvent
	public void renderHeldItem(RenderSpecificHandEvent event) {
		EntityPlayer player = mc.player;
		ItemStack stack = event.getItemStack();

		if (stack != null && stack.getItem() instanceof BaseItem) {
			BaseType type = ((BaseItem) stack.getItem()).baseType;
			BaseItem item = ((BaseItem) stack.getItem());

			if (event.getHand() != EnumHand.MAIN_HAND) {
				event.setCanceled(true);
				return;
			}

			if (item.render3d && customRenderers[type.id] != null && type.hasModel()) {
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

				Project.gluPerspective(getFOVModifier(partialTicks), (float) mc.displayWidth / (float) mc.displayHeight, 0.0001F, farPlaneDistance * 2.0F);
				GlStateManager.matrixMode(5888);
				GlStateManager.loadIdentity();

				GlStateManager.pushMatrix();
				//hurtCameraEffect(partialTicks);

				/*if(mc.gameSettings.viewBobbing)
					setupViewBobbing(partialTicks);*/

				boolean flag = mc.getRenderViewEntity() instanceof EntityLivingBase && ((EntityLivingBase) mc.getRenderViewEntity()).isPlayerSleeping();

				if (mc.gameSettings.thirdPersonView == 0 && !flag && !mc.gameSettings.hideGUI && !mc.playerController.isSpectator()) {
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
					int i = this.mc.world.getCombinedLight(new BlockPos(entityplayersp.posX, entityplayersp.posY + (double) entityplayersp.getEyeHeight(), entityplayersp.posZ), 0);
					OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) (i & 65535), (float) (i >> 16));


					//Do hand rotations
					float f5 = entityplayersp.prevRenderArmPitch + (entityplayersp.renderArmPitch - entityplayersp.prevRenderArmPitch) * partialTicks;
					float f6 = entityplayersp.prevRenderArmYaw + (entityplayersp.renderArmYaw - entityplayersp.prevRenderArmYaw) * partialTicks;
					GlStateManager.rotate((entityplayersp.rotationPitch - f5) * 0.1F, 1.0F, 0.0F, 0.0F);
					GlStateManager.rotate((entityplayersp.rotationYaw - f6) * 0.1F, 0.0F, 1.0F, 0.0F);

					GlStateManager.enableRescaleNormal();
					GlStateManager.pushMatrix();

					//Do vanilla weapon swing
					float f7 = -0.4F * MathHelper.sin(MathHelper.sqrt(f2) * (float) Math.PI);
					float f8 = 0.2F * MathHelper.sin(MathHelper.sqrt(f2) * (float) Math.PI * 2.0F);
					float f9 = -0.2F * MathHelper.sin(f2 * (float) Math.PI);
					GlStateManager.translate(f7, f8, f9);

					GlStateManager.translate(0.56F, -0.52F, -0.71999997F);
					GlStateManager.translate(0.0F, f1 * -0.6F, 0.0F);
					GlStateManager.rotate(45.0F, 0.0F, 1.0F, 0.0F);
					float f10 = MathHelper.sin(f2 * f2 * (float) Math.PI);
					float f11 = MathHelper.sin(MathHelper.sqrt(f2) * (float) Math.PI);
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

				if (mc.gameSettings.thirdPersonView == 0 && !flag) {
					itemRenderer.renderOverlays(partialTicks);
					//hurtCameraEffect(partialTicks);
				}

				if (mc.gameSettings.viewBobbing) {
					//setupViewBobbing(partialTicks);
				}
			}
		}
	}


	public void SetPartialTick(float dT) {
		partialTicks = dT;
	}

	@SubscribeEvent
	public void renderThirdPersonWeapons(RenderLivingEvent.Pre event) {
		ModelBase mainModel = event.getRenderer().getMainModel();
		EntityLivingBase entity = event.getEntity();


		if(entity instanceof AbstractClientPlayer){

			ItemStack gun = BackWeaponsManager.INSTANCE.getItemToRender((AbstractClientPlayer) entity);
			if(gun != ItemStack.EMPTY && !gun.isEmpty())
			{
				BaseType type = ((BaseItem) gun.getItem()).baseType;
				{
					GlStateManager.pushMatrix();
					GlStateManager.translate(event.getX(), event.getY(), event.getZ());
					if (customRenderers[type.id] != null) {
						float f2 = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, partialTicks);

						GlStateManager.rotate(-f2, 0, 1, 0);
						customRenderers[type.id].renderItem(CustomItemRenderType.BACK, null, gun, mc.world, entity, partialTicks);
					}
					GlStateManager.popMatrix();
				}
			}

		}
		for (int i = 0; i < 1; i++) {
			EnumHand hand = EnumHand.values()[i];
			if (entity.getHeldItem(hand) != null && entity.getHeldItem(hand).getItem() instanceof BaseItem && mainModel instanceof ModelBiped) {
				ModelBiped biped = (ModelBiped) mainModel;

				ItemStack stack = entity.getHeldItem(hand);
				BaseType type = ((BaseItem) stack.getItem()).baseType;
				if (!type.hasModel())
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


				if (Math.abs(entity.prevRenderYawOffset - entity.renderYawOffset) > 30F)
					f2 = entity.renderYawOffset;
				if (Math.abs(entity.prevRotationYawHead - entity.rotationYawHead) > 30F)
					f3 = entity.rotationYawHead;
				f4 = f3 - f2;

				if (entity.isRiding() && entity.getRidingEntity() instanceof EntityLivingBase) {
					EntityLivingBase entitylivingbase1 = (EntityLivingBase) entity.getRidingEntity();
					f2 = this.interpolateRotation(entitylivingbase1.prevRenderYawOffset, entitylivingbase1.renderYawOffset, partialTicks);
					f4 = f3 - f2;
					f5 = MathHelper.wrapDegrees(f4);

					if (f5 < -85.0F) {
						f5 = -85.0F;
					}

					if (f5 >= 85.0F) {
						f5 = 85.0F;
					}

					f2 = f3 - f5;

					if (f5 * f5 > 2500.0F) {
						f2 += f5 * 0.2F;
					}
				}

				float f9 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
				if (Math.abs(entity.prevRotationPitch - entity.rotationPitch) > 5F)
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

				if (entity.isChild()) {
					f8 *= 3.0F;
				}

				if (f7 > 1F) {
					f7 = 1F;
				}

				GlStateManager.enableAlpha();

				if (type.id == 0) {
					if (entity instanceof EntityPlayer) {
						if (AnimationUtils.isAiming.containsKey(((EntityPlayer) entity).getName())) {
							biped.rightArmPose = ArmPose.BOW_AND_ARROW;
						} else {
							biped.rightArmPose = ArmPose.BLOCK;
							biped.leftArmPose = ArmPose.BLOCK;


						}
					} else {
						biped.rightArmPose = ArmPose.BOW_AND_ARROW;
					}
				}


				biped.setLivingAnimations(entity, f8, f7, partialTicks);
				biped.setRotationAngles(f8, f7, f5, f4, f9, 0.0625F, entity);

				//Render main hand item
				{
					GlStateManager.pushMatrix();
					if (hand == EnumHand.MAIN_HAND && customRenderers[type.id] != null) {
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

	private void RenderHitMarker(Tessellator tessellator, int i, int j) {
		if (hitMarkerTime > 0) {
			if (!hitMarkerheadshot) {
				mc.renderEngine.bindTexture(hitMarker);
			} else {
				mc.renderEngine.bindTexture(hitMarkerHS);

			}

			GlStateManager.enableAlpha();
			GlStateManager.enableBlend();
			GlStateManager.color(1.0f, 1.0f, 1.0f, Math.max((hitMarkerTime - 10.0f + partialTicks) / 10.0f, 0.0f));

			double zLevel = 0D;

			tessellator.getBuffer().begin(7, DefaultVertexFormats.POSITION_TEX);

			tessellator.getBuffer().pos(i / 2 - 4d, j / 2 + 5d, zLevel).tex(0D / 16D, 9D / 16D).endVertex();
			tessellator.getBuffer().pos(i / 2 + 5d, j / 2 + 5d, zLevel).tex(9D / 16D, 9D / 16D).endVertex();
			tessellator.getBuffer().pos(i / 2 + 5d, j / 2 - 4d, zLevel).tex(9D / 16D, 0D / 16D).endVertex();
			tessellator.getBuffer().pos(i / 2 - 4d, j / 2 - 4d, zLevel).tex(0D / 16D, 0D / 16D).endVertex();

			tessellator.draw();

			GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
			GlStateManager.disableAlpha();
			GlStateManager.disableBlend();
		}

	}

	private void RenderPlayerAmmo(int i, int j) {
		ItemStack stack = mc.player.getHeldItem(EnumHand.MAIN_HAND);
		if (stack != null && stack.getItem() instanceof ItemGun) {
			int currentAmmoCount = ItemGun.getMagazineBullets(stack);


			if (stack.getTagCompound() != null) {
				ItemStack ammoStack = new ItemStack(stack.getTagCompound().getCompoundTag("ammo"));
				if (ammoStack.getTagCompound() != null) {
					ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();

					int x = 0;
					final int top = j - 38;
					final int left = 2;
					final int right = Math.min(left + 66, i / 2 - 60);
					final int bottom = top + 22;
					Gui.drawRect(left + right-3, top, right * 2 - 18, bottom, Integer.MIN_VALUE);

					String color = TextFormatting.WHITE+"";
					if(currentAmmoCount < itemAmmo.type.ammoCapacity/6){
						color = TextFormatting.RED+"";
						mc.fontRenderer.drawStringWithShadow(String.valueOf(TextFormatting.YELLOW+ "[R]" +TextFormatting.WHITE+" Reload"), left + 120, j - 30, 0xffffff);
					}

					RenderHelper.enableGUIStandardItemLighting();
					GL11.glEnable(GL12.GL_RESCALE_NORMAL);
					OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
					drawSlotInventory(mc.fontRenderer, ammoStack, left + 67, j - 35);
					GL11.glDisable(GL12.GL_RESCALE_NORMAL);
					RenderHelper.disableStandardItemLighting();
					String s = String.valueOf(color+currentAmmoCount) + "/" + itemAmmo.type.ammoCapacity;

					mc.fontRenderer.drawStringWithShadow(String.valueOf(s), left + 83, j - 30, 0xffffff);
					x += 16 + mc.fontRenderer.getStringWidth(s);
				}
			}
		}
	}

	private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j) {
		if (itemstack == null || itemstack.isEmpty())
			return;
		itemRenderer.renderItemIntoGUI(itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, itemstack, i, j, null); //May be something other than null
	}

	private float getFOVModifier(float partialTicks) {
		Entity entity = this.mc.getRenderViewEntity();
		float f1 = 70.0F;

		if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getHealth() <= 0.0F) {
			float f2 = (float) ((EntityLivingBase) entity).deathTime + partialTicks;
			f1 /= (1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F;
		}

		IBlockState state = ActiveRenderInfo.getBlockStateAtEntityViewpoint(this.mc.world, entity, partialTicks);

		if (state.getMaterial() == Material.WATER)
			f1 = f1 * 60.0F / 70.0F;

		return f1;
	}

	private float interpolateRotation(float x, float y, float dT) {
		float f3;

		for (f3 = y - x; f3 < -180.0F; f3 += 360.0F) {
		}
		for (; f3 >= 180.0F; f3 -= 360.0F) {
		}

		return x + dT * f3;
	}

	public static AnimStateMachine getAnimMachine(EntityPlayer entityPlayer) {
		AnimStateMachine animation = null;
		if (weaponAnimations.containsKey(entityPlayer)) {
			animation = weaponAnimations.get(entityPlayer);
		} else {
			animation = new AnimStateMachine();
			weaponAnimations.put(entityPlayer, animation);
		}
		return animation;
	}

	public static void drawFullScreenImage(Minecraft minecraft, ScaledResolution resolution, ResourceLocation imageLocation, boolean transparent) {
		minecraft.getTextureManager().bindTexture(imageLocation);
		GlStateManager.color(1f, 1f, 1f);
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder buffer = tessellator.getBuffer();

		buffer.begin(7, DefaultVertexFormats.POSITION_TEX);
		buffer.pos(0, resolution.getScaledHeight(), 0).tex(0, 1).endVertex();
		buffer.pos(resolution.getScaledWidth(), resolution.getScaledHeight(), 0).tex(1, 1).endVertex();
		buffer.pos(resolution.getScaledWidth(), 0, 0).tex(1, 0).endVertex();
		buffer.pos(0, 0, 0).tex(0, 0).endVertex();

		if (transparent) {
			GlStateManager.enableAlpha();
			GlStateManager.enableBlend();
			tessellator.draw();
			GlStateManager.disableBlend();
			GlStateManager.disableAlpha();
		} else tessellator.draw();
	}
}