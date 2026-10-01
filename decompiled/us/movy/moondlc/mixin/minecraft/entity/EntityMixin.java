/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1297
 *  net.minecraft.class_2246
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bdhd_2;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.bsz_3;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bghh_2;
import us.m0vy.moondlc.m0vyguard.bqth;
import us.m0vy.moondlc.m0vyguard.bks;
import us.m0vy.moondlc.m0vyguard.bnsh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.thd_2;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.dhd_6;
import us.m0vy.moondlc.m0vyguard.sk;
import us.m0vy.moondlc.m0vyguard.my;
import us.m0vy.moondlc.m0vyguard.ny;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.EntityAccessor;

@Mixin(value={class_1297.class})
public class EntityMixin
implements tthy {
    @Inject(method={"getTargetingMargin"}, at={@At(value="RETURN")}, cancellable=true)
    private void Moondlc$expandTargetingMargin(CallbackInfoReturnable<Float> cir) {
        bsz_3 hitbox = bsz_3.skhy();
        if (hitbox != null && hitbox.rgha_2()) {
            cir.setReturnValue((Object)Float.valueOf(((Float)cir.getReturnValue()).floatValue() + hitbox.shjn((class_1297)this)));
        }
    }

    @ModifyExpressionValue(method={"move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;isControlledByPlayer()Z")})
    public boolean fixFalldistanceValue(boolean original) {
        return this == EntityMixin.mc.field_1724 ? false : original;
    }

    @Redirect(method={"updateVelocity(FLnet/minecraft/util/math/Vec3d;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;getYaw()F"))
    public float movementCorrection(class_1297 instance) {
        if (!(instance instanceof class_746)) {
            return instance.method_36454();
        }
        if (btj_2.dhsw_2 != null && btj_2.dhsw_2.length >= 1) {
            return btj_2.dhsw_2[0];
        }
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        if (rotationHandler == null || rotationHandler.smf()) {
            return instance.method_36454();
        }
        my currentTask = rotationHandler.tkhm();
        if (currentTask != null && currentTask.dhthd() == bnsh.sta) {
            return instance.method_36454();
        }
        tkhdh aura = tkhdh.zkhr_2();
        if (aura != null && aura.rgha_2() && aura.saa_6.skhth(aura.jddh)) {
            return instance.method_36454();
        }
        return rotationHandler.dhdf().sry();
    }

    @Redirect(method={"updateVelocity"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;movementInputToVelocity(Lnet/minecraft/util/math/Vec3d;FF)Lnet/minecraft/util/math/Vec3d;"))
    public class_243 updateVelocityHook(class_243 movementInput, float speed, float yaw) {
        if (this == EntityMixin.mc.field_1724) {
            dhd_6 event = new dhd_6(movementInput, speed, yaw, EntityAccessor.callMovementInputToVelocity(movementInput, speed, yaw));
            bghh_2.ha_4().zkhh(event);
            return event.dzj_3();
        }
        return EntityAccessor.callMovementInputToVelocity(movementInput, speed, yaw);
    }

    @Inject(method={"slowMovement(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/Vec3d;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void ignoreCobwebSlowdown(class_2680 state, class_243 multiplier, CallbackInfo ci) {
        if (this != EntityMixin.mc.field_1724) {
            return;
        }
        bqth noWeb = bqth.twkh();
        if (noWeb != null && noWeb.rgha_2() && noWeb.ghbk() && state.method_27852(class_2246.field_10343)) {
            ci.cancel();
        }
    }

    @Inject(method={"changeLookDirection"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$freeLookCameraRotation(double cursorDeltaX, double cursorDeltaY, CallbackInfo ci) {
        if (this != EntityMixin.mc.field_1724) {
            return;
        }
        bks freeLook = bks.sla_3();
        if (freeLook == null || !freeLook.rgha_2()) {
            return;
        }
        freeLook.das_2(cursorDeltaX, cursorDeltaY);
        ci.cancel();
    }

    @Inject(method={"canHit"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapCanHit(CallbackInfoReturnable<Boolean> cir) {
        if (EntityMixin.shouldHideEntity((class_1297)this)) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"isCollidable"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapCollidable(CallbackInfoReturnable<Boolean> cir) {
        if (EntityMixin.shouldHideEntity((class_1297)this)) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"isPushable"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapPushable(CallbackInfoReturnable<Boolean> cir) {
        if (EntityMixin.shouldHideEntity((class_1297)this)) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"isAttackable"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapAttackable(CallbackInfoReturnable<Boolean> cir) {
        if (EntityMixin.shouldHideEntity((class_1297)this)) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"collidesWith"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapCollidesWith(class_1297 other, CallbackInfoReturnable<Boolean> cir) {
        if (EntityMixin.shouldHideEntity((class_1297)this) || EntityMixin.shouldHideEntity(other)) {
            cir.setReturnValue((Object)false);
        }
    }

    @ModifyExpressionValue(method={"updateMovementInFluid"}, at={@At(value="INVOKE", target="Lnet/minecraft/fluid/FluidState;getVelocity(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;")})
    private class_243 noPushInLiquidsHook(class_243 original) {
        if (this != EntityMixin.mc.field_1724) {
            return original;
        }
        return original;
    }

    @Inject(method={"isGlowing"}, at={@At(value="HEAD")}, cancellable=true)
    public void cancelGlowingHook(CallbackInfoReturnable<Boolean> cir) {
        class_1297 entity = (class_1297)this;
        thd_2 outlines = thd_2.zlw();
        if (outlines != null && outlines.rgha_2() && outlines.szt_2(entity)) {
            cir.setReturnValue((Object)true);
            return;
        }
        sk removals = sk.thash();
        if (removals != null && removals.amth()) {
            cir.setReturnValue((Object)false);
        }
    }

    private static boolean shouldHideEntity(class_1297 entity) {
        brj antiTrap = brj.dhqf();
        return antiTrap != null && antiTrap.hth_3(entity);
    }

    @Inject(method={"getCameraPosVec"}, at={@At(value="HEAD")}, cancellable=true)
    private void freeCam$getCameraPosVec(float tickDelta, CallbackInfoReturnable<class_243> cir) {
        if (this != EntityMixin.mc.field_1724) {
            return;
        }
        bdhd_2 freeCam = bdhd_2.bfz();
        if (freeCam != null && freeCam.rgha_2() && freeCam.rlr()) {
            cir.setReturnValue((Object)new class_243(freeCam.rthh_2(), freeCam.thkht_2(), freeCam.bhn_2()));
        }
    }
}

