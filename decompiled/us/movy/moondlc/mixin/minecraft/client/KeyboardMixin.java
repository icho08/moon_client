/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_309
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client;

import net.minecraft.class_309;
import net.minecraft.class_408;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bdm;
import us.m0vy.moondlc.m0vyguard.btd_3;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.kb;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_309.class})
public class KeyboardMixin
implements tthy {
    @Inject(method={"onKey(JIIII)V"}, at={@At(value="HEAD")})
    public void triggerKeyEvent(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        if (key != -1) {
            Moondlc.getInstance().getEventManager().azj_2(new kb(action, key));
            bdm.dhsl_2().zkhh(new btd_3(key, action, false));
            if (KeyboardMixin.mc.field_1755 == null && key == 46 && action == 1) {
                mc.method_1507((class_437)new class_408(""));
            }
        }
    }

    @Inject(method={"onKey"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/InactivityFpsLimiter;onInput()V")})
    public void keyPressHook(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
        if (tdhr.dhzn() == null) {
            return;
        }
    }
}

