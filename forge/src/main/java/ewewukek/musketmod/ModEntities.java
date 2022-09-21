package ewewukek.musketmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    private static final DeferredRegister<EntityType<?>> EntityRegister = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MusketMod.MODID);

    public static final RegistryObject<EntityType<BulletEntity>> bulletEntityRegistry = EntityRegister.register("bullet", () ->
            EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .setTrackingRange(64).setUpdateInterval(5)
                    .setShouldReceiveVelocityUpdates(false)
                    .build(MusketMod.MODID + ":bullet"));

    public ModEntities(IEventBus bus) {
        EntityRegister.register(bus);
    }
}
