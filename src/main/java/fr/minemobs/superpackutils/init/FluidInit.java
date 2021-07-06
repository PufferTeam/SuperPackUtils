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
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class FluidInit {

    public static final ResourceLocation[] FLUID_RL = {Main.location("liquid/liquid_still"), Main.location("liquid/liquid_flow")};
    public static final ResourceLocation[] MOLTEN_RL = {Main.location("liquid/moltenliquid_still"), Main.location("liquid/moltenliquid_flow")};

    public static final List<FluidObject> FLUIDS_LIST = new ArrayList<>();
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    //public static final FluidObject TEST_FLUID = register("test", new Color(255, 0, 0), FLUID_RL);

    public static final FluidObject ETHYL_CHLORIDE = register("ethyl_chloride", new Color(201, 201, 201), FLUID_RL);
    public static final FluidObject SILICON_DIOXIDE = register("silicon_dioxide", new Color(167, 203, 217), FLUID_RL);
    public static final FluidObject POLYETHENE = register("polyethene", new Color(168, 143, 189), FLUID_RL);
    public static final FluidObject CHEMICAL_DEATH = register("chemical_death", new Color(133, 136, 140), FLUID_RL);
    public static final FluidObject AMMONIA = register("ammonia", new Color(155, 180, 186), FLUID_RL);
    public static final FluidObject NITROUS_OXIDE = register("nitrous_oxide", new Color(64, 77, 133), FLUID_RL);
    public static final FluidObject CYANIDE = register("cyanide", new Color(230, 230, 230), FLUID_RL);
    public static final FluidObject CARBON_DIOXIDE = register("carbon_dioxide", new Color(13, 13, 13), FLUID_RL);
    public static final FluidObject METHANE = register("methane", new Color(171, 130, 166), FLUID_RL);
    public static final FluidObject PURE_SULFURIC_ACID = register("pure_sulfuric_acid", new Color(150, 146, 59), FLUID_RL);
    public static final FluidObject BENZENE = register("benzene", new Color(200, 209, 176), FLUID_RL);
    public static final FluidObject BUTADIENE = register("butadiene", new Color(184, 209, 176), FLUID_RL);
    public static final FluidObject ABS = register("abs", new Color(196, 196, 196), FLUID_RL);
    public static final FluidObject ACRYLONITRILE = register("acrylonitrile", new Color(192, 209, 171), FLUID_RL);
    public static final FluidObject STYRENE = register("styrene", new Color(117, 122, 111), FLUID_RL);
    public static final FluidObject ETHYL_BENZENE = register("ethyl_benzene", new Color(170, 179, 159), FLUID_RL);
    public static final FluidObject TOLUENE = register("toluene", new Color(145, 117, 89), FLUID_RL);
    public static final FluidObject OCTANE = register("octane", new Color(151, 158, 125), FLUID_RL);
    public static final FluidObject BUTANE = register("butane", new Color(171, 128, 36), FLUID_RL);
    public static final FluidObject BUTENE = register("butene", new Color(209, 172, 92), FLUID_RL);
    public static final FluidObject PROPANE = register("propane", new Color(153, 150, 60), FLUID_RL);
    public static final FluidObject PROPENE = register("propene", new Color(212, 207, 59), FLUID_RL);
    public static final FluidObject ETBE = register("etbe", new Color(199, 194, 185), FLUID_RL);
    public static final FluidObject ISOPRENE = register("isoprene", new Color(56, 41, 34), FLUID_RL);
    public static final FluidObject BORIC_ACID = register("boric_acid", new Color(117, 100, 53), FLUID_RL);
    public static final FluidObject DIBORANE = register("diborane", new Color(148, 81, 109), FLUID_RL);
    public static final FluidObject PLASTIC_WASTE = register("plastic_waste", new Color(97, 70, 54), FLUID_RL);
    public static final FluidObject ACETYLENE = register("acetylene", new Color(191, 128, 164), FLUID_RL);
    public static final FluidObject HYDROGEN_CYANIDE = register("hydrogen_cyanide", new Color(114, 85, 161), FLUID_RL);

    public static final FluidObject PYROTHEUM = register("pyrotheum", new Color(255, 187, 0), MOLTEN_RL, 2300);
    public static final FluidObject CRYOTHEUM = register("cryotheum", new Color(0, 191, 255), MOLTEN_RL, -2300);
    public static final FluidObject AEROTHEUM = register("aerotheum", new Color(167, 176, 204), MOLTEN_RL, 500);
    public static final FluidObject PETROTHEUM = register("petrotheum", new Color(59, 45, 36), MOLTEN_RL, 600);
    public static final FluidObject PAHOEHOE_LAVA = register("pahoehoe_lava", new Color(148, 113, 86), MOLTEN_RL, 700);
    public static final FluidObject PRIMAL_MANA = register("primal_mana", new Color(73, 31, 181), MOLTEN_RL);
    public static final FluidObject MOLTEN_TERRASTEEL = register("molten_terrasteel", new Color(13, 255, 0), MOLTEN_RL);
    public static final FluidObject MOLTEN_MANASTEEL = register("molten_manasteel", new Color(57, 117, 196), MOLTEN_RL);
    public static final FluidObject MOLTEN_ELEMENTIUM = register("molten_elementium", new Color(255, 0, 255), MOLTEN_RL);
    public static final FluidObject MOLTEN_ALFSTEEL = register("molten_alfsteel", new Color(255, 111, 0), MOLTEN_RL);
    public static final FluidObject MOLTEN_CRYSTALTINE = register("molten_crystaltine", new Color(41, 227, 227), MOLTEN_RL);
    public static final FluidObject MOLTEN_BORON = register("molten_boron", new Color(46, 46, 46), MOLTEN_RL);
    public static final FluidObject MOLTEN_LITHIUM = register("molten_lithium", new Color(184, 184, 184), MOLTEN_RL);
    public static final FluidObject BLAZE_ESSENCE = register("blaze_essence", new Color(255, 60, 0), MOLTEN_RL);
    public static final FluidObject HO_GASOLINE = register("ho_gasoline", new Color(117, 62, 46), FLUID_RL);
    public static final FluidObject ICHOR = register("ichor", new Color(252, 111, 0), FLUID_RL);
    public static final FluidObject MOLTEN_BIO_PLASTIC = register("molten_bio_plastic", new Color(171, 147, 67), MOLTEN_RL);
    public static final FluidObject NAPHTHA = register("naphtha", new Color(255, 217, 0), FLUID_RL);
    public static final FluidObject NAPALM_B = register("napalm_b", new Color(64, 34, 3), FLUID_RL);
    public static final FluidObject SULFURIZED_NAPHTHA = register("sulfurized_naphtha", new Color(171, 145, 0), FLUID_RL);
    public static final FluidObject SULFURIZED_LIGHT_OIL = register("sulfurized_light_oil", new Color(252, 171, 66), FLUID_RL);
    public static final FluidObject SULFURIZED_GASOLINE = register("sulfurized_gasoline", new Color(112, 89, 66), FLUID_RL);
    public static final FluidObject SULFURIZED_HEAVY_OIL = register("sulfurized_heavy_oil", new Color(191, 95, 65), FLUID_RL);
    public static final FluidObject SC_NAPHTHA = register("sc_naphtha", new Color(201, 190, 123), FLUID_RL);
    public static final FluidObject SC_LIGHT_OIL = register("sc_light_oil", new Color(201, 169, 123), FLUID_RL);
    public static final FluidObject SC_HEAVY_OIL = register("sc_heavy_oil", new Color(201, 139, 123), FLUID_RL);
    public static final FluidObject HC_NAPHTHA = register("hc_naphtha", new Color(230, 207, 76), FLUID_RL);
    public static final FluidObject HC_LIGHT_OIL = register("hc_light_oil", new Color(230, 166, 76), FLUID_RL);
    public static final FluidObject HC_HEAVY_OIL = register("hc_heavy_oil", new Color(230, 115, 76), FLUID_RL);
    public static final FluidObject EPOXY_RESIN = register("epoxy_resin", new Color(130, 82, 10), FLUID_RL);
    public static final FluidObject PRESSURIZED_HYDROGEN = register("pressurized_hydrogen", new Color(132, 132, 132), FLUID_RL);
    public static final FluidObject PRESSURIZED_STEAM = register("pressurized_steam", new Color(132, 132, 132), FLUID_RL);

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
                .color(color.getRGB()))
                .bucket(BUCKET)
                .block(blockFluid);
        FluidObject fluid = new FluidObject(properties[0], FLUID, FLOWING, blockFluid, BUCKET);
        FLUIDS_LIST.add(fluid);
        return fluid;
    }

    private static FluidObject register(@Nonnull String name, @Nonnull Color color, @Nonnull ResourceLocation[] resourcesLocations, int temperature) {
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
                .temperature(temperature)
                .color(color.getRGB()))
                .bucket(BUCKET)
                .block(blockFluid);
        FluidObject fluid = new FluidObject(properties[0], FLUID, FLOWING, blockFluid, BUCKET);
        FLUIDS_LIST.add(fluid);
        return fluid;
    }

    public static class FluidObject {
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

        public ForgeFlowingFluid.Properties getFluidProperties() {
            return FLUID_PROPERTIES;
        }

        public RegistryObject<FlowingFluid> getStillFluid() {
            return STILL_FLUID_REGISTRY;
        }

        public RegistryObject<FlowingFluid> getFlowingFluid() {
            return FLOWING_FLUID_REGISTRY;
        }

        public RegistryObject<FlowingFluidBlock> getBlockFluid() {
            return blockFluid;
        }

        public RegistryObject<BucketItem> getBucket() {
            return bucket;
        }
    }
}
