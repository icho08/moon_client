/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_2338;
import net.minecraft.class_3532;

public final class bra {
    private static volatile boolean dzsh_2;
    private static volatile double jly;
    private static volatile double hqs_2;
    private static volatile double khsha;
    private static volatile float ttgh;
    private static volatile float srr;
    private static final int itjw1ow4mg3 = 1821672389;
    private static final int xuwn8l97 = 1295741841;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nj48yvsn3;

    public static void htr(double d, double d2, double d3, float f, float f2) {
        jly = d;
        hqs_2 = d2;
        khsha = d3;
        ttgh = f;
        srr = f2;
        dzsh_2 = true;
    }

    public static void tas_8() {
        dzsh_2 = false;
    }

    public static int dds_5(class_2338 class_23382, int n) {
        if (dzsh_2 && class_23382 != null && !(ttgh <= 0.0f) && !(srr <= 0.0f)) {
            int n2 = n >> 20 & 0xF;
            int n3 = n >> 4 & 0xF;
            int n4 = bra.jghw(class_23382);
            return n4 <= n3 ? n : n2 << 20 | n4 << 4;
        }
        return n;
    }

    private static int jghw(class_2338 class_23382) {
        double d;
        double d2 = (double)class_23382.method_10263() + 0.5 - jly;
        double d3 = (double)class_23382.method_10264() + 0.5 - hqs_2;
        double d4 = (double)class_23382.method_10260() + 0.5 - khsha;
        double d5 = d2 * d2 + d4 * d4;
        if (!(d5 > (d = (double)(ttgh * ttgh))) && !(Math.abs(d3) > (double)ttgh)) {
            double d6 = 1.0 - Math.sqrt(d5) / (double)ttgh;
            return class_3532.method_15340((int)((int)Math.round(d6 * (double)srr)), (int)0, (int)15);
        }
        return 0;
    }

    private bra() {
    }

    private static String[] dpel3sjqwlt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ymvzpeizfp8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ itjw1ow4mg3 ^ string.hashCode()) + (n2 + xuwn8l97) + i ^ itjw1ow4mg3, 11) + xuwn8l97);
            }
            String[] stringArray = bra.dpel3sjqwlt(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

