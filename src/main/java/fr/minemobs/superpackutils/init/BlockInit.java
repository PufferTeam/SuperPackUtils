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

    public static final RegistryObject<Block> TINY_TORCH = BLOCKS.register("tiny_torch",
            () -> new TinyTorch(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_CLOCK = BLOCKS.register("redstone_clock",
            RedstoneClock::new);

    public static final RegistryObject<Block> WALL_TINY_TORCH = BLOCKS.register("wall_tiny_torch",
            () -> new WallTinyTorch(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE = BLOCKS.register("deepslate",
            () -> new Block(AbstractBlock.Properties.from(Blocks.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(12)));

    public static final RegistryObject<Block> DUST_BLOCK = BLOCKS.register("dust_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> BIG_STEEL_CASING = BLOCKS.register("big_steel_casing", () -> new Block(AbstractBlock.Properties.create(Material.IRON)));

    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> MYTHRIL_BLOCK = BLOCKS.register("mythril_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MYTHRIL_BLOCK = BlockInit.BLOCKS.register("molten_mythril_fluid",
            () -> new FlowingFluidBlock(FluidInit.MYTHRIL_FLUID, AbstractBlock.Properties.from(Blocks.LAVA).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_PLATINUM_BLOCK = BlockInit.BLOCKS.register("molten_platinum_fluid",
            () -> new FlowingFluidBlock(FluidInit.PLATINUM_FLUID, AbstractBlock.Properties.from(Blocks.LAVA).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops().notSolid()));
}
