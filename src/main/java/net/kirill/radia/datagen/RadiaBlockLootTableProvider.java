package net.kirill.radia.datagen;

import net.kirill.radia.common.block.RadiaBlocks;
import net.kirill.radia.common.item.RadiaItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class RadiaBlockLootTableProvider extends BlockLootSubProvider {
    protected RadiaBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(RadiaBlocks.PITCHBLENDE_ORE.get(), block -> createOreDrop(RadiaBlocks.PITCHBLENDE_ORE.get(), RadiaItems.PITCHBLENDE.get()));
        add(RadiaBlocks.RAW_PITCHBLENDE_BLOCK.get(), block -> createOreDrop(RadiaBlocks.RAW_PITCHBLENDE_BLOCK.get(), RadiaItems.BOTRYOIDAL_PITCHBLENDE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RadiaBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
