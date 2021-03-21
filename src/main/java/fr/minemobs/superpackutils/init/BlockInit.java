package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.blocks.TempStone;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> TINY_TORCH = BLOCKS.register("tiny_torch",
            () -> new TinyTorch(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WALL_TINY_TORCH = BLOCKS.register("wall_tiny_torch",
            () -> new WallTinyTorch(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> TEMPNAME_STONE = BLOCKS.register("tempname_stone",
            TempStone::new);

    public static final RegistryObject<Block> DUST_BLOCK = BLOCKS.register("dust_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> PLATINIUM_BLOCK = BLOCKS.register("platinium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    //Fluids

    public static final RegistryObject<FlowingFluidBlock> VINEGAR_BLOCK = BlockInit.BLOCKS.register("vinegar",
            () -> new FlowingFluidBlock(FluidInit.VINEGAR_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> OLIVE_OIL_BLOCK = BlockInit.BLOCKS.register("olive_oil",
            () -> new FlowingFluidBlock(FluidInit.OLIVE_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_IRON_BLOCK = BlockInit.BLOCKS.register("molten_iron_fluid",
            () -> new FlowingFluidBlock(FluidInit.IRON_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_GOLD_BLOCK = BlockInit.BLOCKS.register("molten_gold_fluid",
            () -> new FlowingFluidBlock(FluidInit.GOLD_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_COPPER_BLOCK = BlockInit.BLOCKS.register("molten_copper_fluid",
            () -> new FlowingFluidBlock(FluidInit.COPPER_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TIN_BLOCK = BlockInit.BLOCKS.register("molten_tin_fluid",
            () -> new FlowingFluidBlock(FluidInit.TIN_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_NICKEL_BLOCK = BlockInit.BLOCKS.register("molten_nickel_fluid",
            () -> new FlowingFluidBlock(FluidInit.NICKEL_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ZINC_BLOCK = BlockInit.BLOCKS.register("molten_zinc_fluid",
            () -> new FlowingFluidBlock(FluidInit.ZINC_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_LEAD_BLOCK = BlockInit.BLOCKS.register("molten_lead_fluid",
            () -> new FlowingFluidBlock(FluidInit.LEAD_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SILVER_BLOCK = BlockInit.BLOCKS.register("molten_silver_fluid",
            () -> new FlowingFluidBlock(FluidInit.SILVER_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BRONZE_BLOCK = BlockInit.BLOCKS.register("molten_bronze_fluid",
            () -> new FlowingFluidBlock(FluidInit.BRONZE_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ELECTRUM_BLOCK = BlockInit.BLOCKS.register("molten_electrum_fluid",
            () -> new FlowingFluidBlock(FluidInit.ELECTRUM_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_INVAR_BLOCK = BlockInit.BLOCKS.register("molten_invar_fluid",
            () -> new FlowingFluidBlock(FluidInit.INVAR_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CONSTANTAN_BLOCK = BlockInit.BLOCKS.register("molten_constantan_fluid",
            () -> new FlowingFluidBlock(FluidInit.CONSTANTAN_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BRASS_BLOCK = BlockInit.BLOCKS.register("molten_brass_fluid",
            () -> new FlowingFluidBlock(FluidInit.BRASS_FLUID, AbstractBlock.Properties.from(Blocks.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));
}
