
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.gba.fluid.DiarrheaFluid;
import net.mcreator.gba.fluid.CumFluid;
import net.mcreator.gba.GbaMod;

public class GbaModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, GbaMod.MODID);
	public static final RegistryObject<FlowingFluid> DIARRHEA = REGISTRY.register("diarrhea", () -> new DiarrheaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_DIARRHEA = REGISTRY.register("flowing_diarrhea", () -> new DiarrheaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CUM = REGISTRY.register("cum", () -> new CumFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CUM = REGISTRY.register("flowing_cum", () -> new CumFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(DIARRHEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DIARRHEA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CUM.get(), RenderType.translucent());
		}
	}
}
