package net.mcreator.gba.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

public class FriendlyGucciEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("Jeg vil ikke l\u00E6ngere begr\u00E6nses af at f\u00F8lge en anden persons historie. Jeg vil lave min egen."), false);
		}
	}
}
