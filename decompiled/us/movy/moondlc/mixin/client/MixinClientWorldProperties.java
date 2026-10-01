/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.class_638$class_5271
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.zb_2;

@Mixin(value={class_638.class_5271.class})
public class MixinClientWorldProperties {
    @ModifyReturnValue(method={"getTimeOfDay"}, at={@At(value="RETURN")})
    private long getTimeOfDay(long original) {
        return zb_2.zbw_2().jghk(original);
    }
}

