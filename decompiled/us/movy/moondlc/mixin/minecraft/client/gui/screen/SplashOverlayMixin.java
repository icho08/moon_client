/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_156
 *  net.minecraft.class_1921
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_4011
 *  net.minecraft.class_425
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.gui.screen;

import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4011;
import net.minecraft.class_425;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_425.class})
public class SplashOverlayMixin
implements byh,
tthy {
    @Unique
    private fa_2 fadeOutAnimation;
    @Shadow
    private long field_17771 = -1L;
    @Final
    @Shadow
    private Consumer<Optional<Throwable>> field_18218;
    @Shadow
    @Final
    private class_4011 field_17767;
    @Shadow
    @Final
    private boolean field_18219;
    @Shadow
    private long field_18220;

    @Inject(method={"<init>(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/resource/ResourceReload;Ljava/util/function/Consumer;Z)V"}, at={@At(value="RETURN")})
    public void init(class_310 client, class_4011 monitor, Consumer<Optional<Throwable>> exceptionHandler, boolean reloading, CallbackInfo ci) {
        this.fadeOutAnimation = new fa_2(3000L, 1.0f, jkh.zthd);
    }

    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;IIF)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void replaceRendering(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!Moondlc.getInstance().isPanic()) {
            float g;
            ci.cancel();
            int width = context.method_51421();
            int height = context.method_51443();
            bzth uiContext = bzth.of(context, 0, 0, delta);
            long currentTime = class_156.method_658();
            if (this.field_18219 && this.field_18220 == -1L) {
                this.field_18220 = currentTime;
            }
            float f = this.field_17771 > -1L ? (float)(currentTime - this.field_17771) / 1000.0f : -1.0f;
            float f2 = g = this.field_18220 > -1L ? (float)(currentTime - this.field_18220) / 500.0f : -1.0f;
            if (f >= 1.0f) {
                if (SplashOverlayMixin.mc.field_1755 != null) {
                    SplashOverlayMixin.mc.field_1755.method_25394(context, 0, 0, delta);
                }
                k = class_3532.method_15386((float)((1.0f - class_3532.method_15363((float)(f - 1.0f), (float)0.0f, (float)1.0f)) * 255.0f));
                context.method_51739(class_1921.method_51785(), 0, 0, width, height, bhj_2.bdhj.tkhl_2(k).rk());
            } else if (this.field_18219 && SplashOverlayMixin.mc.field_1755 != null && g < 1.0f) {
                SplashOverlayMixin.mc.field_1755.method_25394(context, mouseX, mouseY, delta);
                k = class_3532.method_15384((double)(class_3532.method_15350((double)g, (double)0.15, (double)1.0) * 255.0));
                context.method_51739(class_1921.method_51785(), 0, 0, width, height, bhj_2.bdhj.tkhl_2(k).rk());
            }
            if (f >= 2.0f) {
                mc.method_18502(null);
            }
            if (this.field_17771 == -1L && this.field_17767.method_18787() && (!this.field_18219 || g >= 2.0f)) {
                try {
                    this.field_17767.method_18849();
                    this.field_18218.accept(Optional.empty());
                }
                catch (Throwable var15) {
                    this.field_18218.accept(Optional.of(var15));
                }
                this.field_17771 = currentTime;
                if (SplashOverlayMixin.mc.field_1755 != null) {
                    SplashOverlayMixin.mc.field_1755.method_25423(mc, context.method_51421(), context.method_51443());
                }
            }
        }
    }
}

