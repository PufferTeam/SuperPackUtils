package fr.minemobs.superpackutils.data.client;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.BlockInit;
import fr.minemobs.superpackutils.init.ItemInit;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import mrp_v2.mrplibrary.datagen.providers.TextureProvider;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModTextureProvider extends TextureProvider {

    protected static final ExistingFileHelper.ResourceType TEXTURE = new ExistingFileHelper.ResourceType(ResourcePackType.CLIENT_RESOURCES, ".png", "textures");

    public ModTextureProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, existingFileHelper, Main.MOD_ID);
    }

    @Override
    protected void addTextures(FinishedTextureConsumer finishedTextureConsumer) {
        addBlocks(finishedTextureConsumer);
        addItems(finishedTextureConsumer);
    }

    private void addItems(FinishedTextureConsumer finishedTextureConsumer) {
        for (RegistryObject<Item> entry : ItemInit.ITEMS.getEntries().stream()
                .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TinyTorchItem)).collect(Collectors.toList())) {
            ResourceLocation rl = entry.get().getRegistryName();
            String sRegistryName = rl.toString().replace("superpackutils:", "");
            boolean textureExist = existingFileHelper.exists(new ResourceLocation(Main.MOD_ID + ":item/" + sRegistryName), TEXTURE);
            Main.getLOGGER().info(rl.toString() + " | Exist : " + textureExist);
            if (!textureExist) {
                finish(getTexture(Main.location("block/placeholder")),
                        Main.location("item/" + sRegistryName), finishedTextureConsumer);
            }
        }
    }

    private void addBlocks(FinishedTextureConsumer finishedTextureConsumer) {
        for (RegistryObject<Block> entry : BlockInit.BLOCKS.getEntries().stream()
                .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TinyTorch)).filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof WallTinyTorch)).collect(Collectors.toList())) {
            String sRegistryName = entry.get().getRegistryName().toString().replace("superpackutils:", "");
            boolean textureExist = existingFileHelper.exists(new ResourceLocation(Main.MOD_ID + ":item/" + sRegistryName), TEXTURE);
            if(!textureExist){
                finish(getTexture(Main.location("block/placeholder")),
                        Main.location("block/" + sRegistryName), finishedTextureConsumer);
            }
        }
    }
}
