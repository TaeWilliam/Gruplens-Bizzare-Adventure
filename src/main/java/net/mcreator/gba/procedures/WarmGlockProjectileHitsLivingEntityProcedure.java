package net.mcreator.gba.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class WarmGlockProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
		if (true == entity.isInWaterRainOrBubble()) {
			entity.hurt(DamageSource.ON_FIRE, 2);
		}
	}
}
