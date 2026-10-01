/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2743
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_2743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2743.class})
public interface EntityVelocityUpdateAccessor {
    @Mutable
    @Accessor(value="velocityX")
    public void setVelocityX(int var1);

    @Mutable
    @Accessor(value="velocityY")
    public void setVelocityY(int var1);

    @Mutable
    @Accessor(value="velocityZ")
    public void setVelocityZ(int var1);
}

