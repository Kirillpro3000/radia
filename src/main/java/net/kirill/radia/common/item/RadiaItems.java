package net.kirill.radia.common.item;

import net.kirill.radia.Radia;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RadiaItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Radia.MODID);

    public static final DeferredItem<Item> PITCHBLENDE = ITEMS.register("pitchblende", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOTRYOIDAL_PITCHBLENDE = ITEMS.register("botryoidal_pitchblende", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
