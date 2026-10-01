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
import us.m0vy.moondlc.m0vyguard.bft_2;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public class bhs
implements bmd_2 {
    private final SecureRandom shwt_2 = new SecureRandom();
    private int aj;
    private int dhka;
    private float thzs_3;
    private float hfr;
    private static final int thff = 141595760;
    private static final int jtl = 123540519;
    private static final int ocp0wat = -367005271;
    private static final int bvuvpj7jx7pav = 1495893570;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int kfb0iohr7qfp;

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        float f;
        float f2;
        float f3;
        ++this.aj;
        ++this.dhka;
        float f4 = bghdh.ttb_2(lb2.sry(), lb3.sry());
        float f5 = lb3.khdhd_2() - lb2.khdhd_2();
        if (this.aj % 5 == 0) {
            f3 = bl2 ? this.khshl(-1.0f, 1.0f) : this.khshl(-3.0f, 3.0f);
            float f6 = f2 = bl2 ? this.khshl(-0.5f, 0.5f) : this.khshl(-1.5f, 1.5f);
            if (Math.abs(f4) < 8.0f && Math.abs(f5) < 6.0f) {
                f3 *= 0.2f;
                f2 *= 0.2f;
            }
            f = this.dhka > 20 ? 0.45f : 0.25f;
            this.thzs_3 = class_3532.method_16439((float)f, (float)this.thzs_3, (float)f3);
            this.hfr = class_3532.method_16439((float)f, (float)this.hfr, (float)f2);
        }
        f3 = bl ? this.khshl(80.0f, 130.0f) : this.khshl(50.0f, 80.0f);
        f2 = bl ? this.khshl(50.0f, 80.0f) : this.khshl(30.0f, 50.0f);
        f = class_3532.method_15363((float)(f4 + this.thzs_3), (float)(-f3), (float)f3);
        float f7 = class_3532.method_15363((float)(f5 + this.hfr), (float)(-f2), (float)f2);
        float f8 = lb2.sry() + f;
        float f9 = class_3532.method_15363((float)(lb2.khdhd_2() + f7), (float)-90.0f, (float)90.0f);
        return new lb(f8, f9);
    }

    private float khshl(float f, float f2) {
        float f3 = 0.0f;
        int n = 0;
        int n2 = 83185424;
        n2 = Integer.rotateLeft(n2 * -546761895, 5) ^ 0xC37F0646;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 28);
        n2 = Float.floatToIntBits(f) ^ n2;
        int n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) ^ 0x7CE623429FBD3849L ^ 0x7CE623429FBD3849L);
        block29: while (true) {
            switch (Integer.rotateRight(n3, 20) ^ n2) {
                case 1969661674: {
                    int cfr_ignored_0 = Integer.rotateRight(0x3CE42F46 ^ n2, 10) - 1677678773;
                    if (yf.dnkh()) {
                        n3 = Integer.rotateLeft(n2 ^ 0x225F5414, 20) ^ 0x145E9EA1 ^ 0x145E9EA1;
                        int cfr_ignored_1 = Integer.rotateRight(0xE742EC6F ^ n2, 15) - 91766956;
                        n += 2;
                        continue block29;
                    }
                    n3 = Integer.rotateLeft(n2 ^ 0x305EF99C, 20) ^ 0x516906DF ^ 0x516906DF;
                    int cfr_ignored_2 = Integer.rotateLeft(0x50731D2C ^ n2, 13) - -1035065457;
                    n += 2;
                    continue block29;
                }
                case 576672788: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xFD036097 ^ n2, 18) - -1480175228) * -50110313;
                    throw null;
                }
                case 811530652: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x545007F4 ^ n2, 13) - 974034375) * 1414531061;
                    f3 = f + this.shwt_2.nextFloat() * (f2 - f);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x588EFD28, 20)));
                    int cfr_ignored_5 = Integer.rotateRight(0x3540C30F ^ n2, 9) - 1999977996;
                    n3 = Integer.rotateLeft(n2 ^ 0x912EFA9, 20) ^ 0x880E3B1D ^ 0x880E3B1D;
                    continue block29;
                }
                case 2056233083: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x4B2008DC ^ n2, 12) - 490648031) * 1260390621;
                    try {
                        n -= 3;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7566A6EA, 20)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7566A6EA, 20)));
                    }
                    n -= 2;
                    continue block29;
                }
                case 1332551016: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x7434E0F2 ^ n2, 17) + 382000265) * 1949622515;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7566A6EA, 20)));
                    int cfr_ignored_8 = Integer.rotateRight(0x176DF2C7 ^ n2, 5) - -626129580;
                    continue block29;
                }
                case -1654153290: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x1563FBFD ^ n2, 5) - -1686560034) * 358874109;
                    int cfr_ignored_10 = (int)(0xD7D155C027D4EB4FL ^ (long)n2 ^ 0x56F0831A2DB80273L);
                    try {
                        n += 4;
                        if ((0xEE69425374F32E91L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20);
                    }
                    n -= 3;
                    continue block29;
                }
                case 200750902: {
                    int cfr_ignored_11 = Integer.rotateRight(0x79BF668F ^ n2, 18) - -1031075188;
                    try {
                        n += 5;
                        if ((0x1249E51DDDBF333FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) + 1210889988 - 1210889988;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) + 282426855 - 282426855;
                    }
                    n -= 2;
                    continue block29;
                }
                case 204636202: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xF67A3FD5 ^ n2, 17) - -584361466) * -159760427;
                    int cfr_ignored_13 = (int)(0x34C891E827D4EB4FL ^ (long)n2 ^ 0xDEA0831A2DB9C440L);
                    n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) + -1223061327 - -1223061327;
                    --n;
                    continue block29;
                }
                case -1312314892: {
                    int cfr_ignored_14 = (Integer.rotateRight(0xCCD61CF6 ^ n2, 12) - -766828283) * -858383113;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x20BC5D16, 20)));
                    int cfr_ignored_15 = Integer.rotateRight(0xBA934B83 ^ n2, 10) + -1674329064;
                    try {
                        n -= 4;
                        if ((0x2AB88A311DA2F23BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) ^ 0x854F22EEFDCA89DCL ^ 0x854F22EEFDCA89DCL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) + -1165528264 - -1165528264;
                    }
                    continue block29;
                }
                case -206276127: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0xCACB6D79 ^ n2, 12) + -1828724510) * -892637831;
                    int cfr_ignored_17 = (int)(0x879C34427D4EB4FL ^ (long)n2 ^ 0x7BF8831A2DB9BD22L);
                    try {
                        n += 4;
                        if ((0x78427FF37D9BDA1FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) ^ 0xD0F2DCE9 ^ 0xD0F2DCE9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20);
                    }
                    n -= 4;
                    continue block29;
                }
                case -2101323089: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0x4865BF99 ^ n2, 12) + -928001342) * 1214627737;
                    int cfr_ignored_19 = (int)(0x8AD711A427D4EB4FL ^ (long)n2 ^ 0xDE38831A2DB8B87FL);
                    n3 = Integer.rotateLeft(n2 ^ 0x72BBDB55, 20) + -1362758148 - -1362758148;
                    int cfr_ignored_20 = Integer.rotateLeft(0xF0E5EB89 ^ n2, 17) + 808789202;
                    int cfr_ignored_21 = (int)(0x325745B427D4EB4FL ^ (long)n2 ^ 0x7618831A2DB9C97FL);
                    n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) ^ 0x4949672A ^ 0x4949672A;
                    n += 4;
                    continue block29;
                }
                case 1463551119: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x3913B13F ^ n2, 10) - -306178596) * 957591871;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x92DF83E7, 20) ^ 0x45FBF4E6F62EFF13L ^ 0x45FBF4E6F62EFF13L);
                    int cfr_ignored_23 = Integer.rotateLeft(0x9B51AD0C ^ n2, 6) - -750677073;
                    n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20);
                    n -= 3;
                    continue block29;
                }
                case 262973211: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x30A52A1 ^ n2, 3) + 1654497466;
                    int cfr_ignored_25 = (int)(0xC1B8FC9C27D4EB4FL ^ (long)n2 ^ 0x448831A2DB82EA0L);
                    n3 = Integer.rotateLeft(n2 ^ 0x6048F46E, 20) ^ 0x5E195958 ^ 0x5E195958;
                    int cfr_ignored_26 = Integer.rotateRight(0x296F9687 ^ n2, 8) - 148953492;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) ^ 0x1227D3872CEE2D77L ^ 0x1227D3872CEE2D77L);
                    n -= 2;
                    continue block29;
                }
                case 1883973501: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x1697EF9B ^ n2, 5) + -1060920576) * 379056027;
                    try {
                        --n;
                        if ((0xEC8C3B4BC9BC401DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7566A6EA, 20)));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) ^ 0xF48A7055AE24B755L ^ 0xF48A7055AE24B755L);
                    }
                    continue block29;
                }
                case 152235945: {
                    return f3;
                }
            }
            int cfr_ignored_28 = Integer.rotateLeft(0xAD0E0C89 ^ n2, 8) + -116317230;
            int cfr_ignored_29 = (int)(0x6FBCA2B427D4EB4FL ^ (long)n2 ^ 0xB818831A2DB972A8L);
            n3 = Integer.rotateLeft(n2 ^ 0x7566A6EA, 20) + 1448148997 - 1448148997;
        }
    }

    @Override
    public void tf() {
        int n = bft_2.ahsh_2(706324595);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0xD19FFCB;
        if ((n2 ^ n) != 219807691) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x270057B8 ^ n, 7) + -1117241725) * 654333881;
        }
        this.aj = 0;
        this.dhka = 0;
        this.thzs_3 = 0.0f;
        this.hfr = 0.0f;
    }

    @Override
    public void mgh(class_1309 class_13092) {
        int n = 2039848903;
        n = Integer.rotateLeft(n * 1204167763, 3) ^ 0x5024F49A;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
        class_1309 class_13093 = class_13092;
        n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 16);
        int n2 = n ^ 0x9B6F641E;
        if ((n2 ^ n) != -1687198690) {
            int cfr_ignored_0 = (0xE2FAFBD9 ^ n) - -121945236;
        }
        this.dhka = 0;
    }

    private static String[] thqth(String string) {
        int n = 709693443;
        int n2 = (n = Integer.rotateLeft(n * 698483165, 11) ^ 0xFA451EFC) ^ 0x319C65D7;
        if ((n2 ^ n) != 832333271) {
            int cfr_ignored_0 = (0x1BD175D4 ^ n) + -2036947784;
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

    private static CallSite jaz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1207146946;
            n3 = Integer.rotateLeft(n3 * -1399091327, 13) ^ 0xF10F80C1;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x7D44A43F;
            if ((n4 ^ n3) != 2101650495) {
                int cfr_ignored_0 = (0x3AB73DFD ^ n3) + 1142527951;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thff ^ string.hashCode() ^ n2 + jtl ^ i * -91640455 ^ thff, 15) ^ jtl));
            }
            String[] stringArray = bhs.thqth(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ii80o1klqxc3cn(String string) {
        return string.split("\u0005\u0018", -1);
    }

    private static CallSite vn3xvg8pz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ocp0wat ^ string.hashCode()) + (n2 + bvuvpj7jx7pav) + i ^ ocp0wat, 16) + bvuvpj7jx7pav);
            }
            String[] stringArray = bhs.ii80o1klqxc3cn(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

