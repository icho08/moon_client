/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bsn_2;
import us.m0vy.moondlc.m0vyguard.ba_2;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.zgh_2;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ghth_2
implements bmd_2 {
    private static final int sdgh = 24;
    private static final double stha_4 = 1.0;
    private static final double khmm = 1.25;
    private static final double hkj = 0.8;
    private static final float dakh_2 = 0.6f;
    private final ba_2 bbs = ba_2.ghthgh();
    private final float[] ttw = new float[0x81F464B0 ^ 0x81F464A6];
    private final float[] skht_3 = new float[1953623053 + -1953623029];
    private final float[] khtgh = new float[2];
    private float twd;
    private float thhy_2;
    private float zjt_2;
    private float dhst_2;
    private float thnk;
    private float dys;
    private boolean jnr;
    private static final int dgh = 283602875;
    private static final int kth = -1055239810;
    private static final int a8uf9kucsl = 728293159;
    private static final int nz8qwk1 = 445414046;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qc1nppvexxojr5;

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        float f;
        float f2;
        if (lb2 == null || lb3 == null || class_13092 == null || ghth_2.mc.field_1724 == null) {
            return lb2 != null ? lb2 : lb3;
        }
        lb lb4 = bghdh.dss(class_13092.method_5829().method_1005());
        lb lb5 = bl ? this.jghy(class_13092, lb4) : lb4;
        this.dhwf(lb4);
        float f3 = bghdh.ttb_2(lb2.sry(), lb5.sry());
        float f4 = lb5.khdhd_2() - lb2.khdhd_2();
        float f5 = ghth_2.zst_8(f3, bl ? 86.0f : 42.0f, 0.72f, bl ? this.thnk * 0.6f : 0.0f);
        float f6 = ghth_2.zst_8(f4, bl ? 58.0f : 28.0f, 0.68f, bl ? this.dys * 0.6f : 0.0f);
        bsn_2.zwk(this.ttw, ghth_2.mc.field_1724, class_13092, lb2, lb4, this.twd, this.thhy_2, this.bbs.ss(), bl);
        float f7 = f5;
        float f8 = f6;
        if (this.bbs.shnkh(this.ttw, this.skht_3, this.khtgh)) {
            f2 = ghth_2.td(this.khtgh[0] * 90.0f, f3, 90.0f);
            f = ghth_2.td(this.khtgh[1] * 45.0f, f4, 60.0f);
            float f9 = this.bbs.dkhkh();
            float f10 = bl ? (bl2 ? 0.68f : 0.25f) : 0.92f;
            float f11 = Math.min(f10, f9);
            f7 = class_3532.method_16439((float)f11, (float)f5, (float)f2);
            f8 = class_3532.method_16439((float)f11, (float)f6, (float)f);
        }
        if (bl2 && !bl) {
            f2 = class_3532.method_15363((float)(3.5f + Math.abs(this.thnk) * 1.1f), (float)3.5f, (float)18.0f);
            f = class_3532.method_15363((float)(2.5f + Math.abs(this.dys)), (float)2.5f, (float)12.0f);
            f7 = class_3532.method_15363((float)f7, (float)(-f2), (float)f2);
            f8 = class_3532.method_15363((float)f8, (float)(-f), (float)f);
        }
        f7 = ghth_2.shthn(f7, f3);
        f8 = ghth_2.shthn(f8, f4);
        this.twd = f7;
        this.thhy_2 = f8;
        return new lb(lb2.sry() + f7, class_3532.method_15363((float)(lb2.khdhd_2() + f8), (float)-90.0f, (float)90.0f));
    }

    private lb jghy(class_1309 class_13092, lb lb2) {
        class_243 class_2432 = class_13092.method_18798();
        class_243 class_2433 = ghth_2.mc.field_1724.method_18798();
        double d = class_13092.method_23317() - class_13092.field_6014;
        double d2 = class_13092.method_23318() - class_13092.field_6036;
        double d3 = class_13092.method_23321() - class_13092.field_5969;
        double d4 = ghth_2.rthl(d, class_2432.field_1352);
        double d5 = ghth_2.rthl(d2, class_2432.field_1351);
        double d6 = ghth_2.rthl(d3, class_2432.field_1350);
        double d7 = (d4 - class_2433.field_1352) * 1.0;
        double d8 = (d5 - class_2433.field_1351) * 1.0;
        double d9 = (d6 - class_2433.field_1350) * 1.0;
        double d10 = Math.hypot(d7, d9);
        if (d10 > 1.25) {
            double d11 = 1.25 / d10;
            d7 *= d11;
            d9 *= d11;
        }
        d8 = class_3532.method_15350((double)d8, (double)-0.8, (double)0.8);
        if (!(Double.isFinite(d7) && Double.isFinite(d8) && Double.isFinite(d9))) {
            return lb2;
        }
        class_238 class_2383 = class_13092.method_5829();
        class_243 class_2434 = new class_243((class_2383.field_1323 + class_2383.field_1320) * 0.5 + d7, (class_2383.field_1322 + class_2383.field_1325) * 0.5 + d8, (class_2383.field_1321 + class_2383.field_1324) * 0.5 + d9);
        return bghdh.dss(class_2434);
    }

    private static double rthl(double d, double d2) {
        double d3 = 0.0;
        int n = 0;
        int n2 = -876739142;
        n2 = Integer.rotateLeft(n2 * 2092296031, 6) ^ 0xEAB13E68;
        int n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27)));
        block32: while (true) {
            switch (Integer.rotateRight(n3, 27) ^ n2) {
                case 149589236: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x7E8AB36C ^ n2, 18) - 1462327631;
                    if (Double.isFinite(d)) {
                        int cfr_ignored_1 = (int)(0x1AB41D9523BD56E2L ^ (long)n2 ^ 0xC65A8BC956E398B9L);
                        n3 = Integer.rotateLeft(n2 ^ 0xBA449B15, 27) + 1832212607 - 1832212607;
                        int cfr_ignored_2 = (int)(0x5589541A64FC2870L ^ (long)n2 ^ 0x5544054BABC706C3L);
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8E41D4C3, 27) ^ 0x318A9882FFFFEB53L ^ 0x318A9882FFFFEB53L);
                        continue block32;
                    }
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x71111656, 27)));
                    int cfr_ignored_3 = Integer.rotateRight(0x242ADD42 ^ n2, 7) + 1703832121;
                    n3 = Integer.rotateLeft(n2 ^ 0xF8CD52C4, 27);
                    n -= 4;
                    continue block32;
                }
                case -1908288317: {
                    int cfr_ignored_4 = Integer.rotateLeft(0x1C333084 ^ n2, 6) - 1854963511;
                    if (Double.isFinite(d2)) {
                        try {
                            n += 3;
                            if ((0xA6E5D24BA7839DA7L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA3316819, 27) ^ 0x4E447948839FA5ECL ^ 0x4E447948839FA5ECL);
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA3316819, 27)));
                        }
                        ++n;
                        continue block32;
                    }
                    try {
                        n += 3;
                        if ((0x12A280802D1A827FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xF8CD52C4, 27);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xF8CD52C4, 27) ^ 0x940774C2 ^ 0x940774C2;
                    }
                    continue block32;
                }
                case -1557043175: {
                    int cfr_ignored_5 = Integer.rotateRight(0xBD7326C7 ^ n2, 10) - -179351212;
                    d3 = d * Double.longBitsToDouble(0xE67F37D674983291L ^ 0xD99737D674983291L) + d2 * Double.longBitsToDouble(0x5B4F2D56621E9372L ^ 0x649F2D56621E9372L);
                    n3 = Integer.rotateLeft(n2 ^ 0x77871871, 27) + -346991604 - -346991604;
                    int cfr_ignored_6 = Integer.rotateLeft(0x798F5FC0 ^ n2, 18) + -1128646789;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3D0F6BB3, 27) ^ 0xF76F79A884D807BL ^ 0xF76F79A884D807BL);
                    ++n;
                    continue block32;
                }
                case -120761660: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xF23EB93 ^ n2, 4) + -642308600) * 254012307;
                    d3 = 0.0;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x3D0F6BB3, 27)));
                    int cfr_ignored_8 = (Integer.rotateLeft(0xE3658138 ^ n2, 15) + -1918352125) * -479887047;
                    continue block32;
                }
                case -1231522162: {
                    int cfr_ignored_9 = (Integer.rotateRight(0x5F23327B ^ n2, 14) + -1985954784) * 1596142203;
                    n3 = Integer.rotateLeft(n2 ^ 0x5ED8122F, 27) ^ 0x4FE91AF8 ^ 0x4FE91AF8;
                    int cfr_ignored_10 = Integer.rotateLeft(0x6207B1E1 ^ n2, 15) + -481547910;
                    int cfr_ignored_11 = (int)(0xA0B51FDC27D4EB4FL ^ (long)n2 ^ 0xC2C8831A2DB8ECBBL);
                    int cfr_ignored_12 = (int)(0xADB24E715EFBDF14L ^ (long)n2 ^ 0x61927144450EF6B5L);
                    n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0x8D74D35 ^ 0x8D74D35;
                    ++n;
                    continue block32;
                }
                case 1015102624: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x36B46AFC ^ n2, 9) - -1539927105) * 917793533;
                    try {
                        if ((0x61783B3B3949B991L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0xC0AEFDFBF977D7D6L ^ 0xC0AEFDFBF977D7D6L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) + 244726621 - 244726621;
                    }
                    n -= 2;
                    continue block32;
                }
                case -1766885613: {
                    int cfr_ignored_14 = Integer.rotateRight(0x8E9DA56E ^ n2, 4) - 1232381837;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0x15DA9D468EDF199AL ^ 0x15DA9D468EDF199AL);
                    int cfr_ignored_15 = (Integer.rotateRight(0x8132FD57 ^ n2, 3) - -1450554172) * -2127364777;
                    n += 3;
                    continue block32;
                }
                case -1800699566: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0xD3010935 ^ n2, 13) - -1854030682) * -754906827;
                    int cfr_ignored_17 = (int)(0x11B3A70827D4EB4FL ^ (long)n2 ^ 0xB360831A2DB98EB6L);
                    n3 = Integer.rotateLeft(n2 ^ 0x2B857591, 27) ^ 0x1358724C ^ 0x1358724C;
                    int cfr_ignored_18 = (Integer.rotateLeft(0x54033218 ^ n2, 13) + 817934371) * 1409495577;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27)));
                    n -= 4;
                    continue block32;
                }
                case -457740408: {
                    int cfr_ignored_19 = Integer.rotateRight(0xCC6EC243 ^ n2, 12) + -976804520;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xBACA69EC, 27)));
                    int cfr_ignored_20 = (Integer.rotateRight(0x9C60AD93 ^ n2, 6) + -200104952) * -1671385709;
                    int cfr_ignored_21 = (int)(0xDC57F372513361A8L ^ (long)n2 ^ 0x1B946ED53876157EL);
                    n3 = Integer.rotateLeft(n2 ^ 0x1936A1AA, 27) + -1123827272 - -1123827272;
                    int cfr_ignored_22 = (int)(0xA5E11A6AE2AF7D9FL ^ (long)n2 ^ 0xC9A509ED0018E613L);
                    n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) + -1503182371 - -1503182371;
                    continue block32;
                }
                case 1401619652: {
                    int cfr_ignored_23 = Integer.rotateRight(0xB7DDF522 ^ n2, 9) + 1212042841;
                    n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27);
                    int cfr_ignored_24 = (Integer.rotateRight(0x23E1A932 ^ n2, 7) + 1555110985) * 601991475;
                    --n;
                    continue block32;
                }
                case 609336066: {
                    int cfr_ignored_25 = Integer.rotateRight(0x443DA4C7 ^ n2, 11) - 1205113684;
                    int cfr_ignored_26 = (int)(0x4EEF867380655267L ^ (long)n2 ^ 0xF197CC795FE9300EL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0xF54288E98EB2EA26L ^ 0xF54288E98EB2EA26L);
                    continue block32;
                }
                case 342318933: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x1CBD66D7 ^ n2, 6) - 2135757636) * 482174679;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9C4F5290, 27) ^ 0x67A5049BBAC6235AL ^ 0x67A5049BBAC6235AL);
                    int cfr_ignored_28 = (Integer.rotateLeft(0x84BADC50 ^ n2, 3) + 385764587) * -2068128687;
                    try {
                        n += 3;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0x2B31A15B ^ 0x2B31A15B;
                    }
                    continue block32;
                }
                case -257418689: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0xD81CC30 ^ n2, 4) + -1491773173) * 226610225;
                    try {
                        n -= 5;
                        n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0xC0FDA9CB ^ 0xC0FDA9CB;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0xC915BD49978B6BFL ^ 0xC915BD49978B6BFL);
                    }
                    continue block32;
                }
                case -1885205900: {
                    int cfr_ignored_30 = Integer.rotateRight(0xA1331EE2 ^ n2, 7) + -1987158887;
                    try {
                        n += 4;
                        if ((0xE47708B3657E52FBL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0xDE449BC8 ^ 0xDE449BC8;
                    }
                    ++n;
                    continue block32;
                }
                case 193183481: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0xC238BF70 ^ n2, 11) + -1992503861) * -1036468367;
                    try {
                        n += 3;
                        if ((0x43C55349A6852557L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27) ^ 0x25A70CFB ^ 0x25A70CFB;
                    }
                    continue block32;
                }
                case 1024420787: {
                    return d3;
                }
            }
            int cfr_ignored_32 = (Integer.rotateRight(0x9007C7DF ^ n2, 5) - 1968100156) * -1878538273;
            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8EA8CF4, 27)));
        }
    }

    private void dhwf(lb lb2) {
        if (!this.jnr) {
            this.zjt_2 = lb2.sry();
            this.dhst_2 = lb2.khdhd_2();
            this.thnk = 0.0f;
            this.dys = 0.0f;
            this.jnr = true;
            return;
        }
        float f = bghdh.ttb_2(this.zjt_2, lb2.sry());
        float f2 = lb2.khdhd_2() - this.dhst_2;
        this.thnk = class_3532.method_16439((float)0.65f, (float)this.thnk, (float)class_3532.method_15363((float)f, (float)-30.0f, (float)30.0f));
        this.dys = class_3532.method_16439((float)0.65f, (float)this.dys, (float)class_3532.method_15363((float)f2, (float)-18.0f, (float)18.0f));
        this.zjt_2 = lb2.sry();
        this.dhst_2 = lb2.khdhd_2();
    }

    private static float zst_8(float f, float f2, float f3, float f4) {
        float f5 = Math.min(f2, 4.0f + Math.abs(f) * 0.82f);
        float f6 = class_3532.method_15363((float)(f * f3), (float)(-f5), (float)f5);
        return class_3532.method_15363((float)(f4 + f6), (float)(-f2), (float)f2);
    }

    private static float td(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int n = 0;
        int n2 = 1248769315;
        n2 = Integer.rotateLeft(n2 * -1824373481, 27) ^ 0x562BCAEA;
        n2 = Float.floatToIntBits(f) ^ n2;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f3) ^ n2, 21);
        int n3 = (int)((long)(n2 ^ 0x598A21A3) ^ 0x6F4615294AEE39D5L ^ 0x6F4615294AEE39D5L);
        block42: while (true) {
            switch (n3 ^ n2) {
                case 1502224803: {
                    int cfr_ignored_0 = Integer.rotateRight(0xD490C8EF ^ n2, 13) - -1041894356;
                    if (Float.isFinite(f)) {
                        try {
                            n -= 5;
                            n3 = (n2 ^ 0x598A21A0) + 868263726 - 868263726;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x598A21A0));
                        }
                        n -= 2;
                        continue block42;
                    }
                    int cfr_ignored_1 = (int)(0xE40E648EC1277F78L ^ (long)n2 ^ 0x346D4EFD05D665CDL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x3C9CA63F));
                    int cfr_ignored_2 = (int)(0xCF7EF50A4781FBFDL ^ (long)n2 ^ 0x176443B00CDC332CL);
                    n3 = (int)((long)(n2 ^ 0x598A21A2) ^ 0x604892D700A148CBL ^ 0x604892D700A148CBL);
                    n += 3;
                    continue block42;
                }
                case 1502224801: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xA6077ABA ^ n2, 7) + 524647361) * -1509459269;
                    if (Math.signum(f5) == Math.signum(f2)) {
                        int cfr_ignored_4 = (int)(0xC59D9D4313AADAE4L ^ (long)n2 ^ 0xC7F6EBE64EEE26EAL);
                        n3 = n2 ^ 0xFC4D8C0A;
                        int cfr_ignored_5 = (int)(0x28E3F664B36A5E5CL ^ (long)n2 ^ 0x11B9AA67479FFC16L);
                        n3 = (int)((long)(n2 ^ 0x598A219F) ^ 0x46C50DF564A8BF88L ^ 0x46C50DF564A8BF88L);
                        n += 4;
                        continue block42;
                    }
                    try {
                        if ((0x74EB92A7CC9ADDFDL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x598A219E));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 ^ 0x598A219E ^ 0x7F48DD9C ^ 0x7F48DD9C;
                    }
                    n -= 4;
                    continue block42;
                }
                case 1502224802: {
                    int cfr_ignored_6 = Integer.rotateRight(0xCF728BA6 ^ n2, 12) - 591169621;
                    f6 = 0.0f;
                    n3 = n2 ^ 0xC23F6819 ^ 0x82294026 ^ 0x82294026;
                    int cfr_ignored_7 = Integer.rotateLeft(0x38A567CC ^ n2, 10) - -530239249;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x598A21A4));
                    --n;
                    continue block42;
                }
                case 1502224805: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x2256DAD1 ^ n2, 7) + 753016458) * 576117457;
                    int cfr_ignored_9 = (int)(0xE0E474EC27D4EB4FL ^ (long)n2 ^ 0x14A8831A2DB86C19L);
                    f6 = 0.0f;
                    int cfr_ignored_10 = (int)(0xB065C0A2D532FF49L ^ (long)n2 ^ 0x7C3566D605B4CD1AL);
                    n3 = (int)((long)(n2 ^ 0xA92BA869) ^ 0x9BCE86A1095D5443L ^ 0x9BCE86A1095D5443L);
                    int cfr_ignored_11 = (int)(0x6C44DB7CA6011578L ^ (long)n2 ^ 0x4B8980B1D1D77558L);
                    n3 = (int)((long)(n2 ^ 0x598A21A4) ^ 0x2D9573E139A23B2FL ^ 0x2D9573E139A23B2FL);
                    n += 3;
                    continue block42;
                }
                case 1502224800: {
                    int cfr_ignored_12 = (Integer.rotateRight(0xEB730D36 ^ n2, 16) - -2025047867) * -344781513;
                    f4 = Math.min(f3, Math.abs(f2) * Float.intBitsToFloat(0x281AC64B ^ 0x17B60A86) + Float.intBitsToFloat(891653783 + 175796585));
                    f5 = class_3532.method_15363((float)f, (float)(-f4), (float)f4);
                    if (!(ghth_2.dhkhs(f2) > 2.0f)) {
                        try {
                            n += 4;
                            if ((0xFD59C34BAC894F77L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = n2 ^ 0x598A219F ^ 0xADADDA73 ^ 0xADADDA73;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x598A219F));
                        }
                        continue block42;
                    }
                    try {
                        n += 5;
                        if ((0xD7B8E7D481E81F69L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 ^ 0x598A21A1 ^ 0x22F989F3 ^ 0x22F989F3;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x598A21A1) + 1749062860 - 1749062860;
                    }
                    ++n;
                    continue block42;
                }
                case 1502224799: {
                    int cfr_ignored_13 = Integer.rotateRight(0xA0B127E6 ^ n2, 7) - 2043769877;
                    f6 = f5;
                    int cfr_ignored_14 = (int)(0x81C1DBD3C9FFB8D2L ^ (long)n2 ^ 0x4AD75F4C8A82AE52L);
                    n3 = (n2 ^ 0x598A21A4) + 1652780922 - 1652780922;
                    n += 2;
                    continue block42;
                }
                case 1502224798: {
                    int cfr_ignored_15 = Integer.rotateRight(0x112B6B6B ^ n2, 5) + 413114672;
                    f5 *= Float.intBitsToFloat(Integer.reverse(-229400231) ^ 0xA49C53D5);
                    int cfr_ignored_16 = (int)(0x515EEA85D271A8EFL ^ (long)n2 ^ 0x287B6850AAF90F6CL);
                    n3 = (int)((long)(n2 ^ 0x598A219F) ^ 0x2377EF0B86DB69D0L ^ 0x2377EF0B86DB69D0L);
                    n += 3;
                    continue block42;
                }
                case 1502224806: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xD66F80D0 ^ n2, 13) + -69322645) * -697335599;
                    n3 = (int)((long)(n2 ^ 0xAA8EBF41) ^ 0xED0B6ACDD53FA49EL ^ 0xED0B6ACDD53FA49EL);
                    int cfr_ignored_18 = (Integer.rotateRight(0xAD36F553 ^ n2, 8) + -33205176) * -1388907181;
                    try {
                        n -= 5;
                        n3 = n2 ^ 0x598A21A3 ^ 0xBCC03FB9 ^ 0xBCC03FB9;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x598A21A3) + 941863579 - 941863579;
                    }
                    n += 3;
                    continue block42;
                }
                case 1502224807: {
                    int cfr_ignored_19 = Integer.rotateLeft(0xF2556AD ^ n2, 4) - -639427026;
                    int cfr_ignored_20 = (int)(0xCD97F89027D4EB4FL ^ (long)n2 ^ 0xC50831A2DB836FEL);
                    n3 = (int)((long)(n2 ^ 0xC5ACEEEB) ^ 0xE78C07046531F57FL ^ 0xE78C07046531F57FL);
                    int cfr_ignored_21 = Integer.rotateRight(0x932F86E2 ^ n2, 5) + -685837159;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x598A21A3));
                    n += 2;
                    continue block42;
                }
                case 1502224808: {
                    int cfr_ignored_22 = Integer.rotateLeft(0x9BCAB648 ^ n2, 6) + -504778253;
                    int cfr_ignored_23 = (int)(0xD108C41947E1319CL ^ (long)n2 ^ 0x75424371981E0FC0L);
                    n3 = (int)((long)(n2 ^ 0xB70A96D) ^ 0x6AAE2F6E1B4369BL ^ 0x6AAE2F6E1B4369BL);
                    int cfr_ignored_24 = (int)(0x93FC70423D0B47F8L ^ (long)n2 ^ 0x1DF4B6A574D68A29L);
                    n3 = n2 ^ 0x598A21A3;
                    continue block42;
                }
                case 1502224809: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0x77AC0BF8 ^ n2, 17) + -2110582205) * 2007763961;
                    try {
                        --n;
                        if ((0xC630379605757CFBL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 ^ 0x598A21A3) ^ 0xE0FBE08245F95609L ^ 0xE0FBE08245F95609L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 ^ 0x598A21A3;
                    }
                    continue block42;
                }
                case 1502224810: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xB7F42E11 ^ n2, 9) + 1257190218) * -1208734191;
                    int cfr_ignored_27 = (int)(0x7546802C27D4EB4FL ^ (long)n2 ^ 0xFD28831A2DB9475CL);
                    try {
                        n += 2;
                        if ((0xC657EC57BE444BC5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 ^ 0x598A21A3 ^ 0x7BB670D8 ^ 0x7BB670D8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0x598A21A3;
                    }
                    n += 3;
                    continue block42;
                }
                case 1502224811: {
                    int cfr_ignored_28 = Integer.rotateLeft(0xA761D9E0 ^ n2, 7) + 1228341595;
                    n3 = n2 ^ 0x7B3C26D4;
                    int cfr_ignored_29 = (Integer.rotateLeft(0x62514AD8 ^ n2, 15) + -332026013) * 1649494745;
                    try {
                        n += 4;
                        n3 = n2 ^ 0x598A21A3 ^ 0x58F14141 ^ 0x58F14141;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(n2 ^ 0x598A21A3) ^ 0xF914E98DA82F1453L ^ 0xF914E98DA82F1453L);
                    }
                    n += 2;
                    continue block42;
                }
                case 1502224812: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0x64653BB9 ^ n2, 15) + 748673698) * 1684356025;
                    int cfr_ignored_31 = (int)(0xA6D7958427D4EB4FL ^ (long)n2 ^ 0xD678831A2DB8E07EL);
                    int cfr_ignored_32 = (int)(0xC4F79F61EE8B663AL ^ (long)n2 ^ 0xC3B311A53752243EL);
                    n3 = n2 ^ 0xE6B9731D ^ 0xDD0E328B ^ 0xDD0E328B;
                    int cfr_ignored_33 = (int)(0x66D6B4339C14B8C2L ^ (long)n2 ^ 0x9517F49A8AA3607CL);
                    n3 = (int)((long)(n2 ^ 0x598A21A3) ^ 0x67818FDF936310EL ^ 0x67818FDF936310EL);
                    n -= 3;
                    continue block42;
                }
                case 1502224813: {
                    int cfr_ignored_34 = (Integer.rotateLeft(0xF2BACB1D ^ n2, 17) - 1761359806) * -222639331;
                    int cfr_ignored_35 = (int)(0x3008652027D4EB4FL ^ (long)n2 ^ 0x3730831A2DB9CDC1L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8369BF99));
                    int cfr_ignored_36 = (Integer.rotateRight(0x9CAAE75B ^ n2, 6) + -49306816) * -1666521253;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x598A21A3));
                    --n;
                    continue block42;
                }
                case 1502224814: {
                    int cfr_ignored_37 = (Integer.rotateLeft(0x1EE8CF98 ^ n2, 6) + -1030831453) * 518573977;
                    n3 = n2 ^ 0xA8FE3D8C;
                    int cfr_ignored_38 = Integer.rotateRight(0xABDCD0AA ^ n2, 8) + -736435247;
                    n3 = (n2 ^ 0x598A21A3) + 356752644 - 356752644;
                    ++n;
                    continue block42;
                }
                case 1502224815: {
                    int cfr_ignored_39 = Integer.rotateLeft(0x39973F41 ^ n2, 10) + -38909926;
                    int cfr_ignored_40 = (int)(0xFB25917C27D4EB4FL ^ (long)n2 ^ 0xDF88831A2DB85B9AL);
                    try {
                        if ((0x1E03E29A5D2FD85L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 ^ 0x598A21A3;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 ^ 0x598A21A3;
                    }
                    n -= 3;
                    continue block42;
                }
                case 1502224816: {
                    int cfr_ignored_41 = (Integer.rotateRight(0x35A3D1F7 ^ n2, 9) - -2093741020) * 899928567;
                    n3 = n2 ^ 0xC1F79C57;
                    int cfr_ignored_42 = (Integer.rotateLeft(0x333B8650 ^ n2, 9) + 949150443) * 859539025;
                    n3 = (n2 ^ 0x598A21A3) + -1483831708 - -1483831708;
                    continue block42;
                }
                case 1502224817: {
                    int cfr_ignored_43 = Integer.rotateLeft(0x88D61581 ^ n2, 4) + -1773520422;
                    int cfr_ignored_44 = (int)(0x4A64BBBC27D4EB4FL ^ (long)n2 ^ 0x8A08831A2DB93918L);
                    try {
                        n += 3;
                        if ((0xF26398A141AA14E5L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0x598A21A3;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x598A21A3) + 2019487284 - 2019487284;
                    }
                    continue block42;
                }
                case 1502224804: {
                    return f6;
                }
            }
            int cfr_ignored_45 = Integer.rotateRight(0x2B971A2F ^ n2, 8) - 1269418732;
            n3 = n2 ^ 0x598A21A3;
        }
    }

    private static float shthn(float f, float f2) {
        try {
            int n = -2133861609;
            n = Integer.rotateLeft(n * 896745511, 26) ^ 0x4C67ECC6;
            n = Integer.rotateRight(Float.floatToIntBits(f2) ^ n, 19);
            int n2 = n ^ 0x4F239E48;
            if ((n2 ^ n) != 1327734344) {
                int cfr_ignored_0 = (0xCFEC455F ^ n) + -721797;
            }
            if ((0x396 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (Math.abs(f2) < Float.intBitsToFloat(0xA7015B2B ^ 0x9A4D97E6)) {
            return class_3532.method_15363((float)f, (float)Float.intBitsToFloat(1611285322 - -1588129769), (float)Float.intBitsToFloat(ghth_2.la(0xC154E4A ^ 0xBF267D74, 24)));
        }
        float f3 = f2 - f;
        if (Math.abs(f3) > Math.abs(f2) + 1.0f) {
            return ghth_2.ztgh_3(f, -Math.abs(f2), Math.abs(f2));
        }
        return f;
    }

    @Override
    public float shgh_3() {
        block0: {
            int n = zgh_2.snt(-561743709);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
            int n2 = n ^ 0xA520AF53;
            if ((n2 ^ n) == -1524584621) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x7BA4D7F0 ^ n, 18) + -44841653) * 2074400753;
        }
        return class_3532.method_15363((float)(this.bbs.dhds() * Float.intBitsToFloat(507237700 + 550565769)), (float)Float.intBitsToFloat(Integer.reverse(663600963) ^ 0x823DB1E4), (float)Float.intBitsToFloat(0x2BD0CB6A ^ 0x6A40CB6A));
    }

    @Override
    public float hghs() {
        block0: {
            int n = zgh_2.snt(569645581);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0xFE3B7755;
            if ((n2 ^ n) == -29657259) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDFCF6D58 ^ n, 14) + 511433955) * -540054183;
        }
        return ghth_2.jzm(ghth_2.khra(this.bbs) * Float.intBitsToFloat(-1634612575 - 1602551252), Float.intBitsToFloat(ghth_2.sak_2(-1701007102) ^ 0xD3959), Float.intBitsToFloat(0xC538818 ^ 0x4D138818));
    }

    @Override
    public void tf() {
        int n = 272373385;
        n = Integer.rotateLeft(n * -1794771837, 21) ^ 0xFF67B7A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x807E4FC3;
        if ((n2 ^ n) != -2139205693) {
            int cfr_ignored_0 = (0x9042594A ^ n) + 398049561;
        }
        this.twd = 0.0f;
        this.thhy_2 = 0.0f;
        this.zjt_2 = 0.0f;
        this.dhst_2 = 0.0f;
        this.thnk = 0.0f;
        this.dys = 0.0f;
        this.jnr = false;
    }

    @Override
    public void mgh(class_1309 class_13092) {
        int n = zgh_2.snt(-1247760597);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
        class_1309 class_13093 = class_13092;
        n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 4);
        int n2 = n ^ 0xB114F274;
        if ((n2 ^ n) != -1324027276) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4B45D5F ^ n, 3) - -1774916164) * 78929247;
        }
        ghth_2.ghsd_4(this);
    }

    private static float dhkhs(float f) {
        block0: {
            int n = zgh_2.snt(1373413299);
            int n2 = n ^ 0xF88C75BD;
            if ((n2 ^ n) == -125012547) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xA950EA0E ^ n, 8) - -2060847379;
        }
        return Math.abs(f);
    }

    private static int la(int n, int n2) {
        block0: {
            int n3 = zgh_2.snt(-1537816999);
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 6)) ^ 0x750DC578;
            if ((n4 ^ n3) == 1963836792) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD15B0321 ^ n3, 13) + 1583546426;
            int cfr_ignored_1 = (int)(0x13E9AD1C27D4EB4FL ^ (long)n3 ^ 0xA748831A2DB98A02L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float ztgh_3(float f, float f2, float f3) {
        block0: {
            int n = -1854267905;
            n = Integer.rotateLeft(n * 1126863495, 15) ^ 0x326AB32B;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x9C9427A7;
            if ((n2 ^ n) == -1668012121) break block0;
            int cfr_ignored_0 = (0xDEE3A58 ^ n) + -1217715764;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float khra(ba_2 ba2) {
        block0: {
            int n = -1366230988;
            n = Integer.rotateLeft(n * 621266127, 19) ^ 0xE1023753;
            ba_2 ba3 = ba2;
            n = Integer.rotateRight((ba3 != null ? System.identityHashCode(ba3) : 0) ^ n, 12);
            int n2 = n ^ 0xE8752B92;
            if ((n2 ^ n) == -394974318) break block0;
            int cfr_ignored_0 = (0x46E5D3A6 ^ n) + 324396284;
        }
        return ba2.khkdh();
    }

    private static int sak_2(int n) {
        block0: {
            int n2 = -2146576401;
            n2 = Integer.rotateLeft(n2 * 663344539, 25) ^ 0xCF69B670;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 8)) ^ 0x8C4C731D;
            if ((n3 ^ n2) == -1941146851) break block0;
            int cfr_ignored_0 = (0xC41A4F2 ^ n2) + -795240343;
        }
        return Integer.reverse(n);
    }

    private static float jzm(float f, float f2, float f3) {
        block0: {
            int n = -1987304862;
            n = Integer.rotateLeft(n * 959981913, 13) ^ 0x9490B493;
            n = Float.floatToIntBits(f2) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f3) ^ n, 29);
            int n2 = n ^ 0x51D725EA;
            if ((n2 ^ n) == 1373054442) break block0;
            int cfr_ignored_0 = (0xD85B0788 ^ n) - 522066016;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static void ghsd_4(ghth_2 ghth2) {
        int n = 467589126;
        n = Integer.rotateLeft(n * -1387192369, 20) ^ 0x14DC96B;
        ghth_2 ghth3 = ghth2;
        n = (ghth3 != null ? System.identityHashCode(ghth3) : 0) ^ n;
        int n2 = n ^ 0x5C00334C;
        if ((n2 ^ n) != 1543517004) {
            int cfr_ignored_0 = (0x47DEEB4A ^ n) + -1516681554;
        }
        ghth2.tf();
    }

    private static String[] thsk(String string) {
        block0: {
            int n = 1428483947;
            int n2 = (n = Integer.rotateLeft(n * 1728338913, 10) ^ 0x4693416B) ^ 0x5C07A5D0;
            if ((n2 ^ n) == 1544005072) break block0;
            int cfr_ignored_0 = (0x9234ABB ^ n) + -1010904307;
        }
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite rdr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1763736190;
            n3 = Integer.rotateLeft(n3 * -1317019677, 19) ^ 0x1A074EE3;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 13);
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 24);
            int n4 = n3 ^ 0x2A89E388;
            if ((n4 ^ n3) != 713679752) {
                int cfr_ignored_0 = (0xBC56660A ^ n3) + 830850106;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dgh ^ string.hashCode()) + (n2 + kth) + i ^ dgh, 4) + kth);
            }
            String[] stringArray = ghth_2.thsk(new String(cArray));
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

    private static String[] smvcdvrf8vsui(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ivcugpwz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ a8uf9kucsl ^ string.hashCode() ^ n2 + nz8qwk1 ^ i * 1497818959 ^ a8uf9kucsl, 24) ^ nz8qwk1));
            }
            String[] stringArray = ghth_2.smvcdvrf8vsui(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

