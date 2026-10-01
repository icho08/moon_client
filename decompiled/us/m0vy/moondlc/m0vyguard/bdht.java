/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10042
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1044
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_241
 *  net.minecraft.class_284
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_5944
 *  net.minecraft.class_742
 *  net.minecraft.class_897
 *  net.minecraft.class_922
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Set;
import lombok.Generated;
import net.minecraft.class_10042;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1044;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_241;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_5944;
import net.minecraft.class_742;
import net.minecraft.class_897;
import net.minecraft.class_922;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import us.m0vy.moondlc.m0vyguard.bthr;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.bkha_2;
import us.m0vy.moondlc.m0vyguard.bzkh_2;
import us.m0vy.moondlc.m0vyguard.bat_3;
import us.m0vy.moondlc.m0vyguard.bgha;
import us.m0vy.moondlc.m0vyguard.bfz;
import us.m0vy.moondlc.m0vyguard.bqa_2;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tth_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.thd;
import us.m0vy.moondlc.m0vyguard.tra;
import us.m0vy.moondlc.m0vyguard.tsgh;
import us.m0vy.moondlc.m0vyguard.khl;
import us.m0vy.moondlc.m0vyguard.tt_4;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.fth;
import us.m0vy.moondlc.m0vyguard.qy;
import us.m0vy.moondlc.m0vyguard.mf;
import us.movy.moondlc.Moondlc;

