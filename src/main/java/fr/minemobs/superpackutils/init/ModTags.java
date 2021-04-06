package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class ModTags {

    public static final class Blocks {

        public static final Map<ITag.INamedTag<Block>, Block> BLOCK_TAGS = new HashMap<>();

        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_MYTHRIL = forge("storage_blocks/mythril", BlockInit.MYTHRIL_BLOCK.get());
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_PLATINUM = forge("storage_blocks/platinum", BlockInit.PLATINUM_BLOCK.get());

        private static ITag.INamedTag<Block> forge(String path, Block block){
            ITag.INamedTag<Block> blockTag = BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
            BLOCK_TAGS.put(blockTag, block);
            return blockTag;
        }

        private static ITag.INamedTag<Block> mod(String path, Block block){
            ITag.INamedTag<Block> blockTag = BlockTags.makeWrapperTag(Main.location(path).toString());
            BLOCK_TAGS.put(blockTag, block);
            return blockTag;
        }
    }

    public static final class Items {

        public static final Map<ITag.INamedTag<Item>, Item> ITEM_TAGS = new HashMap<>();

        //Gears
        public static final ITag.INamedTag<Item> ALUMINIUM_GEAR = forge("gears/aluminum", ItemInit.ALUMINIUM_GEAR.get());
        public static final ITag.INamedTag<Item> URANIUM_GEAR = forge("gears/uranium", ItemInit.URANIUM_GEAR.get());
        public static final ITag.INamedTag<Item> OSMIUM_GEAR = forge("gears/osmium", ItemInit.OSMIUM_GEAR.get());
        public static final ITag.INamedTag<Item> STEEL_GEAR = forge("gears/steel", ItemInit.STEEL_GEAR.get());

        //Dusts
        public static final ITag.INamedTag<Item> MYTHRIL_DUST = forge("dusts/mythril", ItemInit.MYTHRIL_DUST.get());
        public static final ITag.INamedTag<Item> DEPLETED_MYTHRIL_DUST = forge("dusts/mythril", ItemInit.DEPLETED_MYTHRIL_DUST.get());
        public static final ITag.INamedTag<Item> PLATINUM_DUST = forge("dusts/platinum", ItemInit.PLATINUM_DUST.get());

        //Nuggets
        public static final ITag.INamedTag<Item> MYTHRIL_NUGGET = forge("nuggets/mythril", ItemInit.MYTHRIL_NUGGET.get());
        public static final ITag.INamedTag<Item> PLATINUM_NUGGET = forge("nuggets/platinum", ItemInit.PLATINUM_NUGGET.get());

        //Ingots
        public static final ITag.INamedTag<Item> MYTHRIL_INGOT = forge("ingots/mythril", ItemInit.MYTHRIL_INGOT.get());
        public static final ITag.INamedTag<Item> PLATINUM_INGOT = forge("ingots/platinum", ItemInit.PLATINUM_INGOT.get());

        //Storage Blocks

        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_MYTHRIL = forge("storage_blocks/mythril", BlockInit.MYTHRIL_BLOCK.get().asItem());
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_PLATINUM = forge("storage_blocks/platinum", BlockInit.PLATINUM_BLOCK.get().asItem());

        private static ITag.INamedTag<Item> forge(String path, Item item){
            ITag.INamedTag<Item> itemTag = ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
            ITEM_TAGS.put(itemTag, item);
            return itemTag;
        }

        private static ITag.INamedTag<Item> mod(String path, Item item){
            ITag.INamedTag<Item> itemTag = ItemTags.makeWrapperTag(Main.location(path).toString());
            ITEM_TAGS.put(itemTag, item);
            return itemTag;
        }
    }
}
