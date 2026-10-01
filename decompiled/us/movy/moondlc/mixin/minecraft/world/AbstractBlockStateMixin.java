/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_2464
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3726
 *  net.minecraft.class_4970$class_4971
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.world;

import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2464;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bdhd_2;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.bqth;
import us.m0vy.moondlc.m0vyguard.tdt;
import us.m0vy.moondlc.m0vyguard.adh_3;

@Mixin(value={class_4970.class_4971.class})
public abstract class AbstractBlockStateMixin {
    @Shadow
    public abstract class_2248 method_26204();

    @Inject(method={"getCollisionShape(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/ShapeContext;)Lnet/minecraft/util/shape/VoxelShape;"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetCollisionShape(class_1922 world, class_2338 pos, class_3726 context, CallbackInfoReturnable<class_265> cir) {
        bdhd_2 freeCam = bdhd_2.bfz();
        if (freeCam != null && freeCam.rgha_2()) {
            cir.setReturnValue((Object)class_259.method_1073());
            return;
        }
    }

    @Inject(method={"getCollisionShape(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/ShapeContext;)Lnet/minecraft/util/shape/VoxelShape;"}, at={@At(value="RETURN")}, cancellable=true)
    private void removeXZCollision(class_1922 world, class_2338 pos, class_3726 context, CallbackInfoReturnable<class_265> cir) {
        tdt collisionEvent = tdt.th_5();
        if (collisionEvent != null && collisionEvent.jqy()) {
            double maxY;
            class_265 original = (class_265)cir.getReturnValue();
            double minY = original.method_1091(class_2350.class_2351.field_11052);
            if (minY >= (maxY = original.method_1105(class_2350.class_2351.field_11052))) {
                maxY = minY + 0.001;
            }
            class_265 finalShape = class_259.method_17786((class_265)class_259.method_1081((double)0.0, (double)minY, (double)0.0, (double)0.0, (double)maxY, (double)0.0), (class_265[])new class_265[0]);
            cir.setReturnValue((Object)finalShape);
        }
    }

    @Inject(method={"getOutlineShape(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/ShapeContext;)Lnet/minecraft/util/shape/VoxelShape;"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetOutlineShape(class_1922 world, class_2338 pos, class_3726 context, CallbackInfoReturnable<class_265> cir) {
        if (class_310.method_1551() == null) {
            return;
        }
        class_4970.class_4971 state = (class_4970.class_4971)this;
        if (state.method_27852(class_2246.field_10343) && bqth.twkh() != null && bqth.twkh().rgha_2() && bqth.twkh().dmz_4()) {
            cir.setReturnValue((Object)class_259.method_1073());
        }
    }

    @Inject(method={"getRaycastShape"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapRaycastShape(class_1922 world, class_2338 pos, CallbackInfoReturnable<class_265> cir) {
    }

    @Inject(method={"getCameraCollisionShape"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$antiTrapCameraCollisionShape(class_1922 world, class_2338 pos, class_3726 context, CallbackInfoReturnable<class_265> cir) {
    }

    @Inject(method={"getRenderType"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$xrayRenderType(CallbackInfoReturnable<class_2464> cir) {
        adh_3 xray = adh_3.hta_4();
        if (xray != null && xray.hthy() && !xray.rshq((class_2680)this)) {
            cir.setReturnValue((Object)class_2464.field_11455);
        }
    }

    @Inject(method={"isOpaque"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$xrayOpaque(CallbackInfoReturnable<Boolean> cir) {
        adh_3 xray = adh_3.hta_4();
        if (xray != null && xray.hthy()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"isOpaqueFullCube"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$xrayOpaqueFullCube(CallbackInfoReturnable<Boolean> cir) {
        adh_3 xray = adh_3.hta_4();
        if (xray != null && xray.hthy()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"hasSidedTransparency"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$xrayTransparency(CallbackInfoReturnable<Boolean> cir) {
        adh_3 xray = adh_3.hta_4();
        if (xray != null && xray.hthy()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"getOpacity"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$xrayOpacity(CallbackInfoReturnable<Integer> cir) {
        adh_3 xray = adh_3.hta_4();
        if (xray != null && xray.hthy()) {
            cir.setReturnValue((Object)0);
        }
    }

    @Inject(method={"isSideInvisible"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$xraySideInvisible(class_2680 state, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
        brj antiTrap = brj.dhqf();
        if (antiTrap != null && (antiTrap.hal_2((class_2680)this) || antiTrap.hal_2(state))) {
            cir.setReturnValue((Object)false);
            return;
        }
        adh_3 xray = adh_3.hta_4();
        if (xray != null && xray.hthy()) {
            cir.setReturnValue((Object)false);
        }
    }
}

