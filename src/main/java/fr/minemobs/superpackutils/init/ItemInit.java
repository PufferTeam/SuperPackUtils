package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.items.TinyCoalItem;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import fr.minemobs.superpackutils.objects.items.foods.Bread;
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

    public static final RegistryObject<Item> BIO_PLASTIC = ITEMS.register("bio_plastic", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLOUGH = ITEMS.register("plough", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLACEHOLDER = ITEMS.register("placeholder", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> MYTHRIL_DUST = ITEMS.register("mythril_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> DEPLETED_MYTHRIL_DUST = ITEMS.register("dep_mythril_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HARVESTING_WHEEL = ITEMS.register("harvesting_wheel", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Buckets

    public static final RegistryObject<Item> MOLTEN_MYTHRIL_BUCKET = ITEMS.register("molten_mythril_bucket",
            () -> new BucketItem(FluidInit.MYTHRIL_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> MOLTEN_PLATINUM_BUCKET = ITEMS.register("molten_platinum_bucket",
            () -> new BucketItem(FluidInit.PLATINUM_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);
}
