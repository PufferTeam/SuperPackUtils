package fr.minemobs.superpackutils.data.client;

import fr.minemobs.superpackutils.data.TextureProvider;
import fr.minemobs.superpackutils.init.BlockInit;
import fr.minemobs.superpackutils.init.ItemInit;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ModTextureProvider extends TextureProvider {

    protected final List<Item> ignored_items = new ArrayList<>();

    public ModTextureProvider(DataGenerator gen) {
        super(gen);
        ignored_items.addAll(Arrays.asList(ItemInit.TINY_COAL.get(), ItemInit.MYTHRIL_DUST.get(), ItemInit.ULTIMATE_RUNE.get(),
                BlockInit.BIG_STEEL_CASING.get().asItem(), BlockInit.DEEPSLATE.get().asItem(), BlockInit.TINY_TORCH.get().asItem(), BlockInit.PLATINUM_BLOCK.get().asItem()));
    }

    @Override
    public void registerTextures() throws IOException {
        addBlocks();
        addItems();
    }

    private void addItems() throws IOException {
        for (RegistryObject<Item> entry : ItemInit.ITEMS.getEntries().stream()
                .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TinyTorchItem)).collect(Collectors.toList())) {
            String sRegistryName = entry.get().getRegistryName().toString().replace("superpackutils:", "");

            if (!ignored_items.contains(entry.get())) {
                this.textures.put(genLoc("item/" + sRegistryName), getTexture(modLoc("block/placeholder")));
            }
        }
    }

    private void addBlocks() throws IOException {
        for (RegistryObject<Block> entry : BlockInit.BLOCKS.getEntries().stream()
                .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TinyTorch)).filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof WallTinyTorch)).collect(Collectors.toList())) {
            String sRegistryName = entry.get().getRegistryName().toString().replace("superpackutils:", "");

            if(!ignored_items.contains(entry.get().asItem())){
                this.textures.put(genLoc("block/" + sRegistryName), getTexture(modLoc("block/placeholder")));
            }
        }
    }
}
