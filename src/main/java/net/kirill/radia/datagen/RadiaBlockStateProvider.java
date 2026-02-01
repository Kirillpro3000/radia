package net.kirill.radia.datagen;

import net.kirill.radia.Radia;
import net.kirill.radia.common.block.RadiaBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class RadiaBlockStateProvider extends BlockStateProvider {
    public RadiaBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Radia.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(RadiaBlocks.PITCHBLENDE_ORE);
        blockWithItem(RadiaBlocks.RAW_PITCHBLENDE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

}
