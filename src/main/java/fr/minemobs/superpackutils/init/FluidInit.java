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

    public static final ResourceLocation IRON_STILL_RL = Main.location("blocks/iron_still");
    public static final ResourceLocation IRON_FLOWING_RL = Main.location("blocks/iron_flowing");
    public static final ResourceLocation IRON_OVERLAY_RL = Main.location("blocks/iron_overlay");

    public static final ResourceLocation GOLD_STILL_RL = Main.location("blocks/gold_still");
    public static final ResourceLocation GOLD_FLOWING_RL = Main.location("blocks/gold_flowing");
    public static final ResourceLocation GOLD_OVERLAY_RL = Main.location("blocks/gold_overlay");

    public static final ResourceLocation COPPER_STILL_RL = Main.location("blocks/copper_still");
    public static final ResourceLocation COPPER_FLOWING_RL = Main.location("blocks/copper_flowing");
    public static final ResourceLocation COPPER_OVERLAY_RL = Main.location("blocks/copper_overlay");

    public static final ResourceLocation TIN_STILL_RL = Main.location("blocks/tin_still");
    public static final ResourceLocation TIN_FLOWING_RL = Main.location("blocks/tin_flowing");
    public static final ResourceLocation TIN_OVERLAY_RL = Main.location("blocks/tin_overlay");

    public static final ResourceLocation NICKEL_STILL_RL = Main.location("blocks/nickel_still");
    public static final ResourceLocation NICKEL_FLOWING_RL = Main.location("blocks/nickel_flowing");
    public static final ResourceLocation NICKEL_OVERLAY_RL = Main.location("blocks/nickel_overlay");

    public static final ResourceLocation ZINC_STILL_RL = Main.location("blocks/zinc_still");
    public static final ResourceLocation ZINC_FLOWING_RL = Main.location("blocks/zinc_flowing");
    public static final ResourceLocation ZINC_OVERLAY_RL = Main.location("blocks/zinc_overlay");

    public static final ResourceLocation LEAD_STILL_RL = Main.location("blocks/lead_still");
    public static final ResourceLocation LEAD_FLOWING_RL = Main.location("blocks/lead_flowing");
    public static final ResourceLocation LEAD_OVERLAY_RL = Main.location("blocks/lead_overlay");

    public static final ResourceLocation SILVER_STILL_RL = Main.location("blocks/silver_still");
    public static final ResourceLocation SILVER_FLOWING_RL = Main.location("blocks/silver_flowing");
    public static final ResourceLocation SILVER_OVERLAY_RL = Main.location("blocks/silver_overlay");

    public static final ResourceLocation BRONZE_STILL_RL = Main.location("blocks/bronze_still");
    public static final ResourceLocation BRONZE_FLOWING_RL = Main.location("blocks/bronze_flowing");
    public static final ResourceLocation BRONZE_OVERLAY_RL = Main.location("blocks/bronze_overlay");

    public static final ResourceLocation ELECTRUM_STILL_RL = Main.location("blocks/electrum_still");
    public static final ResourceLocation ELECTRUM_FLOWING_RL = Main.location("blocks/electrum_flowing");
    public static final ResourceLocation ELECTRUM_OVERLAY_RL = Main.location("blocks/electrum_overlay");

    public static final ResourceLocation INVAR_STILL_RL = Main.location("blocks/invar_still");
    public static final ResourceLocation INVAR_FLOWING_RL = Main.location("blocks/invar_flowing");
    public static final ResourceLocation INVAR_OVERLAY_RL = Main.location("blocks/invar_overlay");

    public static final ResourceLocation CONSTANTAN_STILL_RL = Main.location("blocks/constantan_still");
    public static final ResourceLocation CONSTANTAN_FLOWING_RL = Main.location("blocks/constantan_flowing");
    public static final ResourceLocation CONSTANTAN_OVERLAY_RL = Main.location("blocks/constantan_overlay");

    public static final ResourceLocation BRASS_STILL_RL = Main.location("blocks/brass_still");
    public static final ResourceLocation BRASS_FLOWING_RL = Main.location("blocks/brass_flowing");
    public static final ResourceLocation BRASS_OVERLAY_RL = Main.location("blocks/brass_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final RegistryObject<FlowingFluid> VINEGAR_FLUID = FLUIDS.register("vinegar_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.VINEGAR_PROPERTIES));
    public static final RegistryObject<FlowingFluid> VINEGAR_FLOWING = FLUIDS.register("vinegar_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.VINEGAR_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OLIVE_FLUID = FLUIDS.register("olive_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.OLIVE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OLIVE_FLOWING = FLUIDS.register("olive_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.OLIVE_PROPERTIES));

    //Molten liquid
    //I want to die actually
    //If you want to kill the person who got this idea his discord is Jerome226#0001

    public static final RegistryObject<FlowingFluid> IRON_FLUID = FLUIDS.register("iron_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> IRON_FLOWING = FLUIDS.register("iron_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_IRON_PROPERTIES));

    public static final RegistryObject<FlowingFluid> GOLD_FLUID = FLUIDS.register("gold_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> GOLD_FLOWING = FLUIDS.register("gold_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_GOLD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> COPPER_FLUID = FLUIDS.register("copper_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_COPPER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> COPPER_FLOWING = FLUIDS.register("copper_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_COPPER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TIN_FLUID = FLUIDS.register("tin_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_TIN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> TIN_FLOWING = FLUIDS.register("tin_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_TIN_PROPERTIES));

    public static final RegistryObject<FlowingFluid> NICKEL_FLUID = FLUIDS.register("nickel_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_NICKEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> NICKEL_FLOWING = FLUIDS.register("nickel_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_NICKEL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ZINC_FLUID = FLUIDS.register("zinc_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ZINC_FLOWING = FLUIDS.register("zinc_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_ZINC_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LEAD_FLUID = FLUIDS.register("lead_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_LEAD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LEAD_FLOWING = FLUIDS.register("lead_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_LEAD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SILVER_FLUID = FLUIDS.register("silver_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_SILVER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SILVER_FLOWING = FLUIDS.register("silver_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_SILVER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BRONZE_FLUID = FLUIDS.register("bronze_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_BRONZE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BRONZE_FLOWING = FLUIDS.register("bronze_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_BRONZE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ELECTRUM_FLUID = FLUIDS.register("electrum_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_ELECTRUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ELECTRUM_FLOWING = FLUIDS.register("electrum_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_ELECTRUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> INVAR_FLUID = FLUIDS.register("invar_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_INVAR_PROPERTIES));
    public static final RegistryObject<FlowingFluid> INVAR_FLOWING = FLUIDS.register("invar_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_INVAR_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CONSTANTAN_FLUID = FLUIDS.register("constantan_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_CONSTANTAN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> CONSTANTAN_FLOWING = FLUIDS.register("constantan_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_CONSTANTAN_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BRASS_FLUID = FLUIDS.register("brass_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MOLTEN_BRASS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BRASS_FLOWING = FLUIDS.register("brass_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MOLTEN_BRASS_PROPERTIES));

    public static final ForgeFlowingFluid.Properties VINEGAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            VINEGAR_FLUID, VINEGAR_FLOWING, FluidAttributes.builder(VINEGAR_STILL_RL, VINEGAR_FLOWING_RL)
            .viscosity(3).density(5).overlay(VINEGAR_OVERLAY_RL).sound(SoundEvents.BLOCK_WATER_AMBIENT))
            .block(BlockInit.VINEGAR_BLOCK).bucket(ItemInit.VINEGAR_BUCKET);

    public static final ForgeFlowingFluid.Properties OLIVE_PROPERTIES = new ForgeFlowingFluid.Properties(
            OLIVE_FLUID, OLIVE_FLOWING, FluidAttributes.builder(OLIVE_STILL_RL, OLIVE_FLOWING_RL)
            .viscosity(3).density(5).overlay(OLIVE_OVERLAY_RL).sound(SoundEvents.BLOCK_WATER_AMBIENT))
            .block(BlockInit.OLIVE_OIL_BLOCK).bucket(ItemInit.OLIVE_BUCKET);

    //Molten liquid

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            IRON_FLUID, IRON_FLOWING, FluidAttributes.builder(IRON_STILL_RL, IRON_FLOWING_RL)
            .viscosity(3).density(5).overlay(IRON_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_IRON_BLOCK).bucket(ItemInit.MOLTEN_IRON_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            GOLD_FLUID, GOLD_FLOWING, FluidAttributes.builder(GOLD_STILL_RL, GOLD_FLOWING_RL)
            .viscosity(3).density(5).overlay(GOLD_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_GOLD_BLOCK).bucket(ItemInit.MOLTEN_GOLD_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_PROPERTIES = new ForgeFlowingFluid.Properties(
            COPPER_FLUID, COPPER_FLOWING, FluidAttributes.builder(COPPER_STILL_RL, COPPER_FLOWING_RL)
            .viscosity(3).density(5).overlay(COPPER_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_COPPER_BLOCK).bucket(ItemInit.MOLTEN_COPPER_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_PROPERTIES = new ForgeFlowingFluid.Properties(
            TIN_FLUID, TIN_FLOWING, FluidAttributes.builder(TIN_STILL_RL, TIN_FLOWING_RL)
            .viscosity(3).density(5).overlay(TIN_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_TIN_BLOCK).bucket(ItemInit.MOLTEN_TIN_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            NICKEL_FLUID, NICKEL_FLOWING, FluidAttributes.builder(NICKEL_STILL_RL, NICKEL_FLOWING_RL)
            .viscosity(3).density(5).overlay(NICKEL_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_NICKEL_BLOCK).bucket(ItemInit.MOLTEN_NICKEL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            ZINC_FLUID, ZINC_FLOWING, FluidAttributes.builder(ZINC_STILL_RL, ZINC_FLOWING_RL)
            .viscosity(3).density(5).overlay(ZINC_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_ZINC_BLOCK).bucket(ItemInit.MOLTEN_ZINC_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_PROPERTIES = new ForgeFlowingFluid.Properties(
            LEAD_FLUID, LEAD_FLOWING, FluidAttributes.builder(LEAD_STILL_RL, LEAD_FLOWING_RL)
            .viscosity(3).density(5).overlay(LEAD_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_LEAD_BLOCK).bucket(ItemInit.MOLTEN_LEAD_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_PROPERTIES = new ForgeFlowingFluid.Properties(
            SILVER_FLUID, SILVER_FLOWING, FluidAttributes.builder(SILVER_STILL_RL, SILVER_FLOWING_RL)
            .viscosity(3).density(5).overlay(SILVER_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_SILVER_BLOCK).bucket(ItemInit.MOLTEN_SILVER_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRONZE_PROPERTIES = new ForgeFlowingFluid.Properties(
            BRONZE_FLUID, BRONZE_FLOWING, FluidAttributes.builder(BRONZE_STILL_RL, BRONZE_FLOWING_RL)
            .viscosity(3).density(5).overlay(BRONZE_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_BRONZE_BLOCK).bucket(ItemInit.MOLTEN_BRONZE_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_ELECTRUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ELECTRUM_FLUID, ELECTRUM_FLOWING, FluidAttributes.builder(ELECTRUM_STILL_RL, ELECTRUM_FLOWING_RL)
            .viscosity(3).density(5).overlay(ELECTRUM_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_ELECTRUM_BLOCK).bucket(ItemInit.MOLTEN_ELECTRUM_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_INVAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            INVAR_FLUID, INVAR_FLOWING, FluidAttributes.builder(INVAR_STILL_RL, INVAR_FLOWING_RL)
            .viscosity(3).density(5).overlay(INVAR_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_INVAR_BLOCK).bucket(ItemInit.MOLTEN_INVAR_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_CONSTANTAN_PROPERTIES = new ForgeFlowingFluid.Properties(
            CONSTANTAN_FLUID, CONSTANTAN_FLOWING, FluidAttributes.builder(CONSTANTAN_STILL_RL, CONSTANTAN_FLOWING_RL)
            .viscosity(3).density(5).overlay(CONSTANTAN_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_CONSTANTAN_BLOCK).bucket(ItemInit.MOLTEN_CONSTANTAN_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            BRASS_FLUID, BRASS_FLOWING, FluidAttributes.builder(BRASS_STILL_RL, BRASS_FLOWING_RL)
            .viscosity(3).density(5).overlay(BRASS_OVERLAY_RL).sound(SoundEvents.BLOCK_LAVA_AMBIENT))
            .block(BlockInit.MOLTEN_BRASS_BLOCK).bucket(ItemInit.MOLTEN_BRASS_BUCKET);
}
