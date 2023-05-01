package net.mcreator.gba.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import net.mcreator.gba.init.GbaModBlocks;

public class MysteriousBucketPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ()), GbaModBlocks.DIARRHEA.get().defaultBlockState(), 3);
		entity.hurt(DamageSource.DROWN, 9999);
	}
}
