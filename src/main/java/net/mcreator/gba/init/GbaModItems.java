
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.gba.item.WarmGlockItem;
import net.mcreator.gba.item.SmallBulletItem;
import net.mcreator.gba.item.SimonsideItem;
import net.mcreator.gba.item.SenatorenItem;
import net.mcreator.gba.item.STOPItem;
import net.mcreator.gba.item.ROADROLLERItem;
import net.mcreator.gba.item.MystisknogleItem;
import net.mcreator.gba.item.MysteriousBucketItem;
import net.mcreator.gba.item.ModelbilItem;
import net.mcreator.gba.item.LukasessvaerdItem;
import net.mcreator.gba.item.HjemmeforsvarspindItem;
import net.mcreator.gba.item.GucciskorsItem;
import net.mcreator.gba.item.GuccisabnebogItem;
import net.mcreator.gba.item.GuccisBogItem;
import net.mcreator.gba.item.GruplensiderItem;
import net.mcreator.gba.item.GruplenItem;
import net.mcreator.gba.item.GlockItem;
import net.mcreator.gba.item.EnideItem;
import net.mcreator.gba.item.EngishelvedeItem;
import net.mcreator.gba.item.EngiGlockItem;
import net.mcreator.gba.item.DrikkenItem;
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
	public static final RegistryObject<Item> ENGISHELVEDE = REGISTRY.register("engishelvede", () -> new EngishelvedeItem());
	public static final RegistryObject<Item> DRIKKEN = REGISTRY.register("drikken", () -> new DrikkenItem());
	public static final RegistryObject<Item> SIMONSIDE = REGISTRY.register("simonside", () -> new SimonsideItem());
	public static final RegistryObject<Item> ENIDE = REGISTRY.register("enide", () -> new EnideItem());
	public static final RegistryObject<Item> GRUPLENSIDER = REGISTRY.register("gruplensider", () -> new GruplensiderItem());
	public static final RegistryObject<Item> GRUPLEN = REGISTRY.register("gruplen", () -> new GruplenItem());
	public static final RegistryObject<Item> STOP = REGISTRY.register("stop", () -> new STOPItem());
	public static final RegistryObject<Item> ROADROLLER = REGISTRY.register("roadroller", () -> new ROADROLLERItem());
	public static final RegistryObject<Item> MODELBIL = REGISTRY.register("modelbil", () -> new ModelbilItem());
	public static final RegistryObject<Item> DAMPTROMLEE_SPAWN_EGG = REGISTRY.register("damptromlee_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.DAMPTROMLEE, -3355648, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FRIENDLY_GUCCI_SPAWN_EGG = REGISTRY.register("friendly_gucci_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.FRIENDLY_GUCCI, -3355444, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GUCCISKORS = REGISTRY.register("gucciskors", () -> new GucciskorsItem());
	public static final RegistryObject<Item> LUKASESSVAERD = REGISTRY.register("lukasessvaerd", () -> new LukasessvaerdItem());
	public static final RegistryObject<Item> HJEMMEFORSVARSPIND = REGISTRY.register("hjemmeforsvarspind", () -> new HjemmeforsvarspindItem());
	public static final RegistryObject<Item> SENATOR_ARMSTAERK_SPAWN_EGG = REGISTRY.register("senator_armstaerk_spawn_egg",
			() -> new ForgeSpawnEggItem(GbaModEntities.SENATOR_ARMSTAERK, -6710887, -26266, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SENATOREN = REGISTRY.register("senatoren", () -> new SenatorenItem());
}
