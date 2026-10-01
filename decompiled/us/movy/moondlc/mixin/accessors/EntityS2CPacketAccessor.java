/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2684
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_2684;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2684.class})
public interface EntityS2CPacketAccessor {
    @Accessor(value="id")
    public int getId();
}

