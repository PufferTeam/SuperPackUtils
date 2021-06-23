package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.common.registration.impl.FluidDeferredRegister;
import mekanism.common.registration.impl.FluidRegistryObject;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.BucketItem;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.awt.Color;

public class FluidInit {

    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(Main.MOD_ID);

    //Liquid Gases
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ETHYL_CHLORIDE = register("ethyl_chloride",
            new Color(201, 201, 201));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SILICON_DIOXIDE = register("silicon_dioxide",
            Color.WHITE);

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> POLYETHENE = register("polyethene",
            new Color(57, 40, 59));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> CHEMICAL_DEATH = register("chemical_death",
            new Color(133, 136, 140));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> AMMONIA = register("ammonia",
            new Color(155, 180, 186));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> CYANIDE = register("cyanide",
            new Color(230, 230, 230));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> METHANE = register("methane",
            new Color(171, 130, 166));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> PURE_SULFURIC_ACID = register("pure_sulfuric_acid",
            new Color(150, 146, 59));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BENZENE = register("benzene",
            new Color(200, 209, 176));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BUTADIENE = register("butadiene",
            new Color(184, 209, 176));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ABS = register("abs",
            new Color(196, 196, 196));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ACRYLONITRILE = register("acrylonitrile",
            new Color(192, 209, 171));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> STYRENE = register("styrene",
            new Color(117, 122, 111));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ETHYL_BENZENE = register("ethyl_benzene",
            new Color(170, 179, 159));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> TOLUENE = register("toluene",
            new Color(145, 117, 89));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> OCTANE = register("octane",
            new Color(151, 158, 125));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BUTANE = register("butane",
            new Color(171, 128, 36));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BUTENE = register("butene",
            new Color(209, 172, 92));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> PROPANE = register("propane",
            new Color(153, 150, 60));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> PROPENE = register("propene",
            new Color(212, 207, 59));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ETBE = register("etbe",
            new Color(199, 194, 185));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ISOPRENE = register("isoprene",
            new Color(56, 41, 34));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BORIC_ACID = register("boric_acid",
            new Color(117, 100, 53));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> DIBORANE = register("diborane",
            new Color(148, 81, 109));

    //Fluid Only
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> PYROTHEUM = register("pyrotheum",
            new Color(255, 187, 0));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> MOLTEN_BIO_PLASTIC = register("molten_bio_plastic",
            new Color(171, 147, 67));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> NAPHTHA = register("naphtha",
            new Color(156, 121, 51));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SULFURIZED_NAPHTHA = register("sulfurized_naphtha",
            new Color(89, 69, 28));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SULFURIZED_LIGHT_OIL = register("sulfurized_light_oil",
            new Color(135, 135, 34));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SULFURIZED_HEAVY_OIL = register("sulfurized_heavy_oil",
            new Color(148, 94, 37));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SC_NAPHTHA = register("sc_naphtha",
            new Color(161, 137, 90));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> HC_NAPHTHA = register("hc_naphtha",
            new Color(128, 109, 70));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SC_LIGHT_OIL = register("sc_light_oil",
            new Color(143, 143, 74));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> HC_LIGHT_OIL = register("hc_light_oil",
            new Color(189, 189, 98));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SC_HEAVY_OIL = register("sc_heavy_oil",
            new Color(153, 116, 77));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> HC_HEAVY_OIL = register("hc_heavy_oil",
            new Color(207, 158, 107));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> EPOXY_RESIN = register("epoxy_resin",
            new Color(130, 82, 10));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BORAX_SOLUTION = register("borax_solution",
            new Color(88, 113, 133));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> BORON_NITRIDE_SOLUTION = register("boron_nitride_solution",
            new Color(87, 109, 125));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SF_SOLUTION = register("sf_solution",
            new Color(94, 123, 145));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> CS_SOLUTION = register("cs_solution",
            new Color(95, 120, 146));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> PF_SOLUTION = register("pf_solution",
            new Color(95, 120, 140));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SH_SOLUTION = register("sh_solution",
            new Color(94, 123, 150));

    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> PH_SOLUTION = register("ph_solution",
            new Color(95, 133, 150));

    private static int rgbToDecimal(Color color) {
        return (color.getRed() << 16) | (color.getGreen() << 8) | color.getBlue();
    }

    private static FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> register(String name, Color color) {
        name = name.replaceAll(" ", "_").toLowerCase();
        return FLUIDS.register(name, FluidAttributes.builder(Main.location("liquid/liquid_still"), Main.location("liquid/liquid_flow"))
                .color(rgbToDecimal(color)));
    }

    private static FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> register(String name, FluidAttributes.Builder attributes) {
        name = name.replaceAll("_", " ").toLowerCase();
        return FLUIDS.register(name, attributes);
    }

}
