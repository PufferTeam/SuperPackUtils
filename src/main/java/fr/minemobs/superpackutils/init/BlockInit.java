package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.blocks.RedstoneClock;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    //Specials Blocks
    public static final RegistryObject<Block> TINY_TORCH = BLOCKS.register("tiny_torch",
            () -> new TinyTorch(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_CLOCK = BLOCKS.register("redstone_clock",
            RedstoneClock::new);

    public static final RegistryObject<Block> WALL_TINY_TORCH = BLOCKS.register("wall_tiny_torch",
            () -> new WallTinyTorch(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE = BLOCKS.register("deepslate",
            () -> new Block(AbstractBlock.Properties.from(Blocks.STONE).hardnessAndResistance(0.75F, 3.0F).harvestTool(ToolType.PICKAXE).harvestLevel(4)));

    //Blocks
    public static final RegistryObject<Block> DUST_BLOCK = BLOCKS.register("dust_block", () -> new Block(AbstractBlock.Properties.from(Blocks.SAND)));
    public static final RegistryObject<Block> DIMENSIONAL_STONE = BLOCKS.register("dimensional_stone", () -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DYINGROCK = BLOCKS.register("dyingrock", () -> new Block(AbstractBlock.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> INDUSTRIAL_SAND = BLOCKS.register("industrial_sand", () -> new Block(AbstractBlock.Properties.from(Blocks.SAND)));

    //Casing
    public static final RegistryObject<Block> BIG_STEEL_CASING = BLOCKS.register("big_steel_casing", () -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> INSCRIBER_CASING = BLOCKS.register("inscriber_casing", () -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> INFUSER_CASING = BLOCKS.register("infuser_casing", () -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> METALLURGIC_CASING = BLOCKS.register("metallurgic_casing", () -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> IMPROVED_METALLURGIC_CASING = BLOCKS.register("improved_metallurgic_casing", () -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_BLOCK)));

    //Ore Blocks
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> MYTHRIL_BLOCK = BLOCKS.register("mythril_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    //Fluids
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MYTHRIL_BLOCK = BlockInit.BLOCKS.register("molten_mythril_fluid",
            () -> new FlowingFluidBlock(FluidInit.MYTHRIL_FLUID, AbstractBlock.Properties.from(Blocks.LAVA).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BIO_PLASTIC_BLOCK = BlockInit.BLOCKS.register("molten_bio_plastic_fluid",
            () -> new FlowingFluidBlock(FluidInit.MOLTEN_BIO_PLASTIC_FLUID, AbstractBlock.Properties.from(Blocks.LAVA).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> LUBRIFIED_LPG_BLOCK = BlockInit.BLOCKS.register("lubrified_lpg_fluid",
            () -> new FlowingFluidBlock(FluidInit.LUBRIFIED_LPG_FLUID, AbstractBlock.Properties.from(Blocks.LAVA).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));
}
