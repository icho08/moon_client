/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1806
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_742
 *  net.minecraft.class_759
 *  net.minecraft.class_811
 *  net.minecraft.class_918
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.render.item;

import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1806;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_759;
import net.minecraft.class_811;
import net.minecraft.class_918;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.tdh_2;
import us.m0vy.moondlc.m0vyguard.tdhkh;
import us.m0vy.moondlc.m0vyguard.qh_2;
import us.m0vy.moondlc.m0vyguard.kz;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_759.class})
public abstract class HeldItemRendererMixin {
    @Shadow
    @Final
    private class_918 field_4044;
    @Unique
    private boolean moondlc$pushed = false;

    @Shadow
    protected abstract void method_3218(class_4587 var1, float var2, class_1306 var3, class_1799 var4, class_1657 var5);

    @Shadow
    protected abstract void method_49340(class_4587 var1, float var2, class_1306 var3, class_1799 var4, class_1657 var5, float var6);

    @Inject(method={"renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderFirstPersonItem(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        this.moondlc$pushed = false;
        if (btd_2.bzf_2()) {
            return;
        }
        kz swingAnimation = (kz)Moondlc.getInstance().getModuleManager().dfr_2(kz.class);
        if (swingAnimation != null && swingAnimation.rgha_2() && !item.method_7960() && !(item.method_7909() instanceof class_1806)) {
            ci.cancel();
            swingAnimation.ddk_4(player, tickDelta, pitch, hand, swingProgress, item, equipProgress, matrices, vertexConsumers, light);
            return;
        }
        boolean isMainHand = hand == class_1268.field_5808;
        class_1306 arm = isMainHand ? player.method_6068() : player.method_6068().method_5928();
        boolean isRightArm = arm == class_1306.field_6183;
        matrices.method_22903();
        this.moondlc$pushed = true;
        qh_2 viewModel = qh_2.dhdz();
        if (viewModel != null) {
            viewModel.zght_2(matrices, arm);
        }
        tdh_2 event = new tdh_2(arm, swingProgress, item, equipProgress, matrices);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            ci.cancel();
            float f = -0.4f * class_3532.method_15374((float)(class_3532.method_15355((float)0.0f) * (float)Math.PI));
            float g = 0.2f * class_3532.method_15374((float)(class_3532.method_15355((float)0.0f) * ((float)Math.PI * 2)));
            float h = -0.2f * class_3532.method_15374((float)0.0f);
            matrices.method_46416((float)(arm == class_1306.field_6183 ? 1 : -1) * f, g, h);
            int i = arm == class_1306.field_6183 ? 1 : -1;
            matrices.method_46416((float)i * 0.56f, -0.52f, -0.72f);
            if (!item.method_7960()) {
                this.method_3218(matrices, tickDelta, arm, item, (class_1657)player);
                class_759 rendererInstance = (class_759)this;
                rendererInstance.method_3233((class_1309)player, item, isRightArm ? class_811.field_4322 : class_811.field_4321, !isRightArm, matrices, vertexConsumers, light);
            }
            matrices.method_22909();
            this.moondlc$pushed = false;
        }
    }

    @Inject(method={"renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="RETURN")})
    private void onRenderFirstPersonItemEnd(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (this.moondlc$pushed) {
            matrices.method_22909();
            this.moondlc$pushed = false;
        }
    }

    @Inject(method={"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="RETURN")})
    private void Moondlc$captureRenderItemPos(class_1309 entity, class_1799 stack, class_811 renderMode, boolean leftHanded, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (entity == class_310.method_1551().field_1724) {
            class_1306 arm = leftHanded ? class_1306.field_6182 : class_1306.field_6183;
            tdhkh flameHands = (tdhkh)Moondlc.getInstance().getModuleManager().dfr_2(tdhkh.class);
            if (flameHands != null && flameHands.rgha_2()) {
                flameHands.szd_7(arm, matrices, vertexConsumers, light, !stack.method_7960());
            }
        }
    }

    @Inject(method={"renderArm(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Arm;)V"}, at={@At(value="RETURN")})
    private void Moondlc$captureRenderArmPos(class_4587 matrices, class_4597 vertexConsumers, int light, class_1306 arm, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        tdhkh flameHands = (tdhkh)Moondlc.getInstance().getModuleManager().dfr_2(tdhkh.class);
        if (flameHands != null && flameHands.rgha_2()) {
            flameHands.szd_7(arm, matrices, vertexConsumers, light, false);
        }
    }

    @Inject(method={"renderArmHoldingItem(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IFFLnet/minecraft/util/Arm;)V"}, at={@At(value="RETURN")})
    private void Moondlc$captureRenderArmHoldingItemPos(class_4587 matrices, class_4597 vertexConsumers, int light, float equipProgress, float swingProgress, class_1306 arm, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        tdhkh flameHands = (tdhkh)Moondlc.getInstance().getModuleManager().dfr_2(tdhkh.class);
        if (flameHands != null && flameHands.rgha_2()) {
            flameHands.szd_7(arm, matrices, vertexConsumers, light, true);
        }
    }
}

