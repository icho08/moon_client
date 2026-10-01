/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_303$class_7590
 *  net.minecraft.class_310
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_338
 *  net.minecraft.class_5481
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 */
package us.movy.moondlc.mixin.minecraft.client.gui.hud;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_303;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_338;
import net.minecraft.class_5481;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_338.class})
public abstract class ChatHudMixin {
    @WrapOperation(method={"render(Lnet/minecraft/client/gui/DrawContext;IIIZ)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/OrderedText;III)I")})
    private int moondlc$animateChatMessage(class_332 context, class_327 renderer, class_5481 text, int x, int y, int color, Operation<Integer> original, @Local class_303.class_7590 line, @Local(argsOnly=true, ordinal=0) int currentTick) {
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation == null || !animation.rgha_2() || !animation.shsh_7() || line == null) {
            return (Integer)original.call(new Object[]{context, renderer, text, x, y, color});
        }
        class_310 mc = class_310.method_1551();
        float tickDelta = mc.method_61966() != null ? mc.method_61966().method_60637(false) : 0.0f;
        double t = Math.max(0.0, Math.min(1.0, (double)((float)(currentTick - line.comp_895()) + tickDelta) / 9.0));
        double progress = 1.0 - Math.pow(1.0 - t, 3.0);
        int alpha = (int)Math.round((double)(color >>> 24 & 0xFF) * progress);
        float offsetX = (float)(-(1.0 - progress) * 8.0);
        context.method_51448().method_22903();
        context.method_51448().method_46416(offsetX, 0.0f, 0.0f);
        int result = (Integer)original.call(new Object[]{context, renderer, text, x, y, color & 0xFFFFFF | alpha << 24});
        context.method_51448().method_22909();
        return result;
    }
}

