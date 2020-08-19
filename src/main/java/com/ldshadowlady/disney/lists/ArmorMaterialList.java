package com.ldshadowlady.disney.lists;

import com.ldshadowlady.disney.Disney;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial {

    disney("disney",400,new int[]{13,14,16,11},25,Items.DIAMOND,"minecraft:entity.slime.squish",0.4F);

    private static final int[] max_damage_array = new int[]{13,15,16,11};
    private String name, equipSound;
    private int durability, enchantability;
    private Item repairItem;
    private int[] damageReductionAmounts;
    private float toughness;

    private ArmorMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness)
    {

    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return this.max_damage_array[slotIn.getIndex()] * this.durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return null;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairItem);
    }

    @Override
    public String getName() {
        return Disney.ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
