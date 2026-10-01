/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1922
 *  net.minecraft.class_4184
 *  net.minecraft.class_5636
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package us.movy.moondlc.mixin.minecraft.client.gui.overlay;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1922;
import net.minecraft.class_4184;
import net.minecraft.class_5636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import us.m0vy.moondlc.m0vyguard.bhz;
import us.m0vy.moondlc.m0vyguard.bdhd_2;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.m0vy.moondlc.m0vyguard.bks;
import us.m0vy.moondlc.m0vyguard.bkh_3;
import us.m0vy.moondlc.m0vyguard.bwdh;
import us.m0vy.moondlc.m0vyguard.sk;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_4184.class})
public abstract class CameraMixin {
    @Unique
    private boolean initialized = false;
    @Shadow
    private boolean field_18719;
    @Shadow
    private float field_47549;

    @Shadow
    protected abstract void method_19325(float var1, float var2);

    @Shadow
    protected abstract float method_19318(float var1);

    @Shadow
    protected abstract void method_19324(float var1, float var2, float var3);

    @Inject(method={"update"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setRotation(FF)V", shift=At.Shift.AFTER)})
    private void onUpdate(CallbackInfo ci) {
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setRotation(FF)V"))
    private void setRotationHook(Args args, class_1922 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta) {
        bdhd_2 freeCam;
        bks freeLook;
        bhz f5Controller = bhz.zshdh();
        if (f5Controller != null && f5Controller.bghdh(thirdPerson)) {
            float yaw = f5Controller.zqs(tickDelta);
            float pitch = f5Controller.zsj_2(tickDelta);
            if (inverseView) {
                yaw += 180.0f;
                pitch = -pitch;
            }
            args.set(0, (Object)Float.valueOf(yaw));
            args.set(1, (Object)Float.valueOf(pitch));
        }
        if ((freeLook = bks.sla_3()) != null && freeLook.rgha_2()) {
            float yaw = freeLook.zyj();
            float pitch = freeLook.sta_6();
            if (inverseView) {
                yaw += 180.0f;
                pitch = -pitch;
            }
            args.set(0, (Object)Float.valueOf(yaw));
            args.set(1, (Object)Float.valueOf(pitch));
        }
        if ((freeCam = bdhd_2.bfz()) != null && freeCam.rgha_2()) {
            args.set(0, (Object)Float.valueOf(freeCam.shld_2()));
            args.set(1, (Object)Float.valueOf(freeCam.sgha_4()));
        }
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setPos(DDD)V"))
    private void setPosHook(Args args, class_1922 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta) {
        bdhd_2 freeCam;
        bkh_3 smoothCamera = bkh_3.zry_2();
        if (smoothCamera != null && smoothCamera.rgha_2()) {
            double x = (Double)args.get(0);
            double y = (Double)args.get(1);
            double z = (Double)args.get(2);
            smoothCamera.fa_2(x, y, z, thirdPerson);
            args.setAll(new Object[]{smoothCamera.ghzn_2(), smoothCamera.thkh_6(), smoothCamera.zmw()});
        }
        if ((freeCam = bdhd_2.bfz()) != null && freeCam.rgha_2() && freeCam.ghhw()) {
            args.setAll(new Object[]{freeCam.rthh_2(), freeCam.thkht_2(), freeCam.bhn_2()});
        }
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;moveBy(FFF)V", ordinal=0))
    private void updateMoveBy(Args args, class_1922 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta) {
        bwdh cameraClip;
        bhz f5Controller = bhz.zshdh();
        if (f5Controller != null && f5Controller.bghdh(thirdPerson)) {
            float f;
            if (focusedEntity instanceof class_1309) {
                class_1309 living = (class_1309)focusedEntity;
                f = living.method_55693();
            } else {
                f = 1.0f;
            }
            float scale = f;
            args.set(0, (Object)Float.valueOf(-this.method_19318(f5Controller.ajj(tickDelta) * scale)));
            args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() + f5Controller.dwsh_2(tickDelta)));
        }
        if ((cameraClip = bwdh.tghd_4()) != null && cameraClip.rgha_2()) {
            args.set(0, (Object)Float.valueOf(-this.method_19318(cameraClip.zal_3())));
        }
        btn_2 animation = btn_2.shrh_2();
        bks freeLook = bks.sla_3();
        bdhd_2 freeCam = bdhd_2.bfz();
        bkh_3 smoothCamera = bkh_3.zry_2();
        if (!(animation == null || !animation.rgha_2() || !animation.ghdhb() || freeLook != null && freeLook.rgha_2() || freeCam != null && freeCam.rgha_2() || smoothCamera != null && smoothCamera.rgha_2())) {
            float factor = animation.jad_2(true);
            args.set(0, (Object)Float.valueOf(((Float)args.get(0)).floatValue() * factor));
        }
    }

    @Inject(method={"update"}, at={@At(value="TAIL")})
    private void applyFirstPersonPerspectiveTransition(class_1922 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {
        float f;
        bks freeLook = bks.sla_3();
        bdhd_2 freeCam = bdhd_2.bfz();
        bkh_3 smoothCamera = bkh_3.zry_2();
        if (thirdPerson || freeLook != null && freeLook.rgha_2() || freeCam != null && freeCam.rgha_2() || smoothCamera != null && smoothCamera.rgha_2()) {
            return;
        }
        btn_2 animation = btn_2.shrh_2();
        if (animation == null || !animation.rgha_2() || !animation.ghdhb()) {
            return;
        }
        float factor = animation.jad_2(false);
        if (factor <= 0.001f) {
            return;
        }
        if (focusedEntity instanceof class_1309) {
            class_1309 livingEntity = (class_1309)focusedEntity;
            f = livingEntity.method_55693();
        } else {
            f = 1.0f;
        }
        float entityScale = f;
        this.method_19324(-this.method_19318(4.0f * entityScale * factor), 0.0f, 0.0f);
    }

    @Inject(method={"getSubmersionType()Lnet/minecraft/block/enums/CameraSubmersionType;"}, at={@At(value="HEAD")}, cancellable=true)
    private void getSubmergedFluidState(CallbackInfoReturnable<class_5636> ci) {
        if (Moondlc.getInstance().getModuleManager() == null) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.rgha_2() && removals.dskh_3().alh()) {
            ci.setReturnValue((Object)class_5636.field_27888);
        }
    }

    @Inject(method={"clipToSpace(F)F"}, at={@At(value="HEAD")}, cancellable=true)
    private void onClipToSpace(float desiredCameraDistance, CallbackInfoReturnable<Float> info) {
        if (Moondlc.getInstance().getModuleManager() == null) {
            return;
        }
        bwdh cameraClip = (bwdh)Moondlc.getInstance().getModuleManager().dfr_2(bwdh.class);
        if (cameraClip != null && cameraClip.rgha_2()) {
            info.setReturnValue((Object)Float.valueOf(cameraClip.zal_3()));
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.sdhy().alh() && removals.rgha_2()) {
            info.setReturnValue((Object)Float.valueOf(desiredCameraDistance));
        }
    }
}

