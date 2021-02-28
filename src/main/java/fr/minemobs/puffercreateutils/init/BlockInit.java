package fr.minemobs.puffercreateutils.init;

import fr.minemobs.puffercreateutils.Main;
import fr.minemobs.puffercreateutils.objects.blocks.TinyTorch;
import fr.minemobs.puffercreateutils.objects.blocks.WallTinyTorch;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> TINY_TORCH = BLOCKS.register("tiny_torch",
            () -> new TinyTorch(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));

    public static final RegistryObject<Block> WALL_TINY_TORCH = BLOCKS.register("wall_tiny_torch",
            () -> new WallTinyTorch(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().zeroHardnessAndResistance()
                    .setLightLevel((state) -> 2).sound(SoundType.WOOD), ParticleTypes.FLAME));
}
