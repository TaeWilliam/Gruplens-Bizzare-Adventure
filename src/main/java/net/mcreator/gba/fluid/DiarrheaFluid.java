
package net.mcreator.gba.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.gba.init.GbaModItems;
import net.mcreator.gba.init.GbaModFluids;
import net.mcreator.gba.init.GbaModFluidTypes;
import net.mcreator.gba.init.GbaModBlocks;

public abstract class DiarrheaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GbaModFluidTypes.DIARRHEA_TYPE.get(), () -> GbaModFluids.DIARRHEA.get(), () -> GbaModFluids.FLOWING_DIARRHEA.get()).explosionResistance(100f)
			.bucket(() -> GbaModItems.DIARRHEA_BUCKET.get()).block(() -> (LiquidBlock) GbaModBlocks.DIARRHEA.get());

	private DiarrheaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DiarrheaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DiarrheaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
