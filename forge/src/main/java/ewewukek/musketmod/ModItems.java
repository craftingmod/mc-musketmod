package ewewukek.musketmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    private static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, MusketMod.MODID);

    public static final RegistryObject<Item> musket = ItemRegister.register("musket", () ->
            Items.MUSKET
    );

    public static final RegistryObject<Item> musketWithBayonet = ItemRegister.register("musket_with_bayonet", () ->
            Items.MUSKET_WITH_BAYONET
    );

    public static final RegistryObject<Item> pistol = ItemRegister.register("pistol", () ->
            Items.PISTOL
    );

    public static final RegistryObject<Item> cartridge = ItemRegister.register("cartridge", () ->
            Items.CARTRIDGE
    );

    public ModItems(IEventBus bus) {
        ItemRegister.register(bus);
    }
}
