package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.utils.helper.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SpawnerBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.*;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class BrokenSpawner extends Block {

    private final ResourceLocation mobLocation;

    public BrokenSpawner(ResourceLocation mobLocation) {
        super(Properties.copy(Blocks.SPAWNER));
        this.mobLocation = mobLocation;
    }

    @Override
    public void onPlace(BlockState oldState, World worldIn, BlockPos pos, BlockState newState, boolean p_220082_5_) {
        SpawnerBlock block = (SpawnerBlock) Blocks.SPAWNER;
        MobSpawnerTileEntity te = (MobSpawnerTileEntity) block.newBlockEntity(worldIn);
        CompoundNBT nbt = te.serializeNBT();
        nbt.putInt("SpawnCount", 0);
        nbt.putInt("MaxNearbyEntities", 1);
        nbt.putInt("SpawnRange", 1);
        nbt.putInt("Delay", 1800);
        nbt.putInt("MinSpawnDelay", 1800);
        nbt.putInt("MaxSpawnDelay", 1800);
        nbt.putInt("RequiredPlayerRange", 50);
        CompoundNBT nbt1 = new CompoundNBT();
        nbt1.putString("id", mobLocation.getNamespace() + ":" + mobLocation.getPath());
        nbt.put("SpawnData", nbt1);
        te.getSpawner().load(nbt);
        worldIn.setBlockAndUpdate(pos, block.defaultBlockState());
        worldIn.setBlockEntity(pos, te);
    }


    @Override
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()){
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".brokenspawner"));
        }else{
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shift"));
        }
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
