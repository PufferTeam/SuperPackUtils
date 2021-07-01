package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.TileEntityInit;
import fr.minemobs.superpackutils.utils.helper.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import net.minecraft.block.AbstractBlock.Properties;

public class RedstoneClock extends Block {
    public static final BooleanProperty EMITTING = BooleanProperty.create("emitting");

    public RedstoneClock() {
        super(Properties.copy(Blocks.STONE));
        this.registerDefaultState(this.stateDefinition.any().setValue(EMITTING, Boolean.FALSE));
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(EMITTING);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public int getSignal(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return blockState.getValue(EMITTING) ? 15 : 0;
    }

    @Override
    public int getDirectSignal(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return !blockState.getValue(EMITTING) ? 0 : 15;
    }

    @Override
    public boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    public void onPlace(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (state.getBlock() != oldState.getBlock() && !worldIn.isClientSide()) {
            informNeighborsOfPowerChange(state, worldIn, pos);
        }
    }

    @Override
    public void onRemove(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        informNeighborsOfPowerChange(state, worldIn, pos);
        super.onRemove(state, worldIn, pos, newState, isMoving);
    }

    @Override
    public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, FluidState fluid) {
        return super.removedByPlayer(state, world, pos, player, willHarvest, fluid);
    }

    private void informNeighborsOfPowerChange(BlockState blockState, World world, BlockPos blockPos) {
        world.updateNeighborsAt(blockPos, this);
        world.updateNeighborsAt(blockPos.north(), this);
        world.updateNeighborsAt(blockPos.below(), this);
        world.updateNeighborsAt(blockPos.east(), this);
        world.updateNeighborsAt(blockPos.west(), this);
        world.updateNeighborsAt(blockPos.south(), this);
        world.updateNeighborsAt(blockPos.above(), this);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()) {
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shiftw"));
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".redstoneclock"));
        }else{
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shiftg"));
        }
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityInit.REDSTONE_CLOCK.get().create();
    }
}
