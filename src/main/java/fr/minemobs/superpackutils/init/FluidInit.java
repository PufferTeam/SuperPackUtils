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

import javax.annotation.Nonnull;
import java.awt.Color;

public class FluidInit {

    public static final ResourceLocation[] FLUID_RL = {Main.location("liquid/liquid_still"), Main.location("liquid/liquid_flow"),
            new ResourceLocation("block/water_overlay")};

    public static final ResourceLocation[] MOLTEN_RL = {Main.location("liquid/moltenliquid_still"), Main.location("liquid/moltenliquid_flow"),
            Main.location("liquid/moltenliquid_overlay")};

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    //public static final FluidObject TEST_FLUID = register("test", new Color(255, 0, 0, 255), FLUID_RL);

    public static final FluidObject ETHYL_CHLORIDE = register("ethyl_chloride", new Color(201, 201, 201, 255), FLUID_RL);
    public static final FluidObject SILICON_DIOXIDE = register("silicon_dioxide", new Color(167, 203, 217, 255), FLUID_RL);
    public static final FluidObject POLYETHENE = register("polyethene", new Color(168, 143, 189, 255), FLUID_RL);
    public static final FluidObject CHEMICAL_DEATH = register("chemical_death", new Color(133, 136, 140, 255), FLUID_RL);
    public static final FluidObject AMMONIA = register("ammonia", new Color(155, 180, 186, 255), FLUID_RL);
    public static final FluidObject CYANIDE = register("cyanide", new Color(230, 230, 230, 255), FLUID_RL);
    public static final FluidObject METHANE = register("methane", new Color(171, 130, 166, 255), FLUID_RL);
    public static final FluidObject PURE_SULFURIC_ACID = register("pure_sulfuric_acid", new Color(150, 146, 59, 255), FLUID_RL);
    public static final FluidObject BENZENE = register("benzene", new Color(200, 209, 176, 255), FLUID_RL);
    public static final FluidObject BUTADIENE = register("butadiene", new Color(184, 209, 176, 255), FLUID_RL);
    public static final FluidObject ABS = register("abs", new Color(196, 196, 196, 255), FLUID_RL);
    public static final FluidObject ACRYLONITRILE = register("acrylonitrile", new Color(192, 209, 171, 255), FLUID_RL);
    public static final FluidObject STYRENE = register("styrene", new Color(117, 122, 111, 255), FLUID_RL);
    public static final FluidObject ETHYL_BENZENE = register("ethyl_benzene", new Color(170, 179, 159, 255), FLUID_RL);
    public static final FluidObject TOLUENE = register("toluene", new Color(145, 117, 89, 255), FLUID_RL);
    public static final FluidObject OCTANE = register("octane", new Color(151, 158, 125, 255), FLUID_RL);
    public static final FluidObject BUTANE = register("butane", new Color(171, 128, 36, 255), FLUID_RL);
    public static final FluidObject BUTENE = register("butene", new Color(209, 172, 92, 255), FLUID_RL);
    public static final FluidObject PROPANE = register("propane", new Color(153, 150, 60, 255), FLUID_RL);
    public static final FluidObject PROPENE = register("propene", new Color(212, 207, 59, 255), FLUID_RL);
    public static final FluidObject ETBE = register("etbe", new Color(199, 194, 185, 255), FLUID_RL);
    public static final FluidObject ISOPRENE = register("isoprene", new Color(56, 41, 34, 255), FLUID_RL);
    public static final FluidObject BORIC_ACID = register("boric_acid", new Color(117, 100, 53, 255), FLUID_RL);
    public static final FluidObject DIBORANE = register("diborane", new Color(148, 81, 109, 255), FLUID_RL);

