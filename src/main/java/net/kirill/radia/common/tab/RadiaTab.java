package net.kirill.radia.common.tab;

import net.kirill.radia.Radia;
import net.kirill.radia.common.block.RadiaBlocks;
import net.kirill.radia.common.item.RadiaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class RadiaTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Radia.MODID);

    public static final Supplier<CreativeModeTab> RADIA_TAB = CREATIVE_MODE_TAB.register("radia_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(RadiaItems.BOTRYOIDAL_PITCHBLENDE.get()))
            .title(Component.translatable("creativetab.radia.radia_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(RadiaItems.PITCHBLENDE);
                output.accept(RadiaItems.BOTRYOIDAL_PITCHBLENDE);
                output.accept(RadiaBlocks.PITCHBLENDE_ORE);
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
