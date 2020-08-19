package com.ldshadowlady.disney.world;

import com.ldshadowlady.disney.Disney;
import com.ldshadowlady.disney.blocks.DisneyBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void setupOreGeneration()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            CountRangeConfig disney_ore_placement = new CountRangeConfig(1000,0,0,100);
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DisneyBlocks.DISNEY_ORE.get().getDefaultState(),1000), Placement.COUNT_RANGE, new CountRangeConfig(100,0,0,100)));
        }
    }
}
