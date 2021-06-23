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

    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(Main.MOD_ID);

    //Test fluids
    //public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> TEST_FLUID = register("test", 0xFF0D1455);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ETHYL_CHLORIDE = register("ethyl_chloride", 0xC9C9C9);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SILICON_DIOXIDE = register("silicon_dioxide", 0xFFFFFF);

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
