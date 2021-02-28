package fr.minemobs.puffercreateutils.init;

import fr.minemobs.puffercreateutils.Main;
import fr.minemobs.puffercreateutils.objects.psitricks.TrickSlowFalling;
import vazkii.psi.api.PsiAPI;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.api.spell.SpellPiece;
import vazkii.psi.common.spell.base.ModSpellPieces;

public class PsiSpellInit {

    public static ModSpellPieces.PieceContainer trickSlowFalling;

    public static void registerTricks(){
        trickSlowFalling = register(TrickSlowFalling.class, "trick_slowfalling", "positive_effects");
    }

    public static ModSpellPieces.PieceContainer register(Class<? extends SpellPiece> clazz, String name, String group) {
        return register(clazz, name, group, false);
    }

    public static ModSpellPieces.PieceContainer register(Class<? extends SpellPiece> clazz, String name, String group, boolean main) {
        PsiAPI.registerSpellPieceAndTexture(Main.location(name), clazz);
        PsiAPI.addPieceToGroup(clazz, Main.location(group), main);
        return (s) -> {
            return SpellPiece.create(clazz, s);
        };
    }

    public interface PieceContainer {
        SpellPiece get(Spell var1);
    }

}
