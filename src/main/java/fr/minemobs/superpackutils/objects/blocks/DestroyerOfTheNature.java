package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.utils.helper.KeyboardHelper;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.awt.Color;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DestroyerOfTheNature extends SwordItem {

    public DestroyerOfTheNature() {
        super(ItemTier.NETHERITE, Integer.MAX_VALUE, Float.MAX_VALUE,
                new Item.Properties().tab(Main.ModItemGroup.instance).stacksTo(1).addToolType(ToolType.AXE, Integer.MAX_VALUE).fireResistant());
    }

    @Override
    public boolean isPiglinCurrency(ItemStack stack) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()){
            tooltip.add(new StringTextComponent("Do not use this or your TPS will drop to 0 and your map will be Tchernobyl"));
        }else {
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shift"));
        }
    }

    @Override
    public void onCraftedBy(ItemStack stack, World level, PlayerEntity player) {
        for (Enchantment value : ForgeRegistries.ENCHANTMENTS.getValues().stream().filter(value -> value.canApplyAtEnchantingTable(stack)).collect(Collectors.toList())) {
            stack.enchant(value, Short.MAX_VALUE);
        }
        player.sendMessage(new StringTextComponent("Wait?? How did you crafted me ?"), player.getUUID());
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
        entity.level.explode(entity, entity.getX(), entity.getY() + .5D, entity.getZ(), 500, true, Explosion.Mode.DESTROY);
        return true;
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, PlayerEntity player) {
        player.sendMessage(new StringTextComponent("WHY DID YOU DROP ME ?! I'm sad now"), player.getUUID());
        return true;
    }

    @Override
    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        return Float.MAX_VALUE;
    }

    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack) {
        return 0x6942069;
    }
}
