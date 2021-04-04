package fr.minemobs.superpackutils.data.client;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.BlockInit;
import fr.minemobs.superpackutils.init.FluidInit;
import fr.minemobs.superpackutils.init.ItemInit;
import fr.minemobs.superpackutils.objects.items.TinyTorchItem;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen) {
        super(gen, Main.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlocks();
        addItems();
        addFluids();
        addOthers();
    }

    private void addFluids() {
        for (RegistryObject<Fluid> entry : FluidInit.FLUIDS.getEntries()) {
            String registryName = entry.get().getRegistryName().toString();
            add("fluid", registryName.replace("superpackutils:", ""), capitalizeWord(registryName));
        }
    }

    private void addOthers() {
        add("itemGroup." + Main.MOD_ID, "Superpack: Utils");

        add("tooltip", "shift", "HOLD\u00A7e SHIFT\u00A77 for more informations!");
        add("tooltip", "redstoneclock", "This clock emits a signal every 3 seconds during 0,5 second.");
    }

    private void addBlocks() {
        for (RegistryObject<Block> entry : BlockInit.BLOCKS.getEntries()) {
            addBlock(entry, capitalizeWord(entry.get().getRegistryName().toString()));
        }
    }

    private void addItems(){
        for (RegistryObject<Item> entry : ItemInit.ITEMS.getEntries().stream().filter(itemRegistryObject -> !(itemRegistryObject.get() instanceof TinyTorchItem)).collect(Collectors.toList())) {
            addItem(entry, capitalizeWord(entry.get().getRegistryName().toString()));
        }
    }

    public static String capitalizeWord(String str){
        String str1 = str.replace("superpackutils:", "").replaceAll("_", " ");
        String[] words = str1.split("\\s");
        StringBuilder capitalizeWord = new StringBuilder();
        for(String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord.append(first.toUpperCase()).append(afterfirst).append(" ");
        }
        return capitalizeWord.toString().trim();
    }

    private void add(final String category, final String subKey, final String value) {
        add(category + "." + Main.MOD_ID + "." + subKey, value);
    }
}
