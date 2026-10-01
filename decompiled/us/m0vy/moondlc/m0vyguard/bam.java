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
import java.util.SplittableRandom;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bsj_2;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.bhw_2;
import us.m0vy.moondlc.m0vyguard.thy;
import us.m0vy.moondlc.m0vyguard.sa;
import us.m0vy.moondlc.m0vyguard.ky;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bam
implements bmd_2 {
    private static final float dhw_3 = 54.0f;
    private static final float thygh = 42.0f;
    private static final float thghl = 20.0f;
    private static final float tsz_2 = 14.0f;
    private static final float sqn = 42.0f;
    private static final float bbt_2 = 28.0f;
    private static final float thzy = 4.1f;
    private static final float shwkh = 2.85f;
    private static final float jdw = 0.65f;
    private static final float thzth_2 = 0.45f;
    private static final float hghn = 0.68f;
    private static final float zlr = 0.78f;
    private static final float shth_3 = 14.0f;
    private static final float shhh_2 = 0.16f;
    private static final float jrt = 1.0E-5f;
    private static final double sah_6 = 0.0125;
    private final SplittableRandom shkq = new SplittableRandom();
    private final sa ghs_2 = new sa(thy.jtt);
    private boolean khtm_2;
    private float rsf_2;
    private float shsq_2;
    private float zt_2;
    private float jhj_2;
    private float shra;
    private float shfk;
    private float dhzh_3;
    private float jdf_2;
    private int shhr;
    private final ky trgh = new ky();
    private static final int bhgh = -2069969070;
    private static final int dzz = -1142053404;
    private static final int pf1f8u0 = 335661877;
    private static final int hsldfy07ly = 582898105;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int no063um3224h;

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        if (lb2 == null || lb3 == null || class_13092 == null || bam.mc.field_1724 == null) {
            return lb2 != null ? lb2 : lb3;
        }
        boolean bl3 = bl || !bl2;
        this.ghs_2.dkf();
        double d = class_13092.method_23317() - bam.mc.field_1724.method_23317();
        double d2 = class_13092.method_23321() - bam.mc.field_1724.method_23321();
        double d3 = d * d + d2 * d2;
        float f = this.thhf_2(lb2, lb3, d3, bl3);
        f = bghdh.bds_3(lb2.sry(), f);
        float f2 = class_3532.method_15363((float)lb3.khdhd_2(), (float)-90.0f, (float)90.0f);
        float f3 = f - lb2.sry();
        float f4 = f2 - lb2.khdhd_2();
        float f5 = (float)Math.hypot(f3, f4);
        if (bl3) {
            this.jdf_2 = 0.0f;
            this.shhr = 0;
        } else if (f5 > 25.0f && this.shhr <= 0 && this.shkq.nextDouble() < 0.18) {
            this.jdf_2 = (float)(this.shkq.nextDouble() * 2.5 - 1.25);
            this.shhr = this.shkq.nextInt(4, 10);
        } else if (this.shhr > 0) {
            --this.shhr;
            this.jdf_2 *= 0.65f;
        } else {
            this.jdf_2 = 0.0f;
        }
        float f6 = bl3 ? 0.0f : this.zhkh_2(f5, d3, bl, bl2);
        this.ary(f6);
        this.szt_8(class_13092, f + this.jdf_2, f2, f6);
        float f7 = this.ghs_2.dtk_4(f5, bl3);
        float f8 = this.ghs_2.zdn(bhw_2.shtr) * 0.07f;
        float f9 = this.ghs_2.zdn(bhw_2.tnd) * 0.055f;
        float f10 = this.ghs_2.dhsm_2(bhw_2.shtr, bl3);
        float f11 = this.ghs_2.dhsm_2(bhw_2.tnd, bl3);
        float f12 = this.ttz_7(this.shfk - lb2.sry(), 20.0f, 54.0f, 42.0f, f7, f8, f10, bl3, bl2);
        float f13 = this.ttz_7(this.dhzh_3 - lb2.khdhd_2(), 14.0f, 42.0f, 28.0f, f7, f9, f11, bl3, bl2);
        if (!bl3) {
            f13 += this.ghs_2.tdf(f12);
        }
        float f14 = lb2.sry() + f12;
        float f15 = class_3532.method_15363((float)(lb2.khdhd_2() + f13), (float)-90.0f, (float)90.0f);
        return new lb(f14, f15);
    }

    @Override
    public float shgh_3() {
        block0: {
            int n = -2140518580;
            n = Integer.rotateLeft(n * -1703105515, 11) ^ 0xB3128437;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x776AE9E7;
            if ((n2 ^ n) == 2003495399) break block0;
            int cfr_ignored_0 = (0xF700AEAB ^ n) - 1888708745;
        }
        return Float.intBitsToFloat(0xFA362EB9 ^ 0xBB862EB9);
    }

    @Override
    public float hghs() {
        block0: {
            int n = bsj_2.khwk(-1183695021);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0xAC3369B8;
            if ((n2 ^ n) == -1405916744) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x154156EB ^ n, 5) + -1756944976;
        }
        return Float.intBitsToFloat(74517463 + 1022293033);
    }

    public lb sky_2(lb lb2, lb lb3) {
        return this.trgh.zft(lb2, lb3);
    }

    private float thhf_2(lb lb2, lb lb3, double d, boolean bl) {
        if (bl) {
            this.rsf_2 = lb3.sry();
            this.khtm_2 = true;
            return this.rsf_2;
        }
        if (d >= (double)0.16f) {
            this.rsf_2 = lb3.sry();
            this.khtm_2 = true;
            return this.rsf_2;
        }
        return this.khtm_2 ? this.rsf_2 : lb2.sry();
    }

    private float zhkh_2(float f, double d, boolean bl, boolean bl2) {
        if (d < (double)0.16f || !bl && !bl2) {
            return 0.0f;
        }
        float f2 = 1.0f - class_3532.method_15363((float)(f / 14.0f), (float)0.0f, (float)1.0f);
        return f2 * f2 * (bl ? 0.35f : 0.65f);
    }

    private void ary(float f) {
        if (f <= 1.0E-5f) {
            this.shsq_2 *= 0.5f;
            this.zt_2 *= 0.5f;
            this.jhj_2 = 0.0f;
            this.shra = 0.0f;
            return;
        }
        float f2 = this.bdsh_2() * (0.22f + f * 0.22f);
        float f3 = this.bdsh_2() * (0.15f + f * 0.15f);
        this.jhj_2 = class_3532.method_15363((float)(this.jhj_2 * 0.68f + f2), (float)-0.65f, (float)0.65f);
        this.shra = class_3532.method_15363((float)(this.shra * 0.68f + f3), (float)-0.45f, (float)0.45f);
        this.shsq_2 = class_3532.method_15363((float)(this.shsq_2 + this.jhj_2), (float)-4.1f, (float)4.1f);
        this.zt_2 = class_3532.method_15363((float)(this.zt_2 + this.shra), (float)-2.85f, (float)2.85f);
    }

    private void szt_8(class_1309 class_13092, float f, float f2, float f3) {
        try {
            int n = 1062342896;
            n = Integer.rotateLeft(n * 1352058033, 3) ^ 0xCC015EBC;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xFEC2219D;
            if ((n2 ^ n) != -20831843) {
                int cfr_ignored_0 = (0xC190316D ^ n) + 1137326928;
            }
            if ((0x3A3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bam.dtl_2()) {
            yf.athz_2();
        }
        if (f3 <= bam.thh_3(-881642348 + 1806995736)) {
            this.shfk = f;
            this.dhzh_3 = f2;
            return;
        }
        float f4 = f + this.shsq_2 * f3;
        float f5 = class_3532.method_15363((float)(f2 + this.zt_2 * f3), (float)Float.intBitsToFloat(Integer.reverse(-386824738) ^ 0xB9158F17), (float)Float.intBitsToFloat(Integer.reverse(1746653569) ^ 0xC33FD816));
        if (bam.jzn_2(this, class_13092, f4, f5)) {
            this.shfk = f4;
            this.dhzh_3 = f5;
            return;
        }
        this.shsq_2 *= Float.intBitsToFloat(-714861808 - -1771826416);
        this.zt_2 *= Float.intBitsToFloat(0xD1EEFA9A ^ 0xEEEEFA9A);
        f4 = f + this.shsq_2 * f3;
        f5 = class_3532.method_15363((float)(f2 + this.zt_2 * f3), (float)Float.intBitsToFloat(1985131607 + 1281444777), (float)bam.has_5(Integer.rotateLeft(0x3B46B83A ^ 0x3B56153A, 10)));
        if (this.tta_5(class_13092, f4, f5)) {
            this.shfk = f4;
            this.dhzh_3 = f5;
            return;
        }
        this.shsq_2 = 0.0f;
        this.zt_2 = 0.0f;
        this.jhj_2 = 0.0f;
        this.shra = 0.0f;
        this.shfk = f;
        this.dhzh_3 = f2;
    }

    private float ttz_7(float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl, boolean bl2) {
        float f8;
        float f9;
        float f10 = Math.abs(f);
        if (f10 <= 1.0E-5f) {
            return 0.0f;
        }
        float f11 = class_3532.method_15363((float)(f10 / f4), (float)0.0f, (float)1.0f);
        float f12 = f11 * f11 * (3.0f - 2.0f * f11);
        float f13 = Math.min(f10, f2 + (f3 - f2) * f12);
        if (bl || !bl2) {
            f9 = class_3532.method_15363((float)(f7 + f6 * 0.18f), (float)0.92f, (float)1.15f);
        } else {
            f8 = 0.78f + (float)this.shkq.nextDouble() * 0.22000003f;
            f9 = class_3532.method_15363((float)(f8 * f5 * f7 + f6), (float)0.65f, (float)1.08f);
        }
        if (bl || !bl2) {
            float f14 = Math.max(f13 * f9, f10 * 0.93f);
            f8 = Math.min(f10, Math.min(f3, f14));
        } else {
            f8 = Math.min(f10, Math.min(f3, f13 * f9));
        }
        return Math.copySign(f8, f);
    }

    private float bdsh_2() {
        block0: {
            int n = 1155473074;
            n = Integer.rotateLeft(n * 162962799, 4) ^ 0x17712B84;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0x6098CCC0;
            if ((n2 ^ n) == 1620626624) break block0;
            int cfr_ignored_0 = (0x2447D272 ^ n) + -1047885639;
        }
        return (float)(this.shkq.nextDouble() * bam.khkhw(0xE02F409CD9406E17L ^ 0xA02F409CD9406E17L) - 1.0);
    }

    private boolean tta_5(class_1309 class_13092, float f, float f2) {
        class_243 class_2432;
        double d;
        double d2;
        class_238 class_2382 = class_13092.method_5829();
        double d3 = Math.min(0.0125, Math.max(0.0, class_2382.method_17939() * 0.25));
        class_238 class_2383 = new class_238(class_2382.field_1323 + d3, class_2382.field_1322 + (d2 = Math.min(0.0125, Math.max(0.0, class_2382.method_17940() * 0.25))), class_2382.field_1321 + (d = Math.min(0.0125, Math.max(0.0, class_2382.method_17941() * 0.25))), class_2382.field_1320 - d3, class_2382.field_1325 - d2, class_2382.field_1324 - d);
        if (class_2383.method_1006(class_2432 = bam.mc.field_1724.method_33571())) {
            return true;
        }
        float f3 = f2 * ((float)Math.PI / 180);
        float f4 = -f * ((float)Math.PI / 180);
        float f5 = class_3532.method_15362((float)f3);
        class_243 class_2433 = new class_243((double)(class_3532.method_15374((float)f4) * f5), (double)(-class_3532.method_15374((float)f3)), (double)(class_3532.method_15362((float)f4) * f5));
        double d4 = class_2432.method_1022(class_2383.method_1005()) + Math.max(class_2383.method_17939(), Math.max(class_2383.method_17940(), class_2383.method_17941())) + 1.0;
        return class_2383.method_992(class_2432, class_2432.method_1019(class_2433.method_1021(d4))).isPresent();
    }

    @Override
    public void tf() {
        int n = 1622410039;
        n = Integer.rotateLeft(n * -62481951, 20) ^ 0x4A36D932;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0x8E922968;
        if ((n2 ^ n) != -1903023768) {
            int cfr_ignored_0 = (0xEE262A5F ^ n) + -2055520879;
        }
        this.khtm_2 = false;
        this.rsf_2 = 0.0f;
        this.shsq_2 = 0.0f;
        this.zt_2 = 0.0f;
        this.jhj_2 = 0.0f;
        this.shra = 0.0f;
        this.shfk = 0.0f;
        this.dhzh_3 = 0.0f;
        this.jdf_2 = 0.0f;
        this.shhr = 0;
        bam.jdd(this.ghs_2);
        this.trgh.ryq();
    }

    @Override
    public void mgh(class_1309 class_13092) {
        int n = 1419107925;
        n = Integer.rotateLeft(n * -1325653239, 10) ^ 0xCB88521A;
        class_1309 class_13093 = class_13092;
        n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 13);
        int n2 = n ^ 0x2D892A12;
        if ((n2 ^ n) != 763963922) {
            int cfr_ignored_0 = (0x791CF447 ^ n) - 1971744530;
        }
        bam.shghz(this);
    }

    private static boolean dtl_2() {
        block0: {
            int n = bsj_2.khwk(1598298011);
            int n2 = n ^ 0x36AD6472;
            if ((n2 ^ n) == 917333106) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x69E973E9 ^ n, 16) + -677205902;
            int cfr_ignored_1 = (int)(0xAB5BDDD427D4EB4FL ^ (long)n ^ 0x46D8831A2DB8FB66L);
        }
        return yf.khdha_2();
    }

    private static float thh_3(int n) {
        block0: {
            int n2 = -1226142979;
            n2 = Integer.rotateLeft(n2 * -141866747, 26) ^ 0xA725E85D;
            int n3 = (n2 = n ^ n2) ^ 0x13EAA41A;
            if ((n3 ^ n2) == 334144538) break block0;
            int cfr_ignored_0 = (0xA5002EE7 ^ n2) + -1713463946;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean jzn_2(bam bam2, class_1309 class_13092, float f, float f2) {
        block0: {
            int n = 871451350;
            n = Integer.rotateLeft(n * 1651982051, 11) ^ 0x71E783C3;
            bam bam3 = bam2;
            n = (bam3 != null ? System.identityHashCode(bam3) : 0) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 11);
            int n2 = n ^ 0x89B0F68F;
            if ((n2 ^ n) == -1984891249) break block0;
            int cfr_ignored_0 = (0xBA41BC59 ^ n) + -1301024037;
        }
        return bam2.tta_5(class_13092, f, f2);
    }

    private static float has_5(int n) {
        block0: {
            int n2 = -2107382862;
            n2 = Integer.rotateLeft(n2 * 461302609, 15) ^ 0x5F5D8FCB;
            int n3 = (n2 = n ^ n2) ^ 0x697313DD;
            if ((n3 ^ n2) == 1769149405) break block0;
            int cfr_ignored_0 = (0xEB10F06F ^ n2) + -918454784;
        }
        return Float.intBitsToFloat(n);
    }

    private static double khkhw(long l) {
        block0: {
            int n = bsj_2.khwk(1384630980);
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 25)) ^ 0x37EBA516;
            if ((n2 ^ n) == 938190102) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x656C6FD2 ^ n, 15) + 1283402153) * 1701605331;
        }
        return Double.longBitsToDouble(l);
    }

    private static void jdd(sa sa2) {
        int n = bsj_2.khwk(60137076);
        int n2 = n ^ 0xD12A3F82;
        if ((n2 ^ n) != -785760382) {
            int cfr_ignored_0 = (Integer.rotateRight(0xD2BFA1F6 ^ n, 13) - -1986905083) * -759193097;
        }
        sa2.tyw();
    }

    private static void shghz(bam bam2) {
        int n = bsj_2.khwk(1618084963);
        bam bam3 = bam2;
        n = Integer.rotateRight((bam3 != null ? System.identityHashCode(bam3) : 0) ^ n, 2);
        int n2 = n ^ 0xE4B2721;
        if ((n2 ^ n) != 239806241) {
            int cfr_ignored_0 = Integer.rotateRight(0x6E392342 ^ n, 16) + 1565058105;
        }
        bam2.tf();
    }

    private static String[] daa_5(String string) {
        int n = -216132922;
        n = Integer.rotateLeft(n * 764180419, 14) ^ 0x794122FF;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x39F13DEF;
        if ((n2 ^ n) != 972111343) {
            int cfr_ignored_0 = (0xCAEF2F29 ^ n) - -852522848;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite drs_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -571919080;
            n3 = Integer.rotateLeft(n3 * 1061354153, 23) ^ 0x433AF9BD;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 23);
            int n4 = n3 ^ 0x58110189;
            if ((n4 ^ n3) != 1477509513) {
                int cfr_ignored_0 = (0x85F83491 ^ n3) + -552055246;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bhgh ^ string.hashCode()) + (n2 + dzz) + i ^ bhgh, 25) + dzz);
            }
            String[] stringArray = bam.daa_5(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] cqhj5nd8u(String string) {
        return string.split("\b\u0019", -1);
    }

    private static CallSite w9bbf91u7dnu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pf1f8u0 ^ string.hashCode() ^ n2 + hsldfy07ly + i * -2018140133) + pf1f8u0) ^ hsldfy07ly));
            }
            String[] stringArray = bam.cqhj5nd8u(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

