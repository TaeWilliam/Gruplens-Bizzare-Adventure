package net.mcreator.gba.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.gba.init.GbaModEntities;
import net.mcreator.gba.entity.SenatorArmstaerkEntity;

public class SenatorenPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new SenatorArmstaerkEntity(GbaModEntities.SENATOR_ARMSTAERK.get(), _level);
			entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gba:detblvnodttilatvr")), SoundSource.MUSIC, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gba:detblvnodttilatvr")), SoundSource.MUSIC, 1, 1, false);
			}
		}
	}
}
