package fr.minemobs.superpackutils.mixin.item;

import net.minecraft.item.ItemTier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemTier.class)
public abstract class MixinItemTier {

    @Shadow private int maxUses;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void onConstructed(CallbackInfo ci) {
        maxUses = 1;
    }

}
