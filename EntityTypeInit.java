package com.matias.nightfallstalker.core.init;

import com.matias.nightfallstalker.NightfallStalkerMod;
import com.matias.nightfallstalker.entity.NightfallStalkerEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, NightfallStalkerMod.MOD_ID);

    public static final RegistryObject<EntityType<NightfallStalkerEntity>> NIGHTFALL_STALKER =
            ENTITY_TYPES.register("nightfall_stalker",
                    () -> EntityType.Builder.<NightfallStalkerEntity>create(NightfallStalkerEntity::new, EntityClassification.MONSTER)
                            .size(0.6F, 1.95F)
                            .trackingRange(8)
                            .build("nightfall_stalker"));
}
