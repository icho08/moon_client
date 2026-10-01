/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10034
 *  net.minecraft.class_10055
 *  net.minecraft.class_10186$class_10190
 *  net.minecraft.class_10197
 *  net.minecraft.class_10394
 *  net.minecraft.class_1799
 *  net.minecraft.class_3879
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_5321
 *  net.minecraft.class_572
 *  net.minecraft.class_970
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.render;

import net.minecraft.class_10034;
import net.minecraft.class_10055;
import net.minecraft.class_10186;
import net.minecraft.class_10197;
import net.minecraft.class_10394;
import net.minecraft.class_1799;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5321;
import net.minecraft.class_572;
import net.minecraft.class_970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.tbq;

@Mixin(value={class_970.class})
public abstract class MixinArmorFeatureRenderer {
    @Unique
    private class_10055 Moondlc$chamsState;

    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FF)V"}, at={@At(value="HEAD")})
    private void Moondlc$storeChamsState(class_4587 matrices, class_4597 vertexConsumers, int light, class_10034 state, float limbAngle, float limbDistance, CallbackInfo ci) {
        class_10055 playerState;
        this.Moondlc$chamsState = state instanceof class_10055 ? (playerState = (class_10055)state) : null;
    }

    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FF)V"}, at={@At(value="RETURN")})
    private void Moondlc$clearChamsState(class_4587 matrices, class_4597 vertexConsumers, int light, class_10034 state, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.Moondlc$chamsState = null;
    }

    @Redirect(method={"renderArmor"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/equipment/EquipmentRenderer;render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"))
    private void Moondlc$renderArmorChams(class_10197 instance, class_10186.class_10190 layerType, class_5321<class_10394> equipmentAsset, class_3879 model, class_1799 stack, class_4587 matrices, class_4597 vertexConsumers, int light) {
        boolean renderChamsArmor;
        if (btd_2.bzf_2()) {
            instance.method_64077(layerType, equipmentAsset, model, stack, matrices, vertexConsumers, light);
            return;
        }
        tbq chams = tbq.khhkh();
        boolean bl = renderChamsArmor = this.Moondlc$chamsState != null && chams.rgha_2() && chams.dlq(this.Moondlc$chamsState);
        if (renderChamsArmor && chams.khghy() && model instanceof class_572) {
            class_572 bipedModel = (class_572)model;
            chams.thdhd(matrices, bipedModel, this.Moondlc$chamsState);
            return;
        }
        class_4597 resolvedConsumers = renderChamsArmor ? chams.dhzf(vertexConsumers, this.Moondlc$chamsState) : vertexConsumers;
        instance.method_64077(layerType, equipmentAsset, model, stack, matrices, resolvedConsumers, light);
        if (renderChamsArmor && chams.dlh_4() && model instanceof class_572) {
            class_572 bipedModel = (class_572)model;
            chams.thdhd(matrices, bipedModel, this.Moondlc$chamsState);
        }
    }
}

