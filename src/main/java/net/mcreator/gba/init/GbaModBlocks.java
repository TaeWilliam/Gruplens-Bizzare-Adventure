
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gba.block.TheWorstMineBlock;
import net.mcreator.gba.block.SverigePortalBlock;
import net.mcreator.gba.block.SvenskerblockBlock;
import net.mcreator.gba.block.MineBlock;
import net.mcreator.gba.block.LightningMineBlock;
import net.mcreator.gba.block.GucciBlock;
import net.mcreator.gba.block.FurrymineBlock;
import net.mcreator.gba.block.EngishelvedePortalBlock;
import net.mcreator.gba.block.EngiMineBlock;
import net.mcreator.gba.block.EnFejlBlock;
import net.mcreator.gba.block.DiarrheaBlock;
import net.mcreator.gba.block.CumDimentionPortalBlock;
import net.mcreator.gba.block.CumBlock;
import net.mcreator.gba.GbaMod;

public class GbaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GbaMod.MODID);
	public static final RegistryObject<Block> DIARRHEA = REGISTRY.register("diarrhea", () -> new DiarrheaBlock());
	public static final RegistryObject<Block> ENGISHELVEDE_PORTAL = REGISTRY.register("engishelvede_portal", () -> new EngishelvedePortalBlock());
	public static final RegistryObject<Block> SVENSKERBLOCK = REGISTRY.register("svenskerblock", () -> new SvenskerblockBlock());
	public static final RegistryObject<Block> SVERIGE_PORTAL = REGISTRY.register("sverige_portal", () -> new SverigePortalBlock());
	public static final RegistryObject<Block> EN_FEJL = REGISTRY.register("en_fejl", () -> new EnFejlBlock());
	public static final RegistryObject<Block> CUM = REGISTRY.register("cum", () -> new CumBlock());
	public static final RegistryObject<Block> CUM_DIMENTION_PORTAL = REGISTRY.register("cum_dimention_portal", () -> new CumDimentionPortalBlock());
	public static final RegistryObject<Block> GUCCI = REGISTRY.register("gucci", () -> new GucciBlock());
	public static final RegistryObject<Block> MINE = REGISTRY.register("mine", () -> new MineBlock());
	public static final RegistryObject<Block> LIGHTNING_MINE = REGISTRY.register("lightning_mine", () -> new LightningMineBlock());
	public static final RegistryObject<Block> FURRYMINE = REGISTRY.register("furrymine", () -> new FurrymineBlock());
	public static final RegistryObject<Block> THE_WORST_MINE = REGISTRY.register("the_worst_mine", () -> new TheWorstMineBlock());
	public static final RegistryObject<Block> ENGI_MINE = REGISTRY.register("engi_mine", () -> new EngiMineBlock());
}
