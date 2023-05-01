
package net.mcreator.gba.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.gba.procedures.DiarrheaMobplayerCollidesBlockProcedure;
import net.mcreator.gba.init.GbaModFluids;

public class DiarrheaBlock extends LiquidBlock {
	public DiarrheaBlock() {
		super(() -> GbaModFluids.DIARRHEA.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.DIRT).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		DiarrheaMobplayerCollidesBlockProcedure.execute(entity);
	}
}
