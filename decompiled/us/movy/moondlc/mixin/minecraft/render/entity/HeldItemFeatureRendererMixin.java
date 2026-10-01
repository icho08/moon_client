/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.class_10055
 *  net.minecraft.class_10426
 *  net.minecraft.class_10444
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_989
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.class_10055;
import net.minecraft.class_10426;
import net.minecraft.class_10444;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_989;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.tbq;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_989.class})
public abstract class HeldItemFeatureRendererMixin {
    @Unique
    private class_10055 Moondlc$chamsState;

    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/ArmedEntityRenderState;FF)V"}, at={@At(value="HEAD")})
    private void Moondlc$storeChamsState(class_4587 matrices, class_4597 vertexConsumers, int light, class_10426 state, float limbAngle, float limbDistance, CallbackInfo ci) {
        class_10055 playerState;
        this.Moondlc$chamsState = state instanceof class_10055 ? (playerState = (class_10055)state) : null;
    }

    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/ArmedEntityRenderState;FF)V"}, at={@At(value="RETURN")})
    private void Moondlc$clearChamsState(class_4587 matrices, class_4597 vertexConsumers, int light, class_10426 state, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.Moondlc$chamsState = null;
    }

    @WrapOperation(method={"renderItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/item/ItemRenderState;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;II)V")})
    private void Moondlc$renderHeldItemChams(class_10444 itemState, class_4587 matrices, class_4597 vertexConsumers, int light, int overlay, Operation<Void> original) {
        boolean renderChamsItem;
        if (btd_2.bzf_2()) {
            original.call(new Object[]{itemState, matrices, vertexConsumers, light, overlay});
            return;
        }
        tbq chams = (tbq)Moondlc.getInstance().getModuleManager().dfr_2(tbq.class);
        boolean bl = renderChamsItem = this.Moondlc$chamsState != null && chams.rgha_2() && chams.rzkh(this.Moondlc$chamsState);
        if (renderChamsItem && chams.khghy() && chams.khrh_2(itemState, matrices, this.Moondlc$chamsState, light, overlay)) {
            return;
        }
        class_4597 resolvedConsumers = renderChamsItem ? chams.dhzf(vertexConsumers, this.Moondlc$chamsState) : vertexConsumers;
        original.call(new Object[]{itemState, matrices, resolvedConsumers, light, overlay});
    }
}

