package fr.minemobs.superpackutils.datagen;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.FluidInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.loaders.DynamicBucketModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Item model provider: " + modid;
    }

    @Override
    protected void registerModels() {
        registerBucket();
    }

    private void registerBucket() {
        for (FluidInit.FluidObject entry : FluidInit.FLUIDS_LIST) {
            withExistingParent(entry.getStillFluid().get().getRegistryName().getPath() + "_bucket", new ResourceLocation("forge", "item/bucket"))
                    .customLoader(DynamicBucketModelBuilder::begin)
                    .fluid(entry.getStillFluid().get());
        }
    }
}
