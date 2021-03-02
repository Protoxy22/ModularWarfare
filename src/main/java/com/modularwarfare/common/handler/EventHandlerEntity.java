package com.modularwarfare.common.handler;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.ArmorApi;
import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.cap.ArmorCapabilities;
import com.modularwarfare.api.cap.ArmorContainer;
import com.modularwarfare.api.cap.ArmorContainerProvider;
import com.modularwarfare.api.cap.IArmorItemHandler;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import com.modularwarfare.common.entity.decals.EntityDecal;
import com.modularwarfare.common.network.PacketDecal;
import com.modularwarfare.common.network.PacketSync;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

import java.util.*;


public class EventHandlerEntity {


	private HashMap<UUID, ItemStack[]> armorsSync;

	public EventHandlerEntity() {
		this.armorsSync = new HashMap<UUID, ItemStack[]>();
	}

	@SubscribeEvent
	public void cloneCapabilitiesEvent(final PlayerEvent.Clone event) {
		try {
			final ArmorContainer bco = (ArmorContainer)ArmorApi.getArmorHandler(event.getOriginal());
			final NBTTagCompound nbt = bco.serializeNBT();
			final ArmorContainer bcn = (ArmorContainer)ArmorApi.getArmorHandler(event.getEntityPlayer());
			bcn.deserializeNBT(nbt);
		}
		catch (Exception ex) {}
	}

	@SubscribeEvent
	public void attachCapabilitiesPlayer(final AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof EntityPlayer) {
			event.addCapability(new ResourceLocation("modularwarfare", "container"), new ArmorContainerProvider(new ArmorContainer()));
		}
	}

	@SubscribeEvent
	public void playerJoin(final EntityJoinWorldEvent event) {
		final Entity entity = event.getEntity();
		if (entity instanceof EntityPlayerMP) {
			final EntityPlayerMP player = (EntityPlayerMP)entity;
			this.syncSlots(player, Collections.singletonList(player));
		}
	}

	@SubscribeEvent
	public void onStartTracking(final PlayerEvent.StartTracking event) {
		final Entity target = event.getTarget();
		if (target instanceof EntityPlayerMP) {
			this.syncSlots((EntityPlayerMP)target, Collections.singletonList(event.getEntityPlayer()));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedOut(final net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent event) {
		this.armorsSync.remove(event.player.getUniqueID());
	}

	@SubscribeEvent
	public void onLivingAttack(final LivingDamageEvent event) {
		if (event.getEntity() instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) event.getEntity();
			final IArmorItemHandler armors = ArmorApi.getArmorHandler(player);
			for (int i = 0; i < armors.getSlots(); ++i) {
				final ItemStack stack = armors.getStackInSlot(i);
				final IArmor armor = stack.getCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null);
				if (armor != null) {
					ArmorType armorType = ((ItemSpecialArmor) stack.getItem()).type;
					final float finalDamage = (float)(event.getAmount()-armorType.defense);
					event.setAmount(finalDamage);
				}
			}
		}
	}


	@SubscribeEvent
	public void playerTick(final TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			final EntityPlayer player = event.player;
			final IArmorItemHandler armors = ArmorApi.getArmorHandler(player);
			for (int i = 0; i < armors.getSlots(); ++i) {
				final ItemStack stack = armors.getStackInSlot(i);
				final IArmor armor = stack.getCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null);
				if (armor != null) {
					armor.onWornTick(stack, player);
				}
			}
			if (!player.world.isRemote) {
				this.syncArmors(player, armors);
			}
		}
	}

	private void syncArmors(final EntityPlayer player, final IArmorItemHandler baubles) {
		ItemStack[] items = this.armorsSync.get(player.getUniqueID());
		if (items == null) {
			items = new ItemStack[baubles.getSlots()];
			Arrays.fill(items, ItemStack.EMPTY);
			this.armorsSync.put(player.getUniqueID(), items);
		}
		if (items.length != baubles.getSlots()) {
			final ItemStack[] old = items;
			items = new ItemStack[baubles.getSlots()];
			System.arraycopy(old, 0, items, 0, Math.min(old.length, items.length));
			this.armorsSync.put(player.getUniqueID(), items);
		}
		Set<EntityPlayer> receivers = null;
		for (int i = 0; i < baubles.getSlots(); ++i) {
			final ItemStack stack = baubles.getStackInSlot(i);
			final IArmor bauble = stack.getCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null);
			if (baubles.isChanged(i) || (bauble != null && bauble.willAutoSync(stack, player) && !ItemStack.areItemStacksEqual(stack, items[i]))) {
				if (receivers == null) {
					receivers = new HashSet<EntityPlayer>(((WorldServer)player.world).getEntityTracker().getTrackingPlayers(player));
					receivers.add(player);
				}
				this.syncSlot(player, i, stack, receivers);
				baubles.setChanged(i, false);
				items[i] = ((stack == null) ? ItemStack.EMPTY : stack.copy());
			}
		}
	}

	private void syncSlots(final EntityPlayer player, final Collection<? extends EntityPlayer> receivers) {
		final IArmorItemHandler armors = ArmorApi.getArmorHandler(player);
		for (int i = 0; i < armors.getSlots(); ++i) {
			this.syncSlot(player, i, armors.getStackInSlot(i), receivers);
		}
	}

	private void syncSlot(final EntityPlayer player, final int slot, final ItemStack stack, final Collection<? extends EntityPlayer> receivers) {
		final PacketSync pkt = new PacketSync(player, slot, stack);
		for (final EntityPlayer receiver : receivers) {
			ModularWarfare.NETWORK.sendTo(pkt, (EntityPlayerMP)receiver);
		}
	}

	@SubscribeEvent
	public void playerDeath(final PlayerDropsEvent event) {
		if (event.getEntity() instanceof EntityPlayer && !event.getEntity().world.isRemote && !event.getEntity().world.getGameRules().getBoolean("keepInventory")) {
			this.dropItemsAt(event.getEntityPlayer(), event.getDrops(), event.getEntityPlayer());
		}
	}

	public void dropItemsAt(final EntityPlayer player, final List<EntityItem> drops, final Entity e) {
		final IArmorItemHandler armors = ArmorApi.getArmorHandler(player);
		for (int i = 0; i < armors.getSlots(); ++i) {
			if (armors.getStackInSlot(i) != null && !armors.getStackInSlot(i).isEmpty()) {
				final EntityItem ei = new EntityItem(e.world, e.posX, e.posY + e.getEyeHeight(), e.posZ, armors.getStackInSlot(i).copy());
				ei.setPickupDelay(40);
				final float f1 = e.world.rand.nextFloat() * 0.5f;
				final float f2 = e.world.rand.nextFloat() * 3.1415927f * 2.0f;
				ei.motionX = -MathHelper.sin(f2) * f1;
				ei.motionZ = MathHelper.cos(f2) * f1;
				ei.motionY = 0.20000000298023224;
				drops.add(ei);
				armors.setStackInSlot(i, ItemStack.EMPTY);
			}
		}
	}


	@SubscribeEvent
	public void onLivingHurt(final LivingAttackEvent event) {
		if (!event.getEntityLiving().world.isRemote)
			return;
		final Entity entity = event.getEntity();
		if (entity.getEntityWorld().isRemote) {
			ModularWarfare.PROXY.addBlood(event.getEntityLiving(), 10, true);
		}
	}



	@SubscribeEvent
	public static void onPlayerKilled(LivingDeathEvent e) {
		if (e.getEntity() instanceof EntityPlayer) {
			ModularWarfare.PROXY.resetSens();
		}
	}
}
