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
    public static final RegistryObject<Gas> SILICON_DIOXIDE = GASES.register("silicon_dioxide", () -> new Gas(GasBuilder.builder().color(new Color(167, 203, 217).getRGB())));
    public static final RegistryObject<Gas> POLYETHENE = GASES.register("polyethene", () -> new Gas(GasBuilder.builder().color(new Color(168, 143, 189).getRGB())));
    public static final RegistryObject<Gas> CHEMICAL_DEATH = GASES.register("chemical_death", () -> new Gas(GasBuilder.builder().color(new Color(133, 136, 140).getRGB())));
    public static final RegistryObject<Gas> NITROGEN = GASES.register("nitrogen", () -> new Gas(GasBuilder.builder().color(new Color(154, 171, 242).getRGB())));
    public static final RegistryObject<Gas> NITROUS_OXIDE = GASES.register("nitrous_oxide", () -> new Gas(GasBuilder.builder().color(new Color(64, 77, 133).getRGB())));
    public static final RegistryObject<Gas> STABILIZER = GASES.register("stabilizer", () -> new Gas(GasBuilder.builder().color(new Color(71, 151, 214).getRGB())));
    public static final RegistryObject<Gas> AMMONIA = GASES.register("ammonia", () -> new Gas(GasBuilder.builder().color(new Color(155, 180, 186).getRGB())));
    public static final RegistryObject<Gas> CYANIDE = GASES.register("cyanide", () -> new Gas(GasBuilder.builder().color(new Color(230, 230, 230).getRGB())));
    public static final RegistryObject<Gas> CARBON_DIOXIDE = GASES.register("carbon_dioxide", () -> new Gas(GasBuilder.builder().color(new Color(13, 13, 13).getRGB())));
    public static final RegistryObject<Gas> METHANE = GASES.register("methane", () -> new Gas(GasBuilder.builder().color(new Color(171, 130, 166).getRGB())));
    public static final RegistryObject<Gas> PURE_SULFURIC_ACID = GASES.register("pure_sulfuric_acid", () -> new Gas(GasBuilder.builder().color(new Color(150, 146, 59).getRGB())));
    public static final RegistryObject<Gas> BENZENE = GASES.register("benzene", () -> new Gas(GasBuilder.builder().color(new Color(200, 209, 176).getRGB())));
    public static final RegistryObject<Gas> BUTADIENE = GASES.register("butadiene", () -> new Gas(GasBuilder.builder().color(new Color(184, 209, 176).getRGB())));
    public static final RegistryObject<Gas> ABS = GASES.register("abs", () -> new Gas(GasBuilder.builder().color(new Color(196, 196, 196).getRGB())));
    public static final RegistryObject<Gas> ACRYLONITRILE = GASES.register("acrylonitrile", () -> new Gas(GasBuilder.builder().color(new Color(192, 209, 171).getRGB())));
    public static final RegistryObject<Gas> STYRENE = GASES.register("styrene", () -> new Gas(GasBuilder.builder().color(new Color(117, 122, 111).getRGB())));
    public static final RegistryObject<Gas> ETHYL_BENZENE = GASES.register("ethyl_benzene", () -> new Gas(GasBuilder.builder().color(new Color(170, 179, 159).getRGB())));
    public static final RegistryObject<Gas> TOLUENE = GASES.register("toluene", () -> new Gas(GasBuilder.builder().color(new Color(145, 117, 89).getRGB())));
    public static final RegistryObject<Gas> OCTANE = GASES.register("octane", () -> new Gas(GasBuilder.builder().color(new Color(151, 158, 125).getRGB())));
    public static final RegistryObject<Gas> BUTANE = GASES.register("butane", () -> new Gas(GasBuilder.builder().color(new Color(171, 128, 36).getRGB())));
    public static final RegistryObject<Gas> BUTENE = GASES.register("butene", () -> new Gas(GasBuilder.builder().color(new Color(209, 172, 92).getRGB())));
    public static final RegistryObject<Gas> PROPANE = GASES.register("propane", () -> new Gas(GasBuilder.builder().color(new Color(153, 150, 60).getRGB())));
    public static final RegistryObject<Gas> PROPENE = GASES.register("propene", () -> new Gas(GasBuilder.builder().color(new Color(212, 207, 59).getRGB())));
    public static final RegistryObject<Gas> ETBE = GASES.register("etbe", () -> new Gas(GasBuilder.builder().color(new Color(199, 194, 185).getRGB())));
    public static final RegistryObject<Gas> ISOPRENE = GASES.register("isoprene", () -> new Gas(GasBuilder.builder().color(new Color(56, 41, 34).getRGB())));
    public static final RegistryObject<Gas> BORIC_ACID = GASES.register("boric_acid", () -> new Gas(GasBuilder.builder().color(new Color(117, 100, 53).getRGB())));
    public static final RegistryObject<Gas> DIBORANE = GASES.register("diborane", () -> new Gas(GasBuilder.builder().color(new Color(148, 81, 109).getRGB())));
    public static final RegistryObject<Gas> PLASTIC_WASTE = GASES.register("plastic_waste", () -> new Gas(GasBuilder.builder().color(new Color(97, 70, 54).getRGB())));
    public static final RegistryObject<Gas> ACETYLENE = GASES.register("acetylene", () -> new Gas(GasBuilder.builder().color(new Color(191, 128, 164).getRGB())));
    public static final RegistryObject<Gas> HYDROGEN_CYANIDE = GASES.register("hydrogen_cyanide", () -> new Gas(GasBuilder.builder().color(new Color(114, 85, 161).getRGB())));
    public static final RegistryObject<Gas> HELIUM = GASES.register("helium", () -> new Gas(GasBuilder.builder().color(new Color(234, 217, 194).getRGB())));

    public static final RegistryObject<Gas> BORAX_SOLUTION = GASES.register("borax_solution", () -> new Gas(GasBuilder.builder().color(new Color(88, 113, 133).getRGB())));
    public static final RegistryObject<Gas> BN_SOLUTION = GASES.register("bn_solution", () -> new Gas(GasBuilder.builder().color(new Color(87, 109, 125).getRGB())));
    public static final RegistryObject<Gas> SF_SOLUTION = GASES.register("sf_solution", () -> new Gas(GasBuilder.builder().color(new Color(94, 123, 145).getRGB())));
    public static final RegistryObject<Gas> SH_SOLUTION = GASES.register("sh_solution", () -> new Gas(GasBuilder.builder().color(new Color(94, 123, 150).getRGB())));
    public static final RegistryObject<Gas> PF_SOLUTION = GASES.register("pf_solution", () -> new Gas(GasBuilder.builder().color(new Color(95, 120, 140).getRGB())));
    public static final RegistryObject<Gas> CS_SOLUTION = GASES.register("cs_solution", () -> new Gas(GasBuilder.builder().color(new Color(95, 120, 146).getRGB())));

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

    private static RegistryObject<Gas> register(String name, Color color) {
        return GASES.register(name.toLowerCase().replaceAll("\\s+", "_"), () -> new Gas(GasBuilder.builder().color(color.getRGB())));
    }

}