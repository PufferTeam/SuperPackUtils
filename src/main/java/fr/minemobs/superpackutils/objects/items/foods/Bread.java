package fr.minemobs.superpackutils.objects.items.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.item.Item.Properties;

public class Bread extends Item {

    public Bread() {
        super(new Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder().nutrition(5).saturationMod(0.6F).build()));
    }
}
