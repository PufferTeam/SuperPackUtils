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

    public static final ResourceLocation MYTHRIL_STILL_RL = Main.location("blocks/mythril_still");
    public static final ResourceLocation MYTHRIL_FLOWING_RL = Main.location("blocks/mythril_flowing");
    public static final ResourceLocation MYTHRIL_OVERLAY_RL = Main.location("blocks/mythril_overlay");

    public static final ResourceLocation MOLTEN_BIO_PLASTIC_STILL_RL = Main.location("blocks/molten_bio_plastic_still");
    public static final ResourceLocation MOLTEN_BIO_PLASTIC_FLOWING_RL = Main.location("blocks/molten_bio_plastic_flowing");
    public static final ResourceLocation MOLTEN_BIO_PLASTIC_OVERLAY_RL = Main.location("blocks/molten_bio_plastic_overlay");

    public static final ResourceLocation LUBRIFIED_LPG_STILL_RL = Main.location("blocks/lubrified_lpg_still");
    public static final ResourceLocation LUBRIFIED_LPG_FLOWING_RL = Main.location("blocks/lubrified_lpg_flowing");
    public static final ResourceLocation LUBRIFIED_LPG_OVERLAY_RL = Main.location("blocks/lubrified_lpg_overlay");

    public static final ResourceLocation LIQUID_SILICON_DIOXIDE_STILL_RL = Main.location("blocks/liquid_silicon_dioxide_still");
    public static final ResourceLocation LIQUID_SILICON_DIOXIDE_FLOWING_RL = Main.location("blocks/liquid_silicon_dioxide_flowing");
    public static final ResourceLocation LIQUID_SILICON_DIOXIDE_OVERLAY_RL = Main.location("blocks/liquid_silicon_dioxide_overlay");

    public static final ResourceLocation MOLTEN_VIBRANT_ALLOY_STILL_RL = Main.location("blocks/molten_vibrant_alloy_still");
    public static final ResourceLocation MOLTEN_VIBRANT_ALLOY_FLOWING_RL = Main.location("blocks/molten_vibrant_alloy_flowing");
    public static final ResourceLocation MOLTEN_VIBRANT_ALLOY_OVERLAY_RL = Main.location("blocks/molten_vibrant_alloy_overlay");

    public static final ResourceLocation MOLTEN_ENERGETIC_ALLOY_STILL_RL = Main.location("blocks/molten_vibrant_alloy_still");
    public static final ResourceLocation MOLTEN_ENERGETIC_ALLOY_FLOWING_RL = Main.location("blocks/molten_vibrant_alloy_flowing");
    public static final ResourceLocation MOLTEN_ENERGETIC_ALLOY_OVERLAY_RL = Main.location("blocks/molten_vibrant_alloy_overlay");

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

    public static final RegistryObject<FlowingFluid> LIQUID_SILICON_DIOXIDE_FLUID = FLUIDS.register("liquid_silicon_dioxide_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.LIQUID_SILICON_DIOXIDE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LIQUID_SILICON_DIOXIDE_FLOWING = FLUIDS.register("liquid_silicon_dioxide_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.LIQUID_SILICON_DIOXIDE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_VIBRANT_ALLOY_FLUID = FLUIDS.register("molten_vibrant_alloy_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_VIBRANT_ALLOY_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_VIBRANT_ALLOY_FLOWING = FLUIDS.register("molten_vibrant_alloy_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_VIBRANT_ALLOY_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_ENERGETIC_ALLOY_FLUID = FLUIDS.register("molten_energetic_alloy_fluid",
            () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_ENERGETIC_ALLOY_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ENERGETIC_ALLOY_FLOWING = FLUIDS.register("molten_energetic_alloy_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_ENERGETIC_ALLOY_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_MYTHRIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            MYTHRIL_FLUID, MYTHRIL_FLOWING, FluidAttributes.builder(MYTHRIL_STILL_RL, MYTHRIL_FLOWING_RL)
            .viscosity(3).density(5).overlay(MYTHRIL_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_MYTHRIL_BLOCK).bucket(ItemInit.MOLTEN_MYTHRIL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_BIO_PLASTIC_PROPERTIES = new ForgeFlowingFluid.Properties(
            MOLTEN_BIO_PLASTIC_FLUID, MOLTEN_BIO_PLASTIC_FLOWING, FluidAttributes.builder(MOLTEN_BIO_PLASTIC_STILL_RL, MOLTEN_BIO_PLASTIC_FLOWING_RL)
            .viscosity(3).density(5).overlay(MOLTEN_BIO_PLASTIC_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_BIO_PLASTIC_BLOCK).bucket(ItemInit.MOLTEN_BIO_PLASTIC_BUCKET);

    public static final ForgeFlowingFluid.Properties LUBRIFIED_LPG_PROPERTIES = new ForgeFlowingFluid.Properties(
            LUBRIFIED_LPG_FLUID, LUBRIFIED_LPG_FLOWING, FluidAttributes.builder(LUBRIFIED_LPG_STILL_RL, LUBRIFIED_LPG_FLOWING_RL)
            .viscosity(3).density(5).overlay(LUBRIFIED_LPG_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.LUBRIFIED_LPG_BLOCK).bucket(ItemInit.LUBRIFIED_LPG_BUCKET);

    public static final ForgeFlowingFluid.Properties LIQUID_SILICON_DIOXIDE_PROPERTIES = new ForgeFlowingFluid.Properties(
            LIQUID_SILICON_DIOXIDE_FLUID, LIQUID_SILICON_DIOXIDE_FLOWING, FluidAttributes.builder(LIQUID_SILICON_DIOXIDE_STILL_RL, LIQUID_SILICON_DIOXIDE_FLOWING_RL)
            .viscosity(3).density(5).overlay(LIQUID_SILICON_DIOXIDE_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.LIQUID_SILICON_DIOXIDE_BLOCK).bucket(ItemInit.LIQUID_SILICON_DIOXIDE_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_VIBRANT_ALLOY_PROPERTIES = new ForgeFlowingFluid.Properties(
            MOLTEN_VIBRANT_ALLOY_FLUID, MOLTEN_VIBRANT_ALLOY_FLOWING, FluidAttributes.builder(MOLTEN_VIBRANT_ALLOY_STILL_RL, MOLTEN_VIBRANT_ALLOY_FLOWING_RL)
            .viscosity(3).density(5).overlay(MOLTEN_VIBRANT_ALLOY_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_VIBRANT_ALLOY_BLOCK).bucket(ItemInit.MOLTEN_VIBRANT_ALLOY_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_ENERGETIC_ALLOY_PROPERTIES = new ForgeFlowingFluid.Properties(
            MOLTEN_ENERGETIC_ALLOY_FLUID, MOLTEN_ENERGETIC_ALLOY_FLOWING, FluidAttributes.builder(MOLTEN_ENERGETIC_ALLOY_STILL_RL, MOLTEN_ENERGETIC_ALLOY_FLOWING_RL)
            .viscosity(3).density(5).overlay(MOLTEN_ENERGETIC_ALLOY_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_ENERGETIC_ALLOY_BLOCK).bucket(ItemInit.MOLTEN_ENERGETIC_ALLOY_BUCKET);
}
