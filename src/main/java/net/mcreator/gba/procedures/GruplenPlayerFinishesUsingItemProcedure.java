package net.mcreator.gba.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.gba.init.GbaModItems;

public class GruplenPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(GbaModItems.GRUPLENSIDER.get());
			_setstack.setCount(12);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
