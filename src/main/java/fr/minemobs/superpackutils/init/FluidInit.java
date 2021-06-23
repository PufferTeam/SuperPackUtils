package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.common.registration.impl.FluidDeferredRegister;
import mekanism.common.registration.impl.FluidRegistryObject;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.awt.Color;

public class FluidInit {

    public static final ResourceLocation MOLTEN_BIO_PLASTIC_STILL_RL = Main.location("liquid/molten_bio_plastic_still");
    public static final ResourceLocation MOLTEN_BIO_PLASTIC_FLOWING_RL = Main.location("liquid/molten_bio_plastic_flowing");
    public static final ResourceLocation MOLTEN_BIO_PLASTIC_OVERLAY_RL = Main.location("liquid/molten_bio_plastic_overlay");

    public static final ResourceLocation PROPYLENE_STILL_RL = Main.location("liquid/propylene_still");
    public static final ResourceLocation PROPYLENE_FLOWING_RL = Main.location("liquid/propylene_flowing");
    public static final ResourceLocation PROPYLENE_OVERLAY_RL = Main.location("liquid/propylene_overlay");

    public static final ResourceLocation BENZENE_STILL_RL = Main.location("liquid/benzene_still");
    public static final ResourceLocation BENZENE_FLOWING_RL = Main.location("liquid/benzene_flowing");
    public static final ResourceLocation BENZENE_OVERLAY_RL = Main.location("liquid/benzene_overlay");

    public static final ResourceLocation BUTADIENE_STILL_RL = Main.location("liquid/butadiene_still");
    public static final ResourceLocation BUTADIENE_FLOWING_RL = Main.location("liquid/butadiene_flowing");
    public static final ResourceLocation BUTADIENE_OVERLAY_RL = Main.location("liquid/butadiene_overlay");

    public static final ResourceLocation ABS_STILL_RL = Main.location("liquid/abs_still");
    public static final ResourceLocation ABS_FLOWING_RL = Main.location("liquid/abs_flowing");
    public static final ResourceLocation ABS_OVERLAY_RL = Main.location("liquid/abs_overlay");

    public static final ResourceLocation ACRYLONITRILE_STILL_RL = Main.location("liquid/acrylonitrile_still");
    public static final ResourceLocation ACRYLONITRILE_FLOWING_RL = Main.location("liquid/acrylonitrile_flowing");
    public static final ResourceLocation ACRYLONITRILE_OVERLAY_RL = Main.location("liquid/acrylonitrile_overlay");

    public static final ResourceLocation STYRENE_STILL_RL = Main.location("liquid/styrene_still");
    public static final ResourceLocation STYRENE_FLOWING_RL = Main.location("liquid/styrene_flowing");
    public static final ResourceLocation STYRENE_OVERLAY_RL = Main.location("liquid/styrene_overlay");

    public static final ResourceLocation ETHYL_BENZENE_STILL_RL = Main.location("liquid/ethyl_benzene_still");
    public static final ResourceLocation ETHYL_BENZENE_FLOWING_RL = Main.location("liquid/ethyl_benzene_flowing");
    public static final ResourceLocation ETHYL_BENZENE_OVERLAY_RL = Main.location("liquid/ethyl_benzene_overlay");

    public static final ResourceLocation PYROTHEUM_STILL_RL = Main.location("liquid/pyrotheum_still");
    public static final ResourceLocation PYROTHEUM_FLOWING_RL = Main.location("liquid/pyrotheum_flowing");
    public static final ResourceLocation PYROTHEUM_OVERLAY_RL = Main.location("liquid/pyrotheum_overlay");

    public static final ResourceLocation METHANE_STILL_RL = Main.location("liquid/methane_still");
    public static final ResourceLocation METHANE_FLOWING_RL = Main.location("liquid/methane_flowing");
    public static final ResourceLocation METHANE_OVERLAY_RL = Main.location("liquid/methane_overlay");

    public static final ResourceLocation TOLUENE_STILL_RL = Main.location("liquid/toluene_still");
    public static final ResourceLocation TOLUENE_FLOWING_RL = Main.location("liquid/toluene_flowing");
    public static final ResourceLocation TOLUENE_OVERLAY_RL = Main.location("liquid/toluene_overlay");

    public static final ResourceLocation NAPHTHA_STILL_RL = Main.location("liquid/naphtha_still");
    public static final ResourceLocation NAPHTHA_FLOWING_RL = Main.location("liquid/naphtha_flowing");
    public static final ResourceLocation NAPHTHA_OVERLAY_RL = Main.location("liquid/naphtha_overlay");

