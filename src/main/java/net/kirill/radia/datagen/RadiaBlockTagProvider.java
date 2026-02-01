package net.kirill.radia.datagen;

import net.kirill.radia.Radia;
import net.kirill.radia.common.block.RadiaBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RadiaBlockTagProvider extends BlockTagsProvider {
    public RadiaBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Radia.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(RadiaBlocks.PITCHBLENDE_ORE.get())
                .add(RadiaBlocks.RAW_PITCHBLENDE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(RadiaBlocks.PITCHBLENDE_ORE.get())
                .add(RadiaBlocks.RAW_PITCHBLENDE_BLOCK.get());

    }
}
