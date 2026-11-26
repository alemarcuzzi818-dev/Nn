package com.matias.nightfallstalker.core;

import com.matias.nightfallstalker.NightfallStalkerMod;
import com.matias.nightfallstalker.core.init.EntityTypeInit;
import com.matias.nightfallstalker.entity.NightfallStalkerEntity;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

// NOTA: estos dos eventos van en el MOD EVENT BUS
@Mod.EventBusSubscriber(modid = NightfallStalkerMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetup {

    // 1. Registrar atributos de la entidad (vida, velocidad, daño...)
    @SubscribeEvent
    public static void onAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(EntityTypeInit.NIGHTFALL_STALKER.get(),
                NightfallStalkerEntity.setCustomAttributes().create());
    }

    // 2. Donde puede aparecer (en el suelo, sobre bloques solidos)
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> EntitySpawnPlacementRegistry.register(
                EntityTypeInit.NIGHTFALL_STALKER.get(),
                EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                MonsterEntity::canMonsterSpawn));
    }
}
