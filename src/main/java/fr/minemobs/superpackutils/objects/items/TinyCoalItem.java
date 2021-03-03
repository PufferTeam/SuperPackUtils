package fr.minemobs.superpackutils.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TinyCoalItem extends Item {

    public TinyCoalItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 177;
    }
}
