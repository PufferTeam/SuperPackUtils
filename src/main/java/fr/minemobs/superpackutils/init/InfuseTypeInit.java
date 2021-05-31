package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.api.chemical.infuse.InfuseType;
import mekanism.api.chemical.infuse.InfuseTypeBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InfuseTypeInit {

    public static final DeferredRegister<InfuseType> INFUSE_TYPES = DeferredRegister.create(InfuseType.class, Main.MOD_ID);

    public static final RegistryObject<InfuseType> SOMETHING = register("someting", 0x6A07A4);

    /**
     * @param tint hexadecimal color
     */
    private static RegistryObject<InfuseType> register(String name, int tint) {
        return INFUSE_TYPES.register(name.toLowerCase(), () -> new InfuseType(InfuseTypeBuilder.builder().color(tint)));
    }
}
