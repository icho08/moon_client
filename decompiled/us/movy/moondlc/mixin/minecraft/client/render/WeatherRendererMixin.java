/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_761
 *  net.minecraft.class_9909
 *  net.minecraft.class_9958
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.render;

import net.minecraft.class_243;
import net.minecraft.class_761;
import net.minecraft.class_9909;
import net.minecraft.class_9958;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.ttm;
import us.m0vy.moondlc.m0vyguard.sk;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_761.class})
public abstract class WeatherRendererMixin {
    @Inject(method={"renderWeather(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/util/math/Vec3d;FLnet/minecraft/client/render/Fog;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderWeather(class_9909 frameGraphBuilder, class_243 pos, float tickDelta, class_9958 fog, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && optimization.ans_2()) {
            ci.cancel();
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals.rgha_2() && removals.azy_2().alh()) {
            ci.cancel();
        }
    }
}

