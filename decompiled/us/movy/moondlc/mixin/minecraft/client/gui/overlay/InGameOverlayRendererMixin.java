/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1058
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4603
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.gui.overlay;

import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.sk;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_4603.class})
public class InGameOverlayRendererMixin {
    @Inject(method={"renderFireOverlay(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderFireOverlayHook(class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.aghf()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderInWallOverlay(Lnet/minecraft/client/texture/Sprite;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderInWallOverlayHook(class_1058 sprite, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.abt_2()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderUnderwaterOverlay(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderUnderwaterOverlayHook(class_310 client, class_4587 matrices, class_4597 vertexConsumers, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals != null && removals.bghh_2()) {
            ci.cancel();
        }
    }
}

