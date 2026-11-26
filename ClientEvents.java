package com.matias.nightfallstalker.client;

import com.matias.nightfallstalker.NightfallStalkerMod;
import com.matias.nightfallstalker.client.render.NightfallStalkerRenderer;
import com.matias.nightfallstalker.core.init.EntityTypeInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NightfallStalkerMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() ->
                RenderingRegistry.registerEntityRenderingHandler(
                        EntityTypeInit.NIGHTFALL_STALKER.get(),
                        NightfallStalkerRenderer::new));
    }
}
