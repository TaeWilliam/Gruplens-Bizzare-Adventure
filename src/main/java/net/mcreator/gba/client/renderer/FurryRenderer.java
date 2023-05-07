
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.FurryEntity;
import net.mcreator.gba.client.model.ModelFurry;

public class FurryRenderer extends MobRenderer<FurryEntity, ModelFurry<FurryEntity>> {
	public FurryRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFurry(context.bakeLayer(ModelFurry.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FurryEntity entity) {
		return new ResourceLocation("gba:textures/entities/furrytextyre.png");
	}
}
