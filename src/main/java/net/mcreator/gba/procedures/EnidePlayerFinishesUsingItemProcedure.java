package net.mcreator.gba.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.gba.init.GbaModItems;

import java.util.Iterator;

public class EnidePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ide = 0;
		ide = Mth.nextInt(RandomSource.create(), 1, 5);
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
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("hvad mon der ville ske hvis jeg lavede en cobblestone portal og brugte denne igniter?"), (true));
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("gba:ahnej"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if (ide == 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GbaModItems.HJEMMEFORSVARSPIND.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Hvad mon der vil ske hvis jeg slog nogle svenskere med en pind?"), (true));
		} else if (ide == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GbaModItems.POINT.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Jeg har lyst til at pege p\u00E5 nogen"), (true));
		}
	}
}
