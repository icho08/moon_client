/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_276
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_276;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_276.class})
public interface FramebufferAccessor {
    @Accessor(value="depthAttachment")
    public int getDepthAttachment();

    @Accessor(value="depthAttachment")
    public void setDepthAttachment(int var1);
}

