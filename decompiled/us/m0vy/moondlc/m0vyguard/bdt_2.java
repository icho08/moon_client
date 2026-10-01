/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1306
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_304
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 *  net.minecraft.class_9779
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.time.Duration;
import java.util.Locale;
import lombok.Generated;
import net.minecraft.class_1306;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_304;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_9779;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.zz;
import us.m0vy.moondlc.m0vyguard.ngh;
import us.movy.moondlc.mixin.client.accessor.IDrawContextAccessor;

public class bdt_2
implements dl {
    private static final bdt_2 tzd_4;
    private float hms_2 = 20.0f;
    private float shgh_3 = 0.0f;
    private float shr_2 = 0.0f;
    private float shkhth = 20.0f;
    private float hdhgh = 300.0f;
    private float shzgh = 0.0f;
    private float thqth;
    private boolean tks;
    private static final int wgamxqot037j = -1432913867;
    private static final int uus4ozh726 = 1327214038;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vf9duo9k;

    public void tkn_2(class_332 class_3322, class_9779 class_97792) {
        float f;
        if (!this.tzt_6()) {
            return;
        }
        class_746 class_7462 = bdt_2.mc.field_1724;
        if (class_7462 == null) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        zz zz2 = this.dkhl(class_3322);
        float f2 = zz2.dghz_2;
        float f3 = zz2.khyn + 27.0f;
        float f4 = zz2.thth_4;
        float f5 = 22.0f;
        float f6 = class_7462.method_6032();
        float f7 = class_7462.method_6063();
        float f8 = class_7462.method_6067();
        float f9 = class_7462.method_6096();
        float f10 = class_7462.method_7344().method_7586();
        float f11 = class_7462.method_7344().method_7589();
        int n = class_7462.method_5748();
        int n2 = class_7462.method_5669();
        this.hms_2 += (f6 - this.hms_2) * 0.2f;
        this.shgh_3 += (f8 - this.shgh_3) * 0.2f;
        this.shr_2 += (f9 - this.shr_2) * 0.2f;
        this.shkhth += (f10 - this.shkhth) * 0.2f;
        this.hdhgh += ((float)n2 - this.hdhgh) * 0.2f;
        float f12 = class_3532.method_15363((float)class_7462.field_7510, (float)0.0f, (float)1.0f);
        this.shzgh = ngh.thnj(this.shzgh, f12, 0.15f);
        float f13 = (float)class_7462.method_31548().field_7545 * 20.0f;
        if (!this.tks) {
            this.thqth = f13;
            this.tks = true;
        } else {
            this.thqth = ngh.thjs(7.0f, this.thqth, f13);
        }
        float f14 = f2 - 0.5f;
        float f15 = f3 - 0.5f;
        float f16 = f4 + 1.0f;
        float f17 = 23.0f;
        this.azq(class_45872, f14, f15, f16, f17, 3.0f, 176);
        float f18 = f2 + this.thqth + 1.0f;
        float f19 = f3 + 1.0f;
        bjgh.jlkh.shlr(class_45872, f18, f19, 20.0f, 20.0f, 2.25f, 1.15f, bas_4.zsz_4());
        for (int i = 0; i < 9; ++i) {
            float f20 = f2 + (float)i * 20.0f + 2.0f;
            f = f3 + 2.0f;
            this.adhr(class_3322, class_7462.method_31548().method_5438(i), f20, f, 18.0f);
            if (!bza_4.thtsh_2().zwq.hdh()) continue;
            this.saw_2(class_3322, i, f20, f);
        }
        class_1799 class_17992 = class_7462.method_6079();
        if (!class_17992.method_7960()) {
            boolean bl = class_7462.method_6068().method_5928() == class_1306.field_6182;
            f = bl ? f2 - 26.0f : f2 + 186.0f;
            this.azq(class_45872, f, f3, 22.0f, 22.0f, 3.0f, 176);
            this.adhr(class_3322, class_17992, f, f3, 22.0f);
        }
        if (bza_4.thtsh_2().skha_2.dhbn("Bars") && !class_7462.method_7337() && !class_7462.method_7325()) {
            this.thtdh(class_3322, (class_1657)class_7462);
        }
        if (!class_7462.method_7337() && !class_7462.method_7325() && bza_4.thtsh_2().skha_2.dhbn("Bars") && bza_4.thtsh_2().hkhs_2.hdh()) {
            String string = String.valueOf(class_7462.field_7520);
            f = 7.0f;
            brz_2.thtkh_2.sjw_2(class_45872, string, f2 + f4 / 2.0f, f3 - 14.0f, f, new Color(90, 240, 90), 0.0f);
        }
    }

    private void thtdh(class_332 class_3322, class_1657 class_16572) {
        int n;
        class_4587 class_45872 = class_3322.method_51448();
        int n2 = class_3322.method_51421();
        int n3 = class_3322.method_51443();
        int n4 = 12;
        int n5 = 81;
        int n6 = 9;
        int n7 = 2;
        int n8 = n2 / 2;
        int n9 = 91;
        int n10 = n8 - n9;
        int n11 = n3 - 55;
        float f = class_16572.method_6063();
        float f2 = class_16572.method_6067();
        float f3 = class_16572.method_6096();
        float f4 = class_16572.method_7344().method_7589();
        int n12 = class_16572.method_5748();
        int n13 = class_16572.method_5669();
        this.thdhk(class_3322, n10, n11 + n4, n5, n6, n7, this.hms_2, f, this.shgh_3);
        if (f3 > 0.0f) {
            n = n11 - 15;
            this.thm_3(class_3322, n10, n + n4, n5, n6, n7, this.shr_2);
        }
        n = n8 + n9 - n5;
        int n14 = n3 - 55;
        this.dhdf_2(class_3322, n, n14 + n4, n5, n6, n7, this.shkhth, f4);
        if (n13 < n12) {
            int n15 = n14 - 15;
            this.trl_2(class_3322, n, n15 + n4, n5, n6, n7, this.hdhgh, n12);
        }
        bza_4 bza2_2 = bza_4.thtsh_2();
        if (bza2_2.hkhs_2.hdh()) {
            int n16 = class_16572.field_7520;
            int n17 = 182;
            int n18 = 4;
            int n19 = n8 - n17 / 2;
            int n20 = n3 - 33;
            this.bzz(class_3322, n19, n20, n17, n18, n7, this.shzgh, n16);
        }
    }

    private void thdhk(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3) {
        float f4;
        float f5;
        int n6;
        Object object;
        float f6 = Math.min(f / f2, 1.0f);
        int n7 = (int)((float)n3 * f6);
        class_4587 class_45872 = class_3322.method_51448();
        bza_4 bza2_2 = bza_4.thtsh_2();
        this.azq(class_45872, n, n2, n3, n4, n5, 179);
        if (n7 > 0) {
            Color color = new Color(153, 30, 30, 255);
            object = new Color(255, 85, 85, 255);
            if (bza2_2.rqz_2.hdh()) {
                bjgh.jghs.hrj(class_45872, n, n2, n7, n4, n5, new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 51));
            }
            bjgh.zyn.sla(class_45872, n + 1, n2 + 1, n7 - 2, n4 - 2, (float)n5 - 0.5f, color, (Color)object, (Color)object, color);
        }
        if (f3 > 0.0f && (n6 = (int)((float)n3 * (f5 = (f4 = bdt_2.mc.field_1724 != null ? bdt_2.mc.field_1724.method_6067() : 20.0f) > 0.0f ? Math.min(f3 / f4, 1.0f) : 0.0f))) > 0) {
            Color color = new Color(153, 132, 30, 255);
            Color color2 = new Color(255, 221, 51, 255);
            if (bza2_2.rqz_2.hdh()) {
                bjgh.jghs.hrj(class_45872, n, n2, n6, n4, n5, new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 51));
            }
            bjgh.zyn.sla(class_45872, n + 1, n2 + 1, n6 - 2, n4 - 2, (float)n5 - 0.5f, color, color2, color2, color);
        }
        if (bza2_2.wt.hdh()) {
            float f7 = f + f3;
            object = String.format(Locale.US, "%.1f", Float.valueOf(f7));
            float f8 = 5.0f;
            float f9 = (float)n2 + ((float)n4 - f8) / 2.0f - 1.0f;
            brz_2.thtkh_2.sjw_2(class_45872, (String)object, (float)n + (float)n3 / 2.0f, f9, f8, bas_4.ghss(), 0.0f);
        }
    }

    private void thm_3(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f) {
        Object object;
        float f2 = Math.min(f / 20.0f, 1.0f);
        int n6 = (int)((float)n3 * f2);
        class_4587 class_45872 = class_3322.method_51448();
        bza_4 bza2_2 = bza_4.thtsh_2();
        this.azq(class_45872, n, n2, n3, n4, n5, 179);
        if (n6 > 0) {
            object = new Color(61, 91, 153, 255);
            Color color = new Color(102, 153, 255, 255);
            if (bza2_2.rqz_2.hdh()) {
                bjgh.jghs.hrj(class_45872, n, n2, n6, n4, n5, new Color(color.getRed(), color.getGreen(), color.getBlue(), 51));
            }
            bjgh.zyn.sla(class_45872, n + 1, n2 + 1, n6 - 2, n4 - 2, (float)n5 - 0.5f, (Color)object, color, color, (Color)object);
        }
        if (bza2_2.wt.hdh()) {
            object = String.format(Locale.US, "%.0f", Float.valueOf(f));
            float f3 = 5.0f;
            float f4 = (float)n2 + ((float)n4 - f3) / 2.0f - 1.0f;
            brz_2.thtkh_2.sjw_2(class_45872, (String)object, (float)n + (float)n3 / 2.0f, f4, f3, bas_4.ghss(), 0.0f);
        }
    }

    private void dhdf_2(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f, float f2) {
        float f3;
        Object object;
        float f4 = f + f2;
        float f5 = Math.min(f4 / 40.0f, 1.0f);
        int n6 = (int)((float)n3 * f5);
        class_4587 class_45872 = class_3322.method_51448();
        bza_4 bza2_2 = bza_4.thtsh_2();
        this.azq(class_45872, n, n2, n3, n4, n5, 179);
        if (n6 > 0) {
            object = new Color(153, 102, 30, 255);
            Color color = new Color(255, 170, 51, 255);
            f3 = n + n3 - n6;
            if (bza2_2.rqz_2.hdh()) {
                bjgh.jghs.hrj(class_45872, f3, n2, n6, n4, n5, new Color(color.getRed(), color.getGreen(), color.getBlue(), 51));
            }
            bjgh.zyn.sla(class_45872, f3 + 1.0f, n2 + 1, n6 - 2, n4 - 2, (float)n5 - 0.5f, color, (Color)object, (Color)object, color);
        }
        if (bza2_2.wt.hdh()) {
            object = String.format(Locale.US, "%.0f", Float.valueOf(f4));
            float f6 = 5.0f;
            f3 = (float)n2 + ((float)n4 - f6) / 2.0f - 1.0f;
            brz_2.thtkh_2.sjw_2(class_45872, (String)object, (float)n + (float)n3 / 2.0f, f3, f6, bas_4.ghss(), 0.0f);
        }
    }

    private void trl_2(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f, float f2) {
        float f3;
        Object object;
        float f4 = Math.min(f / f2, 1.0f);
        int n6 = (int)((float)n3 * f4);
        class_4587 class_45872 = class_3322.method_51448();
        bza_4 bza2_2 = bza_4.thtsh_2();
        this.azq(class_45872, n, n2, n3, n4, n5, 179);
        if (n6 > 0) {
            object = new Color(30, 122, 153, 255);
            Color color = new Color(51, 204, 255, 255);
            f3 = n + n3 - n6;
            if (bza2_2.rqz_2.hdh()) {
                bjgh.jghs.hrj(class_45872, f3, n2, n6, n4, n5, new Color(color.getRed(), color.getGreen(), color.getBlue(), 51));
            }
            bjgh.zyn.sla(class_45872, f3 + 1.0f, n2 + 1, n6 - 2, n4 - 2, (float)n5 - 0.5f, color, (Color)object, (Color)object, color);
        }
        if (bza2_2.wt.hdh()) {
            object = String.format(Locale.US, "%.0f", Float.valueOf(f));
            float f5 = 5.0f;
            f3 = (float)n2 + ((float)n4 - f5) / 2.0f - 1.0f;
            brz_2.thtkh_2.sjw_2(class_45872, (String)object, (float)n + (float)n3 / 2.0f, f3, f5, bas_4.ghss(), 0.0f);
        }
    }

    private void bzz(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f, int n6) {
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        int n7 = (int)((float)n3 * f2);
        class_4587 class_45872 = class_3322.method_51448();
        bza_4 bza2_2 = bza_4.thtsh_2();
        this.azq(class_45872, n, n2, n3, n4, n5, 179);
        if (n7 > 0) {
            Color color = new Color(0, 153, 0, 255);
            Color color2 = new Color(85, 255, 85, 255);
            if (bza2_2.rqz_2.hdh()) {
                bjgh.jghs.hrj(class_45872, n, n2, n7, n4, n5, new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 51));
            }
            if (n7 > 2) {
                bjgh.zyn.sla(class_45872, n + 1, n2 + 1, n7 - 2, n4 - 2, Math.max(0.0f, (float)n5 - 0.5f), color, color2, color2, color);
            } else {
                bjgh.jghs.hrj(class_45872, n, n2, n7, n4, Math.min((float)n5, (float)n7 / 2.0f), color2);
            }
        }
    }

    private void azq(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, int n) {
        Color color;
        int n2 = class_3532.method_15340((int)n, (int)0, (int)255);
        if (bza_4.aar()) {
            color = new Color(12, 12, 18, n2);
            bjgh.thqf.tgha_2(class_45872, f, f2, f3, f4, f5, color);
            bjgh.hskh_2.dfth_2(class_45872, f, f2, f3, f4, f5, color);
        } else if (bza_4.dhhh()) {
            bjgh.jghs.hrj(class_45872, f, f2, f3, f4, f5, new Color(9, 10, 13, 255));
        } else {
            bjgh.thqf.tgha_2(class_45872, f, f2, f3, f4, f5, new Color(12, 12, 18, n2));
        }
        color = bza_4.dhhh() ? new Color(45, 47, 54, 255) : new Color(60, 60, 60, 140);
        bjgh.jlkh.shlr(class_45872, f, f2, f3, f4, f5, 0.55f, color);
    }

    public void bhs_3(class_332 class_3322, class_1799 class_17992, int n) {
        if (!this.tzt_6() || n <= 0 || class_17992.method_7960()) {
            return;
        }
        int n2 = class_3532.method_15340((int)((int)((float)n * 256.0f / 10.0f)), (int)0, (int)255);
        if (n2 <= 8) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        zz zz2 = this.dkhl(class_3322);
        String string = class_17992.method_7964().getString();
        String string2 = class_17992.method_7947() > 1 ? "x" + class_17992.method_7947() : "";
        String string3 = string2.isEmpty() ? string : string + " " + string2;
        this.ashn(class_45872, string3, zz2.centerX(), zz2.khyn - 21.5f, (float)class_3322.method_51421() - 32.0f, 6.1f, n2, true);
    }

    public void khzz(class_332 class_3322, class_9779 class_97792, class_2561 class_25612, int n, boolean bl) {
        if (!this.tzt_6() || class_25612 == null || n <= 0) {
            return;
        }
        float f = (float)n - class_97792.method_60637(false);
        int n2 = class_3532.method_15340((int)((int)(f * 255.0f / 20.0f)), (int)0, (int)255);
        if (n2 <= 8) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        zz zz2 = this.dkhl(class_3322);
        String string = class_25612.getString();
        this.ashn(class_45872, string, zz2.centerX(), zz2.khyn - 39.0f, (float)class_3322.method_51421() - 32.0f, bl ? 6.2f : 5.9f, n2, false);
    }

    private void ashn(class_4587 class_45872, String string, float f, float f2, float f3, float f4, int n, boolean bl) {
        float f5;
        if (string == null || string.isEmpty()) {
            return;
        }
        bsh_2 bsh2 = bl ? brz_2.thtkh_2 : brz_2.ryk;
        int n2 = class_3532.method_15340((int)n, (int)0, (int)255);
        float f6 = (float)n2 / 255.0f;
        float f7 = (float)((Math.sin((double)System.currentTimeMillis() / 260.0) + 1.0) * 0.5);
        float f8 = f2 + (1.0f - f6) * 5.0f - f7 * 0.65f;
        float f9 = bsh2.shdf_2(string, f4);
        float f10 = Math.min(f3, f9);
        float f11 = f - f10 / 2.0f;
        Color color = new Color(0, 0, 0, Math.max(1, (int)((float)n2 * 0.66f)));
        Color color2 = bas_4.khan(Math.max(1, (int)((float)n2 * 0.96f)));
        Color color3 = bas_4.tdth_2(Math.max(1, (int)((float)n2 * (0.7f + f7 * 0.22f))));
        Color color4 = bas_4.dhfk(Math.max(1, (int)((float)n2 * (0.66f + f7 * 0.2f))));
        if (f9 <= f3) {
            f5 = f - f9 / 2.0f;
            bsh2.zskh_4(class_45872, string, f5 + 0.75f, f8 + 0.85f, f4, color, 0.0f);
            bsh2.zd(class_45872, string, f5, f8, f4, color2, color3, 1.8f, 0.015f);
        } else {
            bsh2.az_2(class_45872, string, f11 + 0.75f, f8 + 0.85f, f10, f4, color, 14.0f, Duration.ofMillis(3600L), Duration.ofMillis(500L));
            bsh2.az_2(class_45872, string, f11, f8, f10, f4, color2, 14.0f, Duration.ofMillis(3600L), Duration.ofMillis(500L));
        }
        f5 = Math.min(f10, 68.0f) * (0.6f + f7 * 0.28f) * f6;
        if (f5 > 2.0f) {
            bjgh.zyn.sla(class_45872, f - f5 / 2.0f, f8 + f4 + 3.0f, f5, 0.8f, 0.4f, color3, color4, color4, color3);
        }
    }

    private void adhr(class_332 class_3322, class_1799 class_17992, float f, float f2, float f3) {
        if (class_17992.method_7960()) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f + (f3 - 16.0f) / 2.0f, f2 + (f3 - 16.0f) / 2.0f, 0.0f);
        class_3322.method_51427(class_17992, 0, 0);
        ((IDrawContextAccessor)class_3322).callDrawItemBar(class_17992, 0, 0);
        ((IDrawContextAccessor)class_3322).callDrawCooldownProgress(class_17992, 0, 0);
        class_3322.method_51431(bdt_2.mc.field_1772, class_17992, 0, 0);
        class_45872.method_22909();
    }

    private void saw_2(class_332 class_3322, int n, float f, float f2) {
        if (bdt_2.mc.field_1690.field_1852 == null || bdt_2.mc.field_1690.field_1852.length <= n) {
            return;
        }
        class_304 class_3042 = bdt_2.mc.field_1690.field_1852[n];
        String string = this.ddhq_2(class_3042);
        if (string == null || string.isEmpty() || string.equalsIgnoreCase("NONE")) {
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        float f3 = 4.5f;
        while (brz_2.btd_2.shdf_2(string, f3) > 16.0f && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        float f4 = f + 2.0f;
        float f5 = f2 + 2.0f;
        class_45872.method_46416(f4, f5, 250.0f);
        brz_2.btd_2.zskh_4(class_45872, string, 0.0f, 0.0f, f3, bas_4.shjz(), 0.0f);
        class_45872.method_22909();
    }

    private String ddhq_2(class_304 class_3042) {
        String string = class_3042.method_1428();
        if (string == null || string.isEmpty()) {
            String string2 = class_3042.method_16007().getString();
            return string2 == null ? "" : this.thbl(string2).toUpperCase(Locale.ROOT).replace(" ", "");
        }
        String string3 = string.toLowerCase(Locale.ROOT);
        if (string3.startsWith("key.keyboard.")) {
            string3 = string3.substring("key.keyboard.".length());
        } else if (string3.startsWith("key.mouse.")) {
            string3 = string3.substring("key.mouse.".length());
        } else if (string3.startsWith("key.hotbar.")) {
            string3 = string3.substring("key.hotbar.".length());
        }
        return switch (string3) {
            case "page.up" -> "PGUP";
            case "page.down" -> "PGDN";
            case "home" -> "HOME";
            case "end" -> "END";
            case "pause" -> "PAUSE";
            case "insert" -> "INS";
            case "delete" -> "DEL";
            case "print.screen" -> "PRTSC";
            case "scroll.lock" -> "SCRLK";
            case "caps.lock" -> "CAPS";
            case "left.shift" -> "LSH";
            case "right.shift" -> "RSH";
            case "left.control" -> "LCTL";
            case "right.control" -> "RCTL";
            case "left.alt" -> "LALT";
            case "right.alt" -> "RALT";
            case "space" -> "SPC";
            case "escape" -> "ESC";
            case "enter" -> "ENT";
            case "backspace" -> "BKSP";
            case "tab" -> "TAB";
            case "apostrophe" -> "'";
            case "semicolon" -> ";";
            case "comma" -> ",";
            case "period" -> ".";
            case "slash" -> "/";
            case "backslash" -> "\\";
            case "left.bracket" -> "[";
            case "right.bracket" -> "]";
            case "grave.accent" -> "`";
            case "minus" -> "-";
            case "equal" -> "=";
            default -> {
                if (string3.startsWith("keypad.")) {
                    String var6_7 = string3.substring("keypad.".length()).toUpperCase(Locale.ROOT).replace(".", "");
                    yield "KP" + var6_7;
                }
                yield string3.toUpperCase(Locale.ROOT).replace(".", "");
            }
        };
    }

    private String thbl(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        String string2 = "йцукенгшщзхъфывапролджэячсмитьбю.ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСMITЬБЮ,";
        String string3 = "qwertyuiop[]asdfghjkl;'zxcvbnm,./QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            int n = string2.indexOf(c);
            if (n != -1) {
                stringBuilder.append(string3.charAt(n));
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private boolean tzt_6() {
        return bza_4.thtsh_2().hfh() && bdt_2.mc.field_1724 != null && !bdt_2.mc.field_1690.field_1842;
    }

    private zz dkhl(class_332 class_3322) {
        float f = 182.0f;
        float f2 = 51.0f;
        float f3 = (float)class_3322.method_51421() / 2.0f - f / 2.0f;
        float f4 = (float)class_3322.method_51443() - 54.0f;
        return new zz(f3, f4, f, f2);
    }

    @Generated
    public static bdt_2 hqh() {
        return tzd_4;
    }

    private static String[] t202i6dhktrk1(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite zuefubum7gc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wgamxqot037j ^ string.hashCode() ^ n2 + uus4ozh726 ^ i * 486284879 ^ wgamxqot037j, 9) ^ uus4ozh726));
            }
            String[] stringArray = bdt_2.t202i6dhktrk1(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

