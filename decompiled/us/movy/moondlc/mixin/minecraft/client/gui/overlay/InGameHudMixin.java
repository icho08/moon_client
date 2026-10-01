/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_266
 *  net.minecraft.class_310
 *  net.minecraft.class_329
 *  net.minecraft.class_332
 *  net.minecraft.class_355
 *  net.minecraft.class_4061
 *  net.minecraft.class_8646
 *  net.minecraft.class_9779
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package us.movy.moondlc.mixin.minecraft.client.gui.overlay;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_4061;
import net.minecraft.class_8646;
import net.minecraft.class_9779;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bjl;
import us.m0vy.moondlc.m0vyguard.bdt_2;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.bsz_3;
import us.m0vy.moondlc.m0vyguard.bsf_2;
import us.m0vy.moondlc.m0vyguard.bdz_4;
import us.m0vy.moondlc.m0vyguard.btn_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bghn;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.hz_2;
import us.m0vy.moondlc.m0vyguard.sk;
import us.m0vy.moondlc.m0vyguard.sh_3;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.ms_2;
import us.m0vy.moondlc.m0vyguard.wz_2;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_329.class})
public abstract class InGameHudMixin
implements tthy {
    @Shadow
    @Nullable
    private class_2561 field_2018;
    @Shadow
    private int field_2041;
    @Shadow
    private boolean field_2038;
    @Shadow
    private int field_2040;
    @Shadow
    private class_1799 field_2031;

    @Shadow
    public abstract class_355 method_1750();

    @ModifyExpressionValue(method={"renderCrosshair(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/SimpleOption;getValue()Ljava/lang/Object;", ordinal=1)})
    private Object Moondlc$suppressExpandedHitIndicator(Object original) {
        bsz_3 hitbox = bsz_3.skhy();
        return hitbox != null && hitbox.jdhw() ? class_4061.field_18151 : original;
    }

    @Inject(method={"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderScoreboardSidebarHook(class_332 context, class_266 objective, CallbackInfo ci) {
        sk removals;
        if (btd_2.bzf_2()) {
            return;
        }
        if (objective.method_1114().getString().contains("Đ Đ˝Đ°Ń€Ń…Đ¸ŃŹ") && (bghn.raa_3() || bghn.zagh_3())) {
            try {
                bghn.rlkh = Integer.parseInt(objective.method_1114().getString().split("-")[1].trim());
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class)) != null && removals.tbth_2()) {
            ci.cancel();
            return;
        }
        bza_4 hudModule = (bza_4)Moondlc.getInstance().getModuleManager().dfr_2(bza_4.class);
        if (hudModule != null && hudModule.rgha_2() && hudModule.thaz()) {
            bdz_4.bsdh(context, objective);
            ci.cancel();
        }
    }

    @Inject(method={"renderPortalOverlay(Lnet/minecraft/client/gui/DrawContext;F)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderPortalOverlayHook(class_332 context, float nauseaStrength, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals.rgha_2() && removals.dhhsh_2().alh()) {
            ci.cancel();
        }
    }

    @ModifyArgs(method={"renderMiscOverlays(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/InGameHud;renderOverlay(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/util/Identifier;F)V", ordinal=0))
    private void onRenderPumpkinOverlay(Args args) {
        if (btd_2.bzf_2()) {
            return;
        }
        sk removals = (sk)Moondlc.getInstance().getModuleManager().dfr_2(sk.class);
        if (removals.rgha_2() && removals.ghh().alh()) {
            args.set(2, (Object)Float.valueOf(0.0f));
        }
    }

    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="HEAD")})
    public void triggerPreHudRenderEvent(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        wz_2.skr(context.method_51448());
        ghdh_3 customDrawContext = ghdh_3.of(context);
        Moondlc.getInstance().getEventManager().azj_2(new bsf_2(customDrawContext, tickCounter.method_60637(false)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="RETURN")})
    public void triggerPostHudRenderEvent(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        ghdh_3 customDrawContext = ghdh_3.of(context);
        Moondlc.getInstance().getEventManager().azj_2(new hz_2(customDrawContext, tickCounter.method_60637(false)));
        bdt_2.hqh().tkn_2(context, tickCounter);
        bza.getInstance().getModuleManager().ky();
        class_310 mc = class_310.method_1551();
        if (!this.Moondlc$shouldHandleAnimatedPlayerList()) {
            return;
        }
        if (this.Moondlc$getPlayerListEase() > 0.01f && mc.field_1687 != null && mc.field_1724 != null && this.method_1750() != null) {
            try {
                ms_2.sash_3(true);
                class_266 objective = mc.field_1687.method_8428().method_1189(class_8646.field_45156);
                this.method_1750().method_1919(context, context.method_51421(), mc.field_1687.method_8428(), objective);
            }
            finally {
                ms_2.sash_3(false);
            }
        }
    }

    @Inject(method={"renderMainHud(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="TAIL")})
    private void triggerHudRenderEvent(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        ghdh_3 customDrawContext = ghdh_3.of(context);
        bdht.ttb_2.hhgh();
        Moondlc.getInstance().getEventManager().azj_2(new bbgh(customDrawContext, tickCounter.method_60637(false)));
    }

    @Inject(method={"renderStatusEffectOverlay(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderStatusEffectOverlay(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        bza_4 hud = (bza_4)Moondlc.getInstance().getModuleManager().dfr_2(bza_4.class);
        if (hud != null && hud.rgha_2() && hud.jry.tzn_3("Potions")) {
            ci.cancel();
        }
    }

    @Inject(method={"renderCrosshair(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderCrosshair(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (((bjl)Moondlc.getInstance().getModuleManager().dfr_2(bjl.class)).rgha_2()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderHotbar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHotbar(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (this.Moondlc$useCustomHotBar()) {
            ci.cancel();
        } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    @Inject(method={"renderStatusBars(Lnet/minecraft/client/gui/DrawContext;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderStatusBars(class_332 context, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (this.Moondlc$useCustomHotBar() && this.Moondlc$useCustomStatusBars()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderExperienceBar(Lnet/minecraft/client/gui/DrawContext;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderExperienceBar(class_332 context, int x, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (this.Moondlc$useCustomHotBar() && this.Moondlc$useCustomStatusBars() && this.Moondlc$useCustomXpBar()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderExperienceLevel(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderExperienceLevel(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (this.Moondlc$useCustomHotBar() && this.Moondlc$useCustomStatusBars() && this.Moondlc$useCustomXpBar()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderHeldItemTooltip(Lnet/minecraft/client/gui/DrawContext;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHeldItemTooltip(class_332 context, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (this.Moondlc$useCustomHotBar()) {
            bdt_2.hqh().bhs_3(context, this.field_2031, this.field_2040);
            ci.cancel();
        }
    }

    @Inject(method={"renderOverlayMessage(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderOverlayMessage(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        if (this.Moondlc$useCustomHotBar()) {
            bdt_2.hqh().khzz(context, tickCounter, this.field_2018, this.field_2041, this.field_2038);
            ci.cancel();
        }
    }

    @Unique
    private float Moondlc$getPlayerListEase() {
        sh_3 smoothTab = (sh_3)Moondlc.getInstance().getModuleManager().dfr_2(sh_3.class);
        if (smoothTab != null && smoothTab.rgha_2()) {
            return (float)smoothTab.shzs().khbk();
        }
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        if (animation != null) {
            return animation.hzm();
        }
        return 0.0f;
    }

    @Unique
    private boolean Moondlc$shouldHandleAnimatedPlayerList() {
        sh_3 smoothTabModule = (sh_3)Moondlc.getInstance().getModuleManager().dfr_2(sh_3.class);
        if (smoothTabModule != null && smoothTabModule.rgha_2()) {
            return true;
        }
        btn_2 animation = (btn_2)Moondlc.getInstance().getModuleManager().dfr_2(btn_2.class);
        return animation != null && animation.rgha_2() && animation.rhk();
    }

    @Unique
    private boolean Moondlc$useCustomHotBar() {
        bza_4 hudModule = (bza_4)Moondlc.getInstance().getModuleManager().dfr_2(bza_4.class);
        return hudModule != null && hudModule.hfh();
    }

    @Unique
    private boolean Moondlc$useCustomStatusBars() {
        bza_4 hudModule = (bza_4)Moondlc.getInstance().getModuleManager().dfr_2(bza_4.class);
        return hudModule != null && hudModule.skha_2.dhbn("Bars");
    }

    @Unique
    private boolean Moondlc$useCustomXpBar() {
        bza_4 hudModule = (bza_4)Moondlc.getInstance().getModuleManager().dfr_2(bza_4.class);
        return hudModule != null && hudModule.hkhs_2.hdh();
    }
}

