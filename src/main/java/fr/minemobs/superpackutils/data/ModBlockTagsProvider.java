package fr.minemobs.superpackutils.data;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        ModTags.Blocks.BLOCK_TAGS.forEach((blockINamedTag, block) -> tag(blockINamedTag).add(block));
    }
}
