
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.TrueBrondbyEntity;
import net.mcreator.gba.client.model.ModelSvensker;

public class TrueBrondbyRenderer extends MobRenderer<TrueBrondbyEntity, ModelSvensker<TrueBrondbyEntity>> {
	public TrueBrondbyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSvensker(context.bakeLayer(ModelSvensker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrueBrondbyEntity entity) {
		return new ResourceLocation("gba:textures/entities/brondby.png");
	}
}
