/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_2680
 *  net.minecraft.class_702
 *  net.minecraft.class_703
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client.render;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_2680;
import net.minecraft.class_702;
import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.ttm;
import us.m0vy.moondlc.m0vyguard.sk;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_702.class})
public abstract class ParticleManagerMixin {
    @Inject(method={"addBlockBreakParticles(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAddBlockBreakParticles(class_2338 blockPos, class_2680 state, CallbackInfo info) {
        if (btd_2.bzf_2()) {
            return;
        }
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && optimization.sddh_2()) {
            info.cancel();
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals.rgha_2() && removals.sws_4().alh()) {
            info.cancel();
        }
    }

    @Inject(method={"addBlockBreakingParticles(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAddBlockBreakingParticles(class_2338 blockPos, class_2350 direction, CallbackInfo info) {
        if (btd_2.bzf_2()) {
            return;
        }
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && optimization.sddh_2()) {
            info.cancel();
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals.rgha_2() && removals.sws_4().alh()) {
            info.cancel();
        }
    }

    @Inject(method={"addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)Lnet/minecraft/client/particle/Particle;"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAddParticle(class_2394 parameters, double x, double y, double z, double velocityX, double velocityY, double velocityZ, CallbackInfoReturnable<class_703> cir) {
        if (btd_2.bzf_2()) {
            return;
        }
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && !optimization.sshk(parameters)) {
            cir.setReturnValue(null);
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals.rgha_2() && removals.azy_2().alh() && parameters.method_10295() == class_2398.field_11242) {
            cir.cancel();
        }
    }
}

