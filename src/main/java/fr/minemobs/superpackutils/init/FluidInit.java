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

    public static final ResourceLocation VINEGAR_STILL_RL = Main.location("blocks/vinegar_still");
    public static final ResourceLocation VINEGAR_FLOWING_RL = Main.location("blocks/vinegar_flowing");
    public static final ResourceLocation VINEGAR_OVERLAY_RL = Main.location("blocks/vinegar_overlay");

    public static final ResourceLocation OLIVE_STILL_RL = Main.location("blocks/olive_still");
    public static final ResourceLocation OLIVE_FLOWING_RL = Main.location("blocks/olive_flowing");
    public static final ResourceLocation OLIVE_OVERLAY_RL = Main.location("blocks/olive_overlay");

    //Molten Liquid

    public static final ResourceLocation MYTHRIL_STILL_RL = Main.location("blocks/mythril_still");
    public static final ResourceLocation MYTHRIL_FLOWING_RL = Main.location("blocks/mythril_flowing");
    public static final ResourceLocation MYTHRIL_OVERLAY_RL = Main.location("blocks/mythril_overlay");

    public static final ResourceLocation PLATINIUM_STILL_RL = Main.location("blocks/platinium_still");
    public static final ResourceLocation PLATINIUM_FLOWING_RL = Main.location("blocks/platinium_flowing");
    public static final ResourceLocation PLATINIUM_OVERLAY_RL = Main.location("blocks/platinium_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final RegistryObject<FlowingFluid> VINEGAR_FLUID = FLUIDS.register("vinegar_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.VINEGAR_PROPERTIES));
    public static final RegistryObject<FlowingFluid> VINEGAR_FLOWING = FLUIDS.register("vinegar_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.VINEGAR_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OLIVE_FLUID = FLUIDS.register("olive_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.OLIVE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OLIVE_FLOWING = FLUIDS.register("olive_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.OLIVE_PROPERTIES));

    //Molten liquid
    //I want to die actually
    //If you want to kill the person who got this idea his discord is Jerome226#0001

    public static final RegistryObject<FlowingFluid> MYTHRIL_FLUID = FLUIDS.register("mythril_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLOWING = FLUIDS.register("mythril_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PLATINIUM_FLUID = FLUIDS.register("platinium_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_PLATINUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PLATINIUM_FLOWING = FLUIDS.register("platinium_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_PLATINUM_PROPERTIES));


    public static final ForgeFlowingFluid.Properties VINEGAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            VINEGAR_FLUID, VINEGAR_FLOWING, FluidAttributes.builder(VINEGAR_STILL_RL, VINEGAR_FLOWING_RL)
            .viscosity(3).density(5).overlay(VINEGAR_OVERLAY_RL).sound(SoundEvents.BLOCK_WATER_AMBIENT))
            .block(BlockInit.VINEGAR_BLOCK).bucket(ItemInit.VINEGAR_BUCKET);

    public static final ForgeFlowingFluid.Properties OLIVE_PROPERTIES = new ForgeFlowingFluid.Properties(
            OLIVE_FLUID, OLIVE_FLOWING, FluidAttributes.builder(OLIVE_STILL_RL, OLIVE_FLOWING_RL)
            .viscosity(3).density(5).overlay(OLIVE_OVERLAY_RL).sound(SoundEvents.BLOCK_WATER_AMBIENT))
            .block(BlockInit.OLIVE_OIL_BLOCK).bucket(ItemInit.OLIVE_BUCKET);

    //Molten liquid

    public static final ForgeFlowingFluid.Properties MOLTEN_MYTHRIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            MYTHRIL_FLUID, MYTHRIL_FLOWING, FluidAttributes.builder(MYTHRIL_STILL_RL, MYTHRIL_FLOWING_RL)
            .viscosity(3).density(5).overlay(MYTHRIL_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_MYTHRIL_BLOCK).bucket(ItemInit.MOLTEN_MYTHRIL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLATINUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            PLATINIUM_FLUID, PLATINIUM_FLOWING, FluidAttributes.builder(PLATINIUM_STILL_RL, PLATINIUM_FLOWING_RL)
            .viscosity(3).density(5).overlay(PLATINIUM_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_PLATINIUM_BLOCK).bucket(ItemInit.MOLTEN_PLATINIUM_BUCKET);
}
