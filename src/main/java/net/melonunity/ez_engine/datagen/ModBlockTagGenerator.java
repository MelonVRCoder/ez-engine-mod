package net.melonunity.ez_engine.datagen;

import net.melonunity.ez_engine.EzEngine;
import net.melonunity.ez_engine.block.ModBlocks;
import net.melonunity.ez_engine.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EzEngine.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get())
                .addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());


        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());

    }
}
