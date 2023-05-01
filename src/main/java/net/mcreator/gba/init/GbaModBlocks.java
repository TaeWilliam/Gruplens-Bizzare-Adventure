
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gba.block.DiarrheaBlock;
import net.mcreator.gba.GbaMod;

public class GbaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GbaMod.MODID);
	public static final RegistryObject<Block> DIARRHEA = REGISTRY.register("diarrhea", () -> new DiarrheaBlock());
}
