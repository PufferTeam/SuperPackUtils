package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.awt.Color;

public class GasesInit {

    public static final DeferredRegister<Gas> GASES = DeferredRegister.create(Gas.class, Main.MOD_ID);

    /* Example of gas
    public static final RegistryObject<Gas> CACAHUETE_ACID = GASES.register("cacahuete_acid", () -> new Gas(GasBuilder.builder().color(new Color(147, 87, 38).getRGB())));
    */
}
