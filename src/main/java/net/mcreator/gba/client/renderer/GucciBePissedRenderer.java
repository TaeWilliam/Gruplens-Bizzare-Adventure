
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.GucciBePissedEntity;
import net.mcreator.gba.client.model.Modelgucci;

public class GucciBePissedRenderer extends MobRenderer<GucciBePissedEntity, Modelgucci<GucciBePissedEntity>> {
	public GucciBePissedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgucci(context.bakeLayer(Modelgucci.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GucciBePissedEntity entity) {
		return new ResourceLocation("gba:textures/entities/gucvi1.png");
	}
}
