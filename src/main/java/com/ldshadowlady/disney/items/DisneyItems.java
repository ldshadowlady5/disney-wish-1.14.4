package com.ldshadowlady.disney.items;

import com.ldshadowlady.customcraftingtables.items.DisneyBlockItem;
import com.ldshadowlady.disney.blocks.DisneyBlocks;
import com.ldshadowlady.disney.lists.ArmorMaterialList;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

import static com.ldshadowlady.disney.Disney.ID;
import static net.minecraft.item.ItemGroup.COMBAT;

public final class DisneyItems {
    private DisneyItems() {
    }
    public static final ItemGroup DISNEY = new DisneyItemGroup();

    public static final DeferredRegister<Item> REG = new DeferredRegister<>(ForgeRegistries.ITEMS, ID);

    public static final RegistryObject<BlockItem> DISNEY_LUCKY_BLOCK = REG.register("disney_lucky_block", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.DISNEY_LUCKY_BLOCK));
    public static final RegistryObject<BlockItem> DISNEY_ORE = REG.register("disney_ore", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.DISNEY_ORE));
    public static final RegistryObject<Item> DISNEY_WISH = REG.register("disney_wish", () -> new WishItem(new Item.Properties().group(DISNEY)));

    public static final RegistryObject<Item> MICKEY_HAT = REG.register("mickey_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> MINNIE_HAT = REG.register("minnie_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> YODA_HAT = REG.register("yoda_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> BAYMAX_HAT = REG.register("baymax_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> DONALD_HAT = REG.register("donald_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> GOOFY_HAT = REG.register("goofy_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> PLUTO_HAT = REG.register("pluto_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> POOH_HAT = REG.register("pooh_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> DAISY_HAT = REG.register("daisy_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> BAMBI_HAT = REG.register("bambi_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> FANTASIA_HAT = REG.register("fantasia_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> COCO_HAT = REG.register("coco_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> PATCH_HAT = REG.register("patch_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> ODDBALL_HAT = REG.register("oddball_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> PENNY_HAT = REG.register("penny_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> LUCKY_HAT = REG.register("lucky_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> TIGERLILY_HAT = REG.register("tigerlily_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));
    public static final RegistryObject<Item> STITCH_HAT = REG.register("stitch_hat", () -> new DisneyHatItem((new Item.Properties().group(DISNEY))));

    public static final RegistryObject<BlockItem>  PLANKS_LIGHT_BLUE = REG.register("planks_light_blue", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_LIGHT_BLUE));
    public static final RegistryObject<BlockItem>  PLANKS_LIME = REG.register("planks_lime", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_LIME));
    public static final RegistryObject<BlockItem>  PLANKS_MAGENTA = REG.register("planks_magenta", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_MAGENTA));
    public static final RegistryObject<BlockItem>  PLANKS_ORANGE = REG.register("planks_orange", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_ORANGE));
    public static final RegistryObject<BlockItem>  PLANKS_PINK = REG.register("planks_pink", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_PINK));
    public static final RegistryObject<BlockItem>  PLANKS_PURPLE = REG.register("planks_purple", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_PURPLE));
    public static final RegistryObject<BlockItem>  PLANKS_SALMON = REG.register("planks_salmon", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SALMON));
    public static final RegistryObject<BlockItem>  PLANKS_LIGHT_BLUE_STAIRS = REG.register("planks_light_blue_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_LIGHT_BLUE_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_LIME_STAIRS = REG.register("planks_lime_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_LIME_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_MAGENTA_STAIRS = REG.register("planks_magenta_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_MAGENTA_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_ORANGE_STAIRS = REG.register("planks_orange_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_ORANGE_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_PINK_STAIRS = REG.register("planks_pink_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_PINK_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_PURPLE_STAIRS = REG.register("planks_purple_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_PURPLE_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_SALMON_STAIRS = REG.register("planks_salmon_stairs", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SALMON_STAIRS));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_LIGHT_BLUE = REG.register("planks_slab_light_blue", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_LIGHT_BLUE));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_LIME = REG.register("planks_slab_lime", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_LIME));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_MAGENTA = REG.register("planks_slab_magenta", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_MAGENTA));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_ORANGE = REG.register("planks_slab_orange", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_ORANGE));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_PINK = REG.register("planks_slab_pink", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_PINK));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_PURPLE = REG.register("planks_slab_purple", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_PURPLE));
    public static final RegistryObject<BlockItem>  PLANKS_SLAB_SALMON = REG.register("planks_slab_salmon", com.ldshadowlady.disney.items.DisneyItems.create(DisneyBlocks.PLANKS_SLAB_SALMON));

    private static Item.Properties defaultProperties() {
        return new Item.Properties().group(DISNEY);
    }


    private static Supplier<BlockItem> create(final RegistryObject<? extends Block> block) {
        return () -> new BlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties());
    }

}

