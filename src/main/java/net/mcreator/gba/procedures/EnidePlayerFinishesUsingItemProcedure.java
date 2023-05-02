package net.mcreator.gba.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.gba.init.GbaModItems;

public class EnidePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ide = 0;
		ide = Mth.nextInt(RandomSource.create(), 1, 3);
		if (ide == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GbaModItems.SIMONSIDE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (ide == 2) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Hvad mon der vil ske hvis jeg blandede diarrhea og en mystisk spand "), (true));
		} else if (ide == 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GbaModItems.HJEMMEFORSVARSPIND.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
