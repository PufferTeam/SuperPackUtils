package fr.minemobs.superpackutils.world;

import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class WorldFunctions {

    public static World getWorldIfIsNotRemote(IWorld iworld) {
        if (iworld.isRemote()) return null;
        if (iworld instanceof World) return (World)iworld;
        return null;
    }

}
