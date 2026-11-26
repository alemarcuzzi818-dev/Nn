package com.matias.nightfallstalker;

import com.matias.nightfallstalker.core.init.EntityTypeInit;
import com.matias.nightfallstalker.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NightfallStalkerMod.MOD_ID)
public class NightfallStalkerMod {
    public static final String MOD_ID = "nightfallstalker";
    public static final Logger LOGGER = LogManager.getLogger();

    public NightfallStalkerMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityTypeInit.ENTITY_TYPES.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("[Nightfall Stalker] Mod cargado correctamente");
    }
}