    public static final ResourceLocation SULFURIZED_NAPHTHA_STILL_RL = Main.location("liquid/sulfurized_naphtha_still");
    public static final ResourceLocation SULFURIZED_NAPHTHA_FLOWING_RL = Main.location("liquid/sulfurized_naphtha_flowing");
    public static final ResourceLocation SULFURIZED_NAPHTHA_OVERLAY_RL = Main.location("liquid/sulfurized_naphtha_overlay");

    public static final ResourceLocation SULFURIZED_LIGHT_FUEL_STILL_RL = Main.location("liquid/sulfurized_light_fuel_still");
    public static final ResourceLocation SULFURIZED_LIGHT_FUEL_FLOWING_RL = Main.location("liquid/sulfurized_light_fuel_flowing");
    public static final ResourceLocation SULFURIZED_LIGHT_FUEL_OVERLAY_RL = Main.location("liquid/sulfurized_light_fuel_overlay");

    public static final ResourceLocation SULFURIZED_HEAVY_FUEL_STILL_RL = Main.location("liquid/sulfurized_heavy_fuel_still");
    public static final ResourceLocation SULFURIZED_HEAVY_FUEL_FLOWING_RL = Main.location("liquid/sulfurized_heavy_fuel_flowing");
    public static final ResourceLocation SULFURIZED_HEAVY_FUEL_OVERLAY_RL = Main.location("liquid/sulfurized_heavy_fuel_overlay");

    public static final ResourceLocation SC_NAPHTHA_STILL_RL = Main.location("liquid/sc_naphtha_still");
    public static final ResourceLocation SC_NAPHTHA_FLOWING_RL = Main.location("liquid/sc_naphtha_flowing");
    public static final ResourceLocation SC_NAPHTHA_OVERLAY_RL = Main.location("liquid/sc_naphtha_overlay");

    public static final ResourceLocation HC_NAPHTHA_STILL_RL = Main.location("liquid/hc_naphtha_still");
    public static final ResourceLocation HC_NAPHTHA_FLOWING_RL = Main.location("liquid/hc_naphtha_flowing");
    public static final ResourceLocation HC_NAPHTHA_OVERLAY_RL = Main.location("liquid/hc_naphtha_overlay");

    public static final ResourceLocation SC_LIGHT_FUEL_STILL_RL = Main.location("liquid/sc_light_fuel_still");
    public static final ResourceLocation SC_LIGHT_FUEL_FLOWING_RL = Main.location("liquid/sc_light_fuel_flowing");
    public static final ResourceLocation SC_LIGHT_FUEL_OVERLAY_RL = Main.location("liquid/sc_light_fuel_overlay");

    public static final ResourceLocation HC_LIGHT_FUEL_STILL_RL = Main.location("liquid/hc_light_fuel_still");
    public static final ResourceLocation HC_LIGHT_FUEL_FLOWING_RL = Main.location("liquid/hc_light_fuel_flowing");
    public static final ResourceLocation HC_LIGHT_FUEL_OVERLAY_RL = Main.location("liquid/hc_light_fuel_overlay");

    public static final ResourceLocation SC_HEAVY_FUEL_STILL_RL = Main.location("liquid/sc_heavy_fuel_still");
    public static final ResourceLocation SC_HEAVY_FUEL_FLOWING_RL = Main.location("liquid/sc_heavy_fuel_flowing");
    public static final ResourceLocation SC_HEAVY_FUEL_OVERLAY_RL = Main.location("liquid/sc_heavy_fuel_overlay");

    public static final ResourceLocation HC_HEAVY_FUEL_STILL_RL = Main.location("liquid/hc_heavy_fuel_still");
    public static final ResourceLocation HC_HEAVY_FUEL_FLOWING_RL = Main.location("liquid/hc_heavy_fuel_flowing");
    public static final ResourceLocation HC_HEAVY_FUEL_OVERLAY_RL = Main.location("liquid/hc_heavy_fuel_overlay");

    public static final ResourceLocation OCTANE_STILL_RL = Main.location("liquid/octane_still");
    public static final ResourceLocation OCTANE_FLOWING_RL = Main.location("liquid/octane_flowing");
    public static final ResourceLocation OCTANE_OVERLAY_RL = Main.location("liquid/octane_overlay");

    public static final ResourceLocation BUTANE_STILL_RL = Main.location("liquid/butane_still");
    public static final ResourceLocation BUTANE_FLOWING_RL = Main.location("liquid/butane_flowing");
    public static final ResourceLocation BUTANE_OVERLAY_RL = Main.location("liquid/butane_overlay");

    public static final ResourceLocation BUTENE_STILL_RL = Main.location("liquid/butene_still");
    public static final ResourceLocation BUTENE_FLOWING_RL = Main.location("liquid/butene_flowing");
    public static final ResourceLocation BUTENE_OVERLAY_RL = Main.location("liquid/butene_overlay");

