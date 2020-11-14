package com.modularwarfare.common.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import com.modularwarfare.common.guns.*;

public class ContentTypes {

	public static ArrayList<TypeEntry> values = new ArrayList<TypeEntry>();
	private static int typeId = 0;

	public static void registerTypes() {
		registerType("guns", GunType.class, (type, reload) -> { ContentTypes.<GunType, ItemGun>assignType(ModularWarfare.gunTypes, ItemGun.factory, (GunType)type, reload); } );
		registerType("ammo", AmmoType.class, (type, reload) -> { ContentTypes.<AmmoType, ItemAmmo>assignType(ModularWarfare.ammoTypes, ItemAmmo.factory, (AmmoType)type, reload); } );
		registerType("attachments", AttachmentType.class, (type, reload) -> { ContentTypes.<AttachmentType, ItemAttachment>assignType(ModularWarfare.attachmentTypes, ItemAttachment.factory, (AttachmentType) type, reload); });
		registerType("armor", ArmorType.class, (type, reload) -> {
			ArmorType armorType = (ArmorType)type;
			if(!reload) {
				for (MWArmorType mwArmorType : armorType.armorTypes.keySet()) {
					if (MWArmorType.isVanilla(mwArmorType)) {
						ModularWarfare.armorTypes.put(armorType.internalName + "_" + mwArmorType.name().toLowerCase(), new ItemMWArmor(armorType, mwArmorType));
					} else {
						ModularWarfare.specialArmorTypes.put(armorType.internalName, new ItemSpecialArmor(armorType, mwArmorType));
					}
				}
			}else
			{
				ModularWarfare.armorTypes.get(type.internalName).setType((ArmorType) type);
			}
		});
		registerType("bullets", BulletType.class, (type, reload) -> { ContentTypes.<BulletType, ItemBullet>assignType(ModularWarfare.bulletTypes, ItemBullet.factory, (BulletType) type, reload); });
		registerType("sprays", SprayType.class, (type, reload) -> { ContentTypes.<SprayType, ItemSpray>assignType(ModularWarfare.sprayTypes, ItemSpray.factory, (SprayType)type, reload); });
	}

	private static <T extends BaseType, U extends BaseItem> void assignType(HashMap<String, U> map, Function<T, U> factory, T type, Boolean reload) {
		if(reload) {
			map.get(type.internalName).setType(type);
		}else
		{
			map.put(type.internalName, factory.apply(type));
		}
	}

	public static void registerType(String name, Class<? extends BaseType> typeClass, BiConsumer<BaseType, Boolean> typeAssignFunction) {
		values.add(new TypeEntry(name, typeClass, typeId, typeAssignFunction));
		typeId += 1;
	}

}
