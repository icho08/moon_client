/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_5498
 *  net.minecraft.class_757
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_5498;
import net.minecraft.class_757;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.bdhd_2;
import us.m0vy.moondlc.m0vyguard.bks;

@Mixin(value={class_757.class})
public class MixinPerspectiveOverride {
    @ModifyExpressionValue(method={"renderWorld"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/GameOptions;getPerspective()Lnet/minecraft/client/option/Perspective;")})
    private class_5498 overridePerspective(class_5498 original) {
        bdhd_2 freeCam = bdhd_2.bfz();
        if (freeCam != null && freeCam.rgha_2()) {
            return class_5498.field_26664;
        }
        bks freeLook = bks.sla_3();
        if (freeLook != null && freeLook.rgha_2()) {
            if (freeLook.ztm_2()) {
                return class_5498.field_26666;
            }
            return class_5498.field_26665;
        }
        return original;
    }
}

