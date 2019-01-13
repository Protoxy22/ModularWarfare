package com.modularwarfare.client.model;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;

public class ModelGun extends ModelBase
{
	
	//The scale of the gun model
	public float modelScale = 1.0F;
	//Allows you to select a render preset for change the position of the gun in hand (1-3, default 1)
	public int renderPreset = 1;
	//Advanced configuration - Allows you to change how the gun is held without effecting the sight alignment
	public Vector3f rotateCarryPosition = new Vector3f(0F, 0F, 0F);
	//Advanced configuration - Allows you to change how the gun is held without effecting the sight alignment
	public Vector3f translateCarryPosition = new Vector3f(0F, 0F, 0F);
	public Vector3f sprintTranslate = new Vector3f(0F, 0F, 0F);
	public Vector3f sprintRotate = new Vector3f(0F, 0F, 0F);
	//Allows you to modify the ADS speed per gun, adjust in small increments (+/- 0.01)
	public float adsSpeed = 0.00F;
	
	//These first 7 models are static with no animation
	public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] backpackModel = new ModelRendererTurbo[0]; //For flamethrowers and such like. Rendered on the player's back
	//These models appear when no attachment exists
	public ModelRendererTurbo[] defaultBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultScopeModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultStockModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultGripModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultGadgetModel = new ModelRendererTurbo[0];

	//Animated models follow.
	public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] fullammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] revolverBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] revolver2BarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] breakActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] altbreakActionModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altslideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] chargeModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altpumpModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leverActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] hammerModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] althammerModel = new ModelRendererTurbo[0];

	//These designate the locations of 3D attachment models on the gun
	public Vector3f barrelAttachPoint = new Vector3f();
	public Vector3f scopeAttachPoint = new Vector3f();
	public Vector3f stockAttachPoint = new Vector3f();
	public Vector3f gripAttachPoint = new Vector3f();
	public Vector3f gadgetAttachPoint = new Vector3f();
	public Vector3f slideAttachPoint = new Vector3f();
	public Vector3f pumpAttachPoint = new Vector3f();
	public Vector3f accessoryAttachPoint = new Vector3f();

	//Muzzle flash models
	public boolean hasFlash = false;
	public float flashScale = 1F;
	public Vector3f muzzleFlashPoint = new Vector3f(0,0,0);

	//Arms rendering
	public boolean hasArms = false;
	//TODO; Any reason this cant be a single boolean with left true as default?
	public boolean leftHandAmmo = false;
	public boolean rightHandAmmo = false;
	public Vector3f leftArmScale = new Vector3f(0.8F,0.8F,0.8F);
	public Vector3f rightArmScale = new Vector3f(0.8F,0.8F,0.8F);	
	/** Position/Rotation of the LEFT arm when not reloading */
	public Vector3f leftArmPos = new Vector3f(0,0,0);
	public Vector3f leftArmRot = new Vector3f(0,0,0);
	/** Position/Rotation of the RIGHT arm when not reloading */
	public Vector3f rightArmPos = new Vector3f(0,0,0);
	public Vector3f rightArmRot = new Vector3f(0,0,0);
	/** Position/Rotation of the LEFT arm when reloading */
	public Vector3f leftArmReloadPos = new Vector3f(0,0,0);
	public Vector3f leftArmReloadRot = new Vector3f(0,0,0);
	/** Position/Rotation of the RIGHT arm when reloading */
	public Vector3f rightArmReloadPos = new Vector3f(0,0,0);
	public Vector3f rightArmReloadRot = new Vector3f(0,0,0);
	/** Position/Rotation of the LEFT arm when charging(cocking) */
	public Vector3f leftArmChargePos = new Vector3f(0,0,0);
	public Vector3f leftArmChargeRot = new Vector3f(0,0,0);
	/** Position/Rotation of the RIGHT arm when charging(cocking) */
	public Vector3f rightArmChargePos = new Vector3f(0,0,0);
	public Vector3f rightArmChargeRot = new Vector3f(0,0,0);

	//Model based recoil variables
	public float gunSlideDistance = 1F / 4F;
	public float altgunSlideDistance = 1F / 4F;
	/** Adds backwards recoil translations to the gun model when firing  */
	public float modelRecoilBackwards = 1F / 16F;
	/** Adds upwards/downwards recoil translations to the gun model when firing  */
	public float modelRecoilUpwards = -1.5F;
	/** Adds a left-right model shaking motion when firing, default 0.5 */
	public float modelShake = 0.5F;

	// Casing and muzzle flash parameters
	/** Total distance to translate the casing model, effects speed */
    public Vector3f casingAnimDistance = new Vector3f(0, 0, 16);
    /** The amount by which the casing may random deviate from the default path */
    public Vector3f casingAnimSpread = new Vector3f(2, 4, 4);
    /** Rotation of the casing, 180 is the total rotation. If you do not understand rotation vectors, like me, just use the standard value here. */
    public Vector3f casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
    /** Use this to position to casing inside the gun */
	public Vector3f casingAttachPoint = new Vector3f();
	/** Set the scale for the casing model, allows you to use the same model for many guns */
	public Vector3f caseScale = new Vector3f(1.0F, 1.0F, 1.0F);
    /** Time to complete / speed of the casing in ticks */
    public int casingAnimTime = 20;
	/** Allows you to set a tick delay to eject casing after firing (for bolt actions etc) */
	public int casingDelay = 0;

    // Charge handle distance/delay/time
    public float chargeHandleDistance = 0F;
    public int chargeDelay = 0, chargeDelayAfterReload = 0, chargeTime = 1;

	/**
	 * Bullet Counter Models. Can be used to display bullet count in-game interface.
	 * Each part is represented by number of rounds remaining per magazine.
	 *
	 * - Simple counter will loop through each part. Allows flexibility for bullet counter UI design.
	 *
	 * - Adv counter used for counting mags of more than 10, to reduce texture parts. Divides count into digits.
	 *	 Less flexibility as it requires 10 textures parts at maximum (numbers 0-9).
	 */
	public ModelRendererTurbo[] bulletCounterModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[][] advBulletCounterModel = new ModelRendererTurbo[0][0];
	/** For Adv Bullet Counter. Reads in numbers from left hand side when false */
	public boolean countOnRightHandSide = false;
	/** Toggle the counters active. Saves render performance. */
	public boolean isBulletCounterActive, isAdvBulletCounterActive = false;

    
	//public EnumAnimationType animationType = EnumAnimationType.NONE;
	//public EnumMeleeAnimation meleeAnimation = EnumMeleeAnimation.DEFAULT;
	public float tiltGunTime = 0.15F, unloadClipTime = 0.35F, loadClipTime = 0.35F, untiltGunTime = 0.15F;
	/** If true, then the scope attachment will move with the top slide */
	public boolean scopeIsOnSlide = false;
	/** If true, then the scope attachment will move with the break action. Can be combined with the above */
	public boolean scopeIsOnBreakAction = false;
	/** For rifles and shotguns. Currently a generic reload animation regardless of how full the internal magazine already is */
	public float numBulletsInReloadAnimation = 1;
	/** For shotgun pump handles, rifle bolts and hammer pullbacks */
	public int pumpDelay = 0, pumpDelayAfterReload = 0, pumpTime = 1, hammerDelay = 0;
	/** For shotgun pump handle */
	public float pumpHandleDistance = 4F / 16F;
	/** For end loaded projectiles */
	public float endLoadedAmmoDistance = 1F;
	/** For break action projectiles */
	public float breakActionAmmoDistance = 1F;
	/** If true, then the grip attachment will move with the shotgun pump */
	public boolean gripIsOnPump = false;
	/** If true, then the gadget attachment will move with the shotgun pump */
	public boolean gadgetIsOnPump = false;
	/** The rotation point for the barrel break */
	public Vector3f barrelBreakPoint = new Vector3f();
	public Vector3f altbarrelBreakPoint = new Vector3f();
	/** The amount the revolver barrel flips out by */
	public float revolverFlipAngle = 15F;
	/** The amount the revolver2 barrel flips out by */
	public float revolver2FlipAngle = 15F;
	/** The rotation point for the revolver flip */
	public Vector3f revolverFlipPoint = new Vector3f();
	/** The rotation point for the revolver2 flip */
	public Vector3f revolver2FlipPoint = new Vector3f();
	/** The angle the gun is broken by for break actions */
	public float breakAngle = 45F;
	public float altbreakAngle = 45F;
	/** If true, then the gun will perform a spinning reload animation */
	public boolean spinningCocking = false;
	/** The point, in model co-ordinates, about which the gun is spun */
	public Vector3f spinPoint = new Vector3f();
	/** The point where the hammer will pivot and spin from */
	public Vector3f hammerSpinPoint = new Vector3f();
	public Vector3f althammerSpinPoint = new Vector3f();
	public float hammerAngle = 75F;
	public float althammerAngle = 75F;
	/** Single action cocking check */
	public boolean isSingleAction = false;
	/** If true, lock the slide when the last bullet is fired */
	public boolean slideLockOnEmpty = false;
	/** If true, move the hands with the pump action */
	public boolean lefthandPump = false;
	public boolean righthandPump = false;
	/** If true, move the hands with the charge action */
	public boolean rightHandCharge = false;
	public boolean leftHandCharge = false;
	/** If true, move the hands with the bolt action */
	public boolean rightHandBolt = false;
	public boolean leftHandBolt = false;
	public float pumpModifier = 4F;
	public Vector3f chargeModifier = new Vector3f(8F, 4F, 4F);
	/**If true, gun will translate when equipped with a sight attachment */
	public float gunOffset = 0F;
	public float crouchZoom = 0F;
	public boolean fancyStance = false;



	/** Custom reload Parameters. If Enum.CUSTOM is set, these parameters can build an animation within the gun model classes */
	//Gun movement variables
	public float rotateGunVertical = 0F;
	public float rotateGunHorizontal = 0F;
	public float tiltGun = 0F;
	public Vector3f translateGun = new Vector3f(0F, 0F, 0F);
	//Ammo movement variables
	public float rotateClipVertical = 0F;
	public float rotateClipHorizontal = 0F;
	public float tiltClip = 0F;
	public Vector3f translateClip = new Vector3f(0F, 0F, 0F);
	

	/** This offsets the render position for third person */
	public Vector3f thirdPersonOffset = new Vector3f();

	/** This offsets the render position for item frames */
	public Vector3f itemFrameOffset = new Vector3f();

	//lighting stuff
	private static float lightmapLastX;
    private static float lightmapLastY;
	private static boolean optifineBreak = false;
	
	public HashMap<String, Vector3f> ammoMap = new HashMap<String, Vector3f>();

	public static void glowOn()
	{
		glowOn(15);
	}

    public static void glowOn(int glow)
    {
        GL11.glPushAttrib(GL11.GL_LIGHTING_BIT);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

        try
		{
        	lightmapLastX = OpenGlHelper.lastBrightnessX;
        	lightmapLastY = OpenGlHelper.lastBrightnessY;
        }
		catch(NoSuchFieldError e)
		{
        	optifineBreak = true;
        }

        float glowRatioX = Math.min((glow/15F)*240F + lightmapLastX, 240);
        float glowRatioY = Math.min((glow/15F)*240F + lightmapLastY, 240);

        if(!optifineBreak)
        {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, glowRatioX, glowRatioY);
        }
    }

    public static void glowOff()
    {
        GL11.glEnable(GL11.GL_LIGHTING);
    	if(!optifineBreak)
    	{
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapLastX, lightmapLastY);
    	}

        GL11.glPopAttrib();
    }

	public void renderGun(float f)
	{
		render(gunModel, f);
	}

	public void renderSlide(float f)
	{
		render(slideModel, f);
	}
	
	public void renderaltSlide(float f)
	{
		render(altslideModel, f);
	}

	public void renderPump(float f)
	{
		render(pumpModel, f);
	}
	
	public void renderaltPump(float f)
	{
		render(altpumpModel, f);
	}
	
	public void renderCharge(float f)
	{
		render(chargeModel, f);
	}

	public void renderDefaultScope(float f)
	{
		render(defaultScopeModel, f);
	}

	public void renderDefaultBarrel(float f)
	{
		render(defaultBarrelModel, f);
	}

	public void renderDefaultStock(float f)
	{
		render(defaultStockModel, f);
	}

	public void renderDefaultGrip(float f)
	{
		render(defaultGripModel, f);
	}

	public void renderDefaultGadget(float f)
	{
		render(defaultGadgetModel, f);
	}

	public void renderAmmo(float f)
	{
		render(ammoModel, f);
	}

	public void renderfullAmmo(float f)
	{
		render(fullammoModel, f);
	}

	public void renderRevolverBarrel(float f)
	{
		render(revolverBarrelModel, f);
	}

	public void renderRevolver2Barrel(float f)
	{
		render(revolver2BarrelModel, f);
	}

	public void renderBreakAction(float f)
	{
		render(breakActionModel, f);
	}
	
	public void renderaltBreakAction(float f)
	{
		render(altbreakActionModel, f);
	}

	public void renderHammer(float f)
	{
		render(hammerModel, f);
	}

	public void renderaltHammer(float f)
	{
		render(althammerModel, f);
	}

	public void renderBulletCounter(float f, int k)
	{
		for(int i = 0; i < bulletCounterModel.length; i++)
		{
			if(i == k)
			{
				glowOn();
				bulletCounterModel[i].render(f);
				glowOff();
			}
		}
	}

	public void renderAdvBulletCounter(float f, int k, boolean rhs)
	{
		//Divide the ammo count into array of ints
		char[] count = String.valueOf(k).toCharArray();
		int[] digits = new int[count.length];

		for(int i = 0; i < count.length ; i++)
		{
			if(!rhs)
				digits[i] = count[i] - 48;						//read digits left hand side
			else
				digits[digits.length - 1 - i] = count[i] - 48;	//read digits right hand side
		}

		//Loop though the array, and manage ammo count render.
		for(int i = 0; i < digits.length ; i++)
		{
			for(int j = 0; j < advBulletCounterModel[i].length; j++)
			{
				if (digits[i] == j)
				{
					glowOn();
					advBulletCounterModel[i][j].render(f);
					glowOff();
				}
			}
		}
	}


	/** For renderering models simply */
	protected void render(ModelRendererTurbo[] models, float f)
	{
		for(ModelRendererTurbo model : models)
			if(model != null)
				model.render(f);
	}

	/** Flips the model. Generally only for backwards compatibility */
	public void flipAll()
	{
		flip(gunModel);
		flip(defaultBarrelModel);
		flip(defaultScopeModel);
		flip(defaultStockModel);
		flip(defaultGripModel);
		flip(defaultGadgetModel);
		flip(ammoModel);
		flip(fullammoModel);
		flip(slideModel);
		flip(altslideModel);
		flip(pumpModel);
		flip(altpumpModel);
		flip(chargeModel);
		flip(revolverBarrelModel);
		flip(revolver2BarrelModel);
		flip(breakActionModel);
		flip(altbreakActionModel);
		flip(hammerModel);
		flip(althammerModel);
		flip(bulletCounterModel);
		for(ModelRendererTurbo[] mod : advBulletCounterModel)
			flip(mod);
	}

	protected void flip(ModelRendererTurbo[] model)
	{
		for(ModelRendererTurbo part : model)
		{
			part.doMirror(false, true, true);
			part.setRotationPoint(part.rotationPointX, - part.rotationPointY, - part.rotationPointZ);
		}
	}

	/** Translates the model */
	public void translateAll(float x, float y, float z)
	{
    	{
    		translate(gunModel, x, y, z);
    		translate(defaultBarrelModel, x, y, z);
    		translate(defaultScopeModel, x, y, z);
    		translate(defaultStockModel, x, y, z);
    		translate(defaultGripModel, x, y, z);
    		translate(defaultGadgetModel, x, y, z);
    		translate(ammoModel, x, y, z);
    		translate(fullammoModel, x, y, z);
    		translate(slideModel, x, y, z);
    		translate(altslideModel, x, y, z);
    		translate(pumpModel, x, y, z);
    		translate(altpumpModel, x, y, z);
    		translate(chargeModel, x, y, z);
    		translate(revolverBarrelModel, x, y, z);
    		translate(revolver2BarrelModel, x, y, z);
    		translate(breakActionModel, x, y, z);
    		translate(altbreakActionModel, x, y, z);
    		translate(hammerModel, x, y, z);
    		translate(althammerModel, x, y, z);
			translate(bulletCounterModel, x, y, z);
			for(ModelRendererTurbo[] mod : advBulletCounterModel)
				translate(mod, x, y, z);
    	}
	}

	protected void translate(ModelRendererTurbo[] model, float x, float y, float z)
	{
		for(ModelRendererTurbo mod : model)
		{
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
	
}
