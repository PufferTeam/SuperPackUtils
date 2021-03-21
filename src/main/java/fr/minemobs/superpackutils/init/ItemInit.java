package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.items.buckets.OliveOilBucket;
import fr.minemobs.superpackutils.objects.items.buckets.VinegarBucket;
import fr.minemobs.superpackutils.objects.items.foods.Bread;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import fr.minemobs.superpackutils.objects.items.TinyCoalItem;
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

    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLATINIUM_DUST = ITEMS.register("platinium_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINIUM_INGOT = ITEMS.register("platinium_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINIUM_NUGGET = ITEMS.register("platinium_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> MYTHRIL_DUST = ITEMS.register("mythril_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Buckets

    public static final RegistryObject<Item> VINEGAR_BUCKET = ITEMS.register("vinegar_bucket", () -> new VinegarBucket(FluidInit.VINEGAR_FLUID,
            new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> OLIVE_BUCKET = ITEMS.register("olive_bucket", () -> new OliveOilBucket(FluidInit.OLIVE_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket", () -> new BucketItem(FluidInit.IRON_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket", () -> new OliveOilBucket(FluidInit.GOLD_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket", () -> new OliveOilBucket(FluidInit.COPPER_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket", () -> new OliveOilBucket(FluidInit.TIN_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_NICKEL_BUCKET = ITEMS.register("molten_nickel_bucket", () -> new OliveOilBucket(FluidInit.NICKEL_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket", () -> new OliveOilBucket(FluidInit.ZINC_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_LEAD_BUCKET = ITEMS.register("molten_lead_bucket", () -> new OliveOilBucket(FluidInit.LEAD_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_SILVER_BUCKET = ITEMS.register("molten_silver_bucket", () -> new OliveOilBucket(FluidInit.SILVER_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_BRONZE_BUCKET = ITEMS.register("molten_bronze_bucket", () -> new OliveOilBucket(FluidInit.BRONZE_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_ELECTRUM_BUCKET = ITEMS.register("molten_electrum_bucket", () -> new OliveOilBucket(FluidInit.ELECTRUM_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_INVAR_BUCKET = ITEMS.register("molten_invar_bucket", () -> new OliveOilBucket(FluidInit.INVAR_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_CONSTANTAN_BUCKET = ITEMS.register("molten_constantan_bucket", () -> new OliveOilBucket(FluidInit.CONSTANTAN_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> MOLTEN_BRASS_BUCKET = ITEMS.register("molten_brass_bucket", () -> new OliveOilBucket(FluidInit.BRASS_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));


    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);
}
