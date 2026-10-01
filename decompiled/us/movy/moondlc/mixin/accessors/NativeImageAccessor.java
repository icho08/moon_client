/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_1011;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1011.class})
public interface NativeImageAccessor {
    @Accessor(value="pointer")
    public long getPointer();

    @Invoker(value="setColor")
    public void invokeSetColor(int var1, int var2, int var3);

    @Invoker(value="getColor")
    public int invokeGetColor(int var1, int var2);
}

