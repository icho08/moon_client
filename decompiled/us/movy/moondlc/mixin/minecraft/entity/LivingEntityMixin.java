/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.Nk;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bghq;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.thj;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.trb;
import us.m0vy.moondlc.m0vyguard.tsq;
import us.m0vy.moondlc.m0vyguard.tl_2;
import us.m0vy.moondlc.m0vyguard.kz;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yd_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1309.class})
public abstract class LivingEntityMixin {
    @Shadow
    private int field_6228;

    @Shadow
    public abstract void method_5650(class_1297.class_5529 var1);

    @Shadow
    public abstract class_1799 method_6047();

    @Shadow
    public abstract boolean method_6128();

    @ModifyReturnValue(method={"getHandSwingDuration()I"}, at={@At(value="RETURN")})
    public int replaceSwingSpeed(int original) {
        kz swingAnim = kz.shdsh();
        if (swingAnim != null && swingAnim.rgha_2() && swingAnim.rda_4.shzl()) {
            return (int)swingAnim.zmz_2.hkj();
        }
        return original;
    }

    @Inject(method={"jump()V"}, at={@At(value="HEAD")}, cancellable=true)
    public void triggerJumpEvent(CallbackInfo ci) {
        class_1309 livingEntity = (class_1309)this;
        trb event = new trb(livingEntity);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            ci.cancel();
        }
    }

    @Inject(method={"jump"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getJumpVelocity()F")})
    public void onJumping(CallbackInfo ci) {
        if (this != tdhr.dhzn()) {
            return;
        }
        tsq.ghdhz().jqy();
    }

    @ModifyExpressionValue(method={"jump()V"}, at={@At(value="NEW", target="(DDD)Lnet/minecraft/util/math/Vec3d;")})
    public class_243 movementCorrection(class_243 original) {
        if (this != class_310.method_1551().field_1724) {
            return original;
        }
        class_746 player = class_310.method_1551().field_1724;
        if (player == null) {
            return original;
        }
        if (btj_2.dhsw_2 != null && btj_2.dhsw_2.length >= 1) {
            float yaw = btj_2.dhsw_2[0] * ((float)Math.PI / 180);
            return new class_243((double)(-class_3532.method_15374((float)yaw) * 0.2f), 0.0, (double)(class_3532.method_15362((float)yaw) * 0.2f));
        }
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        if (rotationHandler != null && !rotationHandler.smf()) {
            float yaw = rotationHandler.dhdf().sry() * ((float)Math.PI / 180);
            return new class_243((double)(-class_3532.method_15374((float)yaw) * 0.2f), 0.0, (double)(class_3532.method_15362((float)yaw) * 0.2f));
        }
        return original;
    }

    @ModifyExpressionValue(method={"jump"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getYaw()F")})
    public float fixJumpVelocity(float original) {
        return original;
    }

    @Inject(method={"tickMovement()V"}, at={@At(value="HEAD")})
    public void removeJumpDelay(CallbackInfo ci) {
        Nk noDelay = (Nk)Moondlc.getInstance().getModuleManager().dfr_2(Nk.class);
        if (noDelay != null && noDelay.rgha_2() && noDelay.nbL().shzl()) {
            this.field_6228 = Math.min(this.field_6228, noDelay.nbf());
        }
    }

    @Inject(method={"pushAwayFrom"}, at={@At(value="HEAD")}, cancellable=true)
    private void noPushHookByEntity(CallbackInfo ci) {
        if (yd_2.ghtd_4() != null && yd_2.ghtd_4().rgha_2() && yd_2.ghtd_4().zhd_8().alh()) {
            ci.cancel();
        }
    }

    @Inject(method={"isPushable()Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void removePushFromEntity(CallbackInfoReturnable<Boolean> cir) {
        yd_2 noPush = (yd_2)Moondlc.getInstance().getModuleManager().dfr_2(yd_2.class);
        class_1309 entity = (class_1309)this;
        if (entity instanceof class_746 && noPush != null && noPush.rgha_2() && noPush.zhd_8().alh()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"onDeath"}, at={@At(value="HEAD")})
    private void onEntityDeath(class_1282 source, CallbackInfo ci) {
        class_1309 self = (class_1309)this;
        tl_2.ddb_2().zkhh(new thj(self, source));
    }

    @Inject(method={"onDeath(Lnet/minecraft/entity/damage/DamageSource;)V"}, at={@At(value="TAIL")})
    public void triggerEntityDeathEvent(class_1282 damageSource, CallbackInfo ci) {
        class_1309 entity = (class_1309)this;
        Moondlc.getInstance().getEventManager().azj_2(new bghq(entity, damageSource));
    }

    @Redirect(method={"calcGlidingVelocity(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getPitch()F"))
    private float redirectGetPitch(class_1309 instance) {
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        if (rotationHandler != null && !rotationHandler.smf()) {
            return rotationHandler.dhdf().khdhd_2();
        }
        if (this == tdhr.dhzn()) {
            kq rotationManager = kq.thzt_2();
            taj rotation = rotationManager.hls_2();
            bwk currentRotationPlan = rotationManager.jwj();
            if (currentRotationPlan != null && currentRotationPlan.khbh()) {
                return rotation.shyq();
            }
        }
        return instance.method_36455();
    }

    @Redirect(method={"calcGlidingVelocity(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"))
    private class_243 redirectGetRotationVector(class_1309 instance) {
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        if (rotationHandler != null && !rotationHandler.smf()) {
            return rotationHandler.dhdf().tshd_2();
        }
        if (this == tdhr.dhzn()) {
            kq rotationManager = kq.thzt_2();
            taj rotation = rotationManager.hls_2();
            bwk currentRotationPlan = rotationManager.jwj();
            if (currentRotationPlan != null && currentRotationPlan.khbh()) {
                return rotation.rrj();
            }
        }
        return instance.method_5720();
    }
}

