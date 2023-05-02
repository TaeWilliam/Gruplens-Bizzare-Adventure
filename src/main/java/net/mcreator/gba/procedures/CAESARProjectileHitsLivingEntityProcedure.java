package net.mcreator.gba.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CAESARProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		world.setBlock(new BlockPos(x, 7 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, 6 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(1 + entity.getX(), 6 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(1 + entity.getX(), 7 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(-1 + entity.getX(), 6 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(-1 + entity.getX(), 7 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(-2 + entity.getX(), 6 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(-2 + entity.getX(), 7 + entity.getY(), z), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, 7 + entity.getY(), 1 + entity.getZ()), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, 6 + entity.getY(), 1 + entity.getZ()), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, 7 + entity.getY(), -1 + entity.getZ()), Blocks.GRAVEL.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, 6 + entity.getY(), -1 + entity.getZ()), Blocks.GRAVEL.defaultBlockState(), 3);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gba:caesar")), SoundSource.MASTER, 10, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("gba:caesar")), SoundSource.MASTER, 10, 1, false);
			}
		}
	}
}
