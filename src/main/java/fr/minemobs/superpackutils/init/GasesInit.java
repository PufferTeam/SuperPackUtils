package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.awt.Color;

public class GasesInit {

    public static final DeferredRegister<Gas> GASES = DeferredRegister.create(Gas.class, Main.MOD_ID);

    public static final RegistryObject<Gas> ETHYL_CHLORIDE = GASES.register("ethyl_chloride", () -> new Gas(GasBuilder.builder().color(new Color(201, 201, 201).getRGB())));
    public static final RegistryObject<Gas> SILICON_DIOXIDE = GASES.register("silicon_dioxide", () -> new Gas(GasBuilder.builder().color(new Color(255, 255, 255).getRGB())));
    public static final RegistryObject<Gas> POLYETHENE = GASES.register("polyethene", () -> new Gas(GasBuilder.builder().color(new Color(133, 136, 140).getRGB())));

}
