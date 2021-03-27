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

    public static final RegistryObject<Item> CHROMIUM_ORE = ITEMS.register("chromium_ore", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_DUST = ITEMS.register("chromium_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLOUGH = ITEMS.register("plough", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIG_STEEL_CASING = ITEMS.register("big_steel_casing", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLATINIUM_DUST = ITEMS.register("platinium_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINIUM_INGOT = ITEMS.register("platinium_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINIUM_NUGGET = ITEMS.register("platinium_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> MYTHRIL_DUST = ITEMS.register("mythril_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Buckets

    public static final RegistryObject<Item> VINEGAR_BUCKET = ITEMS.register("vinegar_bucket", () -> new BucketItem(FluidInit.VINEGAR_FLUID,
            new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> OLIVE_BUCKET = ITEMS.register("olive_bucket",
            () -> new BucketItem(FluidInit.OLIVE_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> MOLTEN_MYTHRIL_BUCKET = ITEMS.register("molten_mythril_bucket",
            () -> new BucketItem(FluidInit.MYTHRIL_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> MOLTEN_PLATINIUM_BUCKET = ITEMS.register("molten_platinium_bucket",
            () -> new BucketItem(FluidInit.PLATINIUM_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);
}
