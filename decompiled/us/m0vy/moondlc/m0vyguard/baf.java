/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.rd_2;

public class baf
implements dl {
    private static final int dhf_2 = 1910615814;
    private static final int thdw = -1842176523;
    private static final int lgwsqosq3jay = 1936133875;
    private static final int aoougumv962u = -1464251223;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jkao049nxkdcc;

    public static float tssh_3() {
        int n = rd_2.athw(1750568564);
        int n2 = n ^ 0x17974B14;
        if ((n2 ^ n) != 395791124) {
            int cfr_ignored_0 = Integer.rotateLeft(0x7FC0C560 ^ n, 18) + 2092271067;
        }
        float f = baf.dhha_3((Double)baf.mc.field_1690.method_42495().method_41753()) * Float.intBitsToFloat(-581790296 - -1640432626) + baf.aht_2(Integer.rotateLeft(0x868824B5 ^ 0x6244E866, 28));
        float f2 = f * f * f * Float.intBitsToFloat(0x987F14F0 ^ 0xD97F14F0);
        return f2 * Float.intBitsToFloat(0xA5BB0C82 ^ 0x9BA29518);
    }

    public static boolean zath(float f, float f2, float f3, float f4, float f5, float f6) {
        int n = -897571694;
        n = Integer.rotateLeft(n * -37701711, 9) ^ 0x6CBBF58F;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 13);
        n = Integer.rotateRight(Float.floatToIntBits(f4) ^ n, 26);
        int n2 = n ^ 0xCEAE37B5;
        if ((n2 ^ n) != -827443275) {
            int cfr_ignored_0 = (0x42E1327 ^ n) + 931527213;
        }
        return f >= f3 && f2 >= f4 && f <= f3 + f5 && f2 <= f4 + f6;
    }

    public static boolean rtn(double d, double d2, double d3, double d4, double d5, double d6) {
        int n = 313026728;
        n = Integer.rotateLeft(n * -336382095, 27) ^ 0x7A11FD3B;
        n = Integer.rotateRight((int)Double.doubleToLongBits(d6) ^ n, 14);
        int n2 = n ^ 0xC42F901;
        if ((n2 ^ n) != 205715713) {
            int cfr_ignored_0 = (0x1EEA91A9 ^ n) + -552729157;
        }
        return d >= d3 && d2 >= d4 && d <= d3 + d5 && d2 <= d4 + d6;
    }

    public static boolean mk(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        int n = 574874380;
        n = Integer.rotateLeft(n * 1724687171, 25) ^ 0xCDFF16D1;
        n = Float.floatToIntBits(f) ^ n;
        n = Float.floatToIntBits(f2) ^ n;
        int n2 = n ^ 0x2BE80049;
        if ((n2 ^ n) != 736624713) {
            int cfr_ignored_0 = (0x9ABE345 ^ n) - 1915285470;
        }
        if (f < f3 || f2 < f4 || f > f3 + f5 || f2 > f4 + f6) {
            return false;
        }
        if (f7 <= 0.0f) {
            return true;
        }
        float f10 = Math.max(f3 + f7, Math.min(f, f3 + f5 - f7));
        float f11 = f - f10;
        float f12 = f11 * f11 + (f9 = f2 - (f8 = Math.max(f4 + f7, Math.min(f2, f4 + f6 - f7)))) * f9;
        return f12 <= f7 * f7;
    }

    public static boolean ztq_3(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8;
        double d9;
        int n = -654667952;
        n = Integer.rotateLeft(n * -289082569, 5) ^ 0x6330D2D4;
        n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 16);
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 8);
        int n2 = n ^ 0x109D9EA3;
        if ((n2 ^ n) != 278765219) {
            int cfr_ignored_0 = (0xC86711F3 ^ n) - -1685306021;
        }
        if (d < d3 || d2 < d4 || d > d3 + d5 || d2 > d4 + d6) {
            return false;
        }
        if (d7 <= 0.0) {
            return true;
        }
        double d10 = baf.jay_2(d3 + d7, Math.min(d, d3 + d5 - d7));
        double d11 = d - d10;
        double d12 = d11 * d11 + (d9 = d2 - (d8 = Math.max(d4 + d7, Math.min(d2, d4 + d6 - d7)))) * d9;
        return d12 <= d7 * d7;
    }

    private static float dhha_3(Double d) {
        block0: {
            int n = -1958246263;
            int n2 = (n = Integer.rotateLeft(n * -187966081, 16) ^ 0x3105927C) ^ 0x296C4A39;
            if ((n2 ^ n) == 694962745) break block0;
            int cfr_ignored_0 = (0xA22BC2B0 ^ n) + -1599068175;
        }
        return d.floatValue();
    }

    private static float aht_2(int n) {
        block0: {
            int n2 = -1301621131;
            int n3 = (n2 = Integer.rotateLeft(n2 * 325874017, 6) ^ 0xB207498D) ^ 0x8FA912A9;
            if ((n3 ^ n2) == -1884745047) break block0;
            int cfr_ignored_0 = (0x3DC3C4DC ^ n2) + -232055510;
        }
        return Float.intBitsToFloat(n);
    }

    private static double jay_2(double d, double d2) {
        block0: {
            int n = 1387493979;
            n = Integer.rotateLeft(n * -1171013953, 7) ^ 0x49B0C78C;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 29);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x691F204;
            if ((n2 ^ n) == 110227972) break block0;
            int cfr_ignored_0 = (0x5422885F ^ n) + -336458315;
        }
        return Math.max(d, d2);
    }

    private static String[] sath_3(String string) {
        block0: {
            int n = 1520781252;
            int n2 = (n = Integer.rotateLeft(n * -1428447383, 26) ^ 0xF259C5D5) ^ 0x691DA698;
            if ((n2 ^ n) == 1763550872) break block0;
            int cfr_ignored_0 = (0x33B8E15C ^ n) + 153188604;
        }
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite sta_5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1518678364;
            n3 = Integer.rotateLeft(n3 * 721299169, 15) ^ 0x79D745ED;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 5);
            int n4 = n3 ^ 0xD0797982;
            if ((n4 ^ n3) != -797345406) {
                int cfr_ignored_0 = (0x7503B726 ^ n3) - -385013023;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhf_2 ^ string.hashCode()) + (n2 + thdw) + i ^ dhf_2, 23) + thdw);
            }
            String[] stringArray = baf.sath_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xlt9jh9hki(String string) {
        return string.split("\u0005\u0011", -1);
    }

    private static CallSite vihzpojp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ lgwsqosq3jay ^ string.hashCode()) + (n2 + aoougumv962u) + i ^ lgwsqosq3jay, 8) + aoougumv962u);
            }
            String[] stringArray = baf.xlt9jh9hki(new String(cArray));
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

