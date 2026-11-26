package com.matias.nightfallstalker.core.init;

import com.matias.nightfallstalker.NightfallStalkerMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NightfallStalkerMod.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> NIGHTFALL_STALKER_SPAWN_EGG =
            ITEMS.register("nightfall_stalker_spawn_egg",
                    () -> new ForgeSpawnEggItem(EntityTypeInit.NIGHTFALL_STALKER,
                            0x1A0B2E, 0x9B30FF,
                            new Item.Properties().group(ItemGroup.MISC)));
}
