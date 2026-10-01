/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1044
 *  net.minecraft.class_241
 *  net.minecraft.class_276
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_6367
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.common.base.Supplier;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Set;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1044;
import net.minecraft.class_241;
import net.minecraft.class_276;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_6367;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bdr_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.bkgh;
import us.m0vy.moondlc.m0vyguard.tkhs;
import us.m0vy.moondlc.m0vyguard.tdf;
import us.m0vy.moondlc.m0vyguard.jz_2;
import us.m0vy.moondlc.m0vyguard.hf;
import us.m0vy.moondlc.m0vyguard.tt_3;

public final class tadh
implements bdr_2 {
    public static final float jqh = 0.8f;
    public static tdf thjr;
    private static tdf shrh_2;
    private static tdf khzs;
    private static tdf bjn;
    private static tdf rty;
    private static tdf dhz;
    private static tdf jmz_2;
    private static tdf khhgh;
    private static tdf tkhs;
    private static tdf bwd;
    private static final bkgh shy_2;
    private static final Supplier hyh;
    private static final class_276 hta_3;
    private static final Set skkh;
    private static final int bfy5ee8gg1he = 309695489;
    private static final int e42a8t6gctwxz = -634031979;
    private static volatile int jv$e0qbw5hhh;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fda83fbdeeq;

    public static void jdhb() {
        thjr = new tdf(bza.id("rectangle/data"), class_290.field_1576);
        shrh_2 = new tdf(bza.id("squircle/data"), class_290.field_1576);
        bjn = new tdf(bza.id("squircle_texture/data"), class_290.field_1575);
        khzs = new tdf(bza.id("texture/data"), class_290.field_1575);
        rty = new tdf(bza.id("border/data"), class_290.field_1576);
        dhz = new tdf(bza.id("corner/data"), class_290.field_1576);
        jmz_2 = new tdf(bza.id("loading/data"), class_290.field_1576);
        khhgh = new tdf(bza.id("gradient_rectangle/data"), class_290.field_1576);
        tkhs = new tdf(bza.id("blur/data"), class_290.field_1576);
        bwd = new tdf(bza.id("metanoise/data"), class_290.field_1576);
    }

    public static void dfz_3() {
        shy_2.method_1236(0.0f, 0.0f, 0.0f, 1.0f);
        shy_2.setup();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        mc.method_1522().method_35610();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (int)mc.method_1522().method_30277());
        tadh.dshth(0.0f, 0.0f, zak.method_4486(), zak.method_4502(), true);
        mc.method_1522().method_1242();
        RenderSystem.disableBlend();
        mc.method_1522().method_1235(true);
        shy_2.stop();
    }

    private static void dshth(float f, float f2, float f3, float f4, boolean bl) {
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        int n = 0xFFFFFF;
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
    public static void bzb_2(class_4587 class_45872, class_241 class_2412, class_241 class_2413, bkt bkt2) {
        class_45872.method_22903();
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            RenderSystem.lineWidth((float)1.0f);
            tadh.dkhj_2();
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
            class_2872.method_22918(matrix4f, class_2412.field_1343, class_2412.field_1342, 0.0f).method_39415(bkt2.btkh());
            class_2872.method_22918(matrix4f, class_2413.field_1343, class_2413.field_1342, 0.0f).method_39415(bkt2.btkh());
            class_286.method_43433((class_9801)class_2872.method_60800());
            tadh.ttth_2();
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
    public static void rha_2(class_4587 class_45872, class_241 class_2412, class_241 class_2413, class_241 class_2414, class_241 class_2415, bkt bkt2, int n) {
        class_45872.method_22903();
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader((class_10156)class_10142.field_53876);
            RenderSystem.lineWidth((float)1.0f);
            tadh.dkhj_2();
            class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
            for (int i = 0; i <= n; ++i) {
                float f = (float)i / (float)n;
                float f2 = (float)us.m0vy.moondlc.m0vyguard.tkhs.zkhf_2(f, class_2412.field_1343, class_2413.field_1343, class_2414.field_1343, class_2415.field_1343);
                float f3 = (float)us.m0vy.moondlc.m0vyguard.tkhs.zkhf_2(f, class_2412.field_1342, class_2413.field_1342, class_2414.field_1342, class_2415.field_1342);
                class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_39415(bkt2.btkh());
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
            tadh.ttth_2();
        }
        finally {
            RenderSystem.disableBlend();
            RenderSystem.lineWidth((float)1.0f);
            class_45872.method_22909();
        }
    }

    private static float stf_4(float f, float f2, float f3, float f4, float f5) {
        float f6 = 1.0f - f;
        float f7 = f * f;
        float f8 = f6 * f6;
        return f8 * f6 * f2 + 3.0f * f8 * f * f3 + 3.0f * f6 * f7 * f4 + f7 * f * f5;
    }

    public static void ddhk(class_4587 class_45872, float f, float f2, float f3, float f4, bkt bkt2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        tadh.dkhj_2();
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void hkk(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        if (shrh_2 == null || tadh.shrh_2.zjw == null) {
            tadh.khdhh(class_45872, f, f2, f3, f4, jz2, bkt2);
            return;
        }
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.8f;
        shrh_2.tfd_2();
        shrh_2.thrs_2("Size").method_1255(f3, f4);
        shrh_2.thrs_2("Radius").method_35657(jz2.topLeftRadius() * f5 / 2.0f, jz2.bottomLeftRadius() * f5 / 2.0f, jz2.topRightRadius() * f5 / 2.0f, jz2.bottomRightRadius() * f5 / 2.0f);
        shrh_2.thrs_2("Smoothness").method_1251(f6);
        shrh_2.thrs_2("CornerSmoothness").method_1251(f5);
        tadh.dkhj_2();
        float f7 = -f6 / 2.0f + f6 * 2.0f;
        float f8 = f6 / 2.0f + f6;
        float f9 = f - f7 / 2.0f;
        float f10 = f2 - f8 / 2.0f;
        float f11 = f3 + f7;
        float f12 = f4 + f8;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f9, f10 + f12, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f9 + f11, f10, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void tsf(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        if (jmz_2 == null || tadh.jmz_2.zjw == null) {
            tadh.khdhh(class_45872, f, f2, f3, f4, jz2, bkt2);
            return;
        }
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.8f;
        jmz_2.tfd_2();
        jmz_2.thrs_2("Size").method_1255(f3, f4);
        jmz_2.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        jmz_2.thrs_2("Smoothness").method_1251(f6);
        jmz_2.thrs_2("Progress").method_1251(f5);
        jmz_2.thrs_2("StripeWidth").method_1251(0.0f);
        jmz_2.thrs_2("Fade").method_1251(0.5f);
        tadh.dkhj_2();
        float f7 = -f6 / 2.0f + f6 * 2.0f;
        float f8 = f6 / 2.0f + f6;
        float f9 = f - f7 / 2.0f;
        float f10 = f2 - f8 / 2.0f;
        float f11 = f3 + f7;
        float f12 = f4 + f8;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f9, f10 + f12, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f9 + f11, f10 + f12, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f9 + f11, f10, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void khdhh(class_4587 class_45872, float f, float f2, float f3, float f4, jz_2 jz2, bkt bkt2) {
        if (thjr == null || tadh.thjr.zjw == null) {
            tadh.ddhk(class_45872, f, f2, f3, f4, bkt2);
            return;
        }
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.8f;
        thjr.tfd_2();
        thjr.thrs_2("Size").method_1255(f3, f4);
        thjr.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        thjr.thrs_2("Smoothness").method_1251(f5);
        tadh.dkhj_2();
        float f6 = -f5 / 2.0f + f5 * 2.0f;
        float f7 = f5 / 2.0f + f5;
        float f8 = f - f6 / 2.0f;
        float f9 = f2 - f7 / 2.0f;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void dza_6(class_4587 class_45872, float f, float f2, float f3, float f4, jz_2 jz2, bkt bkt2, bkt bkt3, bkt bkt4, bkt bkt5) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.8f;
        khhgh.tfd_2();
        khhgh.thrs_2("Size").method_1255(f3, f4);
        khhgh.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        khhgh.thrs_2("Smoothness").method_1251(f5);
        khhgh.thrs_2("TopLeftColor").method_35657((float)bkt2.khyh_2() / 255.0f, (float)bkt2.shghs_2() / 255.0f, (float)bkt2.shaz() / 255.0f, (float)bkt2.btr_2() / 255.0f);
        khhgh.thrs_2("BottomLeftColor").method_35657((float)bkt3.khyh_2() / 255.0f, (float)bkt3.shghs_2() / 255.0f, (float)bkt3.shaz() / 255.0f, (float)bkt3.btr_2() / 255.0f);
        khhgh.thrs_2("BottomRightColor").method_35657((float)bkt4.khyh_2() / 255.0f, (float)bkt4.shghs_2() / 255.0f, (float)bkt4.shaz() / 255.0f, (float)bkt4.btr_2() / 255.0f);
        khhgh.thrs_2("TopRightColor").method_35657((float)bkt5.khyh_2() / 255.0f, (float)bkt5.shghs_2() / 255.0f, (float)bkt5.shaz() / 255.0f, (float)bkt5.btr_2() / 255.0f);
        tadh.dkhj_2();
        float f6 = -f5 / 2.0f + f5 * 2.0f;
        float f7 = f5 / 2.0f + f5;
        float f8 = f - f6 / 2.0f;
        float f9 = f2 - f7 / 2.0f;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_39415(bkt3.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_39415(bkt4.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_39415(bkt5.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void sghkh_2(class_4587 class_45872, float f, float f2, float f3, float f4, jz_2 jz2, bsw_2 bsw2) {
        tadh.dza_6(class_45872, f, f2, f3, f4, jz2, bsw2.t_2(), bsw2.aqz(), bsw2.thtr_2(), bsw2.dfgh_2());
    }

    public static void aad(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = 0.8f;
        float f7 = 1.0f;
        rty.tfd_2();
        rty.thrs_2("Size").method_1255(f3, f4);
        rty.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        rty.thrs_2("Smoothness").method_1255(f6, f7);
        rty.thrs_2("Thickness").method_1251(f5);
        tadh.dkhj_2();
        float f8 = -f7 / 2.0f + f7 * 2.0f;
        float f9 = f7 / 2.0f + f7;
        float f10 = f - f8 / 2.0f;
        float f11 = f2 - f9 / 2.0f;
        float f12 = f3 + f8;
        float f13 = f4 + f9;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f10, f11, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f10, f11 + f13, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f10 + f12, f11 + f13, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f10 + f12, f11, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void rbt(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, bkt bkt2, bkt bkt3) {
        if (bwd == null || tadh.bwd.zjw == null) {
            tadh.khdhh(class_45872, f, f2, f3, f4, jz_2.all(f6), bkt2);
            return;
        }
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        bwd.tfd_2();
        bwd.thrs_2("Size").method_1255(f3, f4);
        bwd.thrs_2("Time").method_1251(f5);
        bwd.thrs_2("BgColor").method_35657((float)bkt2.khyh_2() / 255.0f, (float)bkt2.shghs_2() / 255.0f, (float)bkt2.shaz() / 255.0f, (float)bkt2.btr_2() / 255.0f);
        bwd.thrs_2("OutlineColor").method_35657((float)bkt3.khyh_2() / 255.0f, (float)bkt3.shghs_2() / 255.0f, (float)bkt3.shaz() / 255.0f, (float)bkt3.btr_2() / 255.0f);
        bwd.thrs_2("Radius").method_35657(f6, f6, f6, f6);
        bwd.thrs_2("Smoothness").method_1251(0.8f);
        tadh.dkhj_2();
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_1336(255, 255, 255, 255);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_1336(255, 255, 255, 255);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_1336(255, 255, 255, 255);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_1336(255, 255, 255, 255);
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void znth(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, bkt bkt2, jz_2 jz2) {
        tadh.khad_3(class_45872, f -= 0.3f, f2 -= 0.3f, f6, f6, f5, jz2, bkt2, 0.0f);
        tadh.khad_3(class_45872, f + (f3 += 0.6f) - f6, f2, f6, f6, f5, jz2, bkt2, 1.0f);
        tadh.khad_3(class_45872, f, f2 + (f4 += 0.6f) - f6, f6, f6, f5, jz2, bkt2, 2.0f);
        tadh.khad_3(class_45872, f + f3 - f6, f2 + f4 - f6, f6, f6, f5, jz2, bkt2, 3.0f);
    }

    public static void khad_3(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2, float f6) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f7 = 0.8f;
        float f8 = 1.0f;
        dhz.tfd_2();
        dhz.thrs_2("Size").method_1255(f3, f4);
        dhz.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        dhz.thrs_2("Smoothness").method_1255(f7, f8);
        dhz.thrs_2("Thickness").method_1251(f5);
        dhz.thrs_2("CornerIndex").method_1251(f6);
        tadh.dkhj_2();
        float f9 = -f8 / 2.0f + f8 * 2.0f;
        float f10 = f8 / 2.0f + f8;
        float f11 = f - f9 / 2.0f;
        float f12 = f2 - f10 / 2.0f;
        float f13 = f3 + f9;
        float f14 = f4 + f10;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f11, f12, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f11, f12 + f14, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f11 + f13, f12 + f14, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f11 + f13, f12, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void jqh(class_2960 class_29602) {
        if (class_29602 == null) {
            return;
        }
        try {
            class_1044 class_10443 = class_310.method_1551().method_1531().method_4619(class_29602);
            if (class_10443 != null) {
                class_10443.method_4527(true, true);
                int n = class_10443.method_4624();
                if (n > 0 && skkh.add(class_29602)) {
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

    public static void slz(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, bkt bkt2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        tadh.jqh(class_29602);
        tadh.dkhj_2();
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void sza_8(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, bsw_2 bsw2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        tadh.jqh(class_29602);
        tadh.dkhj_2();
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(bsw2.t_2().btkh());
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(bsw2.aqz().btkh());
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(bsw2.thtr_2().btkh());
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(bsw2.dfgh_2().btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void tash_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, bkt bkt2) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        class_45872.method_22903();
        int n = bkt2.btkh();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = f + f3;
        float f10 = f2 + f4;
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        tadh.jqh(class_29602);
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(f5, f7).method_39415(n);
        class_2872.method_22918(matrix4f, f, f10, 0.0f).method_22913(f5, f8).method_39415(n);
        class_2872.method_22918(matrix4f, f9, f10, 0.0f).method_22913(f6, f8).method_39415(n);
        class_2872.method_22918(matrix4f, f9, f2, 0.0f).method_22913(f6, f7).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
        RenderSystem.disableBlend();
    }

    public static void zat_7(class_4587 class_45872, hf hf2, float f, float f2, float f3, float f4, bkt bkt2) {
        tadh.tash_2(class_45872, hf2.tdhl_2(), f, f2, f3, f4, 0.0f, 1.0f, 0.0f, 1.0f, bkt2);
    }

    public static void zjn_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, jz_2 jz2) {
        tadh.rar(class_45872, class_29602, f, f2, f3, f4, jz2, bkt.jdh_5);
    }

    public static void rar(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, jz_2 jz2, bkt bkt2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = 0.8f;
        khzs.tfd_2();
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        tadh.jqh(class_29602);
        khzs.thrs_2("Size").method_1255(f3, f4);
        khzs.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        khzs.thrs_2("Smoothness").method_1251(f5);
        tadh.dkhj_2();
        float f6 = -f5 / 2.0f + f5 * 2.0f;
        float f7 = f5 / 2.0f + f5;
        float f8 = f - f6 / 2.0f;
        float f9 = f2 - f7 / 2.0f;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_22913(0.0f, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_22913(0.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_22913(1.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_22913(1.0f, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void thzt(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        thjr.tfd_2();
        thjr.thrs_2("Size").method_1255(f3, f4);
        thjr.thrs_2("Radius").method_35657(jz2.topLeftRadius() * 3.0f, jz2.bottomLeftRadius() * 3.0f, jz2.topRightRadius() * 3.0f, jz2.bottomRightRadius() * 3.0f);
        thjr.thrs_2("Smoothness").method_1251(f5);
        tadh.dkhj_2();
        float f6 = -f5 / 2.0f + f5 * 2.0f;
        float f7 = f5 / 2.0f + f5;
        float f8 = f - f6 / 2.0f;
        float f9 = f2 - f7 / 2.0f;
        float f10 = f3 + f6;
        float f11 = f4 + f7;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f8, f9, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8, f9 + f11, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9 + f11, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f8 + f10, f9, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        class_45872.method_22909();
    }

    public static void sky(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
    }

    public static void shmgh(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2, boolean bl, boolean bl2) {
    }

    public static void sad_3(class_4587 class_45872, float f, float f2, float f3, float f4, int n) {
        tt_3.ssn(class_45872, f, f2, f3, f4, n, bsw_2.shtl_2(bza.getInstance().getThemeManager().bzm().bzy(), bza.getInstance().getThemeManager().bzm().bzy(), bza.getInstance().getThemeManager().bzm().adth_2(), bza.getInstance().getThemeManager().bzm().adth_2()));
    }

    public static void zzd_6(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        class_276 class_2762 = class_310.method_1551().method_1522();
        class_6367 class_63672 = (class_6367)hyh.get();
        if (class_63672.field_1482 != class_2762.field_1482 || class_63672.field_1481 != class_2762.field_1481) {
            class_63672.method_1234(class_2762.field_1482, class_2762.field_1481);
        }
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        class_63672.method_1235(false);
        boolean bl = GL11.glIsEnabled((int)3089);
        boolean bl2 = GL11.glIsEnabled((int)2960);
        if (bl) {
            GL11.glDisable((int)3089);
        }
        if (bl2) {
            GL11.glDisable((int)2960);
        }
        class_2762.method_1237(class_63672.field_1482, class_63672.field_1481);
        if (bl) {
            GL11.glEnable((int)3089);
        }
        if (bl2) {
            GL11.glEnable((int)2960);
        }
        class_2762.method_1235(true);
        RenderSystem.setShaderTexture((int)0, (int)class_63672.method_30277());
        tkhs.tfd_2();
        tkhs.thrs_2("Size").method_1255(f3, f4);
        tkhs.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        tkhs.thrs_2("Smoothness").method_1251(1.0f);
        tkhs.thrs_2("BlurRadius").method_1251(f5);
        int n = mc.method_22683().method_4486();
        int n2 = mc.method_22683().method_4502();
        float f6 = f / (float)n;
        float f7 = ((float)n2 - f2 - f4) / (float)n2;
        float f8 = f3 / (float)n;
        float f9 = f4 / (float)n2;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(f6, f7 + f9).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(f6, f7).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(f6 + f8, f7).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(f6 + f8, f7 + f9).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        class_45872.method_22909();
    }

    public static void dqs_3(class_4587 class_45872, class_287 class_2872, double d, double d2, double d3, double d4, double d5, bkt bkt2) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, (float)d, (float)(d2 + d5), (float)d3).method_22913(0.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)(d2 + d5), (float)d3).method_22913(1.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)d2, (float)d3).method_22913(1.0f, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_22913(0.0f, 0.0f).method_39415(bkt2.btkh());
    }

    public static void bqgh(class_4587 class_45872, class_2960 class_29602, double d, double d2, double d3, double d4, double d5, bkt bkt2) {
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, (float)d, (float)(d2 + d5), (float)d3).method_22913(0.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)(d2 + d5), (float)d3).method_22913(1.0f, 1.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, (float)(d + d4), (float)d2, (float)d3).method_22913(1.0f, 0.0f).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_22913(0.0f, 0.0f).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static void dhhz_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, jz_2 jz2, bkt bkt2) {
        tadh.ssf_3(class_45872, class_29602, f, f2, f3, f3, jz2, bkt2, 0.125f, 0.125f, 0.25f, 0.25f);
    }

    private static void shtn_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, jz_2 jz2, bkt bkt2) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        tadh.ssf_3(class_45872, class_29602, f, f2, f3, f3, jz2, bkt2, 0.625f, 0.125f, 0.75f, 0.25f);
        RenderSystem.disableBlend();
    }

    public static void ssf_3(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, jz_2 jz2, bkt bkt2, float f5, float f6, float f7, float f8) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = 0.8f;
        khzs.tfd_2();
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        khzs.thrs_2("Size").method_1255(f3, f4);
        khzs.thrs_2("Radius").method_35657(jz2.topLeftRadius(), jz2.bottomLeftRadius(), jz2.topRightRadius(), jz2.bottomRightRadius());
        khzs.thrs_2("Smoothness").method_1251(f9);
        tadh.dkhj_2();
        float f10 = -f9 / 2.0f + f9 * 2.0f;
        float f11 = f9 / 2.0f + f9;
        float f12 = f - f10 / 2.0f;
        float f13 = f2 - f11 / 2.0f;
        float f14 = f3 + f10;
        float f15 = f4 + f11;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f12, f13, 0.0f).method_22913(f5, f6).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f12, f13 + f15, 0.0f).method_22913(f5, f8).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f12 + f14, f13 + f15, 0.0f).method_22913(f7, f8).method_39415(bkt2.btkh());
        class_2872.method_22918(matrix4f, f12 + f14, f13, 0.0f).method_22913(f7, f6).method_39415(bkt2.btkh());
        class_286.method_43433((class_9801)class_2872.method_60800());
        tadh.ttth_2();
        RenderSystem.setShaderTexture((int)0, (int)0);
        class_45872.method_22909();
    }

    public static void dkhj_2() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
    }

    public static void ttth_2() {
        Object[] objectArray = new Object[]{};
        tadh.jv$q6znfx0tv549tm(objectArray, -854239708);
        tadh.jv$c9oyhym94("", objectArray, 364781749);
    }

    @Generated
    private tadh() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static class_6367 hdk() {
        return new class_6367(1920, 1024, false);
    }

    private static String[] q7w0wh3xb(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite binn4c9ritt3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bfy5ee8gg1he ^ string.hashCode()) + (n2 + e42a8t6gctwxz) + i ^ bfy5ee8gg1he, 4) + e42a8t6gctwxz);
            }
            String[] stringArray = tadh.q7w0wh3xb(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static Object jv$c9oyhym94(String string, Object[] objectArray, int n) throws Throwable {
        String string2 = tadh.jv$ct629dbse(string, n);
        if ((tadh.jv$q6znfx0tv549tm(objectArray, n) ^ string2.length()) == 972789295) {
            tadh.jv$dfu8kg1wv(string2, objectArray, n);
        }
        String[] stringArray = string2.split("\u001d", -1);
        int n2 = Integer.parseInt(stringArray[0]);
        Class<?> clazz = Class.forName(stringArray[1].replace('/', '.'));
        MethodType methodType = MethodType.fromMethodDescriptorString(stringArray[3], clazz.getClassLoader());
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle methodHandle = n2 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType) : lookup.findVirtual(clazz, stringArray[2], methodType);
        return methodHandle.invokeWithArguments(objectArray);
    }

    private static String jv$ct629dbse(String string, int n) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (n * 131 ^ i * 17 ^ 0x22AE564B) & 0xFFFF);
        }
        return new String(cArray);
    }

    private static int jv$q6znfx0tv549tm(Object[] objectArray, int n) {
        int n2 = n ^ 0xD8AB7691;
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (object == null) continue;
            n2 = Integer.rotateLeft(n2 ^ System.identityHashCode(object), 5) + i * 1315423911;
        }
        return n2;
    }

    private static Object jv$dfu8kg1wv(String string, Object[] objectArray, int n) {
        jv$e0qbw5hhh = tadh.jv$q6znfx0tv549tm(objectArray, n) ^ string.length();
        if ((jv$e0qbw5hhh & 3) == 4) {
            return string.substring(0, 0);
        }
        return null;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

