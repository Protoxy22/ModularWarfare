package com.modularwarfare.client.model;

import java.util.HashMap;
import java.util.UUID;

import com.modularwarfare.ModularWarfare;
import org.lwjgl.opengl.GL11;

import com.modularwarfare.client.model.objects.TurboBipedBase;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

public class ModelArmor extends TurboBipedBase
{
	public ModelRendererTurbo[] headModel;
	public ModelRendererTurbo[] bodyModel;
	public ModelRendererTurbo[] leftArmModel;
	public ModelRendererTurbo[] rightArmModel;
	public ModelRendererTurbo[] leftLegModel;
	public ModelRendererTurbo[] rightLegModel;
	public ModelRendererTurbo[] leftFootModel;
	public ModelRendererTurbo[] rightFootModel;
	public ModelRendererTurbo[] skirtFrontModel;
	public ModelRendererTurbo[] skirtRearModel;
	public boolean shouldChestRenderLegs;
	public float renderOffset;

	public ModelArmor() {
		this.headModel = new ModelRendererTurbo[0];
		this.bodyModel = new ModelRendererTurbo[0];
		this.leftArmModel = new ModelRendererTurbo[0];
		this.rightArmModel = new ModelRendererTurbo[0];
		this.leftLegModel = new ModelRendererTurbo[0];
		this.rightLegModel = new ModelRendererTurbo[0];
		this.leftFootModel = new ModelRendererTurbo[0];
		this.rightFootModel = new ModelRendererTurbo[0];
		this.skirtFrontModel = new ModelRendererTurbo[0];
		this.skirtRearModel = new ModelRendererTurbo[0];
		this.shouldChestRenderLegs = false;
		this.renderOffset = 0.0f;
	}

