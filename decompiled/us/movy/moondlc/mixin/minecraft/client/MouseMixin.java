/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_312
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client;

import net.minecraft.class_312;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bdm;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.btd_3;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.taa;
import us.m0vy.moondlc.m0vyguard.tbb;
import us.m0vy.moondlc.m0vyguard.tbr;
import us.m0vy.moondlc.m0vyguard.ttq;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.tsy;
import us.m0vy.moondlc.m0vyguard.jr;
import us.m0vy.moondlc.m0vyguard.zw;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_312.class})
public class MouseMixin
implements tthy {
    @Inject(method={"tick()V"}, at={@At(value="RETURN")})
    private void tick(CallbackInfo ci) {
        if (zw.sda_5() != zw.ttw_4()) {
            GLFW.glfwSetCursor((long)mc.method_22683().method_4490(), (long)zw.sda_5().getCode());
        }
        zw.dst_5(zw.sda_5());
        zw.hdhth(bay_2.tdhdh);
    }

    @Inject(method={"onMouseButton(JIII)V"}, at={@At(value="HEAD")})
    private void onMouseButton(long window, int button, int action, int mods, CallbackInfo ci) {
        if (action == 1 || action == 0) {
            Moondlc.getInstance().getEventManager().azj_2(new jr(button, action));
        }
        bdm.dhsl_2().zkhh(new btd_3(button, action, true));
    }

    @Inject(method={"onMouseButton"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/InactivityFpsLimiter;onInput()V")}, cancellable=true)
    public void mousePressHook(long window, int button, int action, int mods, CallbackInfo ci) {
        if (tdhr.dhzn() == null) {
            return;
        }
        if (ttq.tdhd_4().hwz_2(button, action)) {
            ci.cancel();
            return;
        }
        if (tsy.baz_4().jzdh(button, action)) {
            ci.cancel();
            return;
        }
        bzz.zhs_7().shzf().forEach((s, draggable) -> {
            if (draggable.getModule().rgha_2()) {
                if (action == 0) {
                    draggable.onRelease(button);
                } else if (action == 1 && taa.tdt_8().shst_2((tbb)draggable)) {
                    draggable.onClick(button);
                }
            }
        });
    }

    @Inject(method={"onMouseScroll(JDD)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMouseScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
        if (vertical != 0.0) {
            tbr scrollEvent = new tbr(vertical);
            Moondlc.getInstance().getEventManager().azj_2(scrollEvent);
            if (scrollEvent.tsm_3()) {
                ci.cancel();
                return;
            }
        }
        if (ttq.tdhd_4().alr(horizontal, vertical)) {
            ci.cancel();
            return;
        }
        if (tsy.baz_4().tjd_4(horizontal, vertical)) {
            ci.cancel();
        }
    }
}

