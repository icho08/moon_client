/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_1297
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_6854
 *  net.minecraft.class_758
 *  net.minecraft.class_758$class_4596
 *  net.minecraft.class_9958
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client.gui.overlay;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_1297;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_6854;
import net.minecraft.class_758;
import net.minecraft.class_9958;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.thl;
import us.m0vy.moondlc.m0vyguard.sk;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_758.class})
public class BackgroundRendererMixin {
    @Inject(method={"getFogModifier(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/client/render/BackgroundRenderer$StatusEffectFogModifier;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onGetFogModifier(class_1297 entity, float tickDelta, CallbackInfoReturnable<Object> info) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.rgha_2() && (removals.ssh_6().alh() || removals.dhnw())) {
            info.setReturnValue(null);
        }
    }

    @ModifyReturnValue(method={"applyFog(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/BackgroundRenderer$FogType;Lorg/joml/Vector4f;FZF)Lnet/minecraft/client/render/Fog;"}, at={@At(value="RETURN")})
    private static class_9958 modifyFogProperties(class_9958 original, @Local(argsOnly=true) class_4184 camera, @Local(argsOnly=true) class_758.class_4596 fogType, @Local(argsOnly=true, ordinal=0) float viewDistance) {
        if (btd_2.bzf_2()) {
            return original;
        }
        thl customFogModule = (thl)Moondlc.getInstance().getModuleManager().dfr_2(thl.class);
        if (customFogModule != null && customFogModule.rgha_2() && customFogModule.skhz_2(camera) && fogType == class_758.class_4596.field_20946) {
            float start = class_3532.method_15363((float)customFogModule.zhn_4().hht(), (float)-8.0f, (float)viewDistance);
            float end = class_3532.method_15363((float)customFogModule.zhn_4().awt_2(), (float)0.0f, (float)viewDistance);
            class_6854 shape = class_6854.field_36350;
            float r = original.comp_3012();
            float g = original.comp_3013();
            float b = original.comp_3014();
            float a = original.comp_3015();
            if (customFogModule.say().shzl()) {
                byq color = customFogModule.ghshsh();
                r = color.sbk() / 255.0f;
                g = color.srl() / 255.0f;
                b = color.shsl_2() / 255.0f;
                a = color.tzdh_2() / 255.0f;
            }
            return new class_9958(start, end, shape, r, g, b, a);
        }
        return original;
    }
}

