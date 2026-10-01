/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_266
 *  net.minecraft.class_269
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_355
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.render;

import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_355;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.m0vy.moondlc.m0vyguard.sh_3;
import us.m0vy.moondlc.m0vyguard.ms_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_355.class})
public class MixinPlayerListHud {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderPre(class_332 context, int scaledWindowWidth, class_269 scoreboard, class_266 objective, CallbackInfo ci) {
        if (this.Moondlc$shouldHandleAnimatedPlayerList() && !ms_2.khtkh_2()) {
            ci.cancel();
            return;
        }
        float ease = this.Moondlc$getPlayerListEase();
        if (ease > 0.0f) {
            int screenHeight = class_310.method_1551().method_22683().method_4502();
            context.method_51448().method_22903();
            context.method_51448().method_46416(0.0f, (float)(-screenHeight) * (1.0f - ease), 0.0f);
        }
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void onRenderPost(class_332 context, int scaledWindowWidth, class_269 scoreboard, class_266 objective, CallbackInfo ci) {
        if (this.Moondlc$getPlayerListEase() > 0.0f) {
            context.method_51448().method_22909();
        }
    }

    @Unique
    private float Moondlc$getPlayerListEase() {
        if (sh_3.snn_2() != null && sh_3.snn_2().rgha_2()) {
            return (float)sh_3.snn_2().shzs().khbk();
        }
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation != null) {
            return animation.hzm();
        }
        return 0.0f;
    }

    @Unique
    private boolean Moondlc$shouldHandleAnimatedPlayerList() {
        sh_3 smoothTabModule = sh_3.snn_2();
        if (smoothTabModule != null && smoothTabModule.rgha_2()) {
            return true;
        }
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        return animation != null && animation.rgha_2() && animation.rhk();
    }
}