	public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
		GL11.glPushMatrix();
		GL11.glScalef(this.modelScale, this.modelScale, this.modelScale);
		for (final ModelRendererTurbo model : this.leftArmModel) {
			if (model != null) {
				this.bipedLeftArm.addChild(model);
			}
		}
		for (final ModelRendererTurbo model : this.rightArmModel) {
			if (model != null) {
				this.bipedRightArm.addChild(model);
			}
		}
		for (final ModelRendererTurbo model : this.headModel) {
			if (model != null) {
				this.bipedHead.addChild(model);
			}
		}
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		if (this.isSneak) {
			GlStateManager.translate(0.0f, 0.2f, 0.0f);
		}
		this.render(this.headModel, this.bipedHead, scale, this.modelScale);
		this.render(this.bodyModel, this.bipedBody, scale, this.modelScale);
		this.render(this.leftArmModel, this.bipedLeftArm, scale, this.modelScale);
		this.render(this.rightArmModel, this.bipedRightArm, scale, this.modelScale);
		this.render(this.skirtFrontModel, this.bipedLeftLeg, scale, this.modelScale);
		this.render(this.skirtRearModel, this.bipedRightLeg, scale, this.modelScale);
		this.render(this.leftLegModel, this.bipedLeftLeg, scale, this.modelScale);
		this.render(this.rightLegModel, this.bipedRightLeg, scale, this.modelScale);
		this.render(this.leftFootModel, this.bipedLeftLeg, scale, this.modelScale);
		this.render(this.rightFootModel, this.bipedRightLeg, scale, this.modelScale);
		GL11.glPopMatrix();
	}

	public void render(final ModelRendererTurbo[] models, final ModelRenderer bodyPart, final float f5, final float scale) {
		this.setBodyPart(models, bodyPart, scale);
		for (final ModelRendererTurbo mod : models) {
			mod.rotateAngleX = bodyPart.rotateAngleX;
			mod.rotateAngleY = bodyPart.rotateAngleY;
			mod.rotateAngleZ = bodyPart.rotateAngleZ;
			mod.render(f5);
		}
	}

	public void setBodyPart(final ModelRendererTurbo[] models, final ModelRenderer bodyPart, final float scale) {
		for (final ModelRendererTurbo mod : models) {
			mod.rotationPointX = bodyPart.rotationPointX;
			mod.rotationPointY = bodyPart.rotationPointY;
			mod.rotationPointZ = bodyPart.rotationPointZ;
		}
	}

	public void renderAll(final float scale) {
		this.render(this.headModel, this.bipedHead, scale, this.modelScale);
		this.render(this.bodyModel, this.bipedBody, scale, this.modelScale);
		this.render(this.leftArmModel, this.bipedLeftArm, scale, this.modelScale);
		this.render(this.rightArmModel, this.bipedRightArm, scale, this.modelScale);
		this.render(this.leftLegModel, this.bipedLeftLeg, scale, this.modelScale);
		this.render(this.rightLegModel, this.bipedRightLeg, scale, this.modelScale);
		this.render(this.leftFootModel, this.bipedLeftLeg, scale, this.modelScale);
		this.render(this.rightFootModel, this.bipedRightLeg, scale, this.modelScale);
	}

	public void renderHead(final float scale) {
		this.render(this.headModel, this.bipedHead, scale, this.modelScale);
	}

	public void renderChest(final float scale) {
		this.render(this.bodyModel, this.bipedBody, scale, this.modelScale);
	}

	public void renderLeftLeg(final float scale) {
		this.render(this.leftLegModel, this.bipedLeftLeg, scale, this.modelScale);
	}

	public void renderRightLeg(final float scale) {
		this.render(this.rightLegModel, this.bipedRightLeg, scale, this.modelScale);
	}

	public void renderLeftFoot(final float scale) {
		this.render(this.leftFootModel, this.bipedLeftLeg, scale, this.modelScale);
	}

	public void renderRightFoot(final float scale) {
		this.render(this.rightFootModel, this.bipedRightLeg, scale, this.modelScale);
	}

	public void renderLeftArm(final float scale) {
		this.render(this.leftArmModel, this.bipedLeftArm, scale, this.modelScale);
	}

	public void renderRightArm(final float scale) {
		this.render(this.rightArmModel, this.bipedRightArm, scale, this.modelScale);
	}

	public void showHead(final boolean result) {
		this.showGroup(this.headModel, result);
	}

	public void showChest(final boolean result) {
		this.showGroup(this.bodyModel, result);
		this.showGroup(this.leftArmModel, result);
		this.showGroup(this.rightArmModel, result);
		this.showGroup(this.skirtFrontModel, result);
		this.showGroup(this.skirtRearModel, result);
	}

	public void showLegs(final boolean result) {
		this.showGroup(this.leftLegModel, result);
		this.showGroup(this.rightLegModel, result);
	}

	public void showFeet(final boolean result) {
		this.showGroup(this.leftFootModel, result);
		this.showGroup(this.rightFootModel, result);
	}

	public void showGroup(final ModelRendererTurbo[] modelGroup, final boolean result) {
		for (final ModelRendererTurbo model : modelGroup) {
			if (model != null) {
				model.showModel = result;
			}
		}
	}

	@Override
	public void flipAll() {
		this.flip(this.headModel);
		this.flip(this.bodyModel);
		this.flip(this.leftArmModel);
		this.flip(this.rightArmModel);
		this.flip(this.leftLegModel);
		this.flip(this.rightLegModel);
		this.flip(this.leftFootModel);
		this.flip(this.rightFootModel);
	}

	@Override
	public void translateAll(final float x, final float y, final float z) {
		this.translate(this.headModel, x, y, z);
		this.translate(this.bodyModel, x, y, z);
		this.translate(this.leftArmModel, x, y, z);
		this.translate(this.rightArmModel, x, y, z);
		this.translate(this.leftLegModel, x, y, z);
		this.translate(this.rightLegModel, x, y, z);
		this.translate(this.leftFootModel, x, y, z);
		this.translate(this.rightFootModel, x, y, z);
	}

	public enum EnumLeg
	{
		Left,
		Right;
	}
}
