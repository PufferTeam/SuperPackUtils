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
    public static final RegistryObject<Gas> CHEMICAL_DEATH = GASES.register("chemical_death", () -> new Gas(GasBuilder.builder().color(new Color(133, 136, 140).getRGB())));
    public static final RegistryObject<Gas> NITROGEN = GASES.register("nitrogen", () -> new Gas(GasBuilder.builder().color(new Color(154, 171, 242).getRGB())));
    public static final RegistryObject<Gas> STABILIZER = GASES.register("stabilizer", () -> new Gas(GasBuilder.builder().color(new Color(71, 151, 214).getRGB())));
    public static final RegistryObject<Gas> AMMONIA = GASES.register("ammonia", () -> new Gas(GasBuilder.builder().color(new Color(155, 180, 186).getRGB())));
    public static final RegistryObject<Gas> CYANIDE = GASES.register("cyanide", () -> new Gas(GasBuilder.builder().color(new Color(230, 230, 230).getRGB())));
    public static final RegistryObject<Gas> CARBON_DIOXIDE = GASES.register("carbon_dioxide", () -> new Gas(GasBuilder.builder().color(new Color(13, 13, 13).getRGB())));
    public static final RegistryObject<Gas> METHANE = GASES.register("methane", () -> new Gas(GasBuilder.builder().color(new Color(242, 242, 242).getRGB())));

}