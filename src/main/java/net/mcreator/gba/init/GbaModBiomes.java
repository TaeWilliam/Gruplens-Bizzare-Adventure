
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.gba.world.biome.HrellBiome;
import net.mcreator.gba.GbaMod;

public class GbaModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, GbaMod.MODID);
	public static final RegistryObject<Biome> HRELL = REGISTRY.register("hrell", HrellBiome::createBiome);
}
