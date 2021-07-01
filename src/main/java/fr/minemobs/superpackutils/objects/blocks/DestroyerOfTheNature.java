package fr.minemobs.superpackutils.objects.blocks;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.utils.helper.KeyboardHelper;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;

public class DestroyerOfTheNature extends PickaxeItem {

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
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shiftw"));
            tooltip.add(new StringTextComponent("Do not use this or your TPS will drop to 0 and your map will be Tchernobyl"));
        }else {
            tooltip.add(new TranslationTextComponent("tooltip." + Main.MOD_ID + ".shiftg"));
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
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return Float.MAX_VALUE;
    }

    @Override
    public int getRGBDurabilityForDisplay(ItemStack stack) {
        return 0x6942069;
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        return true;
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if(entity.getType() != EntityType.SHEEP) return ActionResultType.FAIL;
        SheepEntity sheep = (SheepEntity) entity;
        if(sheep.isSheared()) player.sendMessage(new StringTextComponent("ProjectE vibes"), player.getUUID());
        sheep.shear(SoundCategory.NEUTRAL);
        return ActionResultType.SUCCESS;
    }
}
