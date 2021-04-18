package fr.minemobs.superpackutils.data;

import fr.minemobs.superpackutils.Main;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public abstract class TextureProvider implements IDataProvider {

    protected static final Logger LOGGER = LogManager.getLogger();
    protected final Map<File, BufferedImage> textures = new HashMap<>();
    public final String modId = Main.MOD_ID;
    protected final DataGenerator gen;

    public TextureProvider(DataGenerator dataGenerator){
        gen = dataGenerator;
    }

    public abstract void registerTextures() throws IOException;

    @Override
    public void act(DirectoryCache cache) throws IOException {
        registerTextures();
        generateTextures();
    }

    private void createFolders(Path outputDirBlock, Path outputDirItem) throws IOException {
        Files.createDirectories(outputDirBlock);
        Files.createDirectories(outputDirItem);
    }

    private void generateTextures() throws IOException {
        if(!new File(this.gen.getOutputFolder().toUri()).exists()) new File(this.gen.getOutputFolder().toUri()).mkdirs();
        Path outputDirBlock = this.gen.getOutputFolder().resolve("assets/" + modId + "/textures/block/");
        Path outputDirItem = this.gen.getOutputFolder().resolve("assets/" + modId + "/textures/item/");
        if(!Files.exists(outputDirBlock) || !Files.exists(outputDirItem)) createFolders(outputDirBlock, outputDirItem);
        textures.forEach((texture, placeholder) -> {
            try{
                final boolean created = texture.createNewFile();
                if (!created) LOGGER.warn("File with path " + texture.getPath() + " was not created.");
                ImageIO.write(placeholder, "png", texture);
            }catch (IOException ex){
                LOGGER.error(ex.getMessage());
            }
        });
    }

    @Override
    public String getName() {
        return "Textures: " + this.modId;
    }

    protected File modLoc(String name) {
        return new File("../src/main/resources/assets/" + modId + "/textures/" + name + ".png");
    }

    protected File genLoc(String name) {
        return new File("../src/generated/resources/assets/" + modId + "/textures/" + name + ".png");
    }

    protected BufferedImage getTexture(File img) throws IOException {
        return ImageIO.read(img);
    }
}
