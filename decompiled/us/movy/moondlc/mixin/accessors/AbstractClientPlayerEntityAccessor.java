/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_640
 *  net.minecraft.class_742
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_640;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_742.class})
public interface AbstractClientPlayerEntityAccessor {
    @Invoker(value="getPlayerListEntry")
    public class_640 invokeGetPlayerListEntry();
}

