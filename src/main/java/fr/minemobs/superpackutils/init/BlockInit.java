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

import java.util.Locale;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    //Specials Blocks
    public static final RegistryObject<Block> TINY_TORCH = BLOCKS.register("tiny_torch",
            () -> new TinyTorch(Block.Properties.of(Material.DECORATION).noCollission().instabreak()
                    .lightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> REDSTONE_CLOCK = registerBlock("redstone_clock",
            new RedstoneClock());

    public static final RegistryObject<Block> WALL_TINY_TORCH = BLOCKS.register("wall_tiny_torch",
            () -> new WallTinyTorch(Block.Properties.of(Material.DECORATION).noCollission().instabreak()
                    .lightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> DEEPSLATE = registerBlock("deepslate",
            AbstractBlock.Properties.copy(Blocks.STONE).strength(0.75F, 3.0F).harvestTool(ToolType.PICKAXE).harvestLevel(4));

    //Blocks
    public static final RegistryObject<Block> DIMENSIONAL_STONE = registerBlock("dimensional_stone", AbstractBlock.Properties.copy(Blocks.IRON_ORE));
    public static final RegistryObject<Block> DYINGROCK = registerBlock("dyingrock");
    public static final RegistryObject<Block> INDUSTRIAL_SAND = registerBlock("industrial_sand", AbstractBlock.Properties.copy(Blocks.SAND));

    //Casing
    public static final RegistryObject<Block> BIG_STEEL_CASING = registerBlock("big_steel_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INSCRIBER_CASING = registerBlock("inscriber_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INFUSER_CASING = registerBlock("infuser_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> METALLURGIC_CASING = registerBlock("metallurgic_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> IMPROVED_METALLURGIC_CASING = registerBlock("improved_metallurgic_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> ASSEMBLER_FRAME = registerBlock("assembler_frame", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> SIEVE_CASING = registerBlock("sieve_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));

    //Platinum Ore
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore");

    //Infused Ores
    public static final RegistryObject<Block> INFUSED_STONE = registerBlock("infused_stone", Blocks.DIAMOND_BLOCK);
    public static final RegistryObject<Block> INFUSED_URANIUM_ORE = registerBlock("infused_uranium_ore", Blocks.DIAMOND_BLOCK);
    public static final RegistryObject<Block> INFUSED_OSMIUM_ORE = registerBlock("infused_osmium_ore", Blocks.DIAMOND_BLOCK);

    //Ore Blocks
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block");

    public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block");

    //Fluids
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MYTHRIL_BLOCK = registerBlock("molten_mythril_fluid",
            new FlowingFluidBlock(FluidInit.MYTHRIL_FLUID, AbstractBlock.Properties.copy(Blocks.LAVA).noCollission().strength(100.0f).noDrops().noOcclusion()));

    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BIO_PLASTIC_BLOCK = registerBlock("molten_bio_plastic_fluid",
            new FlowingFluidBlock(FluidInit.MOLTEN_BIO_PLASTIC_FLUID, AbstractBlock.Properties.copy(Blocks.LAVA).noCollission().strength(100.0f).noDrops().noOcclusion()));

    public static final RegistryObject<FlowingFluidBlock> LUBRIFIED_LPG_BLOCK = registerBlock("lubrified_lpg_fluid",
            new FlowingFluidBlock(FluidInit.LUBRIFIED_LPG_FLUID, AbstractBlock.Properties.copy(Blocks.LAVA).noCollission().strength(100.0f).noDrops().noOcclusion()));

    //Register functions

    private static RegistryObject<Block> registerBlock(String name) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    }

    private static RegistryObject<Block> registerBlock(String name, Block.Properties properties) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> new Block(properties));
    }

    private static RegistryObject<Block> registerBlock(String name, Block block) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> block);
    }

    private static RegistryObject<FlowingFluidBlock> registerBlock(String name, FlowingFluidBlock block) {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT).replaceAll(" ","_"), () -> block);
    }
}
