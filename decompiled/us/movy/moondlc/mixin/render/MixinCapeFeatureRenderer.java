/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_10186$class_10190
 *  net.minecraft.class_1799
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_591
 *  net.minecraft.class_972
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.render;

import net.minecraft.class_10055;
import net.minecraft.class_10186;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_591;
import net.minecraft.class_972;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.aw;

@Mixin(value={class_972.class})
public abstract class MixinCapeFeatureRenderer {
    @Invoker(value="hasCustomModelForLayer")
    protected abstract boolean Moondlc$hasCustomModelForLayer(class_1799 var1, class_10186.class_10190 var2);

    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/PlayerEntityRenderState;FF)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$renderSegmentedWaveCape(class_4587 matrices, class_4597 vertexConsumers, int light, class_10055 renderState, float limbAngle, float limbDistance, CallbackInfo ci) {
        aw module = aw.tqd_2();
        if (module == null || !module.tdhw(renderState) || this.Moondlc$hasCustomModelForLayer(renderState.field_53418, class_10186.class_10190.field_54127)) {
            return;
        }
        matrices.method_22903();
        class_591 playerModel = (class_591)((class_972)this).method_17165();
        playerModel.field_3391.method_22703(matrices);
        playerModel.field_3483.method_22703(matrices);
        if (this.Moondlc$hasCustomModelForLayer(renderState.field_53418, class_10186.class_10190.field_54125)) {
            matrices.method_46416(0.0f, -0.053125f, 0.06875f);
        }
        boolean rendered = module.hss_3(matrices, vertexConsumers, light, renderState);
        matrices.method_22909();
        if (rendered) {
            ci.cancel();
        }
    }
}

