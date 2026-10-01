/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public class bka_2 {
    private static final int ei37nksyn = 2010410605;
    private static final int qcbcs1z = -2035678770;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int agaxpja8vf;

    public static Object stq_3(String string, Object[] objectArray) {
        block0: {
            int n = -76082464;
            int n2 = (n = Integer.rotateLeft(n * 291332757, 23) ^ 0x644E6C19) ^ 0x90315A05;
            if ((n2 ^ n) == -1875813883) break block0;
            int cfr_ignored_0 = (0x6B4648E5 ^ n) - -640610667;
        }
        return objectArray[0];
    }

    private static String[] el41y2jqm(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite v6ky9qobfonkoe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ei37nksyn ^ string.hashCode() ^ n2 + qcbcs1z + i * 896244715) + ei37nksyn) ^ qcbcs1z));
            }
            String[] stringArray = bka_2.el41y2jqm(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

