package fr.minemobs.superpackutils.objects.tileentities;

import fr.minemobs.superpackutils.init.TileEntityInit;
import fr.minemobs.superpackutils.objects.blocks.RedstoneClock;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileClock extends TileEntity implements ITickableTileEntity {

    public TileClock(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public TileClock(){
        super(TileEntityInit.REDSTONE_CLOCK.get());
    }

    int tickCount = 0;

    private void informNeighborsOfPowerChange(World world, BlockPos blockPos) {
        world.notifyNeighborsOfStateChange(blockPos, getBlockState().getBlock());
        world.notifyNeighborsOfStateChange(blockPos.north(), getBlockState().getBlock());
        world.notifyNeighborsOfStateChange(blockPos.down(), getBlockState().getBlock());
        world.notifyNeighborsOfStateChange(blockPos.east(), getBlockState().getBlock());
        world.notifyNeighborsOfStateChange(blockPos.west(), getBlockState().getBlock());
        world.notifyNeighborsOfStateChange(blockPos.south(), getBlockState().getBlock());
        world.notifyNeighborsOfStateChange(blockPos.up(), getBlockState().getBlock());
    }

    @Override
    public void tick() {
        if(tickCount == 60){
            world.setBlockState(getPos(),this.getBlockState().with(RedstoneClock.EMITTING, Boolean.TRUE));
            informNeighborsOfPowerChange(world, getPos());
        }else if(tickCount >= 70) {
            tickCount = 0;
            world.setBlockState(getPos(),this.getBlockState().with(RedstoneClock.EMITTING, Boolean.FALSE));
            informNeighborsOfPowerChange(world, getPos());
        }else {
            tickCount++;
        }
    }
}