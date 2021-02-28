package fr.minemobs.puffercreateutils.init;

import fr.minemobs.puffercreateutils.Main;
import fr.minemobs.puffercreateutils.objects.items.TinyTorchItem;
import fr.minemobs.puffercreateutils.objects.items.TinyCoalItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> TINY_TORCH = ITEMS.register("item_tiny_torch", () -> new TinyTorchItem(BlockInit.TINY_TORCH.get(),
            BlockInit.WALL_TINY_TORCH.get(), new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIG_STEEL_CASING = ITEMS.register("big_steel_casing", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> DIESEL_INFUSED_OSMIUM_INGOT = ITEMS.register("diesel_infused_osmium_ingot",
            () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
}
