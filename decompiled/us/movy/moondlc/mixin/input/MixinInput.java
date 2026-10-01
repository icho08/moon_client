/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10185
 *  net.minecraft.class_744
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package us.movy.moondlc.mixin.input;

import net.minecraft.class_10185;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import us.m0vy.moondlc.m0vyguard.zz_3;

@Mixin(value={class_744.class})
public abstract class MixinInput
implements zz_3 {
    @Unique
    protected class_10185 untransformed = class_10185.field_54098;

    @Override
    public class_10185 zlt_4() {
        return this.untransformed;
    }
}

