/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10039
 *  net.minecraft.class_1542
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_7833
 *  net.minecraft.class_916
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.render.entity;

import net.minecraft.class_10039;
import net.minecraft.class_1542;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_7833;
import net.minecraft.class_916;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bfa;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_916.class})
public abstract class ItemEntityRendererMixin {
    @Unique
    private boolean lastOnGround = false;

    @Inject(method={"updateRenderState"}, at={@At(value="TAIL")})
    private void onUpdateRenderState(class_1542 entity, class_10039 state, float tickDelta, CallbackInfo ci) {
        this.lastOnGround = entity.method_24828();
    }

    @ModifyVariable(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/ItemEntityRenderer;renderStack(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/ItemStackEntityRenderState;Lnet/minecraft/util/math/random/Random;)V"), ordinal=0)
    private class_4587 modifyMatrixStack(class_4587 matrices, class_10039 state, class_4587 original, class_4597 vertexConsumers, int light) {
        if (btd_2.bzf_2()) {
            return matrices;
        }
        bfa itemPhysic = (bfa)Moondlc.getInstance().getModuleManager().dfr_2(bfa.class);
        if (itemPhysic.rgha_2()) {
            float vanillaRotation = class_1542.method_27314((float)state.field_53328, (float)state.field_53435);
            float scaleY = state.field_55310.method_65609().field_4285.y();
            float vanillaOscillation = class_3532.method_15374((float)(state.field_53328 / 10.0f + state.field_53435)) * 0.1f + 0.1f;
            boolean hasDepth = state.field_55310.method_65607();
            if (!itemPhysic.hjgh()) {
                if (this.lastOnGround) {
                    float groundOffset = hasDepth ? 0.08f * scaleY : 0.035f * scaleY;
                    matrices.method_46416(0.0f, -vanillaOscillation - 0.25f * scaleY + groundOffset, 0.0f);
                    matrices.method_22907(class_7833.field_40716.rotation(-vanillaRotation));
                    matrices.method_22907(class_7833.field_40716.rotationDegrees(state.field_53435 * 360.0f));
                    matrices.method_22907(class_7833.field_40714.rotationDegrees(90.0f));
                } else {
                    matrices.method_46416(0.0f, -vanillaOscillation, 0.0f);
                    matrices.method_22907(class_7833.field_40714.rotationDegrees(state.field_53328 * 7.5f));
                    matrices.method_22907(class_7833.field_40718.rotationDegrees(state.field_53328 * 3.25f));
                }
            } else {
                matrices.method_46416(0.0f, -vanillaOscillation + 0.05f, 0.0f);
                matrices.method_22907(class_7833.field_40716.rotation(-vanillaRotation));
                matrices.method_22907(class_310.method_1551().method_1561().method_24197());
                matrices.method_22905(1.1f, 1.1f, 1.0f);
            }
        }
        return matrices;
    }
}

