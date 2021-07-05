package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public abstract class AbstractItem extends Item {

    public AbstractItem() {
        super(new Item.Properties().tab(Main.ModItemGroup.instance));
    }

    @Override
    public abstract void appendHoverText(ItemStack stack, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag flagIn);
}
