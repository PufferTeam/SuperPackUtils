package fr.minemobs.superpackutils.mixin.recipes;

import elucent.eidolon.Eidolon;
import elucent.eidolon.Registry;
import elucent.eidolon.recipe.WorktableRecipe;
import elucent.eidolon.recipe.WorktableRegistry;
import fr.minemobs.superpackutils.init.ItemInit;
import fr.minemobs.superpackutils.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
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

        //Void Amulet
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

        //Warded Mail
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

        //Reaper Scythe
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

        //Cleaving Axe
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

        //Soul Enchanter
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

        //Reversal Pick
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

        //Soulfire Wand
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

        //Bonechill Wand
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

        //Stone Altar
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

        //Unholy Effigy
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

        //Wicked Weave
        register(new WorktableRecipe(new Object[]{
                getItem("botania", "manaweave_cloth"), getItem("botania", "manaweave_cloth"), getItem("botania", "manaweave_cloth"),
                getItem("botania", "manaweave_cloth"), Registry.SHADOW_GEM.get(), getItem("botania", "manaweave_cloth"),
                getItem("botania", "manaweave_cloth"), getItem("botania", "manaweave_cloth"), getItem("botania", "manaweave_cloth")
        }, new Object[]{
                Registry.UNHOLY_SYMBOL.get(),
                ItemStack.EMPTY,
                getItem("botania", "spell_cloth"),
                ItemStack.EMPTY
        }, new ItemStack(Registry.WICKED_WEAVE.get(), 8)).setRegistryName(Eidolon.MODID, "wicked_weave"));

        //Warlock Hat
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

        //Warlock Cloak
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

        //Warlock Boots
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

        //Gravity Belt
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

        //Resolute Belt
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

        //Prestigious Palm
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

        //Mind Shielding Plate
        register(new WorktableRecipe(new Object[]{
                getItem("thermal", "lead_ingot"), getItem("thermal", "lead_ingot"), getItem("thermal", "lead_ingot"),
                getItem("thermal", "lead_ingot"), getItem("thermal", "lead_ingot"), getItem("thermal", "lead_ingot"),
                Items.LEATHER, Registry.SOUL_SHARD.get(), Items.LEATHER
        }, new Object[]{
                Tags.Items.STORAGE_BLOCKS_LAPIS,
                ItemStack.EMPTY,
                Tags.Items.GEMS_QUARTZ,
                ItemStack.EMPTY
        }, new ItemStack(Registry.MIND_SHIELDING_PLATE.get())).setRegistryName(Eidolon.MODID, "mind_shielding_plate"));

        //Glass Hand
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

        //Dimensional Stone
        register(new WorktableRecipe(new Object[]{
                getItem("botania", "mana_pearl"), getItem("minecraft", "obsidian"), getItem("botania", "mana_pearl"),
                getItem("minecraft", "obsidian"), getItem("botania", "rune_mana"), getItem("minecraft", "obsidian"),
                getItem("botania", "mana_pearl"), getItem("minecraft", "obsidian"), getItem("botania", "mana_pearl")
        }, new Object[]{
                Registry.SOUL_SHARD.get(),
                Registry.ENDER_CALX.get(),
                Registry.SOUL_SHARD.get(),
                Registry.ENDER_CALX.get()
        }, new ItemStack(BlockInit.DIMENSIONAL_STONE.get())).setRegistryName("superpackutils", "dimensional_stone"));

        //Reclaimer
        register(new WorktableRecipe(new Object[]{
                getItem("minecraft", "blaze_powder"), getItem("minecraft", "obsidian"), getItem("minecraft", "blaze_powder"),
                getItem("minecraft", "obsidian"), getItem("botania", "rune_mana"), getItem("minecraft", "obsidian"),
                getItem("minecraft", "blaze_powder"), getItem("minecraft", "obsidian"), getItem("minecraft", "blaze_powder")
        }, new Object[]{
                Registry.CRIMSON_ESSENCE.get(),
                Registry.WARPED_SPROUTS.get(),
                Registry.CRIMSON_ESSENCE.get(),
                Registry.WARPED_SPROUTS.get()
        }, getItem("betterportals", "reclaimer")).setRegistryName("betterportals", "reclaimer"));

        //Resonating Wand
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, getItem("astralsorcery", "aquamarine"), getItem("minecraft", "ender_pearl"),
                ItemStack.EMPTY, ItemInit.STARLIGHT_STICK.get(), getItem("astralsorcery", "aquamarine"),
                ItemInit.STARLIGHT_STICK.get(), ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.ENDER_CALX.get(),
                Registry.PEWTER_INLAY.get(),
                Registry.ENDER_CALX.get(),
                Registry.PEWTER_INLAY.get()
        }, getItem("astralsorcery", "wand")).setRegistryName("astralsorcery", "wand"));

        //Illumination Wand
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, getItem("astralsorcery", "starmetal_ingot"), getItem("astralsorcery", "illumination_powder"),
                ItemStack.EMPTY, ItemInit.STARLIGHT_STICK.get(), getItem("astralsorcery", "starmetal_ingot"),
                ItemInit.STARLIGHT_STICK.get(), ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.LESSER_SOUL_GEM.get(),
                Registry.GOLD_INLAY.get(),
                Registry.SOUL_SHARD.get(),
                Registry.GOLD_INLAY.get()
        }, getItem("astralsorcery", "illumination_wand")).setRegistryName("astralsorcery", "illumination_wand"));

        //Formation Wand
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, getItem("astralsorcery", "starmetal_ingot"), Registry.SHADOW_GEM.get(),
                ItemStack.EMPTY, ItemInit.STARLIGHT_STICK.get(), getItem("astralsorcery", "starmetal_ingot"),
                ItemInit.STARLIGHT_STICK.get(), ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.LESSER_SOUL_GEM.get(),
                Registry.GOLD_INLAY.get(),
                Registry.SOUL_SHARD.get(),
                Registry.GOLD_INLAY.get()
        }, getItem("astralsorcery", "architect_wand")).setRegistryName("astralsorcery", "architect_wand"));

        //Formation Wand
        register(new WorktableRecipe(new Object[]{
                ItemStack.EMPTY, getItem("astralsorcery", "starmetal_ingot"), getItem("botania", "mana_diamond"),
                ItemStack.EMPTY, ItemInit.STARLIGHT_STICK.get(), getItem("astralsorcery", "starmetal_ingot"),
                ItemInit.STARLIGHT_STICK.get(), ItemStack.EMPTY, ItemStack.EMPTY
        }, new Object[]{
                Registry.LESSER_SOUL_GEM.get(),
                Registry.GOLD_INLAY.get(),
                Registry.SOUL_SHARD.get(),
                Registry.GOLD_INLAY.get()
        }, getItem("astralsorcery", "architect_wand")).setRegistryName("astralsorcery", "architect_wand"));

    }

    private static ItemStack getItem(String modID, String itemRegistryName) {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(modID, itemRegistryName)));
    }
}