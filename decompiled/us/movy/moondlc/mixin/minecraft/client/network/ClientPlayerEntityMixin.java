/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.v2.WrapWithCondition
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1313
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client.network;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.mojang.authlib.GameProfile;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjd_2;
import us.m0vy.moondlc.m0vyguard.bzm;
import us.m0vy.moondlc.m0vyguard.bsr_2;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bfq;
import us.m0vy.moondlc.m0vyguard.bqn;
import us.m0vy.moondlc.m0vyguard.bndh;
import us.m0vy.moondlc.m0vyguard.bhs_3;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.bww;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.thgh;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.tdr;
import us.m0vy.moondlc.m0vyguard.tzt_2;
import us.m0vy.moondlc.m0vyguard.thb_3;
import us.m0vy.moondlc.m0vyguard.hm;
import us.m0vy.moondlc.m0vyguard.dkh;
import us.m0vy.moondlc.m0vyguard.z_2;
import us.m0vy.moondlc.m0vyguard.zgh;
import us.m0vy.moondlc.m0vyguard.sr_2;
import us.m0vy.moondlc.m0vyguard.ght;
import us.m0vy.moondlc.m0vyguard.fa;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yd_2;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.utility.mixins.ClientPlayerEntityAddition;

@Mixin(value={class_746.class})
public abstract class ClientPlayerEntityMixin
extends class_742
implements ClientPlayerEntityAddition,
tthy {
    @Shadow
    public class_744 field_3913;
    @Unique
    private int groundTicks = 0;
    @Unique
    private static final float MOONDLC$POLAR_HEAD_BODY_LIMIT = 70.0f;
    @Unique
    private static final float MOONDLC$POLAR_BODY_RELAX_SPEED = 7.5f;
    @Unique
    private double moondlc$prevX = 0.0;
    @Unique
    private double moondlc$prevZ = 0.0;
    @Unique
    private float moondlc$prevBodyYaw = 0.0f;
    @Unique
    private boolean moondlc$bodyInitialized = false;
    @Shadow
    private float field_3941;
    @Shadow
    private float field_3925;

    public ClientPlayerEntityMixin(class_638 world, GameProfile profile) {
        super(world, profile);
    }

    @Redirect(method={"tickMovement()V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"), require=0)
    private boolean onIsUsingItemRedirect(class_746 player) {
        if (sr_2.stf_3().shy_5()) {
            return false;
        }
        hm slowDownEvent = new hm();
        Moondlc.getInstance().getEventManager().azj_2(slowDownEvent);
        return player.method_6115() && player.method_5854() == null && !slowDownEvent.tsm_3();
    }

    @ModifyExpressionValue(method={"tickMovement()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/KeyBinding;isPressed()Z")})
    public boolean unpressSprintKey(boolean original) {
        return this.sprintHook(original);
    }

    @ModifyExpressionValue(method={"canStartSprinting()Z"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")}, require=0)
    private boolean onCanStartSprintingUsingItemRedirect(boolean original) {
        sr_2 noSlow = sr_2.stf_3();
        if (noSlow != null && noSlow.ghh_2()) {
            return false;
        }
        return original;
    }

    @ModifyExpressionValue(method={"tickMovement()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;canSprint()Z")})
    private boolean disallowSprinting(boolean original) {
        return this.sprintHook(original);
    }

    @WrapWithCondition(method={"closeScreen()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;setScreen(Lnet/minecraft/client/gui/screen/Screen;)V")})
    private boolean preventCloseScreen(class_310 instance, class_437 screen) {
        Moondlc.getInstance().getEventManager().azj_2(new dkh(screen));
        return true;
    }

    @Inject(method={"pushOutOfBlocks(DD)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void removePushOutFromBlocks(double x, double z, CallbackInfo ci) {
        yd_2 noPush = (yd_2)Moondlc.getInstance().getModuleManager().dfr_2(yd_2.class);
        if (noPush.rgha_2() && noPush.thghh().alh()) {
            ci.cancel();
        }
    }

    @Inject(method={"tick()V"}, at={@At(value="HEAD")})
    public void triggerTickEvent(CallbackInfo ci) {
        tdr.shay().jqy();
        z_2.zay_4().jqy();
        Moondlc.getInstance().getEventManager().azj_2(new btt());
    }

    @Inject(method={"tick()V"}, at={@At(value="RETURN")})
    public void triggerTickEndEvent(CallbackInfo ci) {
        Moondlc.getInstance().getEventManager().azj_2(new bqn());
    }

    @Inject(method={"tickMovement()V"}, at={@At(value="HEAD")})
    public void updateOnGroundTicks(CallbackInfo ci) {
        this.groundTicks = ClientPlayerEntityMixin.mc.field_1724 != null && ClientPlayerEntityMixin.mc.field_1724.method_24828() ? ++this.groundTicks : 0;
    }

    @ModifyExpressionValue(method={"sendMovementPackets()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F")})
    public float replaceMovePacketYaw(float original) {
        if (btj_2.dhsw_2 != null && btj_2.dhsw_2.length >= 2) {
            float yaw = btj_2.dhsw_2[0];
            Moondlc.getInstance().getRotationHandler().wk().dzdh_4(yaw);
            this.moondlc$applyAuraHeadAndBodyYaw(yaw);
            return yaw;
        }
        kq rotationManager = kq.thzt_2();
        bwk currentRotationPlan = rotationManager.jwj();
        if (currentRotationPlan != null) {
            taj rotation = rotationManager.hls_2();
            float yaw = rotation.dda_3();
            this.moondlc$applyAuraHeadAndBodyYaw(yaw);
            Moondlc.getInstance().getRotationHandler().wk().dzdh_4(yaw);
            return yaw;
        }
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        float yaw = rotationHandler != null && !rotationHandler.smf() ? rotationHandler.dhdf().sry() : original;
        this.moondlc$applyAuraHeadAndBodyYaw(yaw);
        if (rotationHandler != null) {
            rotationHandler.wk().dzdh_4(yaw);
        }
        return yaw;
    }

    @ModifyExpressionValue(method={"sendMovementPackets()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F")})
    public float replaceMovePacketPitch(float original) {
        float pitch;
        if (btj_2.dhsw_2 != null && btj_2.dhsw_2.length >= 2) {
            float pitch2 = btj_2.dhsw_2[1];
            Moondlc.getInstance().getRotationHandler().wk().tsm_2(pitch2);
            return pitch2;
        }
        bwk rotation = kq.thzt_2().jwj();
        if (rotation != null) {
            float pitch3 = kq.thzt_2().hls_2().shyq();
            Moondlc.getInstance().getRotationHandler().wk().tsm_2(pitch3);
            return pitch3;
        }
        ny rotationHandler = Moondlc.getInstance().getRotationHandler();
        float f = pitch = rotationHandler != null && !rotationHandler.smf() ? rotationHandler.dhdf().khdhd_2() : original;
        if (rotationHandler != null) {
            rotationHandler.wk().tsm_2(pitch);
        }
        return pitch;
    }

    @Inject(method={"tick()V"}, at={@At(value="HEAD")})
    public void onBodyTickHead(CallbackInfo ci) {
        if (!this.moondlc$bodyInitialized && ClientPlayerEntityMixin.mc.field_1724 != null) {
            this.moondlc$prevX = ClientPlayerEntityMixin.mc.field_1724.method_23317();
            this.moondlc$prevZ = ClientPlayerEntityMixin.mc.field_1724.method_23321();
            this.moondlc$prevBodyYaw = ClientPlayerEntityMixin.mc.field_1724.method_43078();
            this.moondlc$bodyInitialized = true;
        }
    }

    @Inject(method={"shouldStopSprinting()Z"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")}, cancellable=true)
    public void shouldStopSprintingHook(CallbackInfoReturnable<Boolean> cir) {
        sr_2 noSlow = sr_2.stf_3();
        if (noSlow != null && noSlow.ghh_2()) {
            cir.setReturnValue((Object)false);
            return;
        }
        tkhdh aura = tkhdh.zkhr_2();
        if (!(aura == null || !aura.rgha_2() || this.field_3913 == null || this.field_3913.field_3905 == 0.0f && this.field_3913.field_3907 == 0.0f || this.field_5976 || this.method_5799() || this.method_5869())) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"canStartSprinting()Z"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")}, cancellable=true)
    public void canStartSprintingHook(CallbackInfoReturnable<Boolean> cir) {
        sr_2 noSlow = sr_2.stf_3();
        if (noSlow != null && noSlow.ghh_2()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Unique
    private void moondlc$applyAuraHeadAndBodyYaw(float headYaw) {
        float newBodyYaw;
        this.method_5847(headYaw);
        if (ClientPlayerEntityMixin.mc.field_1724 == null) {
            return;
        }
        this.moondlc$prevBodyYaw = newBodyYaw = bzm.thhkh_2(headYaw, this.moondlc$prevBodyYaw, this.moondlc$prevX, this.moondlc$prevZ, this.method_23317(), this.method_23321(), this.field_6251);
        this.moondlc$prevX = this.method_23317();
        this.moondlc$prevZ = this.method_23321();
        this.method_5636(newBodyYaw);
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isOnGround()Z")})
    private boolean silentOnGround(boolean original) {
        return btj_2.dhsdh_2 != null ? btj_2.dhsdh_2 : original;
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="HEAD")}, cancellable=true)
    private void preMotion(CallbackInfo ci) {
        ght event = new ght(this.method_23317(), this.method_23318(), this.method_23321(), this.method_5705(1.0f), this.method_5695(1.0f), this.method_24828());
        if (bfq.dhnh_2().zkhh(event)) {
            ci.cancel();
        }
        Moondlc.getInstance().getEventManager().azj_2(new bjd_2());
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="TAIL")})
    private void postMotion(CallbackInfo ci) {
        btj_2.hrr();
        zgh.tks_2().zkhh(zgh.tks_2());
        Moondlc.getInstance().getEventManager().azj_2(new thb_3());
    }

    @Inject(method={"move"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V")}, cancellable=true)
    public void moveHook(class_1313 movementType, class_243 movement, CallbackInfo ci) {
        tzt_2 event = new tzt_2(movement.field_1352, movement.field_1351, movement.field_1350);
        if (bww.smdh_2().zkhh(event)) {
            super.method_5784(movementType, new class_243(event.djh_4(), event.dhkha(), event.tdth()));
            ci.cancel();
        }
    }

    @Inject(method={"closeHandledScreen"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V")}, cancellable=true)
    private void onCloseHandledScreen(CallbackInfo ci) {
        if (bhs_3.hdz_2().jqy()) {
            ci.cancel();
        }
    }

    @Inject(method={"dropSelectedItem(Z)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void onDropSelectedItem(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
        thgh slotLocker = (thgh)Moondlc.getInstance().getModuleManager().dfr_2(thgh.class);
        if (slotLocker.hdhj(ClientPlayerEntityMixin.mc.field_1724.method_31548().field_7545)) {
            cir.setReturnValue((Object)false);
            cir.cancel();
        }
    }

    @Unique
    private boolean sprintHook(boolean origin) {
        tkhdh aura = tkhdh.zkhr_2();
        if (aura != null && aura.rgha_2() && tkhdh.thy_2) {
            return false;
        }
        boolean eventResult = bsr_2.dhtsh_2().zkhh(new fa(new bndh(this.field_3913)));
        return eventResult || origin;
    }

    @Override
    public int moondlc$getOnGroundTicks() {
        return this.groundTicks;
    }
}

