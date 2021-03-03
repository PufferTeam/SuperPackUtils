package fr.minemobs.superpackutils.objects.items.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Bread extends Item {

    public Bread() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.6F).build()));
    }
}
