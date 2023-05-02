
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.FriendlyGucciEntity;
import net.mcreator.gba.client.model.Modelgucci;

public class FriendlyGucciRenderer extends MobRenderer<FriendlyGucciEntity, Modelgucci<FriendlyGucciEntity>> {
	public FriendlyGucciRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgucci(context.bakeLayer(Modelgucci.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FriendlyGucciEntity entity) {
		return new ResourceLocation("gba:textures/entities/gucvi1.png");
	}
}
