/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  net.minecraft.class_500
 *  net.minecraft.class_526
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.render;

import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_526;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.kkh;

@Mixin(value={class_437.class})
public class MixinScreen {
    @Inject(method={"renderBackground"}, at={@At(value="HEAD")}, cancellable=true)
    private void injectWallpaperBackground(class_332 drawContext, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        class_437 self = (class_437)this;
        boolean isSinglePlayer = self instanceof class_526;
        boolean isMultiPlayer = self instanceof class_500;
        if (!isSinglePlayer && !isMultiPlayer) {
            return;
        }
        bzth ctx = bzth.of(drawContext, mouseX, mouseY, delta);
        class_2960 bg = kkh.hkr != null ? kkh.hkr : class_2960.method_60655((String)"moondlc", (String)"image/mainmenu/background.png");
        ctx.drawTexture(bg, 0.0f, 0.0f, self.field_22789, self.field_22790);
        drawContext.method_25294(0, 0, self.field_22789, self.field_22790, -2013265920);
        ci.cancel();
    }
}