    public static final ResourceLocation PROPANE_STILL_RL = Main.location("liquid/propane_still");
    public static final ResourceLocation PROPANE_FLOWING_RL = Main.location("liquid/propane_flowing");
    public static final ResourceLocation PROPANE_OVERLAY_RL = Main.location("liquid/propane_overlay");

    public static final ResourceLocation PROPENE_STILL_RL = Main.location("liquid/propene_still");
    public static final ResourceLocation PROPENE_FLOWING_RL = Main.location("liquid/propene_flowing");
    public static final ResourceLocation PROPENE_OVERLAY_RL = Main.location("liquid/propene_overlay");

    public static final ResourceLocation RAW_GASOLINE_STILL_RL = Main.location("liquid/raw_gasoline_still");
    public static final ResourceLocation RAW_GASOLINE_FLOWING_RL = Main.location("liquid/raw_gasoline_flowing");
    public static final ResourceLocation RAW_GASOLINE_OVERLAY_RL = Main.location("liquid/raw_gasoline_overlay");

    public static final ResourceLocation HO_GASOLINE_STILL_RL = Main.location("liquid/ho_gasoline_still");
    public static final ResourceLocation HO_GASOLINE_FLOWING_RL = Main.location("liquid/ho_gasoline_flowing");
    public static final ResourceLocation HO_GASOLINE_OVERLAY_RL = Main.location("liquid/ho_gasoline_overlay");

    public static final ResourceLocation ETBE_STILL_RL = Main.location("liquid/etbe_still");
    public static final ResourceLocation ETBE_FLOWING_RL = Main.location("liquid/etbe_flowing");
    public static final ResourceLocation ETBE_OVERLAY_RL = Main.location("liquid/etbe_overlay");

    public static final ResourceLocation ISOPRENE_STILL_RL = Main.location("liquid/isoprene_still");
    public static final ResourceLocation ISOPRENE_FLOWING_RL = Main.location("liquid/isoprene_flowing");
    public static final ResourceLocation ISOPRENE_OVERLAY_RL = Main.location("liquid/isoprene_overlay");

    public static final ResourceLocation EPOXY_RESIN_STILL_RL = Main.location("liquid/epoxy_resin_still");
    public static final ResourceLocation EPOXY_RESIN_FLOWING_RL = Main.location("liquid/epoxy_resin_flowing");
    public static final ResourceLocation EPOXY_RESIN_OVERLAY_RL = Main.location("liquid/epoxy_resin_overlay");

    public static final ResourceLocation BORAX_SOLUTION_STILL_RL = Main.location("liquid/borax_solution_still");
    public static final ResourceLocation BORAX_SOLUTION_FLOWING_RL = Main.location("liquid/borax_solution_flowing");
    public static final ResourceLocation BORAX_SOLUTION_OVERLAY_RL = Main.location("liquid/borax_solution_overlay");

    public static final ResourceLocation SF_SOLUTION_STILL_RL = Main.location("liquid/sf_solution_still");
    public static final ResourceLocation SF_SOLUTION_FLOWING_RL = Main.location("liquid/sf_solution_flowing");
    public static final ResourceLocation SF_SOLUTION_OVERLAY_RL = Main.location("liquid/sf_solution_overlay");

    public static final ResourceLocation BORIC_ACID_STILL_RL = Main.location("liquid/boric_acid_still");
    public static final ResourceLocation BORIC_ACID_FLOWING_RL = Main.location("liquid/boric_acid_flowing");
    public static final ResourceLocation BORIC_ACID_OVERLAY_RL = Main.location("liquid/boric_acid_overlay");

    public static final ResourceLocation DIBORANE_STILL_RL = Main.location("liquid/diborane_still");
    public static final ResourceLocation DIBORANE_FLOWING_RL = Main.location("liquid/diborane_flowing");
    public static final ResourceLocation DIBORANE_OVERLAY_RL = Main.location("liquid/diborane_overlay");

    public static final DeferredRegister<Fluid> OLD_FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(Main.MOD_ID);

    //Old way

