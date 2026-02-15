package net.capysussa.dangodelight.block;


import java.util.function.Supplier;

import net.capysussa.dangodelight.DangoDelight;
import net.capysussa.dangodelight.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
    DeferredRegister.create(ForgeRegistries.BLOCKS, DangoDelight.MOD_ID);

    public static final RegistryObject<Block> RED_RICE_DUMPLING_BLOCK = registerBlock("red_rice_dumpling_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.PACKED_MUD))
    );

    public static final RegistryObject<Block> WHITE_RICE_DUMPLING_BLOCK = registerBlock("white_rice_dumpling_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.PACKED_MUD))
    );

    public static final RegistryObject<Block> LIGHT_GRAY_RICE_DUMPLING_BLOCK = registerBlock("light_gray_rice_dumpling_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.PACKED_MUD))
    );

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
