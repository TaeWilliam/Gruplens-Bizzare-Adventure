package net.mcreator.gba.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class EngiGlockRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.addParticle(ParticleTypes.EXPLOSION, (entity.getX()), (entity.getY()), (entity.getZ()), 0, 1, 0);
	}
}
