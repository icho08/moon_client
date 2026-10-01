/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_465
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_465.class})
public interface HandledScreenAccessor {
    @Accessor(value="x")
    public int getX();

    @Accessor(value="y")
    public int getY();

    @Accessor(value="backgroundHeight")
    public int getBackgroundHeight();
}

