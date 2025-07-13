package net.melonunity.ez_engine.item;

import net.melonunity.ez_engine.EzEngine;
import net.melonunity.ez_engine.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EzEngine.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());

                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());

                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());




                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ADVANCED_STUFF_TAB = CREATIVE_MODE_TABS.register("advanced_stuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL_DETECTOR.get()))
                    .title(Component.translatable("creativetab.advanced_stuff_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FOOD_AND_SEEDS_TAB = CREATIVE_MODE_TABS.register("food_and_seeds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BURGER.get()))
                    .title(Component.translatable("creativetab.food_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.BURGER.get());
                        pOutput.accept(ModItems.CORN.get());

                        pOutput.accept(ModItems.STRAWBERRY_SEEDS.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FUEL_TAB = CREATIVE_MODE_TABS.register("fuel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PINE_CONE.get()))
                    .title(Component.translatable("creativetab.fuel_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.SUPER_COAL.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FLOWERS_TAB = CREATIVE_MODE_TABS.register("flowers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CATMINT.get()))
                    .title(Component.translatable("creativetab.fuel_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.CATMINT.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
