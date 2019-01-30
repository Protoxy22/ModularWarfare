package com.modularwarfare.client.model;

import java.util.HashMap;
import java.util.UUID;

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

public class ModelArmor extends TurboBipedBase {
	
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftFootModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightFootModel = new ModelRendererTurbo[0];
	
	/** For big scopes, so that the player actually looks through them properly */
	public float renderOffset = 0F;
	
	public HashMap<UUID, ModelBiped> bipedInstances = new HashMap<UUID, ModelBiped>();
	
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		GL11.glPushMatrix();
		{
			GL11.glScalef(modelScale, modelScale, modelScale);
						
			for(ModelRendererTurbo model : leftArmModel)
				if(model != null)
					bipedLeftArm.addChild(model);
			
			for(ModelRendererTurbo model : rightArmModel)
				if(model != null)
					bipedRightArm.addChild(model);
			
			for(ModelRendererTurbo model : headModel)
				if(model != null)
					bipedHead.addChild(model);
						
	        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
	        
	        if(isSneak)
			{
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
	        
			render(headModel, bipedHead, scale, modelScale);
			render(bodyModel, bipedBody, scale, modelScale);
			render(leftArmModel, bipedLeftArm, scale, modelScale);
			render(rightArmModel, bipedRightArm, scale, modelScale);
			render(leftLegModel, bipedLeftLeg, scale, modelScale);
			render(rightLegModel, bipedRightLeg, scale, modelScale);
		}
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
			mod.rotationPointX = bodyPart.rotationPointX;
			mod.rotationPointY = bodyPart.rotationPointY;
			mod.rotationPointZ = bodyPart.rotationPointZ;
		}
	}
	
	public void showHead(boolean result)
	{
		for(ModelRendererTurbo model : headModel)
			if(model != null)
				model.showModel = result;
	}
	
	public void showChest(boolean result)
	{
		for(ModelRendererTurbo model : bodyModel)
			if(model != null)
				model.showModel = result;
		
		for(ModelRendererTurbo model : leftArmModel)
			if(model != null)
				model.showModel = result;
		
		for(ModelRendererTurbo model : rightArmModel)
			if(model != null)
				model.showModel = result;
	}
	
	public void showLegs(boolean result)
	{
		for(ModelRendererTurbo model : leftLegModel)
			if(model != null)
				model.showModel = result;
		
		for(ModelRendererTurbo model : rightLegModel)
			if(model != null)
				model.showModel = result;
	}
	
	public void showFeet(boolean result)
	{
		for(ModelRendererTurbo model : leftFootModel)
			if(model != null)
				model.showModel = result;
		
		for(ModelRendererTurbo model : rightLegModel)
			if(model != null)
				model.showModel = result;
	}
	
	@Override
	public void flipAll()
	{
		flip(headModel);
		flip(bodyModel);
		flip(leftArmModel);
		flip(rightArmModel);
		flip(leftLegModel);
		flip(rightLegModel);
		flip(leftFootModel);
		flip(rightFootModel);
	}
	
	@Override
	public void translateAll(float x, float y, float z) {
		translate(headModel, x , y, z);
		translate(bodyModel, x , y, z);
		translate(leftArmModel, x , y, z);
		translate(rightArmModel, x , y, z);
		translate(leftLegModel, x , y, z);
		translate(rightLegModel, x , y, z);
		translate(leftFootModel, x , y, z);
		translate(rightFootModel, x , y, z);
	}

}
