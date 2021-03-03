package fr.minemobs.superpackutils.utils;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
        RenderType solid = RenderType.getSolid();
        RenderType cutout = RenderType.getCutout();
        RenderType cutoutmipped = RenderType.getCutoutMipped();
        RenderType translucent = RenderType.getTranslucent();
        RenderType translucentmipped = RenderType.getTranslucentNoCrumbling();

        RenderTypeLookup.setRenderLayer(BlockInit.TINY_TORCH.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.WALL_TINY_TORCH.get(), cutout);
    }
}