package com.ldshadowlady.disney.blocks;

import com.ldshadowlady.disney.blocks.DisneyLuckyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.ldshadowlady.disney.Disney.ID;

public final class DisneyBlocks {
    private DisneyBlocks() {}

    public static final DeferredRegister<Block> REG = new DeferredRegister<>(ForgeRegistries.BLOCKS, ID);

    public static final RegistryObject<DisneyLuckyBlock> DISNEY_LUCKY_BLOCK = REG.register("disney_lucky_block", () -> new DisneyLuckyBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F).sound(SoundType.STONE)));
    public static final RegistryObject<DisneyLuckyBlock> DISNEY_ORE = REG.register("disney_ore", () -> new DisneyLuckyBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5F).sound(SoundType.STONE)));
    public static final RegistryObject<PlankBlock> PLANKS_LIGHT_BLUE = REG.register("planks_light_blue", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankBlock> PLANKS_LIME = REG.register("planks_lime", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankBlock> PLANKS_MAGENTA = REG.register("planks_magenta", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankBlock> PLANKS_ORANGE = REG.register("planks_orange", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankBlock> PLANKS_PINK = REG.register("planks_pink", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankBlock> PLANKS_PURPLE = REG.register("planks_purple", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankBlock> PLANKS_SALMON = REG.register("planks_salmon", () -> new PlankBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<PlankStairBlock> PLANKS_LIGHT_BLUE_STAIRS = REG.register("planks_light_blue_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_LIGHT_BLUE.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankStairBlock> PLANKS_LIME_STAIRS = REG.register("planks_lime_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_LIME.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankStairBlock> PLANKS_MAGENTA_STAIRS = REG.register("planks_magenta_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_MAGENTA.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankStairBlock> PLANKS_ORANGE_STAIRS = REG.register("planks_orange_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_ORANGE.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankStairBlock> PLANKS_PINK_STAIRS = REG.register("planks_pink_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_PINK.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankStairBlock> PLANKS_PURPLE_STAIRS = REG.register("planks_purple_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_PURPLE.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankStairBlock> PLANKS_SALMON_STAIRS = REG.register("planks_salmon_stairs", () -> new PlankStairBlock(DisneyBlocks.PLANKS_SALMON.get().getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_LIGHT_BLUE = REG.register("planks_slab_light_blue", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_LIME = REG.register("planks_slab_lime", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_MAGENTA = REG.register("planks_slab_magenta", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_ORANGE = REG.register("planks_slab_orange", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_PINK = REG.register("planks_slab_pink", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_PURPLE = REG.register("planks_slab_purple", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<PlankSlabBlock> PLANKS_SLAB_SALMON = REG.register("planks_slab_salmon", () -> new PlankSlabBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)));

}