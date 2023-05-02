
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

public abstract class CumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GbaModFluidTypes.CUM_TYPE.get(), () -> GbaModFluids.CUM.get(), () -> GbaModFluids.FLOWING_CUM.get()).explosionResistance(100f)
			.levelDecreasePerBlock(2).bucket(() -> GbaModItems.CUM_BUCKET.get()).block(() -> (LiquidBlock) GbaModBlocks.CUM.get());

	private CumFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CumFluid {
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
