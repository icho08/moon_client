/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 *  net.minecraft.class_1007
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_276
 *  net.minecraft.class_284
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_591
 *  net.minecraft.class_5944
 *  net.minecraft.class_630
 *  net.minecraft.class_6367
 *  net.minecraft.class_742
 *  net.minecraft.class_8685$class_7920
 *  net.minecraft.class_897
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_5944;
import net.minecraft.class_630;
import net.minecraft.class_6367;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import net.minecraft.class_897;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.thd_2;
import us.m0vy.moondlc.m0vyguard.fth;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.render.accessor.ILivingEntityRendererAccessor;

public class tdw {
    private static tdw thdd;
    private static final class_310 mc;
    public static final fth zzr_2;
    public static final fth rld_2;
    public static final fth d_2;
    public static final fth khdd_2;
    private static final class_10156 thtsh_2;
    private static final class_10156 shl_2;
    private static final class_10156 shts;
    private static final class_10156 shthq;
    private class_276 dthr;
    private final List tsth_2 = new ArrayList();
    private int thks = -1;
    private int rfz = -1;
    private boolean bzd_4 = false;
    private static final int e3q6vtngab = -247434420;
    private static final int y2iizn9kes5s7 = -1817998339;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rx3acrhq;

    public static tdw skhn() {
        if (thdd == null) {
            thdd = new tdw();
        }
        return thdd;
    }

