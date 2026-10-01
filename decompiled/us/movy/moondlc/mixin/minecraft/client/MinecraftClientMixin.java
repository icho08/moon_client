/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1269$class_9860
 *  net.minecraft.class_1269$class_9861
 *  net.minecraft.class_156
 *  net.minecraft.class_1657
 *  net.minecraft.class_239
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 *  net.minecraft.class_542
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.client;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_156;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_542;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.Nk;
import us.m0vy.moondlc.m0vyguard.brj;
import us.m0vy.moondlc.m0vyguard.bnr;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.tzs_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.sq_2;
import us.m0vy.moondlc.m0vyguard.mkh;
import us.m0vy.moondlc.m0vyguard.nk;
import us.m0vy.moondlc.m0vyguard.ya_2;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.ClientPlayerInteractionManagerAccessor;
import us.movy.moondlc.protection.client.MinecraftClientMixinProtection;

@Mixin(value={class_310.class})
public class MinecraftClientMixin {
    @Shadow
    public class_746 field_1724;
    @Shadow
    public class_636 field_1761;
    @Shadow
    public class_239 field_1765;
    @Shadow
    private int field_1752;
    @Shadow
    private int field_1771;
    @Unique
    private boolean Moondlc$firstTick = true;
    @Unique
    private long Moondlc$lastHookTime = class_156.method_648();
    @Unique
    private int Moondlc$accumulatedCalls = 0;

    @Inject(method={"method_1523(Z)V"}, at={@At(value="HEAD")})
    public void gameLoopHook(boolean tick, CallbackInfo ci) {
        long timeNano = class_156.method_648();
        long deltaTime = timeNano - this.Moondlc$lastHookTime;
        this.Moondlc$accumulatedCalls += (int)(deltaTime / 4166666L);
        this.Moondlc$lastHookTime += (long)this.Moondlc$accumulatedCalls * 4166666L;
        this.Moondlc$accumulatedCalls = Math.min(this.Moondlc$accumulatedCalls, 240);
        while (this.Moondlc$accumulatedCalls > 0) {
            tzs_2.dd_3().jqy();
            Moondlc.getInstance().getEventManager().azj_2(new sq_2());
            --this.Moondlc$accumulatedCalls;
        }
    }

    @Inject(method={"method_1574()V"}, at={@At(value="HEAD")})
    public void tick(CallbackInfo ci) {
        dl.sbth((class_310)this);
        if (this.Moondlc$firstTick) {
            this.Moondlc$firstTick = false;
            try {
                bnr atlas = bnr.thzf_2(16, 16);
                atlas.dwdh_2(Moondlc.id("textures/penises/combat.penis"));
                atlas.dwdh_2(Moondlc.id("textures/penises/movement.penis"));
                atlas.dwdh_2(Moondlc.id("textures/penises/visuals.penis"));
                atlas.dwdh_2(Moondlc.id("textures/penises/player.penis"));
                atlas.dwdh_2(Moondlc.id("textures/penises/other.penis"));
                atlas.dwdh_2(Moondlc.id("textures/penises/search.penis"));
                atlas.thsgh_2();
                bnr atlas12 = bnr.thzf_2(12, 12);
                atlas12.dwdh_2(Moondlc.id("textures/penises/check_enable.penis"));
                atlas12.dwdh_2(Moondlc.id("textures/penises/check_disable.penis"));
                atlas12.thsgh_2();
            }
            catch (Exception e) {
                Moondlc.dhrn.error("Failed to load penis atlas animations", (Throwable)e);
            }
        }
        Moondlc.getInstance().getEventManager().azj_2(new ya_2());
        Nk noDelay = (Nk)Moondlc.getInstance().getModuleManager().dfr_2(Nk.class);
        if (noDelay != null && noDelay.rgha_2() && noDelay.ncU().shzl()) {
            this.field_1752 = Math.min(this.field_1752, noDelay.nbD());
        }
        if (noDelay != null && noDelay.rgha_2() && noDelay.neu().shzl()) {
            this.field_1771 = Math.min(this.field_1771, noDelay.nit());
        }
        if (noDelay != null && noDelay.rgha_2() && noDelay.nhT().shzl() && this.field_1761 != null) {
            ((ClientPlayerInteractionManagerAccessor)this.field_1761).setBlockBreakingCooldown(noDelay.ngl());
        }
        nk.brth((class_310)this);
    }

