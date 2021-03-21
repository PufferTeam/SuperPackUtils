package fr.minemobs.superpackutils.events;

import fr.minemobs.superpackutils.world.WorldFunctions;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CropEvent {

    private static final List<Block> iceblocks = new ArrayList<>(Arrays.asList(Blocks.ICE, Blocks.BLUE_ICE, Blocks.FROSTED_ICE, Blocks.PACKED_ICE));

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onCropGrow(BlockEvent.CropGrowEvent.Pre event) {
        World world = WorldFunctions.getWorldIfIsNotRemote(event.getWorld());
        if (world == null) return;
        BlockPos pos = event.getPos();
        Block blockBelow = world.getBlockState(pos.down(2)).getBlock();
        if (iceblocks.contains(blockBelow)){
            event.setResult(Event.Result.DENY);
        }
    }

    public static Boolean isOneOfBlocks(List<Block> blocks, Block block) {
        if (blocks.size() < 1) return false;
        return blocks.contains(block);
    }
}
