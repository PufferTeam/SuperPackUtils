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

import java.util.function.Supplier;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    //Ingot

    public static final RegistryObject<Item> MYTHRIL_INGOT = registerItem("mythril_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_INGOT = registerItem("platinum_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_SHARD = registerItem("chromium_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STAINLESS_STEEL_INGOT = registerItem("stainless_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_PLATINUM_INGOT = registerItem("electrical_platinum_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_STEEL_INGOT = registerItem("electrical_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_HSLA_STEEL_INGOT = registerItem("electrical_hsla_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMPRESSED_STEEL_INGOT = registerItem("compressed_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SUPERHEATED_BRONZE_INGOT = registerItem("superheated_bronze_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MANGANESE_INGOT = registerItem("manganese_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_BRASS_INGOT = registerItem("aluminum_brass_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_INGOT = registerItem("tetraethyl_lead_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_ALLOY_INGOT = registerItem("vibrant_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENERGETIC_ALLOY_INGOT = registerItem("energetic_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> REDSTONE_ALLOY_INGOT = registerItem("redstone_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STELLAR_ALLOY_INGOT = registerItem("stellar_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PULSATING_ALLOY_INGOT = registerItem("pulsating_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HSLA_STEEL_INGOT = registerItem("hsla_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MIXED_ALLOY_INGOT = registerItem("mixed_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_INGOT = registerItem("boron_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LITHIUM_INGOT = registerItem("lithium_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RICH_SLAG_ALLOY = registerItem("rich_slag_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CUPRONICKEL_INGOT = registerItem("cupronickel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Nugget
    public static final RegistryObject<Item> CUPRONICKEL_NUGGET = registerItem("cupronickel_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Polished
    public static final RegistryObject<Item> POLISHED_QUARTZ = registerItem("polished_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CASING = registerItem("advanced_casing", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_PETCOKE = registerItem("enriched_petcoke", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Nugget
    public static final RegistryObject<Item> MYTHRIL_NUGGET = registerItem("mythril_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = registerItem("platinum_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENDER_PEARL_NUGGET = registerItem("ender_pearl_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dust
    public static final RegistryObject<Item> DEPLETED_MYTHRIL_DUST = registerItem("depleted_mythril_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_DUST = registerItem("mythril_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_DUST = registerItem("platinum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LIMESTONE_DUST = registerItem("limestone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BEDROCK_DUST = registerItem("bedrock_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_DUST = registerItem("zinc_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_DUST = registerItem("tetraethyl_lead_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MANGANESE_DUST = registerItem("manganese_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_DUST = registerItem("boron_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LITHIUM_DUST = registerItem("lithium_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COBALT_DUST = registerItem("cobalt_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Crushed Ore
    public static final RegistryObject<Item> CRUSHED_COBALT_ORE = registerItem("crushed_cobalt_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Blend
    public static final RegistryObject<Item> QUARTZ_ENRICHED_BLEND = registerItem("quartz_enriched_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CUPRONICKEL_BLEND = registerItem("cupronickel_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Alchemical Dusts
    public static final RegistryObject<Item> ALCHEMICAL_ALUMINUM_DUST = registerItem("alchemical_aluminum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_COPPER_DUST = registerItem("alchemical_copper_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_GOLD_DUST = registerItem("alchemical_gold_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_IRON_DUST = registerItem("alchemical_iron_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_LEAD_DUST = registerItem("alchemical_lead_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_NICKEL_DUST = registerItem("alchemical_nickel_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_PLATINUM_DUST = registerItem("alchemical_platinum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_SILVER_DUST = registerItem("alchemical_silver_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_TIN_DUST = registerItem("alchemical_tin_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_OSMIUM_DUST = registerItem("alchemical_osmium_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_URANIUM_DUST = registerItem("alchemical_uranium_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_ZINC_DUST = registerItem("alchemical_zinc_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_COBALT_DUST = registerItem("alchemical_cobalt_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Beeswax
    public static final RegistryObject<Item> ALUMINUM_WAX = registerItem("aluminum_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_WAX = registerItem("copper_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GOLD_WAX = registerItem("gold_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> IRON_WAX = registerItem("iron_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LEAD_WAX = registerItem("lead_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_WAX = registerItem("nickel_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_WAX = registerItem("platinum_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_WAX = registerItem("silver_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TIN_WAX = registerItem("tin_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_WAX = registerItem("osmium_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_WAX = registerItem("uranium_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_WAX = registerItem("zinc_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COBALT_WAX = registerItem("cobalt_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dirty Dust
    public static final RegistryObject<Item> DIRTY_DUST_NICKEL = registerItem("dirty_dust_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Clump
    public static final RegistryObject<Item> CLUMP_NICKEL = registerItem("clump_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Shard
    public static final RegistryObject<Item> SHARD_NICKEL = registerItem("shard_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Crystal
    public static final RegistryObject<Item> CRYSTAL_NICKEL = registerItem("crystal_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Gear
    public static final RegistryObject<Item> STEEL_GEAR = registerItem("steel_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_GEAR = registerItem("osmium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_GEAR = registerItem("uranium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINIUM_GEAR = registerItem("aluminium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Sawdust
    public static final RegistryObject<Item> BLOODY_SAWDUST = registerItem("bloody_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRASSY_SAWDUST = registerItem("grassy_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AZURE_SAWDUST = registerItem("azure_sawdust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Pigment
    public static final RegistryObject<Item> BLOODY_PIGMENT = registerItem("bloody_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GRASSY_PIGMENT = registerItem("grassy_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> AZURE_PIGMENT = registerItem("azure_pigment", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Processor
    public static final RegistryObject<Item> ENERGETIC_PROCESSOR = registerItem("energetic_processor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_PROCESSOR = registerItem("vibrant_processor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Cast
    public static final RegistryObject<Item> CHILLER_NUGGET_CAST = registerItem("chiller_nugget_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_GEAR_CAST = registerItem("chiller_gear_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_PLATE_CAST = registerItem("chiller_plate_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHILLER_COIN_CAST = registerItem("chiller_coin_cast", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Capacitor
    public static final RegistryObject<Item> REINFORCED_CAPACITOR = registerItem("reinforced_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STURDY_CAPACITOR = registerItem("sturdy_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DOUBLELAYERED_CAPACITOR = registerItem("doublelayered_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PRESSURIZED_CAPACITOR = registerItem("pressurized_capacitor", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_SOLENOID = registerItem("copper_solenoid", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Other

    public static final RegistryObject<Item> CRYSTAL_SHARD = registerItem("crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ALCHEMICAL_POWDER = registerItem("alchemical_powder", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> CIRCUIT_BOARD = registerItem("circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HEATING_ELEMENT = registerItem("heating_element", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ULTIMATE_RUNE = registerItem("ultimate_rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BASIC_ALLOY = registerItem("basic_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> WEIRD_FUNGU = registerItem("weird_fungu", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_STICK = registerItem("starlight_stick", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> RUNE = registerItem("rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SLIME_BOTTLE = registerItem("slime_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SKYSLIME_BOTTLE = registerItem("skyslime_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BLOOD_BOTTLE = registerItem("blood_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_TORCH = registerItem("item_tiny_torch", () -> new TinyTorchItem(BlockInit.TINY_TORCH.get(),
            BlockInit.WALL_TINY_TORCH.get(), new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_COAL = registerItem("tiny_coal", () -> new TinyCoalItem(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_SHARD = registerItem("starlight_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_PEARL = registerItem("starlight_infused_mana_pearl", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_DIAMOND = registerItem("starlight_infused_mana_diamond", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIO_PLASTIC = registerItem("bio_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLOUGH = registerItem("plough", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HARVESTING_WHEEL = registerItem("harvesting_wheel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Buckets

    public static final RegistryObject<Item> MOLTEN_MYTHRIL_BUCKET = registerItem("molten_mythril_bucket",
            () -> new BucketItem(FluidInit.MYTHRIL_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_BIO_PLASTIC_BUCKET = registerItem("molten_bio_plastic_bucket",
            () -> new BucketItem(FluidInit.MOLTEN_BIO_PLASTIC_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> LUBRIFIED_LPG_BUCKET = registerItem("lubrified_lpg_bucket",
            () -> new BucketItem(FluidInit.LUBRIFIED_LPG_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> CONDENSED_LPG_BUCKET = registerItem("condensed_lpg_bucket",
            () -> new BucketItem(FluidInit.CONDENSED_LPG_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> PROPYLENE_BUCKET = registerItem("propylene_bucket",
            () -> new BucketItem(FluidInit.PROPYLENE_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    public static final RegistryObject<Item> BENZENE_BUCKET = registerItem("benzene_bucket",
            () -> new BucketItem(FluidInit.BENZENE_FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));

    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);
    

    private static RegistryObject<Item> registerItem(String name) {
        return registerItem(name, new Item.Properties().tab(Main.ModItemGroup.instance));
    }

    private static RegistryObject<Item> registerItem(String name, Supplier<Item> sup) {
        return registerItem(name, sup);
    }
    
    private static RegistryObject<Item> registerItem(String name, Item item) {
        return registerItem(name, () -> item);
    }
    

    private static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return registerItem(name, new Item(properties));
    }
}
