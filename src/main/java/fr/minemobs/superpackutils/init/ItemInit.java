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

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_SHARD = ITEMS.register("chromium_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STAINLESS_STEEL_INGOT = ITEMS.register("stainless_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_PLATINUM_INGOT = ITEMS.register("electrical_platinum_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_STEEL_INGOT = ITEMS.register("electrical_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMPRESSED_STEEL_INGOT = ITEMS.register("compressed_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SUPERHEATED_BRONZE_INGOT = ITEMS.register("superheated_bronze_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_BRASS_INGOT = ITEMS.register("aluminum_brass_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_INGOT = ITEMS.register("tetraethyl_lead_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_ALLOY_INGOT = ITEMS.register("vibrant_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENERGETIC_ALLOY_INGOT = ITEMS.register("energetic_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STELLAR_ALLOY_INGOT = ITEMS.register("stellar_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PULSATING_ALLOY_INGOT = ITEMS.register("pulsating_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HSLA_STEEL_INGOT = ITEMS.register("hsla_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MIXED_ALLOY_INGOT = ITEMS.register("mixed_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_INGOT = ITEMS.register("boron_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Polished
    public static final RegistryObject<Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CASING = ITEMS.register("advanced_casing", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_PETCOKE = ITEMS.register("enriched_petcoke", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Nugget

    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENDER_PEARL_NUGGET = ITEMS.register("ender_pearl_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dust

    public static final RegistryObject<Item> DEPLETED_MYTHRIL_DUST = ITEMS.register("depleted_mythril_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_DUST = ITEMS.register("mythril_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LIMESTONE_DUST = ITEMS.register("limestone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BEDROCK_DUST = ITEMS.register("bedrock_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_DUST = ITEMS.register("tetraethyl_lead_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MANGANESE_DUST = ITEMS.register("manganese_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_DUST = ITEMS.register("boron_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LITHIUM_DUST = ITEMS.register("lithium_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dirty Dust
    public static final RegistryObject<Item> DIRTY_DUST_NICKEL = ITEMS.register("dirty_dust_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Clump
    public static final RegistryObject<Item> CLUMP_NICKEL = ITEMS.register("clump_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Shard
    public static final RegistryObject<Item> SHARD_NICKEL = ITEMS.register("shard_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Crystal
    public static final RegistryObject<Item> CRYSTAL_NICKEL = ITEMS.register("crystal_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Chunks
    public static final RegistryObject<Item> OSMIUM_CHUNKS = ITEMS.register("osmium_chunks", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Gear

    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_GEAR = ITEMS.register("osmium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Piece
    public static final RegistryObject<Item> ALUMINIUM_ORE_PIECE = ITEMS.register("aluminium_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_ORE_PIECE = ITEMS.register("uranium_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_ORE_PIECE = ITEMS.register("nickel_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_ORE_PIECE = ITEMS.register("silver_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LEAD_ORE_PIECE = ITEMS.register("lead_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TIN_ORE_PIECE = ITEMS.register("tin_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_ORE_PIECE = ITEMS.register("copper_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GOLD_ORE_PIECE = ITEMS.register("gold_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> IRON_ORE_PIECE = ITEMS.register("iron_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_ORE_PIECE = ITEMS.register("osmium_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_ORE_PIECE = ITEMS.register("platinum_ore_piece", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Sawdust
    public static final RegistryObject<Item> BLOODY_SAWDUST = ITEMS.register("bloody_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRASSY_SAWDUST = ITEMS.register("grassy_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AZURE_SAWDUST = ITEMS.register("azure_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Pigment
    public static final RegistryObject<Item> BLOODY_PIGMENT = ITEMS.register("bloody_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRASSY_PIGMENT = ITEMS.register("grassy_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AZURE_PIGMENT = ITEMS.register("azure_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Processor
    public static final RegistryObject<Item> ENERGETIC_PROCESSOR = ITEMS.register("energetic_processor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_PROCESSOR = ITEMS.register("vibrant_processor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Cast
    public static final RegistryObject<Item> CHILLER_NUGGET_CAST = ITEMS.register("chiller_nugget_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_GEAR_CAST = ITEMS.register("chiller_gear_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_PLATE_CAST = ITEMS.register("chiller_plate_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_COIN_CAST = ITEMS.register("chiller_coin_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Capacitor
    public static final RegistryObject<Item> REINFORCED_CAPACITOR = ITEMS.register("reinforced_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STURDY_CAPACITOR = ITEMS.register("sturdy_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DOUBLELAYERED_CAPACITOR = ITEMS.register("doublelayered_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRESSURIZED_CAPACITOR = ITEMS.register("pressurized_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_SOLENOID = ITEMS.register("copper_solenoid", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    //Other

    public static final RegistryObject<Item> ULTIMATE_RUNE = ITEMS.register("ultimate_rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BASIC_ALLOY = ITEMS.register("basic_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> WEIRD_FUNGU = ITEMS.register("weird_fungu", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> RUNE = ITEMS.register("rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_TORCH = ITEMS.register("item_tiny_torch", () -> new TinyTorchItem(BlockInit.TINY_TORCH.get(),
            BlockInit.WALL_TINY_TORCH.get(), new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_SHARD = ITEMS.register("starlight_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_PEARL = ITEMS.register("starlight_infused_mana_pearl", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_DIAMOND = ITEMS.register("starlight_infused_mana_diamond", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIO_PLASTIC = ITEMS.register("bio_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLOUGH = ITEMS.register("plough", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HARVESTING_WHEEL = ITEMS.register("harvesting_wheel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Buckets

    public static final RegistryObject<Item> MOLTEN_MYTHRIL_BUCKET = ITEMS.register("molten_mythril_bucket",
            () -> new BucketItem(FluidInit.MYTHRIL_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_BIO_PLASTIC_BUCKET = ITEMS.register("molten_bio_plastic_bucket",
            () -> new BucketItem(FluidInit.MOLTEN_BIO_PLASTIC_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> LUBRIFIED_LPG_BUCKET = ITEMS.register("lubrified_lpg_bucket",
            () -> new BucketItem(FluidInit.LUBRIFIED_LPG_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);
}
