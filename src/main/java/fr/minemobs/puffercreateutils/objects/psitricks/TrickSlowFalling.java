package fr.minemobs.puffercreateutils.objects.psitricks;

import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.common.spell.trick.potion.PieceTrickPotionBase;

public class TrickSlowFalling extends PieceTrickPotionBase {
    public TrickSlowFalling(Spell spell) {
        super(spell);
    }

    public Effect getPotion() {
        return Effects.SLOW_FALLING;
    }
}