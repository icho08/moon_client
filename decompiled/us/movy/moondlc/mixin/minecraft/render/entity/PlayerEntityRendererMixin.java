/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_1007
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3883
 *  net.minecraft.class_742
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3883;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bas;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.tbq;
import us.m0vy.moondlc.m0vyguard.tthsh;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.aw;
import us.m0vy.moondlc.m0vyguard.ny;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.render.accessor.ILivingEntityRendererAccessor;

@Mixin(value={class_1007.class})
public abstract class PlayerEntityRendererMixin {
    @Unique
    private static final float MOONDLC$POLAR_HEAD_BODY_LIMIT = 70.0f;
    @Unique
    private static final float MOONDLC$POLAR_RENDER_BODY_RELAX_SPEED = 8.0f;

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void Moondlc$addSantaHatFeature(CallbackInfo ci) {
        ((ILivingEntityRendererAccessor)((Object)this)).callAddFeature(new bas((class_3883)this));
        ((ILivingEntityRendererAccessor)((Object)this)).callAddFeature(new tthsh((class_3883)this));
    }

    @Inject(method={"updateRenderState(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;F)V"}, at={@At(value="TAIL")})
    private void Moondlc$storeRenderState(class_742 player, class_10055 state, float tickDelta, CallbackInfo ci) {
        aw clientCape;
        if (btd_2.bzf_2()) {
            return;
        }
        tbq chams = (tbq)Moondlc.getInstance().getModuleManager().dfr_2(tbq.class);
        if (chams != null && chams.rgha_2()) {
            chams.dhzsh(player, state);
        }
        if ((clientCape = aw.tqd_2()) != null) {
            clientCape.khhf_2(player, state, tickDelta);
        }
        if (player == class_310.method_1551().field_1724) {
            if (btj_2.dhsw_2 != null && btj_2.dhsw_2.length >= 2) {
                float yaw = btj_2.dhsw_2[0];
                float pitch = btj_2.dhsw_2[1];
                float relative = class_3532.method_15393((float)(yaw - state.field_53446));
                if (Math.abs(relative) > 50.0f) {
                    float targetBodyYaw = relative < 0.0f ? yaw + 50.0f : yaw - 50.0f;
                    float delta = class_3532.method_15393((float)(targetBodyYaw - state.field_53446));
                    state.field_53446 += delta * 0.3f;
                }
                state.field_53447 = class_3532.method_15393((float)(yaw - state.field_53446));
                state.field_53448 = pitch;
            } else {
                ny rotationHandler = Moondlc.getInstance().getRotationHandler();
                if (rotationHandler != null && !rotationHandler.smf()) {
                    float yaw = rotationHandler.ghdh_2().sry();
                    float pitch = rotationHandler.ghdh_2().khdhd_2();
                    this.moondlc$applyAuraRenderBodyYaw(player, state, yaw);
                    state.field_53447 = class_3532.method_15393((float)(yaw - state.field_53446));
                    state.field_53448 = pitch;
                }
            }
        }
    }

    @Unique
    private void moondlc$applyAuraRenderBodyYaw(class_742 player, class_10055 state, float headYaw) {
        boolean isNormalMode;
        tkhdh aura = tkhdh.zkhr_2();
        if (aura != null && aura.ryt()) {
            this.moondlc$relaxPolarRenderBodyYaw(player, state, headYaw);
            return;
        }
        if (aura != null && aura.dssh()) {
            float targetBodyYaw = player.method_36454();
            float bodyDelta = class_3532.method_15393((float)(targetBodyYaw - state.field_53446));
            state.field_53446 = Math.abs(bodyDelta) > 0.5f ? (state.field_53446 += bodyDelta * 0.45f) : targetBodyYaw;
            return;
        }
        boolean bl = isNormalMode = aura != null && aura.rgha_2() && aura.djw.skhth(aura.rkkh);
        if (isNormalMode && aura.rkhh_2() != null) {
            float relative = class_3532.method_15393((float)(headYaw - state.field_53446));
            if (Math.abs(relative) > 35.0f) {
                float targetBodyYaw = relative < 0.0f ? headYaw + 35.0f : headYaw - 35.0f;
                float delta = class_3532.method_15393((float)(targetBodyYaw - state.field_53446));
                state.field_53446 += delta * 0.25f;
            }
            return;
        }
        float relative = class_3532.method_15393((float)(headYaw - state.field_53446));
        if (Math.abs(relative) > 50.0f) {
            float targetBodyYaw = relative < 0.0f ? headYaw + 50.0f : headYaw - 50.0f;
            float delta = class_3532.method_15393((float)(targetBodyYaw - state.field_53446));
            state.field_53446 += delta * 0.3f;
        }
    }

    @Unique
    private void moondlc$relaxPolarRenderBodyYaw(class_742 player, class_10055 state, float headYaw) {
        float bodyDelta = class_3532.method_15393((float)(player.method_36454() - state.field_53446));
        state.field_53446 = Math.abs(bodyDelta) <= 0.35f ? player.method_36454() : (state.field_53446 += class_3532.method_15363((float)(bodyDelta * 0.3f), (float)-8.0f, (float)8.0f));
        float headDelta = class_3532.method_15393((float)(headYaw - state.field_53446));
        if (headDelta < -70.0f) {
            state.field_53446 = headYaw + 70.0f;
        } else if (headDelta > 70.0f) {
            state.field_53446 = headYaw - 70.0f;
        }
    }
}

