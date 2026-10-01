/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.SecureRandom;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.lh_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bydh
implements bmd_2 {
    private final SecureRandom hddh = new SecureRandom();
    private float khbt;
    private float shqd_2;
    private float sha_8 = 0.0f;
    private float daz_4 = 0.0f;
    private static final int dhd_2 = 422389519;
    private static final int bas_2 = 16556353;
    private static final int hh3rml6jk = -1389542153;
    private static final int r46t10w = -880946985;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ff04f4kz5e5f8;

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        float f;
        if (lb2 == null || lb3 == null) {
            return lb2 != null ? lb2 : lb3;
        }
        this.khbt += 0.065f;
        this.shqd_2 += 0.045f;
        float f2 = (float)(Math.sin(this.khbt) * (double)0.8f + Math.cos((double)this.khbt * 0.5) * (double)0.4f);
        float f3 = (float)(Math.cos(this.shqd_2) * 0.5);
        float f4 = bghdh.bds_3(lb2.sry(), lb3.sry() + f2);
        float f5 = class_3532.method_15363((float)(lb3.khdhd_2() + f3), (float)-90.0f, (float)90.0f);
        float f6 = f4 - lb2.sry();
        float f7 = f5 - lb2.khdhd_2();
        float f8 = (float)Math.hypot(f6, f7);
        float f9 = bl2 ? this.zhw_4(40.0f, 60.0f) : this.zhw_4(55.0f, 85.0f);
        float f10 = bl2 ? this.zhw_4(25.0f, 40.0f) : this.zhw_4(35.0f, 55.0f);
        this.sha_8 = class_3532.method_16439((float)0.3f, (float)this.sha_8, (float)f9);
        this.daz_4 = class_3532.method_16439((float)0.3f, (float)this.daz_4, (float)f10);
        float f11 = class_3532.method_15363((float)f6, (float)(-this.sha_8), (float)this.sha_8);
        float f12 = class_3532.method_15363((float)f7, (float)(-this.daz_4), (float)this.daz_4);
        if (f8 < 6.0f) {
            f = Math.max(0.4f, f8 / 6.0f);
            f11 *= f;
            f12 *= f;
        }
        f = lb2.sry() + f11;
        float f13 = class_3532.method_15363((float)(lb2.khdhd_2() + f12), (float)-90.0f, (float)90.0f);
        return new lb(f, f13);
    }

    private float zhw_4(float f, float f2) {
        try {
            int n = -1648155774;
            n = Integer.rotateLeft(n * -191820143, 7) ^ 0x36CD2CCB;
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xAEF2F436;
            if ((n2 ^ n) != -1359809482) {
                int cfr_ignored_0 = (0x3331D7B4 ^ n) + 1592078437;
            }
            if ((0x369 & 0) != 0) {
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
        return f + this.hddh.nextFloat() * (f2 - f);
    }

    @Override
    public void tf() {
        int n = 0;
        int n2 = 1046689318;
        n2 = Integer.rotateLeft(n2 * -1573206971, 23) ^ 0x29BC8891;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = -683083512 + n2;
        while (true) {
            block18: {
                block15: {
                    block25: {
                        block28: {
                            block24: {
                                block19: {
                                    block29: {
                                        block23: {
                                            block16: {
                                                block30: {
                                                    block20: {
                                                        block21: {
                                                            block17: {
                                                                block27: {
                                                                    block26: {
                                                                        block22: {
                                                                            block13: {
                                                                                block14: {
                                                                                    if ((n = n3 - n2) > 428403970) break block13;
                                                                                    if (n > -683083512) break block14;
                                                                                    if (n == -1364989828) break block15;
                                                                                    if (n == -947256422) break block16;
                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0xE62DA2E9 ^ n2, 15) + -471574158;
                                                                                    int cfr_ignored_1 = (int)(0x249F0CD427D4EB4FL ^ (long)n2 ^ 0xE4D8831A2DB9E4EFL);
                                                                                    if (n == -683083512) break block17;
                                                                                    break block18;
                                                                                }
                                                                                if (n == -615642055) break block19;
                                                                                if (n == -300940775) break block20;
                                                                                int cfr_ignored_2 = (Integer.rotateRight(0x3F19F092 ^ n2, 10) + -1467891479) * 1058664595;
                                                                                if (n == 428403970) break block21;
                                                                                break block18;
                                                                            }
                                                                            if (n > 869902298) break block22;
                                                                            if (n == 679718727) break block23;
                                                                            if (n == 850877546) break block24;
                                                                            int cfr_ignored_3 = Integer.rotateRight(0x86670222 ^ n2, 3) + 1255596377;
                                                                            if (n == 869902298) break block25;
                                                                            break block18;
                                                                        }
                                                                        if (n > 1126376528) break block26;
                                                                        if (n == 1085580661) break block27;
                                                                        if (n == 1126376528) break block28;
                                                                        int cfr_ignored_4 = (Integer.rotateRight(0xECA6EED3 ^ n2, 16) + -1399551288) * -324604205;
                                                                        break block18;
                                                                    }
                                                                    if (n == 1458649427) break block29;
                                                                    if (n == 1824006749) break block30;
                                                                    break block18;
                                                                }
                                                                int cfr_ignored_5 = Integer.rotateLeft(0x8A9DE664 ^ n2, 4) - -847477417;
                                                                bydh.bzf();
                                                                try {
                                                                    if ((0xEF4B303C2E3D0417L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = 428403970 + n2;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = (int)((long)(428403970 + n2) ^ 0x28559E8705FAE95AL ^ 0x28559E8705FAE95AL);
                                                                }
                                                                n -= 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_6 = Integer.rotateRight(0x70461167 ^ n2, 17) - -1663452492;
                                                            if (!yf.khdha_2()) {
                                                                n3 = (int)((long)(-31811518 + n2) ^ 0x1335CAAFE30A20EAL ^ 0x1335CAAFE30A20EAL);
                                                                int cfr_ignored_7 = (Integer.rotateLeft(0x99C859C ^ n2, 4) - 777112863) * 161252765;
                                                                n3 = 1085580661 + n2 ^ 0xDC0B0BE5 ^ 0xDC0B0BE5;
                                                                continue;
                                                            }
                                                            n3 = 428403970 + n2;
                                                            int cfr_ignored_8 = (Integer.rotateLeft(0x5AC95131 ^ n2, 14) + 46036010) * 1523142961;
                                                            int cfr_ignored_9 = (int)(0x987BFF0C27D4EB4FL ^ (long)n2 ^ 0x368831A2DB89D26L);
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_10 = (Integer.rotateRight(0xBD99C2FF ^ n2, 10) - -100910052) * -1113996545;
                                                        this.khbt = 0.0f;
                                                        this.shqd_2 = 0.0f;
                                                        this.sha_8 = 0.0f;
                                                        this.daz_4 = 0.0f;
                                                        return;
                                                    }
                                                    int cfr_ignored_11 = (Integer.rotateLeft(0x5502D65D ^ n2, 13) - 1337300094) * 1426249309;
                                                    int cfr_ignored_12 = (int)(0x97B0786027D4EB4FL ^ (long)n2 ^ 0xDB0831A2DB882B1L);
                                                    n3 = 80399881 + n2 + 1913738090 - 1913738090;
                                                    int cfr_ignored_13 = Integer.rotateRight(0xD43EFC86 ^ n2, 13) - -1208077451;
                                                    n3 = -176745961 + n2 + 475818986 - 475818986;
                                                    int cfr_ignored_14 = (Integer.rotateRight(0x36FC8852 ^ n2, 9) + -1393417943) * 922519635;
                                                    n3 = -683083512 + n2 + -946023385 - -946023385;
                                                    n += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_15 = (Integer.rotateLeft(0xB3CC12B9 ^ n2, 9) + -904666206) * -1278471495;
                                                int cfr_ignored_16 = (int)(0x717EBC8427D4EB4FL ^ (long)n2 ^ 0x8478831A2DB94F2CL);
                                                n3 = -2030860231 + n2;
                                                int cfr_ignored_17 = Integer.rotateRight(0x8F88576B ^ n2, 4) + 1709192496;
                                                n3 = (int)((long)(-20119179 + n2) ^ 0x10CE1658ADA837B9L ^ 0x10CE1658ADA837B9L);
                                                int cfr_ignored_18 = Integer.rotateRight(0x8CB55947 ^ n2, 4) - 240348884;
                                                n3 = -683083512 + n2;
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_19 = Integer.rotateLeft(0x1A5AD44 ^ n2, 3) - 929929847;
                                            n3 = -683083512 + n2;
                                            int cfr_ignored_20 = (Integer.rotateLeft(0xD68F2270 ^ n2, 13) + -5059893) * -695262607;
                                            n -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_21 = Integer.rotateRight(0x90F10E6F ^ n2, 5) - -1852940628;
                                        n3 = 2131404033 + n2 ^ 0xFA363400 ^ 0xFA363400;
                                        int cfr_ignored_22 = Integer.rotateRight(0xE8DA3407 ^ n2, 16) - 919202836;
                                        n3 = -683083512 + n2;
                                        int cfr_ignored_23 = Integer.rotateLeft(0x5F5419E4 ^ n2, 14) - -1886600745;
                                        n -= 2;
                                        continue;
                                    }
                                    int cfr_ignored_24 = (Integer.rotateRight(0x8A25C053 ^ n2, 4) + -1091573432) * -1977237421;
                                    n3 = 2087574549 + n2 + -422975583 - -422975583;
                                    int cfr_ignored_25 = (Integer.rotateRight(0xE8110532 ^ n2, 16) + 510476361) * -401537741;
                                    try {
                                        ++n;
                                        if ((0x4B1130295CBC3C11L ^ (long)n2 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        n3 = -683083512 + n2 + -956310590 - -956310590;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n3 = -683083512 + n2 ^ 0x1BD2B344 ^ 0x1BD2B344;
                                    }
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_26 = Integer.rotateRight(0x26A68DA6 ^ n2, 7) - -1299659179;
                                n3 = -1204109978 + n2 + 1233679738 - 1233679738;
                                int cfr_ignored_27 = (Integer.rotateRight(0x9258D11F ^ n2, 5) - -1122045444) * -1839673057;
                                n3 = Integer.reverse(Integer.reverse(-683083512 + n2));
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_28 = Integer.rotateLeft(0x6531A601 ^ n2, 15) + 1163966810;
                            int cfr_ignored_29 = (int)(0xA783083C27D4EB4FL ^ (long)n2 ^ 0xED08831A2DB8E2D7L);
                            int cfr_ignored_30 = (int)(0xAD67E559F9A64BBL ^ (long)n2 ^ 0x1DBF3873251B87DL);
                            n3 = -683083512 + n2 ^ 0xBEC320B3 ^ 0xBEC320B3;
                            continue;
                        }
                        int cfr_ignored_31 = (Integer.rotateRight(0xA80CCCB6 ^ n2, 8) - 1575643461) * -1475556169;
                        n3 = -683083512 + n2 ^ 0x72683AEB ^ 0x72683AEB;
                        int cfr_ignored_32 = Integer.rotateRight(0x130CADE7 ^ n2, 5) - 1390849588;
                        --n;
                        continue;
                    }
                    int cfr_ignored_33 = (Integer.rotateRight(0x1E3C7BFF ^ n2, 6) - -1380932836) * 507280383;
                    try {
                        n += 4;
                        n3 = -683083512 + n2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = -683083512 + n2;
                    }
                    n -= 2;
                    continue;
                }
                int cfr_ignored_34 = Integer.rotateLeft(0x39B10AC4 ^ n2, 10) - 13495543;
                n3 = 1902964444 + n2 ^ 0x27CBC00B ^ 0x27CBC00B;
                int cfr_ignored_35 = (Integer.rotateRight(0x719B0F2 ^ n2, 3) + -528872311) * 119124211;
                try {
                    n += 4;
                    if ((0x515314CA005219B5L ^ (long)n2 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    n3 = (int)((long)(-683083512 + n2) ^ 0xBA7505B4E72EACC2L ^ 0xBA7505B4E72EACC2L);
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = Integer.reverse(Integer.reverse(-683083512 + n2));
                }
                continue;
            }
            int cfr_ignored_36 = (Integer.rotateLeft(0xCDE169F5 ^ n2, 12) - -223775770) * -840865291;
            int cfr_ignored_37 = (int)(0xF53C7C827D4EB4FL ^ (long)n2 ^ 0x72E0831A2DB9B376L);
            n3 = -683083512 + n2;
        }
    }

    private static void bzf() {
        int n = 2057184795;
        int n2 = (n = Integer.rotateLeft(n * -1224530869, 5) ^ 0xB82E6090) ^ 0x7093A734;
        if ((n2 ^ n) != 1888724788) {
            int cfr_ignored_0 = (0xA0D812F ^ n) + -1386763747;
        }
        yf.athz_2();
    }

    private static String[] awd(String string) {
        block0: {
            int n = lh_2.khsz(-1490149779);
            int n2 = n ^ 0xCAC3BCA;
            if ((n2 ^ n) == 212614090) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xAB8225A7 ^ n, 8) - -920637836;
        }
        return string.split("\u0005\u001d", -1);
    }

    private static CallSite any(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -696743688;
            n3 = Integer.rotateLeft(n3 * -1843971395, 25) ^ 0x5BF4E237;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 11);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x95B84B09;
            if ((n4 ^ n3) != -1783084279) {
                int cfr_ignored_0 = (0x43C0C3F1 ^ n3) + -431350615;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhd_2 ^ string.hashCode()) + (n2 + bas_2) + i ^ dhd_2, 4) + bas_2);
            }
            String[] stringArray = bydh.awd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ki97vwil3(String string) {
        return string.split("\u0004\u001e", -1);
    }

    private static CallSite r0z47cf7c(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hh3rml6jk ^ string.hashCode() ^ n2 + r46t10w + i * 510376861) + hh3rml6jk) ^ r46t10w));
            }
            String[] stringArray = bydh.ki97vwil3(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

