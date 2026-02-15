package net.capysussa.dangodelight.item;

import net.capysussa.dangodelight.DangoDelight;
import net.capysussa.dangodelight.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DangoDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DANGO_TAB = CREATIVE_MODE_TABS.register("dango_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_RICE_DUMPLING.get()))
        .title(Component.translatable("creativetab.dango_tab"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.RED_RICE_DUMPLING.get());
            pOutput.accept(ModBlocks.RED_RICE_DUMPLING_BLOCK.get());
            pOutput.accept(ModItems.WHITE_RICE_DUMPLING.get());
            pOutput.accept(ModBlocks.WHITE_RICE_DUMPLING_BLOCK.get());
            pOutput.accept(ModItems.LIGHT_GRAY_RICE_DUMPLING.get());
            pOutput.accept(ModBlocks.LIGHT_GRAY_RICE_DUMPLING_BLOCK.get());
            pOutput.accept(ModItems.DANGO.get());

        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
