package fr.minemobs.superpackutils.objects.tileentities;

import fr.minemobs.superpackutils.init.TileEntityInit;
import fr.minemobs.superpackutils.objects.blocks.RedstoneClock;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileClock extends TileEntity implements ITickableTileEntity {

    private int tickCount = 0;

    public TileClock(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public TileClock(){
        super(TileEntityInit.REDSTONE_CLOCK.get());
    }

    private void informNeighborsOfPowerChange(World world, BlockPos blockPos) {
        world.updateNeighborsAt(blockPos, getBlockState().getBlock());
        world.updateNeighborsAt(blockPos.north(), getBlockState().getBlock());
        world.updateNeighborsAt(blockPos.below(), getBlockState().getBlock());
        world.updateNeighborsAt(blockPos.east(), getBlockState().getBlock());
        world.updateNeighborsAt(blockPos.west(), getBlockState().getBlock());
        world.updateNeighborsAt(blockPos.south(), getBlockState().getBlock());
        world.updateNeighborsAt(blockPos.above(), getBlockState().getBlock());
    }

    @Override
    public void tick() {
        if(tickCount == 60){
            level.setBlockAndUpdate(getBlockPos(), this.getBlockState().setValue(RedstoneClock.EMITTING, Boolean.TRUE));
            informNeighborsOfPowerChange(level, getBlockPos());
            tickCount++;
        }else if(tickCount >= 70) {
            tickCount = 0;
            level.setBlockAndUpdate(getBlockPos(), this.getBlockState().setValue(RedstoneClock.EMITTING, Boolean.FALSE));
            informNeighborsOfPowerChange(level, getBlockPos());
            tickCount++;
        }else {
            tickCount++;
        }
    }
}