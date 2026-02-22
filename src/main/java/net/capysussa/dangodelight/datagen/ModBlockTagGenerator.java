package net.capysussa.dangodelight.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.capysussa.dangodelight.DangoDelight;
import net.capysussa.dangodelight.block.ModBlocks;
import net.capysussa.dangodelight.util.ModTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider,
        @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DangoDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider pProvider) {
        this.tag(ModTags.Blocks.RICE_DUMPLING_BLOCKS)
        .add(ModBlocks.WHITE_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.RED_RICE_DUMPLING_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
        .add(ModBlocks.WHITE_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.RED_RICE_DUMPLING_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
        .add(ModBlocks.WHITE_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.RED_RICE_DUMPLING_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_HOE)
        .add(ModBlocks.WHITE_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK.get())
        .add(ModBlocks.RED_RICE_DUMPLING_BLOCK.get());
    }

}
