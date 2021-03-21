package fr.minemobs.superpackutils;

import fr.minemobs.superpackutils.events.CropEvent;
import fr.minemobs.superpackutils.init.*;
import fr.minemobs.superpackutils.objects.blocks.SuperPackBlock;
import fr.minemobs.superpackutils.objects.items.SuperPackItem;
import fr.minemobs.superpackutils.world.OreGeneration;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("superpackutils")
@Mod.EventBusSubscriber(modid = "superpackutils", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "superpackutils";

    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(modEventBus);
        ItemInit.VANILLA_ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        FluidInit.FLUIDS.register(modEventBus);
        TileEntityInit.TILE_ENTITIES.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event){
        MinecraftForge.EVENT_BUS.register(new CropEvent());
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream()
                .filter(blockRegistryObject -> !(blockRegistryObject.get() instanceof FlowingFluidBlock) && !(blockRegistryObject.get() instanceof TorchBlock))
                .map(RegistryObject::get).forEach(block -> {
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

        public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length, "superpackutils");

        public ModItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.TINY_TORCH.get());
        }
    }
}
