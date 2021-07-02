package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.blocks.DestroyerOfTheNature;
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

    public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CHROMIUM_SHARD = ITEMS.register("chromium_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STAINLESS_STEEL_INGOT = ITEMS.register("stainless_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_PLATINUM_INGOT = ITEMS.register("electrical_platinum_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_STEEL_INGOT = ITEMS.register("electrical_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ELECTRICAL_HSLA_STEEL_INGOT = ITEMS.register("electrical_hsla_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COMPRESSED_STEEL_INGOT = ITEMS.register("compressed_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SUPERHEATED_BRONZE_INGOT = ITEMS.register("superheated_bronze_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINUM_BRASS_INGOT = ITEMS.register("aluminum_brass_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TETRAETHYL_LEAD_INGOT = ITEMS.register("tetraethyl_lead_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VIBRANT_ALLOY_INGOT = ITEMS.register("vibrant_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENERGETIC_ALLOY_INGOT = ITEMS.register("energetic_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> REDSTONE_ALLOY_INGOT = ITEMS.register("redstone_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OBSIDIAN_ALLOY_INGOT = ITEMS.register("obsidian_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GLOWSTONE_ALLOY_INGOT = ITEMS.register("glowstone_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> STELLAR_ALLOY_INGOT = ITEMS.register("stellar_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PULSATING_ALLOY_INGOT = ITEMS.register("pulsating_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> HSLA_STEEL_INGOT = ITEMS.register("hsla_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MIXED_ALLOY_INGOT = ITEMS.register("mixed_alloy_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_INGOT = ITEMS.register("boron_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RICH_SLAG_ALLOY = ITEMS.register("rich_slag_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CUPRONICKEL_INGOT = ITEMS.register("cupronickel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DARK_STEEL_INGOT = ITEMS.register("dark_steel_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PROSPERITY_INGOT = ITEMS.register("prosperity_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Refined Dust
    public static final RegistryObject<Item> REFINED_GLOWSTONE_DUST = ITEMS.register("refined_glowstone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> REFINED_REDSTONE_DUST = ITEMS.register("refined_redstone_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Refined Ingot
    public static final RegistryObject<Item> REFINED_REDSTONE_INGOT = ITEMS.register("refined_redstone_ingot", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Gem
    public static final RegistryObject<Item> CAROBBIITE = ITEMS.register("carobbiite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CAROBBIITE_DUST = ITEMS.register("carobbiite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_NITRIDE = ITEMS.register("boron_nitride", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_NITRIDE_DUST = ITEMS.register("boron_nitride_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RHODOCHROSITE = ITEMS.register("rhodochrosite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> RHODOCHROSITE_DUST = ITEMS.register("rhodochrosite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VILLIAUMITE = ITEMS.register("villiaumite", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> VILLIAUMITE_DUST = ITEMS.register("villiaumite_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_ARSENIDE = ITEMS.register("boron_arsenide", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> BORON_ARSENIDE_DUST = ITEMS.register("boron_arsenide_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Polished
    public static final RegistryObject<Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ADVANCED_CASING = ITEMS.register("advanced_casing", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENRICHED_PETCOKE = ITEMS.register("enriched_petcoke", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Nugget
    public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENDER_PEARL_NUGGET = ITEMS.register("ender_pearl_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> DARK_STEEL_NUGGET = ITEMS.register("dark_steel_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CUPRONICKEL_NUGGET = ITEMS.register("cupronickel_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

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
    public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("cobalt_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Crushed Ore
    public static final RegistryObject<Item> CRUSHED_COBALT_ORE = ITEMS.register("crushed_cobalt_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Blend
    public static final RegistryObject<Item> QUARTZ_ENRICHED_BLEND = ITEMS.register("quartz_enriched_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> CUPRONICKEL_BLEND = ITEMS.register("cupronickel_blend", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Alchemical Dusts
    public static final RegistryObject<Item> ALCHEMICAL_ALUMINUM_DUST = ITEMS.register("alchemical_aluminum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_COPPER_DUST = ITEMS.register("alchemical_copper_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_GOLD_DUST = ITEMS.register("alchemical_gold_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_IRON_DUST = ITEMS.register("alchemical_iron_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_LEAD_DUST = ITEMS.register("alchemical_lead_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_NICKEL_DUST = ITEMS.register("alchemical_nickel_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_PLATINUM_DUST = ITEMS.register("alchemical_platinum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_SILVER_DUST = ITEMS.register("alchemical_silver_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_TIN_DUST = ITEMS.register("alchemical_tin_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_OSMIUM_DUST = ITEMS.register("alchemical_osmium_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_URANIUM_DUST = ITEMS.register("alchemical_uranium_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_ZINC_DUST = ITEMS.register("alchemical_zinc_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALCHEMICAL_COBALT_DUST = ITEMS.register("alchemical_cobalt_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Beeswax
    public static final RegistryObject<Item> ALUMINUM_WAX = ITEMS.register("aluminum_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_WAX = ITEMS.register("copper_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> GOLD_WAX = ITEMS.register("gold_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> IRON_WAX = ITEMS.register("iron_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> LEAD_WAX = ITEMS.register("lead_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL_WAX = ITEMS.register("nickel_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_WAX = ITEMS.register("platinum_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_WAX = ITEMS.register("silver_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> TIN_WAX = ITEMS.register("tin_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_WAX = ITEMS.register("osmium_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_WAX = ITEMS.register("uranium_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ZINC_WAX = ITEMS.register("zinc_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> COBALT_WAX = ITEMS.register("cobalt_wax", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dirty Crushed Ore
    public static final RegistryObject<Item> PURIFIED_CRUSHED_ALUMINUM_ORE = ITEMS.register("purified_crushed_aluminum_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_COPPER_ORE = ITEMS.register("purified_crushed_copper_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_GOLD_ORE = ITEMS.register("purified_crushed_gold_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_IRON_ORE = ITEMS.register("purified_crushed_iron_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_LEAD_ORE = ITEMS.register("purified_crushed_lead_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_NICKEL_ORE = ITEMS.register("purified_crushed_nickel_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_OSMIUM_ORE = ITEMS.register("purified_crushed_osmium_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_PLATINUM_ORE = ITEMS.register("purified_crushed_platinum_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_SILVER_ORE = ITEMS.register("purified_crushed_silver_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_TIN_ORE = ITEMS.register("purified_crushed_tin_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_URANIUM_ORE = ITEMS.register("purified_crushed_uranium_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_ZINC_ORE = ITEMS.register("purified_crushed_zinc_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PURIFIED_CRUSHED_COBALT_ORE = ITEMS.register("purified_crushed_cobalt_ore", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Plastic
    public static final RegistryObject<Item> ABS_SHEET = ITEMS.register("abs_sheet", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ABS_PELLET = ITEMS.register("abs_pellet", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> POLYSTYRENE_BAR = ITEMS.register("polystyrene_bar", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Dirty Dust
    public static final RegistryObject<Item> DIRTY_DUST_NICKEL = ITEMS.register("dirty_dust_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Clump
    public static final RegistryObject<Item> CLUMP_NICKEL = ITEMS.register("clump_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Shard
    public static final RegistryObject<Item> SHARD_NICKEL = ITEMS.register("shard_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Crystal
    public static final RegistryObject<Item> CRYSTAL_NICKEL = ITEMS.register("crystal_nickel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Gear
    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> OSMIUM_GEAR = ITEMS.register("osmium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_GEAR = ITEMS.register("mythril_gear", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    //Plate
    public static final RegistryObject<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));
    public static final RegistryObject<Item> MYTHRIL_PLATE = ITEMS.register("mythril_plate", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

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

    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> POWERED_SUBSTANCE = ITEMS.register("powered_substance", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> CALCIUM_CARBURE = ITEMS.register("calcium_carbure", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> EPOXY_SLAG = ITEMS.register("epoxy_slag", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ELEMENTAL_GEM = ITEMS.register("elemental_gem", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> EPOXY_ROSIN = ITEMS.register("epoxy_rosin", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PYROTHEUM_DUST = ITEMS.register("pyrotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> CRYOTHEUM_DUST = ITEMS.register("cryotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PETROTHEUM_DUST = ITEMS.register("petrotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> AEROTHEUM_DUST = ITEMS.register("aerotheum_dust", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> MANGANESE_OXIDE = ITEMS.register("manganese_oxide", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BORAX_PULP = ITEMS.register("borax_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ARSENIC_PULP = ITEMS.register("arsenic_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SODIUM_HYDROXIDE_PULP = ITEMS.register("sodium_hydroxide_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SODIUM_FLUORIDE_PULP = ITEMS.register("sodium_fluoride_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> POTASSIUM_FLUORIDE_PULP = ITEMS.register("potassium_fluoride_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> POTASSIUM_HYDROXIDE_PULP = ITEMS.register("potassium_hydroxide_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> POLYDIMETHYLSILOXANE_PULP = ITEMS.register("polydimethylsiloxane_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> CALCIUM_SULFATE_PULP = ITEMS.register("calcium_sulfate_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PROSPERITY_NUGGET = ITEMS.register("prosperity_nugget", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TALC_PULP = ITEMS.register("talc_pulp", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ALCHEMICAL_POWDER = ITEMS.register("alchemical_powder", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> CIRCUIT_BOARD = ITEMS.register("circuit_board", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HEATING_ELEMENT = ITEMS.register("heating_element", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> ULTIMATE_RUNE = ITEMS.register("ultimate_rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BASIC_ALLOY = ITEMS.register("basic_alloy", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> WEIRD_FUNGU = ITEMS.register("weird_fungu", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_STICK = ITEMS.register("starlight_stick", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> RUNE = ITEMS.register("rune", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SLIME_BOTTLE = ITEMS.register("slime_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> SKYSLIME_BOTTLE = ITEMS.register("skyslime_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_TORCH = ITEMS.register("item_tiny_torch", () -> new TinyTorchItem(BlockInit.TINY_TORCH.get(),
            BlockInit.WALL_TINY_TORCH.get(), new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new TinyCoalItem(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_SHARD = ITEMS.register("starlight_shard", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_PEARL = ITEMS.register("starlight_infused_mana_pearl", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> STARLIGHT_INFUSED_MANA_DIAMOND = ITEMS.register("starlight_infused_mana_diamond", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> BIO_PLASTIC = ITEMS.register("bio_plastic", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> PLOUGH = ITEMS.register("plough", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> HARVESTING_WHEEL = ITEMS.register("harvesting_wheel", () -> new Item(new Item.Properties().tab(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> DESTROYER_OF_THE_NATURE = ITEMS.register("destroyer_of_the_nature", DestroyerOfTheNature::new);

    //VANILLA OVERRIDE
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> BREAD = VANILLA_ITEMS.register("bread", Bread::new);

}
