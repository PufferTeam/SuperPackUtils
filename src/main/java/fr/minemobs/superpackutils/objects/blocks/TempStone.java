package fr.minemobs.superpackutils.objects.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraftforge.common.ToolType;

public class TempStone extends OreBlock {

    public TempStone() {
        super(Properties.from(Blocks.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(12));
    }
}