/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1921$class_4687
 *  net.minecraft.class_1921$class_4688
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package us.movy.moondlc.mixin.accessors;

import net.minecraft.class_1921;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1921.class_4687.class})
public interface MultiPhaseAccessor {
    @Accessor(value="phases")
    public class_1921.class_4688 getPhases();
}

