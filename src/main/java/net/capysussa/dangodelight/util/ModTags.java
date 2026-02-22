package net.capysussa.dangodelight.util;

import net.capysussa.dangodelight.DangoDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> RICE_DUMPLING_BLOCKS = tag("rice_dumpling_blocks");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DangoDelight.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> RICE_DUMPLINGS = tag("rice_dumplings");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DangoDelight.MOD_ID, name));
        }
    }
}
