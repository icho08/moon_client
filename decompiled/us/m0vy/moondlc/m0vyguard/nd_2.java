/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public class nd_2 {
    private static final int y0t15q8g5b1 = 1514228899;
    private static final int kdeutoib801s3 = 1155294233;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int acwrzo6qafik;

    public static Thread sdhz(Runnable runnable) {
        int n = 143880784;
        int n2 = (n = Integer.rotateLeft(n * 314767651, 8) ^ 0xC4ABCA55) ^ 0xB593141F;
        if ((n2 ^ n) != -1248652257) {
            int cfr_ignored_0 = (0xBD00664F ^ n) - -723402454;
        }
        Thread thread = new Thread(runnable);
        nd_2.zll(thread);
        return thread;
    }

    private static void zll(Thread thread) {
        int n = 260470186;
        n = Integer.rotateLeft(n * -1949449303, 7) ^ 0xE8F4D160;
        Thread thread2 = thread;
        n = (thread2 != null ? System.identityHashCode(thread2) : 0) ^ n;
        int n2 = n ^ 0x9C969534;
        if ((n2 ^ n) != -1667853004) {
            int cfr_ignored_0 = (0x9310E09E ^ n) + 1352593898;
        }
        thread.start();
    }

    private static String[] c8u1tqqbhohjy8(String string) {
        return string.split("\u0006\u000e", -1);
    }

    private static CallSite hrng7mxicf7xt0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ y0t15q8g5b1 ^ string.hashCode()) + (n2 + kdeutoib801s3) + i ^ y0t15q8g5b1, 6) + kdeutoib801s3);
            }
            String[] stringArray = nd_2.c8u1tqqbhohjy8(new String(cArray));
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

