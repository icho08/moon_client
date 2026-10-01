/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.sugar.Local
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3966
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_7833
 *  net.minecraft.class_9779
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client.gui.screen;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1297;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.btsh;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bdf;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.bsa_3;
import us.m0vy.moondlc.m0vyguard.bsh_5;
import us.m0vy.moondlc.m0vyguard.byz_2;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.ttm;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.jdh_3;
import us.m0vy.moondlc.m0vyguard.rj;
import us.m0vy.moondlc.m0vyguard.sk;
import us.m0vy.moondlc.m0vyguard.sm_2;
import us.m0vy.moondlc.m0vyguard.qh_2;
import us.m0vy.moondlc.m0vyguard.kq;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_757.class})
public abstract class GameRendererMixin {
    @Shadow
    private float field_4005;
    @Shadow
    private float field_3988;
    @Shadow
    private float field_4004;

    @Shadow
    public abstract float method_32796();

    @ModifyExpressionValue(method={"findCrosshairTarget"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/projectile/ProjectileUtil;raycast(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Box;Ljava/util/function/Predicate;D)Lnet/minecraft/util/hit/EntityHitResult;")})
    private class_3966 traceEntityHook(class_3966 original, class_1297 camera, double blockInteractionRange, double entityInteractionRange, float tickDelta) {
        if (original == null || original.method_17782() == null || tdhr.dhzn() == null) {
            return original;
        }
        sm_2 noEntityTrace = sm_2.zjh_2();
        if (noEntityTrace != null && noEntityTrace.thz_7(original.method_17782())) {
            return null;
        }
        brj antiTrap = brj.dhqf();
        if (antiTrap != null && antiTrap.hth_3(original.method_17782())) {
            return null;
        }
        return original;
    }

    @ModifyExpressionValue(method={"findCrosshairTarget"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;getRotationVec(F)Lnet/minecraft/util/math/Vec3d;")})
    private class_243 rotationVectorHook(class_243 original, class_1297 camera, double blockInteractionRange, double entityInteractionRange, float tickDelta) {
        if (camera != tdhr.dhzn()) {
            return original;
        }
        taj rotation = kq.thzt_2().tthw();
        return rotation != null ? rotation.rrj() : original;
    }

    @ModifyExpressionValue(method={"findCrosshairTarget"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;raycast(DFZ)Lnet/minecraft/util/hit/HitResult;")})
    private class_239 hookRaycast(class_239 original, class_1297 camera, double blockInteractionRange, double entityInteractionRange, float tickDelta) {
        if (camera != tdhr.dhzn()) {
            return original;
        }
        taj cameraRotation = new taj(camera.method_5705(tickDelta), camera.method_5695(tickDelta));
        taj rotation = kq.thzt_2().tthw() != null ? kq.thzt_2().tthw() : cameraRotation;
        return rj.sml(rotation, Math.max(blockInteractionRange, entityInteractionRange), false, tickDelta);
    }

    @Inject(method={"renderWorld(Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="INVOKE_STRING", target="Lnet/minecraft/util/profiler/Profiler;swap(Ljava/lang/String;)V", args={"ldc=hand"})})
    private void onRenderWorld(class_9779 tickCounter, CallbackInfo ci, @Local(ordinal=0) Matrix4f projection, @Local(ordinal=2) Matrix4f view, @Local(ordinal=1) float tickDelta, @Local class_4587 matrices) {
        btsh.jqq(view, projection);
    }

    @Inject(method={"renderWorld"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/GameRenderer;renderHand:Z", opcode=180, ordinal=0)})
    void render3D(class_9779 renderTickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (tdhr.dhzn() == null || class_310.method_1551().field_1687 == null) {
            return;
        }
        class_4587 matrixStack = new class_4587();
        class_4184 camera = class_310.method_1551().field_1773.method_19418();
        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().identity();
        matrixStack.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
        matrixStack.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
        bdf.btdh_2(matrixStack);
        RenderSystem.getModelViewStack().popMatrix();
    }

    @Inject(method={"renderWorld(Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V", shift=At.Shift.BEFORE)})
    private void captureItemShaderScene(class_9779 renderTickCounter, CallbackInfo ci) {
        qh_2 viewModel;
        jdh_3 itemChams;
        if (btd_2.bzf_2()) {
            return;
        }
        bsh_5 echoHand = bsh_5.bshs_2();
        if (echoHand != null && echoHand.hyh_2()) {
            echoHand.dshj();
        }
        if ((itemChams = jdh_3.jsht()) != null && itemChams.dnkh_2()) {
            itemChams.dz_2();
        }
        if ((viewModel = qh_2.dhdz()) != null && viewModel.tkhd()) {
            viewModel.zbf_2();
        }
    }

    @Inject(method={"renderWorld(Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V", shift=At.Shift.AFTER)})
    private void applyItemShader(class_9779 renderTickCounter, CallbackInfo ci) {
        qh_2 viewModel;
        bsh_5 echoHand;
        if (btd_2.bzf_2()) {
            return;
        }
        jdh_3 itemChams = jdh_3.jsht();
        if (itemChams != null && itemChams.dnkh_2()) {
            itemChams.raz_2();
        }
        if ((echoHand = bsh_5.bshs_2()) != null && echoHand.hyh_2()) {
            echoHand.tk();
        }
        if ((viewModel = qh_2.dhdz()) != null && viewModel.tkhd()) {
            viewModel.khghd();
        }
    }

    @Inject(method={"tiltViewWhenHurt(Lnet/minecraft/client/util/math/MatrixStack;F)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void tiltViewWhenHurtHook(class_4587 matrices, float tickDelta, CallbackInfo ci) {
        boolean oldBaseCancel;
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = Moondlc.getInstance().getModuleManager() == null ? null : (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        boolean removalsCancel = removals != null && removals.rgha_2() && removals.thtz_2().alh();
        sk removalsInstance = sk.thash();
        byz_2 noHurtCam = byz_2.khss();
        boolean bl = oldBaseCancel = removalsInstance != null && removalsInstance.rzs_2() || noHurtCam != null && noHurtCam.rgha_2();
        if (removalsCancel || oldBaseCancel) {
            ci.cancel();
        }
    }

    @Redirect(method={"renderWorld(Lnet/minecraft/client/render/RenderTickCounter;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/util/math/MathHelper;lerp(FFF)F"))
    private float renderWorldHook(float delta, float first, float second) {
        sk removals;
        if (class_310.method_1551().field_1724 == null) {
            return 0.0f;
        }
        if (btd_2.bzf_2()) {
            return class_3532.method_16439((float)delta, (float)first, (float)second);
        }
        sk removalsInstance = sk.thash();
        if (removalsInstance != null && removalsInstance.dhnw()) {
            return 0.0f;
        }
        sk sk2 = removals = Moondlc.getInstance().getModuleManager() == null ? null : (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.rgha_2() && removals.zys().alh()) {
            return 0.0f;
        }
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && optimization.ths_7()) {
            return 0.0f;
        }
        return class_3532.method_16439((float)delta, (float)first, (float)second);
    }

    @Inject(method={"getBasicProjectionMatrix"}, at={@At(value="TAIL")}, cancellable=true)
    private void getBasicProjectionMatrixHook(float fov, CallbackInfoReturnable<Matrix4f> cir) {
        if (btd_2.bzf_2()) {
            return;
        }
        float customRatio = -1.0f;
        bsa_3 aspectRatio = (bsa_3)Moondlc.getInstance().getModuleManager().dfr_2(bsa_3.class);
        if (aspectRatio != null && aspectRatio.rgha_2()) {
            customRatio = aspectRatio.zba_3();
        } else if (bsa_3.zmd_2() != null && bsa_3.zmd_2().rgha_2()) {
            String mode;
            switch (mode = bsa_3.zmd_2().dham.sdh_2().getName()) {
                case "4:3": {
                    customRatio = 1.3333334f;
                    break;
                }
                case "16:9": {
                    customRatio = 1.7777778f;
                    break;
                }
                case "1:1": {
                    customRatio = 1.0f;
                    break;
                }
                case "16:10": {
                    customRatio = 1.6f;
                    break;
                }
                case "Custom": {
                    customRatio = bsa_3.zmd_2().rrz_2.hkj();
                }
            }
        }
        if (customRatio > 0.0f) {
            Matrix4f matrix4f = new Matrix4f();
            if (this.field_4005 != 1.0f) {
                matrix4f.translate(this.field_3988, -this.field_4004, 0.0f);
                matrix4f.scale(this.field_4005, this.field_4005, 1.0f);
            }
            matrix4f.perspective((float)((double)fov * 0.017453292), customRatio, 0.05f, this.method_32796());
            cir.setReturnValue((Object)matrix4f);
        }
    }
}

