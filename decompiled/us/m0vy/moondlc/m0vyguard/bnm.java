/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 *  net.minecraft.class_490
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_490;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bdf_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.dhs_5;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.ngh;
import us.m0vy.moondlc.m0vyguard.wh_2;

public class bnm
extends bqt {
    private static final float shaz_4 = 112.0f;
    private static final float shtz_2 = 36.0f;
    private class_1309 thnh;
    private class_332 tbz;
    private float jdt;
    private float nf;
    private float jwh_2;
    private float zas_2;
    private final List zrn = new ArrayList();
    private class_1309 hzf_2;
    private float bkf = -1.0f;
    private boolean djl;
    private float bfw;
    private float jhs_2;
    private float shds = 0.0f;
    private float dfk = 0.0f;
    private float dkhgh = 0.0f;
    private final ra_2 hh_2 = new ra_2("Equipment Pos", List.of("Above", "Below"), "Above");
    private final ra_2 sfdh = new ra_2("Health Bar", List.of("Below", "Above"), "Below");
    private final ra_2 na = new ra_2("Hands items", List.of("Right", "Left"), "Right");
    private final tdj jmz = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int t4txdkre = -1519700842;
    private static final int m3gno1fq1 = 643537686;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g6tw17dq6ztfqe;

    public bnm() {
        super(135.0f, 44.0f);
        this.jmz.tyt_3(this::sr);
        this.rght(this.hh_2);
        this.rght(this.sfdh);
        this.rght(this.na);
        this.rght(this.jmz);
    }

    @Override
    public String getName() {
        return "Moondlc Target Info";
    }

    @Override
    public void lh(wh_2 wh2) {
        this.tbz = wh2.context();
        this.jdt = wh2.partialTicks();
        this.athf(wh2.matrixStack(), () -> this.tsth_2(wh2));
        this.tbz = null;
    }

    @Override
    public void lh(class_4587 class_45872) {
    }

    private void skh_5(class_4587 class_45872) {
        class_1309 class_13092 = this.tygh_2();
        if (class_13092 != null) {
            this.thnh = class_13092;
        }
        float f = this.awd_2();
        float f2 = this.bhh_3(class_13092 != null, f);
        boolean bl = class_13092 != null && class_13092 instanceof class_1657 && bza_4.thtsh_2().sd_2.hdh();
        this.zas_2 = this.khhs_3(this.zas_2, bl ? 1.0f : 0.0f, f, bl ? 14.0f : 28.0f);
        if (!this.tdha_2() || this.thnh == null) {
            if (f2 <= 0.01f) {
                this.thnh = null;
                this.nf = 0.0f;
                this.zas_2 = 0.0f;
            }
            return;
        }
        float f3 = this.zfj_2(this.khta_3().getX());
        float f4 = this.zfj_2(this.khta_3().getY());
        Vector2f vector2f = this.sjl_2(this.thnh, 36.0f);
        if (vector2f != null) {
            f3 = vector2f.x;
            f4 = vector2f.y;
        }
        class_45872.method_22903();
        float f5 = 0.92f + 0.08f * f2;
        class_45872.method_46416(f3 + 56.0f, f4 + 18.0f, 0.0f);
        class_45872.method_22905(f5, f5, 1.0f);
        class_45872.method_46416(-(f3 + 56.0f), -(f4 + 18.0f), 0.0f);
        Vector2f vector2f2 = this.byth(f3, f4);
        this.hjdh(this.thnh, vector2f2.x, vector2f2.y, f, class_13092 != null);
        this.zrb(class_45872, this.thnh, f3, f4, f2, f);
        class_45872.method_22909();
        this.khta_3().setWidth(112.0f);
        this.khta_3().setHeight(36.0f);
    }

    private void zrb(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, float f4) {
        float f5 = 112.0f;
        float f6 = 36.0f;
        this.ttw(class_45872, f, f2, f5, f6, f3);
        this.zhkh_3(class_45872, f3);
        this.shkhz_2(class_45872, class_13092, f + 5.0f, f2 + 5.0f, 25.0f, f3);
        float f7 = f + 34.0f;
        this.dfk = this.khhs_3(this.dfk, this.sfdh.thnth("Above") ? 1.0f : 0.0f, f4, 12.0f);
        float f8 = f2 + 5.0f * (1.0f - this.dfk) + 16.0f * this.dfk;
        float f9 = f2 + 24.0f * (1.0f - this.dfk) + 6.5f * this.dfk;
        this.zbkh_2(class_45872, class_13092, f7, f8, f5 - 40.0f, 7.2f, f3);
        this.dhlk(class_45872, class_13092, f7, f9, f5 - 42.0f, 4.5f, f3, false);
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            if (this.zas_2 > 0.01f) {
                this.zws_3(class_45872, class_16572, f, f2, f5, f3, this.zas_2, f4);
            }
        }
    }

    private void ttw(class_4587 class_45872, float f, float f2, float f3, float f4, float f5) {
        tbkh.bsdh_2(class_45872, f, f2, f3, f4, f5, 7.0f);
        tbkh.ja_2(class_45872, f, f2, f3, f4, 7.0f, 0.24f, f5);
    }

    private void zbkh_2(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, float f4, float f5) {
        String string = this.jzt_2(this.khh(), class_13092.method_5477().getString(), f4, f3);
        this.khh().zskh_4(class_45872, string, f, f2, f4, tbkh.hkdh(f5), 0.0f);
        String string2 = "Distance: " + String.format("%.1f", Float.valueOf(bnm.mc.field_1724.method_5739((class_1297)class_13092)));
        this.ghgh().zskh_4(class_45872, this.jzt_2(this.ghgh(), string2, 6.0f, f3), f, f2 + 9.2f, 6.0f, tbkh.thty_2(0.82f * f5), 0.0f);
    }

    private void dhlk(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, float f4, float f5, boolean bl) {
        float f6 = this.bdha(class_13092);
        float f7 = this.zghs_2(class_13092);
        this.nf = ngh.thnj(this.nf, f6, 0.2f);
        this.jwh_2 = ngh.thnj(this.jwh_2, f7, 0.14f);
        float f8 = 1.2f;
        long l = System.currentTimeMillis();
        float f9 = (float)Math.sin((double)l * 0.0025) * 0.15f;
        int n = brb.rgh(new Color(241, 196, 15).getRGB(), new Color(46, 204, 113).getRGB(), 0.2f + f9);
        int n2 = brb.rgh(new Color(46, 204, 113).getRGB(), new Color(26, 188, 156).getRGB(), 0.5f + f9);
        Color color = new Color(n, true);
        Color color2 = new Color(n2, true);
        Color color3 = new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(235.0f * f5));
        Color color4 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), Math.round(235.0f * f5));
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, f8, new Color(15, 17, 22, Math.round(160.0f * f5)));
        bjgh.zyn.sla(class_45872, f, f2, f3 * this.nf, f4, f8, color3, color4, color3, color4);
        if (this.jwh_2 > 0.01f) {
            float f10 = f3 * Math.min(1.0f, this.jwh_2);
            float f11 = f + f3 - f10;
            bjgh.jghs.hrj(class_45872, f11, f2, f10, f4, f8, new Color(255, 215, 80, Math.round(180.0f * f5)));
        }
        if (bl) {
            String string = String.format("%.1f hp", Float.valueOf(this.rkd_2(class_13092)));
            this.ghgh().zskh_4(class_45872, string, f + f3 - this.ghgh().shdf_2(string, 5.8f), f2 - 7.1f, 5.8f, tbkh.thty_2(0.9f * f5), 0.0f);
        }
    }

    private void shkhz_2(class_4587 class_45872, class_1309 class_13092, float f, float f2, float f3, float f4) {
        float f5;
        class_45872.method_22903();
        if (class_13092 != null && class_13092.field_6235 > 0 && (f5 = ((float)class_13092.field_6235 - this.jdt) / 10.0f) > 0.0f) {
            float f6 = class_3532.method_15374((float)(f5 * (float)Math.PI * 2.0f)) * 4.0f;
            class_45872.method_46416(f + f3 / 2.0f, f2 + f3 / 2.0f, 0.0f);
            class_45872.method_22907(new Quaternionf().rotateZ((float)Math.toRadians(f6)));
            float f7 = 1.0f + class_3532.method_15374((float)(f5 * (float)Math.PI)) * 0.05f;
            class_45872.method_22905(f7, f7, 1.0f);
            class_45872.method_46416(-(f + f3 / 2.0f), -(f2 + f3 / 2.0f), 0.0f);
        }
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            int n = Math.min(140, class_16572.field_6235 * 16);
            bjgh.shsf_2.sdth_2(class_45872, class_16572, f, f2, f3, f3, 0.85f, 5.0f, new Color(255, 255 - n, 255 - n, Math.round(255.0f * f4)));
        } else {
            this.tqz_2(f + f3 / 2.0f, f2 + f3 - 1.0f, Math.round(f3 / 1.55f), class_13092);
        }
        class_45872.method_22909();
    }

    private Vector2f byth(float f, float f2) {
        return new Vector2f(f + 17.5f, f2 + 17.5f);
    }

    private void hjdh(class_1309 class_13092, float f, float f2, float f3, boolean bl) {
        if (class_13092 == null) {
            this.hzf_2 = null;
            this.bkf = -1.0f;
            this.zrn.clear();
            this.djl = false;
            return;
        }
        if (class_13092 != this.hzf_2) {
            this.hzf_2 = class_13092;
            this.bkf = this.rkd_2(class_13092);
            this.zrn.clear();
            this.jkhb(f, f2);
            return;
        }
        this.shkgh(f, f2);
        float f4 = this.rkd_2(class_13092);
        if (bl && this.bkf >= 0.0f && f4 < this.bkf - 0.05f) {
            this.tyn(f, f2, Math.min(1.0f, (this.bkf - f4) / 6.0f));
        }
        this.bkf = f4;
        for (bdf_2 bdf2 : this.zrn) {
            bdf2.ghjd_2(f3);
        }
        this.zrn.removeIf(bdf_2::day_2);
    }

    private void jkhb(float f, float f2) {
        this.bfw = f;
        this.jhs_2 = f2;
        this.djl = true;
    }

    private void shkgh(float f, float f2) {
        if (!this.djl) {
            this.jkhb(f, f2);
            return;
        }
        float f3 = f - this.bfw;
        float f4 = f2 - this.jhs_2;
        if (Math.abs(f3) > 0.001f || Math.abs(f4) > 0.001f) {
            for (bdf_2 bdf2 : this.zrn) {
                bdf2.zghs_3(f3, f4);
            }
        }
        this.jkhb(f, f2);
    }

    private void tyn(float f, float f2, float f3) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int n = 24 + Math.round(f3 * 14.0f);
        while (this.zrn.size() > 80) {
            this.zrn.remove(0);
        }
        for (int i = 0; i < n; ++i) {
            double d = threadLocalRandom.nextDouble(Math.PI * 2);
            float f4 = threadLocalRandom.nextFloat(62.0f, 118.0f) + f3 * 48.0f;
            float f5 = (float)Math.cos(d) * f4;
            float f6 = (float)Math.sin(d) * f4;
            float f7 = threadLocalRandom.nextFloat(4.2f, 7.4f);
            float f8 = threadLocalRandom.nextFloat(0.62f, 0.92f);
            float f9 = threadLocalRandom.nextFloat(0.0f, 4.0f);
            this.zrn.add(new bdf_2(f + (float)Math.cos(d) * f9, f2 + (float)Math.sin(d) * f9, f5, f6, f7, f8, threadLocalRandom.nextBoolean()));
        }
    }

    private void zhkh_3(class_4587 class_45872, float f) {
        if (this.zrn.isEmpty()) {
            return;
        }
        Color color = bas_4.zsz_4();
        for (bdf_2 bdf2 : this.zrn) {
            float f2 = bdf2.har();
            float f3 = f * (1.0f - f2) * (bdf2.dzr_2 ? 1.0f : 0.72f);
            if (f3 <= 0.01f) continue;
            Color color2 = bdf2.dzr_2 ? new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(255.0f * f3)) : new Color(255, 255, 255, Math.round(230.0f * f3));
            float f4 = bdf2.shshr * (1.0f - f2 * 0.35f);
            float f5 = f4 * 2.25f;
            Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), Math.round((float)color2.getAlpha() * 0.22f));
            bjgh.jghs.hrj(class_45872, bdf2.jmq - f5 / 2.0f, bdf2.jtr - f5 / 2.0f, f5, f5, f5 / 2.0f, color3);
            bjgh.jghs.hrj(class_45872, bdf2.jmq - f4 / 2.0f, bdf2.jtr - f4 / 2.0f, f4, f4, f4 / 2.0f, color2);
        }
    }

    private void zws_3(class_4587 class_45872, class_1657 class_16572, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 8.0f;
        float f8 = 1.5f;
        float f9 = 2.0f;
        float f10 = 4.0f * f7 + 3.0f * f8 + f9 * 2.0f;
        float f11 = 2.0f * f7 + 1.0f * f8 + f9 * 2.0f;
        float f12 = f7 + f9 * 2.0f + 1.0f;
        this.shds = this.khhs_3(this.shds, this.hh_2.thnth("Below") ? 1.0f : 0.0f, f6, 12.0f);
        this.dkhgh = this.khhs_3(this.dkhgh, this.na.thnth("Left") ? 1.0f : 0.0f, f6, 12.0f);
        float f13 = f2 - f12 - 1.5f;
        float f14 = f2 + 36.0f + 1.5f;
        float f15 = f13 * (1.0f - this.shds) + f14 * this.shds;
        float f16 = f;
        float f17 = f + f3 - f10;
        float f18 = f16 * (1.0f - this.dkhgh) + f17 * this.dkhgh;
        float f19 = f + f3 - f11;
        float f20 = f;
        float f21 = f19 * (1.0f - this.dkhgh) + f20 * this.dkhgh;
        float f22 = this.rqkh(f5);
        float f23 = this.rqkh(f5);
        this.jdhz(class_45872, class_16572, 2, 4, f18, f15, f10, f12, f7, f8, f9, f4, f22);
        this.jdhz(class_45872, class_16572, 0, 2, f21, f15, f11, f12, f7, f8, f9, f4, f23);
    }

    private void jdhz(class_4587 class_45872, class_1657 class_16572, int n, int n2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (f9 <= 0.001f) {
            return;
        }
        float f10 = f8 * f9;
        float f11 = f + f3 * 0.5f;
        float f12 = f2 + f4 * 0.5f;
        float f13 = this.rqkh(f9);
        float f14 = 0.72f + f13 * 0.28f;
        float f15 = (1.0f - f13) * 5.0f;
        class_45872.method_22903();
        class_45872.method_46416(f11, f12 + f15, 0.0f);
        class_45872.method_22905(f14, f14, 1.0f);
        class_45872.method_46416(-f11, -f12, 0.0f);
        tbkh.bsdh_2(class_45872, f, f2, f3, f4, f10, 4.0f);
        tbkh.ja_2(class_45872, f, f2, f3, f4, 4.0f, 0.24f, f10);
        float f16 = f + f7;
        for (int i = n; i < n + n2; ++i) {
            this.dzs_4(this.skhb_2(class_16572, i), class_45872, f16, f2 + f7, f5, f10);
            f16 += f5 + f6;
        }
        class_45872.method_22909();
    }

    private float rqkh(float f) {
        return f * f * (3.0f - 2.0f * f);
    }

    private class_1799 skhb_2(class_1657 class_16572, int n) {
        if (n == 0) {
            return class_16572.method_6047();
        }
        if (n == 1) {
            return class_16572.method_6079();
        }
        int n2 = 5 - n;
        return n2 >= 0 && n2 < class_16572.method_31548().field_7548.size() ? (class_1799)class_16572.method_31548().field_7548.get(n2) : class_1799.field_8037;
    }

    private void dzs_4(class_1799 class_17992, class_4587 class_45872, float f, float f2, float f3, float f4) {
        if (class_17992.method_7960()) {
            Color color = new Color(130, 130, 130, Math.round(180.0f * f4));
            bjgh.jghs.jzw(class_45872, f + 1.5f, f2 + 1.5f, f + f3 - 1.5f, f2 + f3 - 1.5f, color, 0.8f);
            bjgh.jghs.jzw(class_45872, f + f3 - 1.5f, f2 + 1.5f, f + 1.5f, f2 + f3 - 1.5f, color, 0.8f);
            return;
        }
        if (this.tbz == null) {
            return;
        }
        float f5 = f3 / 16.0f;
        class_4587 class_45873 = this.tbz.method_51448();
        class_45873.method_22903();
        class_45873.method_46416(f, f2, 0.0f);
        class_45873.method_22905(f5, f5, 1.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f4);
        this.tbz.method_51427(class_17992, 0, 0);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45873.method_22909();
        if (class_17992.method_7963()) {
            float f6 = 1.0f - (float)class_17992.method_7919() / (float)class_17992.method_7936();
            float f7 = f3;
            float f8 = 1.0f;
            float f9 = f2 + f3 + 0.5f;
            bjgh.jghs.hrj(class_45873, f, f9, f7, f8, 0.5f, new Color(20, 20, 20, Math.round(200.0f * f4)));
            int n = class_3532.method_15369((float)(f6 / 3.0f), (float)1.0f, (float)1.0f);
            bjgh.jghs.hrj(class_45873, f, f9, f7 * f6, f8, 0.5f, new Color(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, Math.round(255.0f * f4)));
        }
    }

    private void tqz_2(float f, float f2, int n, class_1309 class_13092) {
        if (this.tbz == null) {
            return;
        }
        Quaternionf quaternionf = new Quaternionf().rotateZ((float)Math.PI);
        quaternionf.mul((Quaternionfc)new Quaternionf().rotateX(-0.5235988f));
        float f3 = class_13092.field_6283;
        float f4 = class_13092.method_36454();
        float f5 = class_13092.method_36455();
        float f6 = class_13092.field_6259;
        float f7 = class_13092.field_6241;
        class_13092.field_6283 = 180.0f;
        class_13092.method_36456(180.0f);
        class_13092.method_36457(0.0f);
        class_13092.field_6241 = 180.0f;
        class_13092.field_6259 = 180.0f;
        class_490.method_48472((class_332)this.tbz, (float)f, (float)f2, (float)n, (Vector3f)new Vector3f(0.0f, 0.0f, 0.0f), (Quaternionf)quaternionf, null, (class_1309)class_13092);
        class_13092.field_6283 = f3;
        class_13092.method_36456(f4);
        class_13092.method_36457(f5);
        class_13092.field_6259 = f6;
        class_13092.field_6241 = f7;
    }

    private class_1309 tygh_2() {
        class_1309 class_13092 = bjd.shfn();
        if (class_13092 != null) {
            return class_13092;
        }
        if (bnm.mc.field_1755 instanceof class_408) {
            return bnm.mc.field_1724;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Vector2f sjl_2(class_1309 class_13092, float f) {
        if (!bza_4.thtsh_2().dhd_5.hdh() || class_13092 == null || class_13092 == bnm.mc.field_1724) {
            return null;
        }
        double d = ngh.dhsth(class_13092.field_6014, class_13092.method_23317(), this.jdt);
        double d2 = ngh.dhsth(class_13092.field_6036, class_13092.method_23318(), this.jdt) + (double)class_13092.method_17682() * 0.55;
        double d3 = ngh.dhsth(class_13092.field_5969, class_13092.method_23321(), this.jdt);
        double d4 = Math.max(0.28, (double)class_13092.method_17681() * 0.5);
        dhs_5.dft_3();
        try {
            Vector2f vector2f = dhs_5.tdhkh(new class_243(d, d2, d3));
            if (vector2f.x == Float.MAX_VALUE) {
                Vector2f vector2f2 = null;
                return vector2f2;
            }
            Vector2f vector2f3 = dhs_5.tdhkh(new class_243(d + d4, d2, d3));
            Vector2f vector2f4 = dhs_5.tdhkh(new class_243(d - d4, d2, d3));
            float f2 = vector2f.x;
            if (vector2f3.x != Float.MAX_VALUE) {
                f2 = Math.max(f2, vector2f3.x);
            }
            if (vector2f4.x != Float.MAX_VALUE) {
                f2 = Math.max(f2, vector2f4.x);
            }
            Vector2f vector2f5 = new Vector2f(f2 + 8.0f, vector2f.y - f * 0.55f);
            return vector2f5;
        }
        finally {
            dhs_5.zlk();
        }
    }

    private float bdha(class_1309 class_13092) {
        float f = Math.max(1.0f, class_13092.method_6063());
        return class_3532.method_15363((float)(this.rkd_2(class_13092) / f), (float)0.0f, (float)1.0f);
    }

    private float zghs_2(class_1309 class_13092) {
        float f = Math.max(1.0f, class_13092.method_6063());
        return class_3532.method_15363((float)(class_13092.method_6067() / f), (float)0.0f, (float)1.0f);
    }

    private float rkd_2(class_1309 class_13092) {
        return class_13092.method_6032() + class_13092.method_6067();
    }

    private void tsth_2(wh_2 wh2) {
        this.skh_5(wh2.matrixStack());
    }

    private void sr(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] tvbpl2wls84(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite fkxw94pa2aa2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ t4txdkre ^ string.hashCode() ^ n2 + m3gno1fq1 + i * 1963998611) + t4txdkre) ^ m3gno1fq1));
            }
            String[] stringArray = bnm.tvbpl2wls84(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

