/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_339
 *  net.minecraft.class_4264
 *  net.minecraft.class_437
 *  net.minecraft.class_500
 *  net.minecraft.class_526
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.other;

import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_339;
import net.minecraft.class_4264;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_526;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.zth_8;

@Mixin(value={class_4264.class})
public abstract class MixinButtonWidget {
    @Inject(method={"renderWidget"}, at={@At(value="HEAD")}, cancellable=true)
    private void injectCustomRender(class_332 drawContext, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        class_437 current = class_310.method_1551().field_1755;
        if (!(current instanceof class_526) && !(current instanceof class_500)) {
            return;
        }
        class_339 self = (class_339)this;
        float x = self.method_46426();
        float y = self.method_46427();
        float w = self.method_25368();
        float h = self.method_25364();
        float bgAlpha = self.field_22763 ? 96.9f : 38.25f;
        float textAlpha = self.field_22763 ? 255.0f : 130.0f;
        bzth ctx = bzth.of(drawContext, mouseX, mouseY, delta);
        ctx.drawRoundedRect(x, y, w, h, zth_8.all(6.0f), new byq(20.0f, 20.0f, 30.0f).tkhl_2(bgAlpha));
        String text = self.method_25369().getString();
        trd font = bmn.sdha_2.twy_2(12.0f);
        float textW = font.dak(text);
        float textX = x + (w - textW) / 2.0f;
        float textY = y + (h - font.thssh_2()) / 2.0f - 1.0f;
        ctx.drawText(font, text, textX, textY, byq.brz_2.tkhl_2(textAlpha));
        ci.cancel();
    }
}

