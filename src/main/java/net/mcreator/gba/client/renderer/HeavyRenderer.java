
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.HeavyEntity;
import net.mcreator.gba.client.model.Modelgenerticdudde;

public class HeavyRenderer extends MobRenderer<HeavyEntity, Modelgenerticdudde<HeavyEntity>> {
	public HeavyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgenerticdudde(context.bakeLayer(Modelgenerticdudde.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeavyEntity entity) {
		return new ResourceLocation("gba:textures/entities/dude.png");
	}
}
