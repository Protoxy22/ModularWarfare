package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class ModelCustomArmor extends ModelBiped
{
	public float modelScale = 1f;
	
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
	public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{		
		GL11.glPushMatrix();
		GL11.glScalef(modelScale, modelScale, modelScale);
		isSneak = entity.isSneaking();
		ItemStack itemstack = ((EntityLivingBase)entity).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND);
		rightArmPose = itemstack == null || itemstack.isEmpty() ? ArmPose.EMPTY : ArmPose.ITEM;

		if(itemstack != null && !itemstack.isEmpty() && entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0)
		{
			EnumAction enumaction = itemstack.getItemUseAction();
			if(enumaction == EnumAction.BLOCK)
			{
				rightArmPose = ArmPose.BLOCK;
			}
			else if(enumaction == EnumAction.BOW)
			{
				rightArmPose = ArmPose.BOW_AND_ARROW;
			}
		}
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if(isSneak)
		{
			GlStateManager.translate(0.0F, 0.2F, 0.0F);
		}
		render(headModel, bipedHead, f5, modelScale);
		render(bodyModel, bipedBody, f5, modelScale);
		render(leftArmModel, bipedLeftArm, f5, modelScale);
		render(rightArmModel, bipedRightArm, f5, modelScale);
		render(leftLegModel, bipedLeftLeg, f5, modelScale);
		render(rightLegModel, bipedRightLeg, f5, modelScale);
		GL11.glPopMatrix();
	}
	
	public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale)
	{
		setBodyPart(models, bodyPart, scale);
		for(ModelRendererTurbo mod : models)
		{
			mod.rotateAngleX = bodyPart.rotateAngleX;
			mod.rotateAngleY = bodyPart.rotateAngleY;
			mod.rotateAngleZ = bodyPart.rotateAngleZ;
			mod.render(f5);
		}
	}
	
	public void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart, float scale)
	{
		for(ModelRendererTurbo mod : models)
		{
			mod.rotationPointX = bodyPart.rotationPointX / scale;
			mod.rotationPointY = bodyPart.rotationPointY / scale;
			mod.rotationPointZ = bodyPart.rotationPointZ / scale;
		}
	}
}