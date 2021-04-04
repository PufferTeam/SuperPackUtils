package fr.minemobs.superpackutils.data.client;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.BlockInit;
import fr.minemobs.superpackutils.init.ItemInit;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    public ItemModelBuilder withExistingParent(String name) {
        return withExistingParent(name, modLoc("block/" + name));
    }

    @Override
    protected void registerModels() {
        addBlocks();
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        addItems(itemGenerated);
    }

    private void addItems(ModelFile itemGenerated) {
        for (RegistryObject<Item> entry : ItemInit.ITEMS.getEntries().stream().filter(itemRegistryObject -> !(itemRegistryObject.get() instanceof TinyTorchItem)).collect(Collectors.toList())) {
            builder(itemGenerated, entry.get().getRegistryName().toString().replace("superpackutils:", ""));
        }
    }

    private void addBlocks() {
        for (RegistryObject<Block> entry : BlockInit.BLOCKS.getEntries().stream()
                .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof FlowingFluidBlock) && !(blockRegistryObject.get() instanceof TinyTorch))
                .collect(Collectors.toList())) {
            String registryName = entry.get().getRegistryName().toString().replace("superpackutils:", "");
            withExistingParent(registryName);
        }
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0",  "item/" + name);
    }

}
