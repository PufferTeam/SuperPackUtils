package fr.minemobs.superpackutils.objects.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WallOrFloorItem;

public class TinyTorchItem extends WallOrFloorItem {

    public TinyTorchItem(Block floorBlock, Block wallBlockIn, Properties propertiesIn) {
        super(floorBlock, wallBlockIn, propertiesIn);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 277;
    }
}