    public static final RegistryObject<FlowingFluid> MOLTEN_BIO_PLASTIC_FLUID = OLD_FLUIDS.register("molten_bio_plastic_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_BIO_PLASTIC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BIO_PLASTIC_FLOWING = OLD_FLUIDS.register("molten_bio_plastic_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_BIO_PLASTIC_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PROPYLENE_FLUID = OLD_FLUIDS.register("propylene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.PROPYLENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PROPYLENE_FLOWING = OLD_FLUIDS.register("propylene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.PROPYLENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BENZENE_FLUID = OLD_FLUIDS.register("benzene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BENZENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BENZENE_FLOWING = OLD_FLUIDS.register("benzene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BENZENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BUTADIENE_FLUID = OLD_FLUIDS.register("butadiene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BUTADIENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BUTADIENE_FLOWING = OLD_FLUIDS.register("butadiene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BUTADIENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ABS_FLUID = OLD_FLUIDS.register("abs_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ABS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ABS_FLOWING = OLD_FLUIDS.register("abs_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ABS_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ACRYLONITRILE_FLUID = OLD_FLUIDS.register("acrylonitrile_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ACRYLONITRILE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ACRYLONITRILE_FLOWING = OLD_FLUIDS.register("acrylonitrile_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ACRYLONITRILE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> STYRENE_FLUID = OLD_FLUIDS.register("styrene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.STYRENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> STYRENE_FLOWING = OLD_FLUIDS.register("styrene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.STYRENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ETHYL_BENZENE_FLUID = OLD_FLUIDS.register("ethyl_benzene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ETHYL_BENZENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ETHYL_BENZENE_FLOWING = OLD_FLUIDS.register("ethyl_benzene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ETHYL_BENZENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PYROTHEUM_FLUID = OLD_FLUIDS.register("pyrotheum_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.PYROTHEUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PYROTHEUM_FLOWING = OLD_FLUIDS.register("pyrotheum_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.PYROTHEUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> METHANE_FLUID = OLD_FLUIDS.register("methane_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.METHANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> METHANE_FLOWING = OLD_FLUIDS.register("methane_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.METHANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TOLUENE_FLUID = OLD_FLUIDS.register("toluene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.TOLUENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> TOLUENE_FLOWING = OLD_FLUIDS.register("toluene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.TOLUENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> NAPHTHA_FLUID = OLD_FLUIDS.register("naphtha_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.NAPHTHA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> NAPHTHA_FLOWING = OLD_FLUIDS.register("naphtha_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.NAPHTHA_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SULFURIZED_NAPHTHA_FLUID = OLD_FLUIDS.register("sulfurized_naphtha_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SULFURIZED_NAPHTHA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SULFURIZED_NAPHTHA_FLOWING = OLD_FLUIDS.register("sulfurized_naphtha_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SULFURIZED_NAPHTHA_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SULFURIZED_LIGHT_FUEL_FLUID = OLD_FLUIDS.register("sulfurized_light_fuel_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SULFURIZED_LIGHT_FUEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SULFURIZED_LIGHT_FUEL_FLOWING = OLD_FLUIDS.register("sulfurized_light_fuel_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SULFURIZED_LIGHT_FUEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SULFURIZED_HEAVY_FUEL_FLUID = OLD_FLUIDS.register("sulfurized_heavy_fuel_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SULFURIZED_HEAVY_FUEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SULFURIZED_HEAVY_FUEL_FLOWING = OLD_FLUIDS.register("sulfurized_heavy_fuel_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SULFURIZED_HEAVY_FUEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SC_NAPHTHA_FLUID = OLD_FLUIDS.register("sc_naphtha_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SC_NAPHTHA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SC_NAPHTHA_FLOWING = OLD_FLUIDS.register("sc_naphtha_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SC_NAPHTHA_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HC_NAPHTHA_FLUID = OLD_FLUIDS.register("hc_naphtha_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.HC_NAPHTHA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HC_NAPHTHA_FLOWING = OLD_FLUIDS.register("hc_naphtha_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.HC_NAPHTHA_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SC_LIGHT_FUEL_FLUID = OLD_FLUIDS.register("sc_light_fuel_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SC_LIGHT_FUEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SC_LIGHT_FUEL_FLOWING = OLD_FLUIDS.register("sc_light_fuel_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SC_LIGHT_FUEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HC_LIGHT_FUEL_FLUID = OLD_FLUIDS.register("hc_light_fuel_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.HC_LIGHT_FUEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HC_LIGHT_FUEL_FLOWING = OLD_FLUIDS.register("hc_light_fuel_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.HC_LIGHT_FUEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SC_HEAVY_FUEL_FLUID = OLD_FLUIDS.register("sc_heavy_fuel_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SC_HEAVY_FUEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SC_HEAVY_FUEL_FLOWING = OLD_FLUIDS.register("sc_heavy_fuel_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SC_HEAVY_FUEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HC_HEAVY_FUEL_FLUID = OLD_FLUIDS.register("hc_heavy_fuel_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.HC_HEAVY_FUEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HC_HEAVY_FUEL_FLOWING = OLD_FLUIDS.register("hc_heavy_fuel_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.HC_HEAVY_FUEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OCTANE_FLUID = OLD_FLUIDS.register("octane_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.OCTANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OCTANE_FLOWING = OLD_FLUIDS.register("octane_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.OCTANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BUTANE_FLUID = OLD_FLUIDS.register("butane_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BUTANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BUTANE_FLOWING = OLD_FLUIDS.register("butane_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BUTANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BUTENE_FLUID = OLD_FLUIDS.register("butene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BUTENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BUTENE_FLOWING = OLD_FLUIDS.register("butene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BUTENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PROPANE_FLUID = OLD_FLUIDS.register("propane_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.PROPANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PROPANE_FLOWING = OLD_FLUIDS.register("propane_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.PROPANE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PROPENE_FLUID = OLD_FLUIDS.register("propene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.PROPENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PROPENE_FLOWING = OLD_FLUIDS.register("propene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.PROPENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> RAW_GASOLINE_FLUID = OLD_FLUIDS.register("raw_gasoline_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.RAW_GASOLINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> RAW_GASOLINE_FLOWING = OLD_FLUIDS.register("raw_gasoline_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.RAW_GASOLINE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HO_GASOLINE_FLUID = OLD_FLUIDS.register("ho_gasoline_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.HO_GASOLINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HO_GASOLINE_FLOWING = OLD_FLUIDS.register("ho_gasoline_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.HO_GASOLINE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ETBE_FLUID = OLD_FLUIDS.register("etbe_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ETBE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ETBE_FLOWING = OLD_FLUIDS.register("etbe_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ETBE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ISOPRENE_FLUID = OLD_FLUIDS.register("isoprene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ISOPRENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ISOPRENE_FLOWING = OLD_FLUIDS.register("isoprene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ISOPRENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> EPOXY_RESIN_FLUID = OLD_FLUIDS.register("epoxy_resin_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.EPOXY_RESIN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> EPOXY_RESIN_FLOWING = OLD_FLUIDS.register("epoxy_resin_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.EPOXY_RESIN_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BORAX_SOLUTION_FLUID = OLD_FLUIDS.register("borax_solution_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BORAX_SOLUTION_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BORAX_SOLUTION_FLOWING = OLD_FLUIDS.register("borax_solution_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BORAX_SOLUTION_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SF_SOLUTION_FLUID = OLD_FLUIDS.register("sf_solution_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.SF_SOLUTION_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SF_SOLUTION_FLOWING = OLD_FLUIDS.register("sf_solution_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.SF_SOLUTION_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BORIC_ACID_FLUID = OLD_FLUIDS.register("boric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BORIC_ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BORIC_ACID_FLOWING = OLD_FLUIDS.register("boric_acid_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BORIC_ACID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> DIBORANE_FLUID = OLD_FLUIDS.register("diborane_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.DIBORANE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> DIBORANE_FLOWING = OLD_FLUIDS.register("diborane_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.DIBORANE_PROPERTIES));

    //New way

    //Test fluids
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> TEST_FLUID = register("test", 0xFF0D1455);
    //Test Fluids

    public static final ForgeFlowingFluid.Properties MOLTEN_BIO_PLASTIC_PROPERTIES = new ForgeFlowingFluid.Properties(
            MOLTEN_BIO_PLASTIC_FLUID, MOLTEN_BIO_PLASTIC_FLOWING, FluidAttributes.builder(MOLTEN_BIO_PLASTIC_STILL_RL, MOLTEN_BIO_PLASTIC_FLOWING_RL)
            .viscosity(3).density(5).overlay(MOLTEN_BIO_PLASTIC_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_BIO_PLASTIC_BLOCK).bucket(ItemInit.MOLTEN_BIO_PLASTIC_BUCKET);

    public static final ForgeFlowingFluid.Properties PROPYLENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            PROPYLENE_FLUID, PROPYLENE_FLOWING, FluidAttributes.builder(PROPYLENE_STILL_RL, PROPYLENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(PROPYLENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.PROPYLENE_BLOCK).bucket(ItemInit.PROPYLENE_BUCKET);

    public static final ForgeFlowingFluid.Properties BENZENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            BENZENE_FLUID, BENZENE_FLOWING, FluidAttributes.builder(BENZENE_STILL_RL, BENZENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(BENZENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.BENZENE_BLOCK).bucket(ItemInit.BENZENE_BUCKET);

    public static final ForgeFlowingFluid.Properties BUTADIENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            BUTADIENE_FLUID, BUTADIENE_FLOWING, FluidAttributes.builder(BUTADIENE_STILL_RL, BUTADIENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(BUTADIENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.BUTADIENE_BLOCK).bucket(ItemInit.BUTADIENE_BUCKET);

    public static final ForgeFlowingFluid.Properties ABS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ABS_FLUID, ABS_FLOWING, FluidAttributes.builder(ABS_STILL_RL, ABS_FLOWING_RL)
            .viscosity(3).density(5).overlay(ABS_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.ABS_BLOCK).bucket(ItemInit.ABS_BUCKET);

    public static final ForgeFlowingFluid.Properties ACRYLONITRILE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ACRYLONITRILE_FLUID, ACRYLONITRILE_FLOWING, FluidAttributes.builder(ACRYLONITRILE_STILL_RL, ACRYLONITRILE_FLOWING_RL)
            .viscosity(3).density(5).overlay(ACRYLONITRILE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.ACRYLONITRILE_BLOCK).bucket(ItemInit.ACRYLONITRILE_BUCKET);

    public static final ForgeFlowingFluid.Properties STYRENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            STYRENE_FLUID, STYRENE_FLOWING, FluidAttributes.builder(STYRENE_STILL_RL, STYRENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(STYRENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.STYRENE_BLOCK).bucket(ItemInit.STYRENE_BUCKET);

    public static final ForgeFlowingFluid.Properties ETHYL_BENZENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ETHYL_BENZENE_FLUID, ETHYL_BENZENE_FLOWING, FluidAttributes.builder(ETHYL_BENZENE_STILL_RL, ETHYL_BENZENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(ETHYL_BENZENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.ETHYL_BENZENE_BLOCK).bucket(ItemInit.ETHYL_BENZENE_BUCKET);

    public static final ForgeFlowingFluid.Properties PYROTHEUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            PYROTHEUM_FLUID, PYROTHEUM_FLOWING, FluidAttributes.builder(PYROTHEUM_STILL_RL, PYROTHEUM_FLOWING_RL)
            .viscosity(3).density(5).overlay(PYROTHEUM_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.PYROTHEUM_BLOCK).bucket(ItemInit.PYROTHEUM_BUCKET);

    public static final ForgeFlowingFluid.Properties METHANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            METHANE_FLUID, METHANE_FLOWING, FluidAttributes.builder(METHANE_STILL_RL, METHANE_FLOWING_RL)
            .viscosity(3).density(5).overlay(METHANE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.METHANE_BLOCK).bucket(ItemInit.METHANE_BUCKET);

    public static final ForgeFlowingFluid.Properties TOLUENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            TOLUENE_FLUID, TOLUENE_FLOWING, FluidAttributes.builder(TOLUENE_STILL_RL, TOLUENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(TOLUENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.TOLUENE_BLOCK).bucket(ItemInit.TOLUENE_BUCKET);

    public static final ForgeFlowingFluid.Properties NAPHTHA_PROPERTIES = new ForgeFlowingFluid.Properties(
            NAPHTHA_FLUID, NAPHTHA_FLOWING, FluidAttributes.builder(NAPHTHA_STILL_RL, NAPHTHA_FLOWING_RL)
            .viscosity(3).density(5).overlay(NAPHTHA_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.NAPHTHA_BLOCK).bucket(ItemInit.NAPHTHA_BUCKET);

    public static final ForgeFlowingFluid.Properties SULFURIZED_NAPHTHA_PROPERTIES = new ForgeFlowingFluid.Properties(
            SULFURIZED_NAPHTHA_FLUID, SULFURIZED_NAPHTHA_FLOWING, FluidAttributes.builder(SULFURIZED_NAPHTHA_STILL_RL, SULFURIZED_NAPHTHA_FLOWING_RL)
            .viscosity(3).density(5).overlay(SULFURIZED_NAPHTHA_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SULFURIZED_NAPHTHA_BLOCK).bucket(ItemInit.SULFURIZED_NAPHTHA_BUCKET);

    public static final ForgeFlowingFluid.Properties SULFURIZED_LIGHT_FUEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            SULFURIZED_LIGHT_FUEL_FLUID, SULFURIZED_LIGHT_FUEL_FLOWING, FluidAttributes.builder(SULFURIZED_LIGHT_FUEL_STILL_RL, SULFURIZED_LIGHT_FUEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(SULFURIZED_LIGHT_FUEL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SULFURIZED_LIGHT_FUEL_BLOCK).bucket(ItemInit.SULFURIZED_LIGHT_FUEL_BUCKET);

    public static final ForgeFlowingFluid.Properties SULFURIZED_HEAVY_FUEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            SULFURIZED_HEAVY_FUEL_FLUID, SULFURIZED_HEAVY_FUEL_FLOWING, FluidAttributes.builder(SULFURIZED_HEAVY_FUEL_STILL_RL, SULFURIZED_HEAVY_FUEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(SULFURIZED_HEAVY_FUEL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SULFURIZED_HEAVY_FUEL_BLOCK).bucket(ItemInit.SULFURIZED_HEAVY_FUEL_BUCKET);

    public static final ForgeFlowingFluid.Properties SC_NAPHTHA_PROPERTIES = new ForgeFlowingFluid.Properties(
            SC_NAPHTHA_FLUID, SC_NAPHTHA_FLOWING, FluidAttributes.builder(SC_NAPHTHA_STILL_RL, SC_NAPHTHA_FLOWING_RL)
            .viscosity(3).density(5).overlay(SC_NAPHTHA_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SC_NAPHTHA_BLOCK).bucket(ItemInit.SC_NAPHTHA_BUCKET);

    public static final ForgeFlowingFluid.Properties HC_NAPHTHA_PROPERTIES = new ForgeFlowingFluid.Properties(
            HC_NAPHTHA_FLUID, HC_NAPHTHA_FLOWING, FluidAttributes.builder(HC_NAPHTHA_STILL_RL, HC_NAPHTHA_FLOWING_RL)
            .viscosity(3).density(5).overlay(HC_NAPHTHA_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.HC_NAPHTHA_BLOCK).bucket(ItemInit.HC_NAPHTHA_BUCKET);

    public static final ForgeFlowingFluid.Properties SC_LIGHT_FUEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            SC_LIGHT_FUEL_FLUID, SC_LIGHT_FUEL_FLOWING, FluidAttributes.builder(SC_LIGHT_FUEL_STILL_RL, SC_LIGHT_FUEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(SC_LIGHT_FUEL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SC_LIGHT_FUEL_BLOCK).bucket(ItemInit.SC_LIGHT_FUEL_BUCKET);

    public static final ForgeFlowingFluid.Properties HC_LIGHT_FUEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            HC_LIGHT_FUEL_FLUID, HC_LIGHT_FUEL_FLOWING, FluidAttributes.builder(HC_LIGHT_FUEL_STILL_RL, HC_LIGHT_FUEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(HC_LIGHT_FUEL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.HC_LIGHT_FUEL_BLOCK).bucket(ItemInit.HC_LIGHT_FUEL_BUCKET);

    public static final ForgeFlowingFluid.Properties SC_HEAVY_FUEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            SC_HEAVY_FUEL_FLUID, SC_HEAVY_FUEL_FLOWING, FluidAttributes.builder(SC_HEAVY_FUEL_STILL_RL, SC_HEAVY_FUEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(SC_HEAVY_FUEL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SC_HEAVY_FUEL_BLOCK).bucket(ItemInit.SC_HEAVY_FUEL_BUCKET);

    public static final ForgeFlowingFluid.Properties HC_HEAVY_FUEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            HC_HEAVY_FUEL_FLUID, HC_HEAVY_FUEL_FLOWING, FluidAttributes.builder(HC_HEAVY_FUEL_STILL_RL, HC_HEAVY_FUEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(HC_HEAVY_FUEL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.HC_HEAVY_FUEL_BLOCK).bucket(ItemInit.HC_HEAVY_FUEL_BUCKET);

    public static final ForgeFlowingFluid.Properties OCTANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            OCTANE_FLUID, OCTANE_FLOWING, FluidAttributes.builder(OCTANE_STILL_RL, OCTANE_FLOWING_RL)
            .viscosity(3).density(5).overlay(OCTANE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.OCTANE_BLOCK).bucket(ItemInit.OCTANE_BUCKET);

    public static final ForgeFlowingFluid.Properties BUTANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            BUTANE_FLUID, BUTANE_FLOWING, FluidAttributes.builder(BUTANE_STILL_RL, BUTANE_FLOWING_RL)
            .viscosity(3).density(5).overlay(BUTANE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.BUTANE_BLOCK).bucket(ItemInit.BUTANE_BUCKET);

    public static final ForgeFlowingFluid.Properties BUTENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            BUTENE_FLUID, BUTENE_FLOWING, FluidAttributes.builder(BUTENE_STILL_RL, BUTENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(BUTENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.BUTENE_BLOCK).bucket(ItemInit.BUTENE_BUCKET);

    public static final ForgeFlowingFluid.Properties PROPANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            PROPANE_FLUID, PROPANE_FLOWING, FluidAttributes.builder(PROPANE_STILL_RL, PROPANE_FLOWING_RL)
            .viscosity(3).density(5).overlay(PROPANE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.PROPANE_BLOCK).bucket(ItemInit.PROPANE_BUCKET);

    public static final ForgeFlowingFluid.Properties PROPENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            PROPENE_FLUID, PROPENE_FLOWING, FluidAttributes.builder(PROPENE_STILL_RL, PROPENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(PROPENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.PROPENE_BLOCK).bucket(ItemInit.PROPENE_BUCKET);

    public static final ForgeFlowingFluid.Properties RAW_GASOLINE_PROPERTIES = new ForgeFlowingFluid.Properties(
            RAW_GASOLINE_FLUID, RAW_GASOLINE_FLOWING, FluidAttributes.builder(RAW_GASOLINE_STILL_RL, RAW_GASOLINE_FLOWING_RL)
            .viscosity(3).density(5).overlay(RAW_GASOLINE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.RAW_GASOLINE_BLOCK).bucket(ItemInit.RAW_GASOLINE_BUCKET);

    public static final ForgeFlowingFluid.Properties HO_GASOLINE_PROPERTIES = new ForgeFlowingFluid.Properties(
            HO_GASOLINE_FLUID, HO_GASOLINE_FLOWING, FluidAttributes.builder(HO_GASOLINE_STILL_RL, HO_GASOLINE_FLOWING_RL)
            .viscosity(3).density(5).overlay(HO_GASOLINE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.HO_GASOLINE_BLOCK).bucket(ItemInit.HO_GASOLINE_BUCKET);

    public static final ForgeFlowingFluid.Properties ETBE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ETBE_FLUID, ETBE_FLOWING, FluidAttributes.builder(ETBE_STILL_RL, ETBE_FLOWING_RL)
            .viscosity(3).density(5).overlay(ETBE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.ETBE_BLOCK).bucket(ItemInit.ETBE_BUCKET);

    public static final ForgeFlowingFluid.Properties ISOPRENE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ISOPRENE_FLUID, ISOPRENE_FLOWING, FluidAttributes.builder(ISOPRENE_STILL_RL, ISOPRENE_FLOWING_RL)
            .viscosity(3).density(5).overlay(ISOPRENE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.ISOPRENE_BLOCK).bucket(ItemInit.ISOPRENE_BUCKET);

    public static final ForgeFlowingFluid.Properties EPOXY_RESIN_PROPERTIES = new ForgeFlowingFluid.Properties(
            EPOXY_RESIN_FLUID, EPOXY_RESIN_FLOWING, FluidAttributes.builder(EPOXY_RESIN_STILL_RL, EPOXY_RESIN_FLOWING_RL)
            .viscosity(3).density(5).overlay(EPOXY_RESIN_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.EPOXY_RESIN_BLOCK).bucket(ItemInit.EPOXY_RESIN_BUCKET);

    public static final ForgeFlowingFluid.Properties BORAX_SOLUTION_PROPERTIES = new ForgeFlowingFluid.Properties(
            BORAX_SOLUTION_FLUID, BORAX_SOLUTION_FLOWING, FluidAttributes.builder(BORAX_SOLUTION_STILL_RL, BORAX_SOLUTION_FLOWING_RL)
            .viscosity(3).density(5).overlay(BORAX_SOLUTION_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.BORAX_SOLUTION_BLOCK).bucket(ItemInit.BORAX_SOLUTION_BUCKET);

    public static final ForgeFlowingFluid.Properties SF_SOLUTION_PROPERTIES = new ForgeFlowingFluid.Properties(
            SF_SOLUTION_FLUID, SF_SOLUTION_FLOWING, FluidAttributes.builder(SF_SOLUTION_STILL_RL, SF_SOLUTION_FLOWING_RL)
            .viscosity(3).density(5).overlay(SF_SOLUTION_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.SF_SOLUTION_BLOCK).bucket(ItemInit.SF_SOLUTION_BUCKET);

    public static final ForgeFlowingFluid.Properties BORIC_ACID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BORIC_ACID_FLUID, BORIC_ACID_FLOWING, FluidAttributes.builder(BORIC_ACID_STILL_RL, BORIC_ACID_FLOWING_RL)
            .viscosity(3).density(5).overlay(BORIC_ACID_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.BORIC_ACID_BLOCK).bucket(ItemInit.BORIC_ACID_BUCKET);

    public static final ForgeFlowingFluid.Properties DIBORANE_PROPERTIES = new ForgeFlowingFluid.Properties(
            DIBORANE_FLUID, DIBORANE_FLOWING, FluidAttributes.builder(DIBORANE_STILL_RL, DIBORANE_FLOWING_RL)
            .viscosity(3).density(5).overlay(DIBORANE_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.DIBORANE_BLOCK).bucket(ItemInit.DIBORANE_BUCKET);

    private static FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> register(String name, int hexColor) {
        name = name.replaceAll("_", " ").toLowerCase();
        return FLUIDS.register(name, FluidAttributes.builder(Main.location("liquid/liquid_still"), Main.location("liquid/liquid_flow"))
                .color(hexColor));
    }

    private static FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> register(String name, FluidAttributes.Builder attributes) {
        name = name.replaceAll("_", " ").toLowerCase();
        return FLUIDS.register(name, attributes);
    }
}
