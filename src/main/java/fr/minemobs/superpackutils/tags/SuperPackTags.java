package fr.minemobs.superpackutils.tags;

import net.minecraft.block.Block;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.ITag.INamedTag;

public class Tags
{
    public static void init ()
    {
        Blocks.init();
        Items.init();
    }

    public static class Blocks
    {
        private static void init(){}

        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_SILVER = tag("storage_blocks/silver");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_LEAD = tag("storage_blocks/lead");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_TIN = tag("storage_blocks/tin");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_NICKEL = tag("storage_blocks/nickel");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_PLATINUM = tag("storage_blocks/platinum");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_BRONZE = tag("storage_blocks/bronze");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_BRASS = tag("storage_blocks/brass");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_STEEL = tag("storage_blocks/steel");

        private static IOptionalNamedTag<Block> tag(String name)
        {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items
    {
        private static void init(){}

        public static final IOptionalNamedTag<Item> INGOTS_PLATINUM = tag("ingots/platinum");

        private static IOptionalNamedTag<Item> tag(String name)
        {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
