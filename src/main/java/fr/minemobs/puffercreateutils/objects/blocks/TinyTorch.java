package fr.minemobs.puffercreateutils.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TorchBlock;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class TinyTorch extends TorchBlock {

    protected static final VoxelShape SHAPE =
            VoxelShapes.combineAndSimplify(Block.makeCuboidShape(7, 4, 7, 9, 6, 9), Block.makeCuboidShape(7, 0, 7, 9, 4, 9),
                    IBooleanFunction.OR);

    public TinyTorch(Properties properties, IParticleData particleData) {
        super(properties, particleData);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