    public void byd(thd_2 thd2, class_4587 class_45872, float f) {
        if (tdw.mc.field_1687 == null || tdw.mc.field_1724 == null) {
            return;
        }
        this.szd();
        if (this.dthr == null) {
            return;
        }
        this.dthr.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
        this.dthr.method_1230();
        this.dthr.method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        for (class_1657 class_16572 : tdw.mc.field_1687.method_18456()) {
            if (!this.rdz(thd2, class_16572)) continue;
            this.zms_4(class_45872, class_16572, f);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        mc.method_1522().method_1235(true);
        this.bzd_4 = true;
    }

    public void zghf(thd_2 thd2) {
        if (!this.bzd_4) {
            return;
        }
        this.bzd_4 = false;
        int n = Math.max(1, (int)thd2.zsk_4().thw_5());
        this.wd_2(n);
        class_5944 class_59442 = RenderSystem.setShader((class_10156)thtsh_2);
        if (class_59442 == null) {
            return;
        }
        int n2 = this.dthr.method_30277();
        for (int i = 0; i < n; ++i) {
            class_276 class_2762 = (class_276)this.tsth_2.get(i);
            class_2762.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
            class_2762.method_1230();
            class_2762.method_1235(true);
            RenderSystem.setShader((class_10156)thtsh_2);
            RenderSystem.setShaderTexture((int)0, (int)n2);
            this.jath(class_59442, class_2762.field_1482, class_2762.field_1481, 1.0f + (float)i);
            this.dghz_3();
            n2 = class_2762.method_30277();
        }
        class_5944 class_59443 = RenderSystem.setShader((class_10156)shl_2);
        if (class_59443 != null) {
            for (int i = n - 1; i >= 1; --i) {
                class_276 class_2763 = (class_276)this.tsth_2.get(i - 1);
                class_2763.method_1235(true);
                RenderSystem.setShader((class_10156)shl_2);
                RenderSystem.setShaderTexture((int)0, (int)n2);
                this.jath(class_59443, class_2763.field_1482, class_2763.field_1481, 1.0f + (float)i);
                this.thbd(class_59443, "color", 1.0f, 1.0f, 1.0f);
                this.dghz_3();
                n2 = class_2763.method_30277();
            }
        }
        mc.method_1522().method_1235(true);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.disableDepthTest();
        class_5944 class_59444 = RenderSystem.setShader((class_10156)shts);
        if (class_59444 != null) {
            boolean bl = thd2.dsf_3().shzl();
            byq byq2 = thd2.zkth().sdsh_4();
            byq byq3 = thd2.hf_2().sdsh_4();
            boolean bl2 = thd2.shss_2().shzl();
            float f = thd2.shjkh().thw_5();
            float f2 = thd2.khsq().thw_5();
            float f3 = (float)(System.currentTimeMillis() % 10000000L) / 1000.0f;
            int n3 = Math.max(1, mc.method_22683().method_4506());
            RenderSystem.setShader((class_10156)shts);
            RenderSystem.setShaderTexture((int)0, (int)n2);
            RenderSystem.setShaderTexture((int)1, (int)this.dthr.method_30277());
            this.thbd(class_59444, "glowColor1", byq2.sbk() / 255.0f, byq2.srl() / 255.0f, byq2.shsl_2() / 255.0f);
            this.thbd(class_59444, "glowColor2", byq3.sbk() / 255.0f, byq3.srl() / 255.0f, byq3.shsl_2() / 255.0f);
            this.bhf(class_59444, "exposure", thd2.khzd().thw_5());
            this.bhf(class_59444, "autoColor", bl ? 1.0f : 0.0f);
            this.bhf(class_59444, "saturation", thd2.khf().thw_5());
            this.bhf(class_59444, "rainbow", !bl && bl2 ? 1.0f : 0.0f);
            this.bhf(class_59444, "rainbowTime", f3);
            this.bhf(class_59444, "rainbowSpeed", f);
            this.bhf(class_59444, "rainbowScale", f2);
            this.bhf(class_59444, "screenH", n3);
            this.dghz_3();
        }
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        mc.method_1522().method_1235(true);
        if (thd2.shtb().shzl()) {
            this.tst_4(thd2);
        }
    }

    public void bzn_2() {
        this.bzd_4 = false;
    }

    public void thfn() {
        if (this.dthr != null) {
            this.dthr.method_1238();
            this.dthr = null;
        }
        this.tsth_2.forEach(class_276::method_1238);
        this.tsth_2.clear();
        this.thks = -1;
        this.rfz = -1;
        this.bzd_4 = false;
    }

    private void tst_4(thd_2 thd2) {
        class_5944 class_59442 = RenderSystem.setShader((class_10156)shthq);
        if (class_59442 == null) {
            return;
        }
        boolean bl = thd2.dsf_3().shzl();
        boolean bl2 = !bl && thd2.shss_2().shzl();
        byq byq2 = thd2.hhh_2().sdsh_4();
        float f = byq2.tzdh_2() / 255.0f;
        int n = Math.max(1, mc.method_22683().method_4489());
        int n2 = Math.max(1, mc.method_22683().method_4506());
        float f2 = (float)(System.currentTimeMillis() % 10000000L) / 1000.0f;
        float f3 = thd2.shjkh().thw_5();
        float f4 = thd2.khsq().thw_5();
        mc.method_1522().method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((int)770, (int)771, (int)0, (int)1);
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)shthq);
        RenderSystem.setShaderTexture((int)0, (int)this.dthr.method_30277());
        if (bl && !this.tsth_2.isEmpty()) {
            RenderSystem.setShaderTexture((int)1, (int)((class_276)this.tsth_2.get(0)).method_30277());
        }
        this.bhf(class_59442, "colorMode", bl ? 2.0f : (bl2 ? 1.0f : 0.0f));
        this.bhf(class_59442, "width", thd2.dtdh_3().thw_5());
        this.zat_6(class_59442, "texelSize", 1.0f / (float)n, 1.0f / (float)n2);
        this.bhf(class_59442, "alpha", bl || bl2 ? 1.0f : f);
        this.bhf(class_59442, "saturation", thd2.khf().thw_5());
        this.bhf(class_59442, "rainbowTime", f2);
        this.bhf(class_59442, "rainbowSpeed", f3);
        this.bhf(class_59442, "rainbowScale", f4);
        this.bhf(class_59442, "screenH", n2);
        this.thbd(class_59442, "solidColor", byq2.sbk() / 255.0f, byq2.srl() / 255.0f, byq2.shsl_2() / 255.0f);
        this.dghz_3();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
        mc.method_1522().method_1235(true);
    }

    private boolean rdz(thd_2 thd2, class_1657 class_16572) {
        boolean bl;
        if (class_16572 == null || !class_16572.method_5805()) {
            return false;
        }
        if (class_16572 == tdw.mc.field_1724) {
            if (!thd2.thdhth().shzl()) {
                return false;
            }
            if (tdw.mc.field_1690.method_31044().method_31034()) {
                return false;
            }
        }
        if ((bl = Moondlc.getInstance().getFriendManager().adhj(class_16572.method_5477().getString())) && !thd2.dsz_6().shzl()) {
            return false;
        }
        double d = thd2.srd_3().thw_5();
        return tdw.mc.field_1724.method_5858((class_1297)class_16572) <= d * d;
    }

    private void zms_4(class_4587 class_45872, class_1657 class_16572, float f) {
        float f2;
        if (!(class_16572 instanceof class_742)) {
            return;
        }
        class_742 class_7423 = (class_742)class_16572;
        class_897 class_8972 = mc.method_1561().method_3953((class_1297)class_16572);
        if (!(class_8972 instanceof class_1007)) {
            return;
        }
        class_1007 class_10072 = (class_1007)class_8972;
        class_10055 class_100552 = class_10072.method_62608();
        class_10072.method_62604(class_7423, class_100552, f);
        class_591 class_5912 = (class_591)class_10072.method_4038();
        class_5912.method_62110(class_100552);
        class_45872.method_22903();
        class_243 class_2432 = tdw.mc.field_1773.method_19418().method_19326();
        class_243 class_2433 = class_16572.method_30950(f);
        class_45872.method_22904(class_2433.field_1352 - class_2432.field_1352, class_2433.field_1351 - class_2432.field_1351, class_2433.field_1350 - class_2432.field_1350);
        if (class_100552.field_53463 != null) {
            f2 = class_100552.field_53331 - 0.1f;
            class_45872.method_46416((float)(-class_100552.field_53463.method_10148()) * f2, 0.0f, (float)(-class_100552.field_53463.method_10165()) * f2);
        }
        f2 = class_100552.field_53453;
        class_45872.method_22905(f2, f2, f2);
        ILivingEntityRendererAccessor iLivingEntityRendererAccessor = (ILivingEntityRendererAccessor)class_10072;
        iLivingEntityRendererAccessor.callSetupTransforms((class_10042)class_100552, class_45872, class_100552.field_53446, f2);
        iLivingEntityRendererAccessor.callScale((class_10042)class_100552, class_45872);
        class_45872.method_22905(-1.0f, -1.0f, 1.0f);
        class_45872.method_46416(0.0f, -1.501f, 0.0f);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_7423.method_52814().comp_1626());
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_630 class_6302 = class_5912.method_63512();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        boolean bl = class_7423.method_52814().comp_1629() == class_8685.class_7920.field_41122;
        this.ttt(class_45872, class_2872, class_6302, class_5912.field_3398, -4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 16.0f, 16.0f);
        this.ttt(class_45872, class_2872, class_6302, class_5912.field_3391, -4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, 20.0f, 20.0f, 28.0f, 32.0f);
        if (bl) {
            this.ttt(class_45872, class_2872, class_6302, class_5912.field_3401, -2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, 44.0f, 16.0f, 47.0f, 28.0f);
            this.ttt(class_45872, class_2872, class_6302, class_5912.field_27433, -1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, 36.0f, 52.0f, 39.0f, 64.0f);
        } else {
            this.ttt(class_45872, class_2872, class_6302, class_5912.field_3401, -3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, 44.0f, 16.0f, 48.0f, 28.0f);
            this.ttt(class_45872, class_2872, class_6302, class_5912.field_27433, -1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, 36.0f, 52.0f, 40.0f, 64.0f);
        }
        this.ttt(class_45872, class_2872, class_6302, class_5912.field_3392, -2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, 4.0f, 16.0f, 8.0f, 28.0f);
        this.ttt(class_45872, class_2872, class_6302, class_5912.field_3397, -2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, 20.0f, 48.0f, 24.0f, 60.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
    }

    private void ttt(class_4587 class_45872, class_287 class_2872, class_630 class_6302, class_630 class_6303, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        class_45872.method_22903();
        class_6302.method_22703(class_45872);
        class_6303.method_22703(class_45872);
        float f11 = 0.0625f;
        float f12 = f * f11;
        float f13 = f2 * f11;
        float f14 = f3 * f11;
        float f15 = (f + f4) * f11;
        float f16 = (f2 + f5) * f11;
        float f17 = (f3 + f6) * f11;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f18 = f7 / 64.0f;
        float f19 = f8 / 64.0f;
        float f20 = f9 / 64.0f;
        float f21 = f10 / 64.0f;
        this.zqz_2(class_2872, matrix4f, f12, f16, f14, f12, f16, f17, f15, f16, f17, f15, f16, f14, f18, f19, f20, f21);
        this.zqz_2(class_2872, matrix4f, f12, f13, f17, f12, f13, f14, f15, f13, f14, f15, f13, f17, f18, f19, f20, f21);
        this.zqz_2(class_2872, matrix4f, f12, f13, f14, f12, f16, f14, f15, f16, f14, f15, f13, f14, f18, f19, f20, f21);
        this.zqz_2(class_2872, matrix4f, f15, f13, f17, f15, f16, f17, f12, f16, f17, f12, f13, f17, f18, f19, f20, f21);
        this.zqz_2(class_2872, matrix4f, f12, f13, f17, f12, f16, f17, f12, f16, f14, f12, f13, f14, f18, f19, f20, f21);
        this.zqz_2(class_2872, matrix4f, f15, f13, f14, f15, f16, f14, f15, f16, f17, f15, f13, f17, f18, f19, f20, f21);
        class_45872.method_22909();
    }

    private void zqz_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        class_2872.method_22918(matrix4f, f, f2, f3).method_22913(f13, f14).method_1336(255, 255, 255, 255);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_22913(f13, f16).method_1336(255, 255, 255, 255);
        class_2872.method_22918(matrix4f, f7, f8, f9).method_22913(f15, f16).method_1336(255, 255, 255, 255);
        class_2872.method_22918(matrix4f, f10, f11, f12).method_22913(f15, f14).method_1336(255, 255, 255, 255);
    }

    private void szd() {
        int n = Math.max(1, mc.method_22683().method_4489());
        int n2 = Math.max(1, mc.method_22683().method_4506());
        if (n == this.thks && n2 == this.rfz && this.dthr != null) {
            return;
        }
        if (this.dthr != null) {
            this.dthr.method_1238();
        }
        this.dthr = new class_6367(n, n2, true);
        this.hts_4(this.dthr);
        this.thks = n;
        this.rfz = n2;
        this.tsth_2.forEach(class_276::method_1238);
        this.tsth_2.clear();
    }

    private void wd_2(int n) {
        int n2 = Math.max(1, mc.method_22683().method_4489());
        int n3 = Math.max(1, mc.method_22683().method_4506());
        if (this.tsth_2.size() != n) {
            this.tsth_2.forEach(class_276::method_1238);
            this.tsth_2.clear();
            for (int i = 0; i < n; ++i) {
                class_6367 class_63672 = new class_6367(Math.max(2, n2 >> i + 1), Math.max(2, n3 >> i + 1), false);
                this.hts_4((class_276)class_63672);
                this.tsth_2.add(class_63672);
            }
            return;
        }
        for (int i = 0; i < n; ++i) {
            int n4 = Math.max(2, n2 >> i + 1);
            int n5 = Math.max(2, n3 >> i + 1);
            class_276 class_2762 = (class_276)this.tsth_2.get(i);
            if (class_2762.field_1482 == n4 && class_2762.field_1481 == n5) continue;
            class_2762.method_1238();
            class_2762 = new class_6367(n4, n5, false);
            this.hts_4(class_2762);
            this.tsth_2.set(i, class_2762);
        }
    }

    private void dghz_3() {
        float f = Math.max(mc.method_22683().method_4486(), 1);
        float f2 = Math.max(mc.method_22683().method_4502(), 1);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22912(0.0f, 0.0f, 0.0f).method_22913(0.0f, 1.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f);
        class_2872.method_22912(0.0f, f2, 0.0f).method_22913(0.0f, 0.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f);
        class_2872.method_22912(f, f2, 0.0f).method_22913(1.0f, 0.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f);
        class_2872.method_22912(f, 0.0f, 0.0f).method_22913(1.0f, 1.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private void jath(class_5944 class_59442, int n, int n2, float f) {
        this.zat_6(class_59442, "uSize", Math.max(1, n), Math.max(1, n2));
        this.zat_6(class_59442, "uOffset", f, f);
        this.zat_6(class_59442, "uHalfPixel", 0.5f / (float)Math.max(1, n), 0.5f / (float)Math.max(1, n2));
    }

    private void hts_4(class_276 class_2762) {
        RenderSystem.bindTexture((int)class_2762.method_30277());
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        RenderSystem.bindTexture((int)0);
    }

    private void bhf(class_5944 class_59442, String string, float f) {
        class_284 class_2842 = class_59442.method_34582(string);
        if (class_2842 != null) {
            class_2842.method_1251(f);
        }
    }

    private void zat_6(class_5944 class_59442, String string, float f, float f2) {
        class_284 class_2842 = class_59442.method_34582(string);
        if (class_2842 != null) {
            class_2842.method_1255(f, f2);
        }
    }

    private void thbd(class_5944 class_59442, String string, float f, float f2, float f3) {
        class_284 class_2842 = class_59442.method_34582(string);
        if (class_2842 != null) {
            class_2842.method_1249(f, f2, f3);
        }
    }

    private static String[] ak07y9gblrfb0(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ild1eoaq4sdtl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ e3q6vtngab ^ string.hashCode() ^ n2 + y2iizn9kes5s7 ^ i * 366768479 ^ e3q6vtngab, 17) ^ y2iizn9kes5s7));
            }
            String[] stringArray = tdw.ak07y9gblrfb0(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

