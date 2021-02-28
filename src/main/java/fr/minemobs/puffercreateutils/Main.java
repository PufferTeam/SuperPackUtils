package fr.minemobs.puffercreateutils;

import fr.minemobs.puffercreateutils.init.BlockInit;
import fr.minemobs.puffercreateutils.init.ItemInit;
import fr.minemobs.puffercreateutils.init.PsiSpellInit;
import net.minecraft.block.TorchBlock;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("puffercreateutils")
@Mod.EventBusSubscriber(modid = "puffercreateutils", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "puffercreateutils";

    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        PsiSpellInit.registerTricks();
        modEventBus.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof TorchBlock)).map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(ModItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties.group(ModItemGroup.instance));
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }

    public static ResourceLocation location(String _path)
    {
        return new ResourceLocation(Main.MOD_ID, _path);
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }

    public static class ModItemGroup extends ItemGroup {

        public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length, "puffercreateutils");

        public ModItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.TINY_TORCH.get());
        }
    }
}
