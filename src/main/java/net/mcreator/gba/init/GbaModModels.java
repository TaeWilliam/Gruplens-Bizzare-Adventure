
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.gba.client.model.Modelsenator;
import net.mcreator.gba.client.model.Modelroadroller;
import net.mcreator.gba.client.model.Modelgucci;
import net.mcreator.gba.client.model.Modelgenerticdudde;
import net.mcreator.gba.client.model.Modelcustom_model;
import net.mcreator.gba.client.model.ModelSvensker;
import net.mcreator.gba.client.model.ModelSuspicious_Entity;
import net.mcreator.gba.client.model.ModelFurry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GbaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSvensker.LAYER_LOCATION, ModelSvensker::createBodyLayer);
		event.registerLayerDefinition(Modelgucci.LAYER_LOCATION, Modelgucci::createBodyLayer);
		event.registerLayerDefinition(Modelroadroller.LAYER_LOCATION, Modelroadroller::createBodyLayer);
		event.registerLayerDefinition(Modelsenator.LAYER_LOCATION, Modelsenator::createBodyLayer);
		event.registerLayerDefinition(Modelgenerticdudde.LAYER_LOCATION, Modelgenerticdudde::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelFurry.LAYER_LOCATION, ModelFurry::createBodyLayer);
		event.registerLayerDefinition(ModelSuspicious_Entity.LAYER_LOCATION, ModelSuspicious_Entity::createBodyLayer);
	}
}
