package fr.minemobs.superpackutils.objects.items.buckets;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;

import java.util.function.Supplier;

public class VinegarBucket extends BucketItem {

    public VinegarBucket(Supplier<? extends Fluid> supplier, Properties builder) {
        super(supplier, builder);
    }
}
