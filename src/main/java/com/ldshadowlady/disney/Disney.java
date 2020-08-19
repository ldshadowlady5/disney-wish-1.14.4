package com.ldshadowlady.disney;

import com.ldshadowlady.disney.world.OreGeneration;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(com.ldshadowlady.disney.Disney.ID)
public class Disney {
    public static final String ID = "disney";

    private static final Logger LOGGER = LogManager.getLogger();

    public Disney() {
        com.ldshadowlady.disney.blocks.DisneyBlocks.REG.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.ldshadowlady.disney.items.DisneyItems.REG.register(FMLJavaModLoadingContext.get().getModEventBus());
        //OreGeneration.setupOreGeneration();
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        OreGeneration.setupOreGeneration();
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


}
