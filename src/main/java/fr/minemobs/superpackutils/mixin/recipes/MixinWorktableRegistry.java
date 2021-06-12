package fr.minemobs.superpackutils.mixin.recipes;

import elucent.eidolon.Eidolon;
import elucent.eidolon.Registry;
import elucent.eidolon.recipe.WorktableRecipe;
import elucent.eidolon.recipe.WorktableRegistry;
import fr.minemobs.superpackutils.init.ItemInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import fr.minemobs.superpackutils.init.ModTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WorktableRegistry.class)
public abstract class MixinWorktableRegistry {

    @Shadow
    public static void register(WorktableRecipe recipe) {
    }

    /**
     * @author elucent
     */
    @Overwrite
    public static void init() {
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.PEWTER_INGOT.get(), ItemStack.EMPTY,
                Registry.PEWTER_INLAY.get(), Registry.BASIC_AMULET.get(), Registry.PEWTER_INLAY.get(),
                ItemStack.EMPTY, Blocks.OBSIDIAN, ItemStack.EMPTY
        }, new Object[]{
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY,
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY
        }, new ItemStack(Registry.VOID_AMULET.get())).setRegistryName(Eidolon.MODID, "void_amulet"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.LESSER_SOUL_GEM.get(), ItemStack.EMPTY,
                Registry.ENCHANTED_ASH.get(), Items.IRON_CHESTPLATE, Registry.ENCHANTED_ASH.get(),
                ItemStack.EMPTY, Registry.ENCHANTED_ASH.get(), ItemStack.EMPTY
        }, new Object[]{
                Registry.PEWTER_INLAY.get(),
                Registry.PEWTER_INLAY.get(),
                Registry.PEWTER_INLAY.get(),
                Registry.PEWTER_INLAY.get()
        }, new ItemStack(Registry.WARDED_MAIL.get())).setRegistryName(Eidolon.MODID, "warded_mail"));
        register(new WorktableRecipe(new Object[]{
                Registry.PEWTER_INGOT.get(), Registry.PEWTER_INGOT.get(), ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, Registry.PEWTER_INGOT.get(),
                Items.STICK, ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.UNHOLY_SYMBOL.get(),
                Registry.SOUL_SHARD.get(),
                Registry.TATTERED_CLOTH.get(),
                Registry.SOUL_SHARD.get()
        }, new ItemStack(Registry.REAPER_SCYTHE.get())).setRegistryName(Eidolon.MODID, "reaper_scythe"));
        register(new WorktableRecipe(new Object[]{
                Registry.PEWTER_INGOT.get(), Registry.PEWTER_INGOT.get(), ItemStack.EMPTY,
                Registry.PEWTER_INGOT.get(), Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY
        }, new Object[]{
                Registry.UNHOLY_SYMBOL.get(),
                ItemStack.EMPTY,
                Registry.PEWTER_INLAY.get(),
                ItemStack.EMPTY
        }, new ItemStack(Registry.CLEAVING_AXE.get())).setRegistryName(Eidolon.MODID, "cleaving_axe"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Items.BOOK, ItemStack.EMPTY,
                Registry.ARCANE_GOLD_INGOT.get(), Blocks.OBSIDIAN, Registry.ARCANE_GOLD_INGOT.get(),
                Blocks.OBSIDIAN, Blocks.OBSIDIAN, Blocks.OBSIDIAN
        }, new Object[]{
                Tags.Items.GEMS_DIAMOND,
                Registry.GOLD_INLAY.get(),
                Tags.Items.GEMS_DIAMOND,
                Registry.GOLD_INLAY.get()
        }, new ItemStack(Registry.SOUL_ENCHANTER.get())).setRegistryName(Eidolon.MODID, "soul_enchanter"));
        register(new WorktableRecipe(new Object[]{
                Blocks.OBSIDIAN, Blocks.CRYING_OBSIDIAN, Blocks.OBSIDIAN,
                ItemStack.EMPTY, Registry.PEWTER_INGOT.get(), ItemStack.EMPTY,
                ItemStack.EMPTY, Registry.PEWTER_INLAY.get(), ItemStack.EMPTY
        }, new Object[]{
                Items.ENDER_PEARL,
                Registry.SOUL_SHARD.get(),
                Registry.LESSER_SOUL_GEM.get(),
                Registry.SOUL_SHARD.get()
        }, new ItemStack(Registry.REVERSAL_PICK.get())).setRegistryName(Eidolon.MODID, "reversal_pick"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.ARCANE_GOLD_INGOT.get(), Registry.SHADOW_GEM.get(),
                ItemStack.EMPTY, Items.STICK, Registry.ARCANE_GOLD_INGOT.get(),
                Registry.GOLD_INLAY.get(), ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.LESSER_SOUL_GEM.get(),
                Items.BLAZE_POWDER,
                Items.BLAZE_POWDER,
                Items.BLAZE_POWDER
        }, new ItemStack(Registry.SOULFIRE_WAND.get())).setRegistryName(Eidolon.MODID, "soulfire_wand"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.PEWTER_INGOT.get(), Registry.WRAITH_HEART.get(),
                ItemStack.EMPTY, Items.STICK, Registry.PEWTER_INGOT.get(),
                Registry.PEWTER_INLAY.get(), ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.LESSER_SOUL_GEM.get(),
                Items.BONE_MEAL,
                Items.BONE_MEAL,
                Items.BONE_MEAL
        }, new ItemStack(Registry.BONECHILL_WAND.get())).setRegistryName(Eidolon.MODID, "bonechill_wand"));
        register(new WorktableRecipe(new Object[]{
                Blocks.SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE_SLAB,
                Tags.Items.STONE, Tags.Items.STONE, Tags.Items.STONE,
                Tags.Items.STONE, Registry.PEWTER_INLAY.get(), Tags.Items.STONE
        }, new Object[]{
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY,
                ItemStack.EMPTY,
                ItemStack.EMPTY
        }, new ItemStack(Registry.STONE_ALTAR.get(), 3)).setRegistryName(Eidolon.MODID, "stone_altar"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Blocks.SMOOTH_STONE, ItemStack.EMPTY,
                Tags.Items.STONE, Tags.Items.STONE, Tags.Items.STONE,
                ItemStack.EMPTY, Tags.Items.STONE, ItemStack.EMPTY
        }, new Object[]{
                Registry.UNHOLY_SYMBOL.get(),
                ItemStack.EMPTY,
                Registry.GOLD_INLAY.get(),
                ItemStack.EMPTY
        }, new ItemStack(Registry.UNHOLY_EFFIGY.get())).setRegistryName(Eidolon.MODID, "unholy_effigy"));
        register(new WorktableRecipe(new Object[]{
                Blocks.WHITE_WOOL, Blocks.WHITE_WOOL, Blocks.WHITE_WOOL,
                Blocks.WHITE_WOOL, Registry.SHADOW_GEM.get(), Blocks.WHITE_WOOL,
                Blocks.WHITE_WOOL, Blocks.WHITE_WOOL, Blocks.WHITE_WOOL
        }, new Object[]{
                Registry.UNHOLY_SYMBOL.get(),
                ItemStack.EMPTY,
                Tags.Items.DYES_BLUE,
                ItemStack.EMPTY
        }, new ItemStack(Registry.WICKED_WEAVE.get(), 8)).setRegistryName(Eidolon.MODID, "wicked_weave"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.WICKED_WEAVE.get(), ItemStack.EMPTY,
                ItemStack.EMPTY, Registry.WICKED_WEAVE.get(), ItemStack.EMPTY,
                Registry.WICKED_WEAVE.get(), ItemStack.EMPTY, Registry.WICKED_WEAVE.get()
        }, new Object[]{
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY,
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY
        }, new ItemStack(Registry.WARLOCK_HAT.get())).setRegistryName(Eidolon.MODID, "warlock_hat"));
        register(new WorktableRecipe(new Object[]{
                Registry.WICKED_WEAVE.get(), Registry.WICKED_WEAVE.get(), Registry.WICKED_WEAVE.get(),
                Registry.WICKED_WEAVE.get(), Registry.WICKED_WEAVE.get(), Registry.WICKED_WEAVE.get(),
                Registry.WICKED_WEAVE.get(), ItemStack.EMPTY, Registry.WICKED_WEAVE.get()
        }, new Object[]{
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY,
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY
        }, new ItemStack(Registry.WARLOCK_CLOAK.get())).setRegistryName(Eidolon.MODID, "warlock_cloak"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY,
                Registry.WICKED_WEAVE.get(), ItemStack.EMPTY, Registry.WICKED_WEAVE.get(),
                Registry.WICKED_WEAVE.get(), ItemStack.EMPTY, Registry.WICKED_WEAVE.get()
        }, new Object[]{
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY,
                Registry.SOUL_SHARD.get(),
                ItemStack.EMPTY
        }, new ItemStack(Registry.WARLOCK_BOOTS.get())).setRegistryName(Eidolon.MODID, "warlock_boots"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Tags.Items.ENDER_PEARLS, ItemStack.EMPTY,
                Tags.Items.FEATHERS, Registry.BASIC_BELT.get(), Tags.Items.FEATHERS,
                ItemStack.EMPTY, Registry.LESSER_SOUL_GEM.get(), ItemStack.EMPTY
        }, new Object[]{
                Registry.ENDER_CALX.get(),
                Registry.PEWTER_INLAY.get(),
                Registry.ENDER_CALX.get(),
                Registry.PEWTER_INLAY.get()
        }, new ItemStack(Registry.GRAVITY_BELT.get())).setRegistryName(Eidolon.MODID, "gravity_belt"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.GOLD_INLAY.get(), ItemStack.EMPTY,
                Registry.ARCANE_GOLD_INGOT.get(), Registry.BASIC_BELT.get(), Registry.ARCANE_GOLD_INGOT.get(),
                ItemStack.EMPTY, Tags.Items.GEMS_DIAMOND, ItemStack.EMPTY
        }, new Object[]{
                Items.LEATHER,
                Registry.SOUL_SHARD.get(),
                Registry.ENCHANTED_ASH.get(),
                Registry.SOUL_SHARD.get()
        }, new ItemStack(Registry.RESOLUTE_BELT.get())).setRegistryName(Eidolon.MODID, "resolute_belt"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Registry.WICKED_WEAVE.get(), ItemStack.EMPTY,
                Registry.WICKED_WEAVE.get(), Registry.WICKED_WEAVE.get(), Registry.WICKED_WEAVE.get(),
                ItemStack.EMPTY, Registry.LESSER_SOUL_GEM.get(), ItemStack.EMPTY
        }, new Object[]{
                Registry.WARPED_SPROUTS.get(),
                Registry.ENDER_CALX.get(),
                Registry.SOUL_SHARD.get(),
                Registry.ENDER_CALX.get()
        }, new ItemStack(Registry.PRESTIGIOUS_PALM.get())).setRegistryName(Eidolon.MODID, "prestigious_palm"));
        register(new WorktableRecipe(new Object[]{
                ItemInit.PLATINUM_INGOT.get(), Registry.LEAD_INGOT.get(), ItemInit.PLATINUM_INGOT.get(),
                Registry.LEAD_INGOT.get(), Registry.LEAD_INGOT.get(), Registry.LEAD_INGOT.get(),
                Items.LEATHER, Registry.SOUL_SHARD.get(), Items.LEATHER
        }, new Object[]{
                Tags.Items.STORAGE_BLOCKS_LAPIS,
                ItemStack.EMPTY,
                Tags.Items.GEMS_QUARTZ,
                ItemStack.EMPTY
        }, new ItemStack(Registry.MIND_SHIELDING_PLATE.get())).setRegistryName(Eidolon.MODID, "mind_shielding_plate"));
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, Tags.Items.STORAGE_BLOCKS_DIAMOND, ItemStack.EMPTY,
                ItemStack.EMPTY, Registry.BASIC_AMULET.get(), ItemStack.EMPTY,
                ItemStack.EMPTY, Blocks.GLASS, ItemStack.EMPTY
        }, new Object[]{
                Registry.ZOMBIE_HEART.get(),
                Registry.LESSER_SOUL_GEM.get(),
                Registry.WRAITH_HEART.get(),
                Registry.LESSER_SOUL_GEM.get()
        }, new ItemStack(Registry.GLASS_HAND.get())).setRegistryName(Eidolon.MODID, "glass_hand"));
    }
}