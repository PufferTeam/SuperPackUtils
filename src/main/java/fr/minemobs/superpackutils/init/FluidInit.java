package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.awt.Color;

public class FluidInit {

    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");
    public static final ResourceLocation MOLTEN_OVERLAY_RL = Main.location("liquid/moltenliquid_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final FluidObject TEST_FLUID = register("test", new Color(255, 0, 0, 255), WATER_OVERLAY_RL);

    public static int toHexa(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return 0xFF000000 + (r << 16) + (g << 8) + b;
    }

    private static FluidObject register(String name, Color color, ResourceLocation overlay) {
        ResourceLocation FLUID_STILL_RL = Main.location("liquid/liquid_still");
        ResourceLocation FLUID_FLOWING_RL = Main.location("liquid/liquid_flow");
        final ForgeFlowingFluid.Properties[] properties = {null};
        RegistryObject<FlowingFluid> FLUID = FLUIDS.register(name + "_fluid",
                () -> new ForgeFlowingFluid.Source(properties[0]));
        RegistryObject<FlowingFluid> FLOWING = FLUIDS.register(name + "_flowing",
                () -> new ForgeFlowingFluid.Flowing(properties[0]));
        RegistryObject<FlowingFluidBlock> blockFluid = BlockInit.BLOCKS.register(name + "_fluid", () ->
                new FlowingFluidBlock(FLUID, AbstractBlock.Properties.copy(Blocks.WATER).noCollission().strength(100.0f).noDrops().noOcclusion()));
        RegistryObject<BucketItem> BUCKET = ItemInit.ITEMS.register(name + "_bucket",
                () -> new BucketItem(FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));
        properties[0] = new ForgeFlowingFluid.Properties(FLUID, FLOWING, FluidAttributes.builder(FLUID_STILL_RL, FLUID_FLOWING_RL)
                .viscosity(3)
                .density(5)
                .overlay(overlay == null ? WATER_OVERLAY_RL : overlay)
                .color(toHexa(color))
                .sound(SoundEvents.LAVA_AMBIENT))
                .bucket(BUCKET)
                .block(blockFluid);
        return new FluidObject(properties[0], FLUID, FLOWING, blockFluid, BUCKET);
    }

    private static class FluidObject {
        private final ForgeFlowingFluid.Properties FLUID_PROPERTIES;
        private final RegistryObject<FlowingFluid> STILL_FLUID_REGISTRY;
        private final RegistryObject<FlowingFluid> FLOWING_FLUID_REGISTRY;
        private final RegistryObject<FlowingFluidBlock> blockFluid;
        private final RegistryObject<BucketItem> bucket;

        private FluidObject(ForgeFlowingFluid.Properties fluid_properties, RegistryObject<FlowingFluid> STILL_FLUID_REGISTRY,
                            RegistryObject<FlowingFluid> flowing_fluid_registry, RegistryObject<FlowingFluidBlock> blockFluid, RegistryObject<BucketItem> bucket) {
            FLUID_PROPERTIES = fluid_properties;
            this.STILL_FLUID_REGISTRY = STILL_FLUID_REGISTRY;
            FLOWING_FLUID_REGISTRY = flowing_fluid_registry;
            this.blockFluid = blockFluid;
            this.bucket = bucket;
        }

        public ForgeFlowingFluid.Properties getFLUID_PROPERTIES() {
            return FLUID_PROPERTIES;
        }

        public RegistryObject<FlowingFluid> getFLOWING_FLUID_REGISTRY() {
            return FLOWING_FLUID_REGISTRY;
        }

        public RegistryObject<FlowingFluid> getSTILL_FLUID_REGISTRY() {
            return STILL_FLUID_REGISTRY;
        }

        public RegistryObject<FlowingFluidBlock> getBlockFluid() {
            return blockFluid;
        }

        public RegistryObject<BucketItem> getBucket() {
            return bucket;
        }
    }
}
