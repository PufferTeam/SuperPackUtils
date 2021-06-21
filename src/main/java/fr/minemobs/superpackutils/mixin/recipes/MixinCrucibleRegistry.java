package fr.minemobs.superpackutils.mixin.recipes;

import elucent.eidolon.Eidolon;
import elucent.eidolon.Registry;
import elucent.eidolon.recipe.CrucibleRecipe;
import elucent.eidolon.recipe.CrucibleRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CrucibleRegistry.class)
public abstract class MixinCrucibleRegistry {

    @Shadow(remap = false)
    public static void register(CrucibleRecipe recipe) {
    }

    /**
     * @author elucent
     */
    @Overwrite(remap = false)
    public static void init() {

        //Arcane Gold
        register(new CrucibleRecipe(new ItemStack(Registry.ARCANE_GOLD_INGOT.get(), 2)).setRegistryName(Eidolon.MODID, "arcane_gold")
                .addStep(Tags.Items.DUSTS_REDSTONE, Tags.Items.DUSTS_REDSTONE, Registry.SOUL_SHARD.get())
                .addStep(Tags.Items.INGOTS_GOLD, Tags.Items.INGOTS_GOLD));

        //Lesser Soul Gem
        register(new CrucibleRecipe(new ItemStack(Registry.LESSER_SOUL_GEM.get())).setRegistryName(Eidolon.MODID, "lesser_soul_gem")
                .addStep(Tags.Items.DUSTS_REDSTONE, Tags.Items.DUSTS_REDSTONE, Tags.Items.GEMS_LAPIS, Tags.Items.GEMS_LAPIS)
                .addStirringStep(2, Registry.SOUL_SHARD.get(), Registry.SOUL_SHARD.get(), Registry.SOUL_SHARD.get(), Registry.SOUL_SHARD.get())
                .addStep(Tags.Items.GEMS_QUARTZ));

        //Shadow Gem
        register(new CrucibleRecipe(new ItemStack(Registry.SHADOW_GEM.get())).setRegistryName(Eidolon.MODID, "shadow_gem")
                .addStep(Items.COAL)
                .addStirringStep(1, Items.GHAST_TEAR, Registry.DEATH_ESSENCE.get())
                .addStirringStep(1, Registry.SOUL_SHARD.get(), Registry.SOUL_SHARD.get(), Registry.DEATH_ESSENCE.get())
                .addStep(Tags.Items.GEMS_DIAMOND));

        //Sulfur
        register(new CrucibleRecipe(getItem("thermal", "sulfur_dust")).setRegistryName(Eidolon.MODID, "sulfur")
                .addStep(Items.COAL, Registry.ENCHANTED_ASH.get()));

        //Ender Calx
        register(new CrucibleRecipe(new ItemStack(Registry.ENDER_CALX.get(), 2)).setRegistryName(Eidolon.MODID, "ender_calx")
                .addStep(getItem("waystones", "warp_dust"), Registry.ENCHANTED_ASH.get()));

        //Leather
        register(new CrucibleRecipe(new ItemStack(Items.LEATHER, 1)).setRegistryName(Eidolon.MODID, "leather_from_flesh")
                .addStep(Registry.ENCHANTED_ASH.get(), Registry.ENCHANTED_ASH.get())
                .addStirringStep(2, Items.ROTTEN_FLESH));

        //Rotten Beef
        register(new CrucibleRecipe(new ItemStack(Items.ROTTEN_FLESH, 1)).setRegistryName(Eidolon.MODID, "rotten_beef")
                .addStep(Items.BEEF, Tags.Items.MUSHROOMS));

        //Rotten Pork
        register(new CrucibleRecipe(new ItemStack(Items.ROTTEN_FLESH, 1)).setRegistryName(Eidolon.MODID, "rotten_pork")
                .addStep(Items.PORKCHOP, Tags.Items.MUSHROOMS));

        //Rotten Mutton
        register(new CrucibleRecipe(new ItemStack(Items.ROTTEN_FLESH, 1)).setRegistryName(Eidolon.MODID, "rotten_mutton")
                .addStep(Items.MUTTON, Tags.Items.MUSHROOMS));

        //Rotten Chicken
        register(new CrucibleRecipe(new ItemStack(Items.ROTTEN_FLESH, 1)).setRegistryName(Eidolon.MODID, "rotten_chicken")
                .addStep(Items.CHICKEN, Tags.Items.MUSHROOMS));

        //Rotten Rabbit
        register(new CrucibleRecipe(new ItemStack(Items.ROTTEN_FLESH, 1)).setRegistryName(Eidolon.MODID, "rotten_rabbit")
                .addStep(Items.RABBIT, Tags.Items.MUSHROOMS));

        //Gunpowder
        register(new CrucibleRecipe(new ItemStack(Items.GUNPOWDER, 4)).setRegistryName(Eidolon.MODID, "gunpowder")
                .addStep(Registry.SULFUR.get(), Items.BONE_MEAL)
                .addStirringStep(1, Items.CHARCOAL));

        //Gilded Apple
        register(new CrucibleRecipe(new ItemStack(Items.GOLDEN_APPLE, 1)).setRegistryName(Eidolon.MODID, "gilded_apple")
                .addStep(Tags.Items.INGOTS_GOLD, Tags.Items.INGOTS_GOLD)
                .addStirringStep(2, Registry.ENCHANTED_ASH.get())
                .addStep(Items.APPLE));

        //Gilded Carrot
        register(new CrucibleRecipe(new ItemStack(Items.GOLDEN_CARROT, 1)).setRegistryName(Eidolon.MODID, "gilded_carrot")
                .addStep(Tags.Items.NUGGETS_GOLD, Tags.Items.NUGGETS_GOLD)
                .addStirringStep(2, Registry.ENCHANTED_ASH.get())
                .addStep(Items.CARROT));

        //Gilded Melon
        register(new CrucibleRecipe(new ItemStack(Items.GLISTERING_MELON_SLICE, 1)).setRegistryName(Eidolon.MODID, "gilded_melon")
                .addStep(Tags.Items.NUGGETS_GOLD, Tags.Items.NUGGETS_GOLD)
                .addStirringStep(2, Registry.ENCHANTED_ASH.get())
                .addStep(Items.MELON_SLICE));

        //Death Essence
        register(new CrucibleRecipe(new ItemStack(Registry.DEATH_ESSENCE.get(), 4)).setRegistryName(Eidolon.MODID, "death_essence")
                .addStep(Registry.ZOMBIE_HEART.get(), Items.ROTTEN_FLESH)
                .addStirringStep(2, Items.BONE_MEAL, Items.BONE_MEAL)
                .addStep(Items.CHARCOAL));

        //Crimson Essence Fungus
        register(new CrucibleRecipe(new ItemStack(Registry.CRIMSON_ESSENCE.get(), 4)).setRegistryName(Eidolon.MODID, "crimson_essence_fungus")
                .addStep(Items.CRIMSON_FUNGUS, Items.NETHER_WART)
                .addStirringStep(1, getItem("thermal", "sulfur_dust")));

        //Crimson Essence Roots
        register(new CrucibleRecipe(new ItemStack(Registry.CRIMSON_ESSENCE.get(), 2)).setRegistryName(Eidolon.MODID, "crimson_essence_roots")
                .addStep(Items.CRIMSON_ROOTS, Items.NETHER_WART)
                .addStirringStep(1, getItem("thermal", "sulfur_dust")));

        //Crimson Essence Vines
        register(new CrucibleRecipe(new ItemStack(Registry.CRIMSON_ESSENCE.get(), 2)).setRegistryName(Eidolon.MODID, "crimson_essence_vines")
                .addStep(Items.WEEPING_VINES, Items.NETHER_WART)
                .addStirringStep(1, getItem("thermal", "sulfur_dust")));

        //Fungus Sprout
        register(new CrucibleRecipe(new ItemStack(Registry.FUNGUS_SPROUTS.get(), 2)).setRegistryName(Eidolon.MODID, "fungus_sprouts")
                .addStep(Tags.Items.MUSHROOMS)
                .addStirringStep(2, Items.BONE_MEAL)
                .addStep(Items.WHEAT_SEEDS));

        //Warped Sprouts
        register(new CrucibleRecipe(new ItemStack(Registry.WARPED_SPROUTS.get(), 2)).setRegistryName(Eidolon.MODID, "warped_sprouts")
                .addStep(Blocks.WARPED_FUNGUS)
                .addStirringStep(2, Registry.ENDER_CALX.get())
                .addStep(Items.NETHER_WART));

        //Polished Planks
        register(new CrucibleRecipe(new ItemStack(Registry.POLISHED_PLANKS.getBlock(), 32)).setRegistryName(Eidolon.MODID, "polished_planks")
                .addStep(ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS,
                        ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS, ItemTags.PLANKS)
                .addStirringStep(1, Registry.ENCHANTED_ASH.get()));
    }

    private static ItemStack getItem(String modID, String itemRegistryName) {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(modID, itemRegistryName)));
    }
}
