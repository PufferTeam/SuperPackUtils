package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {

    public static final ResourceLocation MYTHRIL_STILL_RL = Main.location("block/mythril_still");
    public static final ResourceLocation MYTHRIL_FLOWING_RL = Main.location("block/mythril_flowing");
    public static final ResourceLocation MYTHRIL_OVERLAY_RL = Main.location("block/mythril_overlay");

    public static final ResourceLocation MOLTEN_BIO_PLASTIC_STILL_RL = Main.location("block/molten_bio_plastic_still");
    public static final ResourceLocation MOLTEN_BIO_PLASTIC_FLOWING_RL = Main.location("block/molten_bio_plastic_flowing");
    public static final ResourceLocation MOLTEN_BIO_PLASTIC_OVERLAY_RL = Main.location("block/molten_bio_plastic_overlay");

    public static final ResourceLocation CONDENSED_LPG_STILL_RL = Main.location("block/condensed_lpg_still");
    public static final ResourceLocation CONDENSED_LPG_FLOWING_RL = Main.location("block/condensed_lpg_flowing");
    public static final ResourceLocation CONDENSED_LPG_OVERLAY_RL = Main.location("block/condensed_lpg_overlay");

    public static final ResourceLocation PROPYLENE_STILL_RL = Main.location("block/propylene_still");
    public static final ResourceLocation PROPYLENE_FLOWING_RL = Main.location("block/propylene_flowing");
    public static final ResourceLocation PROPYLENE_OVERLAY_RL = Main.location("block/propylene_overlay");

    public static final ResourceLocation BENZENE_STILL_RL = Main.location("block/benzene_still");
    public static final ResourceLocation BENZENE_FLOWING_RL = Main.location("block/benzene_flowing");
    public static final ResourceLocation BENZENE_OVERLAY_RL = Main.location("block/benzene_overlay");

    public static final ResourceLocation BUTADIENE_STILL_RL = Main.location("block/butadiene_still");
    public static final ResourceLocation BUTADIENE_FLOWING_RL = Main.location("block/butadiene_flowing");
    public static final ResourceLocation BUTADIENE_OVERLAY_RL = Main.location("block/butadiene_overlay");

    public static final ResourceLocation ABS_STILL_RL = Main.location("block/abs_still");
    public static final ResourceLocation ABS_FLOWING_RL = Main.location("block/abs_flowing");
    public static final ResourceLocation ABS_OVERLAY_RL = Main.location("block/abs_overlay");

    public static final ResourceLocation ACRYLONITRILE_STILL_RL = Main.location("block/acrylonitrile_still");
    public static final ResourceLocation ACRYLONITRILE_FLOWING_RL = Main.location("block/acrylonitrile_flowing");
    public static final ResourceLocation ACRYLONITRILE_OVERLAY_RL = Main.location("block/acrylonitrile_overlay");

    public static final ResourceLocation STYRENE_STILL_RL = Main.location("block/styrene_still");
    public static final ResourceLocation STYRENE_FLOWING_RL = Main.location("block/styrene_flowing");
    public static final ResourceLocation STYRENE_OVERLAY_RL = Main.location("block/styrene_overlay");

    public static final ResourceLocation ETHYL_BENZENE_STILL_RL = Main.location("block/ethyl_benzene_still");
    public static final ResourceLocation ETHYL_BENZENE_FLOWING_RL = Main.location("block/ethyl_benzene_flowing");
    public static final ResourceLocation ETHYL_BENZENE_OVERLAY_RL = Main.location("block/ethyl_benzene_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);
    
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLUID = FLUIDS.register("mythril_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLOWING = FLUIDS.register("mythril_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_BIO_PLASTIC_FLUID = FLUIDS.register("molten_bio_plastic_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_BIO_PLASTIC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BIO_PLASTIC_FLOWING = FLUIDS.register("molten_bio_plastic_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_BIO_PLASTIC_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CONDENSED_LPG_FLUID = FLUIDS.register("condensed_lpg_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.CONDENSED_LPG_PROPERTIES));
    public static final RegistryObject<FlowingFluid> CONDENSED_LPG_FLOWING = FLUIDS.register("condensed_lpg_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.CONDENSED_LPG_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PROPYLENE_FLUID = FLUIDS.register("propylene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.PROPYLENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PROPYLENE_FLOWING = FLUIDS.register("propylene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.PROPYLENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BENZENE_FLUID = FLUIDS.register("benzene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BENZENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BENZENE_FLOWING = FLUIDS.register("benzene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BENZENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BUTADIENE_FLUID = FLUIDS.register("butadiene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.BUTADIENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BUTADIENE_FLOWING = FLUIDS.register("butadiene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.BUTADIENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ABS_FLUID = FLUIDS.register("abs_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ABS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ABS_FLOWING = FLUIDS.register("abs_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ABS_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ACRYLONITRILE_FLUID = FLUIDS.register("acrylonitrile_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ACRYLONITRILE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ACRYLONITRILE_FLOWING = FLUIDS.register("acrylonitrile_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ACRYLONITRILE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> STYRENE_FLUID = FLUIDS.register("styrene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.STYRENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> STYRENE_FLOWING = FLUIDS.register("styrene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.STYRENE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ETHYL_BENZENE_FLUID = FLUIDS.register("ethyl_benzene_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.ETHYL_BENZENE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ETHYL_BENZENE_FLOWING = FLUIDS.register("ethyl_benzene_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.ETHYL_BENZENE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_MYTHRIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            MYTHRIL_FLUID, MYTHRIL_FLOWING, FluidAttributes.builder(MYTHRIL_STILL_RL, MYTHRIL_FLOWING_RL)
            .viscosity(3).density(5).overlay(MYTHRIL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_MYTHRIL_BLOCK).bucket(ItemInit.MOLTEN_MYTHRIL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_BIO_PLASTIC_PROPERTIES = new ForgeFlowingFluid.Properties(
            MOLTEN_BIO_PLASTIC_FLUID, MOLTEN_BIO_PLASTIC_FLOWING, FluidAttributes.builder(MOLTEN_BIO_PLASTIC_STILL_RL, MOLTEN_BIO_PLASTIC_FLOWING_RL)
            .viscosity(3).density(5).overlay(MOLTEN_BIO_PLASTIC_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_BIO_PLASTIC_BLOCK).bucket(ItemInit.MOLTEN_BIO_PLASTIC_BUCKET);

    public static final ForgeFlowingFluid.Properties CONDENSED_LPG_PROPERTIES = new ForgeFlowingFluid.Properties(
            CONDENSED_LPG_FLUID, CONDENSED_LPG_FLOWING, FluidAttributes.builder(CONDENSED_LPG_STILL_RL, CONDENSED_LPG_FLOWING_RL)
            .viscosity(3).density(5).overlay(CONDENSED_LPG_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.CONDENSED_LPG_BLOCK).bucket(ItemInit.CONDENSED_LPG_BUCKET);

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

}
