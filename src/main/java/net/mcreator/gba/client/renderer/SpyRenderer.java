
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.SpyEntity;
import net.mcreator.gba.client.model.Modelgenerticdudde;

public class SpyRenderer extends MobRenderer<SpyEntity, Modelgenerticdudde<SpyEntity>> {
	public SpyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgenerticdudde(context.bakeLayer(Modelgenerticdudde.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpyEntity entity) {
		return new ResourceLocation("gba:textures/entities/dude.png");
	}
}
