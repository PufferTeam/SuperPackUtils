package fr.minemobs.superpackutils.mixin.item;

import com.github.alexthe666.citadel.server.item.CustomToolMaterial;
import com.github.alexthe666.iceandfire.item.*;
import fr.minemobs.superpackutils.Main;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(IafItemRegistry.class)
public abstract class MixinIafItemRegistry {

    @Mutable @Shadow(remap = false) public static CustomToolMaterial SILVER_TOOL_MATERIAL;
    @Mutable @Shadow(remap = false) public static CustomToolMaterial COPPER_TOOL_MATERIAL;
    @Mutable @Shadow(remap = false) @Final public static Item SILVER_SWORD;
    @Mutable @Shadow(remap = false) @Final public static Item SILVER_SHOVEL;
    @Mutable @Shadow(remap = false) @Final public static Item SILVER_PICKAXE;
    @Mutable @Shadow(remap = false) @Final public static Item SILVER_AXE;
    @Mutable @Shadow(remap = false) @Final public static Item COPPER_AXE;
    @Mutable @Shadow(remap = false) @Final public static Item SILVER_HOE;
    @Mutable @Shadow(remap = false) @Final public static Item COPPER_SWORD;
    @Mutable @Shadow(remap = false) @Final public static Item COPPER_SHOVEL;
    @Mutable @Shadow(remap = false) @Final public static Item COPPER_PICKAXE;
    @Mutable @Shadow(remap = false) @Final public static Item COPPER_HOE;

    @Inject(method = "registerItems", at = @At("HEAD"), remap = false)
    private static void registerItems(RegistryEvent.Register<Item> event, CallbackInfo ci){
        SILVER_TOOL_MATERIAL = new CustomToolMaterial("silver", 2, 1, 1.0F, 11.0F, 18);
        COPPER_TOOL_MATERIAL = new CustomToolMaterial("copper", 2, 1, 0.0F, 0.7F, 10);
        SILVER_SWORD = new ItemModSword(SILVER_TOOL_MATERIAL, "silver_sword");
        SILVER_SHOVEL = new ItemModShovel(SILVER_TOOL_MATERIAL, "silver_shovel");
        SILVER_PICKAXE = new ItemModPickaxe(SILVER_TOOL_MATERIAL, "silver_pickaxe");
        SILVER_AXE = new ItemModAxe(SILVER_TOOL_MATERIAL, "silver_axe");
        SILVER_HOE = new ItemModHoe(SILVER_TOOL_MATERIAL, "silver_hoe");
        COPPER_SWORD = new ItemModSword(COPPER_TOOL_MATERIAL, "copper_sword");
        COPPER_SHOVEL = new ItemModShovel(COPPER_TOOL_MATERIAL, "copper_shovel");
        COPPER_PICKAXE = new ItemModPickaxe(COPPER_TOOL_MATERIAL, "copper_pickaxe");
        COPPER_AXE = new ItemModAxe(COPPER_TOOL_MATERIAL, "copper_axe");
        COPPER_HOE = new ItemModHoe(COPPER_TOOL_MATERIAL, "copper_hoe");
        Main.getLOGGER().info("Prout");
    }

}
