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
    public static final RegistryObject<Gas> METHANE = GASES.register("methane", () -> new Gas(GasBuilder.builder().color(new Color(171, 130, 166).getRGB())));
    public static final RegistryObject<Gas> PURE_SULFURIC_ACID = GASES.register("pure_sulfuric_acid", () -> new Gas(GasBuilder.builder().color(new Color(150, 146, 59).getRGB())));
    public static final RegistryObject<Gas> PROPYLENE = GASES.register("propylene", () -> new Gas(GasBuilder.builder().color(new Color(176, 188, 209).getRGB())));
    public static final RegistryObject<Gas> BENZENE = GASES.register("benzene", () -> new Gas(GasBuilder.builder().color(new Color(200, 209, 176).getRGB())));
    public static final RegistryObject<Gas> BUTADIENE = GASES.register("butadiene", () -> new Gas(GasBuilder.builder().color(new Color(184, 209, 176).getRGB())));
    public static final RegistryObject<Gas> ABS = GASES.register("abs", () -> new Gas(GasBuilder.builder().color(new Color(196, 196, 196).getRGB())));
    public static final RegistryObject<Gas> ACRYLONITRILE = GASES.register("acrylonitrile", () -> new Gas(GasBuilder.builder().color(new Color(192, 209, 171).getRGB())));
    public static final RegistryObject<Gas> STYRENE = GASES.register("styrene", () -> new Gas(GasBuilder.builder().color(new Color(117, 122, 111).getRGB())));
    public static final RegistryObject<Gas> ETHYL_BENZENE = GASES.register("ethyl_benzene", () -> new Gas(GasBuilder.builder().color(new Color(170, 179, 159).getRGB())));
    public static final RegistryObject<Gas> ETHYL_BENZENE_PEROXYDE = GASES.register("ethyl_benzene_peroxyde", () -> new Gas(GasBuilder.builder().color(new Color(116, 125, 96).getRGB())));
    public static final RegistryObject<Gas> PHENYLETHANOL = GASES.register("phenylethanol", () -> new Gas(GasBuilder.builder().color(new Color(173, 171, 147).getRGB())));
    public static final RegistryObject<Gas> TOLUENE = GASES.register("toluene", () -> new Gas(GasBuilder.builder().color(new Color(145, 117, 89).getRGB())));

    //Corundum

    public static final RegistryObject<Gas> RED_CORUNDUM = GASES.register("red_corundum", () -> new Gas(GasBuilder.builder().color(new Color(230, 126, 94).getRGB())));
    public static final RegistryObject<Gas> ORANGE_CORUNDUM = GASES.register("orange_corundum", () -> new Gas(GasBuilder.builder().color(new Color(230, 160, 94).getRGB())));
    public static final RegistryObject<Gas> YELLOW_CORUNDUM = GASES.register("yellow_corundum", () -> new Gas(GasBuilder.builder().color(new Color(230, 212, 94).getRGB())));
    public static final RegistryObject<Gas> GREEN_CORUNDUM = GASES.register("green_corundum", () -> new Gas(GasBuilder.builder().color(new Color(105, 224, 90).getRGB())));
    public static final RegistryObject<Gas> BLUE_CORUNDUM = GASES.register("blue_corundum", () -> new Gas(GasBuilder.builder().color(new Color(128, 197, 237).getRGB())));
    public static final RegistryObject<Gas> INDIGO_CORUNDUM = GASES.register("indigo_corundum", () -> new Gas(GasBuilder.builder().color(new Color(157, 128, 237).getRGB())));
    public static final RegistryObject<Gas> VIOLET_CORUNDUM = GASES.register("violet_corundum", () -> new Gas(GasBuilder.builder().color(new Color(235, 177, 250).getRGB())));
    public static final RegistryObject<Gas> WHITE_CORUNDUM = GASES.register("white_corundum", () -> new Gas(GasBuilder.builder().color(new Color(255, 255, 255).getRGB())));
    public static final RegistryObject<Gas> BLACK_CORUNDUM = GASES.register("black_corundum", () -> new Gas(GasBuilder.builder().color(new Color(0, 0, 0).getRGB())));

}