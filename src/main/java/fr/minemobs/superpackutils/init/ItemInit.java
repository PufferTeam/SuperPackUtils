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

    //Ingot

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_SHARD = ITEMS.register("chromium_shard", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STAINLESS_STEEL_INGOT = ITEMS.register("stainless_steel_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_PLATINUM_INGOT = ITEMS.register("electrical_platinum_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMPRESSED_STEEL_INGOT = ITEMS.register("compressed_steel_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SUPERHEATED_BRONZE_INGOT = ITEMS.register("superheated_bronze_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TIN_BRASS_INGOT = ITEMS.register("tin_brass_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_INGOT = ITEMS.register("tetraethyl_lead_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_ALLOY_INGOT = ITEMS.register("vibrant_alloy_ingot", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Nugget

    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Dust

    public static final RegistryObject<Item> DEPLETED_MYTHRIL_DUST = ITEMS.register("depleted_mythril_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_DUST = ITEMS.register("mythril_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BEDROCK_DUST = ITEMS.register("bedrock_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_DUST = ITEMS.register("tetraethyl_lead_dust", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Gear

    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_GEAR = ITEMS.register("osmium_gear", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Piece
    public static final RegistryObject<Item> ALUMINIUM_ORE_PIECE = ITEMS.register("aluminium_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_ORE_PIECE = ITEMS.register("uranium_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_ORE_PIECE = ITEMS.register("nickel_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_ORE_PIECE = ITEMS.register("silver_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LEAD_ORE_PIECE = ITEMS.register("lead_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TIN_ORE_PIECE = ITEMS.register("tin_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_ORE_PIECE = ITEMS.register("copper_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GOLD_ORE_PIECE = ITEMS.register("gold_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> IRON_ORE_PIECE = ITEMS.register("iron_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_ORE_PIECE = ITEMS.register("osmium_ore_piece", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Cast
    public static final RegistryObject<Item> CHILLER_NUGGET_CAST = ITEMS.register("chiller_nugget_cast", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_GEAR_CAST = ITEMS.register("chiller_gear_cast", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_PLATE_CAST = ITEMS.register("chiller_plate_cast", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_COIN_CAST = ITEMS.register("chiller_coin_cast", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Pickaxe
    public static final RegistryObject<Item> SWORD = ITEMS.register("sword", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> PICKAXE = ITEMS.register("pickaxe", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> AXE = ITEMS.register("axe", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> SHOVEL = ITEMS.register("shovel", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> HOE = ITEMS.register("hoe", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    //Capacitor
    public static final RegistryObject<Item> REINFORCED_CAPACITOR = ITEMS.register("reinforced_capacitor", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STURDY_CAPACITOR = ITEMS.register("sturdy_capacitor", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DOUBLELAYERED_CAPACITOR = ITEMS.register("doublelayered_capacitor", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Other

    public static final RegistryObject<Item> ULTIMATE_RUNE = ITEMS.register("ultimate_rune", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BASIC_ALLOY = ITEMS.register("basic_alloy", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> WEIRD_FUNGU = ITEMS.register("weird_fungu", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> RUNE = ITEMS.register("rune", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_TORCH = ITEMS.register("item_tiny_torch", () -> new TinyTorchItem(BlockInit.TINY_TORCH.get(),
            BlockInit.WALL_TINY_TORCH.get(), new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIO_PLASTIC = ITEMS.register("bio_plastic", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLOUGH = ITEMS.register("plough", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HARVESTING_WHEEL = ITEMS.register("harvesting_wheel", () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    //Buckets

    public static final RegistryObject<Item> MOLTEN_MYTHRIL_BUCKET = ITEMS.register("molten_mythril_bucket",
            () -> new BucketItem(FluidInit.MYTHRIL_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> MOLTEN_BIO_PLASTIC_BUCKET = ITEMS.register("molten_bio_plastic_bucket",
            () -> new BucketItem(FluidInit.MOLTEN_BIO_PLASTIC_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> LUBRIFIED_LPG_BUCKET = ITEMS.register("lubrified_lpg_bucket",
            () -> new BucketItem(FluidInit.LUBRIFIED_LPG_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    public static final RegistryObject<Item> LIQUID_SILICON_DIOXIDE_BUCKET = ITEMS.register("liquid_silicon_dioxide_bucket",
            () -> new BucketItem(FluidInit.LIQUID_SILICON_DIOXIDE_FLUID, new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));

    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);
}
