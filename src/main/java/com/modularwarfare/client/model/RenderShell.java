package com.modularwarfare.client.model;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.omw.OmwModelShell;
import com.modularwarfare.common.entity.decals.EntityShell;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderShell extends Render<EntityShell> {

      public static final Factory FACTORY = new Factory();

      protected RenderShell(RenderManager renderManager) {
            super(renderManager);
            this.shadowSize = 0.0F;
      }

      @Nullable
      @Override
      protected ResourceLocation getEntityTexture(EntityShell entity) {
            return new ResourceLocation(ModularWarfare.MOD_ID, "textures/skins/shell.png");
      }

      public void doRenderShadowAndFire(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {
            if (this.renderManager.options != null) {
                  this.doRenderShell((EntityShell)entityIn, x, y, z, yaw, partialTicks);
            }

      }

      private void doRenderShell(EntityShell entityIn, double x, double y, double z, float yaw, float partialTicks) {
            OmwModelShell shell = new OmwModelShell();
            if (shell != null) {
                  bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "textures/skins/shell.png"));
                  GlStateManager.pushMatrix();
                  GlStateManager.translate((float) x, (float) y, (float) z);

                  GlStateManager.rotate(entityIn.prevRotationYaw + (entityIn.rotationYaw - entityIn.prevRotationYaw) * partialTicks,
                          0.0F, 1.0F, 0.0F);
                  GlStateManager.rotate(-entityIn.rotationPitch, 1.0F, 0.0F, 0.0F);

                  GlStateManager.scale(0.3f, 0.3f, 0.3f);

                  RenderHelper.enableStandardItemLighting();
                  GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

                  shell.render();

                  GlStateManager.enableLighting();
                  GlStateManager.popMatrix();
            }
      }

      public static class Factory implements IRenderFactory {
            public Render createRenderFor(RenderManager manager) {
                  return new RenderShell(manager);
            }
      }


}