    public static final FluidObject PYROTHEUM = register("pyrotheum", new Color(255, 187, 0, 255), MOLTEN_RL);
    public static final FluidObject MOLTEN_BIO_PLASTIC = register("molten_bio_plastic", new Color(171, 147, 67, 255), MOLTEN_RL);
    public static final FluidObject NAPHTHA = register("naphtha", new Color(255, 217, 0, 255), FLUID_RL);
    public static final FluidObject SULFURIZED_NAPHTHA = register("sulfurized_naphtha", new Color(171, 145, 0, 255), FLUID_RL);
    public static final FluidObject SULFURIZED_LIGHT_OIL = register("sulfurized_light_oil", new Color(158, 103, 0, 255), FLUID_RL);
    public static final FluidObject SULFURIZED_HEAVY_OIL = register("sulfurized_heavy_oil", new Color(158, 37, 0, 255), FLUID_RL);
    public static final FluidObject SC_NAPHTHA = register("sc_naphtha", new Color(201, 190, 123, 255), FLUID_RL);
    public static final FluidObject SC_LIGHT_OIL = register("sc_light_oil", new Color(201, 169, 123, 255), FLUID_RL);
    public static final FluidObject SC_HEAVY_OIL = register("sc_heavy_oil", new Color(201, 139, 123, 255), FLUID_RL);
    public static final FluidObject HC_NAPHTHA = register("hc_naphtha", new Color(230, 207, 76, 255), FLUID_RL);
    public static final FluidObject HC_LIGHT_OIL = register("hc_light_oil", new Color(230, 166, 76, 255), FLUID_RL);
    public static final FluidObject HC_HEAVY_OIL = register("hc_heavy_oil", new Color(230, 166, 76, 255), FLUID_RL);
    public static final FluidObject EPOXY_RESIN = register("epoxy_resin", new Color(130, 82, 10, 255), FLUID_RL);
    public static final FluidObject BORAX_SOLUTION = register("borax_solution", new Color(88, 113, 133, 255), FLUID_RL);
    public static final FluidObject BORON_NITRIDE_SOLUTION = register("boron_nitride_solution", new Color(87, 109, 125, 255), FLUID_RL);
    public static final FluidObject SF_SOLUTION = register("sf_solution", new Color(94, 123, 145, 255), FLUID_RL);
    public static final FluidObject CS_SOLUTION = register("cs_solution", new Color(95, 120, 146, 255), FLUID_RL);
    public static final FluidObject PF_SOLUTION = register("pf_solution", new Color(95, 120, 140, 255), FLUID_RL);
    public static final FluidObject SH_SOLUTION = register("sh_solution", new Color(94, 123, 150, 255), FLUID_RL);
    public static final FluidObject PH_SOLUTION = register("ph_solution", new Color(95, 133, 150, 255), FLUID_RL);

    private static FluidObject register(@Nonnull String name, @Nonnull Color color, @Nonnull ResourceLocation[] resourcesLocations) {
        final ForgeFlowingFluid.Properties[] properties = {null};
        RegistryObject<FlowingFluid> FLUID = FLUIDS.register(name,
                () -> new ForgeFlowingFluid.Source(properties[0]));
        RegistryObject<FlowingFluid> FLOWING = FLUIDS.register(name + "_flowing",
                () -> new ForgeFlowingFluid.Flowing(properties[0]));
        RegistryObject<FlowingFluidBlock> blockFluid = BlockInit.BLOCKS.register(name, () ->
                new FlowingFluidBlock(FLUID, AbstractBlock.Properties.copy(Blocks.WATER).noCollission().strength(100.0f).noDrops().noOcclusion()));
        RegistryObject<BucketItem> BUCKET = ItemInit.ITEMS.register(name + "_bucket",
                () -> new BucketItem(FLUID, new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1)));
        properties[0] = new ForgeFlowingFluid.Properties(FLUID, FLOWING, FluidAttributes.builder(resourcesLocations[0], resourcesLocations[1])
                .viscosity(3)
                .density(5)
                .overlay(resourcesLocations[2])
                .color(color.getRGB()))
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
