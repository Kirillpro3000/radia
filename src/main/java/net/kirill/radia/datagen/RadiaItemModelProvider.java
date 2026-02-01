package net.kirill.radia.datagen;


import net.kirill.radia.Radia;
import net.kirill.radia.common.item.RadiaItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RadiaItemModelProvider extends ItemModelProvider {
    public RadiaItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Radia.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(RadiaItems.PITCHBLENDE.get());
        basicItem(RadiaItems.BOTRYOIDAL_PITCHBLENDE.get());
        basicItem(RadiaItems.CRUSHED_PITCHBLENDE.get());
        basicItem(RadiaItems.PITCHBLENDE_POWDER.get());
    }

}
