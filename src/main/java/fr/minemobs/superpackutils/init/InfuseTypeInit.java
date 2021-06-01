package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.api.chemical.infuse.InfuseType;
import mekanism.api.chemical.infuse.InfuseTypeBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InfuseTypeInit {

    public static final DeferredRegister<InfuseType> INFUSE_TYPES = DeferredRegister.create(InfuseType.class, Main.MOD_ID);

    public static final RegistryObject<InfuseType> ALCHEMICAL_NICKEL = register("alchemical_nickel", 0xB2AC66);
    public static final RegistryObject<InfuseType> ALCHEMICAL_IRON = register("alchemical_iron", 0xD6CBA9);
    public static final RegistryObject<InfuseType> ALCHEMICAL_GOLD = register("alchemical_gold", 0xFFFF00);
    public static final RegistryObject<InfuseType> ALCHEMICAL_TIN = register("alchemical_tin", 0xAEDBD7);
    public static final RegistryObject<InfuseType> ALCHEMICAL_COPPER = register("alchemical_copper", 0xD9813B);
    public static final RegistryObject<InfuseType> ALCHEMICAL_PLATINUM = register("alchemical_platinum", 0x00E9FF);
    public static final RegistryObject<InfuseType> ALCHEMICAL_LEAD = register("alchemical_lead", 0x3E6B89);
    public static final RegistryObject<InfuseType> ALCHEMICAL_SILVER = register("alchemical_silver", 0x92B7AC);
    public static final RegistryObject<InfuseType> ALCHEMICAL_OSMIUM = register("alchemical_osmium", 0xB0EDFF);
    public static final RegistryObject<InfuseType> ALCHEMICAL_URANIUM = register("alchemical_uranium", 0x43D655);
    public static final RegistryObject<InfuseType> ALCHEMICAL_ALUMINUM = register("alchemical_aluminum", 0xBF7699);
    public static final RegistryObject<InfuseType> ALCHEMICAL_ZINC = register("alchemical_zinc", 0xC3C3C3);

    /**
     * @param tint hexadecimal color
     */
    private static RegistryObject<InfuseType> register(String name, int tint) {
        return INFUSE_TYPES.register(name.toLowerCase(), () -> new InfuseType(InfuseTypeBuilder.builder().color(tint)));
    }
}
