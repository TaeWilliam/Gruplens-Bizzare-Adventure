
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.SoldierEntity;
import net.mcreator.gba.client.model.Modelgenerticdudde;

public class SoldierRenderer extends MobRenderer<SoldierEntity, Modelgenerticdudde<SoldierEntity>> {
	public SoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgenerticdudde(context.bakeLayer(Modelgenerticdudde.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoldierEntity entity) {
		return new ResourceLocation("gba:textures/entities/dude.png");
	}
}
