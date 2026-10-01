/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1309.class})
public interface LivingEntityAccessor {
    @Accessor(value="jumpingCooldown")
    public void setJumpingCooldown(int var1);

    @Accessor(value="lastAttackedTicks")
    public int getLastAttackedTicks();
}

