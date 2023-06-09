
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.gba.fluid.types.DiarrheaFluidType;
import net.mcreator.gba.fluid.types.CumFluidType;
import net.mcreator.gba.GbaMod;

public class GbaModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GbaMod.MODID);
	public static final RegistryObject<FluidType> DIARRHEA_TYPE = REGISTRY.register("diarrhea", () -> new DiarrheaFluidType());
	public static final RegistryObject<FluidType> CUM_TYPE = REGISTRY.register("cum", () -> new CumFluidType());
}
