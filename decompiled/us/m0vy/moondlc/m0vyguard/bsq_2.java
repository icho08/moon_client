/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
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
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.yf;

public class bsq_2
implements Comparator {
    private final double[] dyr;
    private static final int jdh_3 = 1569903477;
    private static final int khrz = 875310826;
    private static final int l0yaw3d = -1433328057;
    private static final int tstbsjzyugsc = -1522078559;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int h42t0rbsu0jn6;

    public bsq_2(double[] dArray) {
        this.dyr = dArray;
    }

    public int compare(class_2338 class_23382, class_2338 class_23383) {
        try {
            int n = -1058874825;
            n = Integer.rotateLeft(n * 1517064745, 25) ^ 0xD222FDAF;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x37B78498;
            if ((n2 ^ n) != 934773912) {
                int cfr_ignored_0 = (0xF7555EAF ^ n) - -1905243057;
            }
            if ((0x2DC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_310 class_3102 = bsq_2.k8e8ojh4mq8();
        class_746 class_7462 = class_3102.field_1724;
        if (class_7462 == null) {
            int n = 0;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0xAED7;
            }
            return n;
        }
        double d = bsq_2.dahc3ht73((class_1657)class_7462) + this.dyr[0];
        double d2 = bsq_2.k0ggc2mi6y((class_1657)class_7462);
        double d3 = bsq_2.why2pkh4rlf((class_1657)class_7462) + this.dyr[1];
        class_243 class_2432 = bsq_2.d91qovi939(class_23382);
        class_243 class_2433 = class_23383.method_46558();
        double d4 = bsq_2.tk9kjzkts3m6z(class_2432, d, d2, d3);
        double d5 = class_2433.method_1028(d, d2, d3);
        return Double.compare(d4, d5);
    }

    private static class_310 k8e8ojh4mq8() {
        block0: {
            int n = 17712971;
            int n2 = (n = Integer.rotateLeft(n * -421040741, 21) ^ 0xB3B7ADD7) ^ 0xAFBC53A4;
            if ((n2 ^ n) == -1346612316) break block0;
            int cfr_ignored_0 = (0xAEB214EF ^ n) - -1510743481;
        }
        return class_310.method_1551();
    }

    private static double dahc3ht73(class_1657 class_16572) {
        block0: {
            int n = 731442673;
            n = Integer.rotateLeft(n * 1976475471, 19) ^ 0xCB8FE360;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 24);
            int n2 = n ^ 0xA3811141;
            if ((n2 ^ n) == -1551822527) break block0;
            int cfr_ignored_0 = (0x8819FCB0 ^ n) - 1591988976;
        }
        return class_16572.method_23317();
    }

    private static double k0ggc2mi6y(class_1657 class_16572) {
        block0: {
            int n = -2144827555;
            n = Integer.rotateLeft(n * -1752546225, 17) ^ 0x91FF0703;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xD46BCAF7;
            if ((n2 ^ n) == -731133193) break block0;
            int cfr_ignored_0 = (0x54434DAA ^ n) - 2096455753;
        }
        return class_16572.method_23318();
    }

    private static double why2pkh4rlf(class_1657 class_16572) {
        block0: {
            int n = 90785235;
            int n2 = (n = Integer.rotateLeft(n * 715692795, 11) ^ 0x54E85FC6) ^ 0xF51434F2;
            if ((n2 ^ n) == -183225102) break block0;
            int cfr_ignored_0 = (0xF07D7121 ^ n) + -1927825240;
        }
        return class_16572.method_23321();
    }

    private static class_243 d91qovi939(class_2338 class_23382) {
        block0: {
            int n = -1058250439;
            int n2 = (n = Integer.rotateLeft(n * 1413389639, 8) ^ 0x34B2E6C4) ^ 0x1766C017;
            if ((n2 ^ n) == 392609815) break block0;
            int cfr_ignored_0 = (0xD78AA12E ^ n) + 1662434487;
        }
        return class_23382.method_46558();
    }

    private static double tk9kjzkts3m6z(class_243 class_2432, double d, double d2, double d3) {
        block0: {
            int n = -940957723;
            n = Integer.rotateLeft(n * -586701599, 21) ^ 0x134ADEE8;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 9);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 12);
            int n2 = n ^ 0x651E6969;
            if ((n2 ^ n) == 1696491881) break block0;
            int cfr_ignored_0 = (0xA2F4768C ^ n) - -864432626;
        }
        return class_2432.method_1028(d, d2, d3);
    }

    private static String[] yc971vg13oy0(String string) {
        int n = 1677832359;
        int n2 = (n = Integer.rotateLeft(n * -149363139, 28) ^ 0x777033C2) ^ 0x90B5A6EE;
        if ((n2 ^ n) != -1867143442) {
            int cfr_ignored_0 = (0xF4B41649 ^ n) - -543120846;
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

    private static CallSite wj3yoo18(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -767215702;
            n3 = Integer.rotateLeft(n3 * 1581128277, 22) ^ 0x4CDD6EEA;
            n3 = Integer.rotateRight(n ^ n3, 10);
            int n4 = n3 ^ 0x7CD3BF49;
            if ((n4 ^ n3) != 2094251849) {
                int cfr_ignored_0 = (0xAE9688E3 ^ n3) - -390138741;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jdh_3 ^ string.hashCode()) + (n2 + khrz) + i ^ jdh_3, 5) + khrz);
            }
            String[] stringArray = bsq_2.yc971vg13oy0(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rrkraoc9e(String string) {
        return string.split("\u0002\u0010", -1);
    }

    private static CallSite vl0bbsu0qu0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l0yaw3d ^ string.hashCode()) + (n2 + tstbsjzyugsc) + i ^ l0yaw3d, 23) + tstbsjzyugsc);
            }
            String[] stringArray = bsq_2.rrkraoc9e(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

