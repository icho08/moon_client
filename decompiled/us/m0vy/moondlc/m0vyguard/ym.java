/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bqgh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ym
implements tthy {
    private static final int khha_4 = -1274613022;
    private static final int dhaa_2 = 952580466;
    private static final int byqkq54j8yg = 1484354346;
    private static final int uwfvrp3ih = -889668734;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int zpv31tlsnfs;

    private ym() {
    }

    public static class_243 hny(class_1309 class_13092, double d) {
        try {
            int n = 2083309281;
            n = Integer.rotateLeft(n * -2113772839, 15) ^ 0x57750CE9;
            int n2 = n ^ 0x7C8736C1;
            if ((n2 ^ n) != 2089236161) {
                int cfr_ignored_0 = (0xABF020 ^ n) + -1333770532;
            }
            if ((0x3AB & 0) != 0) {
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
        double d2 = class_3532.method_15350((double)d, (double)0.0, (double)Double.longBitsToDouble(0xB3EB523D72463358L ^ 0xF3FB523D72463358L));
        class_243 class_2432 = class_13092.method_19538();
        if (d2 <= Double.longBitsToDouble(0xF1EFF9CBD1BD53C0L ^ 0xCEF5CF293AA110EDL)) {
            return class_2432;
        }
        class_243 class_2433 = new class_243(class_13092.method_23317() - class_13092.field_6014, ym.jwz(class_13092) - class_13092.field_6036, class_13092.method_23321() - class_13092.field_5969);
        class_243 class_2434 = class_13092.method_18798();
        class_243 class_2435 = ym.bkth(ym.shtz_3(class_2433, Double.longBitsToDouble(0xC152588B00419FAFL ^ 0xFEB43EED6627F9C9L)), ym.baf(class_2434, Double.longBitsToDouble(0xBEEE43BF69AAF691L ^ 0x813D708C5A99C5A2L)));
        if (!ym.zqth(class_2435) || class_2435.method_1027() < Double.longBitsToDouble(0x1B53E00F9216EF0CL ^ 0x25E326F832A30281L)) {
            return class_2432;
        }
        if (ym.ghjs_2(class_13092)) {
            class_2435 = new class_243(class_2435.field_1352, 0.0, class_2435.field_1350);
        }
        class_243 class_2436 = ym.sqd(class_2435, d2);
        double d3 = Double.longBitsToDouble(0x5A951AB3E6E15E15L ^ 0x1A8D1AB3E6E15E15L);
        if (class_2436.method_1027() > d3 * d3) {
            class_2436 = ym.thdy_2(class_2436).method_1021(d3);
        }
        return class_2432.method_1019(class_2436);
    }

    private static boolean zqth(class_243 class_2432) {
        int n;
        block1: {
            int n2 = 857600390;
            n2 = Integer.rotateLeft(n2 * -902349395, 7) ^ 0xF230C3E6;
            class_243 class_2433 = class_2432;
            n2 = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n2, 28);
            int n3 = n2 ^ 0x6124DFD6;
            if ((n3 ^ n2) != 1629806550) {
                int cfr_ignored_0 = (0x52392E50 ^ n2) - 1459631701;
            }
            n = Double.isFinite(class_2432.field_1352) && Double.isFinite(class_2432.field_1351) && Double.isFinite(class_2432.field_1350) ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xD46F;
        }
        return n != 0;
    }

    private static double jwz(class_1309 class_13092) {
        block0: {
            int n = -1771972168;
            int n2 = (n = Integer.rotateLeft(n * 321249341, 11) ^ 0xDAE778C2) ^ 0x7F086156;
            if ((n2 ^ n) == 2131255638) break block0;
            int cfr_ignored_0 = (0xE969B8EE ^ n) + 1491453466;
        }
        return class_13092.method_23318();
    }

    private static class_243 shtz_3(class_243 class_2432, double d) {
        block0: {
            int n = 1209489899;
            n = Integer.rotateLeft(n * 1706864117, 23) ^ 0x23B15F5D;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xD119CCF;
            if ((n2 ^ n) == 219258063) break block0;
            int cfr_ignored_0 = (0x4506C524 ^ n) - -1116766215;
        }
        return class_2432.method_1021(d);
    }

    private static class_243 baf(class_243 class_2432, double d) {
        block0: {
            int n = -1008090765;
            n = Integer.rotateLeft(n * 195202757, 17) ^ 0x8CABADB7;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0xDF6F4C23;
            if ((n2 ^ n) == -546354141) break block0;
            int cfr_ignored_0 = (0x1C868D50 ^ n) + 1603465640;
        }
        return class_2432.method_1021(d);
    }

    private static class_243 bkth(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 2145293915;
            int n2 = (n = Integer.rotateLeft(n * -515592439, 9) ^ 0x904A2CA0) ^ 0xA219E9DD;
            if ((n2 ^ n) == -1575360035) break block0;
            int cfr_ignored_0 = (0xDDC77F86 ^ n) - 1951641442;
        }
        return class_2432.method_1019(class_2433);
    }

    private static boolean ghjs_2(class_1309 class_13092) {
        block0: {
            int n = 2046958368;
            n = Integer.rotateLeft(n * 1519528551, 14) ^ 0xD5D8CC88;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 21);
            int n2 = n ^ 0xAC97D958;
            if ((n2 ^ n) == -1399334568) break block0;
            int cfr_ignored_0 = (0xD695C278 ^ n) - -2134088827;
        }
        return class_13092.method_24828();
    }

    private static class_243 sqd(class_243 class_2432, double d) {
        block0: {
            int n = 367041151;
            n = Integer.rotateLeft(n * -1960829363, 18) ^ 0x365B393E;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 18);
            int n2 = n ^ 0x833ED404;
            if ((n2 ^ n) == -2093034492) break block0;
            int cfr_ignored_0 = (0x96DE4E7B ^ n) + -727555751;
        }
        return class_2432.method_1021(d);
    }

    private static class_243 thdy_2(class_243 class_2432) {
        block0: {
            int n = -1085131764;
            n = Integer.rotateLeft(n * -649450629, 20) ^ 0xC9BFAA58;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 2);
            int n2 = n ^ 0x3C7276EC;
            if ((n2 ^ n) == 1014134508) break block0;
            int cfr_ignored_0 = (0x832042E0 ^ n) + 1043712013;
        }
        return class_2432.method_1029();
    }

    private static String[] bnf(String string) {
        block0: {
            int n = bqgh.shk_2(-1536020758);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 19);
            int n2 = n ^ 0x2E3D048E;
            if ((n2 ^ n) == 775750798) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8A4F2A64 ^ n, 4) - -1007435433;
        }
        return string.split("\u0006\u001d", -1);
    }

    private static CallSite ztw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1373625537;
            n3 = Integer.rotateLeft(n3 * 1691054555, 13) ^ 0x6306A8E8;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 2);
            int n4 = n3 ^ 0xCFB321D3;
            if ((n4 ^ n3) != -810343981) {
                int cfr_ignored_0 = (0x619302EC ^ n3) - -1282708436;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ khha_4 ^ string.hashCode() ^ n2 + dhaa_2 ^ i * -665282203 ^ khha_4, 24) ^ dhaa_2));
            }
            String[] stringArray = ym.bnf(new String(cArray));
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

    private static String[] zxcxei9bfjpbkv(String string) {
        return string.split("\u0003\u0017", -1);
    }

    private static CallSite r6x891z9i00(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ byqkq54j8yg ^ string.hashCode()) + (n2 + uwfvrp3ih) + i ^ byqkq54j8yg, 21) + uwfvrp3ih);
            }
            String[] stringArray = ym.zxcxei9bfjpbkv(new String(cArray));
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

