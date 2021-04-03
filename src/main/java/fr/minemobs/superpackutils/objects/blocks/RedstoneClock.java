package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.TileEntityInit;
import fr.minemobs.superpackutils.utils.helper.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
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

public class RedstoneClock extends Block {
    public static final BooleanProperty EMITTING = BooleanProperty.create("emitting");

    public RedstoneClock() {
        super(Properties.create(Material.ROCK));
        this.setDefaultState(this.stateContainer.getBaseState().with(EMITTING, Boolean.FALSE));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(EMITTING);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return blockState.get(EMITTING) ? 15 : 0;
    }

    @Override
    public int getStrongPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return !blockState.get(EMITTING) ? 0 : 15;
    }

    @Override
    public boolean canProvidePower(BlockState state) {
        return true;
    }

    @Override
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (state.getBlock() != oldState.getBlock() && !worldIn.isRemote()) {
            informNeighborsOfPowerChange(state, worldIn, pos);
        }
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        informNeighborsOfPowerChange(state, worldIn, pos);
        super.onReplaced(state, worldIn, pos, newState, isMoving);
    }

    private void informNeighborsOfPowerChange(BlockState blockState, World world, BlockPos blockPos) {
        world.notifyNeighborsOfStateChange(blockPos, this);
        world.notifyNeighborsOfStateChange(blockPos.north(), this);
        world.notifyNeighborsOfStateChange(blockPos.down(), this);
        world.notifyNeighborsOfStateChange(blockPos.east(), this);
        world.notifyNeighborsOfStateChange(blockPos.west(), this);
        world.notifyNeighborsOfStateChange(blockPos.south(), this);
        world.notifyNeighborsOfStateChange(blockPos.up(), this);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()){
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".redstoneclock"));
        }else{
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shift"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityInit.REDSTONE_CLOCK.get().create();
    }
}
