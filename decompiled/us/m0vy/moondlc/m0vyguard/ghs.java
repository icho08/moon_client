/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import us.m0vy.moondlc.m0vyguard.bzs_4;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ghs {
    private static final int thhs_3 = -1195894089;
    private static final int khhy = -436098742;
    private static final int g8v8z0po61meu = -359314953;
    private static final int gtvvni226046 = -1642491751;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int g779wdz3p;

    private ghs() {
    }

    public static double[] dhzl_2(class_1657 class_16572, float f) {
        try {
            int n = -2145132923;
            n = Integer.rotateLeft(n * -1446618055, 27) ^ 0x83E7CF9D;
            int n2 = n ^ 0x42284BE0;
            if ((n2 ^ n) != 1109937120) {
                int cfr_ignored_0 = (0xC20B9565 ^ n) - -684377457;
            }
            if ((0x3E3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (ghs.thss_3()) {
            throw null;
        }
        double d = class_16572.method_23317() - class_16572.field_6014;
        double d2 = class_16572.method_23321() - class_16572.field_5969;
        return new double[]{d * (double)f, d2 * (double)f};
    }

    public static class_243 hhd_3(class_1657 class_16572, double d) {
        double d2;
        try {
            int n = -2037149225;
            n = Integer.rotateLeft(n * -1294502343, 9) ^ 0xA437C60F;
            int n2 = n ^ 0x6E057604;
            if ((n2 ^ n) != 1845851652) {
                int cfr_ignored_0 = (0xE896E7D3 ^ n) - -675056718;
            }
            if ((0xDD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null || class_16572 == null) {
            return class_16572 != null ? class_16572.method_19538() : class_243.field_1353;
        }
        double d3 = class_16572.method_23317() - class_16572.field_6014;
        double d4 = ghs.sfth(class_16572) - class_16572.field_6036;
        double d5 = ghs.ghrd_2(class_16572) - class_16572.field_5969;
        if (Math.hypot(d3, d5) < Double.longBitsToDouble(0x5BFF4D190D8F95B7L ^ 0x64AF2F54DF7E3C4BL) && Math.abs(d4) < Double.longBitsToDouble(0x6B5B2A2CCCF3B922L ^ 0x540B48611E0210DEL)) {
            return ghs.dhmm(class_16572);
        }
        class_243 class_2432 = ghs.hdhm(class_16572);
        class_243 class_2433 = new class_243(d3, d4, d5);
        class_238 class_2383 = ghs.khks_2(class_16572);
        int n = (int)ghs.rds_2(d);
        double d6 = d;
        for (int i = 0; i < n && !((d2 = Math.min(1.0, d6)) <= 0.0); ++i) {
            d6 -= d2;
            class_243 class_2434 = class_2433.method_1021(d2);
            class_238 class_2384 = ghs.tsd_3(class_2383, class_2434);
            if (!ghs.sdhl(class_3102.field_1687, class_2384)) {
                class_238 class_2385;
                class_238 class_2386;
                class_238 class_2387 = ghs.khdm_2(class_2383, class_2434.field_1352, 0.0, 0.0);
                if (!class_3102.field_1687.method_18026(class_2387)) {
                    class_2434 = new class_243(0.0, class_2434.field_1351, class_2434.field_1350);
                }
                if (!ghs.dys(class_3102.field_1687, class_2386 = class_2383.method_989(0.0, 0.0, class_2434.field_1350))) {
                    class_2434 = new class_243(class_2434.field_1352, class_2434.field_1351, 0.0);
                }
                if (!ghs.thygh(class_3102.field_1687, class_2385 = class_2383.method_989(0.0, class_2434.field_1351, 0.0))) {
                    class_2434 = new class_243(class_2434.field_1352, 0.0, class_2434.field_1350);
                }
            }
            class_2432 = class_2432.method_1019(class_2434);
            boolean bl = !class_3102.field_1687.method_18026((class_2383 = class_2383.method_997(class_2434)).method_989(0.0, Double.longBitsToDouble(0xFC8D29045D9035A5L ^ 0x4324B09DC409AC3FL), 0.0));
            class_2433 = !bl ? ghs.aash(class_2433, 0.0, Double.longBitsToDouble(0x6C5E9793558A81BDL ^ 0xD3EAED72122495C6L), 0.0).method_18805(Double.longBitsToDouble(0xB933C3CC1994C3A0L ^ 0x86DC9FE4EC564CFCL), Double.longBitsToDouble(0x7DF0C7FD8BD0E074L ^ 0x421F9BD57E126F28L), Double.longBitsToDouble(0x7FD970DCCE78636FL ^ 0x40362CF43BBAEC33L)) : new class_243(class_2433.field_1352, 0.0, class_2433.field_1350);
        }
        return class_2432;
    }

    private static boolean thss_3() {
        block0: {
            int n = -69652756;
            int n2 = (n = Integer.rotateLeft(n * 407699811, 7) ^ 0xB72B808) ^ 0xA1CABF0C;
            if ((n2 ^ n) == -1580548340) break block0;
            int cfr_ignored_0 = (0x5A1391E0 ^ n) + -2077605581;
        }
        return yf.dnkh();
    }

    private static double sfth(class_1657 class_16572) {
        block0: {
            int n = -1491690853;
            int n2 = (n = Integer.rotateLeft(n * 421354813, 18) ^ 0x8D29E1AD) ^ 0x445F5FB;
            if ((n2 ^ n) == 71693819) break block0;
            int cfr_ignored_0 = (0xA3536F60 ^ n) + -482555559;
        }
        return class_16572.method_23318();
    }

    private static double ghrd_2(class_1657 class_16572) {
        block0: {
            int n = 1375975871;
            n = Integer.rotateLeft(n * -612281671, 25) ^ 0x1FCB88F3;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 25);
            int n2 = n ^ 0x73AA8B1D;
            if ((n2 ^ n) == 1940556573) break block0;
            int cfr_ignored_0 = (0x21A932A2 ^ n) - -5791229;
        }
        return class_16572.method_23321();
    }

    private static class_243 dhmm(class_1657 class_16572) {
        block0: {
            int n = 59323152;
            n = Integer.rotateLeft(n * 96716025, 17) ^ 0x33886668;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x172C4B7F;
            if ((n2 ^ n) == 388778879) break block0;
            int cfr_ignored_0 = (0x14A5786F ^ n) - -2133970276;
        }
        return class_16572.method_19538();
    }

    private static class_243 hdhm(class_1657 class_16572) {
        block0: {
            int n = bzs_4.zqth_2(633178467);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xC7B691AC;
            if ((n2 ^ n) == -944336468) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE20B18CF ^ n, 15) - 1672847436;
        }
        return class_16572.method_19538();
    }

    private static class_238 khks_2(class_1657 class_16572) {
        block0: {
            int n = -96205481;
            int n2 = (n = Integer.rotateLeft(n * 634484917, 24) ^ 0x8171C0FB) ^ 0x2F2ED2E3;
            if ((n2 ^ n) == 791597795) break block0;
            int cfr_ignored_0 = (0xD56AD7B4 ^ n) + -927864331;
        }
        return class_16572.method_5829();
    }

    private static double rds_2(double d) {
        block0: {
            int n = 352319015;
            int n2 = (n = Integer.rotateLeft(n * 872303037, 10) ^ 0x63B518D3) ^ 0x1CDC68F8;
            if ((n2 ^ n) == 484206840) break block0;
            int cfr_ignored_0 = (0x8239EDF ^ n) + 1950334246;
        }
        return Math.ceil(d);
    }

    private static class_238 tsd_3(class_238 class_2383, class_243 class_2432) {
        block0: {
            int n = -986682720;
            int n2 = (n = Integer.rotateLeft(n * 1297155255, 15) ^ 0xD92FB321) ^ 0x51B12FDF;
            if ((n2 ^ n) == 1370566623) break block0;
            int cfr_ignored_0 = (0x9481457F ^ n) + -1885323705;
        }
        return class_2383.method_997(class_2432);
    }

    private static boolean sdhl(class_638 class_6382, class_238 class_2383) {
        block0: {
            int n = 1952785221;
            n = Integer.rotateLeft(n * 1386990705, 22) ^ 0x7DA1857A;
            class_638 class_6383 = class_6382;
            n = (class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n;
            class_238 class_2384 = class_2383;
            n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
            int n2 = n ^ 0x6B891432;
            if ((n2 ^ n) == 1804145714) break block0;
            int cfr_ignored_0 = (0x1FEC3777 ^ n) - -314417782;
        }
        return class_6382.method_18026(class_2383);
    }

    private static class_238 khdm_2(class_238 class_2383, double d, double d2, double d3) {
        block0: {
            int n = bzs_4.zqth_2(-2114737163);
            class_238 class_2384 = class_2383;
            n = Integer.rotateRight((class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n, 2);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xF06F9DB1;
            if ((n2 ^ n) == -261120591) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x719C3644 ^ n, 17) - -968347273;
        }
        return class_2383.method_989(d, d2, d3);
    }

    private static boolean dys(class_638 class_6382, class_238 class_2383) {
        block0: {
            int n = 630741438;
            int n2 = (n = Integer.rotateLeft(n * 1894762677, 27) ^ 0x1091C53F) ^ 0x6B58B1C6;
            if ((n2 ^ n) == 1800974790) break block0;
            int cfr_ignored_0 = (0x4EC0E878 ^ n) + -335510673;
        }
        return class_6382.method_18026(class_2383);
    }

    private static boolean thygh(class_638 class_6382, class_238 class_2383) {
        block0: {
            int n = bzs_4.zqth_2(130394883);
            class_638 class_6383 = class_6382;
            n = Integer.rotateRight((class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n, 6);
            int n2 = n ^ 0xCE9FA573;
            if ((n2 ^ n) == -828398221) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC95A0E70 ^ n, 12) + 1715822283) * -916844943;
        }
        return class_6382.method_18026(class_2383);
    }

    private static class_243 aash(class_243 class_2432, double d, double d2, double d3) {
        block0: {
            int n = -839123711;
            n = Integer.rotateLeft(n * 1627716431, 23) ^ 0xA275A750;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x82C855EB;
            if ((n2 ^ n) == -2100800021) break block0;
            int cfr_ignored_0 = (0x4F33A8EA ^ n) - -1848039028;
        }
        return class_2432.method_1031(d, d2, d3);
    }

    private static String[] k_2(String string) {
        int n = bzs_4.zqth_2(-1752146196);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x8D5B7F32;
        if ((n2 ^ n) != -1923383502) {
            int cfr_ignored_0 = (Integer.rotateRight(0x1ACB21DE ^ n, 6) - 1123465501) * 449520095;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite khr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1446453602;
            n3 = Integer.rotateLeft(n3 * 853247407, 3) ^ 0x3C4DAF74;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 17);
            int n4 = n3 ^ 0xCDD6ADDF;
            if ((n4 ^ n3) != -841568801) {
                int cfr_ignored_0 = (0x641E7341 ^ n3) + -1170390229;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thhs_3 ^ string.hashCode() ^ n2 + khhy ^ i * -1957712033 ^ thhs_3, 21) ^ khhy));
            }
            String[] stringArray = ghs.k_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] jarjzwa16z1(String string) {
        return string.split("\b\u001d", -1);
    }

    private static CallSite v0pfs3as(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ g8v8z0po61meu ^ string.hashCode() ^ n2 + gtvvni226046 ^ i * -223736875 ^ g8v8z0po61meu, 24) ^ gtvvni226046));
            }
            String[] stringArray = ghs.jarjzwa16z1(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

