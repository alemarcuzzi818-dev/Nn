package com.matias.nightfallstalker.core;

import com.matias.nightfallstalker.NightfallStalkerMod;
import com.matias.nightfallstalker.core.init.EntityTypeInit;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// NOTA: BiomeLoadingEvent va en el FORGE EVENT BUS (bus por defecto)
@Mod.EventBusSubscriber(modid = NightfallStalkerMod.MOD_ID)
public class WorldEvents {

    // Spawn natural de noche en Overworld (peso 20, grupos de 1-2)
    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        Biome.Category category = event.getCategory();
        if (category == null) return;
        if (category == Biome.Category.NETHER
                || category == Biome.Category.THEEND
                || category == Biome.Category.OCEAN) {
            return;
        }
        event.getSpawns().withSpawner(EntityClassification.MONSTER,
                new MobSpawnInfo.Spawners(EntityTypeInit.NIGHTFALL_STALKER.get(), 20, 1, 2));
    }
}
