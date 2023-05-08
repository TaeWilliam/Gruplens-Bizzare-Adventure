
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import org.lwjgl.system.windows.POINT;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gba.item.WarmGlockItem;
import net.mcreator.gba.item.UncontrollableMininukeItem;
import net.mcreator.gba.item.TheTeamItem;
import net.mcreator.gba.item.SverigeItem;
import net.mcreator.gba.item.SniperentityItem;
import net.mcreator.gba.item.SmallBulletItem;
import net.mcreator.gba.item.SimonsideItem;
import net.mcreator.gba.item.SenatorenItem;
import net.mcreator.gba.item.STOPItem;
import net.mcreator.gba.item.ROADROLLERItem;
import net.mcreator.gba.item.PyroGunItem;
import net.mcreator.gba.item.PointItem;
import net.mcreator.gba.item.MystisknogleItem;
import net.mcreator.gba.item.MysteriousBucketItem;
import net.mcreator.gba.item.ModelbilItem;
import net.mcreator.gba.item.LukasessvaerdItem;
import net.mcreator.gba.item.HordeItem;
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
import net.mcreator.gba.item.CumItem;
import net.mcreator.gba.item.CumDimentionItem;
import net.mcreator.gba.item.CAESARItem;
import net.mcreator.gba.item.BurningBulletItem;
import net.mcreator.gba.item.AshItem;
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
	public static final RegistryObject<Item> CAESAR = REGISTRY.register("caesar", () -> new CAESARItem());
	public static final RegistryObject<Item> SVENSKER_SPAWN_EGG = REGISTRY.register("svensker_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.SVENSKER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BRONDBY_SPAWN_EGG = REGISTRY.register("brondby_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.BRONDBY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TRUE_BRONDBY_SPAWN_EGG = REGISTRY.register("true_brondby_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.TRUE_BRONDBY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SUSPICIUSTHING_SPAWN_EGG = REGISTRY.register("suspiciusthing_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.SUSPICIUSTHING, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SVENSKERBLOCK = block(GbaModBlocks.SVENSKERBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SVERIGE = REGISTRY.register("sverige", () -> new SverigeItem());
	public static final RegistryObject<Item> EN_FEJL = block(GbaModBlocks.EN_FEJL, null);
	public static final RegistryObject<Item> GUCCI_BE_PISSED_SPAWN_EGG = REGISTRY.register("gucci_be_pissed_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.GUCCI_BE_PISSED, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CUM_BUCKET = REGISTRY.register("cum_bucket", () -> new CumItem());
	public static final RegistryObject<Item> CUM_DIMENTION = REGISTRY.register("cum_dimention", () -> new CumDimentionItem());
	public static final RegistryObject<Item> POINT = REGISTRY.register("point", () -> new PointItem());
	public static final RegistryObject<Item> SCOUT_SPAWN_EGG = REGISTRY.register("scout_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.SCOUT, -3407872, -16776961, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HEAVY_SPAWN_EGG = REGISTRY.register("heavy_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.HEAVY, -52480, -16777063, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNIPERENTITY = REGISTRY.register("sniperentity", () -> new SniperentityItem());
	public static final RegistryObject<Item> SNIPER_SPAWN_EGG = REGISTRY.register("sniper_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.SNIPER, -16777012, -3407872, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SOLDIER_SPAWN_EGG = REGISTRY.register("soldier_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.SOLDIER, -3407821, -16777063, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPY_SPAWN_EGG = REGISTRY.register("spy_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.SPY, -6750157, -16777012, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> THE_TEAM = REGISTRY.register("the_team", () -> new TheTeamItem());
	public static final RegistryObject<Item> GUCCI = block(GbaModBlocks.GUCCI, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FURRY_SPAWN_EGG = REGISTRY.register("furry_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.FURRY, -16724788, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ASH = REGISTRY.register("ash", () -> new AshItem());
	public static final RegistryObject<Item> HORDE = REGISTRY.register("horde", () -> new HordeItem());
	public static final RegistryObject<Item> PYRO_GUN = REGISTRY.register("pyro_gun", () -> new PyroGunItem());
	public static final RegistryObject<Item> PYRO_SPAWN_EGG = REGISTRY.register("pyro_spawn_egg", () -> new ForgeSpawnEggItem(GbaModEntities.PYRO, -3407821, -13421569, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> UNCONTROLLABLE_MININUKE = REGISTRY.register("uncontrollable_mininuke", () -> new UncontrollableMininukeItem());
	public static final RegistryObject<Item> MINE = block(GbaModBlocks.MINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIGHTNING_MINE = block(GbaModBlocks.LIGHTNING_MINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FURRYMINE = block(GbaModBlocks.FURRYMINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> THE_WORST_MINE = block(GbaModBlocks.THE_WORST_MINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENGI_MINE = block(GbaModBlocks.ENGI_MINE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
