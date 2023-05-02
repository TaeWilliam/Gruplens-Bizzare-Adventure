package net.mcreator.gba.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

public class HjemmeforsvarspindLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double kills = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 0) {
			kills = kills + 1;
		}
		if (4 <= kills) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(Component.literal(
							"Jeg ejer en pind til hjemmeforsvar, da det var det, kongen havde til hensigt til. Fire svenskere bryder ind i mit hus. \"Hvad fanden?\" Jeg tager fat i min korstogtshjelm og min pind. Jeg sl\u00E5r den f\u00F8rste mand i hovedet med min pind. Han er d\u00F8d p\u00E5 stedet. Jeg kaster pinden v\u00E6k og tr\u00E6kker min 2x4 tr\u00E6br\u00E6t og sl\u00E5r p\u00E5 den anden mand, men den kn\u00E6kker da den er k\u00F8bt fra wish, og naboens hund begynder at l\u00F8be efter min pind. Jeg er n\u00F8dt til at ty til et tr\u00E6 som jeg monteret p\u00E5 toppen af \u200B\u200Btrappen, \"T\u00F8mmer gutter\" Jeg f\u00E6lder tr\u00E6et som v\u00E6lter ned af trappen og knuser to m\u00E6nd i faldet, lyden og splinterne s\u00E6tter bilalarmer i gang. Jeg tager min 3 meter lange pind med en spids ende og spidder den sidste skr\u00E6kslagne svensker. Han bl\u00F8der ud mens han venter p\u00E5 politiets ankomst, da han ikke er st\u00E6rk nok til at fjerne den igen. Pr\u00E6cis som kongen havde til hensigt."),
							false);
			}
			kills = 0;
		}
	}
}
