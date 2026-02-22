package net.capysussa.dangodelight.datagen;

import net.capysussa.dangodelight.DangoDelight;
import net.capysussa.dangodelight.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DangoDelight.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RED_RICE_DUMPLING_BLOCK);
        blockWithItem(ModBlocks.WHITE_RICE_DUMPLING_BLOCK);
        blockWithItem(ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}