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

    public static final ResourceLocation PLATINUM_STILL_RL = Main.location("blocks/platinum_still");
    public static final ResourceLocation PLATINUM_FLOWING_RL = Main.location("blocks/platinum_flowing");
    public static final ResourceLocation PLATINUM_OVERLAY_RL = Main.location("blocks/platinum_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);
    
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLUID = FLUIDS.register("mythril_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MYTHRIL_FLOWING = FLUIDS.register("mythril_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_MYTHRIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PLATINUM_FLUID = FLUIDS.register("platinum_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_PLATINUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PLATINUM_FLOWING = FLUIDS.register("platinum_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_PLATINUM_PROPERTIES));
    
    public static final ForgeFlowingFluid.Properties MOLTEN_MYTHRIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            MYTHRIL_FLUID, MYTHRIL_FLOWING, FluidAttributes.builder(MYTHRIL_STILL_RL, MYTHRIL_FLOWING_RL)
            .viscosity(3).density(5).overlay(MYTHRIL_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_MYTHRIL_BLOCK).bucket(ItemInit.MOLTEN_MYTHRIL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLATINUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            PLATINUM_FLUID, PLATINUM_FLOWING, FluidAttributes.builder(PLATINUM_STILL_RL, PLATINUM_FLOWING_RL)
            .viscosity(3).density(5).overlay(PLATINUM_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_PLATINUM_BLOCK).bucket(ItemInit.MOLTEN_PLATINUM_BUCKET);
}
