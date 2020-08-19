package com.ldshadowlady.disney.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.Random;

public class DisneyLuckyBlock extends Block {
    public DisneyLuckyBlock(Block.Properties properties){
        super (properties);
    }

    public void onBlockHarvested(BlockState state, World world, BlockPos pos, PlayerEntity player) {

                Random randomHat = new Random();
                player.sendMessage(new TranslationTextComponent("message.disney_lucky_block_message"));
                world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);

    }

}
