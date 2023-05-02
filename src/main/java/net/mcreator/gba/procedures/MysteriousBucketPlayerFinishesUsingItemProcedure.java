package net.mcreator.gba.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.gba.init.GbaModBlocks;

public class MysteriousBucketPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ()), GbaModBlocks.DIARRHEA.get().defaultBlockState(), 3);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("HVORFOR VILLE DU NOGENSINDE G\u00D8RE DET??? DU VED SELV HVEM DU ER"), false);
		}
	}
}
