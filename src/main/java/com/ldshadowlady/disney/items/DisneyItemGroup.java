package com.ldshadowlady.disney.items;

import com.ldshadowlady.disney.blocks.DisneyBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DisneyItemGroup extends ItemGroup {

    public DisneyItemGroup() {
        super("DISNEY");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(DisneyBlocks.DISNEY_LUCKY_BLOCK.get());
    }
}
