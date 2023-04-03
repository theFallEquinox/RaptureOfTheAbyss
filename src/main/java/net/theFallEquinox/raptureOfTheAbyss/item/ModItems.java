package net.theFallEquinox.raptureOfTheAbyss.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theFallEquinox.raptureOfTheAbyss.RaptureOfTheAbyss;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RaptureOfTheAbyss.MOD_ID);

    // WEAPONS
    public static final RegistryObject<Item> BASIC_KNIFE = ITEMS.register("basic_knife",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RAPTURE_ABYSS_TAB).durability(5)));

    // RESOURCES
    public static final RegistryObject<Item> MUDSTONE = ITEMS.register("mudstone_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RAPTURE_ABYSS_TAB)));

    // TUTORIAL ITEMS
    public static final RegistryObject<Item> COBALT_RAW = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RAPTURE_ABYSS_TAB)));

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RAPTURE_ABYSS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
