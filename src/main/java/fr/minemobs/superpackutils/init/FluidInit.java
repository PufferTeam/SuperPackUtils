package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
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

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final RegistryObject<FlowingFluid> VINEGAR_FLUID = FLUIDS.register("vinegar_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.VINEGAR_PROPERTIES));
    public static final RegistryObject<FlowingFluid> VINEGAR_FLOWING = FLUIDS.register("vinegar_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.VINEGAR_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OLIVE_FLUID = FLUIDS.register("olive_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.OLIVE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OLIVE_FLOWING = FLUIDS.register("olive_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.OLIVE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties VINEGAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> VINEGAR_FLUID.get(), () -> VINEGAR_FLOWING.get(), FluidAttributes.builder(VINEGAR_STILL_RL, VINEGAR_FLOWING_RL)
            .viscosity(3).density(5).overlay(VINEGAR_OVERLAY_RL).sound(SoundEvents.BLOCK_WATER_AMBIENT))
            .block(() -> FluidInit.VINEGAR_BLOCK.get()).bucket(ItemInit.VINEGAR_BUCKET);

    public static final ForgeFlowingFluid.Properties OLIVE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> OLIVE_FLUID.get(), () -> OLIVE_FLOWING.get(), FluidAttributes.builder(OLIVE_STILL_RL, OLIVE_FLOWING_RL)
            .viscosity(3).density(5).overlay(OLIVE_OVERLAY_RL).sound(SoundEvents.BLOCK_WATER_AMBIENT))
            .block(() -> FluidInit.OLIVE_OIL_BLOCK.get()).bucket(ItemInit.OLIVE_BUCKET);

    public static final RegistryObject<FlowingFluidBlock> VINEGAR_BLOCK = BlockInit.BLOCKS.register("vinegar",
            () -> new FlowingFluidBlock(() -> FluidInit.VINEGAR_FLUID.get(), AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> OLIVE_OIL_BLOCK = BlockInit.BLOCKS.register("olive_oil",
            () -> new FlowingFluidBlock(() -> FluidInit.OLIVE_FLUID.get(), AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

}
