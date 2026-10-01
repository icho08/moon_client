/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_364
 *  net.minecraft.class_3675
 *  net.minecraft.class_4185
 *  net.minecraft.class_437
 *  net.minecraft.class_465
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client.gui.screen;

import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_364;
import net.minecraft.class_3675;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.badh;
import us.m0vy.moondlc.m0vyguard.bha_2;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.brq;
import us.m0vy.moondlc.m0vyguard.bst;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.m0vy.moondlc.m0vyguard.bfd;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.tkhf;
import us.m0vy.moondlc.m0vyguard.tdhr;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.nf;
import us.m0vy.moondlc.m0vyguard.wth;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_465.class})
public abstract class HandledScreenMixin
extends class_437
implements tthy {
    @Unique
    private final tkhd_2 timer = new tkhd_2();
    @Unique
    private final brq timerUtil = new brq();
    @Unique
    private long moondlc$openedAt;
    @Unique
    private boolean moondlc$inventoryAnimationActive;
    @Shadow
    @Nullable
    protected class_1735 field_2787;

    protected HandledScreenMixin(class_2561 title) {
        super(title);
    }

    @Shadow
    protected abstract boolean method_2387(class_1735 var1, double var2, double var4);

    @Shadow
    protected abstract void method_2383(class_1735 var1, int var2, int var3, class_1713 var4);

    @Inject(method={"drawSlot"}, at={@At(value="HEAD")})
    private void onDrawSlotHead(class_332 context, class_1735 slot, CallbackInfo ci) {
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation != null && animation.rgha_2() && animation.shdha_2()) {
            boolean focused = slot == this.field_2787 && slot.method_7681();
            float scale = animation.dhthth(slot, focused);
            context.method_51448().method_22903();
            context.method_51448().method_46416((float)slot.field_7873 + 8.0f, (float)slot.field_7872 + 8.0f, 0.0f);
            context.method_51448().method_22905(scale, scale, 1.0f);
            context.method_51448().method_46416(-((float)slot.field_7873 + 8.0f), -((float)slot.field_7872 + 8.0f), 0.0f);
        }
    }

    @Inject(method={"drawSlot"}, at={@At(value="RETURN")})
    private void onDrawSlotTail(class_332 context, class_1735 slot, CallbackInfo ci) {
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation != null && animation.rgha_2() && animation.shdha_2()) {
            context.method_51448().method_22909();
        }
    }

    @Inject(method={"init"}, at={@At(value="TAIL")})
    private void onInit(CallbackInfo ci) {
        this.moondlc$openedAt = System.currentTimeMillis();
        tkhf event = new tkhf(this);
        wth.jrt_2().zkhh(event);
        for (class_4185 button : event.shtgh_2()) {
            this.method_37063((class_364)button);
        }
    }

    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;IIF)V"}, at={@At(value="HEAD")})
    private void drawScreenHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        this.moondlc$pushInventoryAnimation(context);
        if (tdhr.dhzn() != null) {
            for (int i = 0; i < tdhr.dhzn().field_7512.field_7761.size(); ++i) {
                badh mouseTweaks;
                class_1735 slot = (class_1735)tdhr.dhzn().field_7512.field_7761.get(i);
                if (!this.method_2387(slot, mouseX, mouseY) || !slot.method_7682() || !(mouseTweaks = badh.zaj()).rgha_2() || !this.shouldUse() || !this.mouseIsHolding() || !this.timerUtil.sza((long)mouseTweaks.shhh.hkj())) continue;
                this.method_2383(slot, slot.field_7874, 0, class_1713.field_7794);
                this.timerUtil.tshf_2();
            }
        }
    }

    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;IIF)V"}, at={@At(value="TAIL")})
    private void onRender(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        ghdh_3 customDrawContext = ghdh_3.of(context);
        Moondlc.getInstance().getEventManager().azj_2(new bst(customDrawContext, delta));
        for (class_1735 slot : HandledScreenMixin.mc.field_1724.field_7512.field_7761) {
            bha_2 invUtils = (bha_2)Moondlc.getInstance().getModuleManager().dfr_2(bha_2.class);
            if (!this.method_2387(slot, mouseX, mouseY) || !slot.method_7682() || !invUtils.rgha_2() || !invUtils.shdt_4().alh() || !this.timer.tagh((long)invUtils.shjt().thw_5()) || !class_3675.method_15987((long)mc.method_22683().method_4490(), (int)340) || GLFW.glfwGetMouseButton((long)mc.method_22683().method_4490(), (int)0) != 1) continue;
            this.method_2383(slot, slot.field_7874, 0, class_1713.field_7794);
            this.timer.zat();
        }
        this.moondlc$popInventoryAnimation(context);
    }

    @Inject(method={"mouseClicked(DDI)Z"}, at={@At(value="HEAD")})
    private void onMouseClick(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        Moondlc.getInstance().getEventManager().azj_2(new nf((float)mouseX, (float)mouseY, button));
    }

    @Inject(method={"mouseReleased(DDI)Z"}, at={@At(value="HEAD")})
    public void mouseReleased(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        Moondlc.getInstance().getEventManager().azj_2(new bfd((float)mouseX, (float)mouseY, button));
    }

    @Unique
    private boolean shouldUse() {
        return class_3675.method_15987((long)mc.method_22683().method_4490(), (int)340) || class_3675.method_15987((long)mc.method_22683().method_4490(), (int)344);
    }

    @Unique
    private boolean mouseIsHolding() {
        return brz.rzdh(-100);
    }

    @Unique
    private void moondlc$pushInventoryAnimation(class_332 context) {
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        boolean bl = this.moondlc$inventoryAnimationActive = animation != null && animation.rgha_2() && animation.adht_2();
        if (!this.moondlc$inventoryAnimationActive) {
            return;
        }
        float scale = animation.thkw(this.moondlc$openedAt);
        float centerX = (float)this.field_22789 / 2.0f;
        float centerY = (float)this.field_22790 / 2.0f;
        context.method_51448().method_22903();
        context.method_51448().method_46416(centerX, centerY, 0.0f);
        context.method_51448().method_22905(scale, scale, 1.0f);
        context.method_51448().method_46416(-centerX, -centerY, 0.0f);
    }

    @Unique
    private void moondlc$popInventoryAnimation(class_332 context) {
        if (this.moondlc$inventoryAnimationActive) {
            context.method_51448().method_22909();
            this.moondlc$inventoryAnimationActive = false;
        }
    }
}

