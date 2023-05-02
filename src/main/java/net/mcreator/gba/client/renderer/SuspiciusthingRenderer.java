
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.SuspiciusthingEntity;
import net.mcreator.gba.client.model.ModelSuspicious_Entity;

public class SuspiciusthingRenderer extends MobRenderer<SuspiciusthingEntity, ModelSuspicious_Entity<SuspiciusthingEntity>> {
	public SuspiciusthingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSuspicious_Entity(context.bakeLayer(ModelSuspicious_Entity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuspiciusthingEntity entity) {
		return new ResourceLocation("gba:textures/entities/tedddxture.png");
	}
}
