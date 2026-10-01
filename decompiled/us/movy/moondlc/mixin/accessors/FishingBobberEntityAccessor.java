/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1536
 *  net.minecraft.class_2940
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_1536;
import net.minecraft.class_2940;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1536.class})
public interface FishingBobberEntityAccessor {
    @Accessor(value="CAUGHT_FISH")
    public static class_2940<Boolean> getCaughtFish() {
        throw new AssertionError();
    }
}

