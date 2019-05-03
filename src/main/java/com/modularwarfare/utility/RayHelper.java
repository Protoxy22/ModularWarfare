package com.modularwarfare.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.guns.WeaponType;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RayHelper {
	
	Random rand = new Random();
	
	public float damage;
	public boolean penetrate = true;
	public float width = 0;
	public boolean fire = false;
	
	public boolean gun = false;
	public boolean gunm = false;
	public boolean shotgun = false;
	
	public EntityPlayer elP;
	
	public float dropOff;
	
	
	public ItemGun g;
		
	public RayHelper(Item item) {
		if(item != null) {
			if(item instanceof ItemGun)
			{
				Random rand = new Random();
				
				g = (ItemGun)item;
				
				damage = g.type.gunDamage;
				
				shotgun = g.type.weaponType == WeaponType.Shotgun;
				gun = true;
			}
		}
	}
	
	public Vec3d getPosition(float par1, EntityPlayer p)
    {
		//CTBPlayer data = CTBPlayer.get(p);
		//float blind = 0;//(WWIIClientTicker.sType == 2 ? 0.35F : 0);
		float diff = /*data.getStance() == 1 ? 0.42f : data.getStance() == 2 ? 0.92f :*/ 0;
		return new Vec3d(p.posX, p.posY + p.getDefaultEyeHeight() - diff, p.posZ);
    }
   
 	 public RayTraceResult rayTrace(double par1, float par3, EntityPlayer p, float recoil, float sRecoil)
     {
         Vec3d vec3 = getPosition(par3, p);
         Vec3d vec31 = getLook(par3, p, recoil, sRecoil);
         Vec3d vec32 = vec3.addVector(vec31.x * par1, vec31.y * par1, vec31.z * par1);
         return clip(vec3, vec32, p.world);
     }

 	 
 	  public Vec3d getLook(float par1, EntityPlayer p, float recoil, float sRecoil)
     {
			  float f1;
		        float f2;
		        float f3;
		        float f4;

		        float rY = p.rotationYaw - (sRecoil * 1.5F);
		        float rP = p.rotationPitch - (recoil * 1.0F);
	            f1 = MathHelper.cos(-rY * 0.017453292F - (float)Math.PI);
	            f2 = MathHelper.sin(-rY * 0.017453292F - (float)Math.PI);
	            f3 = -MathHelper.cos(-rP * 0.017453292F);
	            f4 = MathHelper.sin(-rP * 0.017453292F);
	            return new Vec3d(f2 * f3, f4, f1 * f3);
     }
 	  
 	 
 	 
    public void attack(EntityPlayer p, double range)
    {
    	this.attack(p, range, false, 0, 0);
    }
    
    public void attack(EntityPlayer p, double range, boolean bayonet)
    {
    	this.attack(p, range, bayonet, 0, 0);
    }
    
    public void attack(EntityPlayer p, double range, float recoil, float sRecoil)
    {
    	this.attack(p, range, false, recoil, sRecoil);
    }
    
    public void attack(EntityPlayer p, double range, boolean bayonet, float recoil, float sRecoil) {
    	this.attack(p, range, bayonet, recoil, sRecoil, null);
    }
    
    public boolean inWidth(Vec3d vec, Entity e, float am) {
    	return (vec.x < (e.posX) + am && vec.x > (e.posX) - am) && (vec.z < (e.posZ) + am && vec.z > (e.posZ) - am);
    }
    
	public void attack(EntityPlayer p, double range, boolean bayonet, float recoil, float sRecoil, List list2)
    {
        float par1 = 1;
		elP = p;
	
		if (p != null) {
            ArrayList l3 = new ArrayList();

        		World worldObj = p.world;
        		AxisAlignedBB boundingBox = p.getEntityBoundingBox();
                double d0 = range;
                RayTraceResult objectMouseOver;
                double d1 = d0;
                Vec3d vec3;
                
              	objectMouseOver = rayTrace(d0, par1, p, recoil, sRecoil);
            	vec3 = getPosition(par1, p);

                if (objectMouseOver != null)
                {
                    d1 = objectMouseOver.hitVec.distanceTo(vec3);
                }
                
	         

                Vec3d vec31 = getLook(par1, p, recoil, sRecoil);
                Vec3d vec32 = vec3.addVector(vec31.x * d1, (vec31.y) * d1, vec31.z * d1);
                float f1 = list2 != null ? 2 : width;
                
                List list = worldObj.getEntitiesWithinAABBExcludingEntity(p, boundingBox.grow(vec31.x * d0, vec31.y * d0, vec31.z * d0).expand(f1, f1, f1));
                double d2 = d1;
             
                float cDamage = 0;
                for (int i = list.size() - 1; i >= 0; --i) {
                    Entity entity = (Entity)list.get(i);
                  
                    if((entity instanceof EntityLivingBase && !entity.isDead && ((EntityLivingBase)entity).deathTime <= 0 && ((EntityLivingBase)entity).getHealth() > 0)) {
		                    if (entity.canBeCollidedWith()) {
		                    	boolean changed = false;
		                    	boolean safe = false;
		                    	
		                    	NonDumbAxisABB box = new NonDumbAxisABB(entity.getEntityBoundingBox());
		                    	
		                        if((entity.height == 1.8F || entity.height == 1.9F) && entity.width == 0.6F) {
		                        	box.maxY += 0.2F;
		                        	changed = true;
		                        } else {
		                        	changed = false;
		                        }
		                        
		                        if(list2 != null) {
		                        	box.maxY += f1;
		                        	box.minY -= f1;
		                        }
		                        
		                        box.maxZ += f1;
		                        box.maxX += f1;
		                        box.minZ -= f1;
		                        box.minX -= f1;
		                        float f2 = entity.getCollisionBorderSize();
		                        AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand(f2, f2, f2);
		                        RayTraceResult movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);              
		                        
	                        	
		                        float kaif = 0.3F;
		                        box.maxZ -= kaif;
		                        box.maxX -= kaif;
		                        box.minZ += kaif;
		                        box.minX += kaif;
		                        
		                        boolean inWidth = false;
		                        boolean inWidth2 = false;
		                        
		                        
	                            float f3 = entity.getCollisionBorderSize();
		                        AxisAlignedBB axisalignedbb2 = entity.getEntityBoundingBox().expand(f3, f3, f3);
		                        RayTraceResult movingobjectposition2 = axisalignedbb2.calculateIntercept(vec3, vec32);
		                        inWidth = movingobjectposition2 != null;
		                        
		                        box.maxZ += kaif;
		                        box.maxX += kaif;
		                        box.minZ -= kaif;
		                        box.minX -= kaif;
			                     
		                        box.maxZ -= f1;
		                        box.maxX -= f1;
		                        box.minZ += f1;
		                        box.minX += f1;
		                        
	                        	if(list2 != null) {
	                        		box.maxY -= f1;
	                        		box.minY += f1;
		                        }
		                        if(changed) {
		                        	box.maxY -= 0.2F;
			                    }
		                        
		                        entity.setEntityBoundingBox(box.toAxisAlignedBB());
		                        
		                        if (axisalignedbb.contains(vec3))
		                        {
		                            if (0.0D < d2 || d2 == 0.0D)
		                            {
	                                    safe = true;
		                                d2 = 0.0D;
		                            }
		                        }
		                        else if (movingobjectposition != null) {
		                            double d3 = vec3.distanceTo(movingobjectposition.hitVec);
		                           
		                            if (d3 < d2 || d2 == 0.0D)
		                            {
		                                if (entity == p.getRidingEntity() && !entity.canRiderInteract())
		                                {
		                                    if (d2 == 0.0D)
		                                    {
			                                    safe = true;
		                                    }
		                                }
		                                else
		                                {
		                                    safe = true;
		                                    d2 = d3;
		                                }
		                            }       
		                        }
		                        
		                        if(!safe || (p != null  && p.isRidingOrBeingRiddenBy(entity))) {
		                        	entity = null;
		                        }
		                        
		                        if(entity == null /*|| (entity.ridingEntity != null && !(entity.ridingEntity instanceof EntityAnimal))*/ || (!(entity instanceof EntityLivingBase)) /*&& !(entity instanceof EntityGrenade) && !(entity instanceof EntityParachute))*/ || movingobjectposition == null) {
			                    	continue;
			                    }
		                        
		                        if(list2 != null && p != null) {
		                        	if(!list2.contains(entity) && entity instanceof EntityPlayer && !shotgun) {
		                        		//CTB.ctbChannel.sendTo(new PacketGunClient(((EntityPlayer)entity), 2), (EntityPlayerMP)((EntityPlayer)entity));
		                         	}
		                        	continue;
		                        }
		                        
		                        
		                        if(entity != null && movingobjectposition != null) {
			                        l3.add(entity);
		                        	float damage = (this.damage);
		                        	float dist = (int)(Math.abs(p.posX - entity.posX) + Math.abs(p.posY - entity.posY) + Math.abs(p.posZ - entity.posZ));
		                        	float pen = 1;
		                        	
//		                        	if(g != null) {
//		                        		float[][] dmg = CTBDataHandler.realismMode ? g.stats.damage : g.stats.balDamage;
//		                        		if(CTBDataHandler.realismMode) {
//			                        		damage = dmg[0][0];
//			                        		
//			                        		pen = dmg[0][1];
//			                        		if(dist < dmg[1][2]) {
//			                        			float dm = dist / dmg[1][2];
//			                        			damage -= (damage - dmg[1][0]) * dm;
//			                        			pen += (dmg[1][1] - pen) * dm;
//			                        		} else if(dist < dmg[2][2]) {
//			                        			damage -= (damage - dmg[1][0]);
//			                        			
//			                        			pen += (dmg[1][1] - pen);
//			                        			
//			                        			float dm = ((dist - dmg[1][2]) / ((dmg[2][2] - dmg[1][2])));
//			                        			damage -= (damage - dmg[2][0]) * dm;
//			                        			
//			                        			pen += (dmg[2][1] - pen) * dm;
//			                        		} else {
//			                        			damage = dmg[2][0];
//			                        		}
//			                        		//damage -= ((stats.damage * dist * dist)) / 30;
//		                        		}
//		                       		}
		                        
		                        	float d = 0.0F;
		                        		if((entity.height == 1.8F || entity.height == 1.9F) && entity.width == 0.6F /*&& !(entity instanceof EntityParachute)*/) {
		                        			if("342".equals("a") /*entity instanceof EntityCTBZombie && CTBDataHandler.zombieReal*/) {
//		                        				EntityCTBZombie zom = (EntityCTBZombie)entity;
//		                        				if(movingobjectposition.hitVec.y > entity.posY + 1.38F) {
//		                        					if(zom.getEquipmentInSlot(4) != null && zom.getEquipmentInSlot(4).getItem() instanceof ItemArmor)
//		                        					{
//		                        						ItemArmor armor = (ItemArmor)zom.getEquipmentInSlot(4).getItem();
//		            		                  			if(armor.damageReduceAmount >= 2) {
//		                        							float chonie = pen * rand.nextFloat();
//		                        							if(chonie > 1) {
//		                        								damage /= chonie;
//		                        							}
//		                        						}
//		                        						
//		                        					}
//		                        					d = damage + ((damage / 2) * (CTBDataHandler.zombieReal ? 2.5F : 1.5F));
//		                        					
//		                        				} else if(movingobjectposition.hitVec.y < entity.posY + 1.2F && rand.nextInt(3) == 0) {
//		                        					d = damage / 2;
//		                        					zom.setType(4);
//		                        					zom.posY += 1;
//		                        					zom.setHealth(zom.getHealth() / 2);
//		                        				    zom.getEntityAttribute(SharedMonsterAttributes.movementSpeed).applyModifier(new AttributeModifier("Xtra Speed", -0.3F, 2));               				    
//		                        				}
//		                        				else
//		                        				{
//		                        					if(movingobjectposition.hitVec.y > entity.posY + 0.9F)
//			                        				{
//			                        					d = damage - (damage / 1.5F);
//			                        				}
//			                        				else if(movingobjectposition.hitVec.y > entity.posY + 0.4F)
//			                        				{
//			                        					d = damage / 2;
//			                        				}
//			                        				else
//			                        				{
//			                        					d = damage / 3;
//			                        				}
//		                        					d = 0.0F;
//		                        				}
		                        			} else {
		                        				if(movingobjectposition.hitVec.y > entity.posY + 1.38F) {
		                        					if(movingobjectposition.hitVec.y > entity.posY + 1.58F || inWidth) {
			                        					d = damage + (damage / 2);
		                        					} else {
		                        						d = damage;
		                        					}
		                        					
//		                        					if(CTBDataHandler.realismMode && movingobjectposition.hitVec.y > entity.posY + 1.58F && ((EntityLivingBase)entity).getEquipmentInSlot(4) != null && ((EntityLivingBase)entity).getEquipmentInSlot(4).getItem() instanceof ItemArmor) {
//		                        						ItemArmor armor = (ItemArmor)((EntityLivingBase)entity).getEquipmentInSlot(4).getItem();
//		            		                  			if(armor.damageReduceAmount >= 2) {
//		            		                  				float chonie = pen * rand.nextFloat();
//		                        							if(chonie > 1) {
//		                        								damage /= chonie;
//		                        								worldObj.playSoundEffect(entity.posX, entity.posY, entity.posZ, "ctb:bounce", 1, 1);
//		                        							}
//		                        						}
//		                        					}
		                        				}
		                        				else if(movingobjectposition.hitVec.y > entity.posY + 0.9F)
		                        				{
		                        					d = damage;

		                        					if(/*!CTBDataHandler.realismMode &&*/ 
		                        							movingobjectposition.hitVec.y > entity.posY + 1.1F && (bayonet || (movingobjectposition.hitVec.y < entity.posY + 1.28F && inWidth))) {
		                        						if(entity instanceof EntityPlayer && p != null) {
			                        						EntityPlayer pl = (EntityPlayer)entity;
			                        						//CTBPlayer wwp = CTBPlayer.get(p);
			                        						//CTBPlayer wwp2 = CTBPlayer.get(pl);
//			                        						if((wwp.side != wwp2.side || CTBDataHandler.teamDamage || (wwp.side == 0 && !CTBDataHandler.isCoOp())) &&!pl.capabilities.isCreativeMode) {
//			                        							((EntityLivingBase)entity).addPotionEffect(new PotionEffect(CTB.dying.id, 102, 0, false));
//			                        							/*if(bayonet) {
//			                        								d /= 2;
//			                        							}*/
//			                        							if(p != null) {
//				                        							CTB.ctbChannel.sendTo(new PacketGunClient(pl, 3, p.getEntityId(), bayonet ? 1 : gunm ? 2 : 0), (EntityPlayerMP) pl);	
//			                        							}
//			                        						}
		                        						} else {
		                        							d = damage + (damage / 2);
		                        						}
		                        					}
		                        				}
		                        				else if(movingobjectposition.hitVec.y > entity.posY + 0.2F)
		                        				{
		                        					d = damage / 2;
		                        				}
		                        				else
		                        				{
		                        					d = damage / 3;
		                        				}
		                        			}
		                        		} else {
		                        			if(entity instanceof EntityPlayer)
		                        			{
		                        				//CTBPlayer ww2p = CTBPlayer.get(((EntityPlayer)entity));
//		                        				if(ww2p.getStance() == 2)
//		                        				{
//		                        					d = damage + (damage / 2);
//		                        				}
//		                        				else if(ww2p.getStance() == 1)
//		                        				{
//		                              				if(movingobjectposition.hitVec.y > entity.posY + 0.75F)
//			                        				{
//		                            					if(movingobjectposition.hitVec.y > entity.posY + 1.95F || inWidth) {
//				                        					d = damage + (damage / 2);
//			                        					} else {
//			                        						d = damage;
//			                        					}
//			                        					
//			                        					if(CTBDataHandler.realismMode && movingobjectposition.hitVec.y > entity.posY + 1.58F && ((EntityLivingBase)entity).getEquipmentInSlot(4) != null && ((EntityLivingBase)entity).getEquipmentInSlot(4).getItem() instanceof ItemArmor) {
//			                        						ItemArmor armor = (ItemArmor)((EntityLivingBase)entity).getEquipmentInSlot(4).getItem();
//			            		                  			if(armor.damageReduceAmount >= 2) {
//			            		                  				float chonie = pen * rand.nextFloat();
//			                        							if(chonie > 1) {
//			                        								damage /= chonie;
//			                        								worldObj.playSoundEffect(entity.posX, entity.posY, entity.posZ, "ctb:bounce", 1, 1);
//			                        							}
//			                        						}
//			                        					}
//			                        				}
//			                        				else if(movingobjectposition.hitVec.y > entity.posY + 0.45F)
//			                        				{
//			                        					d = damage;
//			                        				}
//			                        				else if(movingobjectposition.hitVec.y > entity.posY + 0.2F)
//			                        				{
//			                        					d = damage / 2;
//			                        				}
//			                        				else
//			                        				{
//			                        					d = damage / 3;
//			                        				}
//		                              				if(movingobjectposition.hitVec.y < entity.posY + 1.2F && rand.nextInt(3) == 0 && entity instanceof EntityCTBZombie && CTBDataHandler.zombieReal) {
//				                        				EntityCTBZombie zom = (EntityCTBZombie)entity;
//			                        					d = damage / 2;
//			                        					zom.setType(4);
//			                        					zom.posY += 1;
//			                        					zom.setHealth(zom.getHealth() / 2);
//			                        				    zom.getEntityAttribute(SharedMonsterAttributes.movementSpeed).applyModifier(new AttributeModifier("Xtra Speed", -0.3F, 2));               				    
//			                        				}
//		                        				}
//		                        				else
//		                        				{
//		                        					d = damage;
//		                        				}
		                        			}
		                        			else
		                        			{
		                        				d = damage;
		                        			}
		                        		}
		                        		
		                        		
		                        		if(i == 0)//if(i >= list.size() - 1)
		                        		{
		                        			cDamage = 0;
		                        		}
		                        		else
		                        		{
		                        			if(cDamage == 0) {
		                        				cDamage += 5;
		                        			}
		                        			cDamage -= (cDamage / 3.5F);
		                        			d -= cDamage;
		                        		}
		                        		
		                        		/*if(CTBDataHandler.realismMode) {
		                        			d /= melee ? 2 : 5;
		                        		}*/
		                        			                        
		                        		
			                             if(entity instanceof EntityLivingBase) {
			               		    		 EntityLivingBase elb = (EntityLivingBase)entity;
			               		    		 
				               		    	elb.attackEntityFrom(DamageSource.causePlayerDamage(p), damage);
			               		    		 
//			               		    		 if(elb.hurtResistantTime <= 0 || !melee)
//			            		    		 if(grenade != null && grenade.getThrower() != null) {
//			            		    			 elb.attackEntityFrom(CTB.causeIndirectDamage(grenade, grenade.getThrower()), 10 + rand.nextInt(15));
//				               		    		 } else if(p != null) {
//				               		    			 if(arty != null) {
//				               		    				elb.attackEntityFrom(CTB.causeIndirectDamage(p, p, "strafing"), d); 
//				               		    			 } else {
//							               		    		elb.attackEntityFrom(gun ? CTB.causeGunDamage(p) : gunm ? CTB.causeGMeleeDamage(p) : CTB.causeMeleeDamage(p), d);  
//				               		    			 }
//				               		    		 }
//			
//			                                    elb.arrowHitTimer++;
//			                                    elb.hurtResistantTime = (elb.maxHurtResistantTime / 2) - 1;
//			                                    if(melee) {
//			                                    	elb.hurtResistantTime = (int)(elb.maxHurtResistantTime / 1.5f) - 1;
//			                                    }
//			   
//			               		    		 elb.motionX = 0;
//			               		    		 elb.motionY = 0; 
//			               		    		 elb.motionZ = 0;
//			               		     	     elb.addPotionEffect(new PotionEffect(CTB.blood.id, elb.isPotionActive(CTB.blood) ? elb.getActivePotionEffect(CTB.blood).getDuration() + 1600 : 1600, elb.isPotionActive(CTB.blood) ? elb.getActivePotionEffect(CTB.blood).getAmplifier() + 1 : 0));     		
//			               		     	     if(grenade == null && !gun && p.getCurrentEquippedItem() != null && (p.getCurrentEquippedItem().getItem() instanceof ItemGun || p.getCurrentEquippedItem().getItem() instanceof ItemMelee) && p.getCurrentEquippedItem().stackTagCompound != null) {
//			               		     	    	 if(p.getCurrentEquippedItem().stackTagCompound.getInteger("bloodamount") < 7) {
//			               						  p.getCurrentEquippedItem().stackTagCompound.setInteger("bloodamount", p.getCurrentEquippedItem().stackTagCompound.getInteger("bloodamount") + 1);
//			               					    }
//			               		     	    	p.getCurrentEquippedItem().stackTagCompound.setFloat("bloodtime", 0);
//			               		     	     }
//			               		    	 } else {
//			               		    		 if(entity instanceof EntityGrenade) {
//			               		    			 CTB.ctbChannel.sendToAll(new PacketMGClient(1, entity));
//			               		    		 }
//			            		    		 if(grenade != null && grenade.getThrower() != null) {
//			            		    			 entity.attackEntityFrom(CTB.causeIndirectDamage(grenade, grenade.getThrower()), 10 + rand.nextInt(15));
//			               		    		 } else if(p != null) {
//				               		    		 entity.attackEntityFrom(CTB.causeGunDamage(p), d); 
//			               		    		 }
//			               		    	 }
	
			                             
			                             this.damage /= 2;
			                             }
//		                        		if(grenade == null || grenade.canEntityBeSeen(entity)) {
//		                        			
//		                        		}
				                }
				                
				                
		                    }     
                    }
                }

                if(list2 == null && p != null && gun) {
                	attack(p, range, false, recoil, sRecoil, l3);
                }
        }
    }
	


	public RayTraceResult clip(Vec3d par1Vec3, Vec3d par2Vec3, World world)
    {
        return rayTraceBlocks_do_do(par1Vec3, par2Vec3, false, false, world);
    }
	
	
	//Gets the factorial of a number
	public float fac(float fac) {
		float f = 1;
		for(int i = 1; i <= fac; i++) {
			f *= i;
		}
		return f;
	}


    public RayTraceResult rayTraceBlocks_do_do(Vec3d par1Vec3, Vec3d par2Vec3, boolean par3, boolean par4, World world) {
        if (!Double.isNaN(par1Vec3.x) && !Double.isNaN(par1Vec3.y) && !Double.isNaN(par1Vec3.z))
        {
            if (!Double.isNaN(par2Vec3.x) && !Double.isNaN(par2Vec3.y) && !Double.isNaN(par2Vec3.z))
            {
                int i = MathHelper.floor(par2Vec3.x);
                int j = MathHelper.floor(par2Vec3.y);
                int k = MathHelper.floor(par2Vec3.z);
                int l = MathHelper.floor(par1Vec3.x);
                int i1 = MathHelper.floor(par1Vec3.y);
                int j1 = MathHelper.floor(par1Vec3.z);
                
                double ld = par1Vec3.x;
                double i1d = par1Vec3.y;
                double j1d = par1Vec3.z;
                
                int k1 = 0;
                //int blockMeta = world.getBlockMetadata(l, i1, j1);     
                BlockPos blockPos = new BlockPos(1, i1, j1);
                IBlockState blockState = world.getBlockState(blockPos);
                Block block = blockState.getBlock();
                if (block != null && (!par4 || block == null) && block.getBoundingBox(world.getBlockState(blockPos), world, blockPos) != null && block != Blocks.AIR /*&& block.canStopRayTrace(blockMeta, par3)*/)
                {
                    RayTraceResult movingobjectposition = block.collisionRayTrace(blockState, world, blockPos, par1Vec3, par2Vec3);
                    
                    if (movingobjectposition != null)
                    {
                        return movingobjectposition;
                    }
                }

                k1 = 200;
                float pen = 0;
                while (k1-- >= 0) {
          	         if (Double.isNaN(par1Vec3.x) || Double.isNaN(par1Vec3.y) || Double.isNaN(par1Vec3.z))
                    {
                        return null;
                    }

                    if (l == i && i1 == j && j1 == k)
                    {
                        return null;
                    }

                    boolean flag2 = true;
                    boolean flag3 = true;
                    boolean flag4 = true;
                    double d0 = 999.0D;
                    double d1 = 999.0D;
                    double d2 = 999.0D;

                    if (i > l)
                    {
                        d0 = l + 1.0D;
                    }
                    else if (i < l)
                    {
                        d0 = l + 0.0D;
                    }
                    else
                    {
                        flag2 = false;
                    }

                    if (j > i1)
                    {
                        d1 = i1 + 1.0D;
                    }
                    else if (j < i1)
                    {
                        d1 = i1 + 0.0D;
                    }
                    else
                    {
                        flag3 = false;
                    }

                    if (k > j1)
                    {
                        d2 = j1 + 1.0D;
                    }
                    else if (k < j1)
                    {
                        d2 = j1 + 0.0D;
                    }
                    else
                    {
                        flag4 = false;
                    }

                    double d3 = 999.0D;
                    double d4 = 999.0D;
                    double d5 = 999.0D;
                    double d6 = par2Vec3.x - par1Vec3.x;
                    double d7 = par2Vec3.y - par1Vec3.y;
                    double d8 = par2Vec3.z - par1Vec3.z;

                    if (flag2)
                    {
                        d3 = (d0 - par1Vec3.x) / d6;
                    }

                    if (flag3)
                    {
                        d4 = (d1 - par1Vec3.y) / d7;
                    }

                    if (flag4)
                    {
                        d5 = (d2 - par1Vec3.z) / d8;
                    }

                    boolean flag5 = false;
                    byte b0;

                    if (d3 < d4 && d3 < d5)
                    {
                        if (i > l)
                        {
                            b0 = 4;
                        }
                        else
                        {
                            b0 = 5;
                        }

                        par1Vec3 = new Vec3d(d0, par1Vec3.y + (d7 * d3), par1Vec3.z + (d8 * d3));
//                        par1Vec3.x = d0;
//                        par1Vec3.y += d7 * d3;
//                        par1Vec3.z += d8 * d3;
                    }
                    else if (d4 < d5)
                    {
                        if (j > i1)
                        {
                            b0 = 0;
                        }
                        else
                        {
                            b0 = 1;
                        }

                        par1Vec3 = new Vec3d(par1Vec3.y + (d6 * d4), d1, par1Vec3.z + (d8 * d4));
                        
//                        par1Vec3.x += d6 * d4;
//                        par1Vec3.y = d1;
//                        par1Vec3.z += d8 * d4;
                    }
                    else
                    {
                        if (k > j1)
                        {
                            b0 = 2;
                        }
                        else
                        {
                            b0 = 3;
                        }

                        par1Vec3 = new Vec3d(par1Vec3.y + (d6 * d5), par1Vec3.z + (d7 * d5), d2);

//                        par1Vec3.x += d6 * d5;
//                        par1Vec3.y += d7 * d5;
//                        par1Vec3.z = d2;
                    }

                    Vec3d vec32 = new Vec3d(par1Vec3.x, par1Vec3.y, par1Vec3.z);
                    vec32 = new Vec3d(MathHelper.floor(par1Vec3.x), MathHelper.floor(par1Vec3.y), MathHelper.floor(par1Vec3.z));
                    l = (int) vec32.x;
                    ld = par1Vec3.x;
                      
                    if (b0 == 5)
                    {
                        --l;
                        --ld;
                        vec32 = vec32.addVector(1, 0, 0);
                        //++vec32.x;
                    }

                    i1 = (int) vec32.y;
                    //i1 = (int)(vec32.y = MathHelper.floor(par1Vec3.y));
                    i1d = par1Vec3.y;                    if (b0 == 1)
                    {
                        --i1;
                        --i1d;
                        vec32 = vec32.addVector(0, 1, 0);
                        //++vec32.y;
                    }

                    j1 = (int) vec32.z;
                    //j1 = (int)(vec32.z = MathHelper.floor(par1Vec3.z));
                    j1d = par1Vec3.z;
                    if (b0 == 3)
                    {
                        --j1;
                        --j1d;
                        vec32 = vec32.addVector(0, 0, 1);
                        //++vec32.z;
                    }

                    
                    BlockPos blockPos1 = new BlockPos(1, i1, j1);
                    IBlockState blockState1 = world.getBlockState(blockPos1);
                    Block block1 = blockState1.getBlock();
                    Material m = block1.getMaterial(blockState1);
                    
                    //int j2 = world.getBlockMetadata(l, i1, j1);
                    //Block block1 = world.getBlock(l, i1, j1);
                    
                    float maxPen = (damage > 14 ? 1 : 0.5f) + (fire ? 0 : 0);
                    maxPen = 0;
                    // TODO : pen
//                	if(block1 != null && (m == Material.GLASS || m == Material.ICE) && pen < maxPen && ItemLoader.thickness.containsKey(block1) && ItemLoader.thickness.get(block1) <= maxPen - pen) {
//	                	pen += ItemLoader.thickness.get(block1);
//	                	if(CTBDataHandler.breakGlass) {
//	                		SavedBlock b = new SavedBlock();
//	                		b.blockType = block1;
//	                		b.meta = j2;
//	                		b.pos = new Position(l, i1, j1);
//	                		if(!CTBDataHandler.removeContains(b.pos) && CTBDataHandler.hasGame()) {
//	                			if(b.blockType != Blocks.air) {
//	                				CTBDataHandler.brokenBlocks.add(b);
//	                			}
//	                		}
//	                		world.setBlock(l, i1, j1, Blocks.air);
//	                		
//	                		 world.playAuxSFX(2001, l, i1, j1, Block.getIdFromBlock(Blocks.GLASS));
//	                	}
//                		block1 = null;
//                	}       	  
	                
                	if(block1 != null && (block1 == Blocks.VINE || (!block1.isOpaqueCube(blockState1) && /**block1 != CTB.hedgehog && block1 != CTB.sandbag && block1 != CTB.sandbaghf && block1 != CTB.hitbox && block1 != CTB.spawnProtect && */m != Material.WATER))) {
	                	block1 = null;
	                }
                    
                    if(m == Material.WATER) {
                	   if(block1 != null && elP != null && pen < maxPen) {
                       	pen += 0.15F;
                       	if(!shotgun) {
	                       	//world.playSound(l, i1, j1, "random.splash", 0.3F, 1);
	                       	//CTB.ctbChannel.sendToAllAround(new PacketParticle(elP, 0, ld, i1d, j1d), new TargetPoint(world.provider.dimensionId, l, i1, j1, 15));
                       	}
                       	block1 = null;
                	   } 
                    } else {
//		                if(block1 != null && pen < maxPen && ItemLoader.thickness.containsKey(block1) && ItemLoader.thickness.get(block1) <= maxPen - pen && penetrate)
//		                {
//		                	pen += block1.getBlockHardness(world, l, i1, j1);
//		                	block1 = null;
//		                }
		                
                    }

//                    if (block1 != null && (!par4 || block1 == null) && block1.getEntityBoundingBoxFromPool(world, l, i1, j1) != null && block1 != Blocks.air && (block1.canStopRayTrace(j2, par3) || m == Material.WATER) && (m != Material.plants)) {
//                 
//                    	MovingObjectPosition mop = block1.collisionRayTrace(world, l, i1, j1, par1Vec3, par2Vec3);
//                        if (mop != null) {
//                        	 if((m == Material.iron || m == Material.anvil || m == Material.rock || block1 == Blocks.bedrock) && block1 != Blocks.gold_block && gun) {
// 			                	if(!shotgun) {
// 			                		world.playSound(l, i1, j1, "ctb:bounce", 1, 1);
// 			                	}
// 			                }
//                        	 if(grenade == null && !shotgun)
//                        	 world.playAuxSFX(2001, (int)mop.hitVec.x, (int)mop.hitVec.y, (int)mop.hitVec.z, Block.getIdFromBlock(block1));
//                             //CTB.ctbChannel.sendToAll(new PacketParticle(elP, 0, mop.hitVec.x, mop.hitVec.y, mop.hitVec.z, "blockcrack_" + Block.getIdFromBlock(block1) + "_" + world.getBlockMetadata(l, i1, j1)));
//                            return mop;
//                        }
//                    }
                }

                return null;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    
    private int timesplayed;

}
