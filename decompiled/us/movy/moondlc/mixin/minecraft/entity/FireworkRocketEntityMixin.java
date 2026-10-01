/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_1309
 *  net.minecraft.class_1671
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package us.movy.moondlc.mixin.minecraft.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_241;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import us.m0vy.moondlc.m0vyguard.btth;
import us.m0vy.moondlc.m0vyguard.bakh_2;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.byk;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.ddh_3;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.mn;
import us.m0vy.moondlc.m0vyguard.ny;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1671.class})
public abstract class FireworkRocketEntityMixin
implements tthy {
    @Shadow
    private class_1309 field_7616;

    @Redirect(method={"tick()V"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V"))
    private void redirectSetVelocity(class_1309 shooter, class_243 velocity) {
        if (shooter == null) {
            return;
        }
        class_1671 rocketEntity = (class_1671)this;
        bakh_2 event = new bakh_2(shooter, velocity, rocketEntity);
        Moondlc moondlc = Moondlc.getInstance();
        if (moondlc != null && moondlc.getEventManager() != null) {
            moondlc.getEventManager().azj_2(event);
        }
        shooter.method_18799(event.tghw());
    }

    @WrapOperation(method={"tick()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;")})
    private class_243 wrapGetRotationVector(class_1309 instance, Operation<class_243> original) {
        if (instance == FireworkRocketEntityMixin.mc.field_1724) {
            ny rotationHandler;
            bwk currentRotationPlan;
            kq rotationManager = kq.thzt_2();
            bwk bwk2 = currentRotationPlan = rotationManager != null ? rotationManager.jwj() : null;
            if (currentRotationPlan != null) {
                return rotationManager.hls_2().rrj();
            }
            Moondlc moondlc = Moondlc.getInstance();
            ny ny2 = rotationHandler = moondlc != null ? moondlc.getRotationHandler() : null;
            if (rotationHandler != null && rotationHandler.hzd_2() != btth.stha_3) {
                lb currentRotation = rotationHandler.dhdf();
                return class_243.method_1030((float)currentRotation.khdhd_2(), (float)currentRotation.sry());
            }
        }
        return (class_243)original.call(new Object[]{instance});
    }

    @ModifyArgs(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/util/math/Vec3d;add(DDD)Lnet/minecraft/util/math/Vec3d;", ordinal=0))
    private void hookExtendedFirework(Args args, @Local(ordinal=0) class_243 rotation, @Local(ordinal=1) class_243 velocity) {
        class_241 multiplier;
        if (this.field_7616 != tdhr.dhzn() || !this.field_7616.method_6128()) {
            return;
        }
        byk booster = (byk)Moondlc.getInstance().getModuleManager().dfr_2(byk.class);
        float donichka = 0.1f;
        float piska = 0.5f;
        if (booster != null && booster.rgha_2()) {
            multiplier = booster.adht(this.field_7616);
        } else {
            ddh_3 nitroFirework = ddh_3.sdhth();
            if (nitroFirework == null || !nitroFirework.rgha_2()) {
                return;
            }
            mn pair = nitroFirework.thshy.hnw();
            multiplier = new class_241(((Float)pair.thash_2()).floatValue(), ((Float)pair.tsa_3()).floatValue());
        }
        args.set(0, (Object)(rotation.field_1352 * (double)donichka + (rotation.field_1352 * (double)multiplier.field_1343 - velocity.field_1352) * (double)piska));
        args.set(1, (Object)(rotation.field_1351 * (double)donichka + (rotation.field_1351 * (double)multiplier.field_1342 - velocity.field_1351) * (double)piska));
        args.set(2, (Object)(rotation.field_1350 * (double)donichka + (rotation.field_1350 * (double)multiplier.field_1343 - velocity.field_1350) * (double)piska));
    }
}

