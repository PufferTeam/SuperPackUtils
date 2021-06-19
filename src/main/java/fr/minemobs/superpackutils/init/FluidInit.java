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

    public static final ResourceLocation LUBRIFIED_LPG_STILL_RL = Main.location("block/lubrified_lpg_still");
    public static final ResourceLocation LUBRIFIED_LPG_FLOWING_RL = Main.location("block/lubrified_lpg_flowing");
    public static final ResourceLocation LUBRIFIED_LPG_OVERLAY_RL = Main.location("block/lubrified_lpg_overlay");

    public static final ResourceLocation CONDENSED_LPG_STILL_RL = Main.location("block/condensed_lpg_still");
    public static final ResourceLocation CONDENSED_LPG_FLOWING_RL = Main.location("block/condensed_lpg_flowing");
    public static final ResourceLocation CONDENSED_LPG_OVERLAY_RL = Main.location("block/condensed_lpg_overlay");

    public static final ResourceLocation PROPYLENE_LPG_STILL_RL = Main.location("block/propylene_still");
    public static final ResourceLocation PROPYLENE_LPG_FLOWING_RL = Main.location("block/propylene_flowing");
    public static final ResourceLocation PROPYLENE_OVERLAY_RL = Main.location("block/propylene_overlay");

    public static final ResourceLocation BENZENE_LPG_STILL_RL = Main.location("block/benzene_still");
    public static final ResourceLocation BENZENE_LPG_FLOWING_RL = Main.location("block/benzene_flowing");
    public static final ResourceLocation BENZENE_OVERLAY_RL = Main.location("block/benzene_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);
    
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLUID = FLUIDS.register("mythril_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLOWING = FLUIDS.register("mythril_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_BIO_PLASTIC_FLUID = FLUIDS.register("molten_bio_plastic_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_BIO_PLASTIC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BIO_PLASTIC_FLOWING = FLUIDS.register("molten_bio_plastic_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_BIO_PLASTIC_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LUBRIFIED_LPG_FLUID = FLUIDS.register("lubrified_lpg_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.LUBRIFIED_LPG_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LUBRIFIED_LPG_FLOWING = FLUIDS.register("lubrified_lpg_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.LUBRIFIED_LPG_PROPERTIES));

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

    public static final ForgeFlowingFluid.Properties MOLTEN_MYTHRIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            MYTHRIL_FLUID, MYTHRIL_FLOWING, FluidAttributes.builder(MYTHRIL_STILL_RL, MYTHRIL_FLOWING_RL)
            .viscosity(3).density(5).overlay(MYTHRIL_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_MYTHRIL_BLOCK).bucket(ItemInit.MOLTEN_MYTHRIL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_BIO_PLASTIC_PROPERTIES = new ForgeFlowingFluid.Properties(
            MOLTEN_BIO_PLASTIC_FLUID, MOLTEN_BIO_PLASTIC_FLOWING, FluidAttributes.builder(MOLTEN_BIO_PLASTIC_STILL_RL, MOLTEN_BIO_PLASTIC_FLOWING_RL)
            .viscosity(3).density(5).overlay(MOLTEN_BIO_PLASTIC_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_BIO_PLASTIC_BLOCK).bucket(ItemInit.MOLTEN_BIO_PLASTIC_BUCKET);

    public static final ForgeFlowingFluid.Properties LUBRIFIED_LPG_PROPERTIES = new ForgeFlowingFluid.Properties(
            LUBRIFIED_LPG_FLUID, LUBRIFIED_LPG_FLOWING, FluidAttributes.builder(LUBRIFIED_LPG_STILL_RL, LUBRIFIED_LPG_FLOWING_RL)
            .viscosity(3).density(5).overlay(LUBRIFIED_LPG_OVERLAY_RL).sound(SoundEvents.LAVA_AMBIENT))
            .block(BlockInit.LUBRIFIED_LPG_BLOCK).bucket(ItemInit.LUBRIFIED_LPG_BUCKET);

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
}
