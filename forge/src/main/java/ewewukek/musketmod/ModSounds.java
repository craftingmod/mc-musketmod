package ewewukek.musketmod;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    private static final DeferredRegister<SoundEvent> SoundRegister = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MusketMod.MODID);

    public static final RegistryObject<SoundEvent> musket_load_0 = SoundRegister.register("musket_load0", () ->
            Sounds.MUSKET_LOAD_0
    );

    public static final RegistryObject<SoundEvent> musket_load_1 = SoundRegister.register("musket_load1", () ->
            Sounds.MUSKET_LOAD_1
    );

    public static final RegistryObject<SoundEvent> musket_load_2 = SoundRegister.register("musket_load2", () ->
            Sounds.MUSKET_LOAD_2
    );

    public static final RegistryObject<SoundEvent> musket_ready = SoundRegister.register("musket_ready", () ->
            Sounds.MUSKET_READY
    );

    public static final RegistryObject<SoundEvent> musket_fire = SoundRegister.register("musket_fire", () ->
            Sounds.MUSKET_FIRE
    );

    public static final RegistryObject<SoundEvent> pistol_fire = SoundRegister.register("pistol_fire", () ->
            Sounds.PISTOL_FIRE
    );

    public ModSounds(IEventBus bus) {
        SoundRegister.register(bus);
    }


}
