/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_342
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 *  net.minecraft.class_4717
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client.gui.screen;

import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_408;
import net.minecraft.class_437;
import net.minecraft.class_4717;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.tbr;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.thk;
import us.m0vy.moondlc.m0vyguard.thgh_3;
import us.m0vy.moondlc.m0vyguard.jq;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_408.class})
public abstract class ChatScreenMixin
extends class_437
implements tthy {
    @Shadow
    protected class_342 field_2382;
    @Shadow
    private class_4717 field_21616;

    protected ChatScreenMixin(class_2561 title) {
        super(title);
    }

    @Inject(method={"sendMessage(Ljava/lang/String;Z)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSendMessage(String text, boolean addToHistory, CallbackInfo ci) {
        if (Moondlc.getInstance().getCommandManager().ssq(text)) {
            ChatScreenMixin.mc.field_1705.method_1743().method_1803(text);
            ci.cancel();
        }
    }

    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;IIF)V"}, at={@At(value="RETURN")})
    public void render(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        ghdh_3 customCtx = ghdh_3.of(context);
        Moondlc.getInstance().getEventManager().azj_2(new bbgh(customCtx, delta));
        Moondlc.getInstance().getEventManager().azj_2(new jq(customCtx, delta));
    }

    @Inject(method={"mouseClicked(DDI)Z"}, at={@At(value="HEAD")})
    private void onMouseClick(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        Moondlc.getInstance().getEventManager().azj_2(new thk((float)mouseX, (float)mouseY, button));
    }

    public boolean method_25406(double mouseX, double mouseY, int button) {
        Moondlc.getInstance().getEventManager().azj_2(new thgh_3((float)mouseX, (float)mouseY, button));
        return super.method_25406(mouseX, mouseY, button);
    }

    @Inject(method={"mouseScrolled(DDDD)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount, CallbackInfoReturnable<Boolean> cir) {
        tbr event = new tbr(verticalAmount);
        Moondlc.getInstance().getEventManager().azj_2(event);
        if (event.tsm_3()) {
            cir.setReturnValue((Object)true);
        }
    }
}

