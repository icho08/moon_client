/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Comparator;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class ld
implements Comparator {
    private static final int tjz = 2083733376;
    private static final int jas_4 = 1413805492;
    private static final int sra2448jx5t = -1745601398;
    private static final int dvninq70id = 539472661;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yq408z1rii5;

    public int compare(class_2338 class_23382, class_2338 class_23383) {
        int n = -183766434;
        n = Integer.rotateLeft(n * -1788323991, 7) ^ 0x8F93FA76;
        n = System.identityHashCode(this) ^ n;
        class_2338 class_23384 = class_23383;
        n = (class_23384 != null ? System.identityHashCode(class_23384) : 0) ^ n;
        int n2 = n ^ 0x71B95B9F;
        if ((n2 ^ n) != 1907973023) {
            int cfr_ignored_0 = (0x84B2A9C1 ^ n) - 1177387403;
        }
        class_310 class_3102 = class_310.method_1551();
        class_746 class_7462 = class_3102.field_1724;
        if (class_7462 == null) {
            return 0;
        }
        class_243 class_2432 = class_7462.method_33571();
        class_243 class_2433 = ld.jmm1omiru4bcc(class_23382);
        class_243 class_2434 = class_23383.method_46558();
        double d = class_2432.method_1025(class_2433);
        double d2 = ld.yb3bfph5(class_2432, class_2434);
        return Double.compare(d2, d);
    }

    private static class_243 jmm1omiru4bcc(class_2338 class_23382) {
        block0: {
            int n = -239180580;
            n = Integer.rotateLeft(n * 1379688863, 25) ^ 0xD793FE79;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 20);
            int n2 = n ^ 0x56BCBFDE;
            if ((n2 ^ n) == 1455210462) break block0;
            int cfr_ignored_0 = (0xA702DB02 ^ n) - 575304960;
        }
        return class_23382.method_46558();
    }

    private static double yb3bfph5(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = -1692569252;
            n = Integer.rotateLeft(n * 1192291237, 22) ^ 0xD1918886;
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0xDC679712;
            if ((n2 ^ n) == -597190894) break block0;
            int cfr_ignored_0 = (0x477AE64E ^ n) - 656800450;
        }
        return class_2432.method_1025(class_2433);
    }

    private static String[] u6m7wzkunwymd(String string) {
        block0: {
            int n = -1828932581;
            n = Integer.rotateLeft(n * 1865331415, 8) ^ 0x7888DA9A;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 19);
            int n2 = n ^ 0x67B7F353;
            if ((n2 ^ n) == 1740108627) break block0;
            int cfr_ignored_0 = (0xF54B4748 ^ n) - -751299876;
        }
        return string.split("\u0002\u0013", -1);
    }

    private static CallSite acd3gxrnks(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 672948388;
            n3 = Integer.rotateLeft(n3 * 1303824439, 8) ^ 0x93E795F3;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            int n4 = n3 ^ 0x249A99AF;
            if ((n4 ^ n3) != 614111663) {
                int cfr_ignored_0 = (0xC86F90B ^ n3) - 100782342;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tjz ^ string.hashCode() ^ n2 + jas_4 + i * -273733473) + tjz) ^ jas_4));
            }
            String[] stringArray = ld.u6m7wzkunwymd(new String(cArray));
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

    private static String[] vrr6xwtbnw9(String string) {
        return string.split("\u0002\u0019", -1);
    }

    private static CallSite haetbztd8oo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sra2448jx5t ^ string.hashCode() ^ n2 + dvninq70id + i * -1524009493) + sra2448jx5t) ^ dvninq70id));
            }
            String[] stringArray = ld.vrr6xwtbnw9(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

