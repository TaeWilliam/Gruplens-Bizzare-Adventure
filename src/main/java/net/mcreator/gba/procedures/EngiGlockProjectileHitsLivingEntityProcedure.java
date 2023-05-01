package net.mcreator.gba.procedures;

import net.minecraft.world.entity.Entity;

public class EngiGlockProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.startRiding(sourceentity);
	}
}
