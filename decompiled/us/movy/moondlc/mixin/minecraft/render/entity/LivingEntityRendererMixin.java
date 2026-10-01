/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 *  net.minecraft.class_1309
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_572
 *  net.minecraft.class_583
 *  net.minecraft.class_591
 *  net.minecraft.class_922
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_1309;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_572;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bthth;
import us.m0vy.moondlc.m0vyguard.bshgh;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.taa_2;
import us.m0vy.moondlc.m0vyguard.tbq;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.ra;
import us.m0vy.moondlc.m0vyguard.st_2;
import us.m0vy.moondlc.m0vyguard.dt_4;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.wa_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_922.class})
public abstract class LivingEntityRendererMixin<T extends class_1309, S extends class_10042, M extends class_583<? super S>> {
    @Unique
    private taa_2 Moondlc$friendRenderScale;
    @Unique
    private class_2960 Moondlc$currentTexture;

    @Shadow
    public abstract M method_4038();

    @Shadow
    protected abstract class_1921 method_24302(S var1, boolean var2, boolean var3, boolean var4);

    @ModifyExpressionValue(method={"updateRenderState*"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getLerpedPitch(F)F")})
    private float updateVisalPitch(float original, class_1309 entity, S state, float tickDelta) {
        if (btd_2.bzf_2()) {
            return original;
        }
        if (entity != tdhr.dhzn()) {
            return original;
        }
        kq rotationManager = kq.thzt_2();
        taj rotation = rotationManager.hls_2();
        taj rotationPrev = rotationManager.ghrn();
        bwk currentRotationPlan = rotationManager.jwj();
        if (currentRotationPlan == null) {
            return original;
        }
        return class_3532.method_17821((float)tickDelta, (float)rotationPrev.shyq(), (float)rotation.shyq());
    }

    @Inject(method={"updateRenderState*"}, at={@At(value="TAIL")})
    private void Moondlc$trackHitColor(T entity, S state, float tickDelta, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        st_2 hitColor = (st_2)Moondlc.getInstance().getModuleManager().dfr_2(st_2.class);
        if (hitColor.rgha_2()) {
            hitColor.dhgh((class_1309)entity, (class_10042)state);
        }
    }

    @Inject(method={"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/model/EntityModel;setAngles(Lnet/minecraft/client/render/entity/state/EntityRenderState;)V", shift=At.Shift.AFTER)})
    private void Moondlc$applyFriendScale(S state, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (state instanceof class_10055) {
            class_10055 playerState = (class_10055)state;
            M m = this.method_4038();
            if (m instanceof class_591) {
                class_591 playerModel = (class_591)m;
                ra friendRender = (ra)Moondlc.getInstance().getModuleManager().dfr_2(ra.class);
                if (friendRender.dmz(playerState)) {
                    this.Moondlc$friendRenderScale = friendRender.tll_2(matrices, (class_572)playerModel);
                }
            }
        }
    }

    @Inject(method={"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;pop()V", shift=At.Shift.BEFORE)})
    private void Moondlc$restoreFriendScale(S state, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (this.Moondlc$friendRenderScale != null) {
            this.Moondlc$friendRenderScale.bty();
            this.Moondlc$friendRenderScale = null;
        }
    }

