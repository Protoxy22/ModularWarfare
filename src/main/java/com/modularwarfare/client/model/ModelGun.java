package com.modularwarfare.client.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.objects.BreakActionData;
import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.client.model.objects.TurboBase;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;

import net.minecraft.client.renderer.OpenGlHelper;

public class ModelGun extends TurboBase
{
	
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
	public ModelRendererTurbo[] breakActionModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altslideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] chargeModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] altpumpModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leverActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] hammerModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] triggerModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] switchModel = new ModelRendererTurbo[0];

	//Arm rendering variables DEFAULT, RELOADING, CHARGING
	public boolean leftHandAmmo = true;
	public Vector3f leftArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
	public Vector3f rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);	
	public Vector3f leftArmPos;
	public Vector3f leftArmRot;
	public Vector3f rightArmPos;
	public Vector3f rightArmRot;
	public Vector3f leftArmReloadPos;
	public Vector3f leftArmReloadRot;
	public Vector3f rightArmReloadPos;
	public Vector3f rightArmReloadRot;
	public Vector3f leftArmChargePos;
	public Vector3f leftArmChargeRot;
	public Vector3f rightArmChargePos;
	public Vector3f rightArmChargeRot;
	
	// Arm used for loading ammo
	public EnumArm loadingArm = EnumArm.Left;
	
	// Arm used for actions I.E pump, bolt, etc
	public EnumArm actionArm = EnumArm.Left;
	
	// Action used by the weapon
	public EnumAction actionType;
	
	public Vector3f chargeModifier = new Vector3f(1F, 0F, 0F);

	public float thirdPersonScale = 1F;
	//Rotation helper tool
	public Vector3f rotationHelper = new Vector3f(0F, 0F, 0F);

	//Stance variables
	/**If true, gun will translate when equipped with a sight attachment */
	public float gunOffset = 0F;
	//Zoom/translate the gun model towards player when crouching
	public float crouchZoom = 0F;
	//Enable or disable stances
	public boolean fancyStance = false;
	//Advanced configuration - Allows you to change how the gun is held without effecting the sight alignment
	public Vector3f rotateHipPosition = new Vector3f(0F, 0F, 0F);
	//Advanced configuration - Allows you to change how the gun is held without effecting the sight alignment
	public Vector3f translateHipPosition = new Vector3f(0F, 0F, 0F);
	//Advanced configuration - Allows you to change how the gun is held while aiming
	public Vector3f rotateAimPosition = new Vector3f(0F, 0F, 0F);
	//Advanced configuration - Allows you to change how the gun is held while aiming
	public Vector3f translateAimPosition = new Vector3f(0F, 0F, 0F);
	public Vector3f sprintTranslate = new Vector3f(0F, 0F, 0F);
	public Vector3f sprintRotate = new Vector3f(0F, 0F, 0F);
	//Allows you to modify the ADS speed per gun, adjust in small increments (+/- 0.01)
	public float adsSpeed = 0.00F;

	//Muzzle flash variables
	public boolean hasFlash = false;
	public float flashScale = 1F;
	public Vector3f muzzleFlashPoint = new Vector3f(0,0,0);
	public Vector3f defaultBarrelFlashPoint = new Vector3f(0,0,0);

	//Model based recoil variables
	public float gunSlideDistance = 1F / 4F;
	public float altgunSlideDistance = 1F / 4F;
	/** Adds backwards recoil translations to the gun model when firing  */
	public float modelRecoilBackwards = 0.05F;
	/** Adds upwards/downwards recoil translations to the gun model when firing  */
	public float modelRecoilUpwards = 1.0F;
	/** Adds a left-right model shaking motion when firing, default 0.5 */
	public float modelRecoilShake = 0.10F;

	//Casing ejection variables
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
    //Fire mode switch variables
    public boolean switchIsOnSlide = false;
    public Vector3f switchRotationPoint = new Vector3f(0, 0, 0);
    public float switchSemiRot;
    public float switchBurstRot;
    public float switchAutoRot;
    
    //Reload animation variables
	/** If true, then the scope attachment will move with the top slide */
	public boolean scopeIsOnSlide = false;
	/** If true, then the scope attachment will move with the break action. Can be combined with the above */
	public boolean scopeIsOnBreakAction = false;
	/** For rifles and shotguns. Currently a generic reload animation regardless of how full the internal magazine already is */
	public float numBulletsInReloadAnimation = 1;
	/** For shotgun pump handles, rifle bolts and hammer pullbacks */
	public int pumpDelay = 0, pumpDelayAfterReload = 0, pumpTime = 1, hammerDelay = 0;
	/** For bolt action weapons */
	public float boltRotation = 0F;
	/** The rotation point for the bolt twist */
	public Vector3f boltRotationPoint = new Vector3f();
	/** For animated triggers */
	public float triggerRotation = 0F;
	/** The rotation point for the trigger */
	public Vector3f triggerRotationPoint = new Vector3f();
	/** For animated triggers */
	public float leverRotation = 0F;
	/** The rotation point for the trigger */
	public Vector3f leverRotationPoint = new Vector3f();
	/** The translateall value used for moving the entire model */
	public Vector3f translateAll = new Vector3f();
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
	/** The amount the revolver barrel flips out by */
	public float cylinderRotation = 0F;
	/** The rotation point for the revolver cylinder */
	public Vector3f cylinderRotationPoint = new Vector3f();
	/** The rotation point for the hammer */
	public Vector3f hammerRotationPoint = new Vector3f();
	public float hammerAngle = 75F;
	/** Single action cocking check */
	public boolean isSingleAction = false;
	/** If true, lock the slide when the last bullet is fired */
	public boolean slideLockOnEmpty = false;

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

	//lighting stuff for glow
	private static float lightmapLastX;
    private static float lightmapLastY;
	private static boolean optifineBreak = false;
	
	public String reloadAnimation = WeaponAnimations.RIFLE;
	
	public HashMap<String, RenderVariables> ammoMap = new HashMap<String, RenderVariables>();
	public HashMap<String, RenderVariables> bulletMap = new HashMap<String, RenderVariables>();
	public HashMap<AttachmentEnum, Vector3f> attachmentPointMap = new HashMap<AttachmentEnum, Vector3f>();
	public Vector3f gunRenderOffset = new Vector3f(0f, 0f, 0f);
	public ArrayList<BreakActionData> breakActions = new ArrayList<BreakActionData>();
		
	public float triggerDistance = 0.02f;
	
	public boolean boltOnFire = false;

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

    public static void glowOff() {
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

	public void renderBreakAction(float f)
	{
		render(breakActionModel, f);
	}

	public void renderHammer(float f)
	{
		render(hammerModel, f);
	}
	
	public void renderLeverAction(float f)
	{
		render(leverActionModel, f);
	}
	
	public void renderTrigger(float f)
	{
		render(triggerModel, f);
	}
	public void renderSwitch(float f)
	{
		render(switchModel, f);
	}

	/** Flips models because toolbox exports upside down */
	@Override
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
		flip(breakActionModel);
		flip(hammerModel);
		flip(leverActionModel);
		flip(triggerModel);
		flip(switchModel);
	}
	
	public boolean hasArms()
	{
		return leftArmPos != null || rightArmPos != null;
	}
	
	public boolean isType(EnumArm arm, EnumAction action)
	{
		return actionArm == arm && actionType == action;
	}
	
	public enum EnumArm 
	{
		Left, Right;
	}
	
	public enum EnumAction 
	{
		Bolt, Pump, Charge
	}
	
}