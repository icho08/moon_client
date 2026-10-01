/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_1799
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 *  net.minecraft.class_5251
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Vector2f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_5251;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bthw;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.btth_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.sa_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.za_3;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Item ESP", category=bzw.OTHER, desc="Renders compact item labels and falling paths")
public final class bdhsh
extends bnq {
    private static final int dhkz_2 = 80;
    private static final int khshq = 16;
    private static final int jdr_2 = 96;
    private static final float khyb = 12.0f;
    private static final float hdth = 1.5f;
    private static final float dhkhz = 6.5f;
    private static final float shdy = 0.5f;
    private static final float rfr = 8.0f;
    private static final float thmh = 3.0f;
    private static final float thaw = 2.0f;
    private static final float dtt_3 = 4.0E-4f;
    private final badh_2 sdy_3 = new badh_2(this, "Labels").bts(true);
    private final badh_2 shzs = new badh_2(this, "Falling Traj".concat("ectories")).bts(true);
    private final badh_2 bdt_2 = new badh_2(this, "Theme Trajectory Color").bts(true);
    private final tay khwf = new tay(this, "Range").shth_7(Float.intBitsToFloat(732716777 + 357802263)).dhbs_2(Float.intBitsToFloat(716456676 + 411811100)).rkh_3(2.0f).ssd_5(Float.intBitsToFloat(-185747207 + 1301432071));
    private final tay shkhd_2 = new tay(this, "Max Labels").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(807598330) ^ 0x1DBF440C)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1404761296) ^ 0x493F5DCA));
    private final tay htj = new tay(this, "Label Scale").shth_7(Float.intBitsToFloat(Integer.reverse(1861258466) ^ 0x783DC3BB)).dhbs_2(Float.intBitsToFloat(0x7A0007C5 ^ 0x45E661A3)).rkh_3(Float.intBitsToFloat(-222107311 + 1250550652)).ssd_5(1.0f);
    private final tay shyz_2 = new tay(this, "Max Traje".concat("ctories")).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-819524670 - -1918432318)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1743603589) ^ 0xE0E2B7E6));
    private final tay jkt_2 = new tay(this, "Trajectory Length").shth_7(Float.intBitsToFloat(924316869 - -170396475)).dhbs_2(Float.intBitsToFloat(2132277634 - 1004796290)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xC446EAAB ^ 0x6C46EABB, 26)));
    private final tay hshs_2 = new tay(this, "Trajecto".concat("ry Width")).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x89C5D79C ^ 0x8A35D79C, 4))).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1620635127) ^ 0xD008E6F9)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x61F0E246 ^ 0xAD3C2F7B, 24))).ssd_5(Float.intBitsToFloat(-1182501794 - 2045434564));
    private final tay rthr = new tay(this, "Trajectory Glow").shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-762688301 + 1791131642)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x14AA9382 ^ 0x8D326F1B, 14)));
    private final bzw_2 jqm = new bzw_2(this, "Tag Background").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(2096226234) ^ 0x1CFB8F3E), Float.intBitsToFloat(Integer.rotateLeft(0x9A84B8BF ^ 0x9A84BAB6, 21)), Float.intBitsToFloat(-166657475 + 1264516547), Float.intBitsToFloat(1986869995 - 856439531)));
    private final bzw_2 dbm = new bzw_2(this, "Trajectory Color").dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xD848DA4A ^ 0x85C8DA42, 27)), Float.intBitsToFloat(-1034231429 - 2140070267), Float.intBitsToFloat(923256934 - -209139610), Float.intBitsToFloat(-1212952890 - 1949617862)));
    private final class_1542[] bdz_4 = new class_1542[1163461400 + -1163461320];
    private final double[] khssh_2 = new double[Integer.rotateLeft(0x97BB12A9 ^ 0x9DBB12A9, 11)];
    private final class_1542[] dhzth = new class_1542[0xDFAFF8FE ^ 0xDFAFF8EE];
    private final double[] zbsh = new double[274741175 + -274741159];
    private final za_3[] smm = new za_3[0x89271701 ^ 0x89271711];
    private final bql<bbgh> sjn_2 = this::khsz_3;
    private final bql<shw_3> dhhs_2 = this::dda_7;
    private static final int dhdhb = -597350251;
    private static final int zws = 1375803597;
    private static final int that_3 = -1562607522;
    private static final int shrdh = 2076646396;
    private static final int cm24fyfa4q = 1115060905;
    private static final int qqoc83urdp7m6 = -2121065918;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ilaetegrovfk;

    public bdhsh() {
        for (int i = 0; i < this.smm.length; ++i) {
            this.smm[i] = new za_3(Integer.rotateLeft(0x9C55BBF6 ^ 0x9C65BBF6, 17));
        }
    }

    private int thdgh_2(class_1542[] class_1542Array, double[] dArray, int n, boolean bl) {
        try {
            int n2 = -1372273065;
            n2 = Integer.rotateLeft(n2 * -199769531, 16) ^ 0x278F1C24;
            n2 = (class_1542Array != null ? System.identityHashCode(class_1542Array) : 0) ^ n2;
            n2 = (dArray != null ? System.identityHashCode(dArray) : 0) ^ n2;
            int n3 = n2 ^ 0xFC3EE86;
            if ((n3 ^ n2) != 264498822) {
                int cfr_ignored_0 = (0xA1F728D1 ^ n2) - -1100484153;
            }
            if ((0x10F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bdhsh.dr_2()) {
            yf.athz_2();
        }
        int n4 = Math.min(class_1542Array.length, Math.max(1, n));
        int n5 = 0;
        double d = bdhsh.hdz(this.khwf) * this.khwf.thw_5();
        for (class_1297 class_12972 : bdhsh.mc.field_1687.method_18112()) {
            double d2;
            class_1542 class_15422;
            if (!(class_12972 instanceof class_1542) || (class_15422 = (class_1542)class_12972).method_31481() || class_15422.method_6983().method_7960() || bl && !this.bbh(class_15422) || (d2 = bdhsh.mc.field_1724.method_5858((class_1297)class_15422)) > d) continue;
            if (n5 < n4) {
                class_1542Array[n5] = class_15422;
                dArray[n5] = d2;
                ++n5;
                continue;
            }
            int n6 = 0;
            for (int i = 1; i < n5; ++i) {
                if (!(dArray[i] > dArray[n6])) continue;
                n6 = i;
            }
            if (!(d2 < dArray[n6])) continue;
            class_1542Array[n6] = class_15422;
            dArray[n6] = d2;
        }
        return n5;
    }

    private boolean bbh(class_1542 class_15422) {
        int n = 523035420;
        n = Integer.rotateLeft(n * -1972033233, 26) ^ 0x93FD4EEB;
        n = System.identityHashCode(this) ^ n;
        class_1542 class_15423 = class_15422;
        n = Integer.rotateLeft((class_15423 != null ? System.identityHashCode(class_15423) : 0) ^ n, 4);
        int n2 = n ^ 0x5C274D;
        if ((n2 ^ n) != 6039373) {
            int cfr_ignored_0 = (0x1F70C451 ^ n) + -934892221;
        }
        if (class_15422.method_24828() || class_15422.method_5799() || bdhsh.tqdh_2(class_15422)) {
            return false;
        }
        class_243 class_2432 = class_15422.method_18798();
        return class_2432.field_1351 < Double.longBitsToDouble(0x4A883DA27900F199L ^ 0xF5EC47433EAEE5E2L) && bdhsh.tghgh_2(class_2432) >= Double.longBitsToDouble(0x9DEA3037BABF089EL ^ 0xA2D006D55ABF089EL);
    }

    private void jth(class_332 class_3322, class_1799 class_17992, sa_4 sa2_2) {
        String string = class_17992.method_7964().getString();
        if (string.isBlank()) {
            return;
        }
        String string2 = class_17992.method_7947() > 1 ? " x" + class_17992.method_7947() : "";
        float f = this.htj.thw_5();
        float f2 = brz_2.ryk.shdf_2(string, 6.5f);
        float f3 = brz_2.ryk.shdf_2(string2, 6.5f);
        float f4 = 13.0f + f2 + f3 + 3.0f;
        float f5 = (sa2_2.khtkh + sa2_2.tfz_2 - f4 * f) * 0.5f;
        float f6 = sa2_2.dhh_5 - 14.5f * f;
        class_4587 class_45872 = class_3322.method_51448();
        class_45872.method_22903();
        class_45872.method_46416(f5, f6, 0.0f);
        class_45872.method_22905(f, f, 1.0f);
        bdht.sqr_2(class_45872, 0.0f, 0.0f, f4, 12.0f, zth_8.all(1.5f), byq.tkhw(this.jqm.sdsh_4().rk()));
        class_45872.method_22903();
        class_45872.method_46416(3.0f, 2.0f, 0.0f);
        class_45872.method_22905(0.5f, 0.5f, 1.0f);
        class_3322.method_51427(class_17992, 0, 0);
        class_45872.method_22909();
        float f7 = 13.0f;
        float f8 = 2.45f;
        brz_2.ryk.zskh_4(class_45872, string, f7, f8, 6.5f, this.zzz_8(class_17992), 0.0f);
        if (!string2.isEmpty()) {
            brz_2.ryk.zskh_4(class_45872, string2, f7 + f2, f8, 6.5f, new Color(158, 162, 174), 0.0f);
        }
        class_45872.method_22909();
    }

    private Color zzz_8(class_1799 class_17992) {
        class_5251 class_52512;
        int n = btth_2.rzs_3(1246168372);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
        class_1799 class_17993 = class_17992;
        n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
        int n2 = n ^ 0xE1BB1EBE;
        if ((n2 ^ n) != -507830594) {
            int cfr_ignored_0 = Integer.rotateRight(0xABFC1B8A ^ n, 8) + -672860943;
        }
        if ((class_52512 = class_17992.method_7964().method_10866().method_10973()) != null) {
            return new Color(class_52512.method_27716());
        }
        Integer n3 = class_17992.method_7932().method_58413().method_532();
        return n3 == null ? Color.WHITE : new Color(n3);
    }

    private sa_4 hash_3(class_1542 class_15422, float f) {
        int n = 1754012922;
        n = Integer.rotateLeft(n * -1246360241, 26) ^ 0x4FE4C8BD;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xE137144C;
        if ((n2 ^ n) != -516484020) {
            int cfr_ignored_0 = (0x89BB08B6 ^ n) + -1533463798;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        double d = class_3532.method_16436((double)f, (double)class_15422.field_6014, (double)bdhsh.zzt_6(class_15422));
        double d2 = class_3532.method_16436((double)f, (double)class_15422.field_6036, (double)class_15422.method_23318());
        double d3 = bdhsh.shdht_2(f, class_15422.field_5969, class_15422.method_23321());
        class_238 class_2382 = bdhsh.khshz_2(class_15422.method_5829(), d - bdhsh.tzm_4(class_15422), d2 - bdhsh.sshd(class_15422), d3 - bdhsh.dbth(class_15422));
        float f2 = Float.intBitsToFloat(1788338463 - -350756576);
        float f3 = Float.intBitsToFloat(1514002579 + 625092460);
        float f4 = Float.intBitsToFloat(0xF87208D2 ^ 0x70DF72D);
        float f5 = Float.intBitsToFloat(-357255476 + 348866867);
        boolean bl = false;
        for (int i = 0; i < 3736157 + -3736149; ++i) {
            double d4 = (i & 1) == 0 ? class_2382.field_1323 : class_2382.field_1320;
            double d5 = (i & 2) == 0 ? class_2382.field_1322 : class_2382.field_1325;
            double d6 = (i & 4) == 0 ? class_2382.field_1321 : class_2382.field_1324;
            Vector2f vector2f = bdhsh.bbs_2(d4, d5, d6);
            if (vector2f.x == Float.intBitsToFloat(0x830F4BB6 ^ 0xFC70B449) || vector2f.y == Float.intBitsToFloat(0x261060A0 ^ 0x596F9F5F)) continue;
            bl = true;
            f2 = Math.min(f2, vector2f.x);
            f3 = Math.min(f3, vector2f.y);
            f4 = Math.max(f4, vector2f.x);
            f5 = Math.max(f5, vector2f.y);
        }
        return bl ? new sa_4(f2, f3, f4, f5) : null;
    }

    private boolean bk(za_3 za2_3, class_1542 class_15422, float f, class_243 class_2432, int n) {
        za2_3.rshn();
        class_243 class_2433 = new class_243(class_3532.method_16436((double)f, (double)class_15422.field_6014, (double)class_15422.method_23317()), class_3532.method_16436((double)f, (double)class_15422.field_6036, (double)class_15422.method_23318()), class_3532.method_16436((double)f, (double)class_15422.field_5969, (double)class_15422.method_23321()));
        class_243 class_2434 = class_15422.method_18798();
        za2_3.ghtz_3(class_2433.method_1020(class_2432));
        for (int i = 0; i < n; ++i) {
            class_243 class_2435 = class_2433.method_1019(class_2434);
            class_3965 class_39652 = bdhsh.mc.field_1687.method_17742(new class_3959(class_2433, class_2435, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_15422));
            if (class_39652.method_17783() != class_239.class_240.field_1333) {
                za2_3.ghtz_3(class_39652.method_17784().method_1020(class_2432));
                return za2_3.qb() > 1;
            }
            za2_3.ghtz_3(class_2435.method_1020(class_2432));
            class_2433 = class_2435;
            class_2434 = class_2434.method_1021(class_15422.method_5799() ? 0.8 : 0.99).method_1031(0.0, -class_15422.method_56989(), 0.0);
            if (class_2433.field_1351 < (double)bdhsh.mc.field_1687.method_31607() - 2.0 || class_2434.method_1027() < 1.0E-6) break;
        }
        return za2_3.qb() > 1;
    }

    private void bghn(class_4587 class_45872, int n) {
        Color color = this.bdt_2.shzl() ? new Color(bas_4.zsz_4().getRGB(), true) : new Color(this.dbm.sdsh_4().rk(), true);
        float f = 0.06f + this.hshs_2.thw_5() * 0.07f;
        float f2 = this.rthr.thw_5();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        if (f2 > 0.0f) {
            this.thyth(matrix4f, n, color, f * 3.3f, 0.18f * f2);
            this.thyth(matrix4f, n, color, f * 1.8f, 0.34f * f2);
        }
        this.thyth(matrix4f, n, color, f, 0.86f);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void thyth(Matrix4f matrix4f, int n, Color color, float f, float f2) {
        for (int i = 0; i < n; ++i) {
            za_3 za2_3 = this.smm[i];
            int n2 = za2_3.qb();
            if (n2 < 2) continue;
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27380, class_290.field_1576);
            for (int j = 0; j < n2; ++j) {
                double d;
                double d2;
                float f3 = (float)j / (float)(n2 - 1);
                float f4 = (float)Math.pow(1.0f - f3, 1.35f);
                float f5 = f4 * f2;
                int n3 = class_3532.method_15340((int)Math.round((float)color.getAlpha() * f5), (int)0, (int)255);
                int n4 = bdhsh.zaj_3(color, n3);
                float f6 = f * (0.22f + f4 * 0.78f);
                int n5 = Math.max(0, j - 1);
                int n6 = Math.min(n2 - 1, j + 1);
                double d3 = za2_3.shqa(n6) - za2_3.shqa(n5);
                double d4 = za2_3.th_4(n6) - za2_3.th_4(n5);
                double d5 = za2_3.zhz_5(n6) - za2_3.zhz_5(n5);
                double d6 = -za2_3.shqa(j);
                double d7 = -za2_3.th_4(j);
                double d8 = -za2_3.zhz_5(j);
                double d9 = d4 * d8 - d5 * d7;
                double d10 = d9 * d9 + (d2 = d5 * d6 - d3 * d8) * d2 + (d = d3 * d7 - d4 * d6) * d;
                if (d10 < 1.0E-6) {
                    d9 = -d5;
                    d2 = 0.0;
                    d = d3;
                    d10 = d9 * d9 + d * d;
                }
                double d11 = d10 > 1.0E-6 ? (double)f6 / Math.sqrt(d10) : 0.0;
                double d12 = za2_3.shqa(j);
                double d13 = za2_3.th_4(j);
                double d14 = za2_3.zhz_5(j);
                class_2872.method_22918(matrix4f, (float)(d12 + (d9 *= d11)), (float)(d13 + (d2 *= d11)), (float)(d14 + (d *= d11))).method_39415(n4);
                class_2872.method_22918(matrix4f, (float)(d12 - d9), (float)(d13 - d2), (float)(d14 - d)).method_39415(n4);
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
    }

    private static int zaj_3(Color color, int n) {
        try {
            int n2 = 2108495159;
            n2 = Integer.rotateLeft(n2 * -341955197, 25) ^ 0x7028C312;
            int n3 = n2 ^ 0xB66F2105;
            if ((n3 ^ n2) != -1234231035) {
                int cfr_ignored_0 = (0xCBC23432 ^ n2) - 709500265;
            }
            if ((0x351 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return class_3532.method_15340((int)n, (int)0, (int)(0x97463C1F ^ 0x97463CE0)) << Integer.rotateLeft(0xDCCD46CB ^ 0xDCD546CB, 16) | bdhsh.djl_2(color) & (bdhsh.bab_2(1735960640) ^ 0x2EAE119);
    }

    private void dda_7(shw_3 shw2) {
        int n = -1210035495;
        n = Integer.rotateLeft(n * 918413263, 19) ^ 0x1C0D4E7E;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0xCF0B3C46;
        if ((n2 ^ n) != -821347258) {
            int cfr_ignored_0 = (0x78EB6E9F ^ n) - -2034392311;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (!this.shzs.shzl() || bdhsh.mc.field_1724 == null || bdhsh.mc.field_1687 == null) {
            return;
        }
        int n3 = this.thdgh_2(this.dhzth, this.zbsh, Math.round(this.shyz_2.thw_5()), true);
        if (n3 == 0) {
            return;
        }
        class_243 class_2432 = shw2.dhal().method_19326();
        int n4 = 0;
        int n5 = Math.round(this.jkt_2.thw_5());
        for (int i = 0; i < n3; ++i) {
            za_3 za2_3;
            class_1542 class_15422 = this.dhzth[i];
            this.dhzth[i] = null;
            if (class_15422 == null || !this.bk(za2_3 = this.smm[n4], class_15422, shw2.skz_4(), class_2432, n5)) continue;
            ++n4;
        }
        if (n4 > 0) {
            this.bghn(shw2.ssha_2(), n4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void khsz_3(bbgh bbgh2) {
        int n = -1127774612;
        n = Integer.rotateLeft(n * -1641560823, 23) ^ 0x99B8F3F7;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xEA073788;
        if ((n2 ^ n) != -368625784) {
            int cfr_ignored_0 = (0x56C0B1E4 ^ n) - -463669744;
        }
        if (!this.sdy_3.shzl() || bdhsh.mc.field_1724 == null || bdhsh.mc.field_1687 == null || bdhsh.mc.field_1690.field_1842) {
            return;
        }
        int n3 = this.thdgh_2(this.bdz_4, this.khssh_2, Math.round(this.shkhd_2.thw_5()), false);
        if (n3 == 0) {
            return;
        }
        bthw.tnj_2();
        try {
            ghdh_3 ghdh2 = bbgh2.dtn();
            float f = bbgh2.bhw();
            for (int i = 0; i < n3; ++i) {
                sa_4 sa2_2;
                class_1542 class_15422 = this.bdz_4[i];
                this.bdz_4[i] = null;
                if (class_15422 == null || (sa2_2 = this.hash_3(class_15422, f)) == null) continue;
                this.jth(ghdh2, class_15422.method_6983(), sa2_2);
            }
        }
        finally {
            bthw.dwy();
        }
    }

    private static String shz_9(String string, int n, int n2, int n3) {
        try {
            int n4 = -1965175594;
            n4 = Integer.rotateLeft(n4 * -1176096991, 28) ^ 0x3007315C;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            n4 = n ^ n4;
            int n5 = n4 ^ 0x20917827;
            if ((n5 ^ n4) != 546404391) {
                int cfr_ignored_0 = (0xAA4CB4F1 ^ n4) - 902025503;
            }
            if ((0x92 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xCF3E758F) + i ^ dhdhb, 17) ^ n2 + zws));
        }
        return new String(cArray);
    }

    private static boolean dr_2() {
        block0: {
            int n = 723677832;
            int n2 = (n = Integer.rotateLeft(n * -1640344675, 10) ^ 0x847BC364) ^ 0x88CEA3E2;
            if ((n2 ^ n) == -1999723550) break block0;
            int cfr_ignored_0 = (0xA3ECD16A ^ n) + 514099497;
        }
        return yf.khdha_2();
    }

    private static float hdz(tay tay2) {
        block0: {
            int n = 1800969233;
            n = Integer.rotateLeft(n * 1452899695, 27) ^ 0xEAE57F15;
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0xDAD11763;
            if ((n2 ^ n) == -623831197) break block0;
            int cfr_ignored_0 = (0xB1898B72 ^ n) + 1513708851;
        }
        return tay2.thw_5();
    }

    private static boolean tqdh_2(class_1542 class_15422) {
        block0: {
            int n = 1662210913;
            int n2 = (n = Integer.rotateLeft(n * 799184605, 12) ^ 0xDCA3208C) ^ 0xD54C868E;
            if ((n2 ^ n) == -716405106) break block0;
            int cfr_ignored_0 = (0xB65FD5EF ^ n) + -932016964;
        }
        return class_15422.method_5869();
    }

    private static double tghgh_2(class_243 class_2432) {
        block0: {
            int n = 1827953909;
            n = Integer.rotateLeft(n * -870021233, 23) ^ 0x4F8F2539;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 11);
            int n2 = n ^ 0xCEC972C8;
            if ((n2 ^ n) == -825658680) break block0;
            int cfr_ignored_0 = (0xA23D2E3D ^ n) - -603443145;
        }
        return class_2432.method_1027();
    }

    private static double zzt_6(class_1542 class_15422) {
        block0: {
            int n = btth_2.rzs_3(1870249950);
            class_1542 class_15423 = class_15422;
            n = (class_15423 != null ? System.identityHashCode(class_15423) : 0) ^ n;
            int n2 = n ^ 0x777D5407;
            if ((n2 ^ n) == 2004702215) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1804EBD9 ^ n, 6) + -319410558) * 402975705;
            int cfr_ignored_1 = (int)(0xDAB645E427D4EB4FL ^ (long)n ^ 0x76B8831A2DB818BDL);
        }
        return class_15422.method_23317();
    }

    private static double shdht_2(double d, double d2, double d3) {
        block0: {
            int n = btth_2.rzs_3(431946703);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xD5EFF03B;
            if ((n2 ^ n) == -705695685) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCC510BF4 ^ n, 12) - -1037168185) * -867103755;
        }
        return class_3532.method_16436((double)d, (double)d2, (double)d3);
    }

    private static double tzm_4(class_1542 class_15422) {
        block0: {
            int n = -1416401234;
            int n2 = (n = Integer.rotateLeft(n * -978577235, 11) ^ 0x7A302CAB) ^ 0xB5EADE6;
            if ((n2 ^ n) == 190754278) break block0;
            int cfr_ignored_0 = (0xA0CDC348 ^ n) - -647620688;
        }
        return class_15422.method_23317();
    }

    private static double sshd(class_1542 class_15422) {
        block0: {
            int n = 1414563995;
            n = Integer.rotateLeft(n * 2051340407, 5) ^ 0xB14FCA3D;
            class_1542 class_15423 = class_15422;
            n = Integer.rotateLeft((class_15423 != null ? System.identityHashCode(class_15423) : 0) ^ n, 8);
            int n2 = n ^ 0x27C4372A;
            if ((n2 ^ n) == 667170602) break block0;
            int cfr_ignored_0 = (0x7394BFB1 ^ n) + 1513460505;
        }
        return class_15422.method_23318();
    }

    private static double dbth(class_1542 class_15422) {
        block0: {
            int n = -1925833142;
            n = Integer.rotateLeft(n * -126912605, 19) ^ 0x2CA38E7B;
            class_1542 class_15423 = class_15422;
            n = (class_15423 != null ? System.identityHashCode(class_15423) : 0) ^ n;
            int n2 = n ^ 0x29821116;
            if ((n2 ^ n) == 696389910) break block0;
            int cfr_ignored_0 = (0xA4B40F5C ^ n) + 1226906051;
        }
        return class_15422.method_23321();
    }

    private static class_238 khshz_2(class_238 class_2382, double d, double d2, double d3) {
        block0: {
            int n = 348951330;
            int n2 = (n = Integer.rotateLeft(n * 231346693, 13) ^ 0x139A489D) ^ 0x53CA745C;
            if ((n2 ^ n) == 1405776988) break block0;
            int cfr_ignored_0 = (0x4706E77E ^ n) - -1022154125;
        }
        return class_2382.method_989(d, d2, d3);
    }

    private static Vector2f bbs_2(double d, double d2, double d3) {
        block0: {
            int n = 804741890;
            n = Integer.rotateLeft(n * -1158831711, 12) ^ 0x993D5007;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 5);
            int n2 = n ^ 0xF069E884;
            if ((n2 ^ n) == -261494652) break block0;
            int cfr_ignored_0 = (0xDF9E8B86 ^ n) - 913868291;
        }
        return bthw.ragh_2(d, d2, d3);
    }

    private static int djl_2(Color color) {
        block0: {
            int n = 1908887474;
            int n2 = (n = Integer.rotateLeft(n * -1115515409, 10) ^ 0x7BEAD1C7) ^ 0x9DA315BD;
            if ((n2 ^ n) == -1650256451) break block0;
            int cfr_ignored_0 = (0xEC645A0F ^ n) - -1245325238;
        }
        return color.getRGB();
    }

    private static int bab_2(int n) {
        block0: {
            int n2 = 95289307;
            int n3 = (n2 = Integer.rotateLeft(n2 * -825371627, 3) ^ 0x777DA15F) ^ 0x1BA14DF;
            if ((n3 ^ n2) == 28972255) break block0;
            int cfr_ignored_0 = (0x417EB04 ^ n2) + 830902517;
        }
        return Integer.reverse(n);
    }

    private static String[] dhdhd(String string) {
        block0: {
            int n = -1939329817;
            n = Integer.rotateLeft(n * -872575867, 5) ^ 0x454FA2B4;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x973062E6;
            if ((n2 ^ n) == -1758436634) break block0;
            int cfr_ignored_0 = (0x1B584E01 ^ n) + -845292754;
        }
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite jshl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1171753569;
            n3 = Integer.rotateLeft(n3 * -817808967, 24) ^ 0x43AE6F71;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 7);
            int n4 = n3 ^ 0x49FD2C0C;
            if ((n4 ^ n3) != 1241328652) {
                int cfr_ignored_0 = (0xC2AA66D ^ n3) - 763803552;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ that_3 ^ string.hashCode() ^ n2 + shrdh ^ i * 1308667031 ^ that_3, 15) ^ shrdh));
            }
            String[] stringArray = bdhsh.dhdhd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rmfgyktge(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rosje4693l2a0g(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ cm24fyfa4q ^ string.hashCode() ^ n2 + qqoc83urdp7m6 + i * 1619823769) + cm24fyfa4q) ^ qqoc83urdp7m6));
            }
            String[] stringArray = bdhsh.rmfgyktge(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

