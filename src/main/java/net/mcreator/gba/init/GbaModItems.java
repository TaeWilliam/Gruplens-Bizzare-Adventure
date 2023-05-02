
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.gba.item.WarmGlockItem;
import net.mcreator.gba.item.SmallBulletItem;
import net.mcreator.gba.item.MystisknogleItem;
import net.mcreator.gba.item.MysteriousBucketItem;
import net.mcreator.gba.item.GuccisabnebogItem;
import net.mcreator.gba.item.GuccisBogItem;
import net.mcreator.gba.item.GlockItem;
import net.mcreator.gba.item.EngiGlockItem;
import net.mcreator.gba.item.DiarrheaItem;
import net.mcreator.gba.item.BurningBulletItem;
import net.mcreator.gba.GbaMod;

public class GbaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GbaMod.MODID);
	public static final RegistryObject<Item> SMALL_BULLET = REGISTRY.register("small_bullet", () -> new SmallBulletItem());
	public static final RegistryObject<Item> GLOCK = REGISTRY.register("glock", () -> new GlockItem());
	public static final RegistryObject<Item> BURNING_BULLET = REGISTRY.register("burning_bullet", () -> new BurningBulletItem());
	public static final RegistryObject<Item> WARM_GLOCK = REGISTRY.register("warm_glock", () -> new WarmGlockItem());
	public static final RegistryObject<Item> ENGI_GLOCK = REGISTRY.register("engi_glock", () -> new EngiGlockItem());
	public static final RegistryObject<Item> MYSTERIOUS_BUCKET = REGISTRY.register("mysterious_bucket", () -> new MysteriousBucketItem());
	public static final RegistryObject<Item> DIARRHEA_BUCKET = REGISTRY.register("diarrhea_bucket", () -> new DiarrheaItem());
	public static final RegistryObject<Item> GUCCIS_BOG = REGISTRY.register("guccis_bog", () -> new GuccisBogItem());
	public static final RegistryObject<Item> MYSTISKNOGLE = REGISTRY.register("mystisknogle", () -> new MystisknogleItem());
	public static final RegistryObject<Item> GUCCISABNEBOG = REGISTRY.register("guccisabnebog", () -> new GuccisabnebogItem());
}
