/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.entity;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.tjth;
import us.m0vy.moondlc.m0vyguard.ksh;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yd_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_1657.class})
public class PlayerEntityMixin {
    @Inject(method={"attack(Lnet/minecraft/entity/Entity;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void attackAHook2(class_1297 target, CallbackInfo ci) {
        bthy event = new bthy(target);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            ci.cancel();
        }
    }

    @Inject(method={"attack(Lnet/minecraft/entity/Entity;)V"}, at={@At(value="RETURN")}, cancellable=true)
    private void attackAHook(class_1297 target, CallbackInfo ci) {
        ksh event = new ksh(target);
        Moondlc.getInstance().getEventManager().azj_2(event);
    }

    @Inject(method={"isPushedByFluids()Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void removePushFromFluids(CallbackInfoReturnable<Boolean> cir) {
        yd_2 noPush = (yd_2)Moondlc.getInstance().getModuleManager().dfr_2(yd_2.class);
        class_1657 player = (class_1657)this;
        if (player == class_310.method_1551().field_1724 && noPush.rgha_2() && noPush.khkj().alh()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"travel(Lnet/minecraft/util/math/Vec3d;)V"}, at={@At(value="HEAD")})
    private void onTravel(class_243 movementInput, CallbackInfo ci) {
        class_1657 player = (class_1657)this;
        if (player == class_310.method_1551().field_1724) {
            Moondlc.getInstance().getEventManager().azj_2(new tjth());
        }
    }

    @Redirect(method={"travel(Lnet/minecraft/util/math/Vec3d;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"))
    private class_243 redirectGetRotationVectorInTravel(class_1657 instance) {
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        return rotationHandler.smf() ? instance.method_5720() : rotationHandler.dhdf().tshd_2();
    }
}

