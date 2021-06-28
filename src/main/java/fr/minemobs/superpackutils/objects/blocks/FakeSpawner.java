package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SpawnerBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FakeSpawner extends Block {

    private final ResourceLocation mobLocation;

    public FakeSpawner(ResourceLocation mobLocation) {
        super(Properties.copy(Blocks.SPAWNER));
        this.mobLocation = mobLocation;
    }

    @Override
    public void onPlace(BlockState oldState, World worldIn, BlockPos pos, BlockState newState, boolean p_220082_5_) {
        SpawnerBlock spawner = (SpawnerBlock) Blocks.SPAWNER;
        BlockState state = spawner.defaultBlockState();
        if(worldIn.isClientSide) {
            worldIn.setBlockAndUpdate(pos, state);
            return;
        }
        //Idk how to do that without using command
        Main.LOGGER.info(mobLocation.getNamespace() + ':' + mobLocation.getPath());
        worldIn.getServer().getCommands().performCommand(worldIn.getServer().createCommandSourceStack(),
                String.format("setblock %s %s %s spawner{SpawnCount:0,MaxNearbyEntities:1,SpawnRange:1,Delay:1800,MinSpawnDelay:1800,MaxSpawnDelay:1800," +
                                "RequiredPlayerRange:50,SpawnData:{id:\"%s\"}}",
                        pos.getX(), pos.getY(), pos.getZ(), mobLocation.getNamespace() + ':' + mobLocation.getPath()));
    }
}
