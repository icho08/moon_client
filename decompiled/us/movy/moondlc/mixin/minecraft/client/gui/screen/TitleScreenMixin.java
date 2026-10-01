/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_442
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.gui.screen;

import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_442;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.kkh;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_442.class})
public class TitleScreenMixin {
    @Inject(method={"init()V"}, at={@At(value="HEAD")}, cancellable=true)
    public void setCustomScreen(CallbackInfo ci) {
        if (!Moondlc.INSTANCE.isPanic()) {
            ci.cancel();
            class_310.method_1551().method_1507((class_437)new kkh());
        }
    }
}

