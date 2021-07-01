package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.objects.blocks.BrokenSpawner;
import fr.minemobs.superpackutils.objects.blocks.RedstoneClock;
import fr.minemobs.superpackutils.objects.blocks.TinyTorch;
import fr.minemobs.superpackutils.objects.blocks.WallTinyTorch;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ResourceLocation;
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

    public static final RegistryObject<Block> REDSTONE_CLOCK = registerBlock("redstone_clock", new RedstoneClock());

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
    public static final RegistryObject<Block> MIXER_CASING = registerBlock("mixer_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> CHEMICAL_REACTOR_CASING = registerBlock("chemical_reactor_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> WASHER_CASING = registerBlock("washer_casing", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));

    //Platinum Ore
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore");

    //Infused Ores
    public static final RegistryObject<Block> INFUSED_STONE = registerBlock("infused_stone", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INFUSED_URANIUM_ORE = registerBlock("infused_uranium_ore", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));
    public static final RegistryObject<Block> INFUSED_OSMIUM_ORE = registerBlock("infused_osmium_ore", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));

    //Ore Blocks
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> CUPRONICKEL_BLOCK = registerBlock("cupronickel_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block", AbstractBlock.Properties.copy(Blocks.IRON_BLOCK));
    public static final RegistryObject<Block> EPOXY_ROSIN_BLOCK = registerBlock("epoxy_rosin_block", AbstractBlock.Properties.copy(Blocks.HONEY_BLOCK));
    public static final RegistryObject<Block> DARK_STEEL_BLOCK = registerBlock("dark_steel_block", AbstractBlock.Properties.copy(Blocks.DIAMOND_BLOCK));

    //Obsidian
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian", AbstractBlock.Properties.copy(Blocks.OBSIDIAN));

    //Spawner
    public static final RegistryObject<Block> BLIZZ_SPAWNER = registerBlock("blizz_spawner", new BrokenSpawner(new ResourceLocation("thermal", "blizz")));
    public static final RegistryObject<Block> BLITZ_SPAWNER = registerBlock("blitz_spawner", new BrokenSpawner(new ResourceLocation("thermal", "blitz")));
    public static final RegistryObject<Block> BASALZ_SPAWNER = registerBlock("basalz_spawner", new BrokenSpawner(new ResourceLocation("thermal", "basalz")));
    //public static final RegistryObject<Block> BLAZE_SPAWNER = registerBlock("blaze_spawner", new BrokenSpawner(new ResourceLocation("blaze")));

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
}
