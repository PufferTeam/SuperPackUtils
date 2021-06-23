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

    //Test fluids
    //public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> TEST_FLUID = register("test", 0xFF0D1455);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> ETHYL_CHLORIDE = register("ethyl_chloride",
            new Color(201, 201, 201));
    public static final FluidRegistryObject<ForgeFlowingFluid.Source, ForgeFlowingFluid.Flowing, FlowingFluidBlock, BucketItem> SILICON_DIOXIDE = register("silicon_dioxide",
            Color.WHITE);

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
