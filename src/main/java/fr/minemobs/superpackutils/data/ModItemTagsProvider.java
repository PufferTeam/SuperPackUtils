package fr.minemobs.superpackutils.data;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        ModTags.Items.ITEM_TAGS.forEach((itemINamedTag, item) -> getOrCreateBuilder(itemINamedTag).add(item));
    }
}