    @WrapOperation(method={"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/LivingEntityRenderer;getRenderLayer(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;ZZZ)Lnet/minecraft/client/render/RenderLayer;")})
    private class_1921 renderHook(class_922 instance, class_10042 state, boolean showBody, boolean translucent, boolean showOutline, Operation<class_1921> original) {
        class_1921 baseLayer = (class_1921)original.call(new Object[]{instance, state, showBody, translucent, showOutline});
        this.Moondlc$currentTexture = bthth.getTexture(baseLayer);
        if (btd_2.bzf_2()) {
            return baseLayer;
        }
        if (showOutline) {
            return baseLayer;
        }
        if (state instanceof class_10055) {
            class_2960 texture;
            tbq chams;
            dt_4 positionRender;
            class_10055 playerState = (class_10055)state;
            wa_2 totemAnimation = (wa_2)Moondlc.getInstance().getModuleManager().dfr_2(wa_2.class);
            if (totemAnimation != null && totemAnimation.rgha_2()) {
                if (totemAnimation.hkhk()) {
                    class_2960 texture2 = bthth.getTexture(baseLayer);
                    return wa_2.zwd(texture2, baseLayer);
                }
            }
            if ((positionRender = (dt_4)Moondlc.getInstance().getModuleManager().dfr_2(dt_4.class)) != null && positionRender.rgha_2()) {
                if (positionRender.zhh_7()) {
                    class_2960 texture3 = bthth.getTexture(baseLayer);
                    return dt_4.dkhb_2(texture3, baseLayer);
                }
            }
            if ((chams = (tbq)Moondlc.getInstance().getModuleManager().dfr_2(tbq.class)) != null && chams.rgha_2() && chams.hrh_2(playerState) && (texture = bthth.getTexture(baseLayer)) != null) {
                return chams.thwm() ? bthth.getChamsThroughWalls(texture) : bthth.getChamsNormal(texture);
            }
        }
        if (!translucent && state instanceof class_10055) {
            int defaultColor = -1;
            bshgh event = new bshgh(defaultColor);
            Moondlc.getInstance().getEventManager().azj_2(event);
            if (event.hsth_2() != defaultColor) {
                return (class_1921)original.call(new Object[]{instance, state, showBody, true, showOutline});
            }
        }
        return baseLayer;
    }

    /*
     * Unable to fully structure code
     */
    @WrapOperation(method={"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V")})
    private void renderModelHook(class_583<?> instance, class_4587 matrixStack, class_4588 vertexConsumer, int light, int overlay, int color, Operation<Void> original, @Local(ordinal=0, argsOnly=true) class_10042 renderState, @Local class_4597 vertexConsumers) {
        if (btd_2.bzf_2()) {
            original.call(new Object[]{instance, matrixStack, vertexConsumer, light, overlay, color});
            return;
        }
        targetColor = color;
        playerState = renderState instanceof class_10055 != false ? (state = (class_10055)renderState) : null;
        totemAnimation = (wa_2)Moondlc.getInstance().getModuleManager().dfr_2(wa_2.class);
        if (totemAnimation == null || !totemAnimation.rgha_2()) ** GOTO lbl-1000
        if (totemAnimation.hkhk() && playerState != null) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = renderSoul = false;
        }
        if (renderSoul) {
            if (!totemAnimation.jjth()) {
                v1 = new Object[6];
                v1[0] = instance;
                v1[1] = matrixStack;
                v1[2] = vertexConsumer;
                v1[3] = light;
                v1[4] = overlay;
                v1[5] = wa_2.rhth(color);
                original.call(v1);
            }
            if (instance instanceof class_591) {
                playerModel = (class_591)instance;
                totemAnimation.zaz(matrixStack, playerModel, playerState);
            }
            return;
        }
        positionRender = (dt_4)Moondlc.getInstance().getModuleManager().dfr_2(dt_4.class);
        if (positionRender == null || !positionRender.rgha_2()) ** GOTO lbl-1000
        if (positionRender.zhh_7() && playerState != null) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = renderPos = false;
        }
        if (renderPos) {
            if (!positionRender.fz()) {
                v3 = new Object[6];
                v3[0] = instance;
                v3[1] = matrixStack;
                v3[2] = vertexConsumer;
                v3[3] = light;
                v3[4] = overlay;
                v3[5] = dt_4.swm(color);
                original.call(v3);
            }
            if (instance instanceof class_591) {
                playerModel = (class_591)instance;
                positionRender.jkhkh(matrixStack, playerModel, playerState);
            }
            return;
        }
        chams = (tbq)Moondlc.getInstance().getModuleManager().dfr_2(tbq.class);
        renderChamsModel = chams != null && chams.rgha_2() != false && playerState != null && chams.hrh_2(playerState) != false;
        v4 = hideBaseModel = renderChamsModel != false && chams.khghy() != false;
        if (renderChamsModel) {
            targetColor = chams.tdhd_2(playerState);
        }
        if (renderState.field_53461) {
            event = new bshgh(color);
            Moondlc.getInstance().getEventManager().azj_2(event);
            targetColor = event.hsth_2();
        }
        if ((hitColor = (st_2)Moondlc.getInstance().getModuleManager().dfr_2(st_2.class)).rgha_2() && hitColor.zthd_2(renderState, overlay) && !hideBaseModel) {
            targetColor = hitColor.aan_2(renderState, overlay);
        }
        original.call(new Object[]{instance, matrixStack, vertexConsumer, light, overlay, targetColor});
        if (renderChamsModel && chams.dlh_4() && instance instanceof class_591) {
            playerModel = (class_591)instance;
            chams.dhkh_6(matrixStack, playerModel, playerState);
        }
    }
}