public final class bdht
implements tthy,
bkhz_2 {
    public static final float tfm = 0.5f;
    public static final thd khdhm;
    public static fth sthgh;
    private static fth thdj;
    private static fth zal;
    private static fth zts_3;
    private static fth dhsf;
    private static fth hkhd;
    private static fth bzj_2;
    private static fth sydh;
    public static qy khlr;
    public static tt_4 bmf;
    public static tt_4 zmb;
    public static bthr ttb_2;
    public static bzkh_2 rkhd_2;
    private static final mf bat_4;
    private static final Set dhhgh;
    private static final int nv71989wm4 = 1123015671;
    private static final int bhyq07xytbx4 = 892860339;
    private static volatile int jv$az4l22a6vy2k;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int l421ud3bl26g1n;

    public static synchronized void slsh_2() {
        if (sthgh != null && sydh != null) {
            return;
        }
        sthgh = new fth(Moondlc.id("rectangle/data"), class_290.field_1576);
        thdj = new fth(Moondlc.id("squircle/data"), class_290.field_1576);
        zts_3 = new fth(Moondlc.id("squircle_texture/data"), class_290.field_1575);
        zal = new fth(Moondlc.id("texture/data"), class_290.field_1575);
        dhsf = new fth(Moondlc.id("border/data"), class_290.field_1576);
        hkhd = new fth(Moondlc.id("loading/data"), class_290.field_1576);
        bzj_2 = new fth(Moondlc.id("liquidglass/data"), class_290.field_1575);
        sydh = new fth(Moondlc.id("gradient_rectangle/data"), class_290.field_1576);
        try {
            khlr = new qy(Moondlc.id("flame/data"));
        }
        catch (Exception exception) {
            // empty catch block
        }
        bmf = new tt_4(Moondlc.id("sky_nebula/data"));
        zmb = new tt_4(Moondlc.id("sky_caustic/data"));
        ttb_2 = new bthr();
        ttb_2.thqd();
        rkhd_2 = new bzkh_2();
        rkhd_2.tyw_2();
    }

    public static void sa() {
        if (sthgh == null || sydh == null) {
            bdht.slsh_2();
        }
    }

    public static void thwh() {
        bat_4.method_1236(0.0f, 0.0f, 0.0f, 1.0f);
        bat_4.setup();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        mc.method_1522().method_35610();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (int)mc.method_1522().method_30277());
        bdht.jwdh(0.0f, 0.0f, bdn_2.method_4486(), bdn_2.method_4502(), true);
        mc.method_1522().method_1242();
        RenderSystem.disableBlend();
        mc.method_1522().method_1235(true);
        bat_4.stop();
    }

    private static void jwdh(float f, float f2, float f3, float f4, boolean bl) {
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        int n = -1;
        float f5 = bl ? 0.0f : 1.0f;
        float f6 = bl ? 1.0f : 0.0f;
        class_2872.method_22912(f, f2, 0.0f).method_22913(0.0f, f6).method_39415(-1);
        class_2872.method_22912(f, f2 + f4, 0.0f).method_22913(0.0f, f5).method_39415(-1);
        class_2872.method_22912(f + f3, f2 + f4, 0.0f).method_22913(1.0f, f5).method_39415(-1);
        class_2872.method_22912(f + f3, f2, 0.0f).method_22913(1.0f, f6).method_39415(-1);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void jdr_2(class_4587 class_45872, class_241 class_2412, class_241 class_2413, byq byq2) {
        class_45872.method_22903();
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            RenderSystem.lineWidth((float)1.0f);
            bdht.zkhb_2();
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
            class_2872.method_22918(matrix4f, class_2412.field_1343, class_2412.field_1342, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, class_2413.field_1343, class_2413.field_1342, 0.0f).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
        }
        finally {
            RenderSystem.disableBlend();
            RenderSystem.lineWidth((float)1.0f);
            class_45872.method_22909();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void zfz(class_4587 class_45872, class_241 class_2412, class_241 class_2413, class_241 class_2414, class_241 class_2415, byq byq2, int n) {
        class_45872.method_22903();
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            RenderSystem.lineWidth((float)1.0f);
            bdht.zkhb_2();
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
            for (int i = 0; i <= n; ++i) {
                float f = (float)i / (float)n;
                float f2 = (float)tra.twz_2(f, class_2412.field_1343, class_2413.field_1343, class_2414.field_1343, class_2415.field_1343);
                float f3 = (float)tra.twz_2(f, class_2412.field_1342, class_2413.field_1342, class_2414.field_1342, class_2415.field_1342);
                class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_39415(byq2.rk());
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
        }
        finally {
            RenderSystem.disableBlend();
            RenderSystem.lineWidth((float)1.0f);
            class_45872.method_22909();
        }
    }

    private static float thnk(float f, float f2, float f3, float f4, float f5) {
        float f6 = 1.0f - f;
        float f7 = f * f;
        float f8 = f6 * f6;
        return f8 * f6 * f2 + 3.0f * f8 * f * f3 + 3.0f * f6 * f7 * f4 + f7 * f * f5;
    }

    public static void tqkh(class_4587 class_45872, float f, float f2, float f3, float f4, byq byq2) {
        tjd_2 tjd2 = tjd_2.sz_3();
        if (tjd2 instanceof bqa_2) {
            bqa_2 bqa2 = (bqa_2)tjd2;
            tjd2 = bqa2.dzj();
            Matrix4f matrix4f = bqa2.tja_3().method_23760().method_23761();
            tjd2.method_22918(matrix4f, f, f2 + f4, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f + f3, f2, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f, f2, 0.0f).method_39415(byq2.rk());
        } else {
            class_45872.method_22903();
            tjd2 = class_45872.method_23760().method_23761();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            bdht.zkhb_2();
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            class_2872.method_22918((Matrix4f)tjd2, f, f2 + f4, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918((Matrix4f)tjd2, f + f3, f2 + f4, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918((Matrix4f)tjd2, f + f3, f2, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918((Matrix4f)tjd2, f, f2, 0.0f).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            class_45872.method_22909();
        }
    }

    public static void tzs_5(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.5f;
        tjd_2 tjd2 = tjd_2.sz_3();
        if (tjd2 instanceof bfz) {
            bfz bfz2 = (bfz)tjd2;
            bfz2.dth_3(matrix4f, f, f2, f3, f4, zth2.topLeftRadius() * f5 / 2.0f, zth2.bottomLeftRadius() * f5 / 2.0f, zth2.topRightRadius() * f5 / 2.0f, zth2.bottomRightRadius() * f5 / 2.0f, byq2.rk());
            class_45872.method_22909();
        } else {
            thdj.aghl();
            thdj.rthw("Size").method_1255(f3, f4);
            thdj.rthw("Radius").method_35657(zth2.topLeftRadius() * f5 / 2.0f, zth2.bottomLeftRadius() * f5 / 2.0f, zth2.topRightRadius() * f5 / 2.0f, zth2.bottomRightRadius() * f5 / 2.0f);
            thdj.rthw("Smoothness").method_1251(f6);
            thdj.rthw("CornerSmoothness").method_1251(f5);
            bdht.zkhb_2();
            float f7 = -f6 / 2.0f + f6 * 2.0f;
            float f8 = f6 / 2.0f + f6;
            float f9 = f - f7 / 2.0f;
            float f10 = f2 - f8 / 2.0f;
            float f11 = f3 + f7;
            float f12 = f4 + f8;
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f9, f10 + f12, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f9 + f11, f10, 0.0f).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            class_45872.method_22909();
        }
    }

    public static void rsh_4(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.5f;
        hkhd.aghl();
        hkhd.rthw("Size").method_1255(f3, f4);
        hkhd.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
        hkhd.rthw("Smoothness").method_1251(f6);
        hkhd.rthw("Progress").method_1251(f5);
        hkhd.rthw("StripeWidth").method_1251(0.0f);
        hkhd.rthw("Fade").method_1251(0.5f);
        bdht.zkhb_2();
        float f7 = -f6 / 2.0f + f6 * 2.0f;
        float f8 = f6 / 2.0f + f6;
        float f9 = f - f7 / 2.0f;
        float f10 = f2 - f8 / 2.0f;
        float f11 = f3 + f7;
        float f12 = f4 + f8;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f9, f10 + f12, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f9 + f11, f10, 0.0f).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        bdht.dhdt_4();
        class_45872.method_22909();
    }

    public static void zkb_2(class_4587 class_45872, float f, float f2, float f3, float f4, zth_8 zth2, byq byq2, float f5, float f6, byq byq3, float f7, boolean bl, float f8, float f9, float f10, boolean bl2) {
        class_284 class_2842;
        class_284 class_2843;
        class_284 class_2844;
        class_284 class_2845;
        class_284 class_2846;
        class_284 class_2847;
        class_284 class_2848;
        class_284 class_2849;
        class_284 class_28410;
        class_284 class_28411;
        class_284 class_28412;
        int n;
        bdht.sa();
        if (bzj_2 == null) {
            return;
        }
        class_5944 class_59442 = bzj_2.aghl();
        if (class_59442 == null) {
            return;
        }
        int n2 = bl2 ? (mc.method_1522() != null ? mc.method_1522().method_30277() : 0) : (n = bthr.khtk_2());
        if (n <= 0 && mc.method_1522() != null) {
            n = mc.method_1522().method_30277();
        }
        if (n <= 0) {
            return;
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        bdht.zkhb_2();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)n);
        class_284 class_28413 = bzj_2.rthw("GlobalAlpha");
        if (class_28413 != null) {
            class_28413.method_1251(f5);
        }
        if ((class_28412 = bzj_2.rthw("Size")) != null) {
            class_28412.method_1255(f3, f4);
        }
        if ((class_28411 = bzj_2.rthw("Radius")) != null) {
            class_28411.method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
        }
        if ((class_28410 = bzj_2.rthw("Smoothness")) != null) {
            class_28410.method_1251(0.5f);
        }
        if ((class_2849 = bzj_2.rthw("FresnelPower")) != null) {
            class_2849.method_1251(f6);
        }
        if ((class_2848 = bzj_2.rthw("FresnelColor")) != null) {
            class_2848.method_1253(khl.shza(byq3.rk()));
        }
        if ((class_2847 = bzj_2.rthw("FresnelAlpha")) != null) {
            class_2847.method_1251(khl.tghsh_2(byq3.rk()));
        }
        if ((class_2846 = bzj_2.rthw("BaseAlpha")) != null) {
            class_2846.method_1251(f7);
        }
        if ((class_2845 = bzj_2.rthw("FresnelInvert")) != null) {
            class_2845.method_35649(bl ? 1 : 0);
        }
        if ((class_2844 = bzj_2.rthw("FresnelMix")) != null) {
            class_2844.method_1251(f8);
        }
        if ((class_2843 = bzj_2.rthw("DistortStrength")) != null) {
            class_2843.method_1251(f9);
        }
        if ((class_2842 = bzj_2.rthw("CornerSmoothness")) != null) {
            class_2842.method_1251(f10);
        }
        int n3 = Math.max(1, bdn_2.method_4486());
        int n4 = Math.max(1, bdn_2.method_4502());
        float f11 = f / (float)n3;
        float f12 = ((float)n4 - f2 - f4) / (float)n4;
        float f13 = f3 / (float)n3;
        float f14 = f4 / (float)n4;
        float f15 = Math.min(f11, f11 + f13);
        float f16 = Math.max(f11, f11 + f13);
        float f17 = Math.min(f12, f12 + f14);
        float f18 = Math.max(f12, f12 + f14);
        class_284 class_28414 = bzj_2.rthw("TextureBounds");
        if (class_28414 != null) {
            class_28414.method_35657(f15, f16, f17, f18);
        }
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(f11, f12 + f14).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(f11, f12).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(f11 + f13, f12).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(f11 + f13, f12 + f14).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        bdht.dhdt_4();
    }

    public static void sqr_2(class_4587 class_45872, float f, float f2, float f3, float f4, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.5f;
        tjd_2 tjd2 = tjd_2.sz_3();
        if (tjd2 instanceof tsgh) {
            tsgh tsgh2 = (tsgh)tjd2;
            tsgh2.dldh(matrix4f, f, f2, f3, f4, zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius(), byq2.rk());
            class_45872.method_22909();
        } else {
            sthgh.aghl();
            sthgh.rthw("Size").method_1255(f3, f4);
            sthgh.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
            sthgh.rthw("Smoothness").method_1251(f5);
            bdht.zkhb_2();
            float f6 = -f5 / 2.0f + f5 * 2.0f;
            float f7 = f5 / 2.0f + f5;
            float f8 = f - f6 / 2.0f;
            float f9 = f2 - f7 / 2.0f;
            float f10 = f3 + f6;
            float f11 = f4 + f7;
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            class_45872.method_22909();
        }
    }

    public static void dhbz_2(class_4587 class_45872, float f, float f2, float f3, float f4, zth_8 zth2, byq byq2, byq byq3, byq byq4, byq byq5) {
        bdht.sa();
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.5f;
        sydh.aghl();
        sydh.rthw("Size").method_1255(f3, f4);
        sydh.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
        sydh.rthw("Smoothness").method_1251(f5);
        sydh.rthw("TopLeftColor").method_35657(byq2.sbk() / 255.0f, byq2.srl() / 255.0f, byq2.shsl_2() / 255.0f, byq2.tzdh_2() / 255.0f);
        sydh.rthw("BottomLeftColor").method_35657(byq3.sbk() / 255.0f, byq3.srl() / 255.0f, byq3.shsl_2() / 255.0f, byq3.tzdh_2() / 255.0f);
        sydh.rthw("BottomRightColor").method_35657(byq4.sbk() / 255.0f, byq4.srl() / 255.0f, byq4.shsl_2() / 255.0f, byq4.tzdh_2() / 255.0f);
        sydh.rthw("TopRightColor").method_35657(byq5.sbk() / 255.0f, byq5.srl() / 255.0f, byq5.shsl_2() / 255.0f, byq5.tzdh_2() / 255.0f);
        bdht.zkhb_2();
        float f6 = -f5 / 2.0f + f5 * 2.0f;
        float f7 = f5 / 2.0f + f5;
        float f8 = f - f6 / 2.0f;
        float f9 = f2 - f7 / 2.0f;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_39415(byq3.rk());
        class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_39415(byq4.rk());
        class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_39415(byq5.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        bdht.dhdt_4();
        class_45872.method_22909();
    }

    public static void sbd_3(class_4587 class_45872, float f, float f2, float f3, float f4, zth_8 zth2, bkha_2 bkha2) {
        bdht.dhbz_2(class_45872, f, f2, f3, f4, zth2, bkha2.skhl_2(), bkha2.ttgh_4(), bkha2.tat_3(), bkha2.zzh_6());
    }

    public static void khshy(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.5f;
        float f7 = 1.0f;
        dhsf.aghl();
        dhsf.rthw("Size").method_1255(f3, f4);
        dhsf.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
        dhsf.rthw("Smoothness").method_1255(f6, f7);
        dhsf.rthw("Thickness").method_1251(f5);
        bdht.zkhb_2();
        float f8 = -f7 / 2.0f + f7 * 2.0f;
        float f9 = f7 / 2.0f + f7;
        float f10 = f - f8 / 2.0f;
        float f11 = f2 - f9 / 2.0f;
        float f12 = f3 + f8;
        float f13 = f4 + f9;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f10, f11, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f10, f11 + f13, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f10 + f12, f11 + f13, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f10 + f12, f11, 0.0f).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        bdht.dhdt_4();
        class_45872.method_22909();
    }

    public static void shw_3(class_2960 class_29602) {
        if (class_29602 == null) {
            return;
        }
        try {
            class_1044 class_10442 = mc.method_1531().method_4619(class_29602);
            if (class_10442 != null) {
                class_10442.method_4527(true, true);
                int n = class_10442.method_4624();
                if (n > 0 && dhhgh.add(class_29602)) {
                    GL11.glBindTexture((int)3553, (int)n);
                    GL11.glTexParameteri((int)3553, (int)33085, (int)8);
                    GL30.glGenerateMipmap((int)3553);
                    GL11.glTexParameteri((int)3553, (int)10241, (int)9987);
                    GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                    GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
                    GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void dhmq(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, byq byq2) {
        tjd_2 tjd2 = tjd_2.sz_3();
        if (tjd2 instanceof bat_3) {
            bat_3 bat2_2 = (bat_3)tjd2;
            tjd2 = bat2_2.dzj();
            Matrix4f matrix4f = bat2_2.dhms_2().method_23760().method_23761();
            RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
            bdht.shw_3(class_29602);
            tjd2.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
        } else {
            class_45872.method_22903();
            tjd2 = class_45872.method_23760().method_23761();
            RenderSystem.setShader((class_10156)class_10142.field_53880);
            RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
            bdht.shw_3(class_29602);
            bdht.zkhb_2();
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            class_2872.method_22918((Matrix4f)tjd2, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918((Matrix4f)tjd2, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
            class_2872.method_22918((Matrix4f)tjd2, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
            class_2872.method_22918((Matrix4f)tjd2, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            RenderSystem.setShaderTexture((int)0, (int)0);
            class_45872.method_22909();
        }
    }

    public static void bsr_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, byq byq2) {
        tjd_2 tjd2 = tjd_2.sz_3();
        if (tjd2 instanceof bat_3) {
            bat_3 bat2_2 = (bat_3)tjd2;
            tjd2 = bat2_2.dzj();
            Matrix4f matrix4f = bat2_2.dhms_2().method_23760().method_23761();
            RenderSystem.setShader((class_10156)class_10142.field_53880);
            RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
            bdht.shw_3(class_29602);
            int n = byq2.rk();
            float f9 = f + f3;
            float f10 = f2 + f4;
            tjd2.method_22918(matrix4f, f, f2, 0.0f).method_22913(f5, f7).method_39415(n);
            tjd2.method_22918(matrix4f, f, f10, 0.0f).method_22913(f5, f8).method_39415(n);
            tjd2.method_22918(matrix4f, f9, f10, 0.0f).method_22913(f6, f8).method_39415(n);
            tjd2.method_22918(matrix4f, f9, f2, 0.0f).method_22913(f6, f7).method_39415(n);
        } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            class_45872.method_22903();
            int n = byq2.rk();
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            float f11 = f + f3;
            float f12 = f2 + f4;
            RenderSystem.setShader((class_10156)class_10142.field_53880);
            RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
            bdht.shw_3(class_29602);
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(f5, f7).method_39415(n);
            class_2872.method_22918(matrix4f, f, f12, 0.0f).method_22913(f5, f8).method_39415(n);
            class_2872.method_22918(matrix4f, f11, f12, 0.0f).method_22913(f6, f8).method_39415(n);
            class_2872.method_22918(matrix4f, f11, f2, 0.0f).method_22913(f6, f7).method_39415(n);
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            RenderSystem.setShaderTexture((int)0, (int)0);
            class_45872.method_22909();
            RenderSystem.disableBlend();
        }
    }

    public static void dqs_2(class_4587 class_45872, tth_2 tth2_2, float f, float f2, float f3, float f4, byq byq2) {
        if (tth2_2 != null) {
            bdht.bsr_2(class_45872, tth2_2.texture(), f, f2, f3, f4, tth2_2.u1(), tth2_2.u2(), tth2_2.v1(), tth2_2.v2(), byq2);
        }
    }

    public static void zkhs_3(class_4587 class_45872, bgha bgha2, float f, float f2, float f3, float f4, byq byq2) {
        bdht.bsr_2(class_45872, Moondlc.id(bgha2.getTexture().getTexture()), f, f2, f3, f4, bgha2.shf_3 / bgha2.getTexture().getWidth(), (bgha2.shf_3 + bgha2.getTexture().getStep()) / bgha2.getTexture().getWidth(), 0.0f, 1.0f, byq2);
    }

    public static void khzs(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, zth_8 zth2) {
        bdht.ryth(class_45872, class_29602, f, f2, f3, f4, zth2, bhj_2.rrd);
    }

    public static void ryth(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.5f;
        zal.aghl();
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        bdht.shw_3(class_29602);
        zal.rthw("Size").method_1255(f3, f4);
        zal.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
        zal.rthw("Smoothness").method_1251(f5);
        bdht.zkhb_2();
        float f6 = -f5 / 2.0f + f5 * 2.0f;
        float f7 = f5 / 2.0f + f5;
        float f8 = f - f6 / 2.0f;
        float f9 = f2 - f7 / 2.0f;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        bdht.dhdt_4();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void qy(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.5f;
        zts_3.aghl();
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        bdht.shw_3(class_29602);
        zts_3.rthw("Size").method_1255(f3, f4);
        zts_3.rthw("Radius").method_35657(zth2.topLeftRadius() * f5 / 2.0f, zth2.bottomLeftRadius() * f5 / 2.0f, zth2.topRightRadius() * f5 / 2.0f, zth2.bottomRightRadius() * f5 / 2.0f);
        zts_3.rthw("Smoothness").method_1251(f6);
        zts_3.rthw("CornerSmoothness").method_1251(f5);
        bdht.zkhb_2();
        float f7 = -f6 / 2.0f + f6 * 2.0f;
        float f8 = f6 / 2.0f + f6;
        float f9 = f - f7 / 2.0f;
        float f10 = f2 - f8 / 2.0f;
        float f11 = f3 + f7;
        float f12 = f4 + f8;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f9, f10 + f12, 0.0f).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, 0.0f).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f9 + f11, f10, 0.0f).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        bdht.dhdt_4();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void jfgh(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        tjd_2 tjd2 = tjd_2.sz_3();
        if (tjd2 instanceof bat_3) {
            bat_3 bat2_2 = (bat_3)tjd2;
            tjd2 = bat2_2.dzj();
            float f6 = -f5 / 2.0f + f5 * 2.0f;
            float f7 = f5 / 2.0f + f5;
            float f8 = f - f6 / 2.0f;
            float f9 = f2 - f7 / 2.0f;
            float f10 = f3 + f6;
            float f11 = f4 + f7;
            tjd2.method_22918(matrix4f, f8, f9, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_39415(byq2.rk());
            tjd2.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_39415(byq2.rk());
        } else {
            sthgh.aghl();
            sthgh.rthw("Size").method_1255(f3, f4);
            sthgh.rthw("Radius").method_35657(zth2.topLeftRadius() * 3.0f, zth2.bottomLeftRadius() * 3.0f, zth2.topRightRadius() * 3.0f, zth2.bottomRightRadius() * 3.0f);
            sthgh.rthw("Smoothness").method_1251(f5);
            bdht.zkhb_2();
            float f12 = -f5 / 2.0f + f5 * 2.0f;
            float f13 = f5 / 2.0f + f5;
            float f14 = f - f12 / 2.0f;
            float f15 = f2 - f13 / 2.0f;
            float f16 = f3 + f12;
            float f17 = f4 + f13;
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            class_2872.method_22918(matrix4f, f14, f15, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f14, f15 + f17, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f14 + f16, f15 + f17, 0.0f).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f14 + f16, f15, 0.0f).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            class_45872.method_22909();
        }
    }

    public static void zfy(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f7 = 0.03f;
        if (!((f5 /= 22.5f) <= 0.0f)) {
            ttb_2.tak_4(2.0f);
            zts_3.aghl();
            RenderSystem.setShaderTexture((int)0, (int)bthr.khtk_2());
            zts_3.rthw("Size").method_1255(f3, f4);
            zts_3.rthw("Radius").method_35657(zth2.topLeftRadius() * f6 / 2.0f, zth2.bottomLeftRadius() * f6 / 2.0f, zth2.topRightRadius() * f6 / 2.0f, zth2.bottomRightRadius() * f6 / 2.0f);
            zts_3.rthw("Smoothness").method_1251(0.1f);
            zts_3.rthw("CornerSmoothness").method_1251(f6);
            bdht.zkhb_2();
            float f8 = -f7 / 2.0f + f7 * 2.0f;
            float f9 = f7 / 2.0f + f7;
            float f10 = f - f8 / 2.0f;
            float f11 = f2 - f9 / 2.0f;
            float f12 = f3 + f8;
            float f13 = f4 + f9;
            int n = mc.method_22683().method_4486();
            int n2 = mc.method_22683().method_4502();
            float f14 = f10 / (float)n;
            float f15 = ((float)n2 - f11 - f13) / (float)n2;
            float f16 = f12 / (float)n;
            float f17 = f13 / (float)n2;
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            class_2872.method_22918(matrix4f, f10, f11, 0.0f).method_22913(f14, f15 + f17).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f10, f11 + f13, 0.0f).method_22913(f14, f15).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f10 + f12, f11 + f13, 0.0f).method_22913(f14 + f16, f15).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f10 + f12, f11, 0.0f).method_22913(f14 + f16, f15 + f17).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            RenderSystem.setShaderTexture((int)0, (int)0);
            class_45872.method_22909();
        }
    }

    public static void bjth(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        if (!((f5 /= 22.5f) <= 0.0f)) {
            ttb_2.tak_4(2.0f);
            zal.aghl();
            RenderSystem.setShaderTexture((int)0, (int)bthr.khtk_2());
            zal.rthw("Size").method_1255(f3, f4);
            zal.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
            zal.rthw("Smoothness").method_1251(0.01f);
            bdht.zkhb_2();
            int n = mc.method_22683().method_4486();
            int n2 = mc.method_22683().method_4502();
            float f6 = f / (float)n;
            float f7 = ((float)n2 - f2 - f4) / (float)n2;
            float f8 = f3 / (float)n;
            float f9 = f4 / (float)n2;
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(f6, f7 + f9).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(f6, f7).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(f6 + f8, f7).method_39415(byq2.rk());
            class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(f6 + f8, f7 + f9).method_39415(byq2.rk());
            class_286.method_43433((class_9801)class_2872.method_60800());
            bdht.dhdt_4();
            RenderSystem.setShaderTexture((int)0, (int)0);
            class_45872.method_22909();
        }
    }

    public static void hdf_2(class_4587 class_45872, class_287 class_2872, double d, double d2, double d3, double d4, double d5, byq byq2) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, (float)d, (float)(d2 + d5), (float)d3).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)(d2 + d5), (float)d3).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)d2, (float)d3).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
    }

    public static void rghn(class_4587 class_45872, class_2960 class_29602, double d, double d2, double d3, double d4, double d5, byq byq2) {
        bdht.shw_3(class_29602);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, (float)d, (float)(d2 + d5), (float)d3).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)(d2 + d5), (float)d3).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)d2, (float)d3).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static void htb(class_4587 class_45872, class_742 class_7422, float f, float f2, float f3, zth_8 zth2, byq byq2) {
        class_2960 class_29602 = class_7422.method_52814().comp_1626();
        bdht.jda_4(class_45872, class_29602, f, f2, f3, zth2, byq2);
        bdht.thqkh(class_45872, class_29602, f, f2, f3, zth2, byq2);
    }

    public static void zshk(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, zth_8 zth2, byq byq2) {
        class_897 class_8972 = mc.method_1561().method_3953((class_1297)class_13092);
        if (class_8972 instanceof class_922) {
            class_922 class_9222 = (class_922)class_8972;
            class_922 class_9223 = (class_922)class_8972;
            class_10042 class_100422 = (class_10042)class_9223.method_55269();
            class_2960 class_29602 = class_9223.method_3885(class_100422);
            bdht.jda_4(class_45872, class_29602, f, f2, f3, zth2, byq2);
            bdht.thqkh(class_45872, class_29602, f, f2, f3, zth2, byq2);
        }
    }

    public static void jda_4(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, zth_8 zth2, byq byq2) {
        bdht.smth(class_45872, class_29602, f, f2, f3, f3, zth2, byq2, 0.125f, 0.125f, 0.25f, 0.25f);
    }

    private static void thqkh(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, zth_8 zth2, byq byq2) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        bdht.smth(class_45872, class_29602, f, f2, f3, f3, zth2, byq2, 0.625f, 0.125f, 0.75f, 0.25f);
        RenderSystem.disableBlend();
    }

    public static void smth(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, zth_8 zth2, byq byq2, float f5, float f6, float f7, float f8) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = 0.5f;
        zal.aghl();
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        bdht.shw_3(class_29602);
        zal.rthw("Size").method_1255(f3, f4);
        zal.rthw("Radius").method_35657(zth2.topLeftRadius(), zth2.bottomLeftRadius(), zth2.topRightRadius(), zth2.bottomRightRadius());
        zal.rthw("Smoothness").method_1251(f9);
        bdht.zkhb_2();
        float f10 = -f9 / 2.0f + f9 * 2.0f;
        float f11 = f9 / 2.0f + f9;
        float f12 = f - f10 / 2.0f;
        float f13 = f2 - f11 / 2.0f;
        float f14 = f3 + f10;
        float f15 = f4 + f11;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f12, f13, 0.0f).method_22913(f5, f6).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f12, f13 + f15, 0.0f).method_22913(f5, f8).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f12 + f14, f13 + f15, 0.0f).method_22913(f7, f8).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, f12 + f14, f13, 0.0f).method_22913(f7, f6).method_39415(byq2.rk());
        class_286.method_43433((class_9801)class_2872.method_60800());
        bdht.dhdt_4();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void zkhb_2() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
    }

    public static void dhdt_4() {
        Object[] objectArray = new Object[]{};
        bdht.jv$r2qi03un33i(objectArray, -1332801126);
        bdht.jv$ul1556odzu("技押拱括抙拊抻抨扒扈扴扬打戏戲戮揚援掱掗揋掦掿捄捜捼捧挈捃挏挫惑惴惤悀悰悭悶恂恂恵怔怞怂怯怬懜懃懥憳憎憶憪慑愻愿愡愯慷慯愯暌暙暦暔曐曣", objectArray, -98686859);
    }

    @Generated
    private bdht() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @Generated
    public static fth ghrdh() {
        return thdj;
    }

    private static String[] h0ybfl5x31(String string) {
        return string.split("\u0005\u0012", -1);
    }

    private static CallSite jtlnspjdb2qfas(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ nv71989wm4 ^ string.hashCode()) + (n2 + bhyq07xytbx4) + i ^ nv71989wm4, 28) + bhyq07xytbx4);
            }
            String[] stringArray = bdht.h0ybfl5x31(new String(cArray));
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

    private static Object jv$ul1556odzu(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = bdht.jv$kq305uer956gsh(string, n);
        if ((bdht.jv$r2qi03un33i(objectArray, n) ^ string2.length()) == -1389513735) {
            bdht.jv$zt85xfnedq(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$kq305uer956gsh(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0xDF45D16F) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$r2qi03un33i(Object[] objectArray, int n) {
        int n2 = n ^ 0x4A9139EF;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$zt85xfnedq(String string, Object[] objectArray, int n) {
        jv$az4l22a6vy2k = bdht.jv$r2qi03un33i(objectArray, n) ^ string.length();
        if ((jv$az4l22a6vy2k & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