    @Inject(method={"method_1583()V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Moondlc$useItemThroughAntiTrapEntity(CallbackInfo ci) {
        class_3966 hitResult;
        block10: {
            block9: {
                tkhdh aura = tkhdh.zkhr_2();
                if (aura != null && aura.thws()) {
                    ci.cancel();
                    return;
                }
                mkh anchorTap = mkh.khta();
                if (anchorTap != null && anchorTap.ththf()) {
                    this.field_1752 = 4;
                    ci.cancel();
                    return;
                }
                class_239 class_2392 = this.field_1765;
                if (!(class_2392 instanceof class_3966)) break block9;
                hitResult = (class_3966)class_2392;
                if (this.field_1724 != null && this.field_1761 != null && !this.field_1761.method_2923() && !this.field_1724.method_3144()) break block10;
            }
            return;
        }
        brj antiTrap = brj.dhqf();
        if (antiTrap == null || !antiTrap.hth_3(hitResult.method_17782())) {
            return;
        }
        this.field_1752 = 4;
        for (class_1268 hand : class_1268.values()) {
            if (!this.field_1724.method_5998(hand).method_45435(this.field_1724.method_37908().method_45162())) {
                ci.cancel();
                return;
            }
            class_1269 result = this.field_1761.method_2919((class_1657)this.field_1724, hand);
            if (!(result instanceof class_1269.class_9860)) continue;
            class_1269.class_9860 success = (class_1269.class_9860)result;
            if (success.comp_2909() == class_1269.class_9861.field_52427) {
                this.field_1724.method_6104(hand);
            }
            ci.cancel();
            return;
        }
        ci.cancel();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Inject(method={"<init>(Lnet/minecraft/class_542;)V"}, at={@At(value="FIELD", target="Lnet/minecraft/class_310;field_1704:Lnet/minecraft/class_1041;", shift=At.Shift.AFTER, opcode=181)})
    public void initializeClient(class_542 args, CallbackInfo ci) {
        block14: {
            MinecraftClientMixinProtection.init();
            try {
                class_310 client = (class_310)this;
                Moondlc.dhrn.info("[MinecraftClientMixin] initializeClient: client=" + String.valueOf(client) + ", window=" + String.valueOf(client == null ? null : client.method_22683()));
                if (client != null && client.method_22683() != null) {
                    long handle = client.method_22683().method_4490();
                    int width = client.method_22683().method_4480();
                    int height = client.method_22683().method_4507();
                    int fbWidth = client.method_22683().method_4489();
                    int fbHeight = client.method_22683().method_4506();
                    int x = client.method_22683().method_4499();
                    int y = client.method_22683().method_4477();
                    int visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                    int iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                    int maximized = GLFW.glfwGetWindowAttrib((long)handle, (int)131080);
                    int focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                    Moondlc.dhrn.info(String.format("[MinecraftClientMixin] initializeClient stats before show: handle=%d, size=%dx%d, fbSize=%dx%d, pos=(%d,%d), visible=%d, iconified=%d, maximized=%d, focused=%d", handle, width, height, fbWidth, fbHeight, x, y, visible, iconified, maximized, focused));
                    GLFW.glfwSetWindowPos((long)handle, (int)100, (int)100);
                    GLFW.glfwShowWindow((long)handle);
                    GLFW.glfwRestoreWindow((long)handle);
                    GLFW.glfwFocusWindow((long)handle);
                    visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                    iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                    focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                    Moondlc.dhrn.info(String.format("[MinecraftClientMixin] initializeClient stats after show: visible=%d, iconified=%d, focused=%d, pos=(%d,%d)", visible, iconified, focused, client.method_22683().method_4499(), client.method_22683().method_4477()));
                    break block14;
                }
                Moondlc.dhrn.warn("[MinecraftClientMixin] initializeClient: window was null!");
            }
            catch (Exception e) {
                Moondlc.dhrn.error("Failed to show window after init", (Throwable)e);
            }
            break block14;
            catch (Exception e) {
                try {
                    Moondlc.dhrn.error("Failed to initialize Moondlc", (Throwable)e);
                }
                catch (Throwable throwable) {
                    try {
                        class_310 client = (class_310)this;
                        Moondlc.dhrn.info("[MinecraftClientMixin] initializeClient: client=" + String.valueOf(client) + ", window=" + String.valueOf(client == null ? null : client.method_22683()));
                        if (client != null && client.method_22683() != null) {
                            long handle = client.method_22683().method_4490();
                            int width = client.method_22683().method_4480();
                            int height = client.method_22683().method_4507();
                            int fbWidth = client.method_22683().method_4489();
                            int fbHeight = client.method_22683().method_4506();
                            int x = client.method_22683().method_4499();
                            int y = client.method_22683().method_4477();
                            int visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                            int iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                            int maximized = GLFW.glfwGetWindowAttrib((long)handle, (int)131080);
                            int focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                            Moondlc.dhrn.info(String.format("[MinecraftClientMixin] initializeClient stats before show: handle=%d, size=%dx%d, fbSize=%dx%d, pos=(%d,%d), visible=%d, iconified=%d, maximized=%d, focused=%d", handle, width, height, fbWidth, fbHeight, x, y, visible, iconified, maximized, focused));
                            GLFW.glfwSetWindowPos((long)handle, (int)100, (int)100);
                            GLFW.glfwShowWindow((long)handle);
                            GLFW.glfwRestoreWindow((long)handle);
                            GLFW.glfwFocusWindow((long)handle);
                            visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                            iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                            focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                            Moondlc.dhrn.info(String.format("[MinecraftClientMixin] initializeClient stats after show: visible=%d, iconified=%d, focused=%d, pos=(%d,%d)", visible, iconified, focused, client.method_22683().method_4499(), client.method_22683().method_4477()));
                        } else {
                            Moondlc.dhrn.warn("[MinecraftClientMixin] initializeClient: window was null!");
                        }
                    }
                    catch (Exception e2) {
                        Moondlc.dhrn.error("Failed to show window after init", (Throwable)e2);
                    }
                    throw throwable;
                }
                try {
                    class_310 client = (class_310)this;
                    Moondlc.dhrn.info("[MinecraftClientMixin] initializeClient: client=" + String.valueOf(client) + ", window=" + String.valueOf(client == null ? null : client.method_22683()));
                    if (client != null && client.method_22683() != null) {
                        long handle = client.method_22683().method_4490();
                        int width = client.method_22683().method_4480();
                        int height = client.method_22683().method_4507();
                        int fbWidth = client.method_22683().method_4489();
                        int fbHeight = client.method_22683().method_4506();
                        int x = client.method_22683().method_4499();
                        int y = client.method_22683().method_4477();
                        int visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                        int iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                        int maximized = GLFW.glfwGetWindowAttrib((long)handle, (int)131080);
                        int focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                        Moondlc.dhrn.info(String.format("[MinecraftClientMixin] initializeClient stats before show: handle=%d, size=%dx%d, fbSize=%dx%d, pos=(%d,%d), visible=%d, iconified=%d, maximized=%d, focused=%d", handle, width, height, fbWidth, fbHeight, x, y, visible, iconified, maximized, focused));
                        GLFW.glfwSetWindowPos((long)handle, (int)100, (int)100);
                        GLFW.glfwShowWindow((long)handle);
                        GLFW.glfwRestoreWindow((long)handle);
                        GLFW.glfwFocusWindow((long)handle);
                        visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                        iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                        focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                        Moondlc.dhrn.info(String.format("[MinecraftClientMixin] initializeClient stats after show: visible=%d, iconified=%d, focused=%d, pos=(%d,%d)", visible, iconified, focused, client.method_22683().method_4499(), client.method_22683().method_4477()));
                    }
                    Moondlc.dhrn.warn("[MinecraftClientMixin] initializeClient: window was null!");
                }
                catch (Exception e3) {
                    Moondlc.dhrn.error("Failed to show window after init", (Throwable)e3);
                }
            }
        }
    }

    @Inject(method={"<init>(Lnet/minecraft/class_542;)V"}, at={@At(value="RETURN")})
    public void endInitialize(class_542 args, CallbackInfo ci) {
        try {
            class_310 client = (class_310)this;
            Moondlc.dhrn.info("[MinecraftClientMixin] endInitialize: client=" + String.valueOf(client) + ", window=" + String.valueOf(client == null ? null : client.method_22683()));
            if (client != null && client.method_22683() != null) {
                long handle = client.method_22683().method_4490();
                int visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                int iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                int focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                Moondlc.dhrn.info(String.format("[MinecraftClientMixin] endInitialize stats before show: visible=%d, iconified=%d, focused=%d, pos=(%d,%d)", visible, iconified, focused, client.method_22683().method_4499(), client.method_22683().method_4477()));
                GLFW.glfwShowWindow((long)handle);
                GLFW.glfwRestoreWindow((long)handle);
                GLFW.glfwFocusWindow((long)handle);
                visible = GLFW.glfwGetWindowAttrib((long)handle, (int)131076);
                iconified = GLFW.glfwGetWindowAttrib((long)handle, (int)131074);
                focused = GLFW.glfwGetWindowAttrib((long)handle, (int)131073);
                Moondlc.dhrn.info(String.format("[MinecraftClientMixin] endInitialize stats after show: visible=%d, iconified=%d, focused=%d, pos=(%d,%d)", visible, iconified, focused, client.method_22683().method_4499(), client.method_22683().method_4477()));
            } else {
                Moondlc.dhrn.warn("[MinecraftClientMixin] endInitialize: window was null!");
            }
        }
        catch (Exception e) {
            Moondlc.dhrn.error("Failed to show window at end of init", (Throwable)e);
        }
    }

    @Inject(method={"method_1490()V"}, at={@At(value="TAIL")})
    public void shutdownClient(CallbackInfo ci) {
        MinecraftClientMixinProtection.shutdown();
    }

    @Inject(method={"method_24287()Ljava/lang/String;"}, at={@At(value="HEAD")}, cancellable=true)
    public void changeWindowTitle(CallbackInfoReturnable<String> cir) {
        MinecraftClientMixinProtection.updateTitle(cir);
        if (!cir.isCancelled()) {
            cir.setReturnValue((Object)nk.azj());
        }
    }
}

